package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import i5.a;
import i5.c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class h extends a implements i {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f30683a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30684b;

    public h(List<String> list, String str) {
        this.f30683a = list;
        this.f30684b = str;
    }

    public final Status p() {
        if (this.f30684b != null) {
            return Status.f15009h;
        }
        return Status.f15013l;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 1, this.f30683a, false);
        c.q(parcel, 2, this.f30684b, false);
        c.b(parcel, a10);
    }
}
