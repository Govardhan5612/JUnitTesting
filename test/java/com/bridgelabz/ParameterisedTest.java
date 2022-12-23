package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Govardhan Reddy
 */

@RunWith(Parameterized.class)
public class ParameterisedTest {
    String actual;
    Boolean expect;
    RegularExpression regex;

    @Before
    public void initialize() {
        regex = new RegularExpression();
    }

    public ParameterisedTest(String actual, Boolean expect) {
        this.actual = actual;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection emails() {
        RegularExpression regex = new RegularExpression();
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com,", true},
                {"abc-100@yahoo.com,", true},
                {"abc.100@yahoo.com", true},
                {"abc+100@gmail.com", true},
                {"abc111@abc.com,", true},
                {"abc-100@abc.net,", true},
                {"abc@1.com,", true},
                {"abc@gmail.com.com", true}
        });
    }

    @Test
    public void test_email() {
        System.out.println(actual);
        RegularExpression regex = new RegularExpression();
        assertEquals(true, regex.emailSamples(actual));
    }

}