package e3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import e3.l;
import java.nio.ByteBuffer;
import k4.k0;
import q2.c;
import r6.v;

/* compiled from: AsynchronousMediaCodecAdapter */
final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f17795a;

    /* renamed from: b  reason: collision with root package name */
    private final g f17796b;

    /* renamed from: c  reason: collision with root package name */
    private final e f17797c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17798d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17799e;

    /* renamed from: f  reason: collision with root package name */
    private int f17800f;

    /* renamed from: e3.b$b  reason: collision with other inner class name */
    /* compiled from: AsynchronousMediaCodecAdapter */
    public static final class C0184b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        private final v<HandlerThread> f17801a;

        /* renamed from: b  reason: collision with root package name */
        private final v<HandlerThread> f17802b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f17803c;

        public C0184b(int i10, boolean z10) {
            this(new c(i10), new d(i10), z10);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.s(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.t(i10));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e3.b a(e3.l.a r10) throws java.io.IOException {
            /*
                r9 = this;
                e3.n r0 = r10.f17845a
                java.lang.String r0 = r0.f17853a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
                r2.<init>()     // Catch:{ Exception -> 0x004d }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x004d }
                r2.append(r0)     // Catch:{ Exception -> 0x004d }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004d }
                k4.k0.a(r2)     // Catch:{ Exception -> 0x004d }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x004d }
                e3.b r2 = new e3.b     // Catch:{ Exception -> 0x004b }
                r6.v<android.os.HandlerThread> r3 = r9.f17801a     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x004b }
                r6.v<android.os.HandlerThread> r3 = r9.f17802b     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x004b }
                boolean r7 = r9.f17803c     // Catch:{ Exception -> 0x004b }
                r8 = 0
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x004b }
                k4.k0.c()     // Catch:{ Exception -> 0x0048 }
                android.media.MediaFormat r1 = r10.f17846b     // Catch:{ Exception -> 0x0048 }
                android.view.Surface r3 = r10.f17848d     // Catch:{ Exception -> 0x0048 }
                android.media.MediaCrypto r4 = r10.f17849e     // Catch:{ Exception -> 0x0048 }
                int r10 = r10.f17850f     // Catch:{ Exception -> 0x0048 }
                r2.v(r1, r3, r4, r10)     // Catch:{ Exception -> 0x0048 }
                return r2
            L_0x0048:
                r10 = move-exception
                r1 = r2
                goto L_0x004f
            L_0x004b:
                r10 = move-exception
                goto L_0x004f
            L_0x004d:
                r10 = move-exception
                r0 = r1
            L_0x004f:
                if (r1 != 0) goto L_0x0057
                if (r0 == 0) goto L_0x005a
                r0.release()
                goto L_0x005a
            L_0x0057:
                r1.release()
            L_0x005a:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.b.C0184b.a(e3.l$a):e3.b");
        }

        C0184b(v<HandlerThread> vVar, v<HandlerThread> vVar2, boolean z10) {
            this.f17801a = vVar;
            this.f17802b = vVar2;
            this.f17803c = z10;
        }
    }

    /* access modifiers changed from: private */
    public static String s(int i10) {
        return u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String t(int i10) {
        return u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f17796b.h(this.f17795a);
        k0.a("configureCodec");
        this.f17795a.configure(mediaFormat, surface, mediaCrypto, i10);
        k0.c();
        this.f17797c.q();
        k0.a("startCodec");
        this.f17795a.start();
        k0.c();
        this.f17800f = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void x() {
        if (this.f17798d) {
            try {
                this.f17797c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public boolean a() {
        return false;
    }

    public MediaFormat b() {
        return this.f17796b.g();
    }

    public void c(l.c cVar, Handler handler) {
        x();
        this.f17795a.setOnFrameRenderedListener(new a(this, cVar), handler);
    }

    public void d(int i10, int i11, c cVar, long j10, int i12) {
        this.f17797c.n(i10, i11, cVar, j10, i12);
    }

    public void e(Bundle bundle) {
        x();
        this.f17795a.setParameters(bundle);
    }

    public void f(int i10, long j10) {
        this.f17795a.releaseOutputBuffer(i10, j10);
    }

    public void flush() {
        this.f17797c.i();
        this.f17795a.flush();
        this.f17796b.e();
        this.f17795a.start();
    }

    public int g() {
        this.f17797c.l();
        return this.f17796b.c();
    }

    public int h(MediaCodec.BufferInfo bufferInfo) {
        this.f17797c.l();
        return this.f17796b.d(bufferInfo);
    }

    public void i(int i10, boolean z10) {
        this.f17795a.releaseOutputBuffer(i10, z10);
    }

    public void j(int i10) {
        x();
        this.f17795a.setVideoScalingMode(i10);
    }

    public ByteBuffer k(int i10) {
        return this.f17795a.getInputBuffer(i10);
    }

    public void l(Surface surface) {
        x();
        this.f17795a.setOutputSurface(surface);
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        this.f17797c.m(i10, i11, i12, j10, i13);
    }

    public ByteBuffer n(int i10) {
        return this.f17795a.getOutputBuffer(i10);
    }

    public void release() {
        try {
            if (this.f17800f == 1) {
                this.f17797c.p();
                this.f17796b.o();
            }
            this.f17800f = 2;
        } finally {
            if (!this.f17799e) {
                this.f17795a.release();
                this.f17799e = true;
            }
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f17795a = mediaCodec;
        this.f17796b = new g(handlerThread);
        this.f17797c = new e(mediaCodec, handlerThread2);
        this.f17798d = z10;
        this.f17800f = 0;
    }
}
