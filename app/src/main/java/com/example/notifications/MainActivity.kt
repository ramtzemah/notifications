package com.example.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notification.NotificationMessage
import com.example.notification.NotificationMessage.Companion.showMessage

class MainActivity : AppCompatActivity() {

    private lateinit var error : Button;
    private lateinit var info : Button;
    private lateinit var success : Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews();
        setListeners()
    }

    private fun setListeners() {
        info.setOnClickListener{
            showMessage(this,"message")}

        success.setOnClickListener{
            showMessage(this,"message", NotificationMessage.NotificationsType.SUCCESS)}

        error.setOnClickListener{
            showMessage(this,"message",NotificationMessage.NotificationsType.ERROR,2000)}
    }

    private fun findViews() {
        error = findViewById(R.id.error)
        info = findViewById(R.id.info)
        success = findViewById(R.id.success)
    }

}