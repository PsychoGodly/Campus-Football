package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.unity3d.ads.metadata.MediationMetaData;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class u7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f25098a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f25099b;

    u7(b7 b7Var, Bundle bundle) {
        this.f25099b = b7Var;
        this.f25098a = bundle;
    }

    public final void run() {
        b7 b7Var = this.f25099b;
        Bundle bundle = this.f25098a;
        b7Var.i();
        b7Var.q();
        q.k(bundle);
        String string = bundle.getString(MediationMetaData.KEY_NAME);
        String string2 = bundle.getString("origin");
        q.g(string);
        q.g(string2);
        q.k(bundle.get("value"));
        if (!b7Var.f25124a.k()) {
            b7Var.zzj().F().a("Conditional property not set since app measurement is disabled");
            return;
        }
        hb hbVar = new hb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            d0 B = b7Var.f().B(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            d0 B2 = b7Var.f().B(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            d0 B3 = b7Var.f().B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            b7Var.o().C(new d(bundle.getString("app_id"), string2, hbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), B2, bundle.getLong("trigger_timeout"), B, bundle.getLong("time_to_live"), B3));
        } catch (IllegalArgumentException unused) {
        }
    }
}
