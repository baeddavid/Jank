package org.Keybinds.ActionList.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import org.TextAreaMethods.TextAreaMethods;

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
    public static Action copy() {
        Action copy = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Copy");
            }
        };
        return copy;
    }

    // Cut action
    public static Action cut() {
        Action cut = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cut");
            }
        };
        return cut;
    }

    // Paste action
    public static Action paste() {
        Action paste = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Paste");
            }
        };
        return paste;
    }

    // Undo action
    public static Action undo() {
        Action undo = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Undo");
            }
        };
        return undo;
    }

    // Redo action
    public static Action redo() {
        Action redo = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Redo");
            }
        };
        return redo;
    }

    public static List<KeyActionPair> generateActionList() {
        List<KeyActionPair> keyActionPairList = new ArrayList<>();
        keyActionPairList.add(new KeyActionPair("sayHi", sayHi()));
        return keyActionPairList;
    }
}
