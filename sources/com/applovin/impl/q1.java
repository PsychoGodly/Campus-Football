package com.applovin.impl;

import java.nio.ByteBuffer;

public interface q1 {

    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f10791a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10792b;

        /* renamed from: c  reason: collision with root package name */
        public final d9 f10793c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(int r3, int r4, int r5, int r6, com.applovin.impl.d9 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f10791a = r3
                r2.f10792b = r8
                r2.f10793c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q1.b.<init>(int, int, int, int, com.applovin.impl.d9, boolean, java.lang.Exception):void");
        }
    }

    public interface c {
        void a();

        void a(int i10, long j10, long j11);

        void a(long j10);

        void a(Exception exc);

        void a(boolean z10);

        void b();

        void b(long j10);
    }

    public static final class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f10794a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10795b;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f10794a = j10;
            this.f10795b = j11;
        }
    }

    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f10796a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10797b;

        /* renamed from: c  reason: collision with root package name */
        public final d9 f10798c;

        public e(int i10, d9 d9Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f10797b = z10;
            this.f10796a = i10;
            this.f10798c = d9Var;
        }
    }

    long a(boolean z10);

    mh a();

    void a(float f10);

    void a(int i10);

    void a(d9 d9Var, int i10, int[] iArr);

    void a(k1 k1Var);

    void a(mh mhVar);

    void a(c cVar);

    void a(u1 u1Var);

    boolean a(d9 d9Var);

    boolean a(ByteBuffer byteBuffer, long j10, int i10);

    int b(d9 d9Var);

    void b();

    void b(boolean z10);

    boolean c();

    void d();

    void e();

    void f();

    boolean g();

    void h();

    void i();

    void j();

    void pause();

    void reset();

    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final d9 f10790a;

        public a(String str, d9 d9Var) {
            super(str);
            this.f10790a = d9Var;
        }

        public a(Throwable th, d9 d9Var) {
            super(th);
            this.f10790a = d9Var;
        }
    }
}
