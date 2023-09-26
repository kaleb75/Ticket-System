/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicketAdmin;

/**
 *
 * @author IMX078856
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarPersonaDialog extends JDialog {
    private JList<String> listaPersonas;
    private DefaultListModel<String> model;
    private JButton seleccionarButton;
    private JTextField buscarField;
    private boolean personaSeleccionada = false;
    private int numeroRelojSeleccionado;

    public BuscarPersonaDialog(Frame owner) {
        super(owner, "Buscar Persona", true);

        setSize(400, 300);
        setLocationRelativeTo(owner);

        model = new DefaultListModel<>();
        listaPersonas = new JList<>(model);
        listaPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(listaPersonas);

        buscarField = new JTextField();
        buscarField.setPreferredSize(new Dimension(150, 25));
        buscarField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                buscarPersonas();
            }
        });

        seleccionarButton = new JButton("Seleccionar");
        seleccionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = listaPersonas.getSelectedIndex();
                if (selectedIndex != -1) {
                    String item = model.getElementAt(selectedIndex);
                    String[] parts = item.split(" - ");
                    numeroRelojSeleccionado = Integer.parseInt(parts[0]);
                    personaSeleccionada = true;
                    dispose();
                }
            }
        });

        JPanel searchPanel = new JPanel();
        searchPanel.add(new JLabel("Buscar:"));
        searchPanel.add(buscarField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(seleccionarButton);

        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        cargarPersonasDesdeBD();
    }

    public boolean isPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public int getNumeroRelojSeleccionado() {
        return numeroRelojSeleccionado;
    }

    private void cargarPersonasDesdeBD() {
        // Conecta con tu base de datos y obtiene la lista de personas
        String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
        String url = "jdbc:ucanaccess://" + ruta;

        try (Connection connection = DriverManager.getConnection(url)) {
            String query = "SELECT ClockNumber, Name, LastName FROM Usuarios";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int clockNumber = resultSet.getInt("ClockNumber");
                String name = resultSet.getString("Name");
                String lastName = resultSet.getString("LastName");

                String persona = clockNumber + " - " + name + " " + lastName;
                model.addElement(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void buscarPersonas() {
        String searchText = buscarField.getText().toLowerCase();

        model.clear();

        // Conecta con tu base de datos y obtiene la lista de personas que coinciden con la búsqueda
        String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
        String url = "jdbc:ucanaccess://" + ruta;

  try (Connection connection = DriverManager.getConnection(url)) {
        String query = "SELECT ClockNumber, Name, LastName, Usuarioo FROM Usuarios WHERE " +
                       "LOWER(Name) LIKE ? OR LOWER(LastName) LIKE ? OR LOWER(Usuarioo) LIKE ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "%" + searchText + "%");
        preparedStatement.setString(2, "%" + searchText + "%");
        preparedStatement.setString(3, "%" + searchText + "%");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int clockNumber = resultSet.getInt("ClockNumber");
            String name = resultSet.getString("Name");
            String lastName = resultSet.getString("LastName");
            String usuario = resultSet.getString("Usuarioo");

            String persona = clockNumber + " - " + name + " " + lastName + " - Usuario: " + usuario;
            model.addElement(persona);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BuscarPersonaDialog dialog = new BuscarPersonaDialog(null);
            dialog.setVisible(true);

            if (dialog.isPersonaSeleccionada()) {
                int numeroReloj = dialog.getNumeroRelojSeleccionado();
                System.out.println("Número de Reloj Seleccionado: " + numeroReloj);
            } else {
                System.out.println("Ninguna persona seleccionada.");
            }
        });
    }
}

