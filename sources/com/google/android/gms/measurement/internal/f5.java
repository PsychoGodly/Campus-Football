package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class f5 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f24576a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g5 f24577b;

    f5(g5 g5Var, String str) {
        this.f24577b = g5Var;
        this.f24576a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f24577b.f24597a.zzj().G().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzby zza = zzcb.zza(iBinder);
            if (zza == null) {
                this.f24577b.f24597a.zzj().G().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f24577b.f24597a.zzj().F().a("Install Referrer Service connected");
            this.f24577b.f24597a.zzl().y(new h5(this, zza, this));
        } catch (RuntimeException e10) {
            this.f24577b.f24597a.zzj().G().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f24577b.f24597a.zzj().F().a("Install Referrer Service disconnected");
    }
}
