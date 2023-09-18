

import javax.swing.*;
import java.awt.*;

public class TicketDocumentationUI extends JFrame {
    private JLabel titleLabel;
    private JComboBox<String> ticketComboBox;
    private JTextArea documentationTextArea;
    private JButton addImageButton;
    private JButton addFileButton;
    private JButton editStatusButton;
    private JTextField estimatedTimeField;
    private JTextArea notesTextArea;
    private JButton saveButton;

    public TicketDocumentationUI() {
        initializeUI();
    }

    private void initializeUI() {
        // Configurar la ventana principal
        setTitle("Documentación de Ticket");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes de la interfaz
        titleLabel = new JLabel("Seleccionar Ticket:");
        ticketComboBox = new JComboBox<>();
        documentationTextArea = new JTextArea(10, 40);
        addImageButton = new JButton("Agregar Imagen");
        addFileButton = new JButton("Agregar Archivo");
        editStatusButton = new JButton("Editar Estatus");
        estimatedTimeField = new JTextField(10);
        notesTextArea = new JTextArea(5, 40);
        saveButton = new JButton("Guardar Cambios");

        // Agregar componentes al panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel middlePanel = new JPanel(new GridLayout(2, 2));
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        topPanel.add(titleLabel);
        topPanel.add(ticketComboBox);
        middlePanel.add(documentationTextArea);
        middlePanel.add(addImageButton);
        middlePanel.add(addFileButton);
        middlePanel.add(editStatusButton);
        middlePanel.add(new JLabel("Tiempo Estimado:"));
        middlePanel.add(estimatedTimeField);
        bottomPanel.add(notesTextArea);
        bottomPanel.add(saveButton);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicketDocumentationUI ui = new TicketDocumentationUI();
            ui.setVisible(true);
        });
    }
}
