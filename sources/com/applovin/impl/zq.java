package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ro;
import com.applovin.impl.wl;
import com.unity3d.services.core.device.MimeTypes;

final class zq extends wl {

    /* renamed from: b  reason: collision with root package name */
    private final yg f13966b = new yg(uf.f12561a);

    /* renamed from: c  reason: collision with root package name */
    private final yg f13967c = new yg(4);

    /* renamed from: d  reason: collision with root package name */
    private int f13968d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13969e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13970f;

    /* renamed from: g  reason: collision with root package name */
    private int f13971g;

    public zq(ro roVar) {
        super(roVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(yg ygVar) {
        int w10 = ygVar.w();
        int i10 = (w10 >> 4) & 15;
        int i11 = w10 & 15;
        if (i11 == 7) {
            this.f13971g = i10;
            return i10 != 5;
        }
        throw new wl.a("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public boolean b(yg ygVar, long j10) {
        int w10 = ygVar.w();
        long k10 = j10 + (((long) ygVar.k()) * 1000);
        if (w10 == 0 && !this.f13969e) {
            yg ygVar2 = new yg(new byte[ygVar.a()]);
            ygVar.a(ygVar2.c(), 0, ygVar.a());
            v1 b10 = v1.b(ygVar2);
            this.f13968d = b10.f12651b;
            this.f13099a.a(new d9.b().f(MimeTypes.VIDEO_H264).a(b10.f12655f).q(b10.f12652c).g(b10.f12653d).b(b10.f12654e).a(b10.f12650a).a());
            this.f13969e = true;
            return false;
        } else if (w10 != 1 || !this.f13969e) {
            return false;
        } else {
            int i10 = this.f13971g == 1 ? 1 : 0;
            if (!this.f13970f && i10 == 0) {
                return false;
            }
            byte[] c10 = this.f13967c.c();
            c10[0] = 0;
            c10[1] = 0;
            c10[2] = 0;
            int i11 = 4 - this.f13968d;
            int i12 = 0;
            while (ygVar.a() > 0) {
                ygVar.a(this.f13967c.c(), i11, this.f13968d);
                this.f13967c.f(0);
                int A = this.f13967c.A();
                this.f13966b.f(0);
                this.f13099a.a(this.f13966b, 4);
                this.f13099a.a(ygVar, A);
                i12 = i12 + 4 + A;
            }
            this.f13099a.a(k10, i10, i12, 0, (ro.a) null);
            this.f13970f = true;
            return true;
        }
    }
}
