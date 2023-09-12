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
 */
public class login extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;
    private int loginAttempts;
    private final Map<String, String> users;
    private MainMenu mainMenu;

    /**
     * Constructor de la clase 'Login'.
     */
    public login() {
        setPreferredSize(new Dimension(400, 200));
        setLayout(new GridLayout(6, 1));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        messageLabel = new JLabel("");
        loginAttempts = 0;

        setBackground(new Color(255, 255, 204));
        usernameField.setBackground(new Color(255, 255, 255));
        passwordField.setBackground(new Color(255, 255, 255));
        messageLabel.setForeground(new Color(255, 0, 0));

        add(new JLabel("Usuario:"));
        add(usernameField);
        add(new JLabel("Contraseña:"));
        add(passwordField);
        add(messageLabel);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (isValidLogin(username, password)) {
                    messageLabel.setText("Inicio de sesión exitoso");
                    showMainMenu();
                } else {
                    loginAttempts++;
                    if (loginAttempts >= 3) {
                        messageLabel.setText("Demasiados intentos fallidos. La aplicación se cerrará.");
                        showFarewellMessage();
                    } else {
                        messageLabel.setText("Inicio de sesión fallido. Intento " + loginAttempts + " de 3");
                        usernameField.setText("");
                        passwordField.setText("");
                    }
                }
            }
        });

        add(loginButton);

        users = new HashMap<>();
        users.put("kaleb", "kaleb"); // Reemplaza hashed_password1 con la contraseña almacenada segura
        users.put("k", ""); // Reemplaza hashed_password1 con la contraseña almacenada segura
        users.put("admin", "admin");  // Reemplaza hashed_password2 con la contraseña almacenada segura
        users.put("IMX078856", "hashed_password3");  // Reemplaza hashed_password3 con la contraseña almacenada segura
      //  users.put("", ""); Metodo de pruebas de log

        // No inicializamos la instancia de MainMenu aquí, se creará al hacer clic en "Iniciar Sesión".
    }

    /**
     * Verifica si el inicio de sesión es válido.
     *
     * @param username Nombre de usuario
     * @param password Contraseña
     * @return true si las credenciales son válidas, false en caso contrario.
     */
     private boolean isValidLogin(String username, String password) {
        String storedPassword = users.get(username);

        // Verifica si el usuario existe en el HashMap
        if (storedPassword != null) {
            // Verifica si la contraseña coincide
            if (storedPassword.equals(password)) {
                              JOptionPane.showMessageDialog(null, "Acceso correcto"); 
                showMainMenu();
                           
                return true; // Las credenciales son válidas
         
            }
        }

        return false; // Las credenciales no son válidas
    }

    /**
     * Muestra un mensaje de despedida y cierra la aplicación.
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
     */
    private void showMainMenu() {
        // Crea una instancia de la clase MainMenu cuando se hace clic en "Iniciar Sesión".
        MainMenu ir = new MainMenu();
                ir.showMainMenu();
       // JOptionPane.showMessageDialog(null, "Aqui deberia abrir la clase menu");
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    /**
     * Método principal que crea y muestra la ventana de inicio de sesión.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Inicio de Sesión");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.add(new login());

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = frame.getSize();
            frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

            frame.setVisible(true);
        });
    }
}
