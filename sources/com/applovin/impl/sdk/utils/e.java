package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f12065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f12066b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageView f12067c;

    public /* synthetic */ e(k kVar, Bitmap bitmap, ImageView imageView) {
        this.f12065a = kVar;
        this.f12066b = bitmap;
        this.f12067c = imageView;
    }

    public final void run() {
        ImageViewUtils.a(this.f12065a, this.f12066b, this.f12067c);
    }
}
