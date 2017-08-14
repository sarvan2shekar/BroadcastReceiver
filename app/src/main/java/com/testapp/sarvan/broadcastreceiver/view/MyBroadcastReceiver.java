package com.testapp.sarvan.broadcastreceiver.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence charSequence = intent.getCharSequenceExtra("message");
        Toast.makeText(context, "Received intent data: " + charSequence, Toast.LENGTH_LONG).show();
    }
}
