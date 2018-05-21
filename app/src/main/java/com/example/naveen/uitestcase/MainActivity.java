package com.example.naveen.uitestcase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mNameEt;
    private TextView mResultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEt=(EditText)findViewById(R.id.name_et);
        mResultTv=(TextView)findViewById(R.id.result_tv);
    }

    public void hello(View view)
    {
        String result="Hello, "+mNameEt.getText().toString();
        mResultTv.setText(result);
    }
}
