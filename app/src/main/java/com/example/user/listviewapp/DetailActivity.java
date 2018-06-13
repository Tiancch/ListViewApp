package com.example.user.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    TextView mTextViewbar;
    ImageView mImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTextViewbar = (TextView) findViewById(R.id.textViewBar2);
        mImageView = (ImageView) findViewById(R.id.imageView2);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null){
           mTextViewbar.setText(mBundle.getString("countryName"));
           mImageView.setImageResource(mBundle.getInt("countryFlag"));
        }
    }
}
