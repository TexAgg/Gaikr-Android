package com.example.mgaik.gaikr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class GaikrActivity extends AppCompatActivity {
    // Declare our view variables

    private Button mNextButton;
    private Button mPrevButton;
    private FrameLayout mImgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gaikr_activity_main);
    }
}
