package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class q4 extends z1 {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f10814e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f10815f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f10816g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f10817h;

    /* renamed from: i  reason: collision with root package name */
    private long f10818i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10819j;

    private static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType(MimeTypes.VIDEO_H265).addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public static class b extends h5 {
        public b(IOException iOException, int i10) {
            super((Throwable) iOException, i10);
        }
    }

    public q4(Context context) {
        super(false);
        this.f10814e = context.getContentResolver();
    }

    public long a(j5 j5Var) {
        AssetFileDescriptor assetFileDescriptor;
        int i10 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = j5Var.f8675a;
            this.f10815f = uri;
            b(j5Var);
            if ("content".equals(j5Var.f8675a.getScheme())) {
                Bundle bundle = new Bundle();
                if (yp.f13662a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptor = this.f10814e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f10814e.openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.f10816g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f10817h = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    if (j5Var.f8681g > length) {
                        throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(j5Var.f8681g + startOffset) - startOffset;
                if (skip == j5Var.f8681g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f10818i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f10818i = position;
                            if (position < 0) {
                                throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f10818i = j10;
                        if (j10 < 0) {
                            throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = j5Var.f8682h;
                    if (j11 != -1) {
                        long j12 = this.f10818i;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f10818i = j11;
                    }
                    this.f10819j = true;
                    c(j5Var);
                    long j13 = j5Var.f8682h;
                    return j13 != -1 ? j13 : this.f10818i;
                }
                throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new b(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new b(e11, i10);
        }
    }

    public Uri c() {
        return this.f10815f;
    }

    public void close() {
        this.f10815f = null;
        try {
            FileInputStream fileInputStream = this.f10817h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f10817h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f10816g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f10816g = null;
                if (this.f10819j) {
                    this.f10819j = false;
                    g();
                }
            } catch (IOException e10) {
                throw new b(e10, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.f10816g = null;
                if (this.f10819j) {
                    this.f10819j = false;
                    g();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new b(e11, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.f10817h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f10816g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f10816g = null;
                if (this.f10819j) {
                    this.f10819j = false;
                    g();
                }
                throw th2;
            } catch (IOException e12) {
                throw new b(e12, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.f10816g = null;
                if (this.f10819j) {
                    this.f10819j = false;
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
        long j10 = this.f10818i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new b(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((FileInputStream) yp.a((Object) this.f10817h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f10818i;
        if (j11 != -1) {
            this.f10818i = j11 - ((long) read);
        }
        d(read);
        return read;
    }
}
