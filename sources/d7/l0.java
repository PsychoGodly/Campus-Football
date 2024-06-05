package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.y0;
import i5.a;
import i5.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class l0 extends a {
    public static final Parcelable.Creator<l0> CREATOR = new k0();

    /* renamed from: a  reason: collision with root package name */
    private final List<t0> f28572a;

    /* renamed from: b  reason: collision with root package name */
    private final List<y0> f28573b;

    l0(List<t0> list, List<y0> list2) {
        this.f28572a = list == null ? new ArrayList<>() : list;
        this.f28573b = list2 == null ? new ArrayList<>() : list2;
    }

    public static l0 b(List<j0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j0 next : list) {
            if (next instanceof t0) {
                arrayList.add((t0) next);
            } else if (next instanceof y0) {
                arrayList2.add((y0) next);
            }
        }
        return new l0(arrayList, arrayList2);
    }

    public final List<j0> v() {
        ArrayList arrayList = new ArrayList();
        for (t0 add : this.f28572a) {
            arrayList.add(add);
        }
        for (y0 add2 : this.f28573b) {
            arrayList.add(add2);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f28572a, false);
        c.u(parcel, 2, this.f28573b, false);
        c.b(parcel, a10);
    }
}
