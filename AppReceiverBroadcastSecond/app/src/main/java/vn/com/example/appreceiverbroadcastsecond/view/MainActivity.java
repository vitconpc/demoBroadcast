package vn.com.example.appreceiverbroadcastsecond.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

import vn.com.example.appreceiverbroadcastsecond.R;
import vn.com.example.appreceiverbroadcastsecond.common.Constants;

public class MainActivity extends AppCompatActivity {

    private TextView etData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        etData = findViewById(R.id.et_data);
    }

    private void initData() {
        String data = getIntent().getStringExtra(Constants.KEY);
        if (!TextUtils.isEmpty(data)){
            etData.setText(data);
        }
    }
}
