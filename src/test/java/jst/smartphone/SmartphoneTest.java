package jst.smartphone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Contact contact1 = new Friend("Hans", 123);
    Contact contact2 = new Friend("Peter", 456);
    Contact contact3 = new Friend("Klaus", 789);
    Contact[] contactArray = {contact1, contact2, contact3};
    Smartphone testPhone = new Smartphone("Samsung", "Galaxy", contactArray);


    @Test
    void removeContactByName() {
        Contact[] expectedArray = {contact1, contact3};

        testPhone.removeContactByName("Peter");
        assertArrayEquals(expectedArray, testPhone.getContacts());
    }


    @Test
    void getContactByName() {
        assertEquals(contact1, testPhone.getContactByName("Hans"));
    }
}