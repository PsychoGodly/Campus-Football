package j4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import k4.n0;

/* compiled from: ContentDataSource */
public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f19321e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f19322f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f19323g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f19324h;

    /* renamed from: i  reason: collision with root package name */
    private long f19325i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19326j;

    /* compiled from: ContentDataSource */
    public static class a extends m {
        public a(IOException iOException, int i10) {
            super((Throwable) iOException, i10);
        }
    }

    public h(Context context) {
        super(false);
        this.f19321e = context.getContentResolver();
    }

    public void close() throws a {
        this.f19322f = null;
        try {
            FileInputStream fileInputStream = this.f19324h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f19324h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f19323g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f19323g = null;
                if (this.f19326j) {
                    this.f19326j = false;
                    r();
                }
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.f19323g = null;
                if (this.f19326j) {
                    this.f19326j = false;
                    r();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new a(e11, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.f19324h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f19323g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f19323g = null;
                if (this.f19326j) {
                    this.f19326j = false;
                    r();
                }
                throw th2;
            } catch (IOException e12) {
                throw new a(e12, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.f19323g = null;
                if (this.f19326j) {
                    this.f19326j = false;
                    r();
                }
                throw th3;
            }
        }
    }

    public long f(p pVar) throws a {
        AssetFileDescriptor assetFileDescriptor;
        p pVar2 = pVar;
        int i10 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = pVar2.f19387a;
            this.f19322f = uri;
            s(pVar);
            if ("content".equals(pVar2.f19387a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f19321e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f19321e.openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.f19323g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f19324h = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    if (pVar2.f19393g > length) {
                        throw new a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j10 = length;
                long skip = fileInputStream.skip(pVar2.f19393g + startOffset) - startOffset;
                if (skip == pVar2.f19393g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f19325i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f19325i = position;
                            if (position < 0) {
                                throw new a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j11 = j10 - skip;
                        this.f19325i = j11;
                        if (j11 < 0) {
                            throw new a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j12 = pVar2.f19394h;
                    if (j12 != -1) {
                        long j13 = this.f19325i;
                        if (j13 != -1) {
                            j12 = Math.min(j13, j12);
                        }
                        this.f19325i = j12;
                    }
                    this.f19326j = true;
                    t(pVar);
                    long j14 = pVar2.f19394h;
                    return j14 != -1 ? j14 : this.f19325i;
                }
                throw new a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new a(e11, i10);
        }
    }

    public Uri o() {
        return this.f19322f;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19325i;
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
        int read = ((FileInputStream) n0.j(this.f19324h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f19325i;
        if (j11 != -1) {
            this.f19325i = j11 - ((long) read);
        }
        q(read);
        return read;
    }
}
