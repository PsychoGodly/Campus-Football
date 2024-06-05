package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzmf implements zzcd {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zzmf(Context context, String str, String str2) {
        if (str != null) {
            this.zzb = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public final void zza(zzua zzua) throws IOException {
        if (!this.zza.putString(this.zzb, zzxj.zza(zzua.zzj())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void zza(zzvg zzvg) throws IOException {
        if (!this.zza.putString(this.zzb, zzxj.zza(zzvg.zzj())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
