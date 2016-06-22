package com.example.hungpd.unittestbasicsample;

import java.util.Calendar;

/**
 * Created by hunga on 6/22/2016.
 */
public class SharedPreferenceEntry {

    private final String name;

    private final Calendar dateOfBirth;

    private final String email;

    public SharedPreferenceEntry(String name, Calendar dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}
