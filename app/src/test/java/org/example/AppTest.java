package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void studentObjectShouldBeCreated() {
        Student student = new Student(1, "Abhishek");
        assertNotNull(student);
    }
}
