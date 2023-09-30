package TicketAdmin;

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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;


public class NotStarted extends javax.swing.JFrame {

    private JTable table;

    public NotStarted() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 7) {
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
        model.addColumn("Documentacion");

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        try {
            String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
            String url = "jdbc:ucanaccess://" + ruta;
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Test WHERE Status='Not Started'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("IDTicket"),
                    resultSet.getInt("ClockNumber"),
                    resultSet.getDate("Date"),
                    resultSet.getString("Title"),
                    resultSet.getString("Priority"),
                    resultSet.getString("Status"),
                    resultSet.getString("Assigned"),
                    resultSet.getDate("ETS"),
                    resultSet.getString("Description"),
                    resultSet.getString("Documentacion")
                });
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database");
            e.printStackTrace();
        }

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        UIManager.setLookAndFeel();
        setTitle("Not Started Tickets");

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelSelectedTickets();
            }
        });

        JButton backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminMenu mainMenu = new AdminMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(backButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Agregar la ordenación predeterminada a la columna "IDTicket" en orden descendente
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(0, SortOrder.DESCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();

        // Resaltar filas según la prioridad
// Resaltar filas según la prioridad
table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                String priority = (String) table.getValueAt(row, 4);

                if (priority.equals("5")) {
                    component.setBackground(Color.RED);
                } else if (priority.equals("4")) {
                    component.setBackground(Color.ORANGE);
                } else if (priority.equals("3")) {
                    component.setBackground(Color.YELLOW);
                } else {
                    component.setBackground(table.getBackground());
                }

                return component;
            }
        });
    }

    private void cancelSelectedTickets() {
        int[] selectedRows = table.getSelectedRows();

        if (selectedRows.length > 0) {
            try {
                String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
                String url = "jdbc:ucanaccess://" + ruta;
                Connection connection = DriverManager.getConnection(url);

                for (int row : selectedRows) {
                    int idTicket = (int) table.getValueAt(row, 0);
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Test SET Status = 'Cancelled' WHERE IDTicket = ?");
                    preparedStatement.setInt(1, idTicket);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                }

                connection.close();
                JOptionPane.showMessageDialog(null, "Tickets canceled successfully.");
                refreshTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error canceling tickets.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select at least one ticket to cancel.");
        }
    }

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        try {
            String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
            String url = "jdbc:ucanaccess://" + ruta;
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Test WHERE Status='Not Started'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("IDTicket"),
                    resultSet.getInt("ClockNumber"),
                    resultSet.getDate("Date"),
                    resultSet.getString("Title"),
                    resultSet.getString("Priority"),
                    resultSet.getString("Status"),
                    resultSet.getString("Assigned"),
                    resultSet.getDate("ETS"),
                    resultSet.getString("Description"),
                    resultSet.getString("Documentacion")
                });
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NotStarted().setVisible(true);
            
        });
    }

    private javax.swing.JScrollPane jScrollPane1;
}
