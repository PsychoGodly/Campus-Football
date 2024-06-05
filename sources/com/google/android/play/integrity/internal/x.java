package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class x implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f26091a;

    /* synthetic */ x(y yVar, w wVar) {
        this.f26091a = yVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f26091a.f26094b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        y yVar = this.f26091a;
        yVar.c().post(new u(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f26091a.f26094b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        y yVar = this.f26091a;
        yVar.c().post(new v(this));
    }
}
