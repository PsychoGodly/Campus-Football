package com.google.android.exoplayer2.source.dash;

import h3.c;
import java.io.IOException;
import k4.n0;
import n2.r1;
import n2.s1;
import p3.q0;
import q2.g;
import t3.f;

/* compiled from: EventSampleStream */
final class d implements q0 {

    /* renamed from: a  reason: collision with root package name */
    private final r1 f14297a;

    /* renamed from: b  reason: collision with root package name */
    private final c f14298b = new c();

    /* renamed from: c  reason: collision with root package name */
    private long[] f14299c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14300d;

    /* renamed from: f  reason: collision with root package name */
    private f f14301f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14302g;

    /* renamed from: h  reason: collision with root package name */
    private int f14303h;

    /* renamed from: i  reason: collision with root package name */
    private long f14304i = -9223372036854775807L;

    public d(f fVar, r1 r1Var, boolean z10) {
        this.f14297a = r1Var;
        this.f14301f = fVar;
        this.f14299c = fVar.f22617b;
        d(fVar, z10);
    }

    public void a() throws IOException {
    }

    public String b() {
        return this.f14301f.a();
    }

    public void c(long j10) {
        boolean z10 = true;
        int e10 = n0.e(this.f14299c, j10, true, false);
        this.f14303h = e10;
        if (!this.f14300d || e10 != this.f14299c.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = -9223372036854775807L;
        }
        this.f14304i = j10;
    }

    public void d(f fVar, boolean z10) {
        int i10 = this.f14303h;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f14299c[i10 - 1];
        this.f14300d = z10;
        this.f14301f = fVar;
        long[] jArr = fVar.f22617b;
        this.f14299c = jArr;
        long j11 = this.f14304i;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f14303h = n0.e(jArr, j10, false, false);
        }
    }

    public int e(long j10) {
        int max = Math.max(this.f14303h, n0.e(this.f14299c, j10, true, false));
        int i10 = max - this.f14303h;
        this.f14303h = max;
        return i10;
    }

    public boolean isReady() {
        return true;
    }

    public int j(s1 s1Var, g gVar, int i10) {
        int i11 = this.f14303h;
        boolean z10 = i11 == this.f14299c.length;
        if (z10 && !this.f14300d) {
            gVar.p(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f14302g) {
            s1Var.f20721b = this.f14297a;
            this.f14302g = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            if ((i10 & 1) == 0) {
                this.f14303h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f14298b.a(this.f14301f.f22616a[i11]);
                gVar.r(a10.length);
                gVar.f21755c.put(a10);
            }
            gVar.f21757f = this.f14299c[i11];
            gVar.p(1);
            return -4;
        }
    }
}
