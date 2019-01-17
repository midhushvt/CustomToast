package com.xminds.midtoast;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MToast {

    public void midLongToast(Context context, String message){
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.image_custom, null);
        TextView textView = (TextView) view.findViewById(R.id.custom_toast_text);
        textView.setTextColor(Color.BLACK);
        textView.setText(message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    public void midShortToast(Context context,String message){
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.image_custom, null);
        TextView textView = (TextView) view.findViewById(R.id.custom_toast_text);
        textView.setText(message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
}
