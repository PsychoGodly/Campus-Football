package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.startapp.t1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class b extends t1.a {

    /* renamed from: c  reason: collision with root package name */
    public final Map<Network, Integer> f15621c = new HashMap();

    /* compiled from: Sta */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            int a10 = t1.a(networkCapabilities);
            synchronized (b.this.f15621c) {
                b.this.f15621c.put(network, Integer.valueOf(a10));
            }
        }

        public void onLost(Network network) {
            synchronized (b.this.f15621c) {
                b.this.f15621c.remove(network);
            }
        }
    }

    public b(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    public int a() {
        int i10;
        synchronized (this.f15621c) {
            i10 = 0;
            for (Integer next : this.f15621c.values()) {
                if (next != null) {
                    i10 |= next.intValue();
                }
            }
        }
        return i10;
    }

    public void b() {
        if (a0.a(this.f17282a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f17283b.registerDefaultNetworkCallback(new a());
        }
    }
}
