package q4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfo;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class a extends i5.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21814a;

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f21815b;

    a(boolean z10, IBinder iBinder) {
        this.f21814a = z10;
        this.f21815b = iBinder;
    }

    public boolean v() {
        return this.f21814a;
    }

    public final zzbfo w() {
        IBinder iBinder = this.f21815b;
        if (iBinder == null) {
            return null;
        }
        return zzbfn.zzc(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, v());
        c.j(parcel, 2, this.f21815b, false);
        c.b(parcel, a10);
    }
}
