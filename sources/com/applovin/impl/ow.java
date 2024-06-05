package com.applovin.impl;

import android.media.MediaCodec;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ow implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaCodec f10547a;

    public /* synthetic */ ow(MediaCodec mediaCodec) {
        this.f10547a = mediaCodec;
    }

    public final void run() {
        this.f10547a.start();
    }
}
