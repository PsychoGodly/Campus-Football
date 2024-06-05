package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class l8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ m8 f24767a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ int f24768b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Exception f24769c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ byte[] f24770d;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Map f24771f;

    public /* synthetic */ l8(m8 m8Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f24767a = m8Var;
        this.f24768b = i10;
        this.f24769c = exc;
        this.f24770d = bArr;
        this.f24771f = map;
    }

    public final void run() {
        this.f24767a.a(this.f24768b, this.f24769c, this.f24770d, this.f24771f);
    }
}
