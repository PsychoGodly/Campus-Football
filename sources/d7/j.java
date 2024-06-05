package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzyk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.i;
import com.google.firebase.auth.i0;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.k0;
import com.google.firebase.auth.l0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.y0;
import i5.c;
import java.util.ArrayList;
import java.util.List;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class j extends k0 {
    public static final Parcelable.Creator<j> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final List<t0> f28561a;

    /* renamed from: b  reason: collision with root package name */
    private final o f28562b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28563c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final d2 f28564d;

    /* renamed from: f  reason: collision with root package name */
    private final d f28565f;

    /* renamed from: g  reason: collision with root package name */
    private final List<y0> f28566g;

    public j(List<t0> list, o oVar, String str, d2 d2Var, d dVar, List<y0> list2) {
        this.f28561a = (List) q.k(list);
        this.f28562b = (o) q.k(oVar);
        this.f28563c = q.g(str);
        this.f28564d = d2Var;
        this.f28565f = dVar;
        this.f28566g = (List) q.k(list2);
    }

    public static j B(zzyk zzyk, FirebaseAuth firebaseAuth, a0 a0Var) {
        List<j0> zzc = zzyk.zzc();
        ArrayList arrayList = new ArrayList();
        for (j0 next : zzc) {
            if (next instanceof t0) {
                arrayList.add((t0) next);
            }
        }
        List<j0> zzc2 = zzyk.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (j0 next2 : zzc2) {
            if (next2 instanceof y0) {
                arrayList2.add((y0) next2);
            }
        }
        return new j(arrayList, o.x(zzyk.zzc(), zzyk.zzb()), firebaseAuth.l().q(), zzyk.zza(), (d) a0Var, arrayList2);
    }

    public final FirebaseAuth v() {
        return FirebaseAuth.getInstance(f.p(this.f28563c));
    }

    public final List<j0> w() {
        ArrayList arrayList = new ArrayList();
        for (t0 add : this.f28561a) {
            arrayList.add(add);
        }
        for (y0 add2 : this.f28566g) {
            arrayList.add(add2);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f28561a, false);
        c.p(parcel, 2, x(), i10, false);
        c.q(parcel, 3, this.f28563c, false);
        c.p(parcel, 4, this.f28564d, i10, false);
        c.p(parcel, 5, this.f28565f, i10, false);
        c.u(parcel, 6, this.f28566g, false);
        c.b(parcel, a10);
    }

    public final l0 x() {
        return this.f28562b;
    }

    public final Task<i> y(i0 i0Var) {
        return v().V(i0Var, this.f28562b, this.f28565f).continueWithTask(new m(this));
    }
}
