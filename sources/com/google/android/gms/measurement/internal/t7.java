package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.unity3d.ads.metadata.MediationMetaData;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class t7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f25074a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f25075b;

    t7(b7 b7Var, Bundle bundle) {
        this.f25075b = b7Var;
        this.f25074a = bundle;
    }

    public final void run() {
        b7 b7Var = this.f25075b;
        Bundle bundle = this.f25074a;
        b7Var.i();
        b7Var.q();
        q.k(bundle);
        String g10 = q.g(bundle.getString(MediationMetaData.KEY_NAME));
        if (!b7Var.f25124a.k()) {
            b7Var.zzj().F().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        hb hbVar = new hb(g10, 0, (Object) null, MaxReward.DEFAULT_LABEL);
        try {
            d dVar = r4;
            d dVar2 = new d(bundle.getString("app_id"), MaxReward.DEFAULT_LABEL, hbVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (d0) null, bundle.getLong("trigger_timeout"), (d0) null, bundle.getLong("time_to_live"), b7Var.f().B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), MaxReward.DEFAULT_LABEL, bundle.getLong("creation_timestamp"), true, true));
            b7Var.o().C(dVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
