package com.example.UTS_PRAK_PB;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class galeri extends AppCompatActivity {
    ViewFlipper idflipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
        viwflip();
    }

    public void viwflip()
    {

        Animation anim_in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);

        Animation anim_out = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        ViewFlipper idflipper = (ViewFlipper)findViewById(R.id.idflipper)
                ;
        idflipper.setAnimation(anim_in);
        idflipper.setAnimation(anim_out);
        idflipper.setFlipInterval(3000);
        idflipper.startFlipping();
    }
}

