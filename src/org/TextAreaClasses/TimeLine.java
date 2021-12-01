package org.TextAreaClasses;

import org.Jank;

import java.util.ArrayList;
import java.util.List;

public class TimeLine {
    private List<UndoData> timeLine;
    private int currentState;

    public TimeLine() {
        timeLine = new ArrayList<>();
        currentState = -1;
    }

    public void addState(UndoData insertState) {
        currentState++;
        timeLine.add(insertState);
    }

    public UndoData currentState() {
        return timeLine.get(currentState);
    }

    public UndoData undoState() {
        currentState--;
        return timeLine.get(currentState);
    }

    public UndoData get(int i) {
        return timeLine.get(i);
    }

    public UndoData redo() {
        return timeLine.get(++currentState);
    }

    public UndoData getLast() {
        if(isEmpty()) { return null; }
        return timeLine.get(timeLine.size() - 1);
    }

    public boolean isEmpty() {
        return timeLine.size() == 0;
    }

    public int size() {
        return timeLine.size();
    }

    public int getCurrentState() {
        return currentState;
    }
}
