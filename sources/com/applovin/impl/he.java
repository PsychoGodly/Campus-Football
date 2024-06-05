package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class he extends zb {

    /* renamed from: f  reason: collision with root package name */
    private final fe f8299f;

    /* renamed from: g  reason: collision with root package name */
    private List f8300g;

    /* renamed from: h  reason: collision with root package name */
    private final List f8301h;

    /* renamed from: i  reason: collision with root package name */
    private final List f8302i;

    /* renamed from: j  reason: collision with root package name */
    private final List f8303j;

    /* renamed from: k  reason: collision with root package name */
    private final List f8304k;

    /* renamed from: l  reason: collision with root package name */
    private SpannedString f8305l;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    he(fe feVar, Context context) {
        super(context);
        this.f8299f = feVar;
        if (feVar.q() == fe.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f8305l = new SpannedString(spannableString);
        } else {
            this.f8305l = new SpannedString(MaxReward.DEFAULT_LABEL);
        }
        this.f8300g = g();
        this.f8301h = b(feVar.n());
        this.f8302i = e();
        this.f8303j = a(feVar.f());
        this.f8304k = j();
        notifyDataSetChanged();
    }

    private yb a(String str, String str2, boolean z10, boolean z11) {
        SpannedString spannedString;
        yb.b d10 = yb.a(z10 ? yb.c.RIGHT_DETAIL : yb.c.DETAIL).d(str);
        if (z10) {
            spannedString = null;
        } else {
            spannedString = this.f8305l;
        }
        return d10.a(spannedString).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? r3.a(R.color.applovin_sdk_checkmarkColor, this.f13816a) : d(z11)).a(!z10).a();
    }

    private int b(boolean z10) {
        return r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f13816a);
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private yb d() {
        yb.b c10 = yb.a().d("Adapter").c(this.f8299f.c());
        if (TextUtils.isEmpty(this.f8299f.c())) {
            c10.a(a(this.f8299f.y())).b(b(this.f8299f.y()));
        }
        return c10.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f8299f.B()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", k.B0(), true));
        }
        return arrayList;
    }

    private yb f() {
        if (this.f8299f.F()) {
            return null;
        }
        return yb.a().d("Initialization Status").c(f(this.f8299f.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private yb i() {
        yb.b c10 = yb.a().d("SDK").c(this.f8299f.p());
        if (TextUtils.isEmpty(this.f8299f.p())) {
            c10.a(a(this.f8299f.C())).b(b(this.f8299f.C()));
        }
        return c10.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f8299f.u())) {
            arrayList.add(yb.a(yb.c.DETAIL).d(this.f8299f.u()).a());
        }
        if (this.f8299f.x() == fe.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f8299f.s() != null) {
            arrayList.add(c(this.f8299f.s()));
        }
        if (this.f8299f.D()) {
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", !AppLovinPrivacySettings.isAgeRestrictedUser(this.f13816a) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f13816a), false));
        }
        arrayList.add(a(this.f8299f.x()));
        return arrayList;
    }

    public fe h() {
        return this.f8299f;
    }

    public void k() {
        this.f8300g = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eh ehVar = (eh) it.next();
                arrayList.add(a(ehVar.b(), ehVar.a(), ehVar.c(), true));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public List c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f8300g;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f8301h;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f8302i;
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f8303j;
        }
        return this.f8304k;
    }

    /* access modifiers changed from: protected */
    public yb e(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new bj("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new bj("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new bj("CONFIGURATION");
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return new bj("DEPENDENCIES");
        }
        return new bj("TEST ADS");
    }

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) {
            return "Initialized";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
            return "Failure";
        }
        return MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private int d(boolean z10) {
        return r3.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f13816a);
    }

    /* access modifiers changed from: protected */
    public int b() {
        return a.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f8300g.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f8301h.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f8302i.size();
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f8303j.size();
        }
        return this.f8304k.size();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n6 n6Var = (n6) it.next();
                arrayList.add(a(n6Var.b(), n6Var.a(), n6Var.c(), true));
            }
        }
        return arrayList;
    }

    private yb c(List list) {
        return yb.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private yb a(fe.b bVar) {
        yb.b a10 = yb.a();
        if (bVar == fe.b.READY) {
            a10.a(this.f13816a);
        }
        return a10.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    public boolean a(hb hbVar) {
        return hbVar.b() == a.TEST_ADS.ordinal() && hbVar.a() == this.f8304k.size() - 1;
    }
}
