package d7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    private static p1 f28602a = new p1();

    private p1() {
    }

    private static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }

    public static p1 c() {
        return f28602a;
    }

    private static void f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized d7.o1 b(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.common.internal.q.g(r12)     // Catch:{ all -> 0x006f }
            com.google.android.gms.common.internal.q.g(r13)     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences r11 = a(r11, r12)     // Catch:{ all -> 0x006f }
            java.lang.String r12 = "com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006f }
            r2 = 0
            r1[r2] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r12 = java.lang.String.format(r12, r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x006f }
            r3[r2] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x006f }
            r4[r2] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x006f }
            r0[r2] = r13     // Catch:{ all -> 0x006f }
            java.lang.String r13 = java.lang.String.format(r4, r0)     // Catch:{ all -> 0x006f }
            r0 = 0
            java.lang.String r5 = r11.getString(r12, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = r11.getString(r1, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r7 = r11.getString(r3, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "com.google.firebase.auth.api.gms.config.tenant.id"
            java.lang.String r8 = r11.getString(r2, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r9 = r11.getString(r13, r0)     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x006f }
            r11.remove(r12)     // Catch:{ all -> 0x006f }
            r11.remove(r1)     // Catch:{ all -> 0x006f }
            r11.remove(r3)     // Catch:{ all -> 0x006f }
            r11.remove(r13)     // Catch:{ all -> 0x006f }
            r11.apply()     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x006d
            if (r6 == 0) goto L_0x006d
            if (r7 == 0) goto L_0x006d
            d7.o1 r11 = new d7.o1     // Catch:{ all -> 0x006f }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006f }
            monitor-exit(r10)
            return r11
        L_0x006d:
            monitor-exit(r10)
            return r0
        L_0x006f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.p1.b(android.content.Context, java.lang.String, java.lang.String):d7.o1");
    }

    public final synchronized void d(Context context, String str, String str2, String str3, String str4) {
        q.g(str);
        q.g(str2);
        SharedPreferences a10 = a(context, str);
        f(a10);
        SharedPreferences.Editor edit = a10.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2}), str4);
        edit.apply();
    }

    public final synchronized void e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        q.g(str);
        q.g(str2);
        q.g(str3);
        q.g(str7);
        SharedPreferences a10 = a(context, str);
        f(a10);
        SharedPreferences.Editor edit = a10.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{str2}), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{str2}), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2}), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    public final synchronized String g(Context context, String str, String str2) {
        q.g(str);
        q.g(str2);
        SharedPreferences a10 = a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2});
        String string = a10.getString(format, (String) null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2});
        String string2 = a10.getString(format2, (String) null);
        SharedPreferences.Editor edit = a10.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
