package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzx {
    private static final Logger zza = Logger.getLogger(zzx.class.getName());
    private static final zzv zzb = new zza();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    private static final class zza implements zzv {
        private zza() {
        }

        public final zzs zza(String str) {
            return new zzu(Pattern.compile(str));
        }
    }

    private zzx() {
    }

    static zzs zza(String str) {
        zzy.zza(str);
        return zzb.zza(str);
    }

    static String zzb(String str) {
        if (zzd(str)) {
            return null;
        }
        return str;
    }

    static String zzc(String str) {
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }
}
