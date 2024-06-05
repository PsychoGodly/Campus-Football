package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

final class pa implements g5 {

    /* renamed from: a  reason: collision with root package name */
    private final g5 f10614a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10615b;

    /* renamed from: c  reason: collision with root package name */
    private final a f10616c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f10617d;

    /* renamed from: e  reason: collision with root package name */
    private int f10618e;

    public interface a {
        void a(yg ygVar);
    }

    public pa(g5 g5Var, int i10, a aVar) {
        a1.a(i10 > 0);
        this.f10614a = g5Var;
        this.f10615b = i10;
        this.f10616c = aVar;
        this.f10617d = new byte[1];
        this.f10618e = i10;
    }

    private boolean g() {
        if (this.f10614a.a(this.f10617d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f10617d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int a10 = this.f10614a.a(bArr, i12, i11);
            if (a10 == -1) {
                return false;
            }
            i12 += a10;
            i11 -= a10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f10616c.a(new yg(bArr, i10));
        }
        return true;
    }

    public void a(yo yoVar) {
        a1.a((Object) yoVar);
        this.f10614a.a(yoVar);
    }

    public Uri c() {
        return this.f10614a.c();
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public Map e() {
        return this.f10614a.e();
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (this.f10618e == 0) {
            if (!g()) {
                return -1;
            }
            this.f10618e = this.f10615b;
        }
        int a10 = this.f10614a.a(bArr, i10, Math.min(this.f10618e, i11));
        if (a10 != -1) {
            this.f10618e -= a10;
        }
        return a10;
    }

    public long a(j5 j5Var) {
        throw new UnsupportedOperationException();
    }
}
