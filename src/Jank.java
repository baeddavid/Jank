import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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

        textArea = new JTextArea();

        // Create menubar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu for the menubar
        JMenu menuOne = new JMenu("File");

        // Create menu items
        JMenuItem menuItem1 = new JMenuItem("New");
        JMenuItem menuItem2 = new JMenuItem("Open");
        JMenuItem menuItem3 = new JMenuItem("Save");
        JMenuItem menuItem9 = new JMenuItem("Print");

        // Add action listeners

        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem9.addActionListener(this);

        // Add menuItems to menuOne
        menuOne.add(menuItem1);
        menuOne.add(menuItem2);
        menuOne.add(menuItem3);
        menuOne.add(menuItem9);

        // Create secondary menu for the drop down
        JMenu menuTwo = new JMenu("Edit");

        // Create menu items
        JMenuItem menuItem4 = new JMenuItem("cut");
        JMenuItem menuItem5 = new JMenuItem("copy");
        JMenuItem menuItem6 = new JMenuItem("paste");

        // Add action listeners
        menuItem4.addActionListener(this);
        menuItem5.addActionListener(this);
        menuItem6.addActionListener(this);

        menuTwo.add(menuItem4);
        menuTwo.add(menuItem5);
        menuTwo.add(menuItem6);

        // Add to menubar
        menuBar.add(menuOne);
        menuBar.add(menuTwo);

        // Set the menu bars
        frame.setJMenuBar(menuBar);
        frame.add(textArea);
        frame.setSize(750,750);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if (s.equals("cut")) {
            textArea.cut();
        }
        else if (s.equals("copy")) {
            textArea.copy();
        }
        else if (s.equals("paste")) {
            textArea.paste();
        }
        else if (s.equals("Save")) {
            // Create an object of JFileChooser class
            JFileChooser j = new JFileChooser("f:");

            // Invoke the showsSaveDialog function to show the save dialog
            int r = j.showSaveDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {

                // Set the label to the path of the selected directory
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                    // Create a file writer
                    FileWriter wr = new FileWriter(fi, false);

                    // Create buffered writer to write
                    BufferedWriter w = new BufferedWriter(wr);

                    // Write
                    w.write(textArea.getText());

                    w.flush();
                    w.close();
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(frame, evt.getMessage());
                }
            }
            // If the user cancelled the operation
            else
                JOptionPane.showMessageDialog(frame, "the user cancelled the operation");
        }
        else if (s.equals("Print")) {
            try {
                // print the file
                textArea.print();
            }
            catch (Exception evt) {
                JOptionPane.showMessageDialog(frame, evt.getMessage());
            }
        }
        else if (s.equals("Open")) {
            // Create an object of JFileChooser class
            JFileChooser j = new JFileChooser("f:");

            // Invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);

            // If the user selects a file
            if (r == JFileChooser.APPROVE_OPTION) {
                // Set the label to the path of the selected directory
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                    // String
                    String s1 = "", sl = "";

                    // File reader
                    FileReader fr = new FileReader(fi);

                    // Buffered reader
                    BufferedReader br = new BufferedReader(fr);

                    // Initialize sl
                    sl = br.readLine();

                    // Take the input from the file
                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }

                    // Set the text
                    textArea.setText(sl);
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(frame, evt.getMessage());
                }
            }
            // If the user cancelled the operation
            else
                JOptionPane.showMessageDialog(frame, "the user cancelled the operation");
        }
        else if (s.equals("New")) {
            textArea.setText("");
        }
        else if (s.equals("close")) {
            frame.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Jank jank = new Jank();
    }
}