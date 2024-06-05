package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URLDecoder;

public final class f5 extends z1 {

    /* renamed from: e  reason: collision with root package name */
    private j5 f7623e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f7624f;

    /* renamed from: g  reason: collision with root package name */
    private int f7625g;

    /* renamed from: h  reason: collision with root package name */
    private int f7626h;

    public f5() {
        super(false);
    }

    public long a(j5 j5Var) {
        b(j5Var);
        this.f7623e = j5Var;
        Uri uri = j5Var.f8675a;
        String scheme = uri.getScheme();
        boolean equals = JsonStorageKeyNames.DATA_KEY.equals(scheme);
        a1.a(equals, (Object) "Unsupported scheme: " + scheme);
        String[] a10 = yp.a(uri.getSchemeSpecificPart(), ",");
        if (a10.length == 2) {
            String str = a10[1];
            if (a10[0].contains(";base64")) {
                try {
                    this.f7624f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw ah.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f7624f = yp.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j10 = j5Var.f8681g;
            byte[] bArr = this.f7624f;
            if (j10 <= ((long) bArr.length)) {
                int i10 = (int) j10;
                this.f7625g = i10;
                int length = bArr.length - i10;
                this.f7626h = length;
                long j11 = j5Var.f8682h;
                if (j11 != -1) {
                    this.f7626h = (int) Math.min((long) length, j11);
                }
                c(j5Var);
                long j12 = j5Var.f8682h;
                return j12 != -1 ? j12 : (long) this.f7626h;
            }
            this.f7624f = null;
            throw new h5(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw ah.b("Unexpected URI format: " + uri, (Throwable) null);
    }

    public Uri c() {
        j5 j5Var = this.f7623e;
        if (j5Var != null) {
            return j5Var.f8675a;
        }
        return null;
    }

    public void close() {
        if (this.f7624f != null) {
            this.f7624f = null;
            g();
        }
        this.f7623e = null;
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f7626h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(yp.a((Object) this.f7624f), this.f7625g, bArr, i10, min);
        this.f7625g += min;
        this.f7626h -= min;
        d(min);
        return min;
    }
}
