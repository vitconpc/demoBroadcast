package vn.com.example.appsendbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastToB(View view) {
        Intent intent = new Intent(getString(R.string.go_to_sub_b));
        intent.putExtra(KEY,getString(R.string.data_send_b));
        sendBroadcast(intent);
    }

    public void sendBroadcastToA(View view) {
        Intent intent = new Intent(getString(R.string.go_to_a));
        intent.putExtra(KEY,getString(R.string.data_send_a));
        sendBroadcast(intent);
    }
}
