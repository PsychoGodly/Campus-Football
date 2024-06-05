package r2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import k4.n0;
import r2.h;

/* compiled from: DrmUtil */
public final class c0 {

    /* compiled from: DrmUtil */
    private static final class a {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* compiled from: DrmUtil */
    private static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return n0.U(n0.V(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* compiled from: DrmUtil */
    private static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i10) {
        int i11 = n0.f19738a;
        if (i11 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i11 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof p0) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof h.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof m0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
