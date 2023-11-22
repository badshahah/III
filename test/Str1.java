/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import str.Str; 
/**
 *
 * @author Adison
 */
public class Str1 {
    
    public Str1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   @Test
    public void testMatchingStringLength() {
        String inputString = "Ferdous";
        int targetLength = 7;

        boolean isMatch = Str.Match(inputString, targetLength);
        assertTrue(isMatch);
    }

    @Test
    public void testNonMatchingStringLength() {
        String inputString = "Apurba";
        int targetLength = 6;

        boolean isMatch = Str.Match(inputString, targetLength);
        assertFalse(isMatch);
    }

    @Test
    public void testEmptyStringLength() {
        String inputString = "";
        int targetLength = 0;

        boolean isMatch = Str.Match(inputString, targetLength);
        assertTrue(isMatch);
    }
}

