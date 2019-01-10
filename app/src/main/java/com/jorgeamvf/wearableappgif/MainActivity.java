package com.jorgeamvf.wearableappgif;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.ImageView;

public class MainActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.my_image_view);

        if (getResources().getConfiguration().isScreenRound()) {
            GlideApp.with(this).load(getString(R.string.round_gif_url)).into(imageView);
        } else {
            GlideApp.with(this).load(getString(R.string.square_gif_url)).into(imageView);
        }

        setAmbientEnabled();
    }
}
