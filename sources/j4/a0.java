package j4;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import r6.c;

/* compiled from: HttpDataSource */
public class a0 extends m {

    /* renamed from: b  reason: collision with root package name */
    public final p f19287b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19288c;

    public a0(p pVar, int i10, int i11) {
        super(b(i10, i11));
        this.f19287b = pVar;
        this.f19288c = i11;
    }

    private static int b(int i10, int i11) {
        return (i10 == 2000 && i11 == 1) ? AdError.INTERNAL_ERROR_CODE : i10;
    }

    public static a0 c(IOException iOException, p pVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !c.e(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        }
        if (i11 == 2007) {
            return new z(iOException, pVar);
        }
        return new a0(iOException, pVar, i11, i10);
    }

    public a0(String str, p pVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f19287b = pVar;
        this.f19288c = i11;
    }

    public a0(IOException iOException, p pVar, int i10, int i11) {
        super((Throwable) iOException, b(i10, i11));
        this.f19287b = pVar;
        this.f19288c = i11;
    }

    public a0(String str, IOException iOException, p pVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f19287b = pVar;
        this.f19288c = i11;
    }
}
