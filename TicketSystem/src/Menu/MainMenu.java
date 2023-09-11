package Menu;

import Tickets.NewTicket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainMenu extends JPanel {
    private JLabel timeLabel; // Etiqueta para mostrar la hora

    public MainMenu() {
        setLayout(new BorderLayout());

        // Título y configuración de estilo
        JLabel titleLabel = new JLabel("Menu");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Cambiar la fuente y el tamaño del título
        titleLabel.setHorizontalAlignment(JLabel.CENTER); // Centrar el título

        // Botón "New Ticket" y configuración de estilo
        JButton newTicketButton = new JButton("New Ticket");
        newTicketButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Cambiar la fuente y el tamaño del botón
        newTicketButton.setPreferredSize(new Dimension(200, 50)); // Cambiar el tamaño del botón

        // Etiqueta para mostrar la hora
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 16)); // Cambiar la fuente y el tamaño de la hora
        timeLabel.setHorizontalAlignment(JLabel.CENTER); // Centrar la hora

        // Agregar el título, el botón y la hora al panel
        add(titleLabel, BorderLayout.NORTH);
        add(newTicketButton, BorderLayout.CENTER);
        add(timeLabel, BorderLayout.SOUTH);

        // Iniciar el temporizador para actualizar la hora cada segundo
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateClock(); // Actualizar la hora
            }
        }, 0, 1000); // Actualizar cada segundo

        // Agregar un ActionListener al botón "New Ticket" para abrir la ventana NewTicket
        newTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana NewTicket
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame newTicketFrame = new JFrame("New Ticket");
                        newTicketFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        newTicketFrame.setSize(400, 300); // Tamaño de la ventana NewTicket
                        newTicketFrame.add(new NewTicket());

                        // Centrar el JFrame en la pantalla
                        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                        Dimension frameSize = newTicketFrame.getSize();
                        newTicketFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

                        newTicketFrame.setVisible(true);
                    }
                });
            }
        });
    }

    // Método para actualizar la hora
    private void updateClock() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();
        String formattedDate = sdf.format(now);
        timeLabel.setText(formattedDate);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.add(new MainMenu());

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = frame.getSize();
            frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

            frame.setVisible(true);
        });
    }
}
