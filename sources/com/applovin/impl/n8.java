package com.applovin.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class n8 extends z1 {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f9919e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f9920f;

    /* renamed from: g  reason: collision with root package name */
    private long f9921g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9922h;

    private static final class a {
        /* access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends h5 {
        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public b(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public n8() {
        super(false);
    }

    public long a(j5 j5Var) {
        Uri uri = j5Var.f8675a;
        this.f9920f = uri;
        b(j5Var);
        RandomAccessFile a10 = a(uri);
        this.f9919e = a10;
        try {
            a10.seek(j5Var.f8681g);
            long j10 = j5Var.f8682h;
            if (j10 == -1) {
                j10 = this.f9919e.length() - j5Var.f8681g;
            }
            this.f9921g = j10;
            if (j10 >= 0) {
                this.f9922h = true;
                c(j5Var);
                return this.f9921g;
            }
            throw new b((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    public Uri c() {
        return this.f9920f;
    }

    public void close() {
        this.f9920f = null;
        try {
            RandomAccessFile randomAccessFile = this.f9919e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f9919e = null;
            if (this.f9922h) {
                this.f9922h = false;
                g();
            }
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f9919e = null;
            if (this.f9922h) {
                this.f9922h = false;
                g();
            }
            throw th;
        }
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f9921g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) yp.a((Object) this.f9919e)).read(bArr, i10, (int) Math.min(this.f9921g, (long) i11));
            if (read > 0) {
                this.f9921g -= (long) read;
                d(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    private static RandomAccessFile a(Uri uri) {
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) a1.a((Object) uri.getPath()), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10, 1004);
            }
            if (yp.f13662a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new b(e12, AdError.SERVER_ERROR_CODE);
        }
    }
}
