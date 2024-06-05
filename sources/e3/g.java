package e3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import k4.a;
import k4.n0;

/* compiled from: AsynchronousMediaCodecCallback */
final class g extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17819a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f17820b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f17821c;

    /* renamed from: d  reason: collision with root package name */
    private final k f17822d;

    /* renamed from: e  reason: collision with root package name */
    private final k f17823e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f17824f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f17825g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f17826h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f17827i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f17828j;

    /* renamed from: k  reason: collision with root package name */
    private long f17829k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17830l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f17831m;

    g(HandlerThread handlerThread) {
        this.f17820b = handlerThread;
        this.f17822d = new k();
        this.f17823e = new k();
        this.f17824f = new ArrayDeque<>();
        this.f17825g = new ArrayDeque<>();
    }

    private void b(MediaFormat mediaFormat) {
        this.f17823e.a(-2);
        this.f17825g.add(mediaFormat);
    }

    private void f() {
        if (!this.f17825g.isEmpty()) {
            this.f17827i = this.f17825g.getLast();
        }
        this.f17822d.b();
        this.f17823e.b();
        this.f17824f.clear();
        this.f17825g.clear();
    }

    private boolean i() {
        return this.f17829k > 0 || this.f17830l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f17831m;
        if (illegalStateException != null) {
            this.f17831m = null;
            throw illegalStateException;
        }
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f17828j;
        if (codecException != null) {
            this.f17828j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        synchronized (this.f17819a) {
            if (!this.f17830l) {
                long j10 = this.f17829k - 1;
                this.f17829k = j10;
                if (j10 <= 0) {
                    if (j10 < 0) {
                        n(new IllegalStateException());
                    } else {
                        f();
                    }
                }
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f17819a) {
            this.f17831m = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f17819a
            monitor-enter(r0)
            boolean r1 = r3.i()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.j()     // Catch:{ all -> 0x0020 }
            e3.k r1 = r3.f17822d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.d()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            e3.k r1 = r3.f17822d     // Catch:{ all -> 0x0020 }
            int r2 = r1.e()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.g.c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f17819a
            monitor-enter(r0)
            boolean r1 = r9.i()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.j()     // Catch:{ all -> 0x004a }
            e3.k r1 = r9.f17823e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.d()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            e3.k r1 = r9.f17823e     // Catch:{ all -> 0x004a }
            int r1 = r1.e()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f17826h     // Catch:{ all -> 0x004a }
            k4.a.h(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f17824f     // Catch:{ all -> 0x004a }
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
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f17825g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f17826h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.g.d(android.media.MediaCodec$BufferInfo):int");
    }

    public void e() {
        synchronized (this.f17819a) {
            this.f17829k++;
            ((Handler) n0.j(this.f17821c)).post(new f(this));
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f17819a) {
            mediaFormat = this.f17826h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        a.f(this.f17821c == null);
        this.f17820b.start();
        Handler handler = new Handler(this.f17820b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f17821c = handler;
    }

    public void o() {
        synchronized (this.f17819a) {
            this.f17830l = true;
            this.f17820b.quit();
            f();
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f17819a) {
            this.f17828j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f17819a) {
            this.f17822d.a(i10);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f17819a) {
            MediaFormat mediaFormat = this.f17827i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f17827i = null;
            }
            this.f17823e.a(i10);
            this.f17824f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f17819a) {
            b(mediaFormat);
            this.f17827i = null;
        }
    }
}
