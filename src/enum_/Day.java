package enum_;

public enum Day {

    Monday(1), Tuesday(2);

    int value;

    Day(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
