package jst.smartphone;

public class BuisnessContact extends Contact{
    String company;

    public BuisnessContact() {
    }

    public BuisnessContact(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "BuisnessContact{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
