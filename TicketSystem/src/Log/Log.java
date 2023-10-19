/*
 * Code written and developed by Kaleb Chavira IMX078856
 * Código escrito y desarrollado por Kaleb Chavira IMX078856
 */
package Log;


import Menu.AdminMenu;
import Menu.UserMenu;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * Log class for user login functionality.
 * Clase Log para la funcionalidad de inicio de sesión de usuario.
 *
 * @author IMX078856
 */
public class Log extends javax.swing.JFrame {

     /**
     * Constructor for the Log class.
     * Constructor para la clase Log.
     */
    public Log() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LoginBoton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Support_System/Login");
        setLocation(new java.awt.Point(500, 200));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel3.setText("LOGIN");

        LoginBoton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LoginBoton.setText("LOG");
        LoginBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBotonActionPerformed(evt);
            }
        });

        Pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("User:");

        User.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(User)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBotonActionPerformed
metodolog();
    }//GEN-LAST:event_LoginBotonActionPerformed

    private void PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyPressed
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        metodolog();
    }
    }//GEN-LAST:event_PassKeyPressed
 /**
 * The main method of the application that initializes the user interface and GUI look and feel.
 * El método principal de la aplicación que inicializa la interfaz de usuario y el aspecto visual de la GUI.
 */
public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
     //   java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
    } catch (InstantiationException ex) {
       // java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
       // java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
       // java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Log().setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBoton;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

/**
 * This method handles user login and navigation based on provided credentials.
 * Este método gestiona el inicio de sesión del usuario y la navegación basada en las credenciales proporcionadas.
 */
private void metodolog() {
    // Define the path to the Access database file and create a JDBC URL.
    // Define la ruta al archivo de base de datos de Access y crea una URL de JDBC.
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;

    try {
        // Get the entered user and password from text fields.
        // Obtiene el usuario y la contraseña ingresados desde los campos de texto.
        String userr = User.getText();
        String password = Pass.getText();

        // Check if user and password fields are empty.
        // Verifica si los campos de usuario y contraseña están vacíos.
        if (userr.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "User and password fields cannot be empty", "Access Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Establish a database connection using the JDBC URL.
        // Establece una conexión con la base de datos utilizando la URL de JDBC.
        Connection connection = DriverManager.getConnection(url);

        // Define a SQL query to retrieve user information.
        // Define una consulta SQL para recuperar la información del usuario.
        String query = "SELECT Pass, Admin FROM Usuarios WHERE Usuarioo = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, userr);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String storedPassword = resultSet.getString("Pass");
            int userAdmin = resultSet.getInt("Admin");

            if (storedPassword.equals(password)) {
                // Check if the entered password matches the stored password.
                // Verifica si la contraseña ingresada coincide con la contraseña almacenada.
                
                if (userAdmin == 1) {
                    // The user is an administrator.
                    // Abre el menú de administrador (AdminMenu).
                    AdminMenu adminMenu = new AdminMenu();
                    JOptionPane.showMessageDialog(null, "The system access has been confirmed 🤘🏻");
                    adminMenu.setVisible(true);
                    this.dispose();
                    Sesion.setUsuarioActual(userr); // Set the current user.
                } else {
                    // The user is a regular user.
                    // Abre el menú de usuario (UserMenu).
                    UserMenu userMenu = new UserMenu();
                    JOptionPane.showMessageDialog(null, "The system access has been confirmed");
                    userMenu.setVisible(true);
                    this.dispose();
                    Sesion.setUsuarioActual(userr); // Set the current user.
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password", "Access Denied", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // If no results were found for the username, display an "Access Denied" message.
            JOptionPane.showMessageDialog(null, "User not found in the database", "Access Denied", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("" + e);
    }
}

 
}
