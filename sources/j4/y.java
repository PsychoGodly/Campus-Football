package j4;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import k4.n0;

/* compiled from: FileDataSource */
public final class y extends g {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f19490e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f19491f;

    /* renamed from: g  reason: collision with root package name */
    private long f19492g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19493h;

    /* compiled from: FileDataSource */
    private static final class a {
        /* access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* compiled from: FileDataSource */
    public static class b extends m {
        public b(Throwable th, int i10) {
            super(th, i10);
        }

        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public y() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) throws b {
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) k4.a.e(uri.getPath()), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10, 1004);
            }
            if (n0.f19738a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new b(e12, AdError.SERVER_ERROR_CODE);
        }
    }

    public void close() throws b {
        this.f19491f = null;
        try {
            RandomAccessFile randomAccessFile = this.f19490e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f19490e = null;
            if (this.f19493h) {
                this.f19493h = false;
                r();
            }
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f19490e = null;
            if (this.f19493h) {
                this.f19493h = false;
                r();
            }
            throw th;
        }
    }

    public long f(p pVar) throws b {
        Uri uri = pVar.f19387a;
        this.f19491f = uri;
        s(pVar);
        RandomAccessFile u10 = u(uri);
        this.f19490e = u10;
        try {
            u10.seek(pVar.f19393g);
            long j10 = pVar.f19394h;
            if (j10 == -1) {
                j10 = this.f19490e.length() - pVar.f19393g;
            }
            this.f19492g = j10;
            if (j10 >= 0) {
                this.f19493h = true;
                t(pVar);
                return this.f19492g;
            }
            throw new b((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    public Uri o() {
        return this.f19491f;
    }

    public int read(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f19492g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) n0.j(this.f19490e)).read(bArr, i10, (int) Math.min(this.f19492g, (long) i11));
            if (read > 0) {
                this.f19492g -= (long) read;
                q(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }
}
