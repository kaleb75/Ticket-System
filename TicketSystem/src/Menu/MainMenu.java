package Menu;

import javax.swing.*;

public class MainMenu {
    public void showMainMenu() {
        MainMenu ir = null;
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menú Principal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            
            // Puedes agregar componentes (botones, etiquetas, etc.) al JFrame aquí
            
            frame.setVisible(true);
        });
    }
}