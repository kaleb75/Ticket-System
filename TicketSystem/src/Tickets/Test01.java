package Tickets;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test01 extends javax.swing.JFrame {

    public Test01() {
        initComponents();
        
        // Crear un modelo de tabla
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 7) { // Cambiar 7 al índice correcto de la columna "ETS"
                    return java.util.Date.class;
                }
                return super.getColumnClass(columnIndex);
            }
        };
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
    }

    // El resto del código generado por el diseñador de GUI permanece igual

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Test01().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
