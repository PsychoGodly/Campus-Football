package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzepu implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzepu(zzfuu zzfuu, Context context) {
        this.zza = zzfuu;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    public final int zza() {
        return 38;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzept(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0 A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeps zzc() throws java.lang.Exception {
        /*
            r22 = this;
            r0 = r22
            android.content.Context r1 = r0.zzb
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r3 = zzd(r1, r3)
            java.lang.String r4 = "http://www.google.com"
            android.content.pm.ResolveInfo r4 = zzd(r1, r4)
            java.lang.String r8 = r2.getCountry()
            com.google.android.gms.ads.internal.t.r()
            com.google.android.gms.ads.internal.client.x.b()
            boolean r9 = com.google.android.gms.internal.ads.zzbyt.zzs()
            android.content.Context r5 = r0.zzb
            boolean r10 = m5.i.c(r5)
            android.content.Context r5 = r0.zzb
            boolean r11 = m5.i.d(r5)
            java.lang.String r12 = r2.getLanguage()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r6 = 24
            if (r2 < r6) goto L_0x005b
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r6 = 0
        L_0x0047:
            int r7 = r2.size()
            if (r6 >= r7) goto L_0x005b
            java.util.Locale r7 = r2.get(r6)
            java.lang.String r7 = r7.getLanguage()
            r13.add(r7)
            int r6 = r6 + 1
            goto L_0x0047
        L_0x005b:
            android.content.Context r2 = r0.zzb
            java.lang.String r6 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r6 = zzd(r1, r6)
            java.lang.String r7 = "."
            if (r6 != 0) goto L_0x0069
        L_0x0067:
            r2 = 0
            goto L_0x0090
        L_0x0069:
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            if (r6 != 0) goto L_0x006e
            goto L_0x0067
        L_0x006e:
            o5.b r2 = o5.c.a(r2)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r15 = r6.packageName     // Catch:{ NameNotFoundException -> 0x0067 }
            android.content.pm.PackageInfo r2 = r2.f(r15, r5)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r2 == 0) goto L_0x0067
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r6 = r6.packageName     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0067 }
            r15.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            r15.append(r2)     // Catch:{ NameNotFoundException -> 0x0067 }
            r15.append(r7)     // Catch:{ NameNotFoundException -> 0x0067 }
            r15.append(r6)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r2 = r15.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
        L_0x0090:
            android.content.Context r6 = r0.zzb
            o5.b r6 = o5.c.a(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r15 = "com.android.vending"
            r14 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r6 = r6.f(r15, r14)     // Catch:{ Exception -> 0x00b8 }
            if (r6 == 0) goto L_0x00b8
            int r14 = r6.versionCode     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = r6.packageName     // Catch:{ Exception -> 0x00b8 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8 }
            r15.<init>()     // Catch:{ Exception -> 0x00b8 }
            r15.append(r14)     // Catch:{ Exception -> 0x00b8 }
            r15.append(r7)     // Catch:{ Exception -> 0x00b8 }
            r15.append(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = r15.toString()     // Catch:{ Exception -> 0x00b8 }
            r15 = r6
            goto L_0x00b9
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            java.lang.String r16 = android.os.Build.FINGERPRINT
            android.content.Context r6 = r0.zzb
            if (r1 != 0) goto L_0x00c3
            r17 = r15
        L_0x00c1:
            r1 = 0
            goto L_0x010c
        L_0x00c3:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r14 = "http://www.example.com"
            android.net.Uri r14 = android.net.Uri.parse(r14)
            r17 = r15
            java.lang.String r15 = "android.intent.action.VIEW"
            r7.<init>(r15, r14)
            android.content.pm.ResolveInfo r14 = r1.resolveActivity(r7, r5)
            r15 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r1.queryIntentActivities(r7, r15)
            if (r1 == 0) goto L_0x00c1
            if (r14 == 0) goto L_0x00c1
            r7 = 0
        L_0x00e1:
            int r15 = r1.size()
            if (r7 >= r15) goto L_0x00c1
            java.lang.Object r15 = r1.get(r7)
            android.content.pm.ResolveInfo r15 = (android.content.pm.ResolveInfo) r15
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            java.lang.String r5 = r5.name
            android.content.pm.ActivityInfo r15 = r15.activityInfo
            java.lang.String r15 = r15.name
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x0108
            android.content.pm.ActivityInfo r1 = r14.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r5 = com.google.android.gms.internal.ads.zzgxm.zza(r6)
            boolean r1 = r1.equals(r5)
            goto L_0x010c
        L_0x0108:
            int r7 = r7 + 1
            r5 = 0
            goto L_0x00e1
        L_0x010c:
            com.google.android.gms.ads.internal.t.r()
            android.os.StatFs r5 = new android.os.StatFs
            java.io.File r6 = android.os.Environment.getDataDirectory()
            java.lang.String r6 = r6.getAbsolutePath()
            r5.<init>(r6)
            long r5 = r5.getAvailableBytes()
            r14 = 1024(0x400, double:5.06E-321)
            long r19 = r5 / r14
            com.google.android.gms.internal.ads.zzbaj r5 = com.google.android.gms.internal.ads.zzbar.zzjB
            com.google.android.gms.internal.ads.zzbap r6 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 1
            if (r5 == 0) goto L_0x0145
            com.google.android.gms.ads.internal.t.r()
            android.content.Context r5 = r0.zzb
            boolean r5 = com.google.android.gms.ads.internal.util.b2.W(r5)
            if (r5 == 0) goto L_0x0145
            r21 = 1
            goto L_0x0147
        L_0x0145:
            r21 = 0
        L_0x0147:
            if (r4 == 0) goto L_0x014b
            r7 = 1
            goto L_0x014c
        L_0x014b:
            r7 = 0
        L_0x014c:
            if (r3 == 0) goto L_0x014f
            goto L_0x0150
        L_0x014f:
            r6 = 0
        L_0x0150:
            com.google.android.gms.internal.ads.zzeps r3 = new com.google.android.gms.internal.ads.zzeps
            r5 = r3
            java.lang.String r18 = android.os.Build.MODEL
            r14 = r2
            r15 = r17
            r17 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepu.zzc():com.google.android.gms.internal.ads.zzeps");
    }
}
