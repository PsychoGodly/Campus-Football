package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

public class ImageViewUtils {
    /* access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar, String str, ImageView imageView, Uri uri) {
        InputStream openStream;
        if (((Boolean) kVar.a(oj.M)).booleanValue()) {
            try {
                openStream = new URL(str).openStream();
                AppLovinSdkUtils.runOnUiThread(new e(kVar, BitmapFactory.decodeStream(openStream), imageView));
                if (openStream != null) {
                    openStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    t L = kVar.L();
                    L.a("ImageViewUtils", "Failed to fetch image: " + uri, th);
                }
                kVar.L().a("ImageViewUtils", th);
                kVar.B().a("ImageViewUtils", "setImageUri", th);
                return;
            }
        } else {
            InputStream inputStream = null;
            try {
                inputStream = new URL(str).openStream();
                AppLovinSdkUtils.runOnUiThread(new f(kVar, BitmapFactory.decodeStream(inputStream), imageView));
                return;
            } catch (Throwable th2) {
                kVar.L();
                if (t.a()) {
                    t L2 = kVar.L();
                    L2.a("ImageViewUtils", "Failed to fetch image: " + uri, th2);
                }
                return;
            } finally {
                zp.a((Closeable) inputStream, kVar);
            }
        }
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri != null && imageView != null) {
            k kVar = k.A0;
            if (kVar == null) {
                t.h("ImageViewUtils", "SDK has not been initialized");
            } else {
                kVar.l0().b().execute(new a(uri, imageView));
            }
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri != null && imageView != null) {
            if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
                imageView.post(new c(imageView, uri));
            } else {
                setAndDownscaleBitmap(imageView, uri);
            }
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, k kVar) {
        if (imageView != null && uri != null) {
            String uri2 = uri.toString();
            if (URLUtil.isFileUrl(uri2) || URLUtil.isContentUrl(uri2)) {
                AppLovinSdkUtils.runOnUiThread(new d(imageView, uri));
            } else if (kVar != null) {
                kVar.L();
                if (t.a()) {
                    t L = kVar.L();
                    L.a("ImageViewUtils", "Fetching image: " + uri);
                }
                kVar.l0().b().execute(new g(kVar, uri2, imageView, uri));
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(k kVar, Bitmap bitmap, ImageView imageView) {
        kVar.L();
        if (t.a()) {
            kVar.L().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(k.k().getResources(), bitmap));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar, Bitmap bitmap, ImageView imageView) {
        kVar.L();
        if (t.a()) {
            kVar.L().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(k.k().getResources(), bitmap));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point b10 = x3.b(imageView.getContext());
            height = Math.min(b10.x, b10.y);
            width = height;
        }
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > height || i12 > width) {
            while (true) {
                int i13 = i10 * 2;
                if (i11 / i13 < height && i12 / i13 < width) {
                    break;
                }
                i10 = i13;
            }
        }
        options.inSampleSize = i10;
        options.inJustDecodeBounds = false;
        k.A0.L();
        if (t.a()) {
            t L = k.A0.L();
            L.a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new b(imageView, BitmapFactory.decodeFile(uri.getPath(), options)));
    }
}
