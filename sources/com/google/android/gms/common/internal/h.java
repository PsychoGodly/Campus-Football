package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static int f15402a = 4225;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15403b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static n1 f15404c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f15405d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f15406e = false;

    public static int a() {
        return f15402a;
    }

    public static h b(Context context) {
        Looper looper;
        synchronized (f15403b) {
            if (f15404c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f15406e) {
                    looper = c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f15404c = new n1(applicationContext, looper);
            }
        }
        return f15404c;
    }

    public static HandlerThread c() {
        synchronized (f15403b) {
            HandlerThread handlerThread = f15405d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f15405d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f15405d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(j1 j1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new j1(str, str2, i10, z10), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean f(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
