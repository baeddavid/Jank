package Keybinds.ActionList.Actions;

import javax.swing.*;

public class KeyActionPair {
    private String key;
    private Action action;

    public KeyActionPair(String key, Action action) {
        this.key = key;
        this.action = action;
    }

    public Action getAction() {
        return action;
    }

    public String getKey() {
        return key;
    }
}
