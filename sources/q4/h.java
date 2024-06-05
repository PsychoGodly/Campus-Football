package q4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.b1;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfo;
import i5.a;
import i5.c;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21832a;

    /* renamed from: b  reason: collision with root package name */
    private final c1 f21833b;

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f21834c;

    h(boolean z10, IBinder iBinder, IBinder iBinder2) {
        this.f21832a = z10;
        this.f21833b = iBinder != null ? b1.zzd(iBinder) : null;
        this.f21834c = iBinder2;
    }

    public final c1 v() {
        return this.f21833b;
    }

    public final zzbfo w() {
        IBinder iBinder = this.f21834c;
        if (iBinder == null) {
            return null;
        }
        return zzbfn.zzc(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f21832a);
        c1 c1Var = this.f21833b;
        if (c1Var == null) {
            iBinder = null;
        } else {
            iBinder = c1Var.asBinder();
        }
        c.j(parcel, 2, iBinder, false);
        c.j(parcel, 3, this.f21834c, false);
        c.b(parcel, a10);
    }

    public final boolean zzc() {
        return this.f21832a;
    }
}
