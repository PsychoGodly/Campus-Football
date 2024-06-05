package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f12071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12072b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageView f12073c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Uri f12074d;

    public /* synthetic */ g(k kVar, String str, ImageView imageView, Uri uri) {
        this.f12071a = kVar;
        this.f12072b = str;
        this.f12073c = imageView;
        this.f12074d = uri;
    }

    public final void run() {
        ImageViewUtils.a(this.f12071a, this.f12072b, this.f12073c, this.f12074d);
    }
}
