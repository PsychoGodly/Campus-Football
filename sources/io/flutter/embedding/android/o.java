package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.t;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f33488a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t.c f33489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f33490c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f33491d;

    public /* synthetic */ o(r rVar, t.c cVar, long j10, KeyEvent keyEvent) {
        this.f33488a = rVar;
        this.f33489b = cVar;
        this.f33490c = j10;
        this.f33491d = keyEvent;
    }

    public final void run() {
        this.f33488a.l(this.f33489b, this.f33490c, this.f33491d);
    }
}
