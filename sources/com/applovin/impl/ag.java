package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.applovin.mediation.MaxReward;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ag {

    /* renamed from: e  reason: collision with root package name */
    private static ag f6527e;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f6528a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f6529b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Object f6530c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f6531d = 0;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static volatile boolean f6532a;
    }

    public interface c {
        void a(int i10);
    }

    private final class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            int a10 = ag.c(context);
            int i10 = yp.f13662a;
            if (i10 >= 29 && !b.f6532a && a10 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) a1.a((Object) (TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            ag.this.a(a10);
        }
    }

    private class e extends PhoneStateListener {
        private e() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            ag.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? MaxReward.DEFAULT_LABEL : serviceState.toString();
            ag.this.a(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private ag(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type == 9) {
                        return 7;
                    }
                    if (!(type == 4 || type == 5)) {
                        return type != 6 ? 8 : 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public void b(c cVar) {
        b();
        this.f6529b.add(new WeakReference(cVar));
        this.f6528a.post(new ht(this, cVar));
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return yp.f13662a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    private void b() {
        Iterator it = this.f6529b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f6529b.remove(weakReference);
            }
        }
    }

    public int a() {
        int i10;
        synchronized (this.f6530c) {
            i10 = this.f6531d;
        }
        return i10;
    }

    public static synchronized ag b(Context context) {
        ag agVar;
        synchronized (ag.class) {
            if (f6527e == null) {
                f6527e = new ag(context);
            }
            agVar = f6527e;
        }
        return agVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        cVar.a(a());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (com.applovin.impl.ag.c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f6529b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f6529b.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6530c
            monitor-enter(r0)
            int r1 = r3.f6531d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f6531d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f6529b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.applovin.impl.ag$c r2 = (com.applovin.impl.ag.c) r2
            if (r2 == 0) goto L_0x002a
            r2.a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.f6529b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ag.a(int):void");
    }
}
