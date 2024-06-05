package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import i5.a;
import i5.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m5.e;
import m5.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public static e f14971o = h.d();

    /* renamed from: a  reason: collision with root package name */
    final int f14972a;

    /* renamed from: b  reason: collision with root package name */
    private String f14973b;

    /* renamed from: c  reason: collision with root package name */
    private String f14974c;

    /* renamed from: d  reason: collision with root package name */
    private String f14975d;

    /* renamed from: f  reason: collision with root package name */
    private String f14976f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f14977g;

    /* renamed from: h  reason: collision with root package name */
    private String f14978h;

    /* renamed from: i  reason: collision with root package name */
    private long f14979i;

    /* renamed from: j  reason: collision with root package name */
    private String f14980j;

    /* renamed from: k  reason: collision with root package name */
    List<Scope> f14981k;

    /* renamed from: l  reason: collision with root package name */
    private String f14982l;

    /* renamed from: m  reason: collision with root package name */
    private String f14983m;

    /* renamed from: n  reason: collision with root package name */
    private Set<Scope> f14984n = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List<Scope> list, String str7, String str8) {
        this.f14972a = i10;
        this.f14973b = str;
        this.f14974c = str2;
        this.f14975d = str3;
        this.f14976f = str4;
        this.f14977g = uri;
        this.f14978h = str5;
        this.f14979i = j10;
        this.f14980j = str6;
        this.f14981k = list;
        this.f14982l = str7;
        this.f14983m = str8;
    }

    public static GoogleSignInAccount I(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), q.g(str7), new ArrayList((Collection) q.k(set)), str5, str6);
    }

    public static GoogleSignInAccount J(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount I = I(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        I.f14978h = str2;
        return I;
    }

    public Set<Scope> B() {
        HashSet hashSet = new HashSet(this.f14981k);
        hashSet.addAll(this.f14984n);
        return hashSet;
    }

    public String C() {
        return this.f14978h;
    }

    public Uri e() {
        return this.f14977g;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f14980j.equals(this.f14980j) && googleSignInAccount.B().equals(B());
    }

    public String getEmail() {
        return this.f14975d;
    }

    public int hashCode() {
        return ((this.f14980j.hashCode() + 527) * 31) + B().hashCode();
    }

    public String m() {
        return this.f14976f;
    }

    public Account v() {
        String str = this.f14975d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String w() {
        return this.f14983m;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f14972a);
        c.q(parcel, 2, y(), false);
        c.q(parcel, 3, z(), false);
        c.q(parcel, 4, getEmail(), false);
        c.q(parcel, 5, m(), false);
        c.p(parcel, 6, e(), i10, false);
        c.q(parcel, 7, C(), false);
        c.n(parcel, 8, this.f14979i);
        c.q(parcel, 9, this.f14980j, false);
        c.u(parcel, 10, this.f14981k, false);
        c.q(parcel, 11, x(), false);
        c.q(parcel, 12, w(), false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f14982l;
    }

    public String y() {
        return this.f14973b;
    }

    public String z() {
        return this.f14974c;
    }
}
