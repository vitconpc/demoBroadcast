package vn.com.example.appreceiverbroastcastfirst.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import vn.com.example.appreceiverbroastcastfirst.R;
import vn.com.example.appreceiverbroastcastfirst.common.Constants;

public class MainActivity extends AppCompatActivity {

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        String data = getIntent().getStringExtra(Constants.KEY);
        if (!TextUtils.isEmpty(data)){
            tvData.setText(data);
        }
    }

    private void initView() {
        tvData = findViewById(R.id.tv_data);
    }
}
