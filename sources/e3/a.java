package e3;

import android.media.MediaCodec;
import e3.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f32456a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.c f32457b;

    public /* synthetic */ a(b bVar, l.c cVar) {
        this.f32456a = bVar;
        this.f32457b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f32456a.w(this.f32457b, mediaCodec, j10, j11);
    }
}
