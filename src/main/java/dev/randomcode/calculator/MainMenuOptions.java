package dev.randomcode.calculator;

public enum MainMenuOptions {
    SINGLE_OPERATION("Single operation"),
    FUNCTION("Function"),
    EXPRESSION("Mathematical expression (infix notation)"),
    TOGGLE_ANGLE_MODE("Set degrees or radians");

    private String text;
    private MainMenuOptions(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
};
