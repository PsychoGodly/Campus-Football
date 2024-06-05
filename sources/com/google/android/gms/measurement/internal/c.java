package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzew;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
abstract class c {

    /* renamed from: a  reason: collision with root package name */
    String f24415a;

    /* renamed from: b  reason: collision with root package name */
    int f24416b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f24417c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f24418d;

    /* renamed from: e  reason: collision with root package name */
    Long f24419e;

    /* renamed from: f  reason: collision with root package name */
    Long f24420f;

    c(String str, int i10) {
        this.f24415a = str;
        this.f24416b = i10;
    }

    static Boolean b(double d10, zzew.zzd zzd) {
        try {
            return h(new BigDecimal(d10), zzd, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j10, zzew.zzd zzd) {
        try {
            return h(new BigDecimal(j10), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    static Boolean e(String str, zzew.zzd zzd) {
        if (!db.a0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, zzew.zzf.zza zza, boolean z10, String str2, List<String> list, String str3, n4 n4Var) {
        if (str == null) {
            return null;
        }
        if (zza == zzew.zzf.zza.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && zza != zzew.zzf.zza.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (sb.f25059a[zza.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z10 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (n4Var != null) {
                        n4Var.G().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean g(String str, zzew.zzf zzf, n4 n4Var) {
        String str2;
        List<String> list;
        q.k(zzf);
        if (str == null || !zzf.zzj() || zzf.zzb() == zzew.zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzew.zzf.zza zzb = zzf.zzb();
        zzew.zzf.zza zza = zzew.zzf.zza.IN_LIST;
        if (zzb == zza) {
            if (zzf.zza() == 0) {
                return null;
            }
        } else if (!zzf.zzi()) {
            return null;
        }
        zzew.zzf.zza zzb2 = zzf.zzb();
        boolean zzg = zzf.zzg();
        if (zzg || zzb2 == zzew.zzf.zza.REGEXP || zzb2 == zza) {
            str2 = zzf.zze();
        } else {
            str2 = zzf.zze().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (zzf.zza() == 0) {
            list = null;
        } else {
            List<String> zzf2 = zzf.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf2.size());
                for (String upperCase : zzf2) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                zzf2 = Collections.unmodifiableList(arrayList);
            }
            list = zzf2;
        }
        return f(str, zzb2, zzg, str3, list, zzb2 == zzew.zzf.zza.REGEXP ? str3 : null, n4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r3 != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzew.zzd r9, double r10) {
        /*
            com.google.android.gms.common.internal.q.k(r9)
            boolean r0 = r9.zzh()
            r1 = 0
            if (r0 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.zzew$zzd$zzb r0 = r9.zza()
            com.google.android.gms.internal.measurement.zzew$zzd$zzb r2 = com.google.android.gms.internal.measurement.zzew.zzd.zzb.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0114
        L_0x0014:
            com.google.android.gms.internal.measurement.zzew$zzd$zzb r0 = r9.zza()
            com.google.android.gms.internal.measurement.zzew$zzd$zzb r2 = com.google.android.gms.internal.measurement.zzew.zzd.zzb.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r9.zzl()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r9.zzk()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r9.zzi()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.zzew$zzd$zzb r0 = r9.zza()
            com.google.android.gms.internal.measurement.zzew$zzd$zzb r3 = r9.zza()
            if (r3 != r2) goto L_0x0065
            java.lang.String r3 = r9.zzf()
            boolean r3 = com.google.android.gms.measurement.internal.db.a0(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r9.zze()
            boolean r3 = com.google.android.gms.measurement.internal.db.a0(r3)
            if (r3 != 0) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r4 = r9.zzf()     // Catch:{ NumberFormatException -> 0x0064 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r9 = r9.zze()     // Catch:{ NumberFormatException -> 0x0064 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0064 }
            r9 = r3
            r3 = r1
            goto L_0x007b
        L_0x0064:
            return r1
        L_0x0065:
            java.lang.String r3 = r9.zzd()
            boolean r3 = com.google.android.gms.measurement.internal.db.a0(r3)
            if (r3 != 0) goto L_0x0070
            return r1
        L_0x0070:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r9 = r9.zzd()     // Catch:{ NumberFormatException -> 0x0114 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0114 }
            r9 = r1
            r4 = r9
        L_0x007b:
            if (r0 != r2) goto L_0x0080
            if (r9 != 0) goto L_0x0082
            return r1
        L_0x0080:
            if (r3 == 0) goto L_0x0114
        L_0x0082:
            int[] r2 = com.google.android.gms.measurement.internal.sb.f25060b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0106
            r6 = 2
            if (r0 == r6) goto L_0x00f8
            r7 = 3
            if (r0 == r7) goto L_0x00ae
            r10 = 4
            if (r0 == r10) goto L_0x0099
            goto L_0x0114
        L_0x0099:
            if (r9 != 0) goto L_0x009c
            return r1
        L_0x009c:
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a9
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ae:
            if (r3 == 0) goto L_0x0114
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00ec
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e7
            r2 = 1
        L_0x00e7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ec:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00f3
            r2 = 1
        L_0x00f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f8:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x0101
            r2 = 1
        L_0x0101:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0106:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010f
            r2 = 1
        L_0x010f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzew$zzd, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
