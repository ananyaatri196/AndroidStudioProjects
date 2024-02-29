package com.example.inbuiltapplications;

import android.app.AlarmManager;
import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button camera_open_id;
        Button contacts_open_id;
        Button alarm_open_id;
        camera_open_id = findViewById(R.id.camera_button);
        contacts_open_id = findViewById(R.id.contacts_button);
        camera_open_id.setOnClickListener(v -> {
            Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(camera_intent);
        });
        contacts_open_id.setOnClickListener(v -> {
            Intent contacts_intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            startActivity(contacts_intent);
        });

    }
}