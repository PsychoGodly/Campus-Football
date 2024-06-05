package g5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i5.c;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class a extends i5.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    Intent f18106a;

    public a(Intent intent) {
        this.f18106a = intent;
    }

    public Intent v() {
        return this.f18106a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f18106a, i10, false);
        c.b(parcel, a10);
    }
}
