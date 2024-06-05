package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17571a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17572b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bitmap f17573c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f17574d;

    public z0(String str, String str2, Bitmap bitmap, Context context) {
        this.f17571a = str;
        this.f17572b = str2;
        this.f17573c = bitmap;
        this.f17574d = context;
    }

    public void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        ((ConcurrentHashMap) a1.f15597a).put(this.f17571a + this.f17572b, this.f17573c);
        try {
            fileOutputStream = new FileOutputStream(this.f17574d.getFilesDir().getPath() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + this.f17571a + this.f17572b);
            try {
                this.f17573c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                j9.a((Closeable) fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    i3.a(th);
                } finally {
                    j9.a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream = null;
            th = th4;
            i3.a(th);
        }
    }
}
