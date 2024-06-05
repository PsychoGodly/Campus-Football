package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class b1 extends z1 {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f6602e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f6603f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f6604g;

    /* renamed from: h  reason: collision with root package name */
    private long f6605h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6606i;

    public static final class a extends h5 {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public b1(Context context) {
        super(false);
        this.f6602e = context.getAssets();
    }

    public long a(j5 j5Var) {
        try {
            Uri uri = j5Var.f8675a;
            this.f6603f = uri;
            String str = (String) a1.a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                str = str.substring(1);
            }
            b(j5Var);
            InputStream open = this.f6602e.open(str, 1);
            this.f6604g = open;
            if (open.skip(j5Var.f8681g) >= j5Var.f8681g) {
                long j10 = j5Var.f8682h;
                if (j10 != -1) {
                    this.f6605h = j10;
                } else {
                    long available = (long) this.f6604g.available();
                    this.f6605h = available;
                    if (available == 2147483647L) {
                        this.f6605h = -1;
                    }
                }
                this.f6606i = true;
                c(j5Var);
                return this.f6605h;
            }
            throw new a((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    public Uri c() {
        return this.f6603f;
    }

    public void close() {
        this.f6603f = null;
        try {
            InputStream inputStream = this.f6604g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f6604g = null;
            if (this.f6606i) {
                this.f6606i = false;
                g();
            }
        } catch (IOException e10) {
            throw new a(e10, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f6604g = null;
            if (this.f6606i) {
                this.f6606i = false;
                g();
            }
            throw th;
        }
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6605h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) yp.a((Object) this.f6604g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f6605h;
        if (j11 != -1) {
            this.f6605h = j11 - ((long) read);
        }
        d(read);
        return read;
    }
}
