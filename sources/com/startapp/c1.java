package com.startapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Sta */
public class c1 {

    /* compiled from: Sta */
    public static class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        public long skip(long j10) throws IOException {
            long j11 = 0;
            while (j11 < j10) {
                long skip = this.in.skip(j10 - j11);
                if (skip == 0) {
                    if (read() < 0) {
                        break;
                    }
                    skip = 1;
                }
                j11 += skip;
            }
            return j11;
        }
    }

    public static Bitmap a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap b(java.lang.String r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x002f }
            r1.<init>(r5)     // Catch:{ all -> 0x002f }
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ all -> 0x002f }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x002f }
            r5.connect()     // Catch:{ all -> 0x002b }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ all -> 0x002b }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002b }
            r2.<init>(r1)     // Catch:{ all -> 0x002b }
            com.startapp.c1$a r3 = new com.startapp.c1$a     // Catch:{ all -> 0x002b }
            r3.<init>(r1)     // Catch:{ all -> 0x002b }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x002b }
            r2.close()     // Catch:{ all -> 0x002b }
            r1.close()     // Catch:{ all -> 0x002b }
            r5.disconnect()
            goto L_0x0036
        L_0x002b:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0030
        L_0x002f:
            r5 = r0
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.disconnect()
        L_0x0035:
            r0 = r5
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.c1.b(java.lang.String):android.graphics.Bitmap");
    }

    public static Drawable a(Resources resources, String str) {
        return new BitmapDrawable(resources, a(str));
    }
}
