/*package Menu;

import Tickets.CreateTicket;
import Tickets.NotStarted;
import Tickets.TestDocumentacion; // Importa la clase TestDocumentacion (Import the TestDocumentacion class)
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu menu = new MainMenu();
            menu.showMainMenu();
        });
    }

    public void showMainMenu() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menú Principal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            frame.add(panel);
            panel.setLayout(new GridLayout(4, 1)); // Aumenta el número de filas a 4 para incluir el nuevo botón

            JButton btnNewTicket = new JButton("New Ticket");
            panel.add(btnNewTicket);

            JButton btnNotStarted = new JButton("Not Started");
            panel.add(btnNotStarted);

            // Botón para abrir TestDocumentacion
            JButton btnTestDocumentacion = new JButton("Test Documentacion");
            panel.add(btnTestDocumentacion);

            btnNewTicket.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNewTicket();
                    frame.dispose();
                }
            });

            btnNotStarted.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNotStarted();
                    frame.dispose();
                }
            });

            // Evento para el botón TestDocumentacion
            btnTestDocumentacion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirTestDocumentacion();
                    frame.dispose();
                }
            });

            frame.setVisible(true);
        });
    }

    private void abrirNewTicket() {
        JOptionPane.showMessageDialog(null, "Abriendo la clase NewTicket");
        CreateTicket ir = new CreateTicket();
        ir.setVisible(true);
    }

    private void abrirNotStarted() {
        JOptionPane.showMessageDialog(null, "Abriendo Lista de NotStarted");
        NotStarted ir = new NotStarted();
        ir.show(true);
    }

    // Método para abrir la clase TestDocumentacion
    private void abrirTestDocumentacion() {
        JOptionPane.showMessageDialog(null, "Abriendo la clase Test Documentacion");
        TestDocumentacion ir = new TestDocumentacion();
        ir.setVisible(true);
    }
}
*/