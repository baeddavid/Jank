package org.TextAreaMethods;

import javax.swing.*;

import org.Jank;

public class TextAreaMethods {

    // Copy method
    public static void copy(JTextArea textArea) {
        Jank.clipboard = textArea.getSelectedText();
    }

    // Paste method
    public static void paste(JTextArea textArea, String clipboard) {
        textArea.replaceSelection(clipboard);
    }
}
