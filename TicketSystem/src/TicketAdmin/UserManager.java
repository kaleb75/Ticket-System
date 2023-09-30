package TicketAdmin;


import javax.swing.JOptionPane;
import Menu.AdminMenu;
import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
//import java.util.List;


/**
 * Clase que representa la interfaz de usuario para la creación de nuevos usuarios.
 *
 * @author IMX078856 Kaleb
 */
public class UserManager extends javax.swing.JFrame {

    /**
     * Constructor de la clase NewUser.
     * Crea una nueva instancia de la interfaz NewUser.
     */
    public UserManager() {
        getContentPane();

        initComponents();
    }

    /**
     * Este método se llama desde el constructor para inicializar la interfaz.
     * ADVERTENCIA: No modifiques este código. El contenido de este método siempre
     * se regenera por el Editor de Formularios.
     * 
     * Aquí se generan automáticamente los componentes de la interfaz de usuario, por lo que no se recomienda modificar este código directamente en la mayoría de los casos.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TName = new javax.swing.JTextField();
        TLastName = new javax.swing.JTextField();
        LDept = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CAdmin = new javax.swing.JCheckBox();
        TUser = new javax.swing.JTextField();
        TClockNumber = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        CSys = new javax.swing.JCheckBox();
        TPassword = new javax.swing.JPasswordField();
        BotonBuscar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Support_System/UserManager");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(250, 150));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("User Manager");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("User:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");

        TName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        TLastName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        LDept.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT-FIS", "WH", "SMT", "IT-OA", "PE", "PM", "Shipping", "QA", " " }));
        LDept.setSelectedItem(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Clock Number:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Department:");

        CAdmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CAdmin.setText("Ticket Administrator");

        TUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        TClockNumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BotonBuscar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BotonBuscar.setText("Search");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonEditar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BotonEditar.setText("Update/Edit");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        BotonCrear.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BotonCrear.setText("New");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BotonEliminar.setText("Delete");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        CSys.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CSys.setText("System Administrator");

        TPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BotonBuscar1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BotonBuscar1.setText("Clean");
        BotonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscar1ActionPerformed(evt);
            }
        });

        jButton1.setText("⬅MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TUser, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDept, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TClockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CSys, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TName, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LDept, TClockNumber, TLastName, TName, TPassword, TUser});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TClockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAdmin)
                    .addComponent(CSys)
                    .addComponent(BotonBuscar1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBuscar)
                    .addComponent(BotonEditar)
                    .addComponent(BotonCrear)
                    .addComponent(BotonEliminar))
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(TName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(TLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(337, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        buscarusuario();
        
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscar1ActionPerformed
         TName.setText("");
            TLastName.setText("");
            TUser.setText("");
            TPassword.setText("");
            TClockNumber.setText(""+"");
            LDept.setSelectedItem(null);//Este es el combo box
            CAdmin.setSelected(false);
            CSys.setSelected(false);
    }//GEN-LAST:event_BotonBuscar1ActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
     editarusuario();
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        crearUsuario();
    }//GEN-LAST:event_BotonCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
AdminMenu ir = new AdminMenu();
ir.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonBuscar1;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JCheckBox CAdmin;
    private javax.swing.JCheckBox CSys;
    private javax.swing.JComboBox<String> LDept;
    private javax.swing.JTextField TClockNumber;
    private javax.swing.JTextField TLastName;
    private javax.swing.JTextField TName;
    private javax.swing.JPasswordField TPassword;
    private javax.swing.JTextField TUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

private void buscarusuario() {
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;

    // Obtener los valores de los campos de búsqueda
    String nombre = TName.getText();
    String apellido = TLastName.getText();
    String numeroReloj = TClockNumber.getText();

    // Crear una lista para almacenar los resultados
java.util.List<Usuario> resultados = new ArrayList<>();

    // Realizar la búsqueda por nombre
    if (!nombre.isEmpty()) {
        try {
            Connection connection = DriverManager.getConnection(url);
            String busqueda = "SELECT Name, LastName, Usuarioo, Pass, Admin, ClockNumber, Department, SystemAdmin FROM Usuarios WHERE Name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(busqueda);
            preparedStatement.setString(1, nombre);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String lastname = resultSet.getString("LastName");
                String Usuar = resultSet.getString("Usuarioo");
                String pass = resultSet.getString("Pass");
                int admin = resultSet.getInt("Admin"); //este para checkbox
                int clocknumber = resultSet.getInt("ClockNumber");
                String department = resultSet.getString("Department");
                int systemadmin = resultSet.getInt("SystemAdmin"); //este para el checkbox

                Usuario usuario = new Usuario(name, lastname, Usuar, pass, admin, clocknumber, department, systemadmin);
                resultados.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se generó la búsqueda por algo" + e);
        }
    } else if (!apellido.isEmpty()) {
        try {
            Connection connection = DriverManager.getConnection(url);
            String busqueda = "SELECT Name, LastName, Usuarioo, Pass, Admin, ClockNumber, Department, SystemAdmin FROM Usuarios WHERE ClockNumber = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(busqueda);
            preparedStatement.setString(1, numeroReloj);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String lastname = resultSet.getString("LastName");
                String Usuar = resultSet.getString("Usuarioo");
                String pass = resultSet.getString("Pass");
                int admin = resultSet.getInt("Admin"); //este para checkbox
                int clocknumber = resultSet.getInt("ClockNumber");
                String department = resultSet.getString("Department");
                int systemadmin = resultSet.getInt("SystemAdmin"); //este para el checkbox

                Usuario usuario = new Usuario(name, lastname, Usuar, pass, admin, clocknumber, department, systemadmin);
                resultados.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se generó la búsqueda por algo" + e);
        }
    } else if (!numeroReloj.isEmpty()) {
        try {
            Connection connection = DriverManager.getConnection(url);
            String busqueda = "SELECT Name, LastName, Usuarioo, Pass, Admin, ClockNumber, Department, SystemAdmin FROM Usuarios WHERE ClockNumber = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(busqueda);
            preparedStatement.setString(1, numeroReloj);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String lastname = resultSet.getString("LastName");
                String Usuar = resultSet.getString("Usuarioo");
                String pass = resultSet.getString("Pass");
                int admin = resultSet.getInt("Admin"); //este para checkbox
                int clocknumber = resultSet.getInt("ClockNumber");
                String department = resultSet.getString("Department");
                int systemadmin = resultSet.getInt("SystemAdmin"); //este para el checkbox

                Usuario usuario = new Usuario(name, lastname, Usuar, pass, admin, clocknumber, department, systemadmin);
                resultados.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se generó la búsqueda por algo" + e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No first name, last name or clock number to search for the user...");
    }

    // Mostrar la lista de resultados en un nuevo popup
    if (!resultados.isEmpty()) {
        // Crear un array de nombres de usuario para mostrar en el popup
        String[] nombresUsuarios = resultados.stream().map(Usuario::getNombreCompleto).toArray(String[]::new);

        // Mostrar la lista de resultados en un diálogo de selección
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione un usuario:", "Resultados de la búsqueda", JOptionPane.QUESTION_MESSAGE, null, nombresUsuarios, nombresUsuarios[0]);

        // Buscar al usuario seleccionado y mostrar sus detalles en los campos correspondientes
        if (seleccion != null && !seleccion.isEmpty()) {
            Usuario usuarioSeleccionado = resultados.stream().filter(u -> u.getNombreCompleto().equals(seleccion)).findFirst().orElse(null);
            if (usuarioSeleccionado != null) {
                TName.setText(usuarioSeleccionado.getNombre());
                TLastName.setText(usuarioSeleccionado.getApellido());
                TUser.setText(usuarioSeleccionado.getUsuario());
                TPassword.setText(usuarioSeleccionado.getContrasena());
                TClockNumber.setText(String.valueOf(usuarioSeleccionado.getNumeroReloj()));
                LDept.setSelectedItem(usuarioSeleccionado.getDepartamento());
                CAdmin.setSelected(usuarioSeleccionado.isAdmin());
                CSys.setSelected(usuarioSeleccionado.isSystemAdmin());
            }
        }
    }
}

    private void editarusuario() {
        // Crear un cuadro de diálogo para confirmar la edición
int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres editar este usuario?", "Confirmación de Edición", JOptionPane.YES_NO_OPTION);

// Si el usuario confirma la edición
if (confirmacion == JOptionPane.YES_OPTION) {
    // Obtener los nuevos valores de los campos de texto
    String newName = TName.getText();
    String newLastName = TLastName.getText();
    String newUsername = TUser.getText();
    String newPassword = TPassword.getText();
    String newDepartment = LDept.getSelectedItem().toString();
    boolean newAdmin = CAdmin.isSelected();
    boolean newSystemAdmin = CSys.isSelected();

    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
    
    // Realizar la edición del usuario en la base de datos
    try {
        Connection connection = DriverManager.getConnection(url);
        String updateQuery = "UPDATE Usuarios SET Name = ?, LastName = ?, Usuarioo = ?, Pass = ?, Admin = ?, Department = ?, SystemAdmin = ? WHERE ClockNumber = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1, newName);
        preparedStatement.setString(2, newLastName);
        preparedStatement.setString(3, newUsername);
        preparedStatement.setString(4, newPassword);
        preparedStatement.setInt(5, newAdmin ? 1 : 0); // Convertir a 1 si está seleccionado, 0 si no lo está
        preparedStatement.setString(6, newDepartment);
        preparedStatement.setInt(7, newSystemAdmin ? 1 : 0); // Convertir a 1 si está seleccionado, 0 si no lo está
        preparedStatement.setString(8, TClockNumber.getText());

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Usuario editado exitosamente.");
            // Limpia los campos de texto después de la edición
            TName.setText("");
            TLastName.setText("");
            TUser.setText("");
            TPassword.setText("");
            TClockNumber.setText("");
            LDept.setSelectedIndex(0);
            CAdmin.setSelected(false);
            CSys.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el usuario.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudo editar el usuario: " + e);
    }
}


    }

   private void eliminarUsuario() {
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;

    // Obtener el número de reloj del usuario que se desea eliminar
    String numeroReloj = TClockNumber.getText();

    if (!numeroReloj.isEmpty()) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar al usuario con número de reloj '" + numeroReloj + "'?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection connection = DriverManager.getConnection(url);
                String eliminacion = "DELETE FROM Usuarios WHERE ClockNumber = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(eliminacion);
                preparedStatement.setString(1, numeroReloj);

                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario con número de reloj '" + numeroReloj + "' eliminado exitosamente.");
                    
                    // Limpiar los campos después de la eliminación
                    TName.setText("");
                    TLastName.setText("");
                    TUser.setText("");
                    TPassword.setText("");
                    TClockNumber.setText("");
                    LDept.setSelectedIndex(0); // Establecer el combo box en la opción predeterminada
                    CAdmin.setSelected(false);
                    CSys.setSelected(false);
                    LDept.setSelectedItem(null);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar al usuario con número de reloj '" + numeroReloj + "'.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar al usuario por algo: " + e);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingresa el número de reloj del usuario que deseas eliminar.");
    }
}

private void crearUsuario() {
    // Obtener los valores de los campos de entrada
    String nombre = TName.getText();
    String apellido = TLastName.getText();
    String usuario = TUser.getText();
    String contrasena = TPassword.getText();
    String numeroRelojStr = TClockNumber.getText();
    String departamento = (String) LDept.getSelectedItem();
    int admin = CAdmin.isSelected() ? 1 : 0;
    int systemAdmin = CSys.isSelected() ? 1 : 0;

    // Verificar que los campos obligatorios no estén vacíos
    if (nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || contrasena.isEmpty() || numeroRelojStr.isEmpty() || departamento.isEmpty()) {
        // Crear un mensaje de error que indique los campos faltantes
        StringBuilder mensajeError = new StringBuilder("Por favor, complete los siguientes campos obligatorios:\n");
        if (nombre.isEmpty()) mensajeError.append("- Nombre\n");
        if (apellido.isEmpty()) mensajeError.append("- Apellido\n");
        if (usuario.isEmpty()) mensajeError.append("- Usuario\n");
        if (contrasena.isEmpty()) mensajeError.append("- Contraseña\n");
        if (numeroRelojStr.isEmpty()) mensajeError.append("- Número de Reloj\n");
        //if (departamento.isEmpty()) mensajeError.append("- Departamento\n");
        if (departamento == null || departamento.isEmpty()) mensajeError.append("- Departamento\n");

        JOptionPane.showMessageDialog(null, mensajeError.toString(), "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Convertir el número de reloj a entero
    int numeroReloj;
    try {
        numeroReloj = Integer.parseInt(numeroRelojStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo de Número de Reloj.", "Campo Inválido", JOptionPane.WARNING_MESSAGE);
        return;
    }
   String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
    // Realizar la inserción del nuevo usuario en la base de datos
    try {
        Connection connection = DriverManager.getConnection(url);

        String insercion = "INSERT INTO Usuarios (Name, LastName, Usuarioo, Pass, Admin, ClockNumber, Department, SystemAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insercion);
        preparedStatement.setString(1, nombre);
        preparedStatement.setString(2, apellido);
        preparedStatement.setString(3, usuario);
        preparedStatement.setString(4, contrasena);
        preparedStatement.setInt(5, admin);
        preparedStatement.setInt(6, numeroReloj);
        preparedStatement.setString(7, departamento);
        preparedStatement.setInt(8, systemAdmin);

        int filasAfectadas = preparedStatement.executeUpdate();
        if (filasAfectadas > 0) {
            // Notificar al usuario sobre la creación exitosa
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente:\nNombre: " + nombre + "\nApellido: " + apellido, "Usuario Creado", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar los campos después de la inserción
            TName.setText("");
            TLastName.setText("");
            TUser.setText("");
            TPassword.setText("");
            TClockNumber.setText("");
            LDept.setSelectedIndex(0);
            CAdmin.setSelected(false);
            CSys.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        connection.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al crear el usuario: " + e.getMessage(), "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
    }
}


}


