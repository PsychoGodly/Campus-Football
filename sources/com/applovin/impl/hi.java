package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class hi extends z1 {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f8320e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8321f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f8322g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f8323h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f8324i;

    /* renamed from: j  reason: collision with root package name */
    private long f8325j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8326k;

    public static class a extends h5 {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public hi(Context context) {
        super(false);
        this.f8320e = context.getResources();
        this.f8321f = context.getPackageName();
    }

    public long a(j5 j5Var) {
        int i10;
        String str;
        j5 j5Var2 = j5Var;
        Uri uri = j5Var2.f8675a;
        this.f8322g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) a1.a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i10 = Integer.parseInt((String) a1.a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) a1.a((Object) uri.getPath());
            if (str2.startsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = MaxReward.DEFAULT_LABEL;
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(str2);
            i10 = this.f8320e.getIdentifier(sb2.toString(), "raw", this.f8321f);
            if (i10 == 0) {
                throw new a("Resource not found.", (Throwable) null, 2005);
            }
        } else {
            throw new a("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        b(j5Var);
        try {
            AssetFileDescriptor openRawResourceFd = this.f8320e.openRawResourceFd(i10);
            this.f8323h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f8324i = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    try {
                        if (j5Var2.f8681g > length) {
                            throw new a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (a e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new a((String) null, e11, AdError.SERVER_ERROR_CODE);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(j5Var2.f8681g + startOffset) - startOffset;
                if (skip == j5Var2.f8681g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f8325j = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f8325j = size;
                            if (size < 0) {
                                throw new a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f8325j = j10;
                        if (j10 < 0) {
                            throw new h5(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = j5Var2.f8682h;
                    if (j11 != -1) {
                        long j12 = this.f8325j;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f8325j = j11;
                    }
                    this.f8326k = true;
                    c(j5Var);
                    long j13 = j5Var2.f8682h;
                    return j13 != -1 ? j13 : this.f8325j;
                }
                throw new a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a("Resource is compressed: " + uri, (Throwable) null, AdError.SERVER_ERROR_CODE);
        } catch (Resources.NotFoundException e12) {
            throw new a((String) null, e12, 2005);
        }
    }

    public Uri c() {
        return this.f8322g;
    }

    public void close() {
        this.f8322g = null;
        try {
            InputStream inputStream = this.f8324i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f8324i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f8323h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f8323h = null;
                if (this.f8326k) {
                    this.f8326k = false;
                    g();
                }
            } catch (IOException e10) {
                throw new a((String) null, e10, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.f8323h = null;
                if (this.f8326k) {
                    this.f8326k = false;
                    g();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new a((String) null, e11, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.f8324i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f8323h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f8323h = null;
                if (this.f8326k) {
                    this.f8326k = false;
                    g();
                }
                throw th2;
            } catch (IOException e12) {
                throw new a((String) null, e12, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.f8323h = null;
                if (this.f8326k) {
                    this.f8326k = false;
                    g();
                }
                throw th3;
            }
        }
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f8325j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a((String) null, e10, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) yp.a((Object) this.f8324i)).read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f8325j;
            if (j11 != -1) {
                this.f8325j = j11 - ((long) read);
            }
            d(read);
            return read;
        } else if (this.f8325j == -1) {
            return -1;
        } else {
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
    }
}
