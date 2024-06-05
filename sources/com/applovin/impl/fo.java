package com.applovin.impl;

import java.util.Arrays;

public final class fo {

    /* renamed from: a  reason: collision with root package name */
    private long[] f7837a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f7838b;

    /* renamed from: c  reason: collision with root package name */
    private int f7839c;

    /* renamed from: d  reason: collision with root package name */
    private int f7840d;

    public fo() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f7839c;
        int i11 = this.f7840d;
        Object[] objArr = this.f7838b;
        int length = (i10 + i11) % objArr.length;
        this.f7837a[length] = j10;
        objArr[length] = obj;
        this.f7840d = i11 + 1;
    }

    private Object d() {
        a1.b(this.f7840d > 0);
        Object[] objArr = this.f7838b;
        int i10 = this.f7839c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f7839c = (i10 + 1) % objArr.length;
        this.f7840d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        a(j10);
        b();
        b(j10, obj);
    }

    public synchronized Object c() {
        return this.f7840d == 0 ? null : d();
    }

    public synchronized int e() {
        return this.f7840d;
    }

    public fo(int i10) {
        this.f7837a = new long[i10];
        this.f7838b = a(i10);
    }

    public synchronized Object c(long j10) {
        return a(j10, true);
    }

    public synchronized void a() {
        this.f7839c = 0;
        this.f7840d = 0;
        Arrays.fill(this.f7838b, (Object) null);
    }

    private void b() {
        int length = this.f7838b.length;
        if (this.f7840d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            Object[] a10 = a(i10);
            int i11 = this.f7839c;
            int i12 = length - i11;
            System.arraycopy(this.f7837a, i11, jArr, 0, i12);
            System.arraycopy(this.f7838b, this.f7839c, a10, 0, i12);
            int i13 = this.f7839c;
            if (i13 > 0) {
                System.arraycopy(this.f7837a, 0, jArr, i12, i13);
                System.arraycopy(this.f7838b, 0, a10, i12, this.f7839c);
            }
            this.f7837a = jArr;
            this.f7838b = a10;
            this.f7839c = 0;
        }
    }

    private void a(long j10) {
        int i10 = this.f7840d;
        if (i10 > 0) {
            if (j10 <= this.f7837a[((this.f7839c + i10) - 1) % this.f7838b.length]) {
                a();
            }
        }
    }

    private static Object[] a(int i10) {
        return new Object[i10];
    }

    private Object a(long j10, boolean z10) {
        Object obj = null;
        long j11 = Long.MAX_VALUE;
        while (this.f7840d > 0) {
            long j12 = j10 - this.f7837a[this.f7839c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            obj = d();
            j11 = j12;
        }
        return obj;
    }

    public synchronized Object b(long j10) {
        return a(j10, false);
    }
}
