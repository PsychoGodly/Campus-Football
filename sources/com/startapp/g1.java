package com.startapp;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;

/* compiled from: Sta */
public class g1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h1 f15830a;

    public g1(h1 h1Var) {
        this.f15830a = h1Var;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            e1 e1Var = this.f15830a.f15885c;
            if (e1Var.f15777b == null) {
                e1Var.f15777b = new HashSet();
            }
            e1Var.f15777b.add(bluetoothDevice);
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.f15830a.c();
            h1 h1Var = this.f15830a;
            h1Var.f15884b.a(h1Var.b());
        }
    }
}
