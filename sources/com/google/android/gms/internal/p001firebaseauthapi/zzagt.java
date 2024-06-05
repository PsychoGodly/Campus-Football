package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import d7.o1;
import i5.a;
import i5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagt extends a implements zzacp {
    public static final Parcelable.Creator<zzagt> CREATOR = new zzags();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzagt() {
        this.zzi = true;
        this.zzj = true;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.zza, false);
        c.q(parcel, 3, this.zzb, false);
        c.q(parcel, 4, this.zzc, false);
        c.q(parcel, 5, this.zzd, false);
        c.q(parcel, 6, this.zze, false);
        c.q(parcel, 7, this.zzf, false);
        c.q(parcel, 8, this.zzg, false);
        c.q(parcel, 9, this.zzh, false);
        c.c(parcel, 10, this.zzi);
        c.c(parcel, 11, this.zzj);
        c.q(parcel, 12, this.zzk, false);
        c.q(parcel, 13, this.zzl, false);
        c.q(parcel, 14, this.zzm, false);
        c.q(parcel, 15, this.zzn, false);
        c.c(parcel, 16, this.zzo);
        c.q(parcel, 17, this.zzp, false);
        c.b(parcel, a10);
    }

    public final zzagt zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    public final zzagt zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzagt zzc(boolean z10) {
        this.zzi = true;
        return this;
    }

    public final zzagt zza(String str) {
        this.zzb = q.g(str);
        return this;
    }

    public final zzagt zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put(JsonStorageKeyNames.SESSION_ID_KEY, this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzagt(o1 o1Var, String str) {
        q.k(o1Var);
        this.zzl = q.g(o1Var.d());
        this.zzm = q.g(str);
        this.zze = q.g(o1Var.c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzagt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.zzd) || !TextUtils.isEmpty(this.zzk)) {
            this.zze = q.g(str3);
            this.zzf = null;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(this.zzc)) {
                sb2.append("id_token=");
                sb2.append(this.zzc);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                sb2.append("access_token=");
                sb2.append(this.zzd);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                sb2.append("identifier=");
                sb2.append(this.zzf);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzh)) {
                sb2.append("oauth_token_secret=");
                sb2.append(this.zzh);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzk)) {
                sb2.append("code=");
                sb2.append(this.zzk);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb2.append("nonce=");
                sb2.append(str9);
                sb2.append("&");
            }
            sb2.append("providerId=");
            sb2.append(this.zze);
            this.zzg = sb2.toString();
            this.zzj = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    zzagt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }
}
