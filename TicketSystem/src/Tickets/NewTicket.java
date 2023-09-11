package Tickets;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class NewTicket extends JFrame {

    private JTextField clockNumberField;
    private JTextField titleField;
    private JTextField etsField;
    private JTextArea descriptionArea;
    private JComboBox<String> priorityComboBox;
    private JComboBox<String> statusComboBox;

    private static void AccessDatabaseConnection() {
        Connection connection = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            // Establece la URL de conexión a la base de datos de Access
            String ruta = "C:\\Users\\imx078856\\Documents\\BDTickets.accdb";
            String url = "jdbc:ucanaccess://" + ruta;

            // Establece la conexión
            connection = DriverManager.getConnection(url);

            sentencia = connection.createStatement();

            // Si llegas a este punto, la conexión fue exitosa
            System.out.println("Conexión exitosa a la base de datos de Access.");
            JOptionPane.showMessageDialog(null, "Successful Connection", "Connection Status", JOptionPane.ERROR_MESSAGE);

            // Aquí puedes realizar tus operaciones con la base de datos
            // ...
        } catch (SQLException e) {
            // e.printStackTrace();  Meotodo para arrojar el Error de sistema, pero prefiero mensaje en un panel
            JOptionPane.showMessageDialog(null, "Connection Failed\n" + e + "", "Connection Status", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        } finally {
            // Cierra la conexión cuando hayas terminado
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    } //    Metodo para conexion de base de datos | Database connection method

    public NewTicket() {

        setExtendedState(JFrame.MAXIMIZED_VERT);
        // setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel(new BorderLayout());

// Panel superior para el título
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("<html><h1><font color=\"#00008B\"><u><strong>New Ticket</strong></u></font></h1></html>");
        titlePanel.add(titleLabel);

        // Panel inferior para la fecha y hora
        JPanel dateTimePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel dateTimeLabel = new JLabel(getFormattedDateTime());
        dateTimePanel.add(dateTimeLabel);

        contentPanel.add(titlePanel, BorderLayout.NORTH);
        contentPanel.add(dateTimePanel, BorderLayout.SOUTH);

        add(contentPanel);

        // Actualiza la fecha y hora cada segundo
        Timer timer = new Timer(1000, e -> {
            dateTimeLabel.setText(getFormattedDateTime());
        });
        timer.start();

        setVisible(true);

        // Crear campos y elementos para ingresar los items
        // Crear campos y elementos para ingresar los items
        JLabel clockNumberLabel = new JLabel("ClockNumber:");
        clockNumberField = new JTextField(10); // Reducimos el ancho del campo

        JLabel dateLabel = new JLabel("Date:");
        JTextField dateField = new JTextField(10); // Reducimos el ancho
        dateField.setEditable(false);

        JLabel titleLabel1 = new JLabel("Title:");
        titleField = new JTextField(20); // Reducimos el ancho

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea(3, 20); // Reducimos la altura
        JScrollPane descriptionScrollPane = new JScrollPane(descriptionArea);

        JLabel priorityLabel = new JLabel("Priority:");
        String[] priorityOptions = {"Alta", "Media", "Baja"};
        priorityComboBox = new JComboBox<>(priorityOptions);

        JLabel statusLabel = new JLabel("Status:");
        String[] statusOptions = {"No iniciado", "En progreso", "Cerrado", "Pendiente de cliente"};
        statusComboBox = new JComboBox<>(statusOptions);

        JLabel etsLabel = new JLabel("ETS:");
        etsField = new JTextField(10); // Reducimos el ancho
        // Agregar etiquetas y campos de entrada al formulario
        add(clockNumberLabel);
        add(clockNumberField);
        add(dateLabel);
        add(dateField);
        add(titleLabel);
        add(titleField);
        add(descriptionLabel);
        add(descriptionScrollPane);
        add(priorityLabel);
        add(priorityComboBox);
        add(statusLabel);
        add(statusComboBox);
        add(etsLabel);
        add(etsField);
    }
    // Metodo para crear el panel o ventana | Method to create the panel or window

    private String getFormattedDateTime() {
        // Establecer la zona horaria a MDT
        TimeZone timeZone = TimeZone.getTimeZone("America/Denver"); // MDT (Mountain Daylight Time)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdf.setTimeZone(timeZone);
        return sdf.format(new Date());
    } // Metodo para colocar fecha y hora dentro del panel

    public static void main(String[] args) { // Main de la clase
        SwingUtilities.invokeLater(() -> {
            new NewTicket();
            AccessDatabaseConnection();

        });
    }
}
