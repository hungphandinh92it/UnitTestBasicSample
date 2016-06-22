package com.example.hungpd.unittestbasicsample;

import android.content.SharedPreferences;
import android.renderscript.Long2;

import java.util.Calendar;

/**
 * Created by hunga on 6/22/2016.
 */
public class SharedPreferencesHelper {

    static final String KEY_NAME = "key_name";
    static final String KEY_DOB = "key_dob_millis";
    static final String KEY_EMAIL = "key_email";

    private final SharedPreferences sharedPreferences;

    public SharedPreferencesHelper(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public boolean savePersonalInfo(SharedPreferenceEntry sharedPreferenceEntry) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_NAME, sharedPreferenceEntry.getName());
        editor.putLong(KEY_DOB, sharedPreferenceEntry.getDateOfBirth().getTimeInMillis());
        editor.putString(KEY_EMAIL, sharedPreferenceEntry.getEmail());
        return editor.commit();
    }

    public SharedPreferenceEntry getPersonalInfo() {
        String name = sharedPreferences.getString(KEY_NAME, "");
        Long dobMillis = sharedPreferences.getLong(KEY_DOB, Calendar.getInstance().getTimeInMillis());
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.setTimeInMillis(dobMillis);
        String email = sharedPreferences.getString(KEY_EMAIL, "");
        return new SharedPreferenceEntry(name, dateOfBirth, email);
    }

}
