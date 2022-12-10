package az.ikt.exercises;


public enum TestEnum {
    ACTIVE(1),
    NOT_ACTIVE(0);

private final int code;

    TestEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
