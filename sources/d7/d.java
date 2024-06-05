package d7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.internal.p001firebaseauthapi.zzafq;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.b0;
import com.google.firebase.auth.c0;
import com.google.firebase.auth.c1;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.h0;
import com.google.firebase.auth.j0;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import i5.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class d extends a0 {
    public static final Parcelable.Creator<d> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    private zzafn f28520a;

    /* renamed from: b  reason: collision with root package name */
    private y1 f28521b;

    /* renamed from: c  reason: collision with root package name */
    private String f28522c;

    /* renamed from: d  reason: collision with root package name */
    private String f28523d;

    /* renamed from: f  reason: collision with root package name */
    private List<y1> f28524f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f28525g;

    /* renamed from: h  reason: collision with root package name */
    private String f28526h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f28527i;

    /* renamed from: j  reason: collision with root package name */
    private f f28528j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f28529k;

    /* renamed from: l  reason: collision with root package name */
    private d2 f28530l;

    /* renamed from: m  reason: collision with root package name */
    private l0 f28531m;

    /* renamed from: n  reason: collision with root package name */
    private List<zzafq> f28532n;

    public d(f fVar, List<? extends c1> list) {
        q.k(fVar);
        this.f28522c = fVar.q();
        this.f28523d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f28526h = CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        k0(list);
    }

    public String B() {
        Map map;
        zzafn zzafn = this.f28520a;
        if (zzafn == null || zzafn.zzc() == null || (map = (Map) h0.a(this.f28520a.zzc()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public boolean C() {
        c0 a10;
        Boolean bool = this.f28527i;
        if (bool == null || bool.booleanValue()) {
            zzafn zzafn = this.f28520a;
            String str = MaxReward.DEFAULT_LABEL;
            if (!(zzafn == null || (a10 = h0.a(zzafn.zzc())) == null)) {
                str = a10.e();
            }
            boolean z10 = true;
            if (z().size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f28527i = Boolean.valueOf(z10);
        }
        return this.f28527i.booleanValue();
    }

    public String D() {
        return this.f28521b.D();
    }

    public String c() {
        return this.f28521b.c();
    }

    public Uri e() {
        return this.f28521b.e();
    }

    public boolean g() {
        return this.f28521b.g();
    }

    public String getEmail() {
        return this.f28521b.getEmail();
    }

    public String getPhoneNumber() {
        return this.f28521b.getPhoneNumber();
    }

    public final synchronized a0 k0(List<? extends c1> list) {
        q.k(list);
        this.f28524f = new ArrayList(list.size());
        this.f28525g = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1 c1Var = (c1) list.get(i10);
            if (c1Var.D().equals("firebase")) {
                this.f28521b = (y1) c1Var;
            } else {
                this.f28525g.add(c1Var.D());
            }
            this.f28524f.add((y1) c1Var);
        }
        if (this.f28521b == null) {
            this.f28521b = this.f28524f.get(0);
        }
        return this;
    }

    public final f l0() {
        return f.p(this.f28522c);
    }

    public String m() {
        return this.f28521b.m();
    }

    public final void m0(zzafn zzafn) {
        this.f28520a = (zzafn) q.k(zzafn);
    }

    public final /* synthetic */ a0 n0() {
        this.f28527i = Boolean.FALSE;
        return this;
    }

    public final void o0(List<j0> list) {
        this.f28531m = l0.b(list);
    }

    public final zzafn p0() {
        return this.f28520a;
    }

    public final List<String> q0() {
        return this.f28525g;
    }

    public final d r0(String str) {
        this.f28526h = str;
        return this;
    }

    public final void s0(d2 d2Var) {
        this.f28530l = d2Var;
    }

    public final void t0(f fVar) {
        this.f28528j = fVar;
    }

    public final void u0(boolean z10) {
        this.f28529k = z10;
    }

    public final void v0(List<zzafq> list) {
        q.k(list);
        this.f28532n = list;
    }

    public final d2 w0() {
        return this.f28530l;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, p0(), i10, false);
        c.p(parcel, 2, this.f28521b, i10, false);
        c.q(parcel, 3, this.f28522c, false);
        c.q(parcel, 4, this.f28523d, false);
        c.u(parcel, 5, this.f28524f, false);
        c.s(parcel, 6, q0(), false);
        c.q(parcel, 7, this.f28526h, false);
        c.d(parcel, 8, Boolean.valueOf(C()), false);
        c.p(parcel, 9, x(), i10, false);
        c.c(parcel, 10, this.f28529k);
        c.p(parcel, 11, this.f28530l, i10, false);
        c.p(parcel, 12, this.f28531m, i10, false);
        c.u(parcel, 13, this.f28532n, false);
        c.b(parcel, a10);
    }

    public b0 x() {
        return this.f28528j;
    }

    public final List<y1> x0() {
        return this.f28524f;
    }

    public /* synthetic */ h0 y() {
        return new h(this);
    }

    public final boolean y0() {
        return this.f28529k;
    }

    public List<? extends c1> z() {
        return this.f28524f;
    }

    public final String zzd() {
        return p0().zzc();
    }

    public final String zze() {
        return this.f28520a.zzf();
    }

    public final List<j0> zzh() {
        l0 l0Var = this.f28531m;
        if (l0Var != null) {
            return l0Var.v();
        }
        return new ArrayList();
    }

    d(zzafn zzafn, y1 y1Var, String str, String str2, List<y1> list, List<String> list2, String str3, Boolean bool, f fVar, boolean z10, d2 d2Var, l0 l0Var, List<zzafq> list3) {
        this.f28520a = zzafn;
        this.f28521b = y1Var;
        this.f28522c = str;
        this.f28523d = str2;
        this.f28524f = list;
        this.f28525g = list2;
        this.f28526h = str3;
        this.f28527i = bool;
        this.f28528j = fVar;
        this.f28529k = z10;
        this.f28530l = d2Var;
        this.f28531m = l0Var;
        this.f28532n = list3;
    }
}
