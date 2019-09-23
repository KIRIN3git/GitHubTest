package jp.kirin3.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w( "DEBUG_DATA", "first1");

        Log.w( "DEBUG_DATA", "developer1");

        Log.w( "DEBUG_DATA", "feature_x");
        Log.w( "DEBUG_DATA", "feature_y");

        Log.w( "DEBUG_DATA", "feature_shinji2_xew");
        Log.w( "DEBUG_DATA", "feature_shinji2_y");
    }
}
