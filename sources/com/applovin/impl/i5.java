package com.applovin.impl;

import java.io.InputStream;

public final class i5 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final g5 f8424a;

    /* renamed from: b  reason: collision with root package name */
    private final j5 f8425b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f8426c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8427d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8428e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f8429f;

    public i5(g5 g5Var, j5 j5Var) {
        this.f8424a = g5Var;
        this.f8425b = j5Var;
        this.f8426c = new byte[1];
    }

    private void a() {
        if (!this.f8427d) {
            this.f8424a.a(this.f8425b);
            this.f8427d = true;
        }
    }

    public void close() {
        if (!this.f8428e) {
            this.f8424a.close();
            this.f8428e = true;
        }
    }

    public int read() {
        if (read(this.f8426c) == -1) {
            return -1;
        }
        return this.f8426c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        a1.b(!this.f8428e);
        a();
        int a10 = this.f8424a.a(bArr, i10, i11);
        if (a10 == -1) {
            return -1;
        }
        this.f8429f += (long) a10;
        return a10;
    }
}
