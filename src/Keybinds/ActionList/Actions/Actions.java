package Keybinds.ActionList.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Actions {
    public static Action sayHi() {
        Action sayHi = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        };
        return sayHi;
    }

    public static List<KeyActionPair> generateActionList() {
        List<KeyActionPair> keyActionPairList = new ArrayList<>();
        keyActionPairList.add(new KeyActionPair("sayHi", sayHi()));
        return keyActionPairList;
    }
}
