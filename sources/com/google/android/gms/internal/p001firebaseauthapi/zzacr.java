package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzacr {
    private final int zza;

    private zzacr(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza2 = zzab.zza("[.-]").zza((CharSequence) str);
            if (zza2.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza2.size() >= 3) {
                return (Integer.parseInt(zza2.get(0)) * 1000000) + (Integer.parseInt(zza2.get(1)) * 1000) + Integer.parseInt(zza2.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e10}));
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", new Object[]{Integer.toString(this.zza)});
    }

    public static zzacr zza() {
        String b10 = n.a().b("firebase-auth");
        if (TextUtils.isEmpty(b10) || b10.equals("UNKNOWN")) {
            b10 = "-1";
        }
        return new zzacr(b10);
    }
}
