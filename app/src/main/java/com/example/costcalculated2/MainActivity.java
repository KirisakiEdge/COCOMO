package com.example.costcalculated2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.tabs);

        setViewPager(viewPager);
        tabs.setupWithViewPager(viewPager);


    }



    private void setViewPager(ViewPager viewPager){
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        sectionsPagerAdapter.addFragment(new COCOMO_(), "COCOMO");
        sectionsPagerAdapter.addFragment(new COCOMO2_(), "COCOMO2");
        sectionsPagerAdapter.addFragment(new FunctionPoint_(), "Function Point");
        viewPager.setAdapter(sectionsPagerAdapter);
    }
}