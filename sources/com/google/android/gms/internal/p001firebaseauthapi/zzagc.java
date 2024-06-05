package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagc implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private zzago zzg = new zzago();
    private boolean zzh = true;
    private zzago zzi = new zzago();
    private String zzj;

    public final zzagc zza(String str) {
        q.g(str);
        this.zzi.zzb().add(str);
        return this;
    }

    public final zzagc zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzagc zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzagc zzd(String str) {
        this.zza = q.g(str);
        return this;
    }

    public final zzagc zze(String str) {
        this.zze = q.g(str);
        return this;
    }

    public final zzagc zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzagc zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzagc zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        q.g(str);
        return this.zzg.zzb().contains(str);
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> zzb2 = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < zzb2.size(); i10++) {
                jSONArray.put(zzb2.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> zzb3 = this.zzg.zzb();
        int size = zzb3.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < zzb3.size(); i11++) {
            String str = zzb3.get(i11);
            str.hashCode();
            char c10 = 65535;
            int i12 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    break;
                case 1:
                    i12 = 1;
                    break;
                case 2:
                    i12 = 4;
                    break;
                case 3:
                    i12 = 5;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            iArr[i11] = i12;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
