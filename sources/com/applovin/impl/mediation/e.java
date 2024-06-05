package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.ke;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zl;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final k f9637a;

    /* renamed from: b  reason: collision with root package name */
    private final t f9638b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f9639c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final JSONArray f9640d = new JSONArray();

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashMap f9641e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Object f9642f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private List f9643g;

    public e(k kVar) {
        this.f9637a = kVar;
        this.f9638b = kVar.L();
    }

    /* access modifiers changed from: package-private */
    public void a(ke keVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            synchronized (this.f9642f) {
                z10 = !a(keVar);
                if (z10) {
                    this.f9641e.put(keVar.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", keVar.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f9640d.put(jSONObject);
                }
            }
            if (z10) {
                this.f9637a.a(keVar);
                this.f9637a.S().processAdapterInitializationPostback(keVar, j10, initializationStatus, str);
                this.f9637a.o().a(initializationStatus, keVar.b());
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArray;
        synchronized (this.f9642f) {
            jSONArray = this.f9640d;
        }
        return jSONArray;
    }

    public boolean c() {
        return this.f9639c.get();
    }

    public void a(ke keVar, Activity activity) {
        a(keVar, activity, (Runnable) null);
    }

    public void a(ke keVar, Activity activity, Runnable runnable) {
        List list;
        if (this.f9637a.n0().c() && (list = this.f9643g) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    keVar = null;
                    break;
                }
                ke keVar2 = (ke) it.next();
                if (keVar2.b().equals(keVar.b())) {
                    keVar = keVar2;
                    break;
                }
            }
        }
        if (keVar != null) {
            g a10 = this.f9637a.O().a(keVar);
            if (a10 != null) {
                if (t.a()) {
                    t tVar = this.f9638b;
                    tVar.d("MediationAdapterInitializationManager", "Initializing adapter " + keVar);
                }
                a10.a((MaxAdapterInitializationParameters) MaxAdapterParametersImpl.a(keVar), activity, runnable);
            } else if (runnable != null) {
                runnable.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(ke keVar) {
        boolean containsKey;
        synchronized (this.f9642f) {
            containsKey = this.f9641e.containsKey(keVar.b());
        }
        return containsKey;
    }

    public void a(Activity activity) {
        if (this.f9639c.compareAndSet(false, true)) {
            String str = (String) this.f9637a.a(qj.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List a10 = a(JsonUtils.getJSONArray(jSONObject, this.f9637a.n0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f9643g = a10;
                    long parseLong = StringUtils.parseLong(this.f9637a.g0().getExtraParameters().get("adapter_initialization_delay_ms"), -1);
                    zl zlVar = new zl(a10, activity, this.f9637a);
                    if (parseLong > 0) {
                        this.f9637a.l0().a((xl) zlVar, sm.b.MEDIATION, parseLong);
                    } else {
                        this.f9637a.l0().a((xl) zlVar);
                    }
                } catch (JSONException e10) {
                    if (t.a()) {
                        this.f9638b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                }
            }
        }
    }

    public LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f9642f) {
            linkedHashMap = this.f9641e;
        }
        return linkedHashMap;
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new ke(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f9637a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f9642f) {
            this.f9641e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f9637a.o().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
