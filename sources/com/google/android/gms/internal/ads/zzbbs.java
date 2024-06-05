package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.i;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbbs {
    private i zza;
    private c zzb;
    private e zzc;
    private zzbbq zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgxm.zza(context));
                }
            }
        }
        return false;
    }

    public final i zza() {
        c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.e((b) null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza2;
        if (this.zzb == null && (zza2 = zzgxm.zza(activity)) != null) {
            zzgxn zzgxn = new zzgxn(this, (byte[]) null);
            this.zzc = zzgxn;
            c.a(activity, zza2, zzgxn);
        }
    }

    public final void zzc(c cVar) {
        this.zzb = cVar;
        cVar.g(0);
        zzbbq zzbbq = this.zzd;
        if (zzbbq != null) {
            zzbbq.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbbq zzbbq) {
        this.zzd = zzbbq;
    }

    public final void zzf(Activity activity) {
        e eVar = this.zzc;
        if (eVar != null) {
            activity.unbindService(eVar);
            this.zzb = null;
            this.zza = null;
            this.zzc = null;
        }
    }
}
