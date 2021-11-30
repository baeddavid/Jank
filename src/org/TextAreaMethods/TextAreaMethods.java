package org.TextAreaMethods;

import javax.swing.*;

import org.Jank;
import org.TextAreaClasses.Chunk;

import java.util.Stack;

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
    public static void undo() {

    }

    // Removing a chunk from a document
    public static void removeChunk(JTextArea textArea, Chunk undo) {
        textArea.replaceRange("", undo.getStartingIdx(), undo.getStartingIdx() + undo.getTextChunk().length());
    }
}
