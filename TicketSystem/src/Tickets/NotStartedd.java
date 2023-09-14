package Tickets;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class NotStartedd extends JFrame {
    private JTable table;
    

    public NotStartedd() {
    setExtendedState(JFrame.MAXIMIZED_BOTH); // Establecer el estado extendido para hacerlo pantalla completa
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
System.out.println("Aqui debe salir la tabla");
        // Crear un modelo de tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IDTicket");
        model.addColumn("ClockNumber");
        model.addColumn("Date");
        model.addColumn("Title");
        model.addColumn("Priority");
        model.addColumn("Status");
        model.addColumn("Assigned");
        model.addColumn("ETS");
        model.addColumn("Description");
        model.addColumn("HTML");

        // Crear la JTable con el modelo
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Realizar la consulta a la base de datos y cargar los datos en la tabla
        try {
                String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Aqui debe conectar la base de datos");
            
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Test WHERE Status='Not Started'";
            System.out.println("ya invoco la tabla desde la base de datos");
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("IDTicket"),
                    resultSet.getString("ClockNumber"),
                    resultSet.getDate("Date"),
                    resultSet.getString("Title"),
                    resultSet.getString("Priority"),
                    resultSet.getString("Status"),
                    resultSet.getString("Assigned"),
                    resultSet.getInt("ETS"),
                    resultSet.getString("Description"),
                    resultSet.getString("HTML")
                        
                });
            }
            System.out.println("ya debio haber llenado la tabla");

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A donde vas perro");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NotStarted notStarted = new NotStarted();
            notStarted.setVisible(true);
           // NotStartedd();
        });
    }
}
