package Menu; // Asegúrate de que la clase esté en el paquete correcto

import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {
         MainMenu ir = new MainMenu();
         
      //  MainMenu.main(args); // Llama al método main de MainMenu

    }
    
   public void setVisible(boolean b) {
        MainMenu ir = new MainMenu();
        
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menú Principal"); // Título del JFrame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar el JFrame
            frame.setSize(400, 300); // Tamaño del JFrame (ancho x alto)
            frame.setLocationRelativeTo(null);
            
            // Puedes agregar componentes (botones, etiquetas, etc.) al JFrame aquí
            
            frame.setVisible(true); // Hacer visible el JFrame
        });
   }
}
