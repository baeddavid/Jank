package org.TextAreaMethods;

import javax.swing.*;

import org.Jank;
import org.TextAreaClasses.UndoData;

public class TextAreaMethods {

    // Copy method
    public static void copy(JTextArea textArea) {
        Jank.clipboard = textArea.getSelectedText();
    }

    // Paste method
    public static void paste(JTextArea textArea, String clipboard) {
        textArea.replaceSelection(clipboard);
    }

    // Cut method
    public static void cut(JTextArea textArea) {
        Jank.clipboard = textArea.getSelectedText();
        textArea.replaceSelection("");
    }

    // Undo method
    public static void redo(JTextArea textArea, UndoData undoData) {
        if(undoData == null) { return; }
        textArea.replaceRange(undoData.getUndoText(), 0, textArea.getText().length());
    }

    // Removing a chunk from a document
    public static void undo(JTextArea textArea, UndoData undoData) {
        if(undoData == null) { return; }
        textArea.replaceRange(undoData.getUndoText() , 0, textArea.getText().length());
    }

    // New Window
    public static void newWindow() {
        Jank jank = new Jank();
    }
}
