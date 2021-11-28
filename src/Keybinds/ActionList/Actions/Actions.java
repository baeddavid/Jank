package Keybinds.ActionList.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

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

    // Undo action

    // Redo action

    public static List<KeyActionPair> generateActionList() {
        List<KeyActionPair> keyActionPairList = new ArrayList<>();
        keyActionPairList.add(new KeyActionPair("sayHi", sayHi()));
        return keyActionPairList;
    }
}
