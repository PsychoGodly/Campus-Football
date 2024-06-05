package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ro;
import com.applovin.impl.wl;
import java.util.Collections;

final class r1 extends wl {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f11108e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f11109b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11110c;

    /* renamed from: d  reason: collision with root package name */
    private int f11111d;

    public r1(ro roVar) {
        super(roVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(yg ygVar) {
        if (!this.f11109b) {
            int w10 = ygVar.w();
            int i10 = (w10 >> 4) & 15;
            this.f11111d = i10;
            if (i10 == 2) {
                this.f13099a.a(new d9.b().f("audio/mpeg").c(1).n(f11108e[(w10 >> 2) & 3]).a());
                this.f11110c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f13099a.a(new d9.b().f(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).n(8000).a());
                this.f11110c = true;
            } else if (i10 != 10) {
                throw new wl.a("Audio format not supported: " + this.f11111d);
            }
            this.f11109b = true;
        } else {
            ygVar.g(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(yg ygVar, long j10) {
        if (this.f11111d == 2) {
            int a10 = ygVar.a();
            this.f13099a.a(ygVar, a10);
            this.f13099a.a(j10, 1, a10, 0, (ro.a) null);
            return true;
        }
        int w10 = ygVar.w();
        if (w10 == 0 && !this.f11110c) {
            int a11 = ygVar.a();
            byte[] bArr = new byte[a11];
            ygVar.a(bArr, 0, a11);
            a.b a12 = a.a(bArr);
            this.f13099a.a(new d9.b().f("audio/mp4a-latm").a(a12.f6275c).c(a12.f6274b).n(a12.f6273a).a(Collections.singletonList(bArr)).a());
            this.f11110c = true;
            return false;
        } else if (this.f11111d == 10 && w10 != 1) {
            return false;
        } else {
            int a13 = ygVar.a();
            this.f13099a.a(ygVar, a13);
            this.f13099a.a(j10, 1, a13, 0, (ro.a) null);
            return true;
        }
    }
}
