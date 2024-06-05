package com.applovin.impl;

import android.media.MediaCodec;
import com.applovin.impl.cd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g40 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rl f7909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cd.c f7910b;

    public /* synthetic */ g40(rl rlVar, cd.c cVar) {
        this.f7909a = rlVar;
        this.f7910b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f7909a.a(this.f7910b, mediaCodec, j10, j11);
    }
}
