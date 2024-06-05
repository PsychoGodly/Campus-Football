package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.l0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.y0;
import i5.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class o extends l0 {
    public static final Parcelable.Creator<o> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    private String f28587a;

    /* renamed from: b  reason: collision with root package name */
    private String f28588b;

    /* renamed from: c  reason: collision with root package name */
    private List<t0> f28589c;

    /* renamed from: d  reason: collision with root package name */
    private List<y0> f28590d;

    /* renamed from: f  reason: collision with root package name */
    private d f28591f;

    private o() {
    }

    public static o w(String str, d dVar) {
        q.g(str);
        o oVar = new o();
        oVar.f28587a = str;
        oVar.f28591f = dVar;
        return oVar;
    }

    public static o x(List<j0> list, String str) {
        q.k(list);
        q.g(str);
        o oVar = new o();
        oVar.f28589c = new ArrayList();
        oVar.f28590d = new ArrayList();
        for (j0 next : list) {
            if (next instanceof t0) {
                oVar.f28589c.add((t0) next);
            } else if (next instanceof y0) {
                oVar.f28590d.add((y0) next);
            } else {
                String w10 = next.w();
                throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + w10);
            }
        }
        oVar.f28588b = str;
        return oVar;
    }

    public final d v() {
        return this.f28591f;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f28587a, false);
        c.q(parcel, 2, this.f28588b, false);
        c.u(parcel, 3, this.f28589c, false);
        c.u(parcel, 4, this.f28590d, false);
        c.p(parcel, 5, this.f28591f, i10, false);
        c.b(parcel, a10);
    }

    public final String zzb() {
        return this.f28587a;
    }

    public final String zzc() {
        return this.f28588b;
    }

    public final boolean zzd() {
        return this.f28587a != null;
    }

    o(String str, String str2, List<t0> list, List<y0> list2, d dVar) {
        this.f28587a = str;
        this.f28588b = str2;
        this.f28589c = list;
        this.f28590d = list2;
        this.f28591f = dVar;
    }
}
