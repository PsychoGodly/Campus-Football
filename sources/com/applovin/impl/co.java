package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

public final class co extends d2 implements Handler.Callback {
    private int A;
    private long B;

    /* renamed from: n  reason: collision with root package name */
    private final Handler f7003n;

    /* renamed from: o  reason: collision with root package name */
    private final bo f7004o;

    /* renamed from: p  reason: collision with root package name */
    private final nl f7005p;

    /* renamed from: q  reason: collision with root package name */
    private final e9 f7006q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7007r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7008s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f7009t;

    /* renamed from: u  reason: collision with root package name */
    private int f7010u;

    /* renamed from: v  reason: collision with root package name */
    private d9 f7011v;

    /* renamed from: w  reason: collision with root package name */
    private ll f7012w;

    /* renamed from: x  reason: collision with root package name */
    private ol f7013x;

    /* renamed from: y  reason: collision with root package name */
    private pl f7014y;

    /* renamed from: z  reason: collision with root package name */
    private pl f7015z;

    public co(bo boVar, Looper looper) {
        this(boVar, looper, nl.f10004a);
    }

    private long A() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        a1.a((Object) this.f7014y);
        if (this.A >= this.f7014y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f7014y.a(this.A);
    }

    private void B() {
        this.f7009t = true;
        this.f7012w = this.f7005p.b((d9) a1.a((Object) this.f7011v));
    }

    private void C() {
        this.f7013x = null;
        this.A = -1;
        pl plVar = this.f7014y;
        if (plVar != null) {
            plVar.g();
            this.f7014y = null;
        }
        pl plVar2 = this.f7015z;
        if (plVar2 != null) {
            plVar2.g();
            this.f7015z = null;
        }
    }

    private void D() {
        C();
        ((ll) a1.a((Object) this.f7012w)).a();
        this.f7012w = null;
        this.f7010u = 0;
    }

    private void E() {
        D();
        B();
    }

    private void a(ml mlVar) {
        kc.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f7011v, mlVar);
        z();
        E();
    }

    private void b(List list) {
        Handler handler = this.f7003n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    private void z() {
        b(Collections.emptyList());
    }

    public boolean c() {
        return this.f7008s;
    }

    public boolean d() {
        return true;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.f7011v = null;
        this.B = -9223372036854775807L;
        z();
        D();
    }

    public co(bo boVar, Looper looper, nl nlVar) {
        super(3);
        Handler handler;
        this.f7004o = (bo) a1.a((Object) boVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = yp.a(looper, (Handler.Callback) this);
        }
        this.f7003n = handler;
        this.f7005p = nlVar;
        this.f7006q = new e9();
        this.B = -9223372036854775807L;
    }

    public void c(long j10) {
        a1.b(k());
        this.B = j10;
    }

    private void a(List list) {
        this.f7004o.a(list);
    }

    /* access modifiers changed from: protected */
    public void a(long j10, boolean z10) {
        z();
        this.f7007r = false;
        this.f7008s = false;
        this.B = -9223372036854775807L;
        if (this.f7010u != 0) {
            E();
            return;
        }
        C();
        ((ll) a1.a((Object) this.f7012w)).b();
    }

    /* access modifiers changed from: protected */
    public void a(d9[] d9VarArr, long j10, long j11) {
        this.f7011v = d9VarArr[0];
        if (this.f7012w != null) {
            this.f7010u = 1;
        } else {
            B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        if (r11 != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r9, long r11) {
        /*
            r8 = this;
            boolean r11 = r8.k()
            r12 = 1
            if (r11 == 0) goto L_0x001b
            long r0 = r8.B
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x001b
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x001b
            r8.C()
            r8.f7008s = r12
        L_0x001b:
            boolean r11 = r8.f7008s
            if (r11 == 0) goto L_0x0020
            return
        L_0x0020:
            com.applovin.impl.pl r11 = r8.f7015z
            if (r11 != 0) goto L_0x0045
            com.applovin.impl.ll r11 = r8.f7012w
            java.lang.Object r11 = com.applovin.impl.a1.a((java.lang.Object) r11)
            com.applovin.impl.ll r11 = (com.applovin.impl.ll) r11
            r11.a(r9)
            com.applovin.impl.ll r11 = r8.f7012w     // Catch:{ ml -> 0x0040 }
            java.lang.Object r11 = com.applovin.impl.a1.a((java.lang.Object) r11)     // Catch:{ ml -> 0x0040 }
            com.applovin.impl.ll r11 = (com.applovin.impl.ll) r11     // Catch:{ ml -> 0x0040 }
            java.lang.Object r11 = r11.c()     // Catch:{ ml -> 0x0040 }
            com.applovin.impl.pl r11 = (com.applovin.impl.pl) r11     // Catch:{ ml -> 0x0040 }
            r8.f7015z = r11     // Catch:{ ml -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            r9 = move-exception
            r8.a((com.applovin.impl.ml) r9)
            return
        L_0x0045:
            int r11 = r8.b()
            r0 = 2
            if (r11 == r0) goto L_0x004d
            return
        L_0x004d:
            com.applovin.impl.pl r11 = r8.f7014y
            r1 = 0
            if (r11 == 0) goto L_0x0066
            long r2 = r8.A()
            r11 = 0
        L_0x0057:
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0067
            int r11 = r8.A
            int r11 = r11 + r12
            r8.A = r11
            long r2 = r8.A()
            r11 = 1
            goto L_0x0057
        L_0x0066:
            r11 = 0
        L_0x0067:
            com.applovin.impl.pl r2 = r8.f7015z
            r3 = 0
            if (r2 == 0) goto L_0x00a7
            boolean r4 = r2.e()
            if (r4 == 0) goto L_0x008f
            if (r11 != 0) goto L_0x00a7
            long r4 = r8.A()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00a7
            int r2 = r8.f7010u
            if (r2 != r0) goto L_0x0089
            r8.E()
            goto L_0x00a7
        L_0x0089:
            r8.C()
            r8.f7008s = r12
            goto L_0x00a7
        L_0x008f:
            long r4 = r2.f13062b
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x00a7
            com.applovin.impl.pl r11 = r8.f7014y
            if (r11 == 0) goto L_0x009c
            r11.g()
        L_0x009c:
            int r11 = r2.a((long) r9)
            r8.A = r11
            r8.f7014y = r2
            r8.f7015z = r3
            goto L_0x00a9
        L_0x00a7:
            if (r11 == 0) goto L_0x00b7
        L_0x00a9:
            com.applovin.impl.pl r11 = r8.f7014y
            com.applovin.impl.a1.a((java.lang.Object) r11)
            com.applovin.impl.pl r11 = r8.f7014y
            java.util.List r9 = r11.b(r9)
            r8.b(r9)
        L_0x00b7:
            int r9 = r8.f7010u
            if (r9 != r0) goto L_0x00bc
            return
        L_0x00bc:
            boolean r9 = r8.f7007r     // Catch:{ ml -> 0x0131 }
            if (r9 != 0) goto L_0x0135
            com.applovin.impl.ol r9 = r8.f7013x     // Catch:{ ml -> 0x0131 }
            if (r9 != 0) goto L_0x00d7
            com.applovin.impl.ll r9 = r8.f7012w     // Catch:{ ml -> 0x0131 }
            java.lang.Object r9 = com.applovin.impl.a1.a((java.lang.Object) r9)     // Catch:{ ml -> 0x0131 }
            com.applovin.impl.ll r9 = (com.applovin.impl.ll) r9     // Catch:{ ml -> 0x0131 }
            java.lang.Object r9 = r9.d()     // Catch:{ ml -> 0x0131 }
            com.applovin.impl.ol r9 = (com.applovin.impl.ol) r9     // Catch:{ ml -> 0x0131 }
            if (r9 != 0) goto L_0x00d5
            return
        L_0x00d5:
            r8.f7013x = r9     // Catch:{ ml -> 0x0131 }
        L_0x00d7:
            int r10 = r8.f7010u     // Catch:{ ml -> 0x0131 }
            if (r10 != r12) goto L_0x00ef
            r10 = 4
            r9.e(r10)     // Catch:{ ml -> 0x0131 }
            com.applovin.impl.ll r10 = r8.f7012w     // Catch:{ ml -> 0x0131 }
            java.lang.Object r10 = com.applovin.impl.a1.a((java.lang.Object) r10)     // Catch:{ ml -> 0x0131 }
            com.applovin.impl.ll r10 = (com.applovin.impl.ll) r10     // Catch:{ ml -> 0x0131 }
            r10.a(r9)     // Catch:{ ml -> 0x0131 }
            r8.f7013x = r3     // Catch:{ ml -> 0x0131 }
            r8.f7010u = r0     // Catch:{ ml -> 0x0131 }
            return
        L_0x00ef:
            com.applovin.impl.e9 r10 = r8.f7006q     // Catch:{ ml -> 0x0131 }
            int r10 = r8.a((com.applovin.impl.e9) r10, (com.applovin.impl.n5) r9, (int) r1)     // Catch:{ ml -> 0x0131 }
            r11 = -4
            if (r10 != r11) goto L_0x012d
            boolean r10 = r9.e()     // Catch:{ ml -> 0x0131 }
            if (r10 == 0) goto L_0x0103
            r8.f7007r = r12     // Catch:{ ml -> 0x0131 }
            r8.f7009t = r1     // Catch:{ ml -> 0x0131 }
            goto L_0x011b
        L_0x0103:
            com.applovin.impl.e9 r10 = r8.f7006q     // Catch:{ ml -> 0x0131 }
            com.applovin.impl.d9 r10 = r10.f7378b     // Catch:{ ml -> 0x0131 }
            if (r10 != 0) goto L_0x010a
            return
        L_0x010a:
            long r10 = r10.f7157q     // Catch:{ ml -> 0x0131 }
            r9.f10488j = r10     // Catch:{ ml -> 0x0131 }
            r9.g()     // Catch:{ ml -> 0x0131 }
            boolean r10 = r8.f7009t     // Catch:{ ml -> 0x0131 }
            boolean r11 = r9.f()     // Catch:{ ml -> 0x0131 }
            r11 = r11 ^ r12
            r10 = r10 & r11
            r8.f7009t = r10     // Catch:{ ml -> 0x0131 }
        L_0x011b:
            boolean r10 = r8.f7009t     // Catch:{ ml -> 0x0131 }
            if (r10 != 0) goto L_0x00bc
            com.applovin.impl.ll r10 = r8.f7012w     // Catch:{ ml -> 0x0131 }
            java.lang.Object r10 = com.applovin.impl.a1.a((java.lang.Object) r10)     // Catch:{ ml -> 0x0131 }
            com.applovin.impl.ll r10 = (com.applovin.impl.ll) r10     // Catch:{ ml -> 0x0131 }
            r10.a(r9)     // Catch:{ ml -> 0x0131 }
            r8.f7013x = r3     // Catch:{ ml -> 0x0131 }
            goto L_0x00bc
        L_0x012d:
            r9 = -3
            if (r10 != r9) goto L_0x00bc
            return
        L_0x0131:
            r9 = move-exception
            r8.a((com.applovin.impl.ml) r9)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.co.a(long, long):void");
    }

    public int a(d9 d9Var) {
        if (this.f7005p.a(d9Var)) {
            return hz.a(d9Var.F == 0 ? 4 : 2);
        } else if (df.h(d9Var.f7153m)) {
            return hz.a(1);
        } else {
            return hz.a(0);
        }
    }
}
