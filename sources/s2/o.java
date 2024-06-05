package s2;

import java.io.EOFException;
import java.io.IOException;
import n2.y2;

/* compiled from: ExtractorUtil */
public final class o {
    public static void a(boolean z10, String str) throws y2 {
        if (!z10) {
            throw y2.a(str, (Throwable) null);
        }
    }

    public static boolean b(m mVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return mVar.g(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(m mVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int j10 = mVar.j(bArr, i10 + i12, i11 - i12);
            if (j10 == -1) {
                break;
            }
            i12 += j10;
        }
        return i12;
    }

    public static boolean d(m mVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            mVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(m mVar, int i10) throws IOException {
        try {
            mVar.m(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
