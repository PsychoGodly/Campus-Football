package h5;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t1;
import com.google.android.gms.common.internal.u1;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class x extends t1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f18867a;

    protected x(byte[] bArr) {
        q.a(bArr.length == 25);
        this.f18867a = Arrays.hashCode(bArr);
    }

    protected static byte[] A1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] B1();

    public final boolean equals(Object obj) {
        a zzd;
        if (obj != null && (obj instanceof u1)) {
            try {
                u1 u1Var = (u1) obj;
                if (u1Var.zzc() != this.f18867a || (zzd = u1Var.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(B1(), (byte[]) b.A1(zzd));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18867a;
    }

    public final int zzc() {
        return this.f18867a;
    }

    public final a zzd() {
        return b.B1(B1());
    }
}
