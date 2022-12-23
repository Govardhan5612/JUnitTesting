package com.bridgelabz;

import org.junit.Test;
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

}