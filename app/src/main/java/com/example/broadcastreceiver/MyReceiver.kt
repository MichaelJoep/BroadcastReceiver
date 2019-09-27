package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
       // TODO("MyReceiver.onReceive() is not implemented")
        Toast.makeText(context,"MyReceiver", Toast.LENGTH_SHORT).show()
    }
}
