package Keybinds.ActionList;

import javax.swing.*;
import java.util.List;
import Keybinds.ActionList.Actions.*;

public class ActionList {
    public static List<Action> getActionList() {
        return Actions.generateActionList();
    }

    public static Action getAction(String actionName) {
        List<Action> actionList = getActionList();
        for(Action action : actionList) {
            if(actionName == action.toString()) {
                return action;
            }
        }
        System.out.println("NuLL FUCK");
        return null;
    }
}
