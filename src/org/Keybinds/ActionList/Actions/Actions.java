package org.Keybinds.ActionList.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import org.TextAreaClasses.UndoData;
import org.TextAreaMethods.TextAreaMethods;
import org.Jank;

public class Actions {
    // Test action to see if it's properly being passed into the KeyActionPair list
    public static Action sayHi() {
        Action sayHi = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!!!");
            }
        };
        return sayHi;
    }

    // Copy action
    public static Action copyAction() {
        Action copy = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextAreaMethods.copy(Jank.textArea);
            }
        };
        return copy;
    }

    // Cut action
    public static Action cutAction() {
        Action cut = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextAreaMethods.cut(Jank.textArea);
            }
        };
        return cut;
    }

    // Paste action
    public static Action pasteAction() {
        Action paste = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextAreaMethods.paste(Jank.textArea, Jank.clipboard);
            }
        };
        return paste;
    }

    // Undo action
    public static Action undo() {
        Action undo = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextAreaMethods.removeChunk(Jank.textArea, Jank.timeLine.undoState());
            }
        };
        return undo;
    }

    // Redo action
    public static Action redo() {
        Action redo = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextAreaMethods.redo(Jank.textArea, Jank.timeLine.redoState());
            }
        };
        return redo;
    }

    public static List<KeyActionPair> generateActionList() {
        List<KeyActionPair> keyActionPairList = new ArrayList<>();
        keyActionPairList.add(new KeyActionPair("sayHi", sayHi()));
        keyActionPairList.add(new KeyActionPair("copyAction", copyAction()));
        keyActionPairList.add(new KeyActionPair("pasteAction", pasteAction()));
        keyActionPairList.add(new KeyActionPair("cutAction", cutAction()));
        keyActionPairList.add(new KeyActionPair("undoAction", undo()));
        keyActionPairList.add(new KeyActionPair("redoAction", redo()));
        return keyActionPairList;
    }
}
