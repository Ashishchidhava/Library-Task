package com.example.activitycount;

import android.content.Context;
import android.content.SharedPreferences;

//For storing the counter locally
public class SharedPreference {
    //Declared Instance Variable
    public static String COUNTER="counter";
    private static SharedPreference sharedPreference;
    private SharedPreferences sharedPreferences;

    //Creating Singleton
    public static SharedPreference getInstance(Context context) {
        if (sharedPreference == null) {
            sharedPreference = new SharedPreference(context);
        }
        return sharedPreference;
    }

    private SharedPreference(Context context) {
        sharedPreferences = context.getSharedPreferences("counter_db",Context.MODE_PRIVATE);
    }

    //Storing the data
    public void saveData(String key,int value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putInt(key, value);
        prefsEditor.commit();
    }

    //Getting the data
    public int getData(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getInt(key, 0);
        }
        return 0;
    }
}