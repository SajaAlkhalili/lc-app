package edu.birzeit.students.lc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Log.d("LC888","OnCreat()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LC888","OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LC888","OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LC888","OnDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LC888","OnPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LC888","OnResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LC888","OnRestart()");
    }
}