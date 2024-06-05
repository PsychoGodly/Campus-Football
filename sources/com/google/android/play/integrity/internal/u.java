package com.google.android.play.integrity.internal;

import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class u extends o {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IBinder f26088b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ x f26089c;

    u(x xVar, IBinder iBinder) {
        this.f26089c = xVar;
        this.f26088b = iBinder;
    }

    public final void b() {
        this.f26089c.f26091a.f26105m = j.M0(this.f26088b);
        y.n(this.f26089c.f26091a);
        this.f26089c.f26091a.f26099g = false;
        for (Runnable run : this.f26089c.f26091a.f26096d) {
            run.run();
        }
        this.f26089c.f26091a.f26096d.clear();
    }
}
