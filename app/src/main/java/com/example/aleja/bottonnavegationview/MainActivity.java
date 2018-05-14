package com.example.aleja.bottonnavegationview;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView empresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //empresa = findViewById(R.id.text);
       //
        BottomNavigationView tabbBar = findViewById(R.id.bottom_navegation);
        Fragment segment = new Fragment_home();
        Bundle bundle = new Bundle();
        bundle.putString("message", "From Activity to home");
        segment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,segment).commit();
        tabbBar.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment segment = null;
                    Bundle bundle = new Bundle();
                    switch (item.getItemId()){
                        case R.id.opt_home:
                            bundle.putString("message", "From Activity to home");
                            segment = new Fragment_home();
                            segment.setArguments(bundle);

                            break;
                        case R.id.opt_fav:
                            bundle.putString("message", "From Activity to fav");
                            segment = new Fragment_fav();
                            segment.setArguments(bundle);
                            break;
                        case R.id.opt_about:
                            bundle.putString("message", "From Activity to empresas");
                            segment = new Fragment_empresas();
                            segment.setArguments(bundle);
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,segment).commit();
                    return true;
                }
            };
}
