package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f12059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f12060b;

    public /* synthetic */ b(ImageView imageView, Bitmap bitmap) {
        this.f12059a = imageView;
        this.f12060b = bitmap;
    }

    public final void run() {
        this.f12059a.setImageBitmap(this.f12060b);
    }
}
