package org.Keybinds.ActionList;

import javax.swing.*;
import java.util.List;
import org.Keybinds.ActionList.Actions.*;

public class ActionList {
    public static List<KeyActionPair> getActionList() {
        List<KeyActionPair> a = Actions.generateActionList();
        return Actions.generateActionList();
    }

    public static Action getAction(String actionName) {
        List<KeyActionPair> actionList = getActionList();
        for(KeyActionPair keyActionPair : actionList) {
            if(actionName.equals(keyActionPair.getKey())) {
                return keyActionPair.getAction();
            }
        }
        return null;
    }
}
