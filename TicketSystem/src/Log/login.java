package Log;

import Menu.MainMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * La clase 'Login' representa la pantalla de inicio de sesión de la aplicación.
 * (The 'Login' class represents the application's login screen.)
 */
public class login extends JPanel {
    private JTextField usernameField; // Campo de entrada para el nombre de usuario
    private JPasswordField passwordField; // Campo de entrada para la contraseña
    private JLabel messageLabel; // Etiqueta para mostrar mensajes de estado
    private int loginAttempts; // Contador de intentos de inicio de sesión
    private final Map<String, String> users; // Almacena las credenciales de los usuarios
    private MainMenu mainMenu; // Instancia de la clase MainMenu para mostrar el menú principal

    /**
     * Constructor de la clase 'Login'.
     * (Constructor of the 'Login' class.)
     */
    public login() {
        setPreferredSize(new Dimension(400, 200)); // Establece el tamaño preferido del panel
        setLayout(new GridLayout(6, 1)); // Establece el diseño de cuadrícula para organizar los componentes

        usernameField = new JTextField(); // Crea un campo de texto para el nombre de usuario
        passwordField = new JPasswordField(); // Crea un campo de texto para la contraseña
        messageLabel = new JLabel(""); // Crea una etiqueta para mostrar mensajes de estado
        loginAttempts = 0; // Inicializa el contador de intentos de inicio de sesión

        setBackground(new Color(255, 255, 204)); // Establece el fondo del panel a un color personalizado
        usernameField.setBackground(new Color(255, 255, 255)); // Establece el fondo del campo de usuario a blanco
        passwordField.setBackground(new Color(255, 255, 255)); // Establece el fondo del campo de contraseña a blanco
        messageLabel.setForeground(new Color(255, 0, 0)); // Establece el color del texto de la etiqueta a rojo

        add(new JLabel("Usuario:")); // Agrega una etiqueta para el nombre de usuario al panel
        add(usernameField); // Agrega el campo de nombre de usuario al panel
        add(new JLabel("Contraseña:")); // Agrega una etiqueta para la contraseña al panel
        add(passwordField); // Agrega el campo de contraseña al panel
        add(messageLabel); // Agrega la etiqueta de mensajes al panel

        JButton loginButton = new JButton("Iniciar Sesión"); // Crea un botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText(); // Obtiene el nombre de usuario ingresado
                String password = new String(passwordField.getPassword()); // Obtiene la contraseña ingresada

                if (isValidLogin(username, password)) {
                    messageLabel.setText("Inicio de sesión exitoso"); // Muestra un mensaje de inicio de sesión exitoso
                    showMainMenu(); // Muestra el menú principal
                } else {
                    loginAttempts++;
                    if (loginAttempts >= 3) {
                        messageLabel.setText("Demasiados intentos fallidos. La aplicación se cerrará.");
                        showFarewellMessage(); // Muestra un mensaje de despedida y cierra la aplicación
                    } else {
                        messageLabel.setText("Inicio de sesión fallido. Intento " + loginAttempts + " de 3");
                        usernameField.setText("");
                        passwordField.setText("");
                    }
                }
            }
        });

        add(loginButton); // Agrega el botón de inicio de sesión al panel

        users = new HashMap<>(); // Inicializa el mapa para almacenar las credenciales de los usuarios
        users.put("kaleb", "kaleb"); // Agrega credenciales de usuario (nombre de usuario y contraseña)
        users.put("k", ""); // Agrega credenciales de usuario (nombre de usuario y contraseña)
        users.put("admin", "admin");  // Agrega credenciales de usuario (nombre de usuario y contraseña)
        users.put("IMX078856", "hashed_password3");  // Agrega credenciales de usuario (nombre de usuario y contraseña)

        // No inicializamos la instancia de MainMenu aquí, se creará al hacer clic en "Iniciar Sesión".
    }

    /**
     * Verifica si el inicio de sesión es válido.
     * (Checks if the login is valid.)
     *
     * @param username Nombre de usuario (username)
     * @param password Contraseña (password)
     * @return true si las credenciales son válidas, false en caso contrario.
     * (true if the credentials are valid, false otherwise.)
     */
     private boolean isValidLogin(String username, String password) {
        String storedPassword = users.get(username); // Obtiene la contraseña almacenada para el nombre de usuario proporcionado

        // Verifica si el usuario existe en el HashMap
        if (storedPassword != null) {
            // Verifica si la contraseña coincide
            if (storedPassword.equals(password)) {
                JOptionPane.showMessageDialog(null, "Acceso correcto"); 
                showMainMenu(); // Muestra el menú principal
                return true; // Las credenciales son válidas
            }
        }

        return false; // Las credenciales no son válidas
    }

    /**
     * Muestra un mensaje de despedida y cierra la aplicación.
     * (Displays a farewell message and closes the application.)
     */
    private void showFarewellMessage() {
        JOptionPane.showMessageDialog(
                this,
                "¡Adiós! Gracias por usar la aplicación.",
                "Despedida",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0); // Cierra la aplicación después de mostrar el mensaje
    }

    /**
     * Muestra la ventana del menú principal y cierra la ventana de inicio de sesión.
     * (Shows the main menu window and closes the login window.)
     */
    private void showMainMenu() {
        // Crea una instancia de la clase MainMenu cuando se hace clic en "Iniciar Sesión".
        MainMenu ir = new MainMenu();
        ir.showMainMenu();
        SwingUtilities.getWindowAncestor(this).dispose(); // Cierra la ventana de inicio de sesión
    }

    /**
     * Método principal que crea y muestra la ventana de inicio de sesión.
     * (Main method that creates and displays the login window.)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Inicio de Sesión"); // Crea una ventana JFrame para el inicio de sesión
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece la operación de cierre
            frame.setSize(400, 200); // Establece el tamaño de la ventana
            frame.add(new login()); // Agrega un objeto de la clase 'login' al marco

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Obtiene el tamaño de la pantalla
            Dimension frameSize = frame.getSize(); // Obtiene el tamaño de la ventana
            frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2); // Centra la ventana en la pantalla

            frame.setVisible(true); // Hace visible la ventana de inicio de sesión
        });
    }
}
