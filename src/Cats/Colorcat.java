package Cats;

public enum Colorcat {
    BLACK,
    WHITE,
    GREEN,
    ORANGE,
    BROWN;

    public static Colorcat getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
