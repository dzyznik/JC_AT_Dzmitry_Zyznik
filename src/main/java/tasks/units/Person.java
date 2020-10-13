package main.java.tasks.units;

import org.testing.annotations.*;

import static org.testing.AssertJUnit.*;

public class PersonNgTest {

    @Test
    public void personAgeTest() {
        Person person = new Person(25);
        assertEquals("Person age is not expected!", person.getAge(), 25);
    }

    @Test
    public void personFailTest() {
        Person person = new Person(26);
        assertEquals("Person age is not expected!", person.getAge(), 25);
    }


    public int getAge() {
        return this.age;
    }
}
