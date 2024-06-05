package com.onesignal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.onesignal.g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserState */
abstract class o4 {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f28078d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f28079e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f28080f;

    /* renamed from: a  reason: collision with root package name */
    private String f28081a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f28082b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f28083c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        f28079e = strArr;
        f28080f = new HashSet(Arrays.asList(strArr));
    }

    o4(String str, boolean z10) {
        this.f28081a = str;
        if (z10) {
            n();
            return;
        }
        this.f28082b = new JSONObject();
        this.f28083c = new JSONObject();
    }

    private static JSONObject e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject b10;
        synchronized (f28078d) {
            b10 = f0.b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return b10;
    }

    private Set<String> k(o4 o4Var) {
        try {
            if (this.f28082b.optLong("loc_time_stamp") == o4Var.f28082b.getLong("loc_time_stamp")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("loc_bg", o4Var.f28082b.opt("loc_bg"));
            hashMap.put("loc_time_stamp", o4Var.f28082b.opt("loc_time_stamp"));
            u(o4Var.f28083c, hashMap);
            return f28080f;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void n() {
        int i10;
        boolean z10;
        String str = t3.f28204a;
        String f10 = t3.f(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f28081a, (String) null);
        if (f10 == null) {
            y(new JSONObject());
            try {
                int i11 = 1;
                if (this.f28081a.equals("CURRENT_STATE")) {
                    i10 = t3.c(str, "ONESIGNAL_SUBSCRIPTION", 1);
                } else {
                    i10 = t3.c(str, "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                }
                if (i10 == -2) {
                    z10 = false;
                } else {
                    i11 = i10;
                    z10 = true;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("subscribableStatus", Integer.valueOf(i11));
                hashMap.put("userSubscribePref", Boolean.valueOf(z10));
                u(this.f28082b, hashMap);
            } catch (JSONException unused) {
            }
        } else {
            try {
                y(new JSONObject(f10));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        String str2 = t3.f28204a;
        String f11 = t3.f(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f28081a, (String) null);
        JSONObject jSONObject = new JSONObject();
        if (f11 == null) {
            try {
                jSONObject.put("identifier", t3.f(str2, "GT_REGISTRATION_ID", (String) null));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        } else {
            jSONObject = new JSONObject(f11);
        }
        A(jSONObject);
    }

    private void u(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        synchronized (f28078d) {
            for (Map.Entry next : hashMap.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }

    public void A(JSONObject jSONObject) {
        synchronized (f28078d) {
            this.f28083c = jSONObject;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", (Object) null);
            hashMap.put("long", (Object) null);
            hashMap.put("loc_acc", (Object) null);
            hashMap.put("loc_type", (Object) null);
            hashMap.put("loc_bg", (Object) null);
            hashMap.put("loc_time_stamp", (Object) null);
            u(this.f28083c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", (Object) null);
            hashMap2.put("loc_time_stamp", (Object) null);
            u(this.f28082b, hashMap2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public o4 c(String str) {
        o4 p10 = p(str);
        try {
            p10.f28082b = j();
            p10.f28083c = m();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return p10;
    }

    /* access modifiers changed from: package-private */
    public JSONObject d(o4 o4Var, boolean z10) {
        a();
        o4Var.a();
        JSONObject e10 = e(this.f28083c, o4Var.f28083c, (JSONObject) null, k(o4Var));
        if (!z10 && e10.toString().equals(JsonUtils.EMPTY_JSON)) {
            return null;
        }
        try {
            if (!e10.has("app_id")) {
                e10.put("app_id", this.f28083c.optString("app_id"));
            }
            if (this.f28083c.has("email_auth_hash")) {
                e10.put("email_auth_hash", this.f28083c.optString("email_auth_hash"));
            }
            if (this.f28083c.has("sms_auth_hash")) {
                e10.put("sms_auth_hash", this.f28083c.optString("sms_auth_hash"));
            }
            if (this.f28083c.has("external_user_id_auth_hash") && !e10.has("external_user_id_auth_hash")) {
                e10.put("external_user_id_auth_hash", this.f28083c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return e10;
    }

    /* access modifiers changed from: package-private */
    public JSONObject f(o4 o4Var, Set<String> set) {
        JSONObject b10;
        synchronized (f28078d) {
            b10 = f0.b(this.f28082b, o4Var.f28082b, (JSONObject) null, set);
        }
        return b10;
    }

    /* access modifiers changed from: package-private */
    public JSONObject g(JSONObject jSONObject, Set<String> set) {
        JSONObject b10;
        synchronized (f28078d) {
            JSONObject jSONObject2 = this.f28082b;
            b10 = f0.b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return b10;
    }

    /* access modifiers changed from: package-private */
    public JSONObject h(JSONObject jSONObject, Set<String> set) {
        JSONObject b10;
        synchronized (f28078d) {
            JSONObject jSONObject2 = this.f28083c;
            b10 = f0.b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return b10;
    }

    public c0 i() {
        try {
            return new c0(j());
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new c0();
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject j() throws JSONException {
        JSONObject jSONObject;
        synchronized (f28078d) {
            jSONObject = new JSONObject(this.f28082b.toString());
        }
        return jSONObject;
    }

    public c0 l() {
        try {
            return new c0(m());
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new c0();
        }
    }

    public JSONObject m() throws JSONException {
        JSONObject jSONObject;
        synchronized (f28078d) {
            jSONObject = new JSONObject(this.f28083c.toString());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(org.json.JSONObject r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "tags"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONObject r0 = r5.m()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "tags"
            boolean r1 = r0.has(r1)     // Catch:{ JSONException -> 0x0085 }
            if (r1 == 0) goto L_0x0027
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = "tags"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0021 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x002c
        L_0x0021:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
            goto L_0x002c
        L_0x0027:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
        L_0x002c:
            java.lang.String r0 = "tags"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r0 = r6.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x0036:
            boolean r2 = r0.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r3 = ""
            java.lang.String r4 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x0085 }
            if (r3 == 0) goto L_0x0052
            r1.remove(r2)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0052:
            if (r7 == 0) goto L_0x005a
            boolean r3 = r7.has(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r3 != 0) goto L_0x0036
        L_0x005a:
            java.lang.String r3 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0062:
            java.lang.Object r6 = f28078d     // Catch:{ JSONException -> 0x0085 }
            monitor-enter(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "{}"
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0079
            org.json.JSONObject r7 = r5.f28083c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.remove(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0079:
            org.json.JSONObject r7 = r5.f28083c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.put(r0, r1)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r7     // Catch:{ JSONException -> 0x0085 }
        L_0x0085:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.o4.o(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* access modifiers changed from: package-private */
    public abstract o4 p(String str);

    /* access modifiers changed from: package-private */
    public void q() {
        synchronized (f28078d) {
            try {
                if (this.f28083c.has("external_user_id_auth_hash") && ((this.f28083c.has("external_user_id") && this.f28083c.get("external_user_id").toString() == MaxReward.DEFAULT_LABEL) || !this.f28083c.has("external_user_id"))) {
                    this.f28083c.remove("external_user_id_auth_hash");
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            String str = t3.f28204a;
            t3.m(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f28081a, this.f28083c.toString());
            t3.m(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f28081a, this.f28082b.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public void r(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f28082b;
            e(jSONObject3, jSONObject, jSONObject3, (Set<String>) null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f28083c;
            e(jSONObject4, jSONObject2, jSONObject4, (Set<String>) null);
            o(jSONObject2, (JSONObject) null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            q();
        }
    }

    /* access modifiers changed from: package-private */
    public void s(String str, Object obj) throws JSONException {
        synchronized (f28078d) {
            this.f28082b.put(str, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(String str, Object obj) throws JSONException {
        synchronized (f28078d) {
            this.f28083c.put(str, obj);
        }
    }

    public String toString() {
        return "UserState{persistKey='" + this.f28081a + '\'' + ", dependValues=" + this.f28082b + ", syncValues=" + this.f28083c + '}';
    }

    /* access modifiers changed from: package-private */
    public void v(String str) {
        synchronized (f28078d) {
            this.f28082b.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(String str) {
        synchronized (f28078d) {
            this.f28083c.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void x(List<String> list) {
        synchronized (f28078d) {
            for (String remove : list) {
                this.f28083c.remove(remove);
            }
        }
    }

    public void y(JSONObject jSONObject) {
        synchronized (f28078d) {
            this.f28082b = jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public void z(g0.d dVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", dVar.f27807a);
            hashMap.put("long", dVar.f27808b);
            hashMap.put("loc_acc", dVar.f27809c);
            hashMap.put("loc_type", dVar.f27810d);
            u(this.f28083c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", dVar.f27811e);
            hashMap2.put("loc_time_stamp", dVar.f27812f);
            u(this.f28082b, hashMap2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
