package org.Keybinds;

import javax.swing.*;
import org.Keybinds.ActionList.*;

public class Keybinds {
    public static void generateKeybind(JTextArea textArea, int key, int modifier, String actionName) {
        Action action = ActionList.getAction(actionName);

        textArea.getInputMap().put(KeyStroke.getKeyStroke(key, modifier), actionName);
        textArea.getActionMap().put(actionName, action);

    }
}
