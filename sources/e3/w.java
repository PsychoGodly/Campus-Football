package e3;

import android.media.MediaCodec;
import e3.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f32466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.c f32467b;

    public /* synthetic */ w(x xVar, l.c cVar) {
        this.f32466a = xVar;
        this.f32467b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f32466a.p(this.f32467b, mediaCodec, j10, j11);
    }
}
