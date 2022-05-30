package com.blackghost.extendedcontrolsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.blackghost.extendedcontrols.ArcSlider;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArcSlider arcSlider = findViewById(R.id.ArcSlider);
        arcSlider.setOnChangeListener(new ArcSlider.OnChangeListener() {
            @Override
            public void onStartTrackingTouch(ArcSlider view) {

            }

            @Override
            public void onProgressChanged(ArcSlider view, int progress, boolean fromUser) {
                //Log.d(TAG, "progress: " + progress);
            }

            @Override
            public void onStopTrackingTouch(ArcSlider view) {
                Log.d(TAG, "onStopTrackingTouch");
                Log.d(TAG, "progress: " + view.getProgress());


                arcSlider.setLabelPosition(view.getProgress());
            }
        });

        arcSlider.setProgress(90);
    }
}