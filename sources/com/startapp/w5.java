package com.startapp;

/* compiled from: Sta */
public class w5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17499b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f17500c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v5 f17501d;

    public w5(v5 v5Var, String str, String str2, long j10) {
        this.f17501d = v5Var;
        this.f17498a = str;
        this.f17499b = str2;
        this.f17500c = j10;
    }

    public void run() {
        v5 v5Var = this.f17501d;
        String str = this.f17498a;
        String str2 = this.f17499b;
        long j10 = this.f17500c;
        v5Var.getClass();
        try {
            v5Var.f17401b.a(str, str2, System.currentTimeMillis(), j10);
        } catch (Throwable th) {
            if (v5Var.a(1)) {
                i3.a(th);
            }
        }
    }
}
