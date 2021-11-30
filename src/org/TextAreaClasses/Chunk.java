package org.TextAreaClasses;

public class Chunk {
    private final String textChunk;
    private final Integer startingIdx;

    public Chunk(String textChunk, Integer startingIdx) {
        this.textChunk = textChunk;
        this.startingIdx = startingIdx;
    }

    public boolean chunkEquals(Chunk pattern) {
        return getTextChunk().equals(pattern.getTextChunk());
    }

    public Integer getStartingIdx() {
        return startingIdx;
    }

    public String getTextChunk() {
        return textChunk;
    }
}
