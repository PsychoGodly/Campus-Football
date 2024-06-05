package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class rm extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final k f11205h;

    public rm(k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f11205h = kVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f11205h.N().a(this.f11205h.e().b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        tr.f(this.f11205h);
    }

    private void g() {
        if (!this.f11205h.N().c()) {
            Activity p02 = this.f11205h.p0();
            if (p02 != null) {
                this.f11205h.N().a(p02);
            } else {
                this.f11205h.l0().a((xl) new kn(this.f11205h, true, "initializeAdapters", new i40(this)), sm.b.CORE, TimeUnit.SECONDS.toMillis(1));
            }
        }
    }

    private void h() {
        Map map;
        Map map2;
        boolean c10 = this.f11205h.h0().c();
        String str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        String str2 = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (this.f11205h.y() != null) {
            map2 = this.f11205h.y().d();
            map = this.f11205h.y().j();
            if (c10) {
                str2 = this.f11205h.z().d().a();
            }
            if (c10) {
                str = map2.get("idfv") + " (use this for test devices)";
            }
        } else {
            map2 = this.f11205h.x().l();
            map = this.f11205h.x().F();
            if (c10) {
                str2 = this.f11205h.x().f().a();
            }
            if (c10) {
                str = map2.get("idfv") + " (use this for test devices)";
            }
        }
        lc lcVar = new lc();
        lcVar.a().a("=====AppLovin SDK=====");
        lcVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f11205h.a(oj.U3)).a("Ad Review Version", v.b()).a("OM SDK Version", this.f11205h.Y().c());
        lcVar.a("===Device Info===").a("OS", zp.d()).a("GAID", str2).a("App Set ID", str).a("Model", map2.get("model")).a("Locale", map2.get("locale")).a("Emulator", map2.get("sim")).a("Tablet", map2.get("is_tablet"));
        lcVar.a("===App Info===").a("Application ID", map.get("package_name")).a("Target SDK", map.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(zp.f()));
        lcVar.a("===SDK Settings===").a("SDK Key", this.f11205h.d0()).a("Mediation Provider", this.f11205h.Q()).a("TG", xp.a(this.f11205h)).a("AEI", this.f11205h.a(oj.f10455z)).a("MEI", this.f11205h.a(oj.A)).a("MD", this.f11205h.a(oj.B)).a("Test Mode On", Boolean.valueOf(this.f11205h.n0().c())).a("Verbose Logging On", Boolean.valueOf(c10));
        lcVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(y3.a(a()));
        lcVar.a("===MAX Terms Flow===");
        f4 t10 = this.f11205h.t();
        boolean k10 = t10.k();
        lcVar.a("Enabled", Boolean.valueOf(k10));
        if (k10) {
            boolean z10 = t10.e() == g4.a.UNIFIED;
            lcVar.a("Flow Type", z10 ? "MAX Terms and Privacy Policy Flow" : "MAX Terms Flow");
            if (z10) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f11205h.q().getConsentFlowUserGeography();
                AppLovinSdkConfiguration.ConsentFlowUserGeography f10 = t10.f();
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                String str3 = "Other";
                lcVar.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? str3 : "Unknown");
                if (zp.c(this.f11205h)) {
                    if (f10 == consentFlowUserGeography2) {
                        str3 = "GDPR";
                    } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                        str3 = "None";
                    }
                    lcVar.a("Debug User Geography", str3);
                }
            }
        }
        lcVar.a("Privacy Policy URI", t10.h()).a("Terms of Service URI", t10.i());
        this.f11205h.m0();
        lcVar.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f11205h.m0().j());
        lcVar.a();
        t.g("AppLovinSdk", lcVar.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x019e, code lost:
        if (r13.f11205h.y0() != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0248, code lost:
        if (r13.f11205h.y0() != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024b, code lost:
        r2 = "failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x024c, code lost:
        r10.append(r2);
        r10.append(" in ");
        r10.append(java.lang.System.currentTimeMillis() - r6);
        r10.append("ms");
        r8.a(r9, r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = " in "
            java.lang.String r2 = "succeeded"
            java.lang.String r3 = "failed"
            java.lang.String r4 = " initialization "
            java.lang.String r5 = "AppLovin SDK "
            long r6 = java.lang.System.currentTimeMillis()
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto L_0x0035
            com.applovin.impl.sdk.t r8 = r13.f13423c
            java.lang.String r9 = r13.f13422b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Initializing AppLovin SDK v"
            r10.append(r11)
            java.lang.String r11 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r11)
            java.lang.String r11 = "..."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.a((java.lang.String) r9, (java.lang.String) r10)
        L_0x0035:
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.ba r8 = r8.F()     // Catch:{ all -> 0x01a2 }
            r8.e()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.ba r8 = r8.F()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.aa r9 = com.applovin.impl.aa.f6346h     // Catch:{ all -> 0x01a2 }
            r8.a((com.applovin.impl.aa) r9)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.ba r8 = r8.F()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.aa r9 = com.applovin.impl.aa.f6347i     // Catch:{ all -> 0x01a2 }
            r8.a((com.applovin.impl.aa) r9)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.p r8 = r8.D()     // Catch:{ all -> 0x01a2 }
            android.content.Context r9 = r13.a()     // Catch:{ all -> 0x01a2 }
            r8.b((android.content.Context) r9)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.p r8 = r8.D()     // Catch:{ all -> 0x01a2 }
            android.content.Context r9 = r13.a()     // Catch:{ all -> 0x01a2 }
            r8.e((android.content.Context) r9)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sm r8 = r8.l0()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.yl r9 = new com.applovin.impl.yl     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r10 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            r9.<init>(r10)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sm$b r10 = com.applovin.impl.sm.b.OTHER     // Catch:{ all -> 0x01a2 }
            r8.a((com.applovin.impl.xl) r9, (com.applovin.impl.sm.b) r10)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.m r8 = r8.y()     // Catch:{ all -> 0x01a2 }
            if (r8 == 0) goto L_0x0092
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.m r8 = r8.y()     // Catch:{ all -> 0x01a2 }
            r8.l()     // Catch:{ all -> 0x01a2 }
            goto L_0x009b
        L_0x0092:
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.l r8 = r8.x()     // Catch:{ all -> 0x01a2 }
            r8.P()     // Catch:{ all -> 0x01a2 }
        L_0x009b:
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.kj r8 = r8.e0()     // Catch:{ all -> 0x01a2 }
            r8.c()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.w4 r8 = r8.v()     // Catch:{ all -> 0x01a2 }
            r8.l()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            boolean r8 = com.applovin.impl.zp.c((com.applovin.impl.sdk.k) r8)     // Catch:{ all -> 0x01a2 }
            if (r8 == 0) goto L_0x00ba
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            r8.a()     // Catch:{ all -> 0x01a2 }
        L_0x00ba:
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.array.ArrayService r8 = r8.l()     // Catch:{ all -> 0x01a2 }
            r8.collectAppHubData()     // Catch:{ all -> 0x01a2 }
            r13.h()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10388q4     // Catch:{ all -> 0x01a2 }
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)     // Catch:{ all -> 0x01a2 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x01a2 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x01a2 }
            if (r8 == 0) goto L_0x00de
            com.applovin.impl.h40 r8 = new com.applovin.impl.h40     // Catch:{ all -> 0x01a2 }
            r8.<init>(r13)     // Catch:{ all -> 0x01a2 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r8)     // Catch:{ all -> 0x01a2 }
        L_0x00de:
            r13.g()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            r9 = 1
            r8.a((boolean) r9)     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.network.b r8 = r8.Z()     // Catch:{ all -> 0x01a2 }
            r8.b()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.AppLovinAdServiceImpl r8 = r8.i()     // Catch:{ all -> 0x01a2 }
            r8.maybeFireAppKilledWhilePlayingAdPostback()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.EventServiceImpl r8 = r8.C()     // Catch:{ all -> 0x01a2 }
            r8.maybeTrackAppOpenEvent()     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.pe r8 = r8.P()     // Catch:{ all -> 0x01a2 }
            boolean r8 = r8.g()     // Catch:{ all -> 0x01a2 }
            if (r8 != 0) goto L_0x012e
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.oj r9 = com.applovin.impl.qe.N6     // Catch:{ all -> 0x01a2 }
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)     // Catch:{ all -> 0x01a2 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x01a2 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x01a2 }
            if (r8 == 0) goto L_0x0137
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            boolean r8 = com.applovin.impl.zp.c((com.applovin.impl.sdk.k) r8)     // Catch:{ all -> 0x01a2 }
            if (r8 == 0) goto L_0x0137
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            boolean r8 = r8.D0()     // Catch:{ all -> 0x01a2 }
            if (r8 == 0) goto L_0x0137
        L_0x012e:
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x01a2 }
            com.applovin.impl.pe r8 = r8.P()     // Catch:{ all -> 0x01a2 }
            r8.e()     // Catch:{ all -> 0x01a2 }
        L_0x0137:
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.sdk.w r8 = r8.b0()
            if (r8 == 0) goto L_0x0152
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.oj r9 = com.applovin.impl.oj.J
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.String r8 = (java.lang.String) r8
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.sdk.w r9 = r9.b0()
            r9.b((java.lang.String) r8)
        L_0x0152:
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.mg r8 = r8.Y()
            r8.i()
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10360n0
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x017e
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10368o0
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.Long r8 = (java.lang.Long) r8
            com.applovin.impl.sdk.k r9 = r13.f11205h
            long r10 = r8.longValue()
            r9.a((long) r10)
        L_0x017e:
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto L_0x0264
            com.applovin.impl.sdk.t r8 = r13.f13423c
            java.lang.String r9 = r13.f13422b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r5)
            r10.append(r4)
            com.applovin.impl.sdk.k r4 = r13.f11205h
            boolean r4 = r4.y0()
            if (r4 == 0) goto L_0x024b
            goto L_0x024c
        L_0x01a2:
            r8 = move-exception
            java.lang.String r9 = "AppLovinSdk"
            java.lang.String r10 = "Failed to initialize SDK!"
            com.applovin.impl.sdk.t.c(r9, r10, r8)     // Catch:{ all -> 0x0265 }
            com.applovin.impl.sdk.k r9 = r13.f11205h     // Catch:{ all -> 0x0265 }
            r10 = 0
            r9.a((boolean) r10)     // Catch:{ all -> 0x0265 }
            r13.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x0265 }
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x0265 }
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10327j     // Catch:{ all -> 0x0265 }
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)     // Catch:{ all -> 0x0265 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0265 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0265 }
            if (r8 == 0) goto L_0x01cc
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x0265 }
            com.applovin.impl.sdk.network.b r8 = r8.Z()     // Catch:{ all -> 0x0265 }
            r8.a()     // Catch:{ all -> 0x0265 }
        L_0x01cc:
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x0265 }
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10319i     // Catch:{ all -> 0x0265 }
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)     // Catch:{ all -> 0x0265 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0265 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0265 }
            if (r8 == 0) goto L_0x01e1
            com.applovin.impl.sdk.k r8 = r13.f11205h     // Catch:{ all -> 0x0265 }
            r8.U0()     // Catch:{ all -> 0x0265 }
        L_0x01e1:
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.sdk.w r8 = r8.b0()
            if (r8 == 0) goto L_0x01fc
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.oj r9 = com.applovin.impl.oj.J
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.String r8 = (java.lang.String) r8
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.sdk.w r9 = r9.b0()
            r9.b((java.lang.String) r8)
        L_0x01fc:
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.mg r8 = r8.Y()
            r8.i()
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10360n0
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0228
            com.applovin.impl.sdk.k r8 = r13.f11205h
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10368o0
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.Long r8 = (java.lang.Long) r8
            com.applovin.impl.sdk.k r9 = r13.f11205h
            long r10 = r8.longValue()
            r9.a((long) r10)
        L_0x0228:
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto L_0x0264
            com.applovin.impl.sdk.t r8 = r13.f13423c
            java.lang.String r9 = r13.f13422b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r5)
            r10.append(r4)
            com.applovin.impl.sdk.k r4 = r13.f11205h
            boolean r4 = r4.y0()
            if (r4 == 0) goto L_0x024b
            goto L_0x024c
        L_0x024b:
            r2 = r3
        L_0x024c:
            r10.append(r2)
            r10.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r8.a((java.lang.String) r9, (java.lang.String) r0)
        L_0x0264:
            return
        L_0x0265:
            r8 = move-exception
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.sdk.w r9 = r9.b0()
            if (r9 == 0) goto L_0x0281
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.oj r10 = com.applovin.impl.oj.J
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r10)
            java.lang.String r9 = (java.lang.String) r9
            com.applovin.impl.sdk.k r10 = r13.f11205h
            com.applovin.impl.sdk.w r10 = r10.b0()
            r10.b((java.lang.String) r9)
        L_0x0281:
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.mg r9 = r9.Y()
            r9.i()
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.oj r10 = com.applovin.impl.oj.f10360n0
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x02ad
            com.applovin.impl.sdk.k r9 = r13.f11205h
            com.applovin.impl.oj r10 = com.applovin.impl.oj.f10368o0
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r10)
            java.lang.Long r9 = (java.lang.Long) r9
            com.applovin.impl.sdk.k r10 = r13.f11205h
            long r11 = r9.longValue()
            r10.a((long) r11)
        L_0x02ad:
            boolean r9 = com.applovin.impl.sdk.t.a()
            if (r9 == 0) goto L_0x02e9
            com.applovin.impl.sdk.t r9 = r13.f13423c
            java.lang.String r10 = r13.f13422b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r11.append(r5)
            r11.append(r4)
            com.applovin.impl.sdk.k r4 = r13.f11205h
            boolean r4 = r4.y0()
            if (r4 == 0) goto L_0x02d0
            goto L_0x02d1
        L_0x02d0:
            r2 = r3
        L_0x02d1:
            r11.append(r2)
            r11.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r9.a((java.lang.String) r10, (java.lang.String) r0)
        L_0x02e9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.rm.run():void");
    }
}
