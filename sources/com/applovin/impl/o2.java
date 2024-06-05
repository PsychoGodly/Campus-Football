package com.applovin.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

public final class o2 implements wh {

    /* renamed from: a  reason: collision with root package name */
    private final m8 f10051a;

    /* renamed from: b  reason: collision with root package name */
    private i8 f10052b;

    /* renamed from: c  reason: collision with root package name */
    private j8 f10053c;

    public o2(m8 m8Var) {
        this.f10051a = m8Var;
    }

    public void a(e5 e5Var, Uri uri, Map map, long j10, long j11, k8 k8Var) {
        z5 z5Var = new z5(e5Var, j10, j11);
        this.f10053c = z5Var;
        if (this.f10052b == null) {
            i8[] a10 = this.f10051a.a(uri, map);
            boolean z10 = false;
            if (a10.length == 1) {
                this.f10052b = a10[0];
            } else {
                int length = a10.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    i8 i8Var = a10[i10];
                    try {
                        if (i8Var.a((j8) z5Var)) {
                            this.f10052b = i8Var;
                            a1.b(true);
                            z5Var.b();
                            break;
                        }
                        a1.b(this.f10052b != null || z5Var.f() == j10);
                        z5Var.b();
                        i10++;
                    } catch (EOFException unused) {
                        a1.b(this.f10052b != null || z5Var.f() == j10);
                        z5Var.b();
                    } catch (Throwable th) {
                        if (this.f10052b != null || z5Var.f() == j10) {
                            z10 = true;
                        }
                        a1.b(z10);
                        z5Var.b();
                        throw th;
                    }
                }
                if (this.f10052b == null) {
                    throw new sp("None of the available extractors (" + yp.b((Object[]) a10) + ") could read the stream.", (Uri) a1.a((Object) uri));
                }
            }
            this.f10052b.a(k8Var);
        }
    }

    public long b() {
        j8 j8Var = this.f10053c;
        if (j8Var != null) {
            return j8Var.f();
        }
        return -1;
    }

    public void c() {
        i8 i8Var = this.f10052b;
        if (i8Var instanceof jf) {
            ((jf) i8Var).c();
        }
    }

    public int a(qh qhVar) {
        return ((i8) a1.a((Object) this.f10052b)).a((j8) a1.a((Object) this.f10053c), qhVar);
    }

    public void a() {
        i8 i8Var = this.f10052b;
        if (i8Var != null) {
            i8Var.a();
            this.f10052b = null;
        }
        this.f10053c = null;
    }

    public void a(long j10, long j11) {
        ((i8) a1.a((Object) this.f10052b)).a(j10, j11);
    }
}
