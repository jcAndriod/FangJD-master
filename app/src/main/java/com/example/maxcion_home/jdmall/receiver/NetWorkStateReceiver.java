package com.example.maxcion_home.jdmall.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.maxcion_home.jdmall.util.NetworkUtils;


/**
 * 判断网络状态的广播接收者
 */
public class NetWorkStateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NetworkUtils.checkNetwork(context);
    }
}
