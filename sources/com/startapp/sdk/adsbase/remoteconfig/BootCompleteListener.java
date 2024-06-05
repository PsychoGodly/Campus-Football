package com.startapp.sdk.adsbase.remoteconfig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.c8;
import com.startapp.h0;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class BootCompleteListener extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Object obj = StartAppSDKInternal.D;
        Context a10 = h0.a(context);
        if (a10 != null) {
            context = a10;
        }
        StartAppSDKInternal.d.f16847a.g(context);
        ComponentLocator.a(context).h().execute(new c8(context));
    }
}
