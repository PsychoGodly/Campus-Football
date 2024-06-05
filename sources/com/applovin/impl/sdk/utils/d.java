package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f12063a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f12064b;

    public /* synthetic */ d(ImageView imageView, Uri uri) {
        this.f12063a = imageView;
        this.f12064b = uri;
    }

    public final void run() {
        ImageViewUtils.b(this.f12063a, this.f12064b);
    }
}
