package com.example.UTS_PRAK_PB;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class PlayerProfile extends FragmentActivity implements View.OnClickListener{
    Button btnHome,btnAbout,btnExit;
    Home home;
    About about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba2);

        btnHome=(Button)findViewById(R.id.home);
        btnAbout=(Button)findViewById(R.id.about);
        btnExit=(Button)findViewById(R.id.exit);


        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnExit.setOnClickListener(this);

    }

    void mHome(){
     FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
     home=new Home();
     fTrans.replace(R.id.container,home);
     fTrans.commit();

    }
    void mHomee(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        about=new About();
        fTrans.replace(R.id.container,about);
        fTrans.commit();

    }

    public void onClick(View v){

        if (v==btnHome)
            mHome();
        if (v==btnAbout)
            mHomee();
        if (v==btnExit)
            finish();
    }

}
