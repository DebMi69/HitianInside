

package com.example.hitianinside;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hitianinside.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;

import com.example.hitianinside.homefrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home_lay_nav extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView;

    com.example.hitianinside.homefrag homefrag = new homefrag();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();
                        return true;

                    case R.id.about:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();
                        return true;

                    case R.id.events:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();
                        return true;

                    case R.id.gallery:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,galleryfrag).commit();
                        return true;

                    case R.id.merch:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();
                        return true;

                    case R.id.cntt:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,cnttfrag).commit();
                        return true;
                }

                return false;
            }
        });


    }}
