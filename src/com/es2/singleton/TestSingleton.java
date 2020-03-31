package com.es2.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;


public class TestSingleton {

    @BeforeEach
    void setUp() {
    }

    @AfterAll
    static void tearDown() {
        End e = new End();
    }

    @Test
    public void TestCorrectPath()  {
        Registry.getInstance().setPath("teste");
        assertEquals("teste", Registry.getInstance().getPath());
    }

    @Test
    public void setConnectionStringCorrectPath()  {
        Registry.getInstance().setConnectionString("teste");
        assertEquals("teste", Registry.getInstance().getConnectionString());
    }

    @Test
    public void testNullValue()  {
        Registry.getInstance().setPath(null);
        assertNull(Registry.getInstance().getPath());
    }

    @Test
    public void getConnectionNullValue()  {
        Registry.getInstance().setConnectionString(null);
        assertNull(Registry.getInstance().getConnectionString());
    }

    @Test
    public void singleton_CheckConstructorTrue() throws NoSuchMethodException, SecurityException {
        assertTrue(Modifier.isPrivate(Registry.class.getDeclaredConstructor().getModifiers()));
    }


}