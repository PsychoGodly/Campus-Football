package com.google.android.play.integrity.internal;

import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final /* synthetic */ class q implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f26084a;

    public /* synthetic */ q(y yVar) {
        this.f26084a = yVar;
    }

    public final void binderDied() {
        y.h(this.f26084a);
    }
}
