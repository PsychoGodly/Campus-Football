package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.fe;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x0;
import com.applovin.impl.yb;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class oe extends zb implements AppLovinCommunicatorSubscriber, x0.a {
    private List A = new ArrayList();
    private List B = new ArrayList();
    private List C = new ArrayList();
    private List D = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private k f10165f;

    /* renamed from: g  reason: collision with root package name */
    private List f10166g;

    /* renamed from: h  reason: collision with root package name */
    private List f10167h;

    /* renamed from: i  reason: collision with root package name */
    private List f10168i;

    /* renamed from: j  reason: collision with root package name */
    private String f10169j;

    /* renamed from: k  reason: collision with root package name */
    private String f10170k;

    /* renamed from: l  reason: collision with root package name */
    private String f10171l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f10172m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10173n;

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f10174o = new StringBuilder(MaxReward.DEFAULT_LABEL);

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f10175p = new AtomicBoolean();

    /* renamed from: q  reason: collision with root package name */
    private boolean f10176q = false;

    /* renamed from: r  reason: collision with root package name */
    private List f10177r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private List f10178s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private List f10179t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private List f10180u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    private List f10181v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private List f10182w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private List f10183x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private List f10184y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private List f10185z = new ArrayList();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10186a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.applovin.impl.x0$b[] r0 = com.applovin.impl.x0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10186a = r0
                com.applovin.impl.x0$b r1 = com.applovin.impl.x0.b.DEVELOPER_URI_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10186a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.impl.x0$b r1 = com.applovin.impl.x0.b.APPADSTXT_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10186a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.applovin.impl.x0$b r1 = com.applovin.impl.x0.b.MISSING_APPLOVIN_ENTRIES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10186a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.applovin.impl.x0$b r1 = com.applovin.impl.x0.b.MISSING_NON_APPLOVIN_ENTRIES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.oe.a.<clinit>():void");
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        SDK_VERSION,
        PLUGIN_VERSION,
        AD_REVIEW_VERSION,
        CONSENT_FLOW,
        GOOGLE_UMP_SDK,
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL,
        APP_ADS_TXT
    }

    public enum e {
        CMP,
        NETWORK_CONSENT_STATUSES,
        IS_AGE_RESTRICTED_USER,
        DO_NOT_SELL,
        COUNT
    }

    public enum f {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public oe(Context context) {
        super(context);
    }

    private void a(StringBuilder sb2, String str) {
        String sb3 = sb2.toString();
        if (sb3.length() + str.length() >= ((Integer) this.f10165f.a(oj.f10439x)).intValue()) {
            t.g("MediationDebuggerListAdapter", sb3);
            this.f10174o.append(sb3);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private yb b(String str, String str2) {
        yb.b d10 = yb.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d10.c(str2);
        } else {
            d10.a(R.drawable.applovin_ic_x_mark);
            d10.b(r3.a(R.color.applovin_sdk_xmarkColor, this.f13816a));
        }
        return d10.a();
    }

    private List f() {
        boolean c10 = this.f10165f.n0().c();
        List b10 = this.f10165f.n0().b();
        if (c10) {
            return a((String) null, a(b10, false));
        }
        return a(a(b10, true), (String) null);
    }

    private List i() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f13816a.getPackageManager().getPackageInfo(this.f13816a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(yb.a().d("Package Name").c(this.f13816a.getPackageName()).a());
        yb.b d10 = yb.a().d("App Version");
        String str2 = "None";
        if (!StringUtils.isValidString(str)) {
            str = str2;
        }
        arrayList.add(d10.c(str).a());
        arrayList.add(yb.a().d("OS").c(zp.d()).a());
        arrayList.add(yb.a().d("Account").c(StringUtils.isValidString(this.f10171l) ? this.f10171l : str2).a());
        yb.b d11 = yb.a().d("Mediation Provider");
        if (StringUtils.isValidString(this.f10165f.Q())) {
            str2 = this.f10165f.Q();
        }
        arrayList.add(d11.c(str2).a());
        arrayList.add(yb.a().d("OM SDK Version").c(this.f10165f.Y().c()).a());
        arrayList.add(a(k.B0()));
        if (this.f10172m != null) {
            arrayList.add(yb.a().d("Google Families Policy").c(String.valueOf(this.f10172m)).a());
        }
        return arrayList;
    }

    private yb k() {
        String d10 = this.f10165f.m0().d();
        boolean isValidString = StringUtils.isValidString(d10);
        boolean isValidString2 = StringUtils.isValidString(this.f10165f.m0().k());
        yb.b d11 = yb.a(yb.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            d10 = isValidString2 ? "Unknown" : "None";
        }
        yb.b c10 = d11.c(d10);
        if (this.f10173n) {
            boolean z10 = true;
            c10.a(true);
            if (isValidString2) {
                c10.a(this.f13816a);
            } else {
                c10.b("TC Data Not Found");
                c10.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                if (this.f10165f.q().getConsentFlowUserGeography() != AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
                    z10 = false;
                }
                c10.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                c10.b(r3.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f13816a));
            }
        }
        return c10.a();
    }

    private yb l() {
        if (this.f10165f.t().e() == g4.a.UNIFIED) {
            return yb.a().d("MAX Terms and Privacy Policy Flow").a(this.f13816a).a(true).a();
        }
        return yb.a().d("MAX Terms Flow").a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.f13816a)).b("MAX Terms Flow").a("MAX Terms Flow is deprecated and will be removed in a future SDK version.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(true).a();
    }

    private yb m() {
        boolean hasSupportedCmp = this.f10165f.n().hasSupportedCmp();
        return yb.a().d("Google UMP SDK").a(hasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(hasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f13816a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List p() {
        Map a10;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(yb.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f10165f.a(oj.U3);
        yb.b d10 = yb.a().d("Plugin Version");
        String str2 = "None";
        if (!StringUtils.isValidString(str)) {
            str = str2;
        }
        arrayList.add(d10.c(str).a());
        yb.b d11 = yb.a().d("Ad Review Version");
        String b10 = v.b();
        if (StringUtils.isValidString(b10)) {
            String a11 = v.a();
            if (!StringUtils.isValidString(a11)) {
                d11.c(b10);
            } else if (a11.equals(this.f10165f.d0())) {
                d11.c(b10);
            } else {
                StringBuilder sb2 = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb2.append(this.f10165f.E0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb2.append(" from the correct account.");
                a(d11, sb2.toString());
            }
        } else {
            a(d11, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(d11.a());
        if (this.f10165f.E0() && (a10 = zp.a(this.f10165f.g0())) != null) {
            String str3 = (String) a10.get("UnityVersion");
            if (StringUtils.isValidString(str3)) {
                str2 = str3;
            }
            arrayList.add(b("Unity Version", str2));
        }
        if (this.f10165f.t().k()) {
            arrayList.add(l());
            if (this.f10165f.t().e() == g4.a.UNIFIED) {
                arrayList.add(m());
            } else {
                arrayList.add(r());
                arrayList.add(u());
            }
        }
        return arrayList;
    }

    private yb q() {
        return yb.a().d("Network Consent Statuses").a(this.f13816a).a(true).a();
    }

    private yb r() {
        boolean z10 = this.f10165f.t().h() != null;
        return yb.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f13816a)).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(e.COUNT.ordinal());
        arrayList.add(k());
        if (StringUtils.isValidString(this.f10165f.m0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new uh(y3.b(), false, this.f13816a));
        }
        arrayList.add(new uh(y3.c(), true, this.f13816a));
        arrayList.add(new uh(y3.a(), true, this.f13816a));
        return arrayList;
    }

    private yb u() {
        yb.b d10 = yb.a().d("Terms of Service URL");
        if (this.f10165f.t().i() != null) {
            d10.a(R.drawable.applovin_ic_check_mark_bordered);
            d10.b(r3.a(R.color.applovin_sdk_checkmarkColor, this.f13816a));
            d10.a(true);
        } else {
            d10.c("None");
            d10.a(false);
        }
        return d10.a();
    }

    private void y() {
        Map a10;
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + zp.c(this.f10165f));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nTest Mode - ");
        sb3.append(this.f10165f.n0().c() ? "enabled" : "disabled");
        sb2.append(sb3.toString());
        if (this.f10165f.y() != null) {
            sb2.append("\nTarget SDK - " + this.f10165f.z().g().g());
        } else {
            sb2.append("\nTarget SDK - " + this.f10165f.x().A().get("target_sdk"));
        }
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f10165f.a(oj.U3);
        String b10 = v.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nPlugin Version - ");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = str3;
        }
        sb4.append(str2);
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(b10)) {
            b10 = "Disabled";
        }
        sb5.append(b10);
        sb2.append(sb5.toString());
        if (this.f10165f.E0() && (a10 = zp.a(this.f10165f.g0())) != null) {
            String str4 = (String) a10.get("UnityVersion");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("\nUnity Version - ");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            sb6.append(str3);
            sb2.append(sb6.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(y3.a(this.f13816a));
        sb2.append(this.f10165f.t().g());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f10165f.m0().j());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        for (sn e10 : this.f10165f.m0().i()) {
            sb2.append(e10.e());
        }
        sb2.append("\n========== NETWORKS ==========");
        for (fe j10 : this.f10178s) {
            a(sb2, j10.j());
        }
        for (fe j11 : this.f10177r) {
            a(sb2, j11.j());
        }
        sb2.append("\n========== AD UNITS ==========");
        for (z e11 : this.f10166g) {
            a(sb2, e11.e());
        }
        sb2.append("\n========== END ==========");
        t.g("MediationDebuggerListAdapter", sb2.toString());
        this.f10174o.append(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public List c(int i10) {
        if (i10 == f.APP_INFO.ordinal()) {
            return this.f10183x;
        }
        if (i10 == f.MAX.ordinal()) {
            return this.f10184y;
        }
        if (i10 == f.PRIVACY.ordinal()) {
            return this.f10185z;
        }
        if (i10 == f.ADS.ordinal()) {
            return this.A;
        }
        if (i10 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B;
        }
        if (i10 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C;
        }
        return this.D;
    }

    public boolean d() {
        return this.f10176q;
    }

    public List e() {
        return this.f10166g;
    }

    public String g() {
        return this.f10170k;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f10169j;
    }

    public List j() {
        return this.f10180u;
    }

    public List n() {
        return this.f10167h;
    }

    public String o() {
        return this.f10174o.toString();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f10185z = s();
            c();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f10177r);
            this.C = a(this.f10178s);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public k t() {
        return this.f10165f;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f10175p.get() + "}";
    }

    public List v() {
        return this.f10182w;
    }

    public List w() {
        return this.f10181v;
    }

    public boolean x() {
        return this.f10175p.get();
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        if (i10 == f.APP_INFO.ordinal()) {
            return this.f10183x.size();
        }
        if (i10 == f.MAX.ordinal()) {
            return this.f10184y.size();
        }
        if (i10 == f.PRIVACY.ordinal()) {
            return this.f10185z.size();
        }
        if (i10 == f.ADS.ordinal()) {
            return this.A.size();
        }
        if (i10 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i10 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    /* access modifiers changed from: protected */
    public yb e(int i10) {
        if (i10 == f.APP_INFO.ordinal()) {
            return new bj("APP INFO");
        }
        if (i10 == f.MAX.ordinal()) {
            return new bj("MAX");
        }
        if (i10 == f.PRIVACY.ordinal()) {
            return new bj("PRIVACY");
        }
        if (i10 == f.ADS.ordinal()) {
            return new bj("ADS");
        }
        if (i10 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return new bj("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i10 == f.COMPLETED_NETWORKS.ordinal()) {
            return new bj("COMPLETED SDK INTEGRATIONS");
        }
        return new bj("MISSING SDK INTEGRATIONS");
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        yb.b a10 = yb.a();
        arrayList.add(a10.d("View Ad Units (" + this.f10166g.size() + ")").a(this.f13816a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f10167h.isEmpty()) {
            yb.b a11 = yb.a();
            arrayList.add(a11.d("Selective Init Ad Units (" + this.f10167h.size() + ")").a(this.f13816a).a(true).a());
        }
        arrayList.add(yb.a().d("Test Mode Enabled").c(String.valueOf(this.f10165f.n0().c())).a());
        return arrayList;
    }

    private yb b(String str) {
        yb.b a10 = yb.a();
        if (this.f10165f.n0().c()) {
            a10.a(this.f13816a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? MaxReward.DEFAULT_LABEL : "Select ");
        sb2.append("Test Mode Network");
        yb.b d10 = a10.d(sb2.toString());
        if (!this.f10165f.n0().c()) {
            str = "Enable";
        }
        return d10.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (!feVar.E()) {
                if (feVar.q() == fe.a.INCOMPLETE_INTEGRATION || feVar.q() == fe.a.INVALID_INTEGRATION) {
                    this.f10177r.add(feVar);
                } else if (feVar.q() == fe.a.COMPLETE) {
                    this.f10178s.add(feVar);
                } else if (feVar.q() == fe.a.MISSING) {
                    this.f10179t.add(feVar);
                }
            }
        }
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.x() == fe.b.READY) {
                this.f10182w.add(feVar);
            }
        }
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 f10 = ((z) it.next()).f();
            for (kr b10 : f10.a()) {
                hashSet.add(b10.b());
            }
            for (kr b11 : f10.e()) {
                hashSet2.add(b11.b());
            }
        }
        this.f10180u = new ArrayList(hashSet);
        this.f10181v = new ArrayList(hashSet2);
        Collections.sort(this.f10180u);
        Collections.sort(this.f10181v);
    }

    private String a(x0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.f10186a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve developer website from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\n" + "For more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        } else if (i10 == 3) {
            return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\n" + "For more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        } else if (i10 != 4) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            return "Text file at " + str + " is missing some of the suggested lines.\n\n" + "For more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
    }

    public void b(boolean z10) {
        this.f10176q = z10;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return f.COUNT.ordinal();
    }

    private yb a(String str, c cVar) {
        int i10;
        int i11;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            i11 = r3.a(R.color.applovin_sdk_checkmarkColor, this.f13816a);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            i11 = r3.a(R.color.applovin_sdk_warningColor, this.f13816a);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            i11 = r3.a(R.color.applovin_sdk_xmarkColor, this.f13816a);
        }
        return yb.a().d("app-ads.txt").a(i10).b(i11).b("app-ads.txt").a(str).a(true).a();
    }

    private yb a(boolean z10) {
        return yb.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f13816a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z10).a();
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (ec ecVar : this.f10180u) {
                if (list.equals(ecVar.b())) {
                    return ecVar.a();
                }
            }
            for (ec ecVar2 : this.f10181v) {
                if (list.equals(ecVar2.b())) {
                    return ecVar2.a();
                }
            }
        } else {
            for (fe feVar : this.f10182w) {
                if (list.equals(Collections.singletonList(feVar.m()))) {
                    return feVar.g();
                }
            }
        }
        return jt.a(",", list);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xf((fe) it.next(), this.f13816a));
        }
        return arrayList;
    }

    private yb a(String str) {
        yb.b a10 = yb.a();
        if (!this.f10165f.n0().c()) {
            a10.a(this.f13816a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? MaxReward.DEFAULT_LABEL : "Select ");
        sb2.append("Live Network");
        yb.b d10 = a10.d(sb2.toString());
        if (this.f10165f.n0().c()) {
            str = "Enable";
        }
        return d10.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, Boolean bool, boolean z10, k kVar) {
        this.f10165f = kVar;
        this.f10166g = list2;
        this.f10167h = list3;
        this.f10168i = list4;
        this.f10169j = str;
        this.f10170k = str2;
        this.f10171l = str3;
        this.f10172m = bool;
        this.f10173n = z10;
        if (list != null && this.f10175p.compareAndSet(false, true)) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            kVar.m0().a(list);
            c(list);
            b(list2);
            d(this.f10178s);
            this.f10183x.addAll(i());
            this.f10184y.addAll(p());
            this.f10185z.addAll(s());
            this.A.addAll(f());
            this.B = a(this.f10177r);
            this.C = a(this.f10178s);
            this.D = a(this.f10179t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f13816a).subscribe((AppLovinCommunicatorSubscriber) this, (List<String>) arrayList);
            y();
        }
        AppLovinSdkUtils.runOnUiThread(new l00(this));
    }

    public void a(x0.b bVar, String str) {
        if (bVar == x0.b.DEVELOPER_URI_NOT_FOUND) {
            this.f10165f.L();
            if (t.a()) {
                this.f10165f.L().a("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
                return;
            }
            return;
        }
        this.f10184y.add(a(a(bVar, str, (String) null), a(bVar)));
        c();
    }

    public void a(v0 v0Var, String str) {
        c cVar;
        String str2;
        w0 w0Var;
        String str3;
        c cVar2;
        ArrayList arrayList = new ArrayList();
        for (w0 w0Var2 : this.f10168i) {
            List list = (List) v0Var.a().get(w0Var2.b());
            if (list == null || !list.contains(w0Var2)) {
                this.f10165f.L();
                if (t.a()) {
                    this.f10165f.L().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + w0Var2.d());
                }
                arrayList.add(w0Var2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    w0Var = null;
                    break;
                }
                w0Var = (w0) it.next();
                if (w0Var.g()) {
                    break;
                }
            }
            if (w0Var != null) {
                x0.b bVar = x0.b.MISSING_APPLOVIN_ENTRIES;
                str3 = a(bVar, str, w0Var.d());
                cVar2 = a(bVar);
            } else {
                x0.b bVar2 = x0.b.MISSING_NON_APPLOVIN_ENTRIES;
                str3 = a(bVar2, str, (String) null);
                cVar2 = a(bVar2);
            }
            String str4 = str3;
            cVar = cVar2;
            str2 = str4;
        }
        this.f10184y.add(a(str2, cVar));
        c();
    }

    private void a(yb.b bVar, String str) {
        bVar.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.f13816a)).a(true);
    }

    private c a(x0.b bVar) {
        int i10 = a.f10186a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return c.ERROR;
        }
        if (i10 != 4) {
            return c.ERROR;
        }
        return c.WARNING;
    }
}
