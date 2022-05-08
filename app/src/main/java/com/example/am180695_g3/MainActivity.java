package com.example.am180695_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btFrame, btLinear, btRelative, btGrid,btTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFrame (View v) {
        Intent llamar = new Intent(this, FrameLayout.class);
        startActivity(llamar);
    }
    public void onClickLinear (View v){
        Intent llamar=new Intent( this, LinearLayout.class);
        startActivity(llamar);
    }
    public void onClickRelative (View v){
        Intent llamar=new Intent(this,RelativeLayout.class);
        startActivity (llamar);
    }
    public void onClickTable(View v) {
        Intent llamar = new Intent(this, TableLayout.class);
        startActivity(llamar);
    }
    public void onClickGrid(View v) {
        Intent llamar = new Intent(this, GridLayout.class);
        startActivity(llamar);
    }

    public void btnEjercicio2(View v) {
        Intent llamar = new Intent(this, Ejercicio2.class);
        startActivity(llamar);
    }


    public void btnEjercicio3(View view) {
        Intent llamar = new Intent(this, Ejercicio3.class);
        startActivity(llamar);
    }

    public void btnEjercicio4(View view) {
        Intent llamar = new Intent(this, Ejercicio4.class);
        startActivity(llamar);

    }

    public void btnEjercicio5(View view) {
        Intent llamar = new Intent(this, Ejercicio5.class);
        startActivity(llamar);
    }

    public void onClickStrings(View view) {
        Intent llamar = new Intent(this, strings.class);
        startActivity(llamar);
    }
}