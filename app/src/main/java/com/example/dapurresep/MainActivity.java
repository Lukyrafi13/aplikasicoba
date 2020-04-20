package com.example.dapurresep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView menu_bawah;
    private TextView tulisan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_bawah = findViewById(R.id.menu_bawah);
        tulisan = findViewById(R.id.tulisan);
        menu_bawah.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                tulisan.setText("Tombol home diklik");
                break;
            case R.id.receipt:
                tulisan.setText("Tombol receipt diklik");
                break;
            case R.id.restaurant:
                tulisan.setText("Tombol restaurant diklik");
                break;
            case R.id.createresep:
                tulisan.setText("Tombol Create Receipt diklik");
                break;
            case R.id.account:
                tulisan.setText("Tombol Account diklik");
                break;
        }
        return true;
    }
}
