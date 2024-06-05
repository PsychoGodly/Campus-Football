package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class oa {

    /* renamed from: a  reason: collision with root package name */
    private final e f24907a;

    /* renamed from: b  reason: collision with root package name */
    private long f24908b;

    public oa(e eVar) {
        q.k(eVar);
        this.f24907a = eVar;
    }

    public final void a() {
        this.f24908b = 0;
    }

    public final boolean b(long j10) {
        if (this.f24908b != 0 && this.f24907a.b() - this.f24908b < 3600000) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.f24908b = this.f24907a.b();
    }
}
