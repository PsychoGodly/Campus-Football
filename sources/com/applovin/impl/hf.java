package com.applovin.impl;

import java.util.List;

final class hf {

    /* renamed from: a  reason: collision with root package name */
    public final long f8313a;

    /* renamed from: b  reason: collision with root package name */
    public final List f8314b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f8315a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8316b;

        /* renamed from: c  reason: collision with root package name */
        public final long f8317c;

        /* renamed from: d  reason: collision with root package name */
        public final long f8318d;

        public a(String str, String str2, long j10, long j11) {
            this.f8315a = str;
            this.f8316b = str2;
            this.f8317c = j10;
            this.f8318d = j11;
        }
    }

    public hf(long j10, List list) {
        this.f8313a = j10;
        this.f8314b = list;
    }

    public Cif a(long j10) {
        long j11;
        if (this.f8314b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f8314b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f8314b.get(size);
            boolean equals = "video/mp4".equals(aVar.f8315a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f8318d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f8317c;
                j11 = j17;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new Cif(j13, j14, this.f8313a, j15, j16);
    }
}
