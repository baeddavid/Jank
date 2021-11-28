package Keybinds;

import javax.swing.*;
import Keybinds.ActionList.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Keybinds {
    public static JTextArea generateKeybind(JTextArea textArea, int key, int modifier, String actionName) {
        Action action = ActionList.getAction(actionName);

        textArea.getInputMap().put(KeyStroke.getKeyStroke(key, modifier), actionName);
        textArea.getActionMap().put(actionName, action);

        return textArea;
    }


}
