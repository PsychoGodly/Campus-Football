package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzawa {
    /* access modifiers changed from: private */
    public zzavp zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    zzawa(Context context) {
        this.zzc = context;
    }

    static /* bridge */ /* synthetic */ void zze(zzawa zzawa) {
        synchronized (zzawa.zzd) {
            zzavp zzavp = zzawa.zza;
            if (zzavp != null) {
                zzavp.disconnect();
                zzawa.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Future zzc(zzavq zzavq) {
        zzavu zzavu = new zzavu(this);
        zzavy zzavy = new zzavy(this, zzavq, zzavu);
        zzavz zzavz = new zzavz(this, zzavu);
        synchronized (this.zzd) {
            zzavp zzavp = new zzavp(this.zzc, t.v().b(), zzavy, zzavz);
            this.zza = zzavp;
            zzavp.checkAvailabilityAndConnect();
        }
        return zzavu;
    }
}
