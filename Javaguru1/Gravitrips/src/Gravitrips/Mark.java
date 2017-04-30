package Gravitrips;

public enum Mark {
    O("O"),
    X("X"),
    UNFILLED("_");

    private String mark;

    Mark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return this.mark;
    }
}
