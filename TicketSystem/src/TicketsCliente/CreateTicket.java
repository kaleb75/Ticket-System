
package TicketsCliente;

import Log.Sesion;
import Menu.UserMenu;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;





public class CreateTicket extends javax.swing.JFrame {

        java.util.Date fechaActual = new java.util.Date();
            String fecha = fechaActual.toString();
         
            public CreateTicket() {
                initComponents();
            }
            
 
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TClockNumber = new javax.swing.JTextField();
        TTitle = new javax.swing.JTextField();
        TPriority = new javax.swing.JComboBox<>();
        Tets = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDescription = new javax.swing.JTextArea();
        VentanaFecha = new javax.swing.JLabel();
        InsertBoton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Usuariosystema = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Ticket");
        setLocation(new java.awt.Point(200, 150));
        setSize(1920, 1080);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Description");

        jLabel2.setText("Clock Number:");

        jLabel3.setText("Title:");

        jLabel4.setText("Priority:");

        jLabel5.setText("Estimated Time:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel6.setText("New Ticket");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        TClockNumber.setText("078856");

        TTitle.setText("Test de Kaleb en pruebas");

        TPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1- Very High (Urgent Failure)", "2- High (Failure)", "3- Medium (Intermittent or degraded failure)", "4- Low (Changes or updates)", "5- Very Low (Information)" }));

        Tets.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1693920163499L), null, java.util.Calendar.DAY_OF_MONTH));

        TDescription.setColumns(20);
        TDescription.setRows(5);
        TDescription.setText("Estas son pruebas de ejecucion de Kaleb, estos no son tickets validos!!!.\nFavor de no cancelar.");
        jScrollPane1.setViewportView(TDescription);

        VentanaFecha.setText("Fecha:" + fecha);

        InsertBoton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        InsertBoton.setText("Generate");
        InsertBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBotonActionPerformed(evt);
            }
        });

        jButton1.setText("<-Go Back Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Usuariosystema.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(TClockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addComponent(Tets)
                                        .addComponent(TPriority, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(InsertBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VentanaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Usuariosystema, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(491, 491, 491))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Usuariosystema, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TClockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(InsertBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(VentanaFecha)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBotonActionPerformed
              
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    // Establece la URL de conexión a la base de datos de Access
    //String ruta = "C:\\Users\\imx078856\\Documents\\BDTickets.accdb";
    //"C:\Users\imx078856\Documents\GitHub\Ticket-System\BD\BDTickets-System.accdb"
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;

     int respuesta = JOptionPane.showConfirmDialog(
            null,  // Componente padre (null para cuadro de diálogo independiente)
            "Are you sure you want to create this new ticket?",  // Mensaje
            "New ticket confirmation",  // Título del cuadro de diálogo    
            JOptionPane.YES_NO_OPTION  // Tipo de botones (Sí y No)
        );
             if (respuesta == JOptionPane.YES_OPTION) {

    
    try {
        connection = DriverManager.getConnection(url);
        if (connection != null) {
            System.out.println("Conexión establecida");

                //Obtenemos texto del Title y se pone en el objeto desc para insertar en la base de datos
                String title = TTitle.getText();
                
                //Obtenemos texto del numero del reloj y se pone en el objeto desc para insertar en la base de datos
                String clockn = TClockNumber.getText();                
            
                // Obtiene la fecha y hora actual
                Date fechaHoraActual = new Date();
                // Formatea la fecha y hora en el formato deseado (DD/MM/AAAA HH:MM:SS AM/PM)
                Timestamp timestamp = new Timestamp(fechaHoraActual.getTime());
                
                //Obtener el texto del combobox
                String opcionescombo = (String) TPriority.getSelectedItem();
                
                //Obtener la fecha de tiempo estimado de solucion
                Date ets = (Date) Tets.getValue();
                //Damos formato para insertar el ETS
                Timestamp etss = new Timestamp(ets.getTime());
                
                //Obtenemos texto de la descripcion y se pone en el objeto desc para insertar en la base de datos
                String desc = TDescription.getText();

             
                String consulta = "INSERT INTO Test (Title, ClockNumber, Date, Priority, Status, ETS, Description) VALUES (?, ?, ?, ?, ?, ?, ?)";
                preparedStatement = connection.prepareStatement(consulta);

                // Establece los valores para los campos
                preparedStatement.setString(1, title);
                preparedStatement.setString(2, clockn);
                preparedStatement.setTimestamp(3, timestamp);
                preparedStatement.setString(4, opcionescombo);
                preparedStatement.setString(5, "Not Started");
                preparedStatement.setTimestamp(6, etss);
                preparedStatement.setString(7, desc);
                
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa.");
                
            } else {
                System.out.println("La inserción no se pudo realizar.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Error de SQL: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error de SQL: " + e.getMessage());
    } finally {
        // Cierra el PreparedStatement y la conexión en el bloque finally
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                System.out.println("conexion cerrada");
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
mostrarticket();
             }else {
            // El usuario seleccionó "No" o cerró el cuadro de diálogo
            // Puedes realizar otra acción o salir del programa si lo deseas
            JOptionPane.showMessageDialog(null, "No new ticket was generated");
        }
    }//GEN-LAST:event_InsertBotonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
/*
        
        Pendiente de documentar la desconexion de BD
        
        */
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(
    null,  // Componente padre (null para cuadro de diálogo independiente)
    "¿Would you like to go to the Menu?",  // Mensaje que se muestra en el cuadro de diálogo
    "Menu",  // Título del cuadro de diálogo
    JOptionPane.YES_NO_OPTION  // Tipo de botones (Sí y No)
);
 if (respuesta == JOptionPane.YES_OPTION) {
             UserMenu ir = new UserMenu();
             ir.setVisible(true);
             this.dispose();
        } else {
         //El sistema no hace nada
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setuser();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

 
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
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTicket().setVisible(true);
                
                //Method to connect the frame/class to the database --Method to connect the frame/class to the dat
                AccessDatabaseConnection();
            }

        public static void AccessDatabaseConnection() {
      Connection connection = null;
        Statement sentencia = null;
        ResultSet resultado = null;
         // Establece la URL de conexión a la base de datos de Access
          //String ruta = "C:\\Users\\imx078856\\Documents\\BDTickets.accdb";
    //"C:\Users\imx078856\Documents\GitHub\Ticket-System\BD\BDTickets-System.accdb"
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
            String url = "jdbc:ucanaccess://" + ruta;

            try {
        connection = DriverManager.getConnection(url);
                System.out.println("Conexion exitosa");
              //  JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            } catch (Exception e) {
                System.out.println(""+e);
                JOptionPane.showMessageDialog(null, e);
                ;
            }

    } //    Metodo para conexion de base de datos | Database connection method*/

        });
                    

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertBoton;
    private javax.swing.JTextField TClockNumber;
    private javax.swing.JTextArea TDescription;
    private javax.swing.JComboBox<String> TPriority;
    private javax.swing.JTextField TTitle;
    private javax.swing.JSpinner Tets;
    private javax.swing.JLabel Usuariosystema;
    public javax.swing.JLabel VentanaFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void mostrarticket() {
         Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    int ultimoID =0;
    // Establece la URL de conexión a la base de datos de Access
  //String ruta = "C:\\Users\\imx078856\\Documents\\BDTickets.accdb";
    //"C:\Users\imx078856\Documents\GitHub\Ticket-System\BD\BDTickets-System.accdb"
    String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
       try {
            // Establece la conexión con la base de datos
            connection = DriverManager.getConnection(url);

            // Consulta el último ID de la tabla
            String sql = "SELECT MAX(IDTicket) FROM Test";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            // Obtiene el último ID y lo almacena en la variable
            if (resultSet.next()) {
                ultimoID = resultSet.getInt(1);
            }

            // Utiliza el valor de 'ultimoID' como desees
           // JOptionPane.showMessageDialog(null, "Your new ticket is the FIS-" + ultimoID);
            String mensaje = "<html>Your new ticket is: <h1><b>FIS-" + ultimoID + "</b></h1></html>";
JOptionPane.showMessageDialog(null, mensaje);

//   System.out.println("El último ID en la tabla es: " + ultimoID);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cierra los recursos
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } }

    private void setuser() {
                   String usuarioActual = Sesion.getUsuarioActual();
    Usuariosystema.setText("Usuario:" + usuarioActual);

    if (usuarioActual == null) {
        JOptionPane.showMessageDialog(null, "No hay un usuario conectado");
        this.dispose(); // Cierra la ventana actual
    } else {
        // Lógica adicional si el usuario no es null
    }
    }
}