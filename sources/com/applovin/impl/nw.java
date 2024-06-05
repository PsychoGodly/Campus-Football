package com.applovin.impl;

import android.media.MediaCodec;
import com.applovin.impl.cd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class nw implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f1 f10031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cd.c f10032b;

    public /* synthetic */ nw(f1 f1Var, cd.c cVar) {
        this.f10031a = f1Var;
        this.f10032b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f10031a.a(this.f10032b, mediaCodec, j10, j11);
    }
}
