package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o0;
import h5.b;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    final int f30687a;

    /* renamed from: b  reason: collision with root package name */
    private final b f30688b;

    /* renamed from: c  reason: collision with root package name */
    private final o0 f30689c;

    l(int i10, b bVar, o0 o0Var) {
        this.f30687a = i10;
        this.f30688b = bVar;
        this.f30689c = o0Var;
    }

    public final b v() {
        return this.f30688b;
    }

    public final o0 w() {
        return this.f30689c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f30687a);
        c.p(parcel, 2, this.f30688b, i10, false);
        c.p(parcel, 3, this.f30689c, i10, false);
        c.b(parcel, a10);
    }
}
