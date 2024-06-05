package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m0;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    final int f30685a;

    /* renamed from: b  reason: collision with root package name */
    final m0 f30686b;

    j(int i10, m0 m0Var) {
        this.f30685a = i10;
        this.f30686b = m0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f30685a);
        c.p(parcel, 2, this.f30686b, i10, false);
        c.b(parcel, a10);
    }
}
