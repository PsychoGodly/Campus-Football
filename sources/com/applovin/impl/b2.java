package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class b2 implements wd {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f6608a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet f6609b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private final xd.a f6610c = new xd.a();

    /* renamed from: d  reason: collision with root package name */
    private final y6.a f6611d = new y6.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f6612e;

    /* renamed from: f  reason: collision with root package name */
    private go f6613f;

    public final void a(Handler handler, y6 y6Var) {
        a1.a((Object) handler);
        a1.a((Object) y6Var);
        this.f6611d.a(handler, y6Var);
    }

    /* access modifiers changed from: protected */
    public abstract void a(yo yoVar);

    /* access modifiers changed from: protected */
    public final xd.a b(wd.a aVar) {
        return this.f6610c.a(0, aVar, 0);
    }

    public final void c(wd.b bVar) {
        this.f6608a.remove(bVar);
        if (this.f6608a.isEmpty()) {
            this.f6612e = null;
            this.f6613f = null;
            this.f6609b.clear();
            h();
            return;
        }
        a(bVar);
    }

    public /* synthetic */ boolean c() {
        return d70.a(this);
    }

    public /* synthetic */ go d() {
        return d70.b(this);
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return !this.f6609b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    public final void b(wd.b bVar) {
        a1.a((Object) this.f6612e);
        boolean isEmpty = this.f6609b.isEmpty();
        this.f6609b.add(bVar);
        if (isEmpty) {
            f();
        }
    }

    public final void a(Handler handler, xd xdVar) {
        a1.a((Object) handler);
        a1.a((Object) xdVar);
        this.f6610c.a(handler, xdVar);
    }

    /* access modifiers changed from: protected */
    public final y6.a a(int i10, wd.a aVar) {
        return this.f6611d.a(i10, aVar);
    }

    /* access modifiers changed from: protected */
    public final y6.a a(wd.a aVar) {
        return this.f6611d.a(0, aVar);
    }

    /* access modifiers changed from: protected */
    public final xd.a a(int i10, wd.a aVar, long j10) {
        return this.f6610c.a(i10, aVar, j10);
    }

    public final void a(wd.b bVar) {
        boolean z10 = !this.f6609b.isEmpty();
        this.f6609b.remove(bVar);
        if (z10 && this.f6609b.isEmpty()) {
            e();
        }
    }

    public final void a(wd.b bVar, yo yoVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f6612e;
        a1.a(looper == null || looper == myLooper);
        go goVar = this.f6613f;
        this.f6608a.add(bVar);
        if (this.f6612e == null) {
            this.f6612e = myLooper;
            this.f6609b.add(bVar);
            a(yoVar);
        } else if (goVar != null) {
            b(bVar);
            bVar.a(this, goVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(go goVar) {
        this.f6613f = goVar;
        Iterator it = this.f6608a.iterator();
        while (it.hasNext()) {
            ((wd.b) it.next()).a(this, goVar);
        }
    }

    public final void a(y6 y6Var) {
        this.f6611d.e(y6Var);
    }

    public final void a(xd xdVar) {
        this.f6610c.a(xdVar);
    }
}
