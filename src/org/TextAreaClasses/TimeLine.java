package org.TextAreaClasses;

import org.Jank;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class TimeLine {
    private LinkedList<UndoData> timeLine;
    private int currentState;

    public TimeLine() {
        timeLine = new LinkedList<>();
        currentState = -1;
    }

    public void initialize() {
        currentState++;
        timeLine.add(new UndoData(""));
    }

    public void addState(UndoData insertState) {
        currentState++;
        timeLine.add(currentState, insertState);
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

    public UndoData redoState() {
        currentState++;
        return timeLine.get(currentState);
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

    public boolean contains(String pattern) {
        ListIterator <UndoData> iterator = timeLine.listIterator();
        while(iterator.hasNext()) {
            UndoData undo = iterator.next();
            if(undo.getUndoText().equals(pattern)) {
                return true;
            }
        }
        return false;
    }
}
