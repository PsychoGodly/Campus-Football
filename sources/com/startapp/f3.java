package com.startapp;

import android.graphics.Bitmap;
import com.startapp.b1;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;

/* compiled from: Sta */
public class f3 implements b1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageResourceConfig f15816a;

    public f3(ImageResourceConfig imageResourceConfig) {
        this.f15816a = imageResourceConfig;
    }

    public void a(Bitmap bitmap, int i10) {
        ImageResourceConfig imageResourceConfig = this.f15816a;
        imageResourceConfig.f16880a = bitmap;
        if (bitmap != null) {
            imageResourceConfig.f16882c = bitmap;
        }
    }
}
