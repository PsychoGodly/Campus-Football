package r5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f29766a;

    public c(Bundle bundle) {
        this.f29766a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = i5.c.a(parcel);
        i5.c.e(parcel, 1, this.f29766a, false);
        i5.c.b(parcel, a10);
    }
}
