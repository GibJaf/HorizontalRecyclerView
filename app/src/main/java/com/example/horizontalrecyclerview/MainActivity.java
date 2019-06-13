package com.example.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();

    }

    private void getImages()
    {
        Log.d(TAG,"initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://images.giant-bicycles.com/b_white,c_pad,h_650,q_80/rzar8zzxy44jj9dzghyu/TCR-Advanced-2-Disc_Color-A_Black.jpg");
        mNames.add("Giant TCR");

        mImageUrls.add("https://images.giant-bicycles.com/b_white,c_pad,h_400,q_80/apx7px1dc6vqloikvqeq/MY19PropelADPRO2_ColorA.jpg");
        mNames.add("Giant Propel");

        mImageUrls.add("https://d2lljesbicak00.cloudfront.net/merida-v2/crud-zoom-img/master/bikes/2019/MISSION_CX_8000-E_blured_MY2019.tif?p3");
        mNames.add("Merida Mission CX 8000E");

        mImageUrls.add("https://d2lljesbicak00.cloudfront.net/merida-v2/crud-zoom-img/master/bikes/2019/REACTO_DISC_TEAM_MY2019.tif?p3");
        mNames.add("Merida Reacto Disc Team-E");

        mImageUrls.add("https://trek.scene7.com/is/image/TrekBicycleProducts/EmondaALR4_19_23656_B_Portrait?$responsive-pjpg$&wid=1920&hei=1440");
        mNames.add("Trek Emonda ALR 4");

        mImageUrls.add("https://trek.scene7.com/is/image/TrekBicycleProducts/DomaneAL5_19_23528_A_Portrait?$responsive-pjpg$&wid=1920&hei=1440");
        mNames.add("Trek Domane AL 5");



        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG,"initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);

        /*RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));*/
    }
}
