package com.applovin.impl;

import java.util.Arrays;

public interface ro {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11217a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f11218b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11219c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11220d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f11217a = i10;
            this.f11218b = bArr;
            this.f11219c = i11;
            this.f11220d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f11217a == aVar.f11217a && this.f11219c == aVar.f11219c && this.f11220d == aVar.f11220d && Arrays.equals(this.f11218b, aVar.f11218b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f11217a * 31) + Arrays.hashCode(this.f11218b)) * 31) + this.f11219c) * 31) + this.f11220d;
        }
    }

    int a(e5 e5Var, int i10, boolean z10);

    int a(e5 e5Var, int i10, boolean z10, int i11);

    void a(long j10, int i10, int i11, int i12, a aVar);

    void a(d9 d9Var);

    void a(yg ygVar, int i10);

    void a(yg ygVar, int i10, int i11);
}
