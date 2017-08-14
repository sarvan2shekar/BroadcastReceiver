package com.testapp.sarvan.broadcastreceiver.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.testapp.sarvan.broadcastreceiver.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastCustomIntent(View v) {
        EditText editText = (EditText) findViewById(R.id.editText_broadcast);
        Intent intent = new Intent("MyCustomIntent");
        if (editText != null && editText.getText() != null
                && !editText.getText().toString().trim().isEmpty()) {
            intent.putExtra("message", (CharSequence) editText.getText().toString());
            intent.setAction(getString(R.string.receiver_intent_filter));
            sendBroadcast(intent);
        }
    }
}
