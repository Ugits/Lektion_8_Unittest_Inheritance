package com.jonas.test;

import com.jonas.unittest.Student;
import org.junit.jupiter.api.Test;


import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

// TODO: 2023-10-05
// This is our test class
class StudentTest {

    @Test
    public void myTest() {
        Student benny = new Student("Benny", 5, true);
        Student frida = null;
        assertEquals(benny.name, "Benny");
        assertNotNull(benny);
    }

}