package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafe implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private e zze;
    private String zzf;
    private String zzg;

    public zzafe(int i10) {
        this.zza = zza(i10);
    }

    public static zzafe zza(e eVar, String str, String str2) {
        q.g(str);
        q.g(str2);
        q.k(eVar);
        return new zzafe(7, eVar, (String) null, str2, str, (String) null, (String) null);
    }

    private static String zza(int i10) {
        return i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final e zzb() {
        return this.zze;
    }

    public final zzafe zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafe zzd(String str) {
        this.zzd = q.g(str);
        return this;
    }

    public final zzafe zzb(String str) {
        this.zzb = q.g(str);
        return this;
    }

    private zzafe(int i10, e eVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (e) q.k(eVar);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzafe zza(e eVar) {
        this.zze = (e) q.k(eVar);
        return this;
    }

    public final zzafe zza(String str) {
        this.zzg = str;
        return this;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        int i10 = 1;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 7;
                break;
            case 3:
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        e eVar = this.zze;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.w());
            jSONObject.put("canHandleCodeInApp", this.zze.v());
            if (this.zze.B() != null) {
                jSONObject.put("continueUrl", this.zze.B());
            }
            if (this.zze.z() != null) {
                jSONObject.put("iosBundleId", this.zze.z());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.y() != null) {
                jSONObject.put("androidPackageName", this.zze.y());
            }
            if (this.zze.x() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.x());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzahc.zza(jSONObject, "captchaResp", str6);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
