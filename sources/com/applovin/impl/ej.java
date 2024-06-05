package com.applovin.impl;

import com.applovin.mediation.MaxReward;

public interface ej {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final gj f7449a;

        /* renamed from: b  reason: collision with root package name */
        public final gj f7450b;

        public a(gj gjVar) {
            this(gjVar, gjVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f7449a.equals(aVar.f7449a) || !this.f7450b.equals(aVar.f7450b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f7449a.hashCode() * 31) + this.f7450b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f7449a);
            if (this.f7449a.equals(this.f7450b)) {
                str = MaxReward.DEFAULT_LABEL;
            } else {
                str = ", " + this.f7450b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(gj gjVar, gj gjVar2) {
            this.f7449a = (gj) a1.a((Object) gjVar);
            this.f7450b = (gj) a1.a((Object) gjVar2);
        }
    }

    public static class b implements ej {

        /* renamed from: a  reason: collision with root package name */
        private final long f7451a;

        /* renamed from: b  reason: collision with root package name */
        private final a f7452b;

        public b(long j10) {
            this(j10, 0);
        }

        public a b(long j10) {
            return this.f7452b;
        }

        public boolean b() {
            return false;
        }

        public long d() {
            return this.f7451a;
        }

        public b(long j10, long j11) {
            this.f7451a = j10;
            this.f7452b = new a(j11 == 0 ? gj.f8033c : new gj(0, j11));
        }
    }

    a b(long j10);

    boolean b();

    long d();
}
