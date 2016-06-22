package com.example.hungpd.unittestbasicsample;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Assert;
import org.junit.Test;


import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by hunga on 6/22/2016.
 */
@SmallTest
public class EmailValidatorTest {

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@mail.com"));
    }

    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"));
    }

    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@email"));
    }

    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@email..com"));
    }

    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("@email.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnFalse(){
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail(null));
    }

}
