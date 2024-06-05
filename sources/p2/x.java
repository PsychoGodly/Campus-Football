package p2;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import k4.n0;

/* compiled from: AudioTrackPositionTracker */
final class x {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a  reason: collision with root package name */
    private final a f21362a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f21363b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f21364c;

    /* renamed from: d  reason: collision with root package name */
    private int f21365d;

    /* renamed from: e  reason: collision with root package name */
    private int f21366e;

    /* renamed from: f  reason: collision with root package name */
    private w f21367f;

    /* renamed from: g  reason: collision with root package name */
    private int f21368g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21369h;

    /* renamed from: i  reason: collision with root package name */
    private long f21370i;

    /* renamed from: j  reason: collision with root package name */
    private float f21371j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21372k;

    /* renamed from: l  reason: collision with root package name */
    private long f21373l;

    /* renamed from: m  reason: collision with root package name */
    private long f21374m;

    /* renamed from: n  reason: collision with root package name */
    private Method f21375n;

    /* renamed from: o  reason: collision with root package name */
    private long f21376o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21377p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f21378q;

    /* renamed from: r  reason: collision with root package name */
    private long f21379r;

    /* renamed from: s  reason: collision with root package name */
    private long f21380s;

    /* renamed from: t  reason: collision with root package name */
    private long f21381t;

    /* renamed from: u  reason: collision with root package name */
    private long f21382u;

    /* renamed from: v  reason: collision with root package name */
    private long f21383v;

    /* renamed from: w  reason: collision with root package name */
    private int f21384w;

    /* renamed from: x  reason: collision with root package name */
    private int f21385x;

    /* renamed from: y  reason: collision with root package name */
    private long f21386y;

    /* renamed from: z  reason: collision with root package name */
    private long f21387z;

    /* compiled from: AudioTrackPositionTracker */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public x(a aVar) {
        this.f21362a = (a) k4.a.e(aVar);
        if (n0.f19738a >= 18) {
            try {
                this.f21375n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f21363b = new long[10];
    }

    private boolean a() {
        return this.f21369h && ((AudioTrack) k4.a.e(this.f21364c)).getPlayState() == 2 && e() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / ((long) this.f21368g);
    }

    private long e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f21386y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + ((n0.Z((elapsedRealtime * 1000) - j10, this.f21371j) * ((long) this.f21368g)) / 1000000));
        }
        if (elapsedRealtime - this.f21380s >= 5) {
            v(elapsedRealtime);
            this.f21380s = elapsedRealtime;
        }
        return this.f21381t + (this.f21382u << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j10) {
        w wVar = (w) k4.a.e(this.f21367f);
        if (wVar.e(j10)) {
            long c10 = wVar.c();
            long b10 = wVar.b();
            long f10 = f();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f21362a.e(b10, c10, j10, f10);
                wVar.f();
            } else if (Math.abs(b(b10) - f10) > 5000000) {
                this.f21362a.d(b10, c10, j10, f10);
                wVar.f();
            } else {
                wVar.a();
            }
        }
    }

    private void m() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f21374m >= 30000) {
            long f10 = f();
            if (f10 != 0) {
                this.f21363b[this.f21384w] = n0.e0(f10, this.f21371j) - nanoTime;
                this.f21384w = (this.f21384w + 1) % 10;
                int i10 = this.f21385x;
                if (i10 < 10) {
                    this.f21385x = i10 + 1;
                }
                this.f21374m = nanoTime;
                this.f21373l = 0;
                int i11 = 0;
                while (true) {
                    int i12 = this.f21385x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f21373l += this.f21363b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (!this.f21369h) {
            l(nanoTime);
            n(nanoTime);
        }
    }

    private void n(long j10) {
        Method method;
        if (this.f21378q && (method = this.f21375n) != null && j10 - this.f21379r >= 500000) {
            try {
                long intValue = (((long) ((Integer) n0.j((Integer) method.invoke(k4.a.e(this.f21364c), new Object[0]))).intValue()) * 1000) - this.f21370i;
                this.f21376o = intValue;
                long max = Math.max(intValue, 0);
                this.f21376o = max;
                if (max > 5000000) {
                    this.f21362a.b(max);
                    this.f21376o = 0;
                }
            } catch (Exception unused) {
                this.f21375n = null;
            }
            this.f21379r = j10;
        }
    }

    private static boolean o(int i10) {
        return n0.f19738a < 23 && (i10 == 5 || i10 == 6);
    }

    private void r() {
        this.f21373l = 0;
        this.f21385x = 0;
        this.f21384w = 0;
        this.f21374m = 0;
        this.D = 0;
        this.G = 0;
        this.f21372k = false;
    }

    private void v(long j10) {
        AudioTrack audioTrack = (AudioTrack) k4.a.e(this.f21364c);
        int playState = audioTrack.getPlayState();
        if (playState != 1) {
            long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
            if (this.f21369h) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f21383v = this.f21381t;
                }
                playbackHeadPosition += this.f21383v;
            }
            if (n0.f19738a <= 29) {
                if (playbackHeadPosition != 0 || this.f21381t <= 0 || playState != 3) {
                    this.f21387z = -9223372036854775807L;
                } else if (this.f21387z == -9223372036854775807L) {
                    this.f21387z = j10;
                    return;
                } else {
                    return;
                }
            }
            if (this.f21381t > playbackHeadPosition) {
                this.f21382u++;
            }
            this.f21381t = playbackHeadPosition;
        }
    }

    public int c(long j10) {
        return this.f21366e - ((int) (j10 - (e() * ((long) this.f21365d))));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) k4.a.e(this.f21364c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        w wVar = (w) k4.a.e(this.f21367f);
        boolean d10 = wVar.d();
        if (d10) {
            j10 = b(wVar.b()) + n0.Z(nanoTime - wVar.c(), this.f21371j);
        } else {
            if (this.f21385x == 0) {
                j10 = f();
            } else {
                j10 = n0.Z(this.f21373l + nanoTime, this.f21371j);
            }
            if (!z10) {
                j10 = Math.max(0, j10 - this.f21376o);
            }
        }
        if (this.E != d10) {
            this.G = this.D;
            this.F = this.C;
        }
        long j11 = nanoTime - this.G;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.F + n0.Z(j11, this.f21371j)))) / 1000;
        }
        if (!this.f21372k) {
            long j13 = this.C;
            if (j10 > j13) {
                this.f21372k = true;
                this.f21362a.c(System.currentTimeMillis() - n0.Z0(n0.e0(n0.Z0(j10 - j13), this.f21371j)));
            }
        }
        this.D = nanoTime;
        this.C = j10;
        this.E = d10;
        return j10;
    }

    public void g(long j10) {
        this.A = e();
        this.f21386y = SystemClock.elapsedRealtime() * 1000;
        this.B = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) k4.a.e(this.f21364c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f21387z != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f21387z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) k4.a.e(this.f21364c)).getPlayState();
        if (this.f21369h) {
            if (playState == 2) {
                this.f21377p = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f21377p;
        boolean h10 = h(j10);
        this.f21377p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f21362a.a(this.f21366e, n0.Z0(this.f21370i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f21386y != -9223372036854775807L) {
            return false;
        }
        ((w) k4.a.e(this.f21367f)).g();
        return true;
    }

    public void q() {
        r();
        this.f21364c = null;
        this.f21367f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f21364c = audioTrack;
        this.f21365d = i11;
        this.f21366e = i12;
        this.f21367f = new w(audioTrack);
        this.f21368g = audioTrack.getSampleRate();
        this.f21369h = z10 && o(i10);
        boolean u02 = n0.u0(i10);
        this.f21378q = u02;
        this.f21370i = u02 ? b((long) (i12 / i11)) : -9223372036854775807L;
        this.f21381t = 0;
        this.f21382u = 0;
        this.f21383v = 0;
        this.f21377p = false;
        this.f21386y = -9223372036854775807L;
        this.f21387z = -9223372036854775807L;
        this.f21379r = 0;
        this.f21376o = 0;
        this.f21371j = 1.0f;
    }

    public void t(float f10) {
        this.f21371j = f10;
        w wVar = this.f21367f;
        if (wVar != null) {
            wVar.g();
        }
        r();
    }

    public void u() {
        ((w) k4.a.e(this.f21367f)).g();
    }
}
