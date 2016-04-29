package com.braincraftapps.gourmet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    int logoTimer = 0;
                    while (logoTimer < 5000) {
                        sleep(100);
                        logoTimer = logoTimer + 100;
                    }
                    ;
                    startActivity(new Intent("com.braincraftapps.CLEARSCREEN"));
                } catch (InterruptedException e) {
                    // TODO: автоматически сгенерированный блок catch.
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}
