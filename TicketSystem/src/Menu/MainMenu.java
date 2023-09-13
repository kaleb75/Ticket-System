package Menu;// Paquete que contiene la clase principal del menú (Package that contains the main class of the menu)

// Importar las bibliotecas necesarias (Import the necessary libraries)
import Tickets.CreateTicket; // Importar la clase CreateTicket (Import the CreateTicket class)
import Tickets.NotStarted;
import javax.swing.*; // Importar las clases Swing para la interfaz gráfica de usuario (GUI) (Import Swing classes for the graphical user interface (GUI))
import java.awt.*; // Importar las clases AWT para la gestión de la GUI (Import AWT classes for GUI management)
import java.awt.event.ActionEvent; // Importar la clase ActionEvent para manejar eventos (Import the ActionEvent class to handle events)
import java.awt.event.ActionListener; // Importar la clase ActionListener para escuchar eventos (Import the ActionListener class to listen to events)

// Clase principal para el menú principal de la aplicación (Main class for the application's main menu)
public class MainMenu {
    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de eventos de Swing (Run the application on the Swing event thread)
        SwingUtilities.invokeLater(() -> {
            MainMenu menu = new MainMenu(); // Crear una instancia de la clase MainMenu (Create an instance of the MainMenu class)
            menu.showMainMenu(); // Llamar al método showMainMenu() para mostrar el menú principal (Call the showMainMenu() method to display the main menu)
        });
    }

    // Método para mostrar el menú principal (Method to display the main menu)
    public void showMainMenu() {
        // Ejecutar la interfaz gráfica en el hilo de eventos de Swing (Run the GUI on the Swing event thread)
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menú Principal"); // Crear una ventana con título "Menú Principal" (Create a window with the title "Main Menu")
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer la acción de cierre al cerrar la ventana (Set the close action when closing the window)
            frame.setSize(400, 300); // Establecer el tamaño de la ventana (Set the window size)
            frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla (Center the window on the screen)

            // Panel principal para organizar componentes (Main panel to organize components)
            JPanel panel = new JPanel(); // Crear un panel (Create a panel)
            frame.add(panel); // Agregar el panel a la ventana (Add the panel to the window)
            panel.setLayout(new GridLayout(3, 1)); // Establecer el diseño de cuadrícula para organizar los componentes (Set a grid layout to organize components)

            // Botón para abrir NewTicket (Button to open NewTicket)
            JButton btnNewTicket = new JButton("New Ticket"); // Crear un botón con etiqueta (Create a button with label)
            panel.add(btnNewTicket); // Agregar el botón al panel (Add the button to the panel)

            // Botón para abrir NotStarted (documentado) (Button to open NotStarted (documented))
            JButton btnNotStarted = new JButton("Not Started"); // Crear un botón con etiqueta (Create a button with label)
            panel.add(btnNotStarted); // Agregar el botón al panel (Add the button to the panel)

            // Evento para el botón NewTicket (Event for the NewTicket button)
            btnNewTicket.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNewTicket(); // Llamar al método abrirNewTicket() cuando se haga clic en el botón (Call the abrirNewTicket() method when the button is clicked)
                    frame.dispose(); // Cerrar la ventana del menú principal (Close the main menu window)
                }
            });

            // Evento para el botón NotStarted (Event for the NotStarted button)
            btnNotStarted.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNotStarted(); // Llamar al método abrirNotStarted() cuando se haga clic en el botón (Call the abrirNotStarted() method when the button is clicked)
                    frame.dispose();
                }
            });

            frame.setVisible(true); // Hacer visible la ventana del menú principal (Make the main menu window visible)
        });
    }

    // Método para abrir la clase NewTicket (Method to open the NewTicket class)
    private void abrirNewTicket() {
        // Aquí puedes implementar la lógica para abrir la clase CreateTicket (Here you can implement the logic to open the CreateTicket class)
        JOptionPane.showMessageDialog(null, "Abriendo la clase NewTicket"); // Mostrar un mensaje de diálogo (Show a dialog message)
        CreateTicket ir = new CreateTicket(); // Crear una instancia de la clase CreateTicket (Create an instance of the CreateTicket class)
        ir.setVisible(true); // Hacer visible la ventana de CreateTicket (Make the CreateTicket window visible)
        return; // Salir del método (Exit the method)
    }

    // Método para abrir la clase NotStarted (documentada) (Method to open the NotStarted (documented) class)
    private void abrirNotStarted() {
        // Documenta la lógica para abrir la clase NotStarted cuando esté disponible (Document the logic to open the NotStarted class when available)
        JOptionPane.showMessageDialog(null, "Abriendo Lista de NotStarted"); // Mostrar un mensaje de diálogo (Show a dialog message)
        NotStarted ir = new NotStarted();
        ir.show(true);
        return;
        
    }
}