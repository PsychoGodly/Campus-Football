package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagp extends zzagj {
    private static final String zza = "zzagp";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    public final /* synthetic */ zzacs zza(String str) throws zzaaf {
        return (zzagp) zza(str);
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0052 */
    /* renamed from: zzc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p001firebaseauthapi.zzagp zzb(java.lang.String r5) throws com.google.android.gms.internal.p001firebaseauthapi.zzaaf {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r0.<init>(r5)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = "totpSessionInfo"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = "sharedSecretKey"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = com.google.android.gms.internal.p001firebaseauthapi.zzag.zza((java.lang.String) r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r4.zzc = r1     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = "verificationCodeLength"
            int r1 = r0.optInt(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r4.zzd = r1     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = "hashingAlgorithm"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = com.google.android.gms.internal.p001firebaseauthapi.zzag.zza((java.lang.String) r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r4.zze = r1     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = "periodSec"
            int r1 = r0.optInt(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r4.zzf = r1     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = "sessionInfo"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = com.google.android.gms.internal.p001firebaseauthapi.zzag.zza((java.lang.String) r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r4.zzb = r1     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r1 = "finalizeEnrollmentTime"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            com.google.android.gms.internal.firebase-auth-api.zzamb r1 = com.google.android.gms.internal.p001firebaseauthapi.zzanc.zza((java.lang.String) r0)     // Catch:{ ParseException -> 0x0052 }
            long r1 = com.google.android.gms.internal.p001firebaseauthapi.zzanc.zza((com.google.android.gms.internal.p001firebaseauthapi.zzamb) r1)     // Catch:{ ParseException -> 0x0052 }
            r4.zzg = r1     // Catch:{ ParseException -> 0x0052 }
            goto L_0x0065
        L_0x0052:
            java.lang.String r1 = zza     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r3 = "Failed to parse timestamp: "
            r2.<init>(r3)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            r2.append(r0)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
            android.util.Log.e(r1, r0)     // Catch:{ JSONException -> 0x0068, NullPointerException -> 0x0066 }
        L_0x0065:
            return r4
        L_0x0066:
            r0 = move-exception
            goto L_0x0069
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            java.lang.String r1 = zza
            com.google.android.gms.internal.firebase-auth-api.zzaaf r5 = com.google.android.gms.internal.p001firebaseauthapi.zzahc.zza((java.lang.Exception) r0, (java.lang.String) r1, (java.lang.String) r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzagp.zzb(java.lang.String):com.google.android.gms.internal.firebase-auth-api.zzagp");
    }

    public final String zza() {
        return this.zzb;
    }
}
