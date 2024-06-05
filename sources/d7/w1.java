package d7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.g;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import i5.c;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class w1 implements i {
    public static final Parcelable.Creator<w1> CREATOR = new z1();

    /* renamed from: a  reason: collision with root package name */
    private d f28639a;

    /* renamed from: b  reason: collision with root package name */
    private u1 f28640b;

    /* renamed from: c  reason: collision with root package name */
    private d2 f28641c;

    public w1(d dVar) {
        d dVar2 = (d) q.k(dVar);
        this.f28639a = dVar2;
        List<y1> x02 = dVar2.x0();
        this.f28640b = null;
        for (int i10 = 0; i10 < x02.size(); i10++) {
            if (!TextUtils.isEmpty(x02.get(i10).zza())) {
                this.f28640b = new u1(x02.get(i10).D(), x02.get(i10).zza(), dVar.y0());
            }
        }
        if (this.f28640b == null) {
            this.f28640b = new u1(dVar.y0());
        }
        this.f28641c = dVar.w0();
    }

    public final g P() {
        return this.f28640b;
    }

    public final h Q() {
        return this.f28641c;
    }

    public final a0 V() {
        return this.f28639a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, V(), i10, false);
        c.p(parcel, 2, P(), i10, false);
        c.p(parcel, 3, this.f28641c, i10, false);
        c.b(parcel, a10);
    }

    w1(d dVar, u1 u1Var, d2 d2Var) {
        this.f28639a = dVar;
        this.f28640b = u1Var;
        this.f28641c = d2Var;
    }
}
