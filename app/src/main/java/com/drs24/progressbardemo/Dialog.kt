package com.drs24.progressbardemo

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import kotlinx.android.synthetic.main.dialog_layout.view.*

/**
 * Created by dustin0128 on 2020/7/22
 */
object CustomDialog {
    private var dialog: Dialog? = null

    /**Loading動畫視窗*/
    fun showLoadingPopup(context: Context, message: String) {
        dialog = Dialog(context, R.style.CustomDialogTheme)
        val inflater = (context as Activity).layoutInflater
        val view = inflater.inflate(R.layout.dialog_layout, null)

        view.t_message.text = message

        view.t_message.setTextColor(Color.WHITE)

        dialog?.setContentView(view)
        dialog?.setCancelable(false)
        dialog?.show()
    }

    fun close(){
        if (dialog != null) {
            dialog?.dismiss()
            dialog = null
        }
    }
}