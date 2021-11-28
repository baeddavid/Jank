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
                System.out.println("Hello");
            }
        };
        return sayHi;
    }

    public static List<Action> generateActionList() {
        List<Action> actionList = new ArrayList<>();
        actionList.add(sayHi());
        return actionList;
    }
}
