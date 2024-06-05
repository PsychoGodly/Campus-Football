package com.applovin.impl;

import com.applovin.impl.h2;
import com.applovin.impl.u8;

final class s8 extends h2 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s8(com.applovin.impl.y8 r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            com.applovin.impl.q40 r1 = new com.applovin.impl.q40
            r1.<init>(r0)
            com.applovin.impl.s8$b r2 = new com.applovin.impl.s8$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.b()
            long r7 = r0.f13548j
            long r13 = r17.a()
            int r0 = r0.f13541c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.s8.<init>(com.applovin.impl.y8, int, long, long):void");
    }

    private static final class b implements h2.f {

        /* renamed from: a  reason: collision with root package name */
        private final y8 f11311a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11312b;

        /* renamed from: c  reason: collision with root package name */
        private final u8.a f11313c;

        private b(y8 y8Var, int i10) {
            this.f11311a = y8Var;
            this.f11312b = i10;
            this.f11313c = new u8.a();
        }

        private long a(j8 j8Var) {
            while (j8Var.d() < j8Var.a() - 6 && !u8.a(j8Var, this.f11311a, this.f11312b, this.f11313c)) {
                j8Var.c(1);
            }
            if (j8Var.d() < j8Var.a() - 6) {
                return this.f11313c.f12543a;
            }
            j8Var.c((int) (j8Var.a() - j8Var.d()));
            return this.f11311a.f13548j;
        }

        public /* synthetic */ void a() {
            rx.a(this);
        }

        public h2.e a(j8 j8Var, long j10) {
            long f10 = j8Var.f();
            long a10 = a(j8Var);
            long d10 = j8Var.d();
            j8Var.c(Math.max(6, this.f11311a.f13541c));
            long a11 = a(j8Var);
            long d11 = j8Var.d();
            if (a10 <= j10 && a11 > j10) {
                return h2.e.a(d10);
            }
            if (a11 <= j10) {
                return h2.e.b(a11, d11);
            }
            return h2.e.a(a10, f10);
        }
    }
}
