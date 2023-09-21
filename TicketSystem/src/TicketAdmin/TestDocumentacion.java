/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicketAdmin;

import Menu.AdminMenu;
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
        MenuBotton = new javax.swing.JButton();
        InicioTicket = new javax.swing.JButton();
        PendingCustomerBoton = new javax.swing.JButton();
        TshootBoton = new javax.swing.JButton();
        PendingVendorBoton = new javax.swing.JButton();
        ValidacionBoton = new javax.swing.JButton();
        CloseBoton = new javax.swing.JButton();
        EscalatedBoton = new javax.swing.JButton();
        BuscarTicketBotton = new javax.swing.JButton();
        ReOpenBoton = new javax.swing.JButton();

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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
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
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BordeTituloLayout.setVerticalGroup(
            BordeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordeTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BordeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1)
                    .addGroup(BordeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titulo)
                        .addComponent(TituloID)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuBotton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        MenuBotton.setText("Menu");
        MenuBotton.setAlignmentY(0.0F);
        MenuBotton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuBotton.setMaximumSize(new java.awt.Dimension(60, 25));
        MenuBotton.setMinimumSize(new java.awt.Dimension(60, 25));
        MenuBotton.setPreferredSize(new java.awt.Dimension(60, 25));
        MenuBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBottonActionPerformed(evt);
            }
        });

        InicioTicket.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        InicioTicket.setText("Start");
        InicioTicket.setAlignmentY(0.0F);
        InicioTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InicioTicket.setMaximumSize(new java.awt.Dimension(60, 25));
        InicioTicket.setMinimumSize(new java.awt.Dimension(60, 25));
        InicioTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioTicketActionPerformed(evt);
            }
        });

        PendingCustomerBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        PendingCustomerBoton.setText("Pending Customer");
        PendingCustomerBoton.setAlignmentY(0.0F);
        PendingCustomerBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PendingCustomerBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        PendingCustomerBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        PendingCustomerBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingCustomerBotonActionPerformed(evt);
            }
        });

        TshootBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        TshootBoton.setText("Tshoot");
        TshootBoton.setAlignmentY(0.0F);
        TshootBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TshootBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        TshootBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        TshootBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TshootBotonActionPerformed(evt);
            }
        });

        PendingVendorBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        PendingVendorBoton.setText("Pending Vendor");
        PendingVendorBoton.setAlignmentY(0.0F);
        PendingVendorBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PendingVendorBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        PendingVendorBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        PendingVendorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingVendorBotonActionPerformed(evt);
            }
        });

        ValidacionBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        ValidacionBoton.setText("Validation");
        ValidacionBoton.setAlignmentY(0.0F);
        ValidacionBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ValidacionBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        ValidacionBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        ValidacionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidacionBotonActionPerformed(evt);
            }
        });

        CloseBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        CloseBoton.setText("Close");
        CloseBoton.setAlignmentY(0.0F);
        CloseBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CloseBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        CloseBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        CloseBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBotonActionPerformed(evt);
            }
        });

        EscalatedBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        EscalatedBoton.setText("Escale");
        EscalatedBoton.setAlignmentY(0.0F);
        EscalatedBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EscalatedBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        EscalatedBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        EscalatedBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscalatedBotonActionPerformed(evt);
            }
        });

        BuscarTicketBotton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        BuscarTicketBotton.setText("Search");
        BuscarTicketBotton.setAlignmentY(0.0F);
        BuscarTicketBotton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarTicketBotton.setMaximumSize(new java.awt.Dimension(60, 25));
        BuscarTicketBotton.setMinimumSize(new java.awt.Dimension(60, 25));
        BuscarTicketBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTicketBottonActionPerformed(evt);
            }
        });

        ReOpenBoton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        ReOpenBoton.setText("Reopen");
        ReOpenBoton.setAlignmentY(0.0F);
        ReOpenBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReOpenBoton.setMaximumSize(new java.awt.Dimension(60, 25));
        ReOpenBoton.setMinimumSize(new java.awt.Dimension(60, 25));
        ReOpenBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReOpenBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BuscarTicketBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(MenuBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(InicioTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TshootBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EscalatedBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CloseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PendingCustomerBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PendingVendorBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ValidacionBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReOpenBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BordeTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CloseBoton, EscalatedBoton, PendingCustomerBoton, PendingVendorBoton, TshootBoton, ValidacionBoton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BordeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MenuBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InicioTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TshootBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EscalatedBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CloseBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PendingVendorBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ValidacionBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReOpenBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BuscarTicketBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PendingCustomerBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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

    private void MenuBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBottonActionPerformed
       AdminMenu ir = new AdminMenu();
       JOptionPane.showMessageDialog(null,"Volviendo al menu...");
       ir.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_MenuBottonActionPerformed

    private void InicioTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioTicketActionPerformed

  String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
    Date fechaactual = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String fechahoracomostring = formatofecha.format(fechaactual);
    String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket Iniciado ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();
    //String Documento = Docu.getText(); 
    int IDTicket = 1; // Reemplaza 1 con el ID del ticket que deseas actualizar
    int NumTicket = Integer.parseInt(TituloID.getText());

    String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
    try {
        Connection connection = DriverManager.getConnection(url);

        // Obtener el estado del ticket
        try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
            preparedStatementEstatus.setInt(1, NumTicket);

            ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

            if (resultSetEstatus.next()) {
                String estatus = resultSetEstatus.getString("Status");

                if ("Not Started".equals(estatus)) {
                    // Continuar con la actualización del documento
                    String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setString(1, Documento);
                        preparedStatement.setString(2, "In progress");
                        preparedStatement.setInt(3, NumTicket);

                        int filasAfectadas = preparedStatement.executeUpdate();

                        if (filasAfectadas > 0) {
                            System.out.println("Documento actualizado con éxito.");
                        } else {
                            System.out.println("No se pudo actualizar el documento.");
                        }
                    }
                    refrescardocumentacion();
                } else {
                    // El ticket no tiene estado "Not Started", mostrar mensaje
                    JOptionPane.showMessageDialog(null, "Este ticket no es nuevo, no se puede iniciar.");
                }
            } else {
                // No se encontró el ticket en la base de datos
                JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_InicioTicketActionPerformed

    private void PendingCustomerBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingCustomerBotonActionPerformed
     // Definición de la ruta de la base de datos de acceso
String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
// Construcción de la URL de conexión a la base de datos
String url = "jdbc:ucanaccess://" + ruta;

// Obtiene la fecha y hora actual
Date fechaactual = new Date();
// Formatea la fecha y hora en el formato "dd-MM-yyyy HH:mm:ss"
SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
// Convierte la fecha y hora formateada en una cadena
String fechahoracomostring = formatofecha.format(fechaactual);

// Construye un documento con la fecha y hora actual y un mensaje
String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket is Pending Customer ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();

// Número de identificación del ticket que se desea actualizar (reemplaza con el valor adecuado)
int IDTicket = 1;

// Obtiene el número de ticket desde un componente de la interfaz de usuario (reemplaza con el valor adecuado)
int NumTicket = Integer.parseInt(TituloID.getText());

// Consulta SQL para obtener el estado del ticket
String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
try {
    // Establece la conexión con la base de datos
    Connection connection = DriverManager.getConnection(url);

    // Obtiene el estado del ticket
    try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
        preparedStatementEstatus.setInt(1, NumTicket);

        ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

        if (resultSetEstatus.next()) {
            String estatus = resultSetEstatus.getString("Status");

            // Verifica si el estado del ticket no es "Troubleshooting"
            if (!"Pending Customer".equals(estatus) && !"Not Started".equals(estatus) && !"Closed".equals(estatus)) {
                // Continuar con la actualización del documento

                // Consulta SQL para actualizar el documento y el estado del ticket
                String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, Documento);
                    preparedStatement.setString(2, "Pending Customer");
                    preparedStatement.setInt(3, NumTicket);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Documento actualizado con éxito.");
                    } else {
                        System.out.println("No se pudo actualizar el documento.");
                    }
                }
                // Actualizar la documentación en la interfaz de usuario
                refrescardocumentacion();
            } else {
                // El ticket ya está en estado "Troubleshooting", muestra un mensaje
                JOptionPane.showMessageDialog(null, "Este Ticket no se puede poner en Pending Customer\n Su estatus es ''"+estatus+"''");
            }
        } else {
            // No se encontró el ticket en la base de datos, muestra un mensaje
            JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_PendingCustomerBotonActionPerformed

    private void TshootBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TshootBotonActionPerformed
// Definición de la ruta de la base de datos de acceso
String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
// Construcción de la URL de conexión a la base de datos
String url = "jdbc:ucanaccess://" + ruta;

// Obtiene la fecha y hora actual
Date fechaactual = new Date();
// Formatea la fecha y hora en el formato "dd-MM-yyyy HH:mm:ss"
SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
// Convierte la fecha y hora formateada en una cadena
String fechahoracomostring = formatofecha.format(fechaactual);

// Construye un documento con la fecha y hora actual y un mensaje
String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket in Tshoot ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();

// Número de identificación del ticket que se desea actualizar (reemplaza con el valor adecuado)
int IDTicket = 1;

// Obtiene el número de ticket desde un componente de la interfaz de usuario (reemplaza con el valor adecuado)
int NumTicket = Integer.parseInt(TituloID.getText());

// Consulta SQL para obtener el estado del ticket
String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
try {
    // Establece la conexión con la base de datos
    Connection connection = DriverManager.getConnection(url);

    // Obtiene el estado del ticket
    try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
        preparedStatementEstatus.setInt(1, NumTicket);

        ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

        if (resultSetEstatus.next()) {
            String estatus = resultSetEstatus.getString("Status");

            // Verifica si el estado del ticket no es "Troubleshooting"
            if (!"Troubleshooting".equals(estatus) && !"Not Started".equals(estatus) && !"Closed".equals(estatus)) {
                // Continuar con la actualización del documento

                // Consulta SQL para actualizar el documento y el estado del ticket
                String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, Documento);
                    preparedStatement.setString(2, "Troubleshooting");
                    preparedStatement.setInt(3, NumTicket);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Documento actualizado con éxito.");
                    } else {
                        System.out.println("No se pudo actualizar el documento.");
                    }
                }
                // Actualizar la documentación en la interfaz de usuario
                refrescardocumentacion();
            } else {
                // El ticket ya está en estado "Troubleshooting", muestra un mensaje
                JOptionPane.showMessageDialog(null, "Este Ticket no se puede poner en Troubleshooting\n Su estatus es ''"+estatus+"''");
            }
        } else {
            // No se encontró el ticket en la base de datos, muestra un mensaje
            JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}

    }//GEN-LAST:event_TshootBotonActionPerformed

    private void PendingVendorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingVendorBotonActionPerformed
  // Definición de la ruta de la base de datos de acceso
String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
// Construcción de la URL de conexión a la base de datos
String url = "jdbc:ucanaccess://" + ruta;

// Obtiene la fecha y hora actual
Date fechaactual = new Date();
// Formatea la fecha y hora en el formato "dd-MM-yyyy HH:mm:ss"
SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
// Convierte la fecha y hora formateada en una cadena
String fechahoracomostring = formatofecha.format(fechaactual);

// Construye un documento con la fecha y hora actual y un mensaje
String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket is Pending Vendor ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();

// Número de identificación del ticket que se desea actualizar (reemplaza con el valor adecuado)
int IDTicket = 1;

// Obtiene el número de ticket desde un componente de la interfaz de usuario (reemplaza con el valor adecuado)
int NumTicket = Integer.parseInt(TituloID.getText());

// Consulta SQL para obtener el estado del ticket
String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
try {
    // Establece la conexión con la base de datos
    Connection connection = DriverManager.getConnection(url);

    // Obtiene el estado del ticket
    try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
        preparedStatementEstatus.setInt(1, NumTicket);

        ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

        if (resultSetEstatus.next()) {
            String estatus = resultSetEstatus.getString("Status");

            // Verifica si el estado del ticket no es "Troubleshooting"
            if (!"Pending Vendor".equals(estatus) && !"Not Started".equals(estatus) && !"Closed".equals(estatus)) {
                // Continuar con la actualización del documento

                // Consulta SQL para actualizar el documento y el estado del ticket
                String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, Documento);
                    preparedStatement.setString(2, "Pending Vendor");
                    preparedStatement.setInt(3, NumTicket);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Documento actualizado con éxito.");
                    } else {
                        System.out.println("No se pudo actualizar el documento.");
                    }
                }
                // Actualizar la documentación en la interfaz de usuario
                refrescardocumentacion();
            } else {
                // El ticket ya está en estado "Troubleshooting", muestra un mensaje
                JOptionPane.showMessageDialog(null, "Este Ticket no se puede poner en Pending Vendor\n Su estatus es ''"+estatus+"''");
            }
        } else {
            // No se encontró el ticket en la base de datos, muestra un mensaje
            JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_PendingVendorBotonActionPerformed

    private void ValidacionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidacionBotonActionPerformed

         // Definición de la ruta de la base de datos de acceso
String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
// Construcción de la URL de conexión a la base de datos
String url = "jdbc:ucanaccess://" + ruta;

// Obtiene la fecha y hora actual
Date fechaactual = new Date();
// Formatea la fecha y hora en el formato "dd-MM-yyyy HH:mm:ss"
SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
// Convierte la fecha y hora formateada en una cadena
String fechahoracomostring = formatofecha.format(fechaactual);

// Construye un documento con la fecha y hora actual y un mensaje
String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket is Validated ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();

// Número de identificación del ticket que se desea actualizar (reemplaza con el valor adecuado)
int IDTicket = 1;

// Obtiene el número de ticket desde un componente de la interfaz de usuario (reemplaza con el valor adecuado)
int NumTicket = Integer.parseInt(TituloID.getText());

// Consulta SQL para obtener el estado del ticket
String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
try {
    // Establece la conexión con la base de datos
    Connection connection = DriverManager.getConnection(url);

    // Obtiene el estado del ticket
    try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
        preparedStatementEstatus.setInt(1, NumTicket);

        ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

        if (resultSetEstatus.next()) {
            String estatus = resultSetEstatus.getString("Status");

            // Verifica si el estado del ticket no es "Troubleshooting"
            if (!"Validated".equals(estatus) && !"Not Started".equals(estatus) && !"Closed".equals(estatus)) {
                // Continuar con la actualización del documento

                // Consulta SQL para actualizar el documento y el estado del ticket
                String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, Documento);
                    preparedStatement.setString(2, "Validated");
                    preparedStatement.setInt(3, NumTicket);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Documento actualizado con éxito.");
                    } else {
                        System.out.println("No se pudo actualizar el documento.");
                    }
                }
                // Actualizar la documentación en la interfaz de usuario
                refrescardocumentacion();
            } else {
                // El ticket ya está en estado "Troubleshooting", muestra un mensaje
                JOptionPane.showMessageDialog(null, "Este Ticket no se puede poner en Validated\n Su estatus es ''"+estatus+"''");
            }
        } else {
            // No se encontró el ticket en la base de datos, muestra un mensaje
            JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
        
    }//GEN-LAST:event_ValidacionBotonActionPerformed

    private void CloseBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBotonActionPerformed

      // Definición de la ruta de la base de datos de acceso
String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
// Construcción de la URL de conexión a la base de datos
String url = "jdbc:ucanaccess://" + ruta;

// Obtiene la fecha y hora actual
Date fechaactual = new Date();
// Formatea la fecha y hora en el formato "dd-MM-yyyy HH:mm:ss"
SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
// Convierte la fecha y hora formateada en una cadena
String fechahoracomostring = formatofecha.format(fechaactual);

// Construye un documento con la fecha y hora actual y un mensaje
String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket is Closed ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();

// Número de identificación del ticket que se desea actualizar (reemplaza con el valor adecuado)
int IDTicket = 1;

// Obtiene el número de ticket desde un componente de la interfaz de usuario (reemplaza con el valor adecuado)
int NumTicket = Integer.parseInt(TituloID.getText());

// Consulta SQL para obtener el estado del ticket
String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
try {
    // Establece la conexión con la base de datos
    Connection connection = DriverManager.getConnection(url);

    // Obtiene el estado del ticket
    try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
        preparedStatementEstatus.setInt(1, NumTicket);

        ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

        if (resultSetEstatus.next()) {
            String estatus = resultSetEstatus.getString("Status");

            // Verifica si el estado del ticket no es "Troubleshooting"
            if (!"Closed".equals(estatus) && "Validated".equals(estatus)) {
                // Continuar con la actualización del documento

                // Consulta SQL para actualizar el documento y el estado del ticket
                String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, Documento);
                    preparedStatement.setString(2, "Closed");
                    preparedStatement.setInt(3, NumTicket);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Documento actualizado con éxito.");
                    } else {
                        System.out.println("No se pudo actualizar el documento.");
                    }
                }
                // Actualizar la documentación en la interfaz de usuario
                refrescardocumentacion();
            } else {
                // El ticket ya está en estado "Troubleshooting", muestra un mensaje
                JOptionPane.showMessageDialog(null, "Este Ticket no se puede poner en Closed\n Su estatus es ''"+estatus+"''");
            }
        } else {
            // No se encontró el ticket en la base de datos, muestra un mensaje
            JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_CloseBotonActionPerformed

    private void EscalatedBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscalatedBotonActionPerformed
      // Definición de la ruta de la base de datos de acceso
String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
// Construcción de la URL de conexión a la base de datos
String url = "jdbc:ucanaccess://" + ruta;

// Obtiene la fecha y hora actual
Date fechaactual = new Date();
// Formatea la fecha y hora en el formato "dd-MM-yyyy HH:mm:ss"
SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
// Convierte la fecha y hora formateada en una cadena
String fechahoracomostring = formatofecha.format(fechaactual);

// Construye un documento con la fecha y hora actual y un mensaje
String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket is Escalated ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();

// Número de identificación del ticket que se desea actualizar (reemplaza con el valor adecuado)
int IDTicket = 1;

// Obtiene el número de ticket desde un componente de la interfaz de usuario (reemplaza con el valor adecuado)
int NumTicket = Integer.parseInt(TituloID.getText());

// Consulta SQL para obtener el estado del ticket
String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
try {
    // Establece la conexión con la base de datos
    Connection connection = DriverManager.getConnection(url);

    // Obtiene el estado del ticket
    try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
        preparedStatementEstatus.setInt(1, NumTicket);

        ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

        if (resultSetEstatus.next()) {
            String estatus = resultSetEstatus.getString("Status");

            // Verifica si el estado del ticket no es "Troubleshooting"
            if (!"Escalated".equals(estatus) && !"Not Started".equals(estatus) && !"Closed".equals(estatus) ) {
                // Continuar con la actualización del documento

                // Consulta SQL para actualizar el documento y el estado del ticket
                String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, Documento);
                    preparedStatement.setString(2, "Escalated");
                    preparedStatement.setInt(3, NumTicket);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Documento actualizado con éxito.");
                    } else {
                        System.out.println("No se pudo actualizar el documento.");
                    }
                }
                // Actualizar la documentación en la interfaz de usuario
                refrescardocumentacion();
            } else {
                // El ticket ya está en estado "Troubleshooting", muestra un mensaje
                JOptionPane.showMessageDialog(null, "Este Ticket no se puede poner en Escalated\n Su estatus es ''"+estatus+"''");
            }
        } else {
            // No se encontró el ticket en la base de datos, muestra un mensaje
            JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_EscalatedBotonActionPerformed

    private void BuscarTicketBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTicketBottonActionPerformed
TestDocumentacion abrir = new TestDocumentacion();
abrir.setVisible(true);
this.dispose();
    }//GEN-LAST:event_BuscarTicketBottonActionPerformed

    private void ReOpenBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReOpenBotonActionPerformed
       String ruta = "C:\\Users\\imx078856\\Documents\\GitHub\\Ticket-System\\BD\\BDTickets-System.accdb";
    String url = "jdbc:ucanaccess://" + ruta;
    Date fechaactual = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String fechahoracomostring = formatofecha.format(fechaactual);
    String Documento = "***  " + fechaactual + "  ***\n" + "***  Ticket Reabierto ***" + "\n" + "\n" + "\n" + DocumentationPane.getText();
    //String Documento = Docu.getText(); 
    int IDTicket = 1; // Reemplaza 1 con el ID del ticket que deseas actualizar
    int NumTicket = Integer.parseInt(TituloID.getText());

    String queryestatus = "SELECT Status FROM Test WHERE IDTicket =?";
    try {
        Connection connection = DriverManager.getConnection(url);

        // Obtener el estado del ticket
        try (PreparedStatement preparedStatementEstatus = connection.prepareStatement(queryestatus)) {
            preparedStatementEstatus.setInt(1, NumTicket);

            ResultSet resultSetEstatus = preparedStatementEstatus.executeQuery();

            if (resultSetEstatus.next()) {
                String estatus = resultSetEstatus.getString("Status");

                if ("Closed".equals(estatus)) {
                    // Continuar con la actualización del documento
                    String query = "UPDATE Test SET (Documentacion , Status) = (?, ?) WHERE IDTicket = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setString(1, Documento);
                        preparedStatement.setString(2, "In progress");
                        preparedStatement.setInt(3, NumTicket);

                        int filasAfectadas = preparedStatement.executeUpdate();

                        if (filasAfectadas > 0) {
                            System.out.println("Documento actualizado con éxito.");
                        } else {
                            System.out.println("No se pudo actualizar el documento.");
                        }
                    }
                    refrescardocumentacion();
                } else {
                    // El ticket no tiene estado "Not Started", mostrar mensaje
                    JOptionPane.showMessageDialog(null, "Este ticket no es nuevo, no se puede Re abrir.");
                }
            } else {
                // No se encontró el ticket en la base de datos
                JOptionPane.showMessageDialog(null, "No se encontró el ticket en la base de datos.");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_ReOpenBotonActionPerformed

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
    private javax.swing.JButton BuscarTicketBotton;
    private javax.swing.JButton CloseBoton;
    private javax.swing.JTextArea Docu;
    private javax.swing.JTextPane DocumentationPane;
    private javax.swing.JButton EscalatedBoton;
    private javax.swing.JButton InicioTicket;
    private javax.swing.JButton MenuBotton;
    private javax.swing.JButton PendingCustomerBoton;
    private javax.swing.JButton PendingVendorBoton;
    private javax.swing.JButton ReOpenBoton;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel TituloID;
    private javax.swing.JButton TshootBoton;
    private javax.swing.JButton ValidacionBoton;
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
