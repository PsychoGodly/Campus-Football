package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzat;
import java.util.HashMap;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class f {

    /* renamed from: g  reason: collision with root package name */
    private static final zzat<String, Integer> f26213g;

    /* renamed from: a  reason: collision with root package name */
    private final String f26214a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26215b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26216c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26217d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26218e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26219f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f26213g = zzat.zza(hashMap);
    }

    private f(String str) {
        String e10 = e(str, "apiKey");
        String e11 = e(str, "oobCode");
        String e12 = e(str, "mode");
        if (e10 == null || e11 == null || e12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        this.f26214a = q.g(e10);
        this.f26215b = q.g(e11);
        this.f26216c = q.g(e12);
        this.f26217d = e(str, "continueUrl");
        this.f26218e = e(str, "languageCode");
        this.f26219f = e(str, "tenantId");
    }

    public static f c(String str) {
        q.g(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(q.g(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f26215b;
    }

    public int b() {
        zzat<String, Integer> zzat = f26213g;
        if (zzat.containsKey(this.f26216c)) {
            return zzat.get(this.f26216c).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f26219f;
    }
}
