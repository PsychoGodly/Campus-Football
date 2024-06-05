package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
abstract class u {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f25085d;

    /* renamed from: a  reason: collision with root package name */
    private final w6 f25086a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f25087b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f25088c;

    u(w6 w6Var) {
        q.k(w6Var);
        this.f25086a = w6Var;
        this.f25087b = new t(this, w6Var);
    }

    private final Handler f() {
        Handler handler;
        if (f25085d != null) {
            return f25085d;
        }
        synchronized (u.class) {
            if (f25085d == null) {
                f25085d = new zzcp(this.f25086a.zza().getMainLooper());
            }
            handler = f25085d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f25088c = 0;
        f().removeCallbacks(this.f25087b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f25088c = this.f25086a.zzb().a();
            if (!f().postDelayed(this.f25087b, j10)) {
                this.f25086a.zzj().B().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f25088c != 0;
    }
}
