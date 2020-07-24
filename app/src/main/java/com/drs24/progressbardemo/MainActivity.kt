package com.drs24.progressbardemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_layout.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_progress.setOnClickListener(this) //啟動progress
        stop_progress.setOnClickListener(this) //停止
    }

    override fun onClick(p0: View?) {
        when (p0){
            start_progress -> {
//                c_background.setBackgroundResource(android.R.color.darker_gray)
//                p_progressBar.visibility = View.VISIBLE
//                t_message.visibility = View.VISIBLE

                CustomDialog.showLoadingPopup(this,"loading")
            }

            stop_progress -> {
//                c_background.setBackgroundResource(android.R.color.transparent) //透明化
//                p_progressBar.visibility = View.INVISIBLE
//                t_message.visibility = View.INVISIBLE

                CustomDialog.close()

            }
        }

    }
}