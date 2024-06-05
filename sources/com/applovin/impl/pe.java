package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.b4;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class pe implements b4.e {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static WeakReference f10629m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicBoolean f10630n = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f10631a;

    /* renamed from: b  reason: collision with root package name */
    private final t f10632b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f10633c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final oe f10634d;

    /* renamed from: f  reason: collision with root package name */
    private final Map f10635f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f10636g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private boolean f10637h;

    /* renamed from: i  reason: collision with root package name */
    private int f10638i = 2;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10639j;

    /* renamed from: k  reason: collision with root package name */
    private Map f10640k;

    /* renamed from: l  reason: collision with root package name */
    private final x0 f10641l;

    class a extends p {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                t.g("AppLovinSdk", "Started mediation debugger");
                if (!pe.this.c() || pe.f10629m.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = pe.f10629m = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(pe.this.f10634d, pe.this.f10631a.e());
                }
                pe.f10630n.set(false);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                t.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = pe.f10629m = null;
            }
        }
    }

    public pe(k kVar) {
        this.f10631a = kVar;
        this.f10632b = kVar.L();
        Context k10 = k.k();
        this.f10633c = k10;
        oe oeVar = new oe(k10);
        this.f10634d = oeVar;
        this.f10641l = new x0(kVar, oeVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity p02 = this.f10631a.p0();
        if (p02 == null || p02.isFinishing()) {
            t.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(p02).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new p10(this)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    private void f() {
        this.f10631a.e().a(new a());
    }

    public void e() {
        if (this.f10636g.compareAndSet(false, true)) {
            this.f10631a.l0().a((xl) new lm(this, this.f10631a), sm.b.OTHER);
        }
    }

    public boolean g() {
        return this.f10637h;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f10634d + "}";
    }

    /* access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f10629m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private List a(JSONObject jSONObject, List list, k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new z(jSONObject2, this.f10635f, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public List a(String str) {
        Map map = this.f10640k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f10640k.get(str);
    }

    private List a(List list, k kVar) {
        List<String> list2;
        if (kVar.C0().get()) {
            list2 = kVar.g0().getInitializationAdUnitIds();
        } else {
            list2 = kVar.I() != null ? kVar.I().getAdUnitIds() : null;
        }
        if (list2 == null || list2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (list2.contains(zVar.c())) {
                arrayList.add(zVar);
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                fe feVar = new fe(jSONObject2, kVar);
                arrayList.add(feVar);
                this.f10635f.put(feVar.b(), feVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            w0 w0Var = new w0(str);
            if (w0Var.h()) {
                arrayList.add(w0Var);
            } else if (t.a()) {
                t tVar = this.f10632b;
                tVar.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.y() && feVar.q() == fe.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new r10(this), TimeUnit.SECONDS.toMillis(2));
                return;
            }
        }
    }

    public void a(String str, JSONObject jSONObject, int i10) {
        List a10 = a(jSONObject, this.f10631a);
        List a11 = a(jSONObject, a10, this.f10631a);
        List a12 = a(a11, this.f10631a);
        List a13 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        List list = a10;
        List list2 = a13;
        this.f10634d.a(list, a11, a12, list2, JsonUtils.getString(jSONObject2, "title", (String) null), JsonUtils.getString(jSONObject2, "message", (String) null), JsonUtils.getString(jSONObject, "account_id", (String) null), JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", (Boolean) null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f10631a);
        if (!a13.isEmpty()) {
            this.f10641l.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new q10(this), TimeUnit.SECONDS.toMillis((long) this.f10638i));
        } else {
            a(a10);
        }
    }

    public void a(boolean z10, int i10) {
        this.f10637h = z10;
        this.f10638i = i10;
    }

    public void a(Map map) {
        this.f10640k = map;
        e();
        if (c() || !f10630n.compareAndSet(false, true)) {
            t.h("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f10639j) {
            f();
            this.f10639j = true;
        }
        Intent intent = new Intent(this.f10633c, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        t.g("AppLovinSdk", "Starting mediation debugger...");
        this.f10633c.startActivity(intent);
    }

    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (t.a()) {
            t tVar = this.f10632b;
            tVar.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        t.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f10634d.a((List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (Boolean) null, false, this.f10631a);
        this.f10636g.set(false);
    }
}
