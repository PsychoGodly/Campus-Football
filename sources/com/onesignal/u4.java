package com.onesignal;

import com.applovin.mediation.MaxReward;
import com.onesignal.y3;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: UserStateSMSSynchronizer */
class u4 extends v4 {
    u4() {
        super(y3.d.SMS);
    }

    /* access modifiers changed from: protected */
    public String B() {
        return k3.C0();
    }

    /* access modifiers changed from: protected */
    public o4 P(String str, boolean z10) {
        return new t4(str, z10);
    }

    /* access modifiers changed from: package-private */
    public void V(String str) {
        k3.c2(str);
    }

    /* access modifiers changed from: package-private */
    public void g0(String str) {
        k3.N2(str);
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        k3.T();
    }

    /* access modifiers changed from: package-private */
    public void j0(JSONObject jSONObject) {
        k3.U(jSONObject);
    }

    /* access modifiers changed from: protected */
    public String k0() {
        return "sms_auth_hash";
    }

    /* access modifiers changed from: protected */
    public String l0() {
        return "sms_number";
    }

    /* access modifiers changed from: protected */
    public int m0() {
        return 14;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        V(MaxReward.DEFAULT_LABEL);
        T();
        G().w("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add("sms_auth_hash");
        arrayList.add("device_player_id");
        arrayList.add("external_user_id");
        G().x(arrayList);
        G().q();
        k3.D0().a();
    }
}
