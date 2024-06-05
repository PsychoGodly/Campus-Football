package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;

public final class ga implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final jj f7936a;

    /* renamed from: b  reason: collision with root package name */
    private String f7937b;

    /* renamed from: c  reason: collision with root package name */
    private ro f7938c;

    /* renamed from: d  reason: collision with root package name */
    private a f7939d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7940e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f7941f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final tf f7942g = new tf(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final tf f7943h = new tf(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final tf f7944i = new tf(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final tf f7945j = new tf(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final tf f7946k = new tf(40, 128);

    /* renamed from: l  reason: collision with root package name */
    private long f7947l;

    /* renamed from: m  reason: collision with root package name */
    private long f7948m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final yg f7949n = new yg();

    public ga(jj jjVar) {
        this.f7936a = jjVar;
    }

    private static void b(zg zgVar) {
        int f10 = zgVar.f();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < f10; i11++) {
            if (i11 != 0) {
                z10 = zgVar.c();
            }
            if (z10) {
                zgVar.g();
                zgVar.f();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (zgVar.c()) {
                        zgVar.g();
                    }
                }
            } else {
                int f11 = zgVar.f();
                int f12 = zgVar.f();
                int i13 = f11 + f12;
                for (int i14 = 0; i14 < f11; i14++) {
                    zgVar.f();
                    zgVar.g();
                }
                for (int i15 = 0; i15 < f12; i15++) {
                    zgVar.f();
                    zgVar.g();
                }
                i10 = i13;
            }
        }
    }

    private void c() {
        a1.b((Object) this.f7938c);
        yp.a((Object) this.f7939d);
    }

    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int d10 = ygVar.d();
            int e10 = ygVar.e();
            byte[] c10 = ygVar.c();
            this.f7947l += (long) ygVar.a();
            this.f7938c.a(ygVar, ygVar.a());
            while (true) {
                if (d10 < e10) {
                    int a10 = uf.a(c10, d10, e10, this.f7941f);
                    if (a10 == e10) {
                        a(c10, d10, e10);
                        return;
                    }
                    int a11 = uf.a(c10, a10);
                    int i10 = a10 - d10;
                    if (i10 > 0) {
                        a(c10, d10, a10);
                    }
                    int i11 = e10 - a10;
                    long j10 = this.f7947l - ((long) i11);
                    int i12 = i10 < 0 ? -i10 : 0;
                    long j11 = j10;
                    int i13 = i11;
                    a(j11, i13, i12, this.f7948m);
                    b(j11, i13, a11, this.f7948m);
                    d10 = a10 + 3;
                }
            }
        }
    }

    public void b() {
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ro f7950a;

        /* renamed from: b  reason: collision with root package name */
        private long f7951b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f7952c;

        /* renamed from: d  reason: collision with root package name */
        private int f7953d;

        /* renamed from: e  reason: collision with root package name */
        private long f7954e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7955f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f7956g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f7957h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f7958i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f7959j;

        /* renamed from: k  reason: collision with root package name */
        private long f7960k;

        /* renamed from: l  reason: collision with root package name */
        private long f7961l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f7962m;

        public a(ro roVar) {
            this.f7950a = roVar;
        }

        private static boolean a(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean b(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void c(int i10) {
            long j10 = this.f7961l;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f7962m;
                this.f7950a.a(j10, z10 ? 1 : 0, (int) (this.f7951b - this.f7960k), i10, (ro.a) null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f7959j && this.f7956g) {
                this.f7962m = this.f7952c;
                this.f7959j = false;
            } else if (this.f7957h || this.f7956g) {
                if (z10 && this.f7958i) {
                    c(i10 + ((int) (j10 - this.f7951b)));
                }
                this.f7960k = this.f7951b;
                this.f7961l = this.f7954e;
                this.f7962m = this.f7952c;
                this.f7958i = true;
            }
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f7955f) {
                int i12 = this.f7953d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f7956g = (bArr[i13] & 128) != 0;
                    this.f7955f = false;
                    return;
                }
                this.f7953d = i12 + (i11 - i10);
            }
        }

        public void a() {
            this.f7955f = false;
            this.f7956g = false;
            this.f7957h = false;
            this.f7958i = false;
            this.f7959j = false;
        }

        public void a(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f7956g = false;
            this.f7957h = false;
            this.f7954e = j11;
            this.f7953d = 0;
            this.f7951b = j10;
            if (!b(i11)) {
                if (this.f7958i && !this.f7959j) {
                    if (z10) {
                        c(i10);
                    }
                    this.f7958i = false;
                }
                if (a(i11)) {
                    this.f7957h = !this.f7959j;
                    this.f7959j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f7952c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f7955f = z11;
        }
    }

    private void b(long j10, int i10, int i11, long j11) {
        this.f7939d.a(j10, i10, i11, j11, this.f7940e);
        if (!this.f7940e) {
            this.f7942g.b(i11);
            this.f7943h.b(i11);
            this.f7944i.b(i11);
        }
        this.f7945j.b(i11);
        this.f7946k.b(i11);
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7937b = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 2);
        this.f7938c = a10;
        this.f7939d = new a(a10);
        this.f7936a.a(k8Var, dVar);
    }

    private void a(long j10, int i10, int i11, long j11) {
        this.f7939d.a(j10, i10, this.f7940e);
        if (!this.f7940e) {
            this.f7942g.a(i11);
            this.f7943h.a(i11);
            this.f7944i.a(i11);
            if (this.f7942g.a() && this.f7943h.a() && this.f7944i.a()) {
                this.f7938c.a(a(this.f7937b, this.f7942g, this.f7943h, this.f7944i));
                this.f7940e = true;
            }
        }
        if (this.f7945j.a(i11)) {
            tf tfVar = this.f7945j;
            this.f7949n.a(this.f7945j.f12406d, uf.c(tfVar.f12406d, tfVar.f12407e));
            this.f7949n.g(5);
            this.f7936a.a(j11, this.f7949n);
        }
        if (this.f7946k.a(i11)) {
            tf tfVar2 = this.f7946k;
            this.f7949n.a(this.f7946k.f12406d, uf.c(tfVar2.f12406d, tfVar2.f12407e));
            this.f7949n.g(5);
            this.f7936a.a(j11, this.f7949n);
        }
    }

    private void a(byte[] bArr, int i10, int i11) {
        this.f7939d.a(bArr, i10, i11);
        if (!this.f7940e) {
            this.f7942g.a(bArr, i10, i11);
            this.f7943h.a(bArr, i10, i11);
            this.f7944i.a(bArr, i10, i11);
        }
        this.f7945j.a(bArr, i10, i11);
        this.f7946k.a(bArr, i10, i11);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7948m = j10;
        }
    }

    private static d9 a(String str, tf tfVar, tf tfVar2, tf tfVar3) {
        tf tfVar4 = tfVar;
        tf tfVar5 = tfVar2;
        tf tfVar6 = tfVar3;
        int i10 = tfVar4.f12407e;
        byte[] bArr = new byte[(tfVar5.f12407e + i10 + tfVar6.f12407e)];
        System.arraycopy(tfVar4.f12406d, 0, bArr, 0, i10);
        System.arraycopy(tfVar5.f12406d, 0, bArr, tfVar4.f12407e, tfVar5.f12407e);
        System.arraycopy(tfVar6.f12406d, 0, bArr, tfVar4.f12407e + tfVar5.f12407e, tfVar6.f12407e);
        zg zgVar = new zg(tfVar5.f12406d, 0, tfVar5.f12407e);
        zgVar.d(44);
        int b10 = zgVar.b(3);
        zgVar.g();
        zgVar.d(88);
        zgVar.d(8);
        int i11 = 0;
        for (int i12 = 0; i12 < b10; i12++) {
            if (zgVar.c()) {
                i11 += 89;
            }
            if (zgVar.c()) {
                i11 += 8;
            }
        }
        zgVar.d(i11);
        if (b10 > 0) {
            zgVar.d((8 - b10) * 2);
        }
        zgVar.f();
        int f10 = zgVar.f();
        if (f10 == 3) {
            zgVar.g();
        }
        int f11 = zgVar.f();
        int f12 = zgVar.f();
        if (zgVar.c()) {
            int f13 = zgVar.f();
            int f14 = zgVar.f();
            int f15 = zgVar.f();
            int f16 = zgVar.f();
            int i13 = 1;
            int i14 = (f10 == 1 || f10 == 2) ? 2 : 1;
            if (f10 == 1) {
                i13 = 2;
            }
            f11 -= i14 * (f13 + f14);
            f12 -= i13 * (f15 + f16);
        }
        zgVar.f();
        zgVar.f();
        int f17 = zgVar.f();
        for (int i15 = zgVar.c() ? 0 : b10; i15 <= b10; i15++) {
            zgVar.f();
            zgVar.f();
            zgVar.f();
        }
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        if (zgVar.c() && zgVar.c()) {
            a(zgVar);
        }
        zgVar.d(2);
        if (zgVar.c()) {
            zgVar.d(8);
            zgVar.f();
            zgVar.f();
            zgVar.g();
        }
        b(zgVar);
        if (zgVar.c()) {
            for (int i16 = 0; i16 < zgVar.f(); i16++) {
                zgVar.d(f17 + 5);
            }
        }
        zgVar.d(2);
        float f18 = 1.0f;
        if (zgVar.c()) {
            if (zgVar.c()) {
                int b11 = zgVar.b(8);
                if (b11 == 255) {
                    int b12 = zgVar.b(16);
                    int b13 = zgVar.b(16);
                    if (!(b12 == 0 || b13 == 0)) {
                        f18 = ((float) b12) / ((float) b13);
                    }
                } else {
                    float[] fArr = uf.f12562b;
                    if (b11 < fArr.length) {
                        f18 = fArr[b11];
                    } else {
                        kc.d("H265Reader", "Unexpected aspect_ratio_idc value: " + b11);
                    }
                }
            }
            if (zgVar.c()) {
                zgVar.g();
            }
            if (zgVar.c()) {
                zgVar.d(4);
                if (zgVar.c()) {
                    zgVar.d(24);
                }
            }
            if (zgVar.c()) {
                zgVar.f();
                zgVar.f();
            }
            zgVar.g();
            if (zgVar.c()) {
                f12 *= 2;
            }
        }
        zgVar.a(tfVar5.f12406d, 0, tfVar5.f12407e);
        zgVar.d(24);
        return new d9.b().c(str).f(MimeTypes.VIDEO_H265).a(m3.a(zgVar)).q(f11).g(f12).b(f18).a(Collections.singletonList(bArr)).a();
    }

    public void a() {
        this.f7947l = 0;
        this.f7948m = -9223372036854775807L;
        uf.a(this.f7941f);
        this.f7942g.b();
        this.f7943h.b();
        this.f7944i.b();
        this.f7945j.b();
        this.f7946k.b();
        a aVar = this.f7939d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void a(zg zgVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!zgVar.c()) {
                    zgVar.f();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        zgVar.e();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        zgVar.e();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }
}
