package dev.randomcode.calculator;

public enum AngleMode {
    DEGREES("Degrees"),
    RADIANS("Radians");

    private String text;
    private AngleMode(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
