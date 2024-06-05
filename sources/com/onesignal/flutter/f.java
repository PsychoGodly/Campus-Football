package com.onesignal.flutter;

import android.util.Log;
import com.onesignal.OSSubscriptionState;
import com.onesignal.c1;
import com.onesignal.d1;
import com.onesignal.f2;
import com.onesignal.g2;
import com.onesignal.i2;
import com.onesignal.l2;
import com.onesignal.m2;
import com.onesignal.u0;
import com.onesignal.w1;
import com.onesignal.w2;
import com.onesignal.x1;
import com.onesignal.y0;
import com.onesignal.z0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalSerializer */
class f {

    /* compiled from: OneSignalSerializer */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27795a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onesignal.x1$a[] r0 = com.onesignal.x1.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27795a = r0
                com.onesignal.x1$a r1 = com.onesignal.x1.a.Opened     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27795a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.x1$a r1 = com.onesignal.x1.a.ActionTaken     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.flutter.f.a.<clinit>():void");
        }
    }

    private static HashMap<String, Object> a(w1.b bVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("image", bVar.e());
        hashMap.put("bodyTextColor", bVar.d());
        hashMap.put("titleTextColor", bVar.f());
        return hashMap;
    }

    static HashMap<String, Object> b(u0 u0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (u0Var == null) {
            return hashMap;
        }
        hashMap.put("hasNotificationPermission", Boolean.valueOf(u0Var.a()));
        hashMap.put("pushDisabled", Boolean.valueOf(u0Var.i()));
        hashMap.put("subscribed", Boolean.valueOf(u0Var.k()));
        hashMap.put("emailSubscribed", Boolean.valueOf(u0Var.h()));
        hashMap.put("smsSubscribed", Boolean.valueOf(u0Var.j()));
        hashMap.put("userId", u0Var.g());
        hashMap.put("pushToken", u0Var.d());
        hashMap.put("emailUserId", u0Var.c());
        hashMap.put("emailAddress", u0Var.b());
        hashMap.put("smsUserId", u0Var.f());
        hashMap.put("smsNumber", u0Var.e());
        return hashMap;
    }

    static HashMap<String, Object> c(z0 z0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("to", d(z0Var.b()));
        hashMap.put("from", d(z0Var.a()));
        return hashMap;
    }

    private static HashMap<String, Object> d(y0 y0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("emailUserId", y0Var.d());
        hashMap.put("emailAddress", y0Var.c());
        hashMap.put("isSubscribed", Boolean.valueOf(y0Var.f()));
        return hashMap;
    }

    static HashMap<String, Object> e(d1 d1Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click_name", d1Var.c());
        hashMap.put("click_url", d1Var.d());
        hashMap.put("first_click", Boolean.valueOf(d1Var.i()));
        hashMap.put("closes_message", Boolean.valueOf(d1Var.a()));
        return hashMap;
    }

    static HashMap<String, Object> f(c1 c1Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("message_id", c1Var.a());
        return hashMap;
    }

    private static List<Object> g(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = g((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = h((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    static HashMap<String, Object> h(JSONObject jSONObject) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!(jSONObject == null || jSONObject == JSONObject.NULL)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.isNull(next)) {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        obj = g((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = h((JSONObject) obj);
                    }
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> i(x1 x1Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", x1Var.a());
        int i10 = a.f27795a[x1Var.b().ordinal()];
        if (i10 == 1) {
            hashMap.put("type", 0);
        } else if (i10 == 2) {
            hashMap.put("type", 1);
        }
        return hashMap;
    }

    static HashMap<String, Object> j(f2 f2Var) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("notification", l(f2Var.e()));
        hashMap.put("action", i(f2Var.d()));
        return hashMap;
    }

    static HashMap<String, Object> k(g2 g2Var) throws JSONException {
        return l(g2Var.c());
    }

    static HashMap<String, Object> l(w1 w1Var) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("androidNotificationId", Integer.valueOf(w1Var.f()));
        if (w1Var.n() != null && !w1Var.n().isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (w1 j02 : w1Var.n()) {
                jSONArray.put(j02.j0());
            }
            hashMap.put("groupedNotifications", jSONArray.toString());
        }
        hashMap.put("notificationId", w1Var.t());
        hashMap.put("title", w1Var.C());
        if (w1Var.i() != null) {
            hashMap.put("body", w1Var.i());
        }
        if (w1Var.x() != null) {
            hashMap.put("smallIcon", w1Var.x());
        }
        if (w1Var.o() != null) {
            hashMap.put("largeIcon", w1Var.o());
        }
        if (w1Var.h() != null) {
            hashMap.put("bigPicture", w1Var.h());
        }
        if (w1Var.y() != null) {
            hashMap.put("smallIconAccentColor", w1Var.y());
        }
        if (w1Var.p() != null) {
            hashMap.put("launchUrl", w1Var.p());
        }
        if (w1Var.z() != null) {
            hashMap.put("sound", w1Var.z());
        }
        if (w1Var.q() != null) {
            hashMap.put("ledColor", w1Var.q());
        }
        hashMap.put("lockScreenVisibility", Integer.valueOf(w1Var.r()));
        if (w1Var.l() != null) {
            hashMap.put("groupKey", w1Var.l());
        }
        if (w1Var.m() != null) {
            hashMap.put("groupMessage", w1Var.m());
        }
        if (w1Var.k() != null) {
            hashMap.put("fromProjectNumber", w1Var.k());
        }
        if (w1Var.j() != null) {
            hashMap.put("collapseId", w1Var.j());
        }
        hashMap.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(w1Var.u()));
        if (w1Var.e() != null && w1Var.e().length() > 0) {
            hashMap.put("additionalData", h(w1Var.e()));
        }
        if (w1Var.d() != null && !w1Var.d().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<w1.a> d10 = w1Var.d();
            for (int i10 = 0; i10 < d10.size(); i10++) {
                w1.a aVar = d10.get(i10);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("id", aVar.e());
                hashMap2.put("text", aVar.f());
                hashMap2.put("icon", aVar.d());
                arrayList.add(hashMap2);
            }
            hashMap.put("buttons", arrayList);
        }
        if (w1Var.g() != null) {
            hashMap.put("backgroundImageLayout", a(w1Var.g()));
        }
        hashMap.put("rawPayload", w1Var.v());
        Log.d("onesignal", "Created json raw payload: " + hashMap.toString());
        return hashMap;
    }

    static HashMap<String, Object> m(i2 i2Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("session", i2Var.d().toString());
        if (i2Var.c() == null) {
            hashMap.put("notification_ids", new JSONArray().toString());
        } else {
            hashMap.put("notification_ids", i2Var.c().toString());
        }
        hashMap.put("id", i2Var.b());
        hashMap.put("timestamp", Long.valueOf(i2Var.e()));
        hashMap.put("weight", String.valueOf(i2Var.f()));
        return hashMap;
    }

    static HashMap n(m2 m2Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("to", o(m2Var.b()));
        hashMap.put("from", o(m2Var.a()));
        return hashMap;
    }

    private static HashMap<String, Object> o(l2 l2Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("areNotificationsEnabled", Boolean.valueOf(l2Var.a()));
        return hashMap;
    }

    static HashMap<String, Object> p(w2 w2Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("to", q(w2Var.b()));
        hashMap.put("from", q(w2Var.a()));
        return hashMap;
    }

    private static HashMap<String, Object> q(OSSubscriptionState oSSubscriptionState) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("isSubscribed", Boolean.valueOf(oSSubscriptionState.f()));
        hashMap.put("isPushDisabled", Boolean.valueOf(oSSubscriptionState.e()));
        hashMap.put("pushToken", oSSubscriptionState.c());
        hashMap.put("userId", oSSubscriptionState.d());
        return hashMap;
    }
}
