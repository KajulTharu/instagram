package com.example.instagram;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);



                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(MainActivity2.this,login.class);
                    startActivity(intent);
                    finish();
                }

            }

        });
        thread.start();
    }
}




