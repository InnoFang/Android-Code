package io.innofang.processingdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void onClick(View view) {
        Context context = MenuActivity.this;
        switch (view.getId()) {
            case R.id.simple_sketch_one:
                startActivity(MainActivity.newIntent(context, getString(R.string.simple_sketch_one)));
                break;
            case R.id.simple_sketch_two:
                startActivity(MainActivity.newIntent(context, getString(R.string.simple_sketch_two)));
                break;
            case R.id.sensor_sketch:
                startActivity(MainActivity.newIntent(context, getString(R.string.sensor_sketch)));
                break;
            case R.id.box2d_sketch:
                startActivity(MainActivity.newIntent(context, getString(R.string.box2d_sketch)));
                break;
            case R.id.wallpapers_sketch:
                startActivity(MainActivity.newIntent(context, getString(R.string.wallpapers_sketch)));
                break;
            case R.id.compass_sketch:
                startActivity(MainActivity.newIntent(context, getString(R.string.compass_sketch)));
                break;
            case R.id.location_sketch:
                startActivity(MainActivity.newIntent(context, getString(R.string.location_sketch)));
                break;
            default:
                break;
        }
    }
}
