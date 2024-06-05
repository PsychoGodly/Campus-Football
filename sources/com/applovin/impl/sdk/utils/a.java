package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uri f12057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageView f12058b;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.f12057a = uri;
        this.f12058b = imageView;
    }

    public final void run() {
        ImageViewUtils.a(this.f12057a, this.f12058b);
    }
}
