package az.ikt.exercises.smallapp.model;

public enum Sql {

    FIND_MAX_PERSONID("select max(id) as max_id from person;"),
    FIND_MAX_USERID("select max(id) from users");

    private final String value;

    Sql(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

