package com.google.android.gms.measurement.internal;

import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class q4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f24957a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24958b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f24959c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f24960d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Object f24961f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ n4 f24962g;

    q4(n4 n4Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f24962g = n4Var;
        this.f24957a = i10;
        this.f24958b = str;
        this.f24959c = obj;
        this.f24960d = obj2;
        this.f24961f = obj3;
    }

    public final void run() {
        y4 A = this.f24962g.f25124a.A();
        if (!A.m()) {
            this.f24962g.t(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f24962g.f24847c == 0) {
            if (this.f24962g.a().O()) {
                this.f24962g.f24847c = 'C';
            } else {
                this.f24962g.f24847c = 'c';
            }
        }
        if (this.f24962g.f24848d < 0) {
            this.f24962g.f24848d = 82001;
        }
        String str = CommonGetHeaderBiddingToken.HB_TOKEN_VERSION + "01VDIWEA?".charAt(this.f24957a) + this.f24962g.f24847c + this.f24962g.f24848d + ":" + n4.s(true, this.f24958b, this.f24959c, this.f24960d, this.f24961f);
        if (str.length() > 1024) {
            str = this.f24958b.substring(0, 1024);
        }
        c5 c5Var = A.f25266d;
        if (c5Var != null) {
            c5Var.b(str, 1);
        }
    }
}
