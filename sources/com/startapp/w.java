package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.startapp.t1;

/* compiled from: Sta */
public class w extends t1.a {
    public w(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    public int a() {
        Network[] allNetworks;
        if (!a0.a(this.f17282a, "android.permission.ACCESS_NETWORK_STATE") || (allNetworks = this.f17283b.getAllNetworks()) == null) {
            return 0;
        }
        int i10 = 0;
        for (Network network : allNetworks) {
            if (network != null) {
                i10 |= t1.a(this.f17283b.getNetworkCapabilities(network));
            }
        }
        return i10;
    }
}
