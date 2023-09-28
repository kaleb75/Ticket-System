import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;

public class NotStarted extends javax.swing.JFrame {
    private JTable table;
    private DefaultTableModel model;

    public NotStarted() {
        model = new DefaultTableModel() {
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
            // Load data from the database into the table here
            // ...

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database");
            e.printStackTrace();
        }

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Not Started Tickets");

        JButton idTicketButton = new JButton("Sort by IDTicket");
        JButton clockNumberButton = new JButton("Sort by ClockNumber");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(idTicketButton);
        buttonPanel.add(clockNumberButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Add ActionListeners for sorting buttons
        idTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortTable(0);
            }
        });

        clockNumberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortTable(1);
            }
        });
    }

    private void sortTable(int columnIndex) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(columnIndex, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NotStarted().setVisible(true);
        });
    }
}
