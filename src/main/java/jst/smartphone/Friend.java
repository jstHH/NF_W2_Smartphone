package jst.smartphone;

public class Friend extends Contact{
    public int number;

    public Friend(String name, int number) {
        super(name);
        this.number = number;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
