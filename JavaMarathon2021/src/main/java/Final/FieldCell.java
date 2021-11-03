package Final;

public enum FieldCell {
    EMPTY(0, "⬜"),
    OREOL(-1, "\\uD83D\\uDFE6"),
    SHIP(100, "\\uD83D\\uDEE5"),
    DESTROYED(1, "\uD83D\uDFE5");


    private int value;
    private String sign;

    FieldCell(int value, String sign) {
        this.value = value;
        this.sign = sign;
    }
}
