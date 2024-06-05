package d7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.j0;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.List;
import k5.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private Context f28649a;

    /* renamed from: b  reason: collision with root package name */
    private String f28650b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f28651c = this.f28649a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.f28650b}), 0);

    /* renamed from: d  reason: collision with root package name */
    private a f28652d = new a("StorageHelpers", new String[0]);

    public y0(Context context, String str) {
        q.k(context);
        this.f28650b = q.g(str);
        this.f28649a = context.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd A[Catch:{ zzxw | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c2 A[Catch:{ zzxw | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x00cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final d7.d c(org.json.JSONObject r14) {
        /*
            r13 = this;
            java.lang.String r0 = "userMultiFactorInfo"
            java.lang.String r1 = "userMetadata"
            r2 = 0
            java.lang.String r3 = "cachedTokenState"
            java.lang.String r3 = r14.getString(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            java.lang.String r4 = "applicationName"
            java.lang.String r4 = r14.getString(r4)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            java.lang.String r5 = "anonymous"
            boolean r5 = r14.getBoolean(r5)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            java.lang.String r6 = "2"
            java.lang.String r7 = "version"
            java.lang.String r7 = r14.getString(r7)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r7 == 0) goto L_0x0022
            r6 = r7
        L_0x0022:
            java.lang.String r7 = "userInfos"
            org.json.JSONArray r7 = r14.getJSONArray(r7)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            int r8 = r7.length()     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r8 != 0) goto L_0x002f
            return r2
        L_0x002f:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r10 = 0
            r11 = 0
        L_0x0036:
            if (r11 >= r8) goto L_0x0046
            java.lang.String r12 = r7.getString(r11)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            d7.y1 r12 = d7.y1.b(r12)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r9.add(r12)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            int r11 = r11 + 1
            goto L_0x0036
        L_0x0046:
            y6.f r4 = y6.f.p(r4)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            d7.d r7 = new d7.d     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r7.<init>(r4, r9)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r4 != 0) goto L_0x005c
            com.google.android.gms.internal.firebase-auth-api.zzafn r3 = com.google.android.gms.internal.p001firebaseauthapi.zzafn.zzb(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r7.m0(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
        L_0x005c:
            if (r5 != 0) goto L_0x0061
            r7.n0()     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
        L_0x0061:
            r7.r0(r6)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            boolean r3 = r14.has(r1)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r3 == 0) goto L_0x0077
            org.json.JSONObject r1 = r14.getJSONObject(r1)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            d7.f r1 = d7.f.a(r1)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r1 == 0) goto L_0x0077
            r7.t0(r1)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
        L_0x0077:
            boolean r1 = r14.has(r0)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r1 == 0) goto L_0x00cc
            org.json.JSONArray r14 = r14.getJSONArray(r0)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r14 == 0) goto L_0x00cc
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r0.<init>()     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r1 = 0
        L_0x0089:
            int r3 = r14.length()     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r1 >= r3) goto L_0x00c9
            java.lang.String r3 = r14.getString(r1)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            java.lang.String r3 = "factorIdKey"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            java.lang.String r5 = "phone"
            boolean r5 = r5.equals(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r5 == 0) goto L_0x00ab
            com.google.firebase.auth.t0 r3 = com.google.firebase.auth.t0.y(r4)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            goto L_0x00c3
        L_0x00ab:
            java.lang.String r5 = "totp"
            if (r3 == r5) goto L_0x00ba
            if (r3 == 0) goto L_0x00b8
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            if (r3 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r3 = 0
            goto L_0x00bb
        L_0x00ba:
            r3 = 1
        L_0x00bb:
            if (r3 == 0) goto L_0x00c2
            com.google.firebase.auth.y0 r3 = com.google.firebase.auth.y0.y(r4)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            goto L_0x00c3
        L_0x00c2:
            r3 = r2
        L_0x00c3:
            r0.add(r3)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
            int r1 = r1 + 1
            goto L_0x0089
        L_0x00c9:
            r7.o0(r0)     // Catch:{ JSONException -> 0x00d3, ArrayIndexOutOfBoundsException -> 0x00d1, IllegalArgumentException -> 0x00cf, zzxw -> 0x00cd }
        L_0x00cc:
            return r7
        L_0x00cd:
            r14 = move-exception
            goto L_0x00d4
        L_0x00cf:
            r14 = move-exception
            goto L_0x00d4
        L_0x00d1:
            r14 = move-exception
            goto L_0x00d4
        L_0x00d3:
            r14 = move-exception
        L_0x00d4:
            k5.a r0 = r13.f28652d
            r0.j(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.y0.c(org.json.JSONObject):d7.d");
    }

    private final String g(a0 a0Var) {
        JSONObject jSONObject = new JSONObject();
        if (!d.class.isAssignableFrom(a0Var.getClass())) {
            return null;
        }
        d dVar = (d) a0Var;
        try {
            jSONObject.put("cachedTokenState", dVar.zze());
            jSONObject.put("applicationName", dVar.l0().q());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (dVar.x0() != null) {
                JSONArray jSONArray = new JSONArray();
                List<y1> x02 = dVar.x0();
                int size = x02.size();
                if (x02.size() > 30) {
                    this.f28652d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(x02.size()));
                    size = 30;
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    y1 y1Var = x02.get(i10);
                    if (y1Var.D().equals("firebase")) {
                        z10 = true;
                    }
                    if (i10 == size - 1 && !z10) {
                        break;
                    }
                    jSONArray.put(y1Var.zzb());
                }
                if (!z10) {
                    int i11 = size - 1;
                    while (true) {
                        if (i11 >= x02.size() || i11 < 0) {
                            break;
                        }
                        y1 y1Var2 = x02.get(i11);
                        if (y1Var2.D().equals("firebase")) {
                            jSONArray.put(y1Var2.zzb());
                            z10 = true;
                            break;
                        }
                        if (i11 == x02.size() - 1) {
                            jSONArray.put(y1Var2.zzb());
                        }
                        i11++;
                    }
                    if (!z10) {
                        this.f28652d.h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(x02.size()), Integer.valueOf(size));
                        if (x02.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            for (y1 D : x02) {
                                sb2.append(String.format("Provider - %s\n", new Object[]{D.D()}));
                            }
                            this.f28652d.h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", dVar.C());
            jSONObject.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
            if (dVar.x() != null) {
                jSONObject.put("userMetadata", ((f) dVar.x()).c());
            }
            List<j0> b10 = ((h) dVar.y()).b();
            if (b10 != null && !b10.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < b10.size(); i12++) {
                    jSONArray2.put(b10.get(i12).x());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f28652d.i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzxw(e10);
        }
    }

    public final zzafn a(a0 a0Var) {
        q.k(a0Var);
        String string = this.f28651c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{a0Var.c()}), (String) null);
        if (string != null) {
            return zzafn.zzb(string);
        }
        return null;
    }

    public final a0 b() {
        String string = this.f28651c.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return c(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void d(a0 a0Var, zzafn zzafn) {
        q.k(a0Var);
        q.k(zzafn);
        this.f28651c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{a0Var.c()}), zzafn.zzf()).apply();
    }

    public final void e(String str) {
        this.f28651c.edit().remove(str).apply();
    }

    public final void f(a0 a0Var) {
        q.k(a0Var);
        String g10 = g(a0Var);
        if (!TextUtils.isEmpty(g10)) {
            this.f28651c.edit().putString("com.google.firebase.auth.FIREBASE_USER", g10).apply();
        }
    }
}
