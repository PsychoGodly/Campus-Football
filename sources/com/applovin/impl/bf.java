package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class bf extends d2 implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    private final ye f6693n;

    /* renamed from: o  reason: collision with root package name */
    private final af f6694o;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f6695p;

    /* renamed from: q  reason: collision with root package name */
    private final ze f6696q;

    /* renamed from: r  reason: collision with root package name */
    private xe f6697r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6698s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6699t;

    /* renamed from: u  reason: collision with root package name */
    private long f6700u;

    /* renamed from: v  reason: collision with root package name */
    private long f6701v;

    /* renamed from: w  reason: collision with root package name */
    private we f6702w;

    public bf(af afVar, Looper looper) {
        this(afVar, looper, ye.f13602a);
    }

    private void a(we weVar, List list) {
        for (int i10 = 0; i10 < weVar.c(); i10++) {
            d9 b10 = weVar.a(i10).b();
            if (b10 == null || !this.f6693n.a(b10)) {
                list.add(weVar.a(i10));
            } else {
                xe b11 = this.f6693n.b(b10);
                byte[] bArr = (byte[]) a1.a((Object) weVar.a(i10).a());
                this.f6696q.b();
                this.f6696q.g(bArr.length);
                ((ByteBuffer) yp.a((Object) this.f6696q.f9906c)).put(bArr);
                this.f6696q.g();
                we a10 = b11.a(this.f6696q);
                if (a10 != null) {
                    a(a10, list);
                }
            }
        }
    }

    private void b(we weVar) {
        this.f6694o.a(weVar);
    }

    private void z() {
        if (!this.f6698s && this.f6702w == null) {
            this.f6696q.b();
            e9 r10 = r();
            int a10 = a(r10, (n5) this.f6696q, 0);
            if (a10 == -4) {
                if (this.f6696q.e()) {
                    this.f6698s = true;
                    return;
                }
                ze zeVar = this.f6696q;
                zeVar.f13826j = this.f6700u;
                zeVar.g();
                we a11 = ((xe) yp.a((Object) this.f6697r)).a(this.f6696q);
                if (a11 != null) {
                    ArrayList arrayList = new ArrayList(a11.c());
                    a(a11, (List) arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f6702w = new we((List) arrayList);
                        this.f6701v = this.f6696q.f9908f;
                    }
                }
            } else if (a10 == -5) {
                this.f6700u = ((d9) a1.a((Object) r10.f7378b)).f7157q;
            }
        }
    }

    public boolean c() {
        return this.f6699t;
    }

    public boolean d() {
        return true;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((we) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.f6702w = null;
        this.f6701v = -9223372036854775807L;
        this.f6697r = null;
    }

    public bf(af afVar, Looper looper, ye yeVar) {
        super(5);
        Handler handler;
        this.f6694o = (af) a1.a((Object) afVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = yp.a(looper, (Handler.Callback) this);
        }
        this.f6695p = handler;
        this.f6693n = (ye) a1.a((Object) yeVar);
        this.f6696q = new ze();
        this.f6701v = -9223372036854775807L;
    }

    private boolean c(long j10) {
        boolean z10;
        we weVar = this.f6702w;
        if (weVar == null || this.f6701v > j10) {
            z10 = false;
        } else {
            a(weVar);
            this.f6702w = null;
            this.f6701v = -9223372036854775807L;
            z10 = true;
        }
        if (this.f6698s && this.f6702w == null) {
            this.f6699t = true;
        }
        return z10;
    }

    private void a(we weVar) {
        Handler handler = this.f6695p;
        if (handler != null) {
            handler.obtainMessage(0, weVar).sendToTarget();
        } else {
            b(weVar);
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j10, boolean z10) {
        this.f6702w = null;
        this.f6701v = -9223372036854775807L;
        this.f6698s = false;
        this.f6699t = false;
    }

    /* access modifiers changed from: protected */
    public void a(d9[] d9VarArr, long j10, long j11) {
        this.f6697r = this.f6693n.b(d9VarArr[0]);
    }

    public void a(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            z();
            z10 = c(j10);
        }
    }

    public int a(d9 d9Var) {
        if (!this.f6693n.a(d9Var)) {
            return hz.a(0);
        }
        return hz.a(d9Var.F == 0 ? 4 : 2);
    }
}
