package com.app.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtText;
    Button btn;
    String TAG= this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtText=findViewById(R.id.txt_text);
        btn=findViewById(R.id.button);

        //ViewModel Initialization
        MainActivityViewModel viewModel=new ViewModelProvider(this).get(MainActivityViewModel.class);
        String myRandomNumber=viewModel.getMyRandomNumber();
        txtText.setText(myRandomNumber);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnCleared: Activity Destroy");
    }
}