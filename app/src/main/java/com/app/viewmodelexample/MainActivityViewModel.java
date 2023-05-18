package com.app.viewmodelexample;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String myRandomNumber;
    String TAG= this.getClass().getSimpleName();

    public String getMyRandomNumber()
    {
        if (myRandomNumber==null)
        {
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber() {
        Random random=new Random();
        myRandomNumber= "Number: "+(random.nextInt(10-1)+1);
    }


    @Override
    protected void onCleared() {
        super.onCleared();

        Log.d(TAG,"OnCleared: ViewModel Destroy");
    }
}
