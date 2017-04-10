package com.example.masarukojo.studyandroid;

import android.view.View;
import android.view.WindowManager;
import android.view.Display;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager wm = getWindowManager();
        Display disp = wm.getDefaultDisplay();

        ImageView imageView = (ImageView)findViewById(R.id.backgroundView);
        ViewGroup.LayoutParams params = imageView.getLayoutParams();
        params.width = disp.getWidth();

        try {
            InputStream istream = getResources().getAssets().open("images.jpg");
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
            imageView.setImageBitmap(bitmap);
            imageView.setLayoutParams(params);
        } catch (IOException e) {
            Log.d("Assets","Error");
        }

        final Button toAlarmPageButton = (Button)findViewById(R.id.toAlarmPageButton);
        toAlarmPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toAlarmPageButtonOnClickEvent(v);
            }
        });
    }

    private void toAlarmPageButtonOnClickEvent(View v) {
        Intent intent = new Intent(MainActivity.this, AlarmListActivity.class);
        startActivity(intent);
    }
}
