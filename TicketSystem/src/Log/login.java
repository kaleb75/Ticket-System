package Log;

import Menu.MainMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class login extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;
    private int loginAttempts;
    private final Map<String, String> users;
    private JFrame frame;
    private MainMenu mainMenu; // Declaración de la variable de instancia MainMenu

    public void showMainMenu() {
    // Crea una instancia de la clase MainMenu
    MainMenu mainMenu = new MainMenu();

    // Muestra la ventana de MainMenu
    mainMenu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
}

    
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
        users.put("kaleb", "123");
        users.put("admin", "admin");
        users.put("IMX078856", "kaleb");
        users.put("", "");


        // Inicialización de la instancia de MainMenu
        mainMenu = new MainMenu();
    }

    private boolean isValidLogin(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    private void showFarewellMessage() {
        JOptionPane.showMessageDialog(
                this,
                "¡Adiós! Gracias por usar la aplicación.",
                "Despedida",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0); // Cierra la aplicación después de mostrar el mensaje
    }

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
