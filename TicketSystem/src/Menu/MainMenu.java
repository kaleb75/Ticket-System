package Menu;

import Tickets.CreateTicket;
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

            // Panel principal
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.setLayout(new GridLayout(3, 1)); // Diseño de la cuadrícula para organizar los componentes

            // Botón para abrir NewTicket
            JButton btnNewTicket = new JButton("Abrir NewTicket");
            panel.add(btnNewTicket);

            // Botón para abrir NotStarted (documentado)
            JButton btnNotStarted = new JButton("Abrir NotStarted (Documentado)");
            panel.add(btnNotStarted);

            // Evento para el botón NewTicket
            btnNewTicket.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNewTicket();
                   
                }
            });

            // Evento para el botón NotStarted
            btnNotStarted.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNotStarted();
                }
            });

            frame.setVisible(true);
        });
    }

    // Método para abrir la clase NewTicket
    private void abrirNewTicket() {
        // Aquí puedes implementar la lógica para abrir la clase NewTicket
        JOptionPane.showMessageDialog(null, "Abriendo la clase NewTicket");
       CreateTicket ir = new CreateTicket();
       ir.setVisible(true);
    
    }

    // Método para abrir la clase NotStarted (documentada)
    private void abrirNotStarted() {
        // Documenta la lógica para abrir la clase NotStarted cuando esté disponible
        JOptionPane.showMessageDialog(null, "Abriendo la clase NotStarted (documentada)");
    }
}
