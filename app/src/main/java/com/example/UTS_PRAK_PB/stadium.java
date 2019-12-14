package com.example.UTS_PRAK_PB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.UTS_PRAK_PB.R;

public class stadium extends AppCompatActivity {
    private Intent googleMapIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);

        this.initialize();
    }

    private void initialize() {
        googleMapIntent = new Intent(Intent.ACTION_VIEW);
        googleMapIntent.setData(Uri.parse("geo:0,0?q=le 1 Warriors Way, San Francisco"));
        this.startActivity(googleMapIntent);

    }
}
