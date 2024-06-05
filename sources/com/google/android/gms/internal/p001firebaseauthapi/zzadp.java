package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import m5.a;
import m5.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzadp {
    private final String zza;
    private final String zzb;

    public zzadp(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzadp(Context context, String str) {
        q.k(context);
        String g10 = q.g(str);
        this.zza = g10;
        try {
            byte[] a10 = a.a(context, g10);
            if (a10 == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + str);
                this.zzb = null;
                return;
            }
            this.zzb = j.c(a10, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
