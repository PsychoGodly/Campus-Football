package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.e1;
import com.google.android.gms.common.internal.q;
import o5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbab {
    private final Context zza;

    public zzbab(Context context) {
        q.l(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza(Intent intent) {
        q.l(intent, "Intent can not be null");
        if (!this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((Boolean) e1.a(this.zza, zzbaa.zza)).booleanValue() && c.a(this.zza).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
