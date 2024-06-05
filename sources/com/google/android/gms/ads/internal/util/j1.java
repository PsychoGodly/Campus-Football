package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.internal.ads.zzbar;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f14818a = new i1(this);

    /* renamed from: b  reason: collision with root package name */
    private final Map f14819b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f14820c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14821d;

    /* renamed from: e  reason: collision with root package name */
    private Context f14822e;

    /* access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14819b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f14820c) {
            Context applicationContext = context.getApplicationContext();
            this.f14822e = applicationContext;
            if (applicationContext == null) {
                this.f14822e = context;
            }
            zzbar.zzc(this.f14822e);
            this.f14821d = ((Boolean) a0.c().zzb(zzbar.zzdr)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) a0.c().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f14822e.registerReceiver(this.f14818a, intentFilter);
            } else {
                this.f14822e.registerReceiver(this.f14818a, intentFilter, 4);
            }
            this.f14820c = true;
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f14821d) {
            this.f14819b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbar.zzc(context);
        if (!((Boolean) a0.c().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f14821d) {
            this.f14819b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
