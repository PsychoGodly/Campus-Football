package com.startapp;

import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;

/* compiled from: Sta */
public class b9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TriggeredLinksMetadata f15661a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15662b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f15663c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f15664d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z8 f15665e;

    public b9(z8 z8Var, TriggeredLinksMetadata triggeredLinksMetadata, String str, String str2, int i10) {
        this.f15665e = z8Var;
        this.f15661a = triggeredLinksMetadata;
        this.f15662b = str;
        this.f15663c = str2;
        this.f15664d = i10;
    }

    public void run() {
        try {
            this.f15665e.a(this.f15661a, "Periodic", this.f15662b, this.f15663c);
        } catch (Throwable th) {
            if (this.f15665e.a(1)) {
                i3.a(th);
            }
        } finally {
            this.f15665e.a(this.f15662b, this.f15664d);
            this.f15665e.a(0);
        }
    }
}
