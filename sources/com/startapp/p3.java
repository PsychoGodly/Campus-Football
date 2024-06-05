package com.startapp;

/* compiled from: Sta */
public class p3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i3 f16246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16247b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f16248c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o3 f16249d;

    public p3(o3 o3Var, i3 i3Var, int i10, long j10) {
        this.f16249d = o3Var;
        this.f16246a = i3Var;
        this.f16247b = i10;
        this.f16248c = j10;
    }

    public void run() {
        try {
            this.f16249d.a(this.f16246a, this.f16247b, this.f16248c);
        } catch (Throwable unused) {
        }
    }
}
