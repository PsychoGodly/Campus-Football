package j4;

import com.unity3d.services.UnityAdsConstants;
import j4.g0;
import j4.h0;
import java.io.FileNotFoundException;
import java.io.IOException;
import n2.y2;

/* compiled from: DefaultLoadErrorHandlingPolicy */
public class x implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f19489a;

    public x() {
        this(-1);
    }

    public g0.b a(g0.a aVar, g0.c cVar) {
        if (!e(cVar.f19319c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new g0.b(1, 300000);
        }
        if (aVar.a(2)) {
            return new g0.b(2, 60000);
        }
        return null;
    }

    public /* synthetic */ void b(long j10) {
        f0.a(this, j10);
    }

    public long c(g0.c cVar) {
        IOException iOException = cVar.f19319c;
        if ((iOException instanceof y2) || (iOException instanceof FileNotFoundException) || (iOException instanceof z) || (iOException instanceof h0.h) || m.a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((cVar.f19320d - 1) * 1000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
    }

    public int d(int i10) {
        int i11 = this.f19489a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public boolean e(IOException iOException) {
        if (!(iOException instanceof c0)) {
            return false;
        }
        int i10 = ((c0) iOException).f19295d;
        if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
            return true;
        }
        return false;
    }

    public x(int i10) {
        this.f19489a = i10;
    }
}
