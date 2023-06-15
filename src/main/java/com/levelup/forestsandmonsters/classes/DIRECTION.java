package com.levelup.forestsandmonsters.classes;

public enum DIRECTION {
    N(-1),
    S(1),
    E(1),
    W(-1);

    private final int value;

    DIRECTION(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
