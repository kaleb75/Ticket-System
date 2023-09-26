/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
 *
 * @author IMX078856
 */
public class Log extends javax.swing.JFrame {

  
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
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(LoginBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Admin.SEVERE, null, ex);
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

private void metodolog() {
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;

    try {
        String userr = User.getText();
        String password = Pass.getText();

        // Verifica si los campos de usuario y contraseña están vacíos
        if (userr.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos de usuario y contraseña no pueden estar vacíos", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection connection = DriverManager.getConnection(url);
        String query = "SELECT Pass, Admin FROM Usuarios WHERE Usuarioo = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, userr);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String storedPassword = resultSet.getString("Pass");
            int userAdmin = resultSet.getInt("Admin");

            if (storedPassword.equals(password)) {
               // JOptionPane.showMessageDialog(null, "Acceso concedido");

                // Verifica el nivel de usuario y abre el menú correspondiente
                if (userAdmin == 1) {
                    // El usuario es administrador.
                    // Abre el menú de administrador (AdminMenu).
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.setVisible(true);
                    this.dispose();
                    if (storedPassword.equals(password)) {
    Sesion.setUsuarioActual(userr); // Establece el usuario actual
   // JOptionPane.showMessageDialog(null, "Acceso concedido");
    // Resto del código
}
                } else {
                    // El usuario es nivel usuario.
                    // Abre el menú de usuario (UserMenu).
                    UserMenu userMenu = new UserMenu();
                    JOptionPane.showMessageDialog(null, "Acceso concedido");
                    userMenu.setVisible(true);
                    this.dispose();
                    if (storedPassword.equals(password)) {
    Sesion.setUsuarioActual(userr); // Establece el usuario actual
    
    // Resto del código
}
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Si no se encontraron resultados para el nombre de usuario, muestra un mensaje de "Acceso denegado".
            JOptionPane.showMessageDialog(null, "Usuario no encontrado en la base de datos", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("" + e);
    }
}
 
}
