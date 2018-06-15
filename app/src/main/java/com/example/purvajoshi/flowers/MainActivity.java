package com.example.purvajoshi.flowers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage = (ViewPager) findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"Aster", "Daffodil", "Dahlia", "Jasmine", "Lavender", "Lily", "Lotus", "Marigold", "Orchid", "Rose", "Sunflower", "Tulip"};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new Aster();
            }
            if (position == 1) {
                return new Daffodil();
            }
            if (position == 2) {
                return new Dahlia();
            }
            if (position == 3) {
                return new Jasmine();
            }
            if (position == 4) {
                return new Lavender();
            }
            if (position == 5) {
                return new Lily();

            }
            if (position == 6) {
                return new Lotus();
            }
            if (position == 7) {
                return new Marigold();
            }
            if (position == 8) {
                return new Orchid();
            }
            if (position == 9) {
                return new Rose();
            }
            if (position == 10) {
                return new Sunflower();
            }
            if (position == 11) {
                return new Tulip();
            }

            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }

    }
}

