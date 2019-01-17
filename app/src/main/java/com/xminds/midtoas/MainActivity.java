package com.xminds.midtoas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xminds.midtoast.MToast;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private MToast toast;
    private int mCount=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast=new MToast();
        mButton=findViewById(R.id.btn_toast);
        mButton.setOnClickListener(toastButtonClickListener);

    }

    View.OnClickListener toastButtonClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mCount++;
            if(mCount%2==0)
            toast.midLongToast(MainActivity.this,"My Fist Custom Toast");
            else
                toast.midShortToast(MainActivity.this,"My Second Custom Toast");
        }
    };
}
