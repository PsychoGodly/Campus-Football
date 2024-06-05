package r3;

import android.net.Uri;
import j4.h0;
import j4.l;
import j4.o0;
import j4.p;
import java.util.List;
import java.util.Map;
import k4.a;
import n2.r1;
import p3.q;

/* compiled from: Chunk */
public abstract class f implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f22127a = q.a();

    /* renamed from: b  reason: collision with root package name */
    public final p f22128b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22129c;

    /* renamed from: d  reason: collision with root package name */
    public final r1 f22130d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22131e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f22132f;

    /* renamed from: g  reason: collision with root package name */
    public final long f22133g;

    /* renamed from: h  reason: collision with root package name */
    public final long f22134h;

    /* renamed from: i  reason: collision with root package name */
    protected final o0 f22135i;

    public f(l lVar, p pVar, int i10, r1 r1Var, int i11, Object obj, long j10, long j11) {
        this.f22135i = new o0(lVar);
        this.f22128b = (p) a.e(pVar);
        this.f22129c = i10;
        this.f22130d = r1Var;
        this.f22131e = i11;
        this.f22132f = obj;
        this.f22133g = j10;
        this.f22134h = j11;
    }

    public final long b() {
        return this.f22135i.q();
    }

    public final long d() {
        return this.f22134h - this.f22133g;
    }

    public final Map<String, List<String>> e() {
        return this.f22135i.s();
    }

    public final Uri f() {
        return this.f22135i.r();
    }
}
