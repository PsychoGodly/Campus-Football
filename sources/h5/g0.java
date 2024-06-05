package h5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t1;
import com.google.android.gms.dynamic.b;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class g0 extends a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: a  reason: collision with root package name */
    private final String f18837a;

    /* renamed from: b  reason: collision with root package name */
    private final x f18838b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18839c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18840d;

    g0(String str, IBinder iBinder, boolean z10, boolean z11) {
        byte[] bArr;
        this.f18837a = str;
        y yVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.a zzd = t1.M0(iBinder).zzd();
                if (zzd == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) b.A1(zzd);
                }
                if (bArr != null) {
                    yVar = new y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f18838b = yVar;
        this.f18839c = z10;
        this.f18840d = z11;
    }

    g0(String str, x xVar, boolean z10, boolean z11) {
        this.f18837a = str;
        this.f18838b = xVar;
        this.f18839c = z10;
        this.f18840d = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f18837a, false);
        x xVar = this.f18838b;
        if (xVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            xVar = null;
        }
        c.j(parcel, 2, xVar, false);
        c.c(parcel, 3, this.f18839c);
        c.c(parcel, 4, this.f18840d);
        c.b(parcel, a10);
    }
}
