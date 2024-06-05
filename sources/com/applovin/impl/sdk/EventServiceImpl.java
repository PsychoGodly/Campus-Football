package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.t7;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList(new String[]{"landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok"});

    /* renamed from: a  reason: collision with root package name */
    private final k f11452a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f11453b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f11454c = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f11452a = kVar;
        if (((Boolean) kVar.a(oj.S0)).booleanValue()) {
            this.f11453b = JsonUtils.toStringObjectMap((String) kVar.a(qj.C, (Object) JsonUtils.EMPTY_JSON));
            return;
        }
        this.f11453b = new HashMap();
        kVar.b(qj.C, (Object) JsonUtils.EMPTY_JSON);
    }

    private Map a(t7 t7Var, Map map) {
        Map map2 = CollectionUtils.map(map);
        boolean contains = this.f11452a.c(oj.Q0).contains(t7Var.c());
        map2.put("AppLovin-Event", contains ? t7Var.c() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", t7Var.c());
        }
        return map2;
    }

    private String b() {
        return ((String) this.f11452a.a(oj.M0)) + "4.0/pix";
    }

    private void c() {
        if (((Boolean) this.f11452a.a(oj.S0)).booleanValue()) {
            this.f11452a.b(qj.C, (Object) CollectionUtils.toJsonString(this.f11453b, JsonUtils.EMPTY_JSON));
        }
    }

    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.f11453b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f11454c.compareAndSet(false, true)) {
            this.f11452a.C().trackEvent("landing");
        }
    }

    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinEventService", "Super property key cannot be null or empty");
        } else if (obj == null) {
            this.f11453b.remove(str);
            c();
        } else {
            List c10 = this.f11452a.c(oj.R0);
            if (!zp.a(obj, c10, this.f11452a)) {
                t.h("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + c10);
                return;
            }
            this.f11453b.put(str, zp.a(obj, this.f11452a));
            c();
        }
    }

    public String toString() {
        return "EventService{}";
    }

    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f11452a.L();
        if (t.a()) {
            this.f11452a.L().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        t7 t7Var = new t7(str, new HashMap(), this.f11453b);
        Map a10 = a(t7Var, true);
        Map d10 = t7Var.d();
        if (((Boolean) this.f11452a.a(oj.B5)).booleanValue() || ((Boolean) this.f11452a.a(oj.f10437w5)).booleanValue()) {
            d10.putAll(a10);
            a10 = null;
        }
        this.f11452a.Z().e(d.b().d(b()).a(a()).b(a10).c(d10).a(a(t7Var, (Map) null)).c(((Boolean) this.f11452a.a(oj.L5)).booleanValue()).a(((Boolean) this.f11452a.a(oj.f10333j5)).booleanValue()).a());
    }

    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            t.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f11452a.B().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, (Map<String, String>) null);
    }

    public void trackEvent(String str, Map<String, String> map, Map<String, String> map2) {
        this.f11452a.L();
        if (t.a()) {
            t L = this.f11452a.L();
            L.a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        t7 t7Var = new t7(str, map, this.f11453b);
        boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f11452a.l0().a((xl) new kn(this.f11452a, contains, "submitTrackEventPostback", new c0(this, t7Var, map2, contains)), sm.b.OTHER);
        } catch (Throwable th) {
            this.f11452a.L();
            if (t.a()) {
                t L2 = this.f11452a.L();
                L2.a("AppLovinEventService", "Unable to track event: " + t7Var, th);
            }
            this.f11452a.B().a("AppLovinEventService", "trackEvent", th);
        }
    }

    private Map a(t7 t7Var, boolean z10) {
        Map map;
        boolean contains = this.f11452a.c(oj.Q0).contains(t7Var.c());
        if (this.f11452a.y() != null) {
            map = this.f11452a.y().a((Map) null, z10, false);
        } else {
            map = this.f11452a.x().a((Map) null, z10, false);
        }
        map.put("event", contains ? t7Var.c() : "postinstall");
        map.put("event_id", t7Var.b());
        map.put("ts", Long.toString(t7Var.a()));
        if (!contains) {
            map.put("sub_event", t7Var.c());
        }
        return zp.a(map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(t7 t7Var, Map map, boolean z10) {
        Map a10 = a(t7Var, false);
        Map d10 = t7Var.d();
        if (((Boolean) this.f11452a.a(oj.B5)).booleanValue() || ((Boolean) this.f11452a.a(oj.f10437w5)).booleanValue()) {
            d10.putAll(a10);
            a10 = null;
        }
        this.f11452a.Z().e(d.b().d(b()).a(a()).b(a10).c(d10).a(a(t7Var, map)).c(((Boolean) this.f11452a.a(oj.L5)).booleanValue()).a(((Boolean) this.f11452a.a(oj.f10333j5)).booleanValue()).d(z10).a(qi.a.a(((Integer) this.f11452a.a(oj.f10413t5)).intValue())).a());
    }

    private String a() {
        return ((String) this.f11452a.a(oj.N0)) + "4.0/pix";
    }
}
