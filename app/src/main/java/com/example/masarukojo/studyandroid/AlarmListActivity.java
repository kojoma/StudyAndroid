package com.example.masarukojo.studyandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlarmListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);

        Button backToMainButton = (Button)findViewById(R.id.backToMainButton);
        backToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMainButtonOnClickEvent(v);
            }
        });
    }

    private void backToMainButtonOnClickEvent(View v) {
        Intent intent = new Intent(AlarmListActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
