package com.example.activitycount;

import android.content.Context;

public class ActivityCounter {
    //Declared Instance Variable
    private int counter;
    private SharedPreference sharedPreference;
    private Context context;

    public ActivityCounter(Context context) {
        this.context = context;
        //Creating Object
        sharedPreference = SharedPreference.getInstance(context);
    }

    //For increase the counter and saving local
    public void increaseCount() {
        counter = sharedPreference.getData(SharedPreference.COUNTER);
        counter++;
        sharedPreference.saveData(SharedPreference.COUNTER, counter);
    }

    //For accessing the Counter
    public int getCounter() {
        return counter;
    }

}
