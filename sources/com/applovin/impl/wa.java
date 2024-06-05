package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;

public final class wa implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final yg f13029a = new yg(10);

    /* renamed from: b  reason: collision with root package name */
    private ro f13030b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13031c;

    /* renamed from: d  reason: collision with root package name */
    private long f13032d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    private int f13033e;

    /* renamed from: f  reason: collision with root package name */
    private int f13034f;

    public void a(yg ygVar) {
        a1.b((Object) this.f13030b);
        if (this.f13031c) {
            int a10 = ygVar.a();
            int i10 = this.f13034f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(ygVar.c(), ygVar.d(), this.f13029a.c(), this.f13034f, min);
                if (this.f13034f + min == 10) {
                    this.f13029a.f(0);
                    if (73 == this.f13029a.w() && 68 == this.f13029a.w() && 51 == this.f13029a.w()) {
                        this.f13029a.g(3);
                        this.f13033e = this.f13029a.v() + 10;
                    } else {
                        kc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f13031c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f13033e - this.f13034f);
            this.f13030b.a(ygVar, min2);
            this.f13034f += min2;
        }
    }

    public void b() {
        int i10;
        a1.b((Object) this.f13030b);
        if (this.f13031c && (i10 = this.f13033e) != 0 && this.f13034f == i10) {
            long j10 = this.f13032d;
            if (j10 != -9223372036854775807L) {
                this.f13030b.a(j10, 1, i10, 0, (ro.a) null);
            }
            this.f13031c = false;
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        ro a10 = k8Var.a(dVar.c(), 5);
        this.f13030b = a10;
        a10.a(new d9.b().c(dVar.b()).f("application/id3").a());
    }

    public void a(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f13031c = true;
            if (j10 != -9223372036854775807L) {
                this.f13032d = j10;
            }
            this.f13033e = 0;
            this.f13034f = 0;
        }
    }

    public void a() {
        this.f13031c = false;
        this.f13032d = -9223372036854775807L;
    }
}
