package com.example.sedar.menuappstarter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuFragment fragment = new MenuFragment();

        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction = fragmentTransaction.add(R.id.main_activity_fragment_container, fragment);

        fragmentTransaction.commit();
    }
}