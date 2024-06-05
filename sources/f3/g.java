package f3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f3.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k4.n0;
import n2.f;
import n2.q3;
import n2.r1;
import n2.s1;

/* compiled from: MetadataRenderer */
public final class g extends f implements Handler.Callback {

    /* renamed from: o  reason: collision with root package name */
    private final d f17989o;

    /* renamed from: p  reason: collision with root package name */
    private final f f17990p;

    /* renamed from: q  reason: collision with root package name */
    private final Handler f17991q;

    /* renamed from: r  reason: collision with root package name */
    private final e f17992r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f17993s;

    /* renamed from: t  reason: collision with root package name */
    private c f17994t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f17995u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f17996v;

    /* renamed from: w  reason: collision with root package name */
    private long f17997w;

    /* renamed from: x  reason: collision with root package name */
    private a f17998x;

    /* renamed from: y  reason: collision with root package name */
    private long f17999y;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f17987a);
    }

    private void P(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            r1 F = aVar.d(i10).F();
            if (F == null || !this.f17989o.a(F)) {
                list.add(aVar.d(i10));
            } else {
                c b10 = this.f17989o.b(F);
                byte[] bArr = (byte[]) k4.a.e(aVar.d(i10).a0());
                this.f17992r.g();
                this.f17992r.r(bArr.length);
                ((ByteBuffer) n0.j(this.f17992r.f21755c)).put(bArr);
                this.f17992r.s();
                a a10 = b10.a(this.f17992r);
                if (a10 != null) {
                    P(a10, list);
                }
            }
        }
    }

    private long Q(long j10) {
        boolean z10 = true;
        k4.a.f(j10 != -9223372036854775807L);
        if (this.f17999y == -9223372036854775807L) {
            z10 = false;
        }
        k4.a.f(z10);
        return j10 - this.f17999y;
    }

    private void R(a aVar) {
        Handler handler = this.f17991q;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            S(aVar);
        }
    }

    private void S(a aVar) {
        this.f17990p.n(aVar);
    }

    private boolean T(long j10) {
        boolean z10;
        a aVar = this.f17998x;
        if (aVar == null || (!this.f17993s && aVar.f17986b > Q(j10))) {
            z10 = false;
        } else {
            R(this.f17998x);
            this.f17998x = null;
            z10 = true;
        }
        if (this.f17995u && this.f17998x == null) {
            this.f17996v = true;
        }
        return z10;
    }

    private void U() {
        if (!this.f17995u && this.f17998x == null) {
            this.f17992r.g();
            s1 A = A();
            int M = M(A, this.f17992r, 0);
            if (M == -4) {
                if (this.f17992r.l()) {
                    this.f17995u = true;
                    return;
                }
                e eVar = this.f17992r;
                eVar.f17988j = this.f17997w;
                eVar.s();
                a a10 = ((c) n0.j(this.f17994t)).a(this.f17992r);
                if (a10 != null) {
                    ArrayList arrayList = new ArrayList(a10.e());
                    P(a10, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f17998x = new a(Q(this.f17992r.f21757f), (List<? extends a.b>) arrayList);
                    }
                }
            } else if (M == -5) {
                this.f17997w = ((r1) k4.a.e(A.f20721b)).f20658q;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void F() {
        this.f17998x = null;
        this.f17994t = null;
        this.f17999y = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public void H(long j10, boolean z10) {
        this.f17998x = null;
        this.f17995u = false;
        this.f17996v = false;
    }

    /* access modifiers changed from: protected */
    public void L(r1[] r1VarArr, long j10, long j11) {
        this.f17994t = this.f17989o.b(r1VarArr[0]);
        a aVar = this.f17998x;
        if (aVar != null) {
            this.f17998x = aVar.c((aVar.f17986b + this.f17999y) - j11);
        }
        this.f17999y = j11;
    }

    public int a(r1 r1Var) {
        if (!this.f17989o.a(r1Var)) {
            return q3.a(0);
        }
        return q3.a(r1Var.H == 0 ? 4 : 2);
    }

    public boolean b() {
        return this.f17996v;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            S((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    public void o(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            U();
            z10 = T(j10);
        }
    }

    public g(f fVar, Looper looper, d dVar) {
        this(fVar, looper, dVar, false);
    }

    public g(f fVar, Looper looper, d dVar, boolean z10) {
        super(5);
        Handler handler;
        this.f17990p = (f) k4.a.e(fVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = n0.v(looper, this);
        }
        this.f17991q = handler;
        this.f17989o = (d) k4.a.e(dVar);
        this.f17993s = z10;
        this.f17992r = new e();
        this.f17999y = -9223372036854775807L;
    }
}
