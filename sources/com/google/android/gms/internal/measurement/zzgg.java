package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzgg implements zzgb {
    private static zzgg zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgg() {
        this.zzb = null;
        this.zzc = null;
    }

    static zzgg zza(Context context) {
        zzgg zzgg;
        synchronized (zzgg.class) {
            if (zza == null) {
                zza = c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgg(context) : new zzgg();
            }
            zzgg = zza;
        }
        return zzgg;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(String str) {
        Context context = this.zzb;
        if (context != null && !zzfw.zza(context)) {
            try {
                return (String) zzge.zza(new zzgf(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzfr.zza(this.zzb.getContentResolver(), str, (String) null);
    }

    private zzgg(Context context) {
        this.zzb = context;
        zzgi zzgi = new zzgi(this, (Handler) null);
        this.zzc = zzgi;
        context.getContentResolver().registerContentObserver(zzfr.zza, true, zzgi);
    }

    static synchronized void zza() {
        Context context;
        synchronized (zzgg.class) {
            zzgg zzgg = zza;
            if (!(zzgg == null || (context = zzgg.zzb) == null || zzgg.zzc == null)) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }
}
