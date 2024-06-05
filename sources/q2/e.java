package q2;

import k4.n0;

/* compiled from: DecoderCounters */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f21742a;

    /* renamed from: b  reason: collision with root package name */
    public int f21743b;

    /* renamed from: c  reason: collision with root package name */
    public int f21744c;

    /* renamed from: d  reason: collision with root package name */
    public int f21745d;

    /* renamed from: e  reason: collision with root package name */
    public int f21746e;

    /* renamed from: f  reason: collision with root package name */
    public int f21747f;

    /* renamed from: g  reason: collision with root package name */
    public int f21748g;

    /* renamed from: h  reason: collision with root package name */
    public int f21749h;

    /* renamed from: i  reason: collision with root package name */
    public int f21750i;

    /* renamed from: j  reason: collision with root package name */
    public int f21751j;

    /* renamed from: k  reason: collision with root package name */
    public long f21752k;

    /* renamed from: l  reason: collision with root package name */
    public int f21753l;

    private void b(long j10, int i10) {
        this.f21752k += j10;
        this.f21753l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return n0.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f21742a), Integer.valueOf(this.f21743b), Integer.valueOf(this.f21744c), Integer.valueOf(this.f21745d), Integer.valueOf(this.f21746e), Integer.valueOf(this.f21747f), Integer.valueOf(this.f21748g), Integer.valueOf(this.f21749h), Integer.valueOf(this.f21750i), Integer.valueOf(this.f21751j), Long.valueOf(this.f21752k), Integer.valueOf(this.f21753l));
    }
}
