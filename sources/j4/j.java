package j4;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.net.URLDecoder;
import k4.a;
import k4.n0;
import n2.y2;
import r6.e;

/* compiled from: DataSchemeDataSource */
public final class j extends g {

    /* renamed from: e  reason: collision with root package name */
    private p f19347e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f19348f;

    /* renamed from: g  reason: collision with root package name */
    private int f19349g;

    /* renamed from: h  reason: collision with root package name */
    private int f19350h;

    public j() {
        super(false);
    }

    public void close() {
        if (this.f19348f != null) {
            this.f19348f = null;
            r();
        }
        this.f19347e = null;
    }

    public long f(p pVar) throws IOException {
        s(pVar);
        this.f19347e = pVar;
        Uri uri = pVar.f19387a;
        String scheme = uri.getScheme();
        boolean equals = JsonStorageKeyNames.DATA_KEY.equals(scheme);
        a.b(equals, "Unsupported scheme: " + scheme);
        String[] R0 = n0.R0(uri.getSchemeSpecificPart(), ",");
        if (R0.length == 2) {
            String str = R0[1];
            if (R0[0].contains(";base64")) {
                try {
                    this.f19348f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw y2.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f19348f = n0.m0(URLDecoder.decode(str, e.f29801a.name()));
            }
            long j10 = pVar.f19393g;
            byte[] bArr = this.f19348f;
            if (j10 <= ((long) bArr.length)) {
                int i10 = (int) j10;
                this.f19349g = i10;
                int length = bArr.length - i10;
                this.f19350h = length;
                long j11 = pVar.f19394h;
                if (j11 != -1) {
                    this.f19350h = (int) Math.min((long) length, j11);
                }
                t(pVar);
                long j12 = pVar.f19394h;
                return j12 != -1 ? j12 : (long) this.f19350h;
            }
            this.f19348f = null;
            throw new m(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw y2.b("Unexpected URI format: " + uri, (Throwable) null);
    }

    public Uri o() {
        p pVar = this.f19347e;
        if (pVar != null) {
            return pVar.f19387a;
        }
        return null;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f19350h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(n0.j(this.f19348f), this.f19349g, bArr, i10, min);
        this.f19349g += min;
        this.f19350h -= min;
        q(min);
        return min;
    }
}
