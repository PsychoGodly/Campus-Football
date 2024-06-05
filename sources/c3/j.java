package c3;

import android.util.SparseArray;
import c3.i0;
import java.util.ArrayList;
import java.util.List;
import k4.a0;
import k4.e;
import n2.r1;
import s6.u;

/* compiled from: DefaultTsPayloadReaderFactory */
public final class j implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f5764a;

    /* renamed from: b  reason: collision with root package name */
    private final List<r1> f5765b;

    public j(int i10) {
        this(i10, u.y());
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<r1> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f5765b;
        }
        a0 a0Var = new a0(bVar.f5758d);
        List<r1> list = this.f5765b;
        while (a0Var.a() > 0) {
            int G = a0Var.G();
            int f10 = a0Var.f() + a0Var.G();
            if (G == 134) {
                list = new ArrayList<>();
                int G2 = a0Var.G() & 31;
                for (int i11 = 0; i11 < G2; i11++) {
                    String D = a0Var.D(3);
                    int G3 = a0Var.G();
                    boolean z10 = true;
                    boolean z11 = (G3 & 128) != 0;
                    if (z11) {
                        i10 = G3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte G4 = (byte) a0Var.G();
                    a0Var.U(1);
                    List<byte[]> list2 = null;
                    if (z11) {
                        if ((G4 & 64) == 0) {
                            z10 = false;
                        }
                        list2 = e.b(z10);
                    }
                    list.add(new r1.b().g0(str).X(D).H(i10).V(list2).G());
                }
            }
            a0Var.T(f10);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f5764a) != 0;
    }

    public i0 a(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f5756b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 != 27) {
                if (i10 == 36) {
                    return new w(new q(c(bVar)));
                }
                if (i10 == 89) {
                    return new w(new l(bVar.f5757c));
                }
                if (i10 != 138) {
                    if (i10 == 172) {
                        return new w(new f(bVar.f5756b));
                    }
                    if (i10 == 257) {
                        return new c0(new v("application/vnd.dvb.ait"));
                    }
                    if (i10 != 134) {
                        if (i10 != 135) {
                            switch (i10) {
                                case 15:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new w(new i(false, bVar.f5756b));
                                case 16:
                                    return new w(new o(d(bVar)));
                                case 17:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new w(new s(bVar.f5756b));
                                default:
                                    switch (i10) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new w(new c(bVar.f5756b));
                    } else if (f(16)) {
                        return null;
                    } else {
                        return new c0(new v("application/x-scte35"));
                    }
                }
                return new w(new k(bVar.f5756b));
            } else if (f(4)) {
                return null;
            } else {
                return new w(new p(c(bVar), f(1), f(8)));
            }
        }
        return new w(new n(d(bVar)));
    }

    public SparseArray<i0> b() {
        return new SparseArray<>();
    }

    public j(int i10, List<r1> list) {
        this.f5764a = i10;
        this.f5765b = list;
    }
}
