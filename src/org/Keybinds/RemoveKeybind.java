package org.Keybinds;

import javax.swing.*;

public class RemoveKeybind {
    public static void removeKeybind(JTextArea textArea, int key, int modifier) {
        textArea.getInputMap().put(KeyStroke.getKeyStroke(key, modifier), "none");
    }
}
