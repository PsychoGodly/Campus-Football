package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f12068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f12069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageView f12070c;

    public /* synthetic */ f(k kVar, Bitmap bitmap, ImageView imageView) {
        this.f12068a = kVar;
        this.f12069b = bitmap;
        this.f12070c = imageView;
    }

    public final void run() {
        ImageViewUtils.b(this.f12068a, this.f12069b, this.f12070c);
    }
}
