package com.bridgelabz;

import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

/**
 * @author Govardhan Reddy
 */

public class RegularExpressionTest {
    /**
     * Test the all user details
     */
    RegularExpression regex = new RegularExpression();

    @Test
    public void testFirstName() {
        String firstName = "Govardhan";
        boolean status = regex.firstName(firstName);
        assertTrue(status);
    }

    @Test
    public void testLastName() {
        String lastName = "Reddy";
        boolean status = regex.lastName(lastName);
        assertTrue(status);
    }

    @Test
    public void test_email() {
        String email = "abc.xyz@bl.co.in";
        boolean status = regex.email(email);
        assertTrue(status);
    }

    @Test
    public void testMobileNumber() {
        String mobileNumber = "91 9123456987";
        boolean status = regex.mobileNumber(mobileNumber);
        assertTrue(status);
    }

    @Test
    public void testPassword() {
        String passsword = "Muni@12345";
        boolean status = regex.password(passsword);
        assertTrue(status);
    }

    @Parameterized.Parameters
    public void teat_emailSamples() {
        String[] emails = {"abc@yahoo.com,", "abc-100@yahoo.com,", "abc.100@yahoo.com", "abc+100@gmail.com", "abc111@abc.com,", "abc-100@abc.net,", "abc-100@abc.net,", "abc@1.com,", "abc@gmail.com.com"};
        for (int i =0;i<emails.length;i++){
            assertTrue(regex.emailSamples(emails[i]));
        }
    }

}