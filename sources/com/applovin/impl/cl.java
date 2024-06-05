package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class cl implements g5 {

    /* renamed from: a  reason: collision with root package name */
    private final g5 f6986a;

    /* renamed from: b  reason: collision with root package name */
    private long f6987b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f6988c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map f6989d = Collections.emptyMap();

    public cl(g5 g5Var) {
        this.f6986a = (g5) a1.a((Object) g5Var);
    }

    public void a(yo yoVar) {
        a1.a((Object) yoVar);
        this.f6986a.a(yoVar);
    }

    public Uri c() {
        return this.f6986a.c();
    }

    public void close() {
        this.f6986a.close();
    }

    public Map e() {
        return this.f6986a.e();
    }

    public long g() {
        return this.f6987b;
    }

    public Uri h() {
        return this.f6988c;
    }

    public Map i() {
        return this.f6989d;
    }

    public long a(j5 j5Var) {
        this.f6988c = j5Var.f8675a;
        this.f6989d = Collections.emptyMap();
        long a10 = this.f6986a.a(j5Var);
        this.f6988c = (Uri) a1.a((Object) c());
        this.f6989d = e();
        return a10;
    }

    public int a(byte[] bArr, int i10, int i11) {
        int a10 = this.f6986a.a(bArr, i10, i11);
        if (a10 != -1) {
            this.f6987b += (long) a10;
        }
        return a10;
    }
}
