package p2;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import n2.f3;
import n2.r1;
import o2.u1;

/* compiled from: AudioSink */
public interface v {

    /* compiled from: AudioSink */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f21343a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21344b;

        /* renamed from: c  reason: collision with root package name */
        public final r1 f21345c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(int r4, int r5, int r6, int r7, n2.r1 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L_0x0038
                java.lang.String r5 = " (recoverable)"
                goto L_0x003a
            L_0x0038:
                java.lang.String r5 = ""
            L_0x003a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f21343a = r4
                r3.f21344b = r9
                r3.f21345c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.v.b.<init>(int, int, int, int, n2.r1, boolean, java.lang.Exception):void");
        }
    }

    /* compiled from: AudioSink */
    public interface c {
        void a(boolean z10);

        void b(Exception exc);

        void c(long j10);

        void d();

        void e(int i10, long j10, long j11);

        void f();

        void g();
    }

    /* compiled from: AudioSink */
    public static final class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f21346a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21347b;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f21346a = j10;
            this.f21347b = j11;
        }
    }

    /* compiled from: AudioSink */
    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f21348a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21349b;

        /* renamed from: c  reason: collision with root package name */
        public final r1 f21350c;

        public e(int i10, r1 r1Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f21349b = z10;
            this.f21348a = i10;
            this.f21350c = r1Var;
        }
    }

    boolean a(r1 r1Var);

    boolean b();

    void c(f3 f3Var);

    void d(y yVar);

    f3 e();

    void f(e eVar);

    void flush();

    void g(boolean z10);

    int h(r1 r1Var);

    void i();

    void j(AudioDeviceInfo audioDeviceInfo);

    void k() throws e;

    boolean l();

    void m(int i10);

    long n(boolean z10);

    void o();

    void p(long j10);

    void pause();

    void q();

    void r(r1 r1Var, int i10, int[] iArr) throws a;

    void reset();

    void s();

    void setVolume(float f10);

    boolean t(ByteBuffer byteBuffer, long j10, int i10) throws b, e;

    void u(c cVar);

    void v(u1 u1Var);

    void w();

    /* compiled from: AudioSink */
    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final r1 f21342a;

        public a(Throwable th, r1 r1Var) {
            super(th);
            this.f21342a = r1Var;
        }

        public a(String str, r1 r1Var) {
            super(str);
            this.f21342a = r1Var;
        }
    }
}
