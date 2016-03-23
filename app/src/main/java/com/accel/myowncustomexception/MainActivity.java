package com.accel.myowncustomexception;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    Button b1;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toInit();
        this.b1 = (Button) this.findViewById(R.id.button);
        this.error = (TextView) this.findViewById(R.id.textView);
        this.b1.setOnClickListener(this);
        error.setText(getIntent().getStringExtra("error"));
        //this.getCaughtException(this);
        Log.i("lifeCycle", "MainActivity" + "onCreate");
    }

    private void toInit() {
        this.getCaughtException(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifeCycle","MainActivity" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifeCycle", "MainActivity" + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifeCycle", "MainActivity" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifeCycle", "MainActivity" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifeCycle", "MainActivity" + "onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("lifeCycle", "MainActivity" + "onBackPressed");
    }

    @Override
    public void onClick(View v) {
        //Intent myIntent = new Intent(this,SecondActivity.class);
        startActivity(new Intent(this,SecondActivity.class));
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("onNewIntent", "MainActivity" + "onNewIntent");
    }
}
