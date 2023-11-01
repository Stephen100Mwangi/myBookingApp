package com.example.booktrip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecentData extends AppCompatActivity {

    String countryName;
    String placeName;
    String price;

    public RecentData(String countryName,String placeName,String price){
        countryName = this.countryName;
        placeName = this.placeName;
        price = this.price;
    }

    public void setPrice(String price){
        this.price = price;
    }
    public  String getPrice(){
        return price;
    }





//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recent_data);
//    }
}