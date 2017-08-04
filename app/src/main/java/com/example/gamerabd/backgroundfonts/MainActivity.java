package com.example.gamerabd.backgroundfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1(View view)
    {
        TextView tx = (TextView)findViewById(R.id.myid);
        Typeface fn = Typeface.createFromAsset(getAssets(),"alpha_echo.ttf")  ;
        tx.setTypeface(fn);
    }
    public void bt2(View view)
    {
        TextView tx = (TextView)findViewById(R.id.myid);
        Typeface fn = Typeface.createFromAsset(getAssets(),"AquilineTwo.ttf")  ;
        tx.setTypeface(fn);
    }
    public void bt3(View view)
    {       TextView tx = (TextView)findViewById(R.id.myid);
        Typeface fn = Typeface.createFromAsset(getAssets(),"Archistico_Bold.ttf")  ;
        tx.setTypeface(fn);
    }
    public void bt4(View view)
    {
        TextView tx = (TextView)findViewById(R.id.myid);
        Typeface fn = Typeface.createFromAsset(getAssets(),"Chantelli_Antiqua.ttf")  ;
        tx.setTypeface(fn);
    }


}
