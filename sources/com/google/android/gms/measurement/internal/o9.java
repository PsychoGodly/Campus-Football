package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class o9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f24901a = true;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f24902b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f24903c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ d f24904d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ d f24905f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ v8 f24906g;

    o9(v8 v8Var, boolean z10, lb lbVar, boolean z11, d dVar, d dVar2) {
        this.f24906g = v8Var;
        this.f24902b = lbVar;
        this.f24903c = z11;
        this.f24904d = dVar;
        this.f24905f = dVar2;
    }

    public final void run() {
        i w10 = this.f24906g.f25132d;
        if (w10 == null) {
            this.f24906g.zzj().B().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f24901a) {
            q.k(this.f24902b);
            this.f24906g.O(w10, this.f24903c ? null : this.f24904d, this.f24902b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f24905f.f24446a)) {
                    q.k(this.f24902b);
                    w10.r1(this.f24904d, this.f24902b);
                } else {
                    w10.O0(this.f24904d);
                }
            } catch (RemoteException e10) {
                this.f24906g.zzj().B().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f24906g.b0();
    }
}
