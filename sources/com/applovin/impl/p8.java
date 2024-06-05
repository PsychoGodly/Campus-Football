package com.applovin.impl;

import java.util.Arrays;

final class p8 {

    /* renamed from: a  reason: collision with root package name */
    private a f10597a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f10598b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f10599c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10600d;

    /* renamed from: e  reason: collision with root package name */
    private long f10601e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f10602f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f10603a;

        /* renamed from: b  reason: collision with root package name */
        private long f10604b;

        /* renamed from: c  reason: collision with root package name */
        private long f10605c;

        /* renamed from: d  reason: collision with root package name */
        private long f10606d;

        /* renamed from: e  reason: collision with root package name */
        private long f10607e;

        /* renamed from: f  reason: collision with root package name */
        private long f10608f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f10609g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f10610h;

        public long a() {
            long j10 = this.f10607e;
            if (j10 == 0) {
                return 0;
            }
            return this.f10608f / j10;
        }

        public long b() {
            return this.f10608f;
        }

        public boolean c() {
            long j10 = this.f10606d;
            if (j10 == 0) {
                return false;
            }
            return this.f10609g[a(j10 - 1)];
        }

        public boolean d() {
            return this.f10606d > 15 && this.f10610h == 0;
        }

        public void e() {
            this.f10606d = 0;
            this.f10607e = 0;
            this.f10608f = 0;
            this.f10610h = 0;
            Arrays.fill(this.f10609g, false);
        }

        private static int a(long j10) {
            return (int) (j10 % 15);
        }

        public void b(long j10) {
            long j11 = this.f10606d;
            if (j11 == 0) {
                this.f10603a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f10603a;
                this.f10604b = j12;
                this.f10608f = j12;
                this.f10607e = 1;
            } else {
                long j13 = j10 - this.f10605c;
                int a10 = a(j11);
                if (Math.abs(j13 - this.f10604b) <= 1000000) {
                    this.f10607e++;
                    this.f10608f += j13;
                    boolean[] zArr = this.f10609g;
                    if (zArr[a10]) {
                        zArr[a10] = false;
                        this.f10610h--;
                    }
                } else {
                    boolean[] zArr2 = this.f10609g;
                    if (!zArr2[a10]) {
                        zArr2[a10] = true;
                        this.f10610h++;
                    }
                }
            }
            this.f10606d++;
            this.f10605c = j10;
        }
    }

    public long a() {
        if (e()) {
            return this.f10597a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / ((double) this.f10597a.a()));
        }
        return -1.0f;
    }

    public int c() {
        return this.f10602f;
    }

    public long d() {
        if (e()) {
            return this.f10597a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f10597a.d();
    }

    public void f() {
        this.f10597a.e();
        this.f10598b.e();
        this.f10599c = false;
        this.f10601e = -9223372036854775807L;
        this.f10602f = 0;
    }

    public void a(long j10) {
        this.f10597a.b(j10);
        int i10 = 0;
        if (this.f10597a.d() && !this.f10600d) {
            this.f10599c = false;
        } else if (this.f10601e != -9223372036854775807L) {
            if (!this.f10599c || this.f10598b.c()) {
                this.f10598b.e();
                this.f10598b.b(this.f10601e);
            }
            this.f10599c = true;
            this.f10598b.b(j10);
        }
        if (this.f10599c && this.f10598b.d()) {
            a aVar = this.f10597a;
            this.f10597a = this.f10598b;
            this.f10598b = aVar;
            this.f10599c = false;
            this.f10600d = false;
        }
        this.f10601e = j10;
        if (!this.f10597a.d()) {
            i10 = this.f10602f + 1;
        }
        this.f10602f = i10;
    }
}
