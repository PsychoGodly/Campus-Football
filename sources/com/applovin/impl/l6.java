package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.ArrayList;
import java.util.List;

public final class l6 implements ep.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f9197a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9198b;

    public l6(int i10) {
        this(i10, ab.h());
    }

    private wp b(ep.b bVar) {
        return new wp(c(bVar));
    }

    private List c(ep.b bVar) {
        String str;
        int i10;
        if (a(32)) {
            return this.f9198b;
        }
        yg ygVar = new yg(bVar.f7493d);
        List list = this.f9198b;
        while (ygVar.a() > 0) {
            int w10 = ygVar.w();
            int d10 = ygVar.d() + ygVar.w();
            if (w10 == 134) {
                list = new ArrayList();
                int w11 = ygVar.w() & 31;
                for (int i11 = 0; i11 < w11; i11++) {
                    String c10 = ygVar.c(3);
                    int w12 = ygVar.w();
                    boolean z10 = true;
                    boolean z11 = (w12 & 128) != 0;
                    if (z11) {
                        i10 = w12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte w13 = (byte) ygVar.w();
                    ygVar.g(1);
                    List list2 = null;
                    if (z11) {
                        if ((w13 & 64) == 0) {
                            z10 = false;
                        }
                        list2 = m3.a(z10);
                    }
                    list.add(new d9.b().f(str).e(c10).a(i10).a(list2).a());
                }
            }
            ygVar.f(d10);
        }
        return list;
    }

    public ep a(int i10, ep.b bVar) {
        if (i10 == 2) {
            return new fh(new da(b(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new fh(new nf(bVar.f7491b));
        }
        if (i10 == 21) {
            return new fh(new wa());
        }
        if (i10 != 27) {
            if (i10 == 36) {
                return new fh(new ga(a(bVar)));
            }
            if (i10 == 89) {
                return new fh(new k7(bVar.f7492c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new fh(new m(bVar.f7491b));
                }
                if (i10 == 257) {
                    return new dj(new bh("application/vnd.dvb.ait"));
                }
                if (i10 != 129) {
                    if (i10 != 130) {
                        if (i10 != 134) {
                            if (i10 != 135) {
                                switch (i10) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new fh(new k0(false, bVar.f7491b));
                                    case 16:
                                        return new fh(new ea(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new fh(new wb(bVar.f7491b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (a(16)) {
                            return null;
                        } else {
                            return new dj(new bh("application/x-scte35"));
                        }
                    } else if (!a(64)) {
                        return null;
                    }
                }
                return new fh(new j(bVar.f7491b));
            }
            return new fh(new c7(bVar.f7491b));
        } else if (a(4)) {
            return null;
        } else {
            return new fh(new fa(a(bVar), a(1), a(8)));
        }
    }

    public l6(int i10, List list) {
        this.f9197a = i10;
        this.f9198b = list;
    }

    private boolean a(int i10) {
        return (i10 & this.f9197a) != 0;
    }

    public SparseArray a() {
        return new SparseArray();
    }

    private jj a(ep.b bVar) {
        return new jj(c(bVar));
    }
}
