package com.example.UTS_PRAK_PB;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class news extends AppCompatActivity {
    ListView listView;

    String  mTitle[] = {"Stephen Curry","Klay Thompson","Draymond Green","D'Angelo Russel","Willie Stein","Eric Paschall","Omari Spellman","Kevon Looney"};
    String mDescription [] ={"Point Guard","Small Forward","Power Forward","Shooting Guard","Center","Power Forward","Center","Power Forward"};
    int image[] = {R.drawable.i, R.drawable.klay, R.drawable.draymond, R.drawable.russell, R.drawable.wcs,R.drawable.eric,R.drawable.omari,R.drawable.kevon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listView = findViewById(R.id.mylist_view);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, image);
        listView.setAdapter(adapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            if (position == 0) {
                Intent myIntent = new Intent(view.getContext(),steph.class);
                startActivityForResult(myIntent,0);
            }
            if (position == 1) {
                Intent myIntent = new Intent(view.getContext(),klay.class);
                startActivityForResult(myIntent,1);
            }
            if (position == 2) {
                Intent myIntent = new Intent(view.getContext(),green.class);
                startActivityForResult(myIntent,2);
            }
            if (position == 3) {
                Intent myIntent = new Intent(view.getContext(),russel.class);
                startActivityForResult(myIntent,3);
            }
            if (position == 4) {
                Intent myIntent = new Intent(view.getContext(),willie.class);
                startActivityForResult(myIntent,4);
            }
            if (position == 5) {
                Intent myIntent = new Intent(view.getContext(),eric.class);
                startActivityForResult(myIntent,5);
            }
            if (position == 6) {
                Intent myIntent = new Intent(view.getContext(),omari.class);
                startActivityForResult(myIntent,6);
            }
            if (position == 7) {
                Intent myIntent = new Intent(view.getContext(),loon.class);
                startActivityForResult(myIntent,7);
            }




        }
    });

    }


    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textview1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView image = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myDescription = row.findViewById(R.id.textview2);

            image.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);



            return row;
        }
    }
}
