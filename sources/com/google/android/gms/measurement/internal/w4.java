package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
class w4 extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25183d = w4.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final va f25184a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25185b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25186c;

    w4(va vaVar) {
        q.k(vaVar);
        this.f25184a = vaVar;
    }

    public final void b() {
        this.f25184a.k0();
        this.f25184a.zzl().i();
        if (!this.f25185b) {
            this.f25184a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f25186c = this.f25184a.b0().v();
            this.f25184a.zzj().F().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f25186c));
            this.f25185b = true;
        }
    }

    public final void c() {
        this.f25184a.k0();
        this.f25184a.zzl().i();
        this.f25184a.zzl().i();
        if (this.f25185b) {
            this.f25184a.zzj().F().a("Unregistering connectivity change receiver");
            this.f25185b = false;
            this.f25186c = false;
            try {
                this.f25184a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f25184a.zzj().B().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f25184a.k0();
        String action = intent.getAction();
        this.f25184a.zzj().F().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean v10 = this.f25184a.b0().v();
            if (this.f25186c != v10) {
                this.f25186c = v10;
                this.f25184a.zzl().y(new z4(this, v10));
                return;
            }
            return;
        }
        this.f25184a.zzj().G().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
