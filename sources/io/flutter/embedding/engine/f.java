package io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f33596a;

    public /* synthetic */ f(long j10) {
        this.f33596a = j10;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f33596a, imageDecoder, imageInfo, source);
    }
}
