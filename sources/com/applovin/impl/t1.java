package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

final class t1 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f12207a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f12208b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f12209c;

    /* renamed from: d  reason: collision with root package name */
    private int f12210d;

    /* renamed from: e  reason: collision with root package name */
    private int f12211e;

    /* renamed from: f  reason: collision with root package name */
    private s1 f12212f;

    /* renamed from: g  reason: collision with root package name */
    private int f12213g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12214h;

    /* renamed from: i  reason: collision with root package name */
    private long f12215i;

    /* renamed from: j  reason: collision with root package name */
    private float f12216j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12217k;

    /* renamed from: l  reason: collision with root package name */
    private long f12218l;

    /* renamed from: m  reason: collision with root package name */
    private long f12219m;

    /* renamed from: n  reason: collision with root package name */
    private Method f12220n;

    /* renamed from: o  reason: collision with root package name */
    private long f12221o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12222p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12223q;

    /* renamed from: r  reason: collision with root package name */
    private long f12224r;

    /* renamed from: s  reason: collision with root package name */
    private long f12225s;

    /* renamed from: t  reason: collision with root package name */
    private long f12226t;

    /* renamed from: u  reason: collision with root package name */
    private long f12227u;

    /* renamed from: v  reason: collision with root package name */
    private int f12228v;

    /* renamed from: w  reason: collision with root package name */
    private int f12229w;

    /* renamed from: x  reason: collision with root package name */
    private long f12230x;

    /* renamed from: y  reason: collision with root package name */
    private long f12231y;

    /* renamed from: z  reason: collision with root package name */
    private long f12232z;

    public interface a {
        void a(int i10, long j10);

        void a(long j10);

        void a(long j10, long j11, long j12, long j13);

        void b(long j10);

        void b(long j10, long j11, long j12, long j13);
    }

    public t1(a aVar) {
        this.f12207a = (a) a1.a((Object) aVar);
        if (yp.f13662a >= 18) {
            try {
                this.f12220n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f12208b = new long[10];
    }

    private boolean a() {
        return this.f12214h && ((AudioTrack) a1.a((Object) this.f12209c)).getPlayState() == 2 && b() == 0;
    }

    private void h(long j10) {
        Method method;
        if (this.f12223q && (method = this.f12220n) != null && j10 - this.f12224r >= 500000) {
            try {
                long intValue = (((long) ((Integer) yp.a((Object) (Integer) method.invoke(a1.a((Object) this.f12209c), new Object[0]))).intValue()) * 1000) - this.f12215i;
                this.f12221o = intValue;
                long max = Math.max(intValue, 0);
                this.f12221o = max;
                if (max > 5000000) {
                    this.f12207a.b(max);
                    this.f12221o = 0;
                }
            } catch (Exception unused) {
                this.f12220n = null;
            }
            this.f12224r = j10;
        }
    }

    public int b(long j10) {
        return this.f12211e - ((int) (j10 - (b() * ((long) this.f12210d))));
    }

    public long c(long j10) {
        return r2.b(a(j10 - b()));
    }

    public void d(long j10) {
        this.f12232z = b();
        this.f12230x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean e(long j10) {
        return j10 > b() || a();
    }

    public boolean f(long j10) {
        return this.f12231y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f12231y >= 200;
    }

    public boolean g(long j10) {
        int playState = ((AudioTrack) a1.a((Object) this.f12209c)).getPlayState();
        if (this.f12214h) {
            if (playState == 2) {
                this.f12222p = false;
                return false;
            } else if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z10 = this.f12222p;
        boolean e10 = e(j10);
        this.f12222p = e10;
        if (z10 && !e10 && playState != 1) {
            this.f12207a.a(this.f12211e, r2.b(this.f12215i));
        }
        return true;
    }

    public void i() {
        ((s1) a1.a((Object) this.f12212f)).f();
    }

    private long c() {
        return a(b());
    }

    private void e() {
        long c10 = c();
        if (c10 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f12219m >= 30000) {
                long[] jArr = this.f12208b;
                int i10 = this.f12228v;
                jArr[i10] = c10 - nanoTime;
                this.f12228v = (i10 + 1) % 10;
                int i11 = this.f12229w;
                if (i11 < 10) {
                    this.f12229w = i11 + 1;
                }
                this.f12219m = nanoTime;
                this.f12218l = 0;
                int i12 = 0;
                while (true) {
                    int i13 = this.f12229w;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f12218l += this.f12208b[i12] / ((long) i13);
                    i12++;
                }
            }
            if (!this.f12214h) {
                a(nanoTime, c10);
                h(nanoTime);
            }
        }
    }

    private long b() {
        AudioTrack audioTrack = (AudioTrack) a1.a((Object) this.f12209c);
        if (this.f12230x != -9223372036854775807L) {
            return Math.min(this.A, this.f12232z + ((((SystemClock.elapsedRealtime() * 1000) - this.f12230x) * ((long) this.f12213g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f12214h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f12227u = this.f12225s;
            }
            playbackHeadPosition += this.f12227u;
        }
        if (yp.f13662a <= 29) {
            if (playbackHeadPosition == 0 && this.f12225s > 0 && playState == 3) {
                if (this.f12231y == -9223372036854775807L) {
                    this.f12231y = SystemClock.elapsedRealtime();
                }
                return this.f12225s;
            }
            this.f12231y = -9223372036854775807L;
        }
        if (this.f12225s > playbackHeadPosition) {
            this.f12226t++;
        }
        this.f12225s = playbackHeadPosition;
        return playbackHeadPosition + (this.f12226t << 32);
    }

    public boolean f() {
        h();
        if (this.f12230x != -9223372036854775807L) {
            return false;
        }
        ((s1) a1.a((Object) this.f12212f)).f();
        return true;
    }

    private long a(long j10) {
        return (j10 * 1000000) / ((long) this.f12213g);
    }

    public boolean d() {
        return ((AudioTrack) a1.a((Object) this.f12209c)).getPlayState() == 3;
    }

    public long a(boolean z10) {
        long j10;
        if (((AudioTrack) a1.a((Object) this.f12209c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        s1 s1Var = (s1) a1.a((Object) this.f12212f);
        boolean d10 = s1Var.d();
        if (d10) {
            j10 = a(s1Var.b()) + yp.a(nanoTime - s1Var.c(), this.f12216j);
        } else {
            if (this.f12229w == 0) {
                j10 = c();
            } else {
                j10 = this.f12218l + nanoTime;
            }
            if (!z10) {
                j10 = Math.max(0, j10 - this.f12221o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime - this.F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.E + yp.a(j11, this.f12216j)))) / 1000;
        }
        if (!this.f12217k) {
            long j13 = this.B;
            if (j10 > j13) {
                this.f12217k = true;
                this.f12207a.a(System.currentTimeMillis() - r2.b(yp.b(r2.b(j10 - j13), this.f12216j)));
            }
        }
        this.C = nanoTime;
        this.B = j10;
        this.D = d10;
        return j10;
    }

    public void g() {
        h();
        this.f12209c = null;
        this.f12212f = null;
    }

    private void h() {
        this.f12218l = 0;
        this.f12229w = 0;
        this.f12228v = 0;
        this.f12219m = 0;
        this.C = 0;
        this.F = 0;
        this.f12217k = false;
    }

    private void a(long j10, long j11) {
        s1 s1Var = (s1) a1.a((Object) this.f12212f);
        if (s1Var.a(j10)) {
            long c10 = s1Var.c();
            long b10 = s1Var.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f12207a.b(b10, c10, j10, j11);
                s1Var.e();
            } else if (Math.abs(a(b10) - j11) > 5000000) {
                this.f12207a.a(b10, c10, j10, j11);
                s1Var.e();
            } else {
                s1Var.a();
            }
        }
    }

    public void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f12209c = audioTrack;
        this.f12210d = i11;
        this.f12211e = i12;
        this.f12212f = new s1(audioTrack);
        this.f12213g = audioTrack.getSampleRate();
        this.f12214h = z10 && a(i10);
        boolean g10 = yp.g(i10);
        this.f12223q = g10;
        this.f12215i = g10 ? a((long) (i12 / i11)) : -9223372036854775807L;
        this.f12225s = 0;
        this.f12226t = 0;
        this.f12227u = 0;
        this.f12222p = false;
        this.f12230x = -9223372036854775807L;
        this.f12231y = -9223372036854775807L;
        this.f12224r = 0;
        this.f12221o = 0;
        this.f12216j = 1.0f;
    }

    public void a(float f10) {
        this.f12216j = f10;
        s1 s1Var = this.f12212f;
        if (s1Var != null) {
            s1Var.f();
        }
    }

    private static boolean a(int i10) {
        return yp.f13662a < 23 && (i10 == 5 || i10 == 6);
    }
}
