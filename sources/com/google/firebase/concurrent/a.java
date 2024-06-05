package com.google.firebase.concurrent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f26353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26354b;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f26353a = bVar;
        this.f26354b = runnable;
    }

    public final void run() {
        this.f26353a.b(this.f26354b);
    }
}
