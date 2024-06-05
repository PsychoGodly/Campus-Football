package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f12061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f12062b;

    public /* synthetic */ c(ImageView imageView, Uri uri) {
        this.f12061a = imageView;
        this.f12062b = uri;
    }

    public final void run() {
        ImageViewUtils.setAndDownscaleBitmap(this.f12061a, this.f12062b);
    }
}
