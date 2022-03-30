package jst.smartphone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Smartphone implements Radio, GPS {
    String conductor;
    String modell;
    Contact[] contacts;

    public Smartphone() {
    }

    public Smartphone(String conductor, String modell, Contact[] contacts) {
        this.conductor = conductor;
        this.modell = modell;
        this.contacts = contacts;
    }

    public void addContacts(Contact contact) {
        contacts = Arrays.copyOf(contacts, contacts.length + 1);
        contacts[contacts.length - 1] = contact;
    }

    public Contact getContact(int index) {
        return contacts[index];
    }

    public Contact getContactByName(String name) {
        for (int i = 0; i <= contacts.length - 1; i++) {
            if (contacts[i].getName().equals(name)) {
                return contacts[i];
            }
        }
        return null;
    }

    void removeContactByName(String name) {
        boolean foundContact = false;
        for (int i = 0; i <= contacts.length - 1; i++) {
            if (contacts[i].getName().equals(name)) {
                contacts[i] = contacts[contacts.length - 1];
                contacts = Arrays.copyOf(contacts, contacts.length - 1);
                foundContact = true;
            }
        }
        if (!(foundContact)) {
            System.out.println("Kontakt nicht gefunden.");
        }
    }


    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "conductor='" + conductor + '\'' +
                ", modell='" + modell + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
