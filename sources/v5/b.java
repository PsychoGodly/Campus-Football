package v5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class b extends a implements i {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    final int f30680a;

    /* renamed from: b  reason: collision with root package name */
    private int f30681b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f30682c;

    public b() {
        this(2, 0, (Intent) null);
    }

    public final Status p() {
        if (this.f30681b == 0) {
            return Status.f15009h;
        }
        return Status.f15013l;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f30680a);
        c.k(parcel, 2, this.f30681b);
        c.p(parcel, 3, this.f30682c, i10, false);
        c.b(parcel, a10);
    }

    b(int i10, int i11, Intent intent) {
        this.f30680a = i10;
        this.f30681b = i11;
        this.f30682c = intent;
    }
}
