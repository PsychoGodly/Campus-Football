package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.t;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f33492a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t.c f33493b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f33494c;

    public /* synthetic */ p(r rVar, t.c cVar, KeyEvent keyEvent) {
        this.f33492a = rVar;
        this.f33493b = cVar;
        this.f33494c = keyEvent;
    }

    public final void run() {
        this.f33492a.m(this.f33493b, this.f33494c);
    }
}
