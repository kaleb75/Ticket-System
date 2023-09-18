package Tickets;

import Menu.MainMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NotStarted extends javax.swing.JFrame {

    private JTable table; // Declara la tabla como un campo de clase para que sea accesible desde otros métodos

    public NotStarted() {
        // Crear un modelo de tabla para almacenar los datos
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 7) {
                    return java.util.Date.class; // Columna "ETS" se espera que contenga fechas
                }
                return super.getColumnClass(columnIndex);
            }
        };
        model.addColumn("IDTicket"); // Columna para ID de Ticket
        model.addColumn("ClockNumber"); // Columna para Número de Reloj
        model.addColumn("Date"); // Columna para Fecha
        model.addColumn("Title"); // Columna para Título
        model.addColumn("Priority"); // Columna para Prioridad
        model.addColumn("Status"); // Columna para Estado
        model.addColumn("Assigned"); // Columna para Asignado
        model.addColumn("ETS"); // Columna para ETS (posiblemente una fecha)
        model.addColumn("Description"); // Columna para Descripción
        model.addColumn("HTML"); // Columna para HTML

        // Crear la JTable con el modelo de datos
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Realizar la consulta a la base de datos y cargar los datos en la tabla
        try {
            String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
            String url = "jdbc:ucanaccess://" + ruta;
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Test WHERE Status='Not Started'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Agregar filas con datos de la base de datos
                model.addRow(new Object[]{
                    resultSet.getInt("IDTicket"),
                    resultSet.getInt("ClockNumber"),
                    resultSet.getDate("Date"),
                    resultSet.getString("Title"),
                    resultSet.getString("Priority"),
                    resultSet.getString("Status"),
                    resultSet.getString("Assigned"),
                    resultSet.getDate("ETS"), // Se espera que "ETS" sea una fecha
                    resultSet.getString("Description"),
                    resultSet.getString("HTML")
                });
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
            e.printStackTrace();
        }

        // Configurar el JFrame para pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximiza la ventana al tamaño completo del monitor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setTitle("Not Started Tickets"); // Establece el título de la ventana

        // Agregar un botón para cancelar los tickets seleccionados
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelSelectedTickets();
            }
        });

        // Agregar un botón para volver al menú principal
        JButton backButton = new JButton("Volver al Menú Principal");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para volver al menú principal
                MainMenu mainMenu = new MainMenu();
                mainMenu.showMainMenu();
                dispose(); // Cierra la ventana actual
            }
        });

        // Crear un panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(backButton);

        // Agregar el panel de botones al sur del JFrame
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    // Método para cancelar los tickets seleccionados
    private void cancelSelectedTickets() {
        int[] selectedRows = table.getSelectedRows();

        if (selectedRows.length > 0) {
            try {
                String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
                String url = "jdbc:ucanaccess://" + ruta;
                Connection connection = DriverManager.getConnection(url);

                for (int row : selectedRows) {
                    int idTicket = (int) table.getValueAt(row, 0); // Obtiene el ID del ticket
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Test SET Status = 'Cancelled' WHERE IDTicket = ?");
                    preparedStatement.setInt(1, idTicket);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                }

                connection.close();
                JOptionPane.showMessageDialog(null, "Tickets cancelados con éxito.");
                refreshTable(); // Actualiza la tabla después de la cancelación
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cancelar tickets.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona al menos un ticket para cancelar.");
        }
    }

    // Método para actualizar la tabla después de la cancelación
    private void refreshTable() {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); // Borra todas las filas actuales de la tabla

    // Vuelve a cargar los datos desde la base de datos
    try {
        String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
        String url = "jdbc:ucanaccess://" + ruta;
        Connection connection = DriverManager.getConnection(url);

        Statement statement = connection.createStatement();

        String query = "SELECT * FROM Test WHERE Status='Not Started'";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            // Agregar filas con datos de la base de datos
            model.addRow(new Object[]{
                resultSet.getInt("IDTicket"),
                resultSet.getInt("ClockNumber"),
                resultSet.getDate("Date"),
                resultSet.getString("Title"),
                resultSet.getString("Priority"),
                resultSet.getString("Status"),
                resultSet.getString("Assigned"),
                resultSet.getDate("ETS"), // Se espera que "ETS" sea una fecha
                resultSet.getString("Description"),
                resultSet.getString("HTML")
            });
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        e.printStackTrace();
    }
}
//Este código volverá a cargar los datos de la base de datos y actualizará la tabla después de la cancelación de los tickets seleccionados. Asegúrate de llamar a este método después de cancelar los tickets en la función cancelSelectedTickets().







    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NotStarted().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
