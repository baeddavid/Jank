import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.event.ActionListener;

public class Jank extends JFrame implements ActionListener {
    // Text component
    static JTextArea textArea;

    // Frame for the editor
    static JFrame frame;

    // Constructor
    public Jank() {
        frame = new JFrame("Jank");
        // Placeholder UI
        try {
            // Set metal look and feel
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

            // Set theme to ocean
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}