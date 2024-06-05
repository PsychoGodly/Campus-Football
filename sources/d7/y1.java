package d7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzafc;
import com.google.android.gms.internal.p001firebaseauthapi.zzafs;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import com.google.firebase.auth.c1;
import i5.a;
import i5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class y1 extends a implements c1 {
    public static final Parcelable.Creator<y1> CREATOR = new b2();

    /* renamed from: a  reason: collision with root package name */
    private String f28653a;

    /* renamed from: b  reason: collision with root package name */
    private String f28654b;

    /* renamed from: c  reason: collision with root package name */
    private String f28655c;

    /* renamed from: d  reason: collision with root package name */
    private String f28656d;

    /* renamed from: f  reason: collision with root package name */
    private Uri f28657f;

    /* renamed from: g  reason: collision with root package name */
    private String f28658g;

    /* renamed from: h  reason: collision with root package name */
    private String f28659h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28660i;

    /* renamed from: j  reason: collision with root package name */
    private String f28661j;

    public y1(zzafs zzafs) {
        q.k(zzafs);
        this.f28653a = zzafs.zzd();
        this.f28654b = q.g(zzafs.zzf());
        this.f28655c = zzafs.zzb();
        Uri zza = zzafs.zza();
        if (zza != null) {
            this.f28656d = zza.toString();
            this.f28657f = zza;
        }
        this.f28658g = zzafs.zzc();
        this.f28659h = zzafs.zze();
        this.f28660i = false;
        this.f28661j = zzafs.zzg();
    }

    public static y1 b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new y1(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxw(e10);
        }
    }

    public final String D() {
        return this.f28654b;
    }

    public final String c() {
        return this.f28653a;
    }

    public final Uri e() {
        if (!TextUtils.isEmpty(this.f28656d) && this.f28657f == null) {
            this.f28657f = Uri.parse(this.f28656d);
        }
        return this.f28657f;
    }

    public final boolean g() {
        return this.f28660i;
    }

    public final String getEmail() {
        return this.f28658g;
    }

    public final String getPhoneNumber() {
        return this.f28659h;
    }

    public final String m() {
        return this.f28655c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, c(), false);
        c.q(parcel, 2, D(), false);
        c.q(parcel, 3, m(), false);
        c.q(parcel, 4, this.f28656d, false);
        c.q(parcel, 5, getEmail(), false);
        c.q(parcel, 6, getPhoneNumber(), false);
        c.c(parcel, 7, g());
        c.q(parcel, 8, this.f28661j, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f28661j;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f28653a);
            jSONObject.putOpt("providerId", this.f28654b);
            jSONObject.putOpt("displayName", this.f28655c);
            jSONObject.putOpt("photoUrl", this.f28656d);
            jSONObject.putOpt("email", this.f28658g);
            jSONObject.putOpt("phoneNumber", this.f28659h);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f28660i));
            jSONObject.putOpt("rawUserInfo", this.f28661j);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }

    public y1(zzafc zzafc, String str) {
        q.k(zzafc);
        q.g(str);
        this.f28653a = q.g(zzafc.zzi());
        this.f28654b = str;
        this.f28658g = zzafc.zzh();
        this.f28655c = zzafc.zzg();
        Uri zzc = zzafc.zzc();
        if (zzc != null) {
            this.f28656d = zzc.toString();
            this.f28657f = zzc;
        }
        this.f28660i = zzafc.zzm();
        this.f28661j = null;
        this.f28659h = zzafc.zzj();
    }

    public y1(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f28653a = str;
        this.f28654b = str2;
        this.f28658g = str3;
        this.f28659h = str4;
        this.f28655c = str5;
        this.f28656d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f28657f = Uri.parse(this.f28656d);
        }
        this.f28660i = z10;
        this.f28661j = str7;
    }
}
