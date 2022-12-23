package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author GovardhanReddy
 */
public class RegularExpression {
    Scanner input = new Scanner(System.in);

    public boolean firstName(String firstName) {
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        return status;
    }

    public boolean lastName(String lastName) {
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
        return status;
    }

    public boolean mobileNumber(String mobileNumber) {
        boolean status = Pattern.compile("[0-9]{1,3}[\\s]{1}[7-9]{1}[0-9]{9}").matcher(mobileNumber).matches();
        return status;
    }

    public boolean email(String email) {
        boolean status = Pattern.compile("[a-z]{3,}[.]{1}[a-z]{0,}[@]{1}[a-z]{2,}[.]{1}[co]{2}[.]{1}[in]{0,2}").matcher(email).matches();
        return status;
    }

    public boolean password(String password) {
        boolean status = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&*]).{8,}$").matcher(password).matches();
        return status;
    }
}
