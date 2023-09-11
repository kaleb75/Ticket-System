/*package Tickets;
        import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Documentacion extends JFrame {
    private JTextPane editorPane;

    public Document() {
        setTitle("Editor de Documentos HTML");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Establecer el tamaño de la ventana para que ocupe toda la pantalla
        setSize(screenWidth, screenHeight);

        editorPane = new JTextPane();
        editorPane.setContentType("text/html");
        JScrollPane scrollPane = new JScrollPane(editorPane);

        JButton saveButton = new JButton("Guardar");

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDocumento();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void guardarDocumento() {
        String htmlText = editorPane.getText();
        // Aquí puedes guardar el contenido HTML en un archivo o en una base de datos, según tus necesidades.
        // También puedes implementar la funcionalidad de guardar imágenes y enlaces.

        JOptionPane.showMessageDialog(this, "Documento HTML guardado exitosamente.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HTMLDocumentEditor editor = new HTMLDocumentEditor();
            editor.setVisible(true);
        });
    }
}
*/