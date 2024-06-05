package com.applovin.impl;

import java.util.Comparator;

public abstract class w3 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final w3 f12942a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final w3 f12943b = new b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final w3 f12944c = new b(1);

    class a extends w3 {
        a() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public w3 a(int i10) {
            if (i10 < 0) {
                return w3.f12943b;
            }
            return i10 > 0 ? w3.f12944c : w3.f12942a;
        }

        public w3 b(boolean z10, boolean z11) {
            return a(i2.a(z11, z10));
        }

        public int d() {
            return 0;
        }

        public w3 a(int i10, int i11) {
            return a(pb.a(i10, i11));
        }

        public w3 a(long j10, long j11) {
            return a(nc.a(j10, j11));
        }

        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        public w3 a(boolean z10, boolean z11) {
            return a(i2.a(z10, z11));
        }
    }

    private static final class b extends w3 {

        /* renamed from: d  reason: collision with root package name */
        final int f12945d;

        b(int i10) {
            super((a) null);
            this.f12945d = i10;
        }

        public w3 a(int i10, int i11) {
            return this;
        }

        public w3 a(long j10, long j11) {
            return this;
        }

        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        public w3 a(boolean z10, boolean z11) {
            return this;
        }

        public w3 b(boolean z10, boolean z11) {
            return this;
        }

        public int d() {
            return this.f12945d;
        }
    }

    private w3() {
    }

    /* synthetic */ w3(a aVar) {
        this();
    }

    public static w3 e() {
        return f12942a;
    }

    public abstract w3 a(int i10, int i11);

    public abstract w3 a(long j10, long j11);

    public abstract w3 a(Object obj, Object obj2, Comparator comparator);

    public abstract w3 a(boolean z10, boolean z11);

    public abstract w3 b(boolean z10, boolean z11);

    public abstract int d();
}
