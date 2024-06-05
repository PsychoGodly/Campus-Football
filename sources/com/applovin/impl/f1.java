package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.cd;
import java.nio.ByteBuffer;
import java.util.Objects;

final class f1 implements cd {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f7566a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f7567b;

    /* renamed from: c  reason: collision with root package name */
    private final g1 f7568c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7569d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7570e;

    /* renamed from: f  reason: collision with root package name */
    private int f7571f;

    /* renamed from: g  reason: collision with root package name */
    private Surface f7572g;

    public static final class b implements cd.b {

        /* renamed from: b  reason: collision with root package name */
        private final Supplier f7573b;

        /* renamed from: c  reason: collision with root package name */
        private final Supplier f7574c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f7575d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f7576e;

        public b(int i10, boolean z10, boolean z11) {
            this(new pw(i10), new qw(i10), z10, z11);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.impl.f1 a(com.applovin.impl.cd.a r12) {
            /*
                r11 = this;
                com.applovin.impl.fd r0 = r12.f6972a
                java.lang.String r0 = r0.f7722a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052 }
                r2.<init>()     // Catch:{ Exception -> 0x0052 }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x0052 }
                r2.append(r0)     // Catch:{ Exception -> 0x0052 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052 }
                com.applovin.impl.lo.a(r2)     // Catch:{ Exception -> 0x0052 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0052 }
                com.applovin.impl.f1 r10 = new com.applovin.impl.f1     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.common.base.Supplier r2 = r11.f7573b     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0050 }
                r5 = r2
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.common.base.Supplier r2 = r11.f7574c     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0050 }
                r6 = r2
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0050 }
                boolean r7 = r11.f7575d     // Catch:{ Exception -> 0x0050 }
                boolean r8 = r11.f7576e     // Catch:{ Exception -> 0x0050 }
                r9 = 0
                r3 = r10
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0050 }
                com.applovin.impl.lo.a()     // Catch:{ Exception -> 0x004d }
                android.media.MediaFormat r3 = r12.f6973b     // Catch:{ Exception -> 0x004d }
                android.view.Surface r4 = r12.f6975d     // Catch:{ Exception -> 0x004d }
                android.media.MediaCrypto r5 = r12.f6976e     // Catch:{ Exception -> 0x004d }
                int r6 = r12.f6977f     // Catch:{ Exception -> 0x004d }
                boolean r7 = r12.f6978g     // Catch:{ Exception -> 0x004d }
                r2 = r10
                r2.a((android.media.MediaFormat) r3, (android.view.Surface) r4, (android.media.MediaCrypto) r5, (int) r6, (boolean) r7)     // Catch:{ Exception -> 0x004d }
                return r10
            L_0x004d:
                r12 = move-exception
                r1 = r10
                goto L_0x0054
            L_0x0050:
                r12 = move-exception
                goto L_0x0054
            L_0x0052:
                r12 = move-exception
                r0 = r1
            L_0x0054:
                if (r1 != 0) goto L_0x005c
                if (r0 == 0) goto L_0x005f
                r0.release()
                goto L_0x005f
            L_0x005c:
                r1.a()
            L_0x005f:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.f1.b.a(com.applovin.impl.cd$a):com.applovin.impl.f1");
        }

        b(Supplier supplier, Supplier supplier2, boolean z10, boolean z11) {
            this.f7573b = supplier;
            this.f7574c = supplier2;
            this.f7575d = z10;
            this.f7576e = z11;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(f1.f(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(f1.g(i10));
        }
    }

    private f1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f7566a = mediaCodec;
        this.f7567b = new h1(handlerThread);
        this.f7568c = new g1(mediaCodec, handlerThread2, z10);
        this.f7569d = z11;
        this.f7571f = 0;
    }

    /* access modifiers changed from: private */
    public static String f(int i10) {
        return a(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String g(int i10) {
        return a(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public void b() {
        this.f7568c.b();
        this.f7566a.flush();
        h1 h1Var = this.f7567b;
        MediaCodec mediaCodec = this.f7566a;
        Objects.requireNonNull(mediaCodec);
        h1Var.a((Runnable) new ow(mediaCodec));
    }

    public void c(int i10) {
        f();
        this.f7566a.setVideoScalingMode(i10);
    }

    public boolean c() {
        return false;
    }

    private static String a(int i10, String str) {
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

    private void f() {
        if (this.f7569d) {
            try {
                this.f7568c.i();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public int d() {
        return this.f7567b.a();
    }

    public MediaFormat e() {
        return this.f7567b.c();
    }

    public ByteBuffer b(int i10) {
        return this.f7566a.getOutputBuffer(i10);
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f7567b.a(bufferInfo);
    }

    public ByteBuffer a(int i10) {
        return this.f7566a.getInputBuffer(i10);
    }

    /* access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f7567b.a(this.f7566a);
        lo.a("configureCodec");
        this.f7566a.configure(mediaFormat, surface, mediaCrypto, i10);
        lo.a();
        if (z10) {
            this.f7572g = this.f7566a.createInputSurface();
        }
        this.f7568c.h();
        lo.a("startCodec");
        this.f7566a.start();
        lo.a();
        this.f7571f = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f7568c.b(i10, i11, i12, j10, i13);
    }

    public void a(int i10, int i11, y4 y4Var, long j10, int i12) {
        this.f7568c.a(i10, i11, y4Var, j10, i12);
    }

    public void a() {
        try {
            if (this.f7571f == 1) {
                this.f7568c.g();
                this.f7567b.h();
            }
            this.f7571f = 2;
        } finally {
            Surface surface = this.f7572g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f7570e) {
                this.f7566a.release();
                this.f7570e = true;
            }
        }
    }

    public void a(int i10, long j10) {
        this.f7566a.releaseOutputBuffer(i10, j10);
    }

    public void a(int i10, boolean z10) {
        this.f7566a.releaseOutputBuffer(i10, z10);
    }

    public void a(cd.c cVar, Handler handler) {
        f();
        this.f7566a.setOnFrameRenderedListener(new nw(this, cVar), handler);
    }

    public void a(Surface surface) {
        f();
        this.f7566a.setOutputSurface(surface);
    }

    public void a(Bundle bundle) {
        f();
        this.f7566a.setParameters(bundle);
    }
}
