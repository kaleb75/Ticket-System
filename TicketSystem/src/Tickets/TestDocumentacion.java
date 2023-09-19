/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tickets;

import Menu.MainMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TestDocumentacion extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;

    public TestDocumentacion() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("TicketID");
        modeloTabla.addColumn("Title");
        modeloTabla.addColumn("Priority");
        modeloTabla.addColumn("Status");
        modeloTabla.addColumn("Assigned");
        modeloTabla.addColumn("ETS");
        modeloTabla.addColumn("Descripcion");
      //  modeloTabla.addColumn("Documentacion");
        jTable1.setModel(modeloTabla);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Docu = new javax.swing.JTextArea();
        BotonEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        DocumentationPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BordeTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        TituloID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Documentation");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Documentation");
        jInternalFrame1.setAutoscrolls(true);
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Documentation:");
        jScrollPane1.setViewportView(jLabel1);

        Docu.setColumns(20);
        Docu.setRows(5);
        jScrollPane4.setViewportView(Docu);

        BotonEnviar.setText("Enviar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });

        jLabel2.setText("Attached 1:");

        jButton2.setText("Search");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton2))
                    .addComponent(BotonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("History");
        jInternalFrame2.setVisible(true);

        DocumentationPane.setEditable(false);
        jScrollPane2.setViewportView(DocumentationPane);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ticketID", "title", "priority", "status", "assigned", "ets", "description", "documentacion"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane2)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );

        Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo.setText("FIS-");

        Titulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        TituloID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TituloID.setText("000");

        javax.swing.GroupLayout BordeTituloLayout = new javax.swing.GroupLayout(BordeTitulo);
        BordeTitulo.setLayout(BordeTituloLayout);
        BordeTituloLayout.setHorizontalGroup(
            BordeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordeTituloLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        BordeTituloLayout.setVerticalGroup(
            BordeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordeTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BordeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(Titulo1)
                    .addComponent(TituloID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Menu");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BordeTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BordeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame2)
                    .addComponent(jInternalFrame1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
      String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
    Date fechaactual = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechahoracomostring = formatofecha.format(fechaactual);
String Documento = "***  "+ fechaactual+"  ***\n" + Docu.getText()+"\n"+ "\n" +"\n"+ DocumentationPane.getText();
//String Documento = Docu.getText(); 
    int IDTicket = 1; // Reemplaza 1 con el ID del ticket que deseas actualizar
int NumTicket = Integer.parseInt(TituloID.getText());
    try {
        Connection connection = DriverManager.getConnection(url);
        String query = "UPDATE Test SET Documentacion = ? WHERE IDTicket = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, Documento);
            preparedStatement.setInt(2, NumTicket);
            
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Documento actualizado con éxito.");
            } else {
                System.out.println("No se pudo actualizar el documento.");
            }
        }
        refrescardocumentacion();
    } catch (Exception e) {
        e.printStackTrace();
    
    }
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 buscarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MainMenu ir = new MainMenu();
       JOptionPane.showMessageDialog(null,"Volviendo al menu...");
       ir.showMainMenu();
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

private void buscarDatos() {
        String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
        String url = "jdbc:ucanaccess://" + ruta;
        String numeroTicketStr = JOptionPane.showInputDialog(this, "Ingrese el número de ticket:", "Ingresar Número de Ticket", JOptionPane.QUESTION_MESSAGE);

        try (Connection connection = DriverManager.getConnection(url)) {
            int NumerodeTicket = Integer.parseInt(numeroTicketStr);
            String mensaje = "<html>Your Ticket is: <H1><b>FIS-" + NumerodeTicket + "</b></h1></html>";
            JOptionPane.showMessageDialog(null, mensaje);

            String query = "SELECT IDTicket, Title, Priority, Status, Assigned, ETS, Description, Documentacion FROM Test WHERE IDTicket = ?";
 PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, NumerodeTicket);
TituloID.setText(""+NumerodeTicket);
            //TituloID.setText(""+NumerodeTicket);
            ResultSet resultSet = preparedStatement.executeQuery();

            modeloTabla.setRowCount(0); // Limpiar la tabla

            while (resultSet.next()) {
                int ticketID = resultSet.getInt("IDTicket");
                String title = resultSet.getString("Title");
                String priority = resultSet.getString("Priority");
                String status = resultSet.getString("Status");
                String assigned = resultSet.getString("Assigned");
                Date ets = resultSet.getDate("ETS");
                //String ets = resultSet.getDate("ETS");
                String descripcion = resultSet.getString("Description");
                String documentacion = resultSet.getString("Documentacion");

                // Agregar una fila al modelo de tabla
                modeloTabla.addRow(new Object[]{ticketID, title, priority, status, assigned, ets, descripcion,});
                   DocumentationPane.setText(documentacion);
            }
        
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores, puedes personalizarlo según tus necesidades
        }
    }

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
            java.util.logging.Logger.getLogger(TestDocumentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestDocumentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestDocumentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestDocumentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestDocumentacion().setVisible(true);
                

            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BordeTitulo;
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JTextArea Docu;
    private javax.swing.JTextPane DocumentationPane;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel TituloID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void refrescardocumentacion() {
              String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
        try (Connection connection = DriverManager.getConnection(url)) {
            int NumerodeTicket = Integer.parseInt(TituloID.getText());
           /* String mensaje = "<html><H1><b>Comentario Agregado a FIS-" + NumerodeTicket + "</b></h1></html>";
            JOptionPane.showMessageDialog(null, mensaje);*/

            String query = "SELECT IDTicket, Title, Priority, Status, Assigned, ETS, Description, Documentacion FROM Test WHERE IDTicket = ?";
 PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, NumerodeTicket);
TituloID.setText(""+NumerodeTicket);
            //TituloID.setText(""+NumerodeTicket);
            ResultSet resultSet = preparedStatement.executeQuery();

            modeloTabla.setRowCount(0); // Limpiar la tabla

            while (resultSet.next()) {
                int ticketID = resultSet.getInt("IDTicket");
                String title = resultSet.getString("Title");
                String priority = resultSet.getString("Priority");
                String status = resultSet.getString("Status");
                String assigned = resultSet.getString("Assigned");
                Date ets = resultSet.getDate("ETS");
                //String ets = resultSet.getDate("ETS");
                String descripcion = resultSet.getString("Description");
                String documentacion = resultSet.getString("Documentacion");

                // Agregar una fila al modelo de tabla
                modeloTabla.addRow(new Object[]{ticketID, title, priority, status, assigned, ets, descripcion,});
                   DocumentationPane.setText(documentacion);
            }
        
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores, puedes personalizarlo según tus necesidades
        }
    }
}
