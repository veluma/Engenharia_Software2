package com.es2.decorator;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class TestDecorator {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.setOut(System.out);
        End e = new End();
    }

    @Test
    void testRightAuthWithoutDecorators() throws AuthException, IOException {
        AuthInterface auth = new Auth();

        auth.auth("admin", "admin");
    }

     @Test
    void WrongAuthWithoutDecorators() {
        AuthInterface auth = new Auth();

        assertThrows(AuthException.class, ()-> auth.auth("Error", "Error"));
    }

     @Test
    void LoggingDecorator() throws AuthException, IOException {
        AuthInterface auth = new Logging(new Auth());

        auth.auth("admin", "admin");
        assertTrue(outContent.toString().contains("auth()"));
    }

     @Test
    void CommonWordsDecorator() throws AuthException, IOException {
        AuthInterface auth = new CommonWordsValidator(new Auth());

        auth.auth("admin", "admin");
    }

     @Test
    void FalseCommonWordsDecorator() {
        AuthInterface auth = new CommonWordsValidator(new Auth());

        assertThrows(AuthException.class,()-> auth.auth("admin1", "admin1"));
    }

     @Test
    void LoggingCommonWordsDecorator() throws AuthException, IOException {
        AuthInterface auth = new CommonWordsValidator(new Logging(new Auth()));

        auth.auth("admin", "admin");
    }

}