package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class wf extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final List f13061a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a();

        void b();
    }

    public wf(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    public void b(a aVar) {
        this.f13061a.remove(aVar);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            ArrayList<a> arrayList = new ArrayList<>(this.f13061a);
            if (a(intent)) {
                for (a a10 : arrayList) {
                    a10.a();
                }
                return;
            }
            for (a b10 : arrayList) {
                b10.b();
            }
        }
    }

    public void a(a aVar) {
        this.f13061a.add(aVar);
    }
}
