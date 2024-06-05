package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class p9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f24938a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24939b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24940c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f24941d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ lb f24942f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f24943g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ v8 f24944h;

    p9(v8 v8Var, AtomicReference atomicReference, String str, String str2, String str3, lb lbVar, boolean z10) {
        this.f24944h = v8Var;
        this.f24938a = atomicReference;
        this.f24939b = str;
        this.f24940c = str2;
        this.f24941d = str3;
        this.f24942f = lbVar;
        this.f24943g = z10;
    }

    public final void run() {
        synchronized (this.f24938a) {
            try {
                i w10 = this.f24944h.f25132d;
                if (w10 == null) {
                    this.f24944h.zzj().B().d("(legacy) Failed to get user properties; not connected to service", n4.q(this.f24939b), this.f24940c, this.f24941d);
                    this.f24938a.set(Collections.emptyList());
                    this.f24938a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f24939b)) {
                    q.k(this.f24942f);
                    this.f24938a.set(w10.Y0(this.f24940c, this.f24941d, this.f24943g, this.f24942f));
                } else {
                    this.f24938a.set(w10.G(this.f24939b, this.f24940c, this.f24941d, this.f24943g));
                }
                this.f24944h.b0();
                this.f24938a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f24944h.zzj().B().d("(legacy) Failed to get user properties; remote exception", n4.q(this.f24939b), this.f24940c, e10);
                    this.f24938a.set(Collections.emptyList());
                    this.f24938a.notify();
                } catch (Throwable th) {
                    this.f24938a.notify();
                    throw th;
                }
            }
        }
    }
}
