package d7;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import com.google.android.gms.internal.p001firebaseauthapi.zzap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.i;
import i5.e;
import m5.h;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class m0 {

    /* renamed from: d  reason: collision with root package name */
    private static long f28575d = 3600000;

    /* renamed from: e  reason: collision with root package name */
    private static final zzap<String> f28576e = zzap.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: f  reason: collision with root package name */
    private static final m0 f28577f = new m0();

    /* renamed from: a  reason: collision with root package name */
    private Task<i> f28578a;

    /* renamed from: b  reason: collision with root package name */
    private Task<String> f28579b;

    /* renamed from: c  reason: collision with root package name */
    private long f28580c = 0;

    private m0() {
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.w());
        edit.putString("statusMessage", status.x());
        edit.putLong("timestamp", h.d().a());
        edit.commit();
    }

    public static void c(Context context, zzagt zzagt, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", e.f(zzagt));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", h.d().a());
        edit.commit();
    }

    public static void d(Context context, FirebaseAuth firebaseAuth) {
        q.k(context);
        q.k(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.l().q());
        edit.commit();
    }

    public static void e(Context context, FirebaseAuth firebaseAuth, a0 a0Var) {
        q.k(context);
        q.k(firebaseAuth);
        q.k(a0Var);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.l().q());
        edit.putString("firebaseUserUid", a0Var.c());
        edit.commit();
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong("timestamp", h.d().a());
        edit.commit();
    }

    private static void g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzap<String> zzap = f28576e;
        int size = zzap.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzap.get(i10);
            i10++;
            edit.remove(str);
        }
        edit.commit();
    }

    public static m0 j() {
        return f28577f;
    }

    public final void a(Context context) {
        q.k(context);
        g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f28578a = null;
        this.f28580c = 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.q.k(r12)
            y6.f r0 = r12.l()
            android.content.Context r0 = r0.m()
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)
            y6.f r4 = r12.l()
            java.lang.String r4 = r4.q()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r1)
            java.lang.String r5 = "operation"
            r6 = 0
            java.lang.String r8 = "timestamp"
            r9 = 0
            if (r4 == 0) goto L_0x00e2
            java.lang.String r1 = r0.getString(r1, r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzagt> r4 = com.google.android.gms.internal.p001firebaseauthapi.zzagt.CREATOR
            i5.d r1 = i5.e.c(r1, r4)
            com.google.android.gms.internal.firebase-auth-api.zzagt r1 = (com.google.android.gms.internal.p001firebaseauthapi.zzagt) r1
            java.lang.String r4 = r0.getString(r5, r3)
            java.lang.String r5 = "tenantId"
            java.lang.String r5 = r0.getString(r5, r9)
            java.lang.String r10 = "firebaseUserUid"
            java.lang.String r3 = r0.getString(r10, r3)
            long r6 = r0.getLong(r8, r6)
            r11.f28580c = r6
            if (r5 == 0) goto L_0x0062
            r12.y(r5)
            r1.zzb((java.lang.String) r5)
        L_0x0062:
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -98509410: goto L_0x0085;
                case 175006864: goto L_0x007a;
                case 1450464913: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            r2 = -1
            goto L_0x008e
        L_0x006f:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0078
            goto L_0x006d
        L_0x0078:
            r2 = 2
            goto L_0x008e
        L_0x007a:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0083
            goto L_0x006d
        L_0x0083:
            r2 = 1
            goto L_0x008e
        L_0x0085:
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x008e
            goto L_0x006d
        L_0x008e:
            switch(r2) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x009f;
                case 2: goto L_0x0094;
                default: goto L_0x0091;
            }
        L_0x0091:
            r11.f28578a = r9
            goto L_0x00de
        L_0x0094:
            com.google.firebase.auth.d2 r1 = com.google.firebase.auth.d2.I(r1)
            com.google.android.gms.tasks.Task r12 = r12.A(r1)
            r11.f28578a = r12
            goto L_0x00de
        L_0x009f:
            com.google.firebase.auth.a0 r2 = r12.m()
            java.lang.String r2 = r2.c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00bc
            com.google.firebase.auth.a0 r2 = r12.m()
            com.google.firebase.auth.d2 r1 = com.google.firebase.auth.d2.I(r1)
            com.google.android.gms.tasks.Task r12 = r12.O(r2, r1)
            r11.f28578a = r12
            goto L_0x00de
        L_0x00bc:
            r11.f28578a = r9
            goto L_0x00de
        L_0x00bf:
            com.google.firebase.auth.a0 r2 = r12.m()
            java.lang.String r2 = r2.c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00dc
            com.google.firebase.auth.a0 r2 = r12.m()
            com.google.firebase.auth.d2 r1 = com.google.firebase.auth.d2.I(r1)
            com.google.android.gms.tasks.Task r12 = r12.v0(r2, r1)
            r11.f28578a = r12
            goto L_0x00de
        L_0x00dc:
            r11.f28578a = r9
        L_0x00de:
            g(r0)
            return
        L_0x00e2:
            java.lang.String r12 = "recaptchaToken"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x0110
            java.lang.String r12 = r0.getString(r12, r3)
            java.lang.String r1 = r0.getString(r5, r3)
            long r2 = r0.getLong(r8, r6)
            r11.f28580c = r2
            r1.hashCode()
            java.lang.String r2 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0106
            r11.f28579b = r9
            goto L_0x010c
        L_0x0106:
            com.google.android.gms.tasks.Task r12 = com.google.android.gms.tasks.Tasks.forResult(r12)
            r11.f28579b = r12
        L_0x010c:
            g(r0)
            return
        L_0x0110:
            java.lang.String r12 = "statusCode"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x013c
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r12 = r0.getInt(r12, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>((int) r12, (java.lang.String) r1)
            long r3 = r0.getLong(r8, r6)
            r11.f28580c = r3
            g(r0)
            y6.l r12 = com.google.android.gms.internal.p001firebaseauthapi.zzacf.zza((com.google.android.gms.common.api.Status) r2)
            com.google.android.gms.tasks.Task r12 = com.google.android.gms.tasks.Tasks.forException(r12)
            r11.f28578a = r12
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.m0.h(com.google.firebase.auth.FirebaseAuth):void");
    }

    public final Task<String> i() {
        if (h.d().a() - this.f28580c < f28575d) {
            return this.f28579b;
        }
        return null;
    }
}
