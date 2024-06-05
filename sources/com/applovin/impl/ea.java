package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;
import java.util.Arrays;
import java.util.Collections;

public final class ea implements o7 {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f7381l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final wp f7382a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f7383b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f7384c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f7385d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final tf f7386e;

    /* renamed from: f  reason: collision with root package name */
    private b f7387f;

    /* renamed from: g  reason: collision with root package name */
    private long f7388g;

    /* renamed from: h  reason: collision with root package name */
    private String f7389h;

    /* renamed from: i  reason: collision with root package name */
    private ro f7390i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7391j;

    /* renamed from: k  reason: collision with root package name */
    private long f7392k = -9223372036854775807L;

    ea(wp wpVar) {
        this.f7382a = wpVar;
        if (wpVar != null) {
            this.f7386e = new tf(178, 128);
            this.f7383b = new yg();
            return;
        }
        this.f7386e = null;
        this.f7383b = null;
    }

    public void a(yg ygVar) {
        a1.b((Object) this.f7387f);
        a1.b((Object) this.f7390i);
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        byte[] c10 = ygVar.c();
        this.f7388g += (long) ygVar.a();
        this.f7390i.a(ygVar, ygVar.a());
        while (true) {
            int a10 = uf.a(c10, d10, e10, this.f7384c);
            if (a10 == e10) {
                break;
            }
            int i10 = a10 + 3;
            byte b10 = ygVar.c()[i10] & 255;
            int i11 = a10 - d10;
            int i12 = 0;
            if (!this.f7391j) {
                if (i11 > 0) {
                    this.f7385d.a(c10, d10, a10);
                }
                if (this.f7385d.a(b10, i11 < 0 ? -i11 : 0)) {
                    ro roVar = this.f7390i;
                    a aVar = this.f7385d;
                    roVar.a(a(aVar, aVar.f7397d, (String) a1.a((Object) this.f7389h)));
                    this.f7391j = true;
                }
            }
            this.f7387f.a(c10, d10, a10);
            tf tfVar = this.f7386e;
            if (tfVar != null) {
                if (i11 > 0) {
                    tfVar.a(c10, d10, a10);
                } else {
                    i12 = -i11;
                }
                if (this.f7386e.a(i12)) {
                    tf tfVar2 = this.f7386e;
                    ((yg) yp.a((Object) this.f7383b)).a(this.f7386e.f12406d, uf.c(tfVar2.f12406d, tfVar2.f12407e));
                    ((wp) yp.a((Object) this.f7382a)).a(this.f7392k, this.f7383b);
                }
                if (b10 == 178 && ygVar.c()[a10 + 2] == 1) {
                    this.f7386e.b(b10);
                }
            }
            int i13 = e10 - a10;
            this.f7387f.a(this.f7388g - ((long) i13), i13, this.f7391j);
            this.f7387f.a(b10, this.f7392k);
            d10 = i10;
        }
        if (!this.f7391j) {
            this.f7385d.a(c10, d10, e10);
        }
        this.f7387f.a(c10, d10, e10);
        tf tfVar3 = this.f7386e;
        if (tfVar3 != null) {
            tfVar3.a(c10, d10, e10);
        }
    }

    public void b() {
    }

    private static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f7393f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f7394a;

        /* renamed from: b  reason: collision with root package name */
        private int f7395b;

        /* renamed from: c  reason: collision with root package name */
        public int f7396c;

        /* renamed from: d  reason: collision with root package name */
        public int f7397d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f7398e;

        public a(int i10) {
            this.f7398e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f7394a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f7398e;
                int length = bArr2.length;
                int i13 = this.f7396c + i12;
                if (length < i13) {
                    this.f7398e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f7398e, this.f7396c, i12);
                this.f7396c += i12;
            }
        }

        public boolean a(int i10, int i11) {
            int i12 = this.f7395b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f7396c -= i11;
                                this.f7394a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            kc.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f7397d = this.f7396c;
                            this.f7395b = 4;
                        }
                    } else if (i10 > 31) {
                        kc.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f7395b = 3;
                    }
                } else if (i10 != 181) {
                    kc.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f7395b = 2;
                }
            } else if (i10 == 176) {
                this.f7395b = 1;
                this.f7394a = true;
            }
            byte[] bArr = f7393f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f7394a = false;
            this.f7396c = 0;
            this.f7395b = 0;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ro f7399a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7400b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f7401c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f7402d;

        /* renamed from: e  reason: collision with root package name */
        private int f7403e;

        /* renamed from: f  reason: collision with root package name */
        private int f7404f;

        /* renamed from: g  reason: collision with root package name */
        private long f7405g;

        /* renamed from: h  reason: collision with root package name */
        private long f7406h;

        public b(ro roVar) {
            this.f7399a = roVar;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f7401c) {
                int i12 = this.f7404f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f7402d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f7401c = false;
                    return;
                }
                this.f7404f = i12 + (i11 - i10);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f7403e == 182 && z10 && this.f7400b) {
                long j11 = this.f7406h;
                if (j11 != -9223372036854775807L) {
                    int i11 = (int) (j10 - this.f7405g);
                    this.f7399a.a(j11, this.f7402d ? 1 : 0, i11, i10, (ro.a) null);
                }
            }
            if (this.f7403e != 179) {
                this.f7405g = j10;
            }
        }

        public void a(int i10, long j10) {
            this.f7403e = i10;
            this.f7402d = false;
            boolean z10 = true;
            this.f7400b = i10 == 182 || i10 == 179;
            if (i10 != 182) {
                z10 = false;
            }
            this.f7401c = z10;
            this.f7404f = 0;
            this.f7406h = j10;
        }

        public void a() {
            this.f7400b = false;
            this.f7401c = false;
            this.f7402d = false;
            this.f7403e = -1;
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7389h = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 2);
        this.f7390i = a10;
        this.f7387f = new b(a10);
        wp wpVar = this.f7382a;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7392k = j10;
        }
    }

    private static d9 a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f7398e, aVar.f7396c);
        xg xgVar = new xg(copyOf);
        xgVar.e(i10);
        xgVar.e(4);
        xgVar.g();
        xgVar.d(8);
        if (xgVar.f()) {
            xgVar.d(4);
            xgVar.d(3);
        }
        int a10 = xgVar.a(4);
        float f10 = 1.0f;
        if (a10 == 15) {
            int a11 = xgVar.a(8);
            int a12 = xgVar.a(8);
            if (a12 == 0) {
                kc.d("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = ((float) a11) / ((float) a12);
            }
        } else {
            float[] fArr = f7381l;
            if (a10 < fArr.length) {
                f10 = fArr[a10];
            } else {
                kc.d("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xgVar.f()) {
            xgVar.d(2);
            xgVar.d(1);
            if (xgVar.f()) {
                xgVar.d(15);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
                xgVar.d(3);
                xgVar.d(11);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
            }
        }
        if (xgVar.a(2) != 0) {
            kc.d("H263Reader", "Unhandled video object layer shape");
        }
        xgVar.g();
        int a13 = xgVar.a(16);
        xgVar.g();
        if (xgVar.f()) {
            if (a13 == 0) {
                kc.d("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = a13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                xgVar.d(i11);
            }
        }
        xgVar.g();
        int a14 = xgVar.a(13);
        xgVar.g();
        int a15 = xgVar.a(13);
        xgVar.g();
        xgVar.g();
        return new d9.b().c(str).f("video/mp4v-es").q(a14).g(a15).b(f10).a(Collections.singletonList(copyOf)).a();
    }

    public void a() {
        uf.a(this.f7384c);
        this.f7385d.a();
        b bVar = this.f7387f;
        if (bVar != null) {
            bVar.a();
        }
        tf tfVar = this.f7386e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.f7388g = 0;
        this.f7392k = -9223372036854775807L;
    }
}
