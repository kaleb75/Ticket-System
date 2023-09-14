package Tickets;

import Menu.MainMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NotStarted extends javax.swing.JFrame {

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
        JTable table = new JTable(model);
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
                model.addRow(new Object[] {
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

        // Agregar el botón al panel principal
        getContentPane().add(backButton, BorderLayout.SOUTH);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NotStarted().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
