package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static r f15474b;

    /* renamed from: c  reason: collision with root package name */
    private static final s f15475c = new s(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private s f15476a;

    private r() {
    }

    public static synchronized r b() {
        r rVar;
        synchronized (r.class) {
            if (f15474b == null) {
                f15474b = new r();
            }
            rVar = f15474b;
        }
        return rVar;
    }

    public s a() {
        return this.f15476a;
    }

    public final synchronized void c(s sVar) {
        if (sVar == null) {
            this.f15476a = f15475c;
            return;
        }
        s sVar2 = this.f15476a;
        if (sVar2 == null || sVar2.z() < sVar.z()) {
            this.f15476a = sVar;
        }
    }
}
