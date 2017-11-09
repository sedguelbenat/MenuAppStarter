package com.example.sedar.menuappstarter;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sedar on 09.11.2017.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int buttonNumber = getIntent().getIntExtra("buttonNumber",-1);

        //Create the Bundle object
        Bundle bundle = new Bundle();
        //Put the number in it with String key as buttonNumber
        bundle.putInt("buttonNumber", buttonNumber);


        DetailFragment detailFragment = new DetailFragment();
        //Pass in the bundle object
        detailFragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().add(R.id.detail_activity_fragment_container,detailFragment);
        fragmentTransaction.commit();

    }
}
