package e8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import y6.f;

/* compiled from: IidStore */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f28815c = {"*", "FCM", "GCM", MaxReward.DEFAULT_LABEL};

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f28816a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28817b;

    public b(f fVar) {
        this.f28816a = fVar.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f28817b = b(fVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(f fVar) {
        String f10 = fVar.r().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = fVar.r().c();
        if (!c10.startsWith("1:") && !c10.startsWith("2:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & Ascii.SI) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f28816a) {
            string = this.f28816a.getString("|S|id", (String) null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f28816a) {
            String string = this.f28816a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e10 = e(string);
            if (e10 == null) {
                return null;
            }
            String c10 = c(e10);
            return c10;
        }
    }

    public String f() {
        synchronized (this.f28816a) {
            String g10 = g();
            if (g10 != null) {
                return g10;
            }
            String h10 = h();
            return h10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f28816a
            monitor-enter(r0)
            java.lang.String[] r1 = f28815c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f28817b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f28816a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.b.i():java.lang.String");
    }
}
