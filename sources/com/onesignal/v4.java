package com.onesignal;

import com.onesignal.k3;
import com.onesignal.y3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSecondaryChannelSynchronizer */
abstract class v4 extends w4 {
    v4(y3.d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    public abstract String B();

    /* access modifiers changed from: protected */
    public k3.r0 C() {
        return k3.r0.INFO;
    }

    /* access modifiers changed from: protected */
    public void Q(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(l0(), jSONObject.get("identifier"));
                if (jSONObject.has(k0())) {
                    jSONObject2.put(k0(), jSONObject.get(k0()));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            j0(jSONObject2);
        }
    }

    /* access modifiers changed from: protected */
    public void W() {
        if (!(B() == null && E() == null) && k3.R0() != null) {
            D(0).c();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void i0();

    /* access modifiers changed from: package-private */
    public abstract void j0(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract String k0();

    /* access modifiers changed from: protected */
    public abstract String l0();

    /* access modifiers changed from: protected */
    public abstract int m0();

    /* access modifiers changed from: protected */
    public void n(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", m0());
            jSONObject.putOpt("device_player_id", k3.R0());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void n0() {
        W();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o0(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.onesignal.o4 r0 = r6.H()
            com.onesignal.c0 r1 = r0.l()
            java.lang.String r2 = "identifier"
            java.lang.String r3 = r1.f(r2)
            boolean r3 = r7.equals(r3)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r6.k0()
            java.lang.String r3 = r1.f(r3)
            if (r8 != 0) goto L_0x0022
            r5 = r4
            goto L_0x0023
        L_0x0022:
            r5 = r8
        L_0x0023:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x004a
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r6.l0()     // Catch:{ JSONException -> 0x0042 }
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r7 = r6.k0()     // Catch:{ JSONException -> 0x0042 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0046:
            r6.j0(r0)
            return
        L_0x004a:
            r3 = 0
            java.lang.String r1 = r1.g(r2, r3)
            if (r1 != 0) goto L_0x0054
            r6.c0()
        L_0x0054:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f }
            r5.<init>()     // Catch:{ JSONException -> 0x007f }
            r5.put(r2, r7)     // Catch:{ JSONException -> 0x007f }
            if (r8 == 0) goto L_0x0065
            java.lang.String r2 = r6.k0()     // Catch:{ JSONException -> 0x007f }
            r5.put(r2, r8)     // Catch:{ JSONException -> 0x007f }
        L_0x0065:
            if (r8 != 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            boolean r7 = r1.equals(r7)     // Catch:{ JSONException -> 0x007f }
            if (r7 != 0) goto L_0x0078
            r6.V(r4)     // Catch:{ JSONException -> 0x007f }
            r6.T()     // Catch:{ JSONException -> 0x007f }
            r6.c0()     // Catch:{ JSONException -> 0x007f }
        L_0x0078:
            r0.h(r5, r3)     // Catch:{ JSONException -> 0x007f }
            r6.W()     // Catch:{ JSONException -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v4.o0(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void w(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            i0();
        }
    }
}
