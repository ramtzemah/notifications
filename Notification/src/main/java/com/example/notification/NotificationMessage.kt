package com.example.notification

import android.app.Activity
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.aviran.cookiebar2.CookieBar

class NotificationMessage {

        enum class NotificationsType (val stringValue: String){
            ERROR("error"),
            SUCCESS("success"),
            INFO("info")
        }

    companion object {

        fun showMessage(activity: Activity,shownMessage: String) {
            CookieBar.build(activity).setCustomView(R.layout.info_message)
                .setCustomViewInitializer { view ->
                    val message = view.findViewById<TextView>(R.id.message)
                    message.text = shownMessage

                    val close = view.findViewById<ConstraintLayout>(R.id.close)
                    val btnListener = View.OnClickListener { _ ->
                        CookieBar.dismiss(activity)
                    }
                    close.setOnClickListener(btnListener)
                }.setEnableAutoDismiss(true).setSwipeToDismiss(false).setCookiePosition(CookieBar.TOP)
                .setDuration(7500).show()
        }
        fun showMessage(activity: Activity, shownMessage: String, notificationsType: NotificationsType) {
            when(notificationsType){
                NotificationsType.SUCCESS -> CookieBar.build(activity).setCustomView(R.layout.success_message)
                NotificationsType.ERROR -> CookieBar.build(activity).setCustomView(R.layout.error_message)
                NotificationsType.INFO -> CookieBar.build(activity).setCustomView(R.layout.info_message)
            }
                .setCustomViewInitializer { view ->
                    val message = view.findViewById<TextView>(R.id.message)
                    message.text = shownMessage

                    val close = view.findViewById<ConstraintLayout>(R.id.close)
                    val btnListener = View.OnClickListener { _ ->
                        CookieBar.dismiss(activity)
                    }
                    close.setOnClickListener(btnListener)
                }.setEnableAutoDismiss(true).setSwipeToDismiss(false).setCookiePosition(CookieBar.TOP)
                .setDuration(7500).show()
        }

        fun showMessage(activity: Activity, shownMessage: String,notificationsType: NotificationsType, timeInMilliseconds: Long) {
            when(notificationsType){
                NotificationsType.SUCCESS -> CookieBar.build(activity).setCustomView(R.layout.success_message)
                NotificationsType.ERROR -> CookieBar.build(activity).setCustomView(R.layout.error_message)
                NotificationsType.INFO -> CookieBar.build(activity).setCustomView(R.layout.info_message)
            }
                .setCustomViewInitializer { view ->
                    val message = view.findViewById<TextView>(R.id.message)
                    message.text = shownMessage

                    val close = view.findViewById<ConstraintLayout>(R.id.close)
                    val btnListener = View.OnClickListener { _ ->
                        CookieBar.dismiss(activity)
                    }
                    close.setOnClickListener(btnListener)
                }.setEnableAutoDismiss(true).setSwipeToDismiss(false).setCookiePosition(CookieBar.TOP)
                .setDuration(timeInMilliseconds).show()
        }
    }
}