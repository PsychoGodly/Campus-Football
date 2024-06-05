package io.grpc.internal;

import dd.j1;
import dd.m0;
import dd.o0;
import dd.y0;
import io.grpc.internal.a;
import java.nio.charset.Charset;
import r6.e;
import r6.o;

/* compiled from: Http2ClientStreamTransportState */
public abstract class u0 extends a.c {

    /* renamed from: w  reason: collision with root package name */
    private static final m0.a<Integer> f35401w;

    /* renamed from: x  reason: collision with root package name */
    private static final y0.g<Integer> f35402x;

    /* renamed from: s  reason: collision with root package name */
    private j1 f35403s;

    /* renamed from: t  reason: collision with root package name */
    private y0 f35404t;

    /* renamed from: u  reason: collision with root package name */
    private Charset f35405u = e.f29803c;

    /* renamed from: v  reason: collision with root package name */
    private boolean f35406v;

    /* compiled from: Http2ClientStreamTransportState */
    class a implements m0.a<Integer> {
        a() {
        }

        /* renamed from: c */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, m0.f32299a));
        }

        /* renamed from: d */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f35401w = aVar;
        f35402x = m0.b(":status", aVar);
    }

    protected u0(int i10, i2 i2Var, o2 o2Var) {
        super(i10, i2Var, o2Var);
    }

    private static Charset O(y0 y0Var) {
        String str = (String) y0Var.g(r0.f35309j);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return e.f29803c;
    }

    private j1 Q(y0 y0Var) {
        j1 j1Var;
        j1 j1Var2 = (j1) y0Var.g(o0.f32319b);
        if (j1Var2 != null) {
            return j1Var2.q((String) y0Var.g(o0.f32318a));
        }
        if (this.f35406v) {
            return j1.f32235h.q("missing GRPC status in response");
        }
        Integer num = (Integer) y0Var.g(f35402x);
        if (num != null) {
            j1Var = r0.l(num.intValue());
        } else {
            j1Var = j1.f32247t.q("missing HTTP status code");
        }
        return j1Var.e("missing GRPC status, inferred error from HTTP status code");
    }

    private static void R(y0 y0Var) {
        y0Var.e(f35402x);
        y0Var.e(o0.f32319b);
        y0Var.e(o0.f32318a);
    }

    private j1 V(y0 y0Var) {
        Integer num = (Integer) y0Var.g(f35402x);
        if (num == null) {
            return j1.f32247t.q("Missing HTTP status code");
        }
        String str = (String) y0Var.g(r0.f35309j);
        if (r0.m(str)) {
            return null;
        }
        j1 l10 = r0.l(num.intValue());
        return l10.e("invalid content-type: " + str);
    }

    /* access modifiers changed from: protected */
    public abstract void P(j1 j1Var, boolean z10, y0 y0Var);

    /* access modifiers changed from: protected */
    public void S(v1 v1Var, boolean z10) {
        j1 j1Var = this.f35403s;
        if (j1Var != null) {
            this.f35403s = j1Var.e("DATA-----------------------------\n" + w1.e(v1Var, this.f35405u));
            v1Var.close();
            if (this.f35403s.n().length() > 1000 || z10) {
                P(this.f35403s, false, this.f35404t);
            }
        } else if (!this.f35406v) {
            P(j1.f32247t.q("headers not received before payload"), false, new y0());
        } else {
            int d10 = v1Var.d();
            D(v1Var);
            if (z10) {
                if (d10 > 0) {
                    this.f35403s = j1.f32247t.q("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f35403s = j1.f32247t.q("Received unexpected EOS on empty DATA frame from server");
                }
                y0 y0Var = new y0();
                this.f35404t = y0Var;
                N(this.f35403s, false, y0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void T(y0 y0Var) {
        o.p(y0Var, "headers");
        j1 j1Var = this.f35403s;
        if (j1Var != null) {
            this.f35403s = j1Var.e("headers: " + y0Var);
            return;
        }
        try {
            if (this.f35406v) {
                j1 q10 = j1.f32247t.q("Received headers twice");
                this.f35403s = q10;
                if (q10 != null) {
                    this.f35403s = q10.e("headers: " + y0Var);
                    this.f35404t = y0Var;
                    this.f35405u = O(y0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) y0Var.g(f35402x);
            if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                this.f35406v = true;
                j1 V = V(y0Var);
                this.f35403s = V;
                if (V == null) {
                    R(y0Var);
                    E(y0Var);
                    j1 j1Var2 = this.f35403s;
                    if (j1Var2 != null) {
                        this.f35403s = j1Var2.e("headers: " + y0Var);
                        this.f35404t = y0Var;
                        this.f35405u = O(y0Var);
                    }
                } else if (V != null) {
                    this.f35403s = V.e("headers: " + y0Var);
                    this.f35404t = y0Var;
                    this.f35405u = O(y0Var);
                }
            }
        } finally {
            j1 j1Var3 = this.f35403s;
            if (j1Var3 != null) {
                this.f35403s = j1Var3.e("headers: " + y0Var);
                this.f35404t = y0Var;
                this.f35405u = O(y0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void U(y0 y0Var) {
        o.p(y0Var, "trailers");
        if (this.f35403s == null && !this.f35406v) {
            j1 V = V(y0Var);
            this.f35403s = V;
            if (V != null) {
                this.f35404t = y0Var;
            }
        }
        j1 j1Var = this.f35403s;
        if (j1Var != null) {
            j1 e10 = j1Var.e("trailers: " + y0Var);
            this.f35403s = e10;
            P(e10, false, this.f35404t);
            return;
        }
        j1 Q = Q(y0Var);
        R(y0Var);
        F(y0Var, Q);
    }

    public /* bridge */ /* synthetic */ void c(boolean z10) {
        super.c(z10);
    }
}
