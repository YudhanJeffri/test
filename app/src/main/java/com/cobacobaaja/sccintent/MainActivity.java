package com.cobacobaaja.sccintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.cobabutton);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cobabutton:
                break;
        }


    }
    public void onButtonClick(View view) {
        switch (view.getId()){
            case R.id.cobabutton:
                Intent moveIntent = new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveIntent);
                break;

        }

    }
}
