package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class t1 {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f17276f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17277a;

    /* renamed from: b  reason: collision with root package name */
    public final i2<ConnectivityHelperMetadata> f17278b;

    /* renamed from: c  reason: collision with root package name */
    public final List<i2<Void>> f17279c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f17280d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public a f17281e;

    /* compiled from: Sta */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17282a;

        /* renamed from: b  reason: collision with root package name */
        public final ConnectivityManager f17283b;

        public a(Context context, ConnectivityManager connectivityManager) {
            this.f17282a = context;
            this.f17283b = connectivityManager;
        }

        public abstract int a();

        public void b() {
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
        }
        if (i10 >= 26) {
            arrayList.add(5);
        }
        if (i10 >= 27) {
            arrayList.add(6);
        }
        if (i10 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        f17276f = iArr;
    }

    public t1(Context context, i2<ConnectivityHelperMetadata> i2Var) {
        this.f17277a = context;
        this.f17278b = i2Var;
    }

    public boolean a() {
        if (a0.a(this.f17277a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f17277a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th) {
                if (!j9.a(th, (Class<? extends Throwable>) RemoteException.class)) {
                    i3.a(th);
                }
            }
        }
        return true;
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 : f17276f) {
            try {
                if (networkCapabilities.hasTransport(i11)) {
                    i10 |= 1 << i11;
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }
}
