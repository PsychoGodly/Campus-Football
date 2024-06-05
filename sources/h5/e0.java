package h5;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class e0 extends a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18830a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18831b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18832c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18833d;

    e0(boolean z10, String str, int i10, int i11) {
        this.f18830a = z10;
        this.f18831b = str;
        this.f18832c = m0.a(i10) - 1;
        this.f18833d = r.a(i11) - 1;
    }

    public final boolean v() {
        return this.f18830a;
    }

    public final int w() {
        return r.a(this.f18833d);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f18830a);
        c.q(parcel, 2, this.f18831b, false);
        c.k(parcel, 3, this.f18832c);
        c.k(parcel, 4, this.f18833d);
        c.b(parcel, a10);
    }

    public final int x() {
        return m0.a(this.f18832c);
    }

    public final String zza() {
        return this.f18831b;
    }
}
