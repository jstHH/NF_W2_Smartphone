package jst.smartphone;

public abstract class Contact {
    protected String name;

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
