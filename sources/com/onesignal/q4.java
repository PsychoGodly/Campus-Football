package com.onesignal;

import com.applovin.mediation.MaxReward;
import com.onesignal.y3;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: UserStateEmailSynchronizer */
class q4 extends v4 {
    q4() {
        super(y3.d.EMAIL);
    }

    /* access modifiers changed from: protected */
    public String B() {
        return k3.i0();
    }

    /* access modifiers changed from: protected */
    public o4 P(String str, boolean z10) {
        return new p4(str, z10);
    }

    /* access modifiers changed from: package-private */
    public void V(String str) {
        k3.b2(str);
    }

    /* access modifiers changed from: package-private */
    public void g0(String str) {
        k3.M2(str);
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        k3.P();
    }

    /* access modifiers changed from: package-private */
    public void j0(JSONObject jSONObject) {
        k3.Q();
    }

    /* access modifiers changed from: protected */
    public String k0() {
        return "email_auth_hash";
    }

    /* access modifiers changed from: protected */
    public String l0() {
        return "email";
    }

    /* access modifiers changed from: protected */
    public int m0() {
        return 11;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        k3.b2(MaxReward.DEFAULT_LABEL);
        T();
        G().w("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add("email_auth_hash");
        arrayList.add("device_player_id");
        arrayList.add("external_user_id");
        G().x(arrayList);
        G().q();
        k3.j0().a();
    }
}
