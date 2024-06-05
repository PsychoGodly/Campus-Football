package j4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import k4.n0;

/* compiled from: AssetDataSource */
public final class c extends g {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f19290e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f19291f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f19292g;

    /* renamed from: h  reason: collision with root package name */
    private long f19293h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19294i;

    /* compiled from: AssetDataSource */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f19290e = context.getAssets();
    }

    public void close() throws a {
        this.f19291f = null;
        try {
            InputStream inputStream = this.f19292g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f19292g = null;
            if (this.f19294i) {
                this.f19294i = false;
                r();
            }
        } catch (IOException e10) {
            throw new a(e10, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f19292g = null;
            if (this.f19294i) {
                this.f19294i = false;
                r();
            }
            throw th;
        }
    }

    public long f(p pVar) throws a {
        try {
            Uri uri = pVar.f19387a;
            this.f19291f = uri;
            String str = (String) k4.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                str = str.substring(1);
            }
            s(pVar);
            InputStream open = this.f19290e.open(str, 1);
            this.f19292g = open;
            if (open.skip(pVar.f19393g) >= pVar.f19393g) {
                long j10 = pVar.f19394h;
                if (j10 != -1) {
                    this.f19293h = j10;
                } else {
                    long available = (long) this.f19292g.available();
                    this.f19293h = available;
                    if (available == 2147483647L) {
                        this.f19293h = -1;
                    }
                }
                this.f19294i = true;
                t(pVar);
                return this.f19293h;
            }
            throw new a((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    public Uri o() {
        return this.f19291f;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19293h;
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
        int read = ((InputStream) n0.j(this.f19292g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f19293h;
        if (j11 != -1) {
            this.f19293h = j11 - ((long) read);
        }
        q(read);
        return read;
    }
}
