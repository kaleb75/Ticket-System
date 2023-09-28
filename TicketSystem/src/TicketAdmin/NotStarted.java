package TicketAdmin; // Package where the class is located / Paquete donde se encuentra la clase

import Menu.AdminMenu;
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

    private JTable table; // Declare the table as a class field to make it accessible from other methods / Declarar la tabla como un campo de clase para que sea accesible desde otros métodos

    public NotStarted() {
        // Create a table model to store the data / Crear un modelo de tabla para almacenar los datos
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 7) {
                    return java.util.Date.class; // Column "ETS" is expected to contain dates / Se espera que la columna "ETS" contenga fechas
                }
                return super.getColumnClass(columnIndex);
            }
        };
        model.addColumn("IDTicket"); // Column for Ticket ID / Columna para ID de Ticket
        model.addColumn("ClockNumber"); // Column for Clock Number / Columna para Número de Reloj
        model.addColumn("Date"); // Column for Date / Columna para Fecha
        model.addColumn("Title"); // Column for Title / Columna para Título
        model.addColumn("Priority"); // Column for Priority / Columna para Prioridad
        model.addColumn("Status"); // Column for Status / Columna para Estado
        model.addColumn("Assigned"); // Column for Assigned / Columna para Asignado
        model.addColumn("ETS"); // Column for ETS (possibly a date) / Columna para ETS (posiblemente una fecha)
        model.addColumn("Description"); // Column for Description / Columna para Descripción
        model.addColumn("Documentacion"); // Column for Documentation / Columna para Documentacion

        // Create the JTable with the data model / Crear la JTable con el modelo de datos
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Query the database and load data into the table / Realizar la consulta a la base de datos y cargar los datos en la tabla
        try {
            String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
            String url = "jdbc:ucanaccess://" + ruta;
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Test WHERE Status='Not Started'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Add rows with data from the database / Agregar filas con datos de la base de datos
                model.addRow(new Object[]{
                    resultSet.getInt("IDTicket"),
                    resultSet.getInt("ClockNumber"),
                    resultSet.getDate("Date"),
                    resultSet.getString("Title"),
                    resultSet.getString("Priority"),
                    resultSet.getString("Status"),
                    resultSet.getString("Assigned"),
                    resultSet.getDate("ETS"), // "ETS" is expected to be a date / Se espera que "ETS" sea una fecha
                    resultSet.getString("Description"),
                    resultSet.getString("Documentacion")
                });
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database"); // Show an error message / Mostrar un mensaje de error
            e.printStackTrace();
        }

        // Configure the JFrame for full screen / Configurar el JFrame para pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window to the full size of the monitor / Maximiza la ventana al tamaño completo del monitor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when closing the window / Cierra la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Center the window on the screen / Centra la ventana en la pantalla
        setTitle("Not Started Tickets"); // Set the window title / Establece el título de la ventana

        // Add a button to cancel selected tickets / Agregar un botón para cancelar los tickets seleccionados
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelSelectedTickets();
            }
        });

        // Add a button to go back to the main menu / Agregar un botón para volver al menú principal
        JButton backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to go back to the main menu / Código para volver al menú principal
                AdminMenu mainMenu = new AdminMenu();
                mainMenu.setVisible(true);
                dispose(); // Close the current window / Cierra la ventana actual
            }
        });

        // Create a panel for the buttons / Crear un panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(backButton);

        // Add the button panel to the south of the JFrame / Agregar el panel de botones al sur del JFrame
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    // Method to cancel selected tickets / Método para cancelar los tickets seleccionados
    private void cancelSelectedTickets() {
        int[] selectedRows = table.getSelectedRows();

        if (selectedRows.length > 0) {
            try {
                String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
                String url = "jdbc:ucanaccess://" + ruta;
                Connection connection = DriverManager.getConnection(url);

                for (int row : selectedRows) {
                    int idTicket = (int) table.getValueAt(row, 0); // Get the ticket ID / Obtener el ID del ticket
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Test SET Status = 'Cancelled' WHERE IDTicket = ?");
                    preparedStatement.setInt(1, idTicket);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                }

                connection.close();
                JOptionPane.showMessageDialog(null, "Tickets canceled successfully."); // Show a success message / Mostrar un mensaje de éxito
                refreshTable(); // Update the table after canceling the tickets / Actualizar la tabla después de la cancelación
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error canceling tickets."); // Show an error message / Mostrar un mensaje de error
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select at least one ticket to cancel."); // Show a message to select at least one ticket / Mostrar un mensaje para seleccionar al menos un ticket
        }
    }

    // Method to update the table after canceling tickets / Método para actualizar la tabla después de la cancelación
    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear all current rows in the table / Borra todas las filas actuales de la tabla

        // Reload data from the database / Vuelve a cargar los datos desde la base de datos
        try {
            String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
            String url = "jdbc:ucanaccess://" + ruta;
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Test WHERE Status='Not Started'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Add rows with data from the database / Agregar filas con datos de la base de datos
                model.addRow(new Object[]{
                    resultSet.getInt("IDTicket"),
                    resultSet.getInt("ClockNumber"),
                    resultSet.getDate("Date"),
                    resultSet.getString("Title"),
                    resultSet.getString("Priority"),
                    resultSet.getString("Status"),
                    resultSet.getString("Assigned"),
                    resultSet.getDate("ETS"), // "ETS" is expected to be a date / Se espera que "ETS" sea una fecha
                    resultSet.getString("Description"),
                    resultSet.getString("Documentacion")
                });
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database"); // Show an error message / Mostrar un mensaje de error
            e.printStackTrace();
        }
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