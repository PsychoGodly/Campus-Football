package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

final class h1 extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8169a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f8170b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f8171c;

    /* renamed from: d  reason: collision with root package name */
    private final kb f8172d;

    /* renamed from: e  reason: collision with root package name */
    private final kb f8173e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f8174f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f8175g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f8176h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f8177i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f8178j;

    /* renamed from: k  reason: collision with root package name */
    private long f8179k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8180l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f8181m;

    h1(HandlerThread handlerThread) {
        this.f8170b = handlerThread;
        this.f8172d = new kb();
        this.f8173e = new kb();
        this.f8174f = new ArrayDeque();
        this.f8175g = new ArrayDeque();
    }

    private void a(MediaFormat mediaFormat) {
        this.f8173e.a(-2);
        this.f8175g.add(mediaFormat);
    }

    private void b() {
        if (!this.f8175g.isEmpty()) {
            this.f8177i = (MediaFormat) this.f8175g.getLast();
        }
        this.f8172d.a();
        this.f8173e.a();
        this.f8174f.clear();
        this.f8175g.clear();
        this.f8178j = null;
    }

    private boolean d() {
        return this.f8179k > 0 || this.f8180l;
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        IllegalStateException illegalStateException = this.f8181m;
        if (illegalStateException != null) {
            this.f8181m = null;
            throw illegalStateException;
        }
    }

    private void g() {
        MediaCodec.CodecException codecException = this.f8178j;
        if (codecException != null) {
            this.f8178j = null;
            throw codecException;
        }
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f8169a) {
            mediaFormat = this.f8176h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h() {
        synchronized (this.f8169a) {
            this.f8180l = true;
            this.f8170b.quit();
            b();
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f8169a) {
            this.f8178j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f8169a) {
            this.f8172d.a(i10);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f8169a) {
            MediaFormat mediaFormat = this.f8177i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.f8177i = null;
            }
            this.f8173e.a(i10);
            this.f8174f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f8169a) {
            a(mediaFormat);
            this.f8177i = null;
        }
    }

    private void d(Runnable runnable) {
        if (!this.f8180l) {
            long j10 = this.f8179k - 1;
            this.f8179k = j10;
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 <= 0) {
                if (i10 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                b();
                try {
                    runnable.run();
                } catch (IllegalStateException e10) {
                    a(e10);
                } catch (Exception e11) {
                    a(new IllegalStateException(e11));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8169a
            monitor-enter(r0)
            boolean r1 = r3.d()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.e()     // Catch:{ all -> 0x0020 }
            com.applovin.impl.kb r1 = r3.f8172d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            com.applovin.impl.kb r1 = r3.f8172d     // Catch:{ all -> 0x0020 }
            int r2 = r1.d()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h1.a():int");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void b(Runnable runnable) {
        synchronized (this.f8169a) {
            d(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f8169a
            monitor-enter(r0)
            boolean r1 = r9.d()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.e()     // Catch:{ all -> 0x004a }
            com.applovin.impl.kb r1 = r9.f8173e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.c()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            com.applovin.impl.kb r1 = r9.f8173e     // Catch:{ all -> 0x004a }
            int r1 = r1.d()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f8176h     // Catch:{ all -> 0x004a }
            com.applovin.impl.a1.b((java.lang.Object) r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque r2 = r9.f8174f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque r10 = r9.f8175g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f8176h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h1.a(android.media.MediaCodec$BufferInfo):int");
    }

    public void a(Runnable runnable) {
        synchronized (this.f8169a) {
            this.f8179k++;
            ((Handler) yp.a((Object) this.f8171c)).post(new qx(this, runnable));
        }
    }

    public void a(MediaCodec mediaCodec) {
        a1.b(this.f8171c == null);
        this.f8170b.start();
        Handler handler = new Handler(this.f8170b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f8171c = handler;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f8169a) {
            this.f8181m = illegalStateException;
        }
    }
}
