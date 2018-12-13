package vn.com.example.appreceiverbroadcastsecond.common.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import vn.com.example.appreceiverbroadcastsecond.common.Constants;
import vn.com.example.appreceiverbroadcastsecond.view.MainActivity;

public class ReceiverBroadcastFromOtherApp extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String value = null;
        if (intent!= null){
            value = intent.getStringExtra(Constants.KEY);
        }
        Intent goToMain = new Intent(context,MainActivity.class);
        if (!TextUtils.isEmpty(value)){
            goToMain.putExtra(Constants.KEY,value);
        }
        goToMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(goToMain);
    }
}
