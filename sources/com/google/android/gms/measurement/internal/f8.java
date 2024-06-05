package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class f8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b7 f24585a;

    f8(b7 b7Var) {
        this.f24585a = b7Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5 A[SYNTHETIC, Splitter:B:45:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0143 A[Catch:{ RuntimeException -> 0x01d1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144 A[Catch:{ RuntimeException -> 0x01d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.f8 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.b7 r3 = r1.f24585a
            r3.i()
            com.google.android.gms.measurement.internal.b7 r3 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.ib r3 = r3.f()     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r4 = com.google.android.gms.internal.measurement.zzpy.zza()     // Catch:{ RuntimeException -> 0x01d1 }
            r6 = 1
            if (r4 == 0) goto L_0x0028
            com.google.android.gms.measurement.internal.b7 r4 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.f r4 = r4.a()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.E0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r4 = r4.n(r7)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r4 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            boolean r7 = com.google.android.gms.internal.measurement.zzoi.zza()     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 == 0) goto L_0x003f
            com.google.android.gms.measurement.internal.b7 r7 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.f r7 = r7.a()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.e0.Z0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r7 = r7.n(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            boolean r8 = android.text.TextUtils.isEmpty(r21)     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_medium"
            java.lang.String r12 = "utm_source"
            java.lang.String r13 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r8 == 0) goto L_0x0054
        L_0x0052:
            r3 = 0
            goto L_0x00c1
        L_0x0054:
            boolean r8 = r2.contains(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x0064
            java.lang.String r8 = "gbraid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
        L_0x0064:
            boolean r8 = r2.contains(r13)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "utm_id"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "dclid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "srsltid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            if (r4 == 0) goto L_0x0098
            java.lang.String r8 = "sfmc_id"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
        L_0x0098:
            com.google.android.gms.measurement.internal.n4 r3 = r3.zzj()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.A()     // Catch:{ RuntimeException -> 0x01d1 }
            r3.a(r9)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x0052
        L_0x00a4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r14 = "https://google.com/search?"
            r8.<init>(r14)     // Catch:{ RuntimeException -> 0x01d1 }
            r8.append(r2)     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r8 = r8.toString()     // Catch:{ RuntimeException -> 0x01d1 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            android.os.Bundle r3 = r3.x(r8, r4, r7)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r4 = "referrer"
            r3.putString(r10, r4)     // Catch:{ RuntimeException -> 0x01d1 }
        L_0x00c1:
            java.lang.String r4 = "_cmp"
            if (r18 == 0) goto L_0x013b
            com.google.android.gms.measurement.internal.b7 r7 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.ib r7 = r7.f()     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r8 = com.google.android.gms.internal.measurement.zzpy.zza()     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.b7 r8 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.f r8 = r8.a()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.e0.E0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r8 = r8.n(r14)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 == 0) goto L_0x00e1
            r8 = 1
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            boolean r14 = com.google.android.gms.internal.measurement.zzoi.zza()     // Catch:{ RuntimeException -> 0x01d1 }
            if (r14 == 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.b7 r14 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.f r14 = r14.a()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.e0.Z0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r5 = r14.n(r5)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r5 == 0) goto L_0x00fa
            r5 = r19
            r14 = 1
            goto L_0x00fd
        L_0x00fa:
            r5 = r19
            r14 = 0
        L_0x00fd:
            android.os.Bundle r5 = r7.x(r5, r8, r14)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r5 == 0) goto L_0x013b
            java.lang.String r7 = "intent"
            r5.putString(r10, r7)     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r7 = r5.containsKey(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 != 0) goto L_0x012c
            if (r3 == 0) goto L_0x012c
            boolean r7 = r3.containsKey(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 == 0) goto L_0x012c
            java.lang.String r7 = "_cer"
            java.lang.String r8 = "gclid=%s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r14 = r3.getString(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            r16 = 0
            r10[r16] = r14     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch:{ RuntimeException -> 0x01d1 }
            r5.putString(r7, r8)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x012e
        L_0x012c:
            r16 = 0
        L_0x012e:
            com.google.android.gms.measurement.internal.b7 r7 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            r7.u0(r0, r4, r5)     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.b7 r7 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.qb r7 = r7.f24399n     // Catch:{ RuntimeException -> 0x01d1 }
            r7.b(r0, r5)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x013d
        L_0x013b:
            r16 = 0
        L_0x013d:
            boolean r5 = android.text.TextUtils.isEmpty(r21)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r5 == 0) goto L_0x0144
            return
        L_0x0144:
            com.google.android.gms.measurement.internal.b7 r5 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.n4 r5 = r5.zzj()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.A()     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r7 = "Activity created with referrer"
            r5.b(r7, r2)     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.b7 r5 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.f r5 = r5.a()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.f24515l0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r5 = r5.n(r7)     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r7 = "_ldl"
            java.lang.String r8 = "auto"
            if (r5 == 0) goto L_0x018a
            if (r3 == 0) goto L_0x0174
            com.google.android.gms.measurement.internal.b7 r2 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            r2.u0(r0, r4, r3)     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.b7 r2 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.qb r2 = r2.f24399n     // Catch:{ RuntimeException -> 0x01d1 }
            r2.b(r0, r3)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x0183
        L_0x0174:
            com.google.android.gms.measurement.internal.b7 r0 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.A()     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.b(r3, r2)     // Catch:{ RuntimeException -> 0x01d1 }
        L_0x0183:
            com.google.android.gms.measurement.internal.b7 r0 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            r2 = 0
            r0.U(r8, r7, r2, r6)     // Catch:{ RuntimeException -> 0x01d1 }
            return
        L_0x018a:
            boolean r0 = r2.contains(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r2.contains(r13)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 == 0) goto L_0x01b4
        L_0x01b2:
            r5 = 1
            goto L_0x01b5
        L_0x01b4:
            r5 = 0
        L_0x01b5:
            if (r5 != 0) goto L_0x01c5
            com.google.android.gms.measurement.internal.b7 r0 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.A()     // Catch:{ RuntimeException -> 0x01d1 }
            r0.a(r9)     // Catch:{ RuntimeException -> 0x01d1 }
            return
        L_0x01c5:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.b7 r0 = r1.f24585a     // Catch:{ RuntimeException -> 0x01d1 }
            r0.U(r8, r7, r2, r6)     // Catch:{ RuntimeException -> 0x01d1 }
        L_0x01d0:
            return
        L_0x01d1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b7 r1 = r1.f24585a
            com.google.android.gms.measurement.internal.n4 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f8.a(com.google.android.gms.measurement.internal.f8, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f24585a.zzj().F().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null) {
                    if (uri.isHierarchical()) {
                        this.f24585a.f();
                        this.f24585a.zzl().y(new i8(this, bundle == null, uri, ib.Z(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                        this.f24585a.n().A(activity, bundle);
                        return;
                    }
                }
                this.f24585a.n().A(activity, bundle);
            }
        } catch (RuntimeException e10) {
            this.f24585a.zzj().B().b("Throwable caught in onActivityCreated", e10);
        } finally {
            this.f24585a.n().A(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f24585a.n().z(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f24585a.n().L(activity);
        da p10 = this.f24585a.p();
        p10.zzl().y(new ea(p10, p10.zzb().b()));
    }

    public final void onActivityResumed(Activity activity) {
        da p10 = this.f24585a.p();
        p10.zzl().y(new ga(p10, p10.zzb().b()));
        this.f24585a.n().N(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f24585a.n().M(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
