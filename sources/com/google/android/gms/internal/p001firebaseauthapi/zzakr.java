package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzakr<T> implements zzalf<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamk.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzakn zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzaky zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzakv zzo;
    private final zzajs zzp;
    private final zzame<?, ?> zzq;
    private final zzaiq<?> zzr;
    private final zzakg zzs;

    private zzakr(int[] iArr, Object[] objArr, int i10, int i11, zzakn zzakn, zzaky zzaky, boolean z10, int[] iArr2, int i12, int i13, zzakv zzakv, zzajs zzajs, zzame<?, ?> zzame, zzaiq<?> zzaiq, zzakg zzakg) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzakn instanceof zzajc;
        this.zzj = zzaky;
        this.zzh = zzaiq != null && zzaiq.zza(zzakn);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i12;
        this.zzn = i13;
        this.zzo = zzakv;
        this.zzp = zzajs;
        this.zzq = zzame;
        this.zzr = zzaiq;
        this.zzg = zzakn;
        this.zzs = zzakg;
    }

    private static <T> double zza(T t10, long j10) {
        return ((Double) zzamk.zze(t10, j10)).doubleValue();
    }

    private static <T> float zzb(T t10, long j10) {
        return ((Float) zzamk.zze(t10, j10)).floatValue();
    }

    private static <T> int zzc(T t10, long j10) {
        return ((Integer) zzamk.zze(t10, j10)).intValue();
    }

    private static <T> long zzd(T t10, long j10) {
        return ((Long) zzamk.zze(t10, j10)).longValue();
    }

    private final zzalf zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzalf zzalf = (zzalf) this.zzd[i11];
        if (zzalf != null) {
            return zzalf;
        }
        zzalf zza2 = zzalb.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzajc) {
            return ((zzajc) obj).zzu();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.p001firebaseauthapi.zzamr r4, java.lang.Class<?> r5, com.google.android.gms.internal.p001firebaseauthapi.zzahk r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.p001firebaseauthapi.zzakq.zza
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r1, r2, r6)
            long r2 = r6.zzb
            long r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((long) r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzc = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r1, r2, r6)
            int r2 = r6.zza
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((int) r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzc = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.firebase-auth-api.zzalb r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalb.zza()
            com.google.android.gms.internal.firebase-auth-api.zzalf r4 = r4.zza(r5)
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalf) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r1, r2, r6)
            long r2 = r6.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzc = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r1, r2, r6)
            int r2 = r6.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzc = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.zzc = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.zzc = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.zzc = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.zzc = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r1, r2, r6)
            long r2 = r6.zzb
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.zzc = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zza(byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzamr, java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzahk):int");
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzajg zzd(int i10) {
        return (zzajg) this.zzd[((i10 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            String valueOf = String.valueOf(obj);
            throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.zzc((int) r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzc(r9, (long) r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzc(r9, (long) r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzc(r9, (long) r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzc(r9, (long) r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = zze(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzc(r9, (long) r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzc(r9, (long) r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = zzb(r9, (long) r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.zzc(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = zza(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza((long) r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r8.zzq
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r8.zzr
            com.google.android.gms.internal.firebase-auth-api.zzaiv r9 = r0.zza((java.lang.Object) r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zzb(java.lang.Object):int");
    }

    public final void zzc(T t10) {
        if (zzg((Object) t10)) {
            if (t10 instanceof zzajc) {
                zzajc zzajc = (zzajc) t10;
                zzajc.zzb(a.e.API_PRIORITY_OTHER);
                zzajc.zza = 0;
                zzajc.zzt();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzc2 = zzc(i10);
                long j10 = (long) (1048575 & zzc2);
                int i11 = (zzc2 & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzc(t10, this.zzc[i10], i10)) {
                            zze(i10).zzc(zzb.getObject(t10, j10));
                        }
                    } else {
                        switch (i11) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzp.zzb(t10, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t10, j10);
                                if (object != null) {
                                    unsafe.putObject(t10, j10, this.zzs.zzc(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (zzc(t10, i10)) {
                    zze(i10).zzc(zzb.getObject(t10, j10));
                }
            }
            this.zzq.zzf(t10);
            if (this.zzh) {
                this.zzr.zzc(t10);
            }
        }
    }

    public final boolean zzd(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.zzm) {
                return !this.zzh || this.zzr.zza((Object) t11).zzg();
            }
            int i15 = this.zzl[i14];
            int i16 = this.zzc[i15];
            int zzc2 = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t11, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (((268435456 & zzc2) != 0) && !zza(t10, i15, i11, i10, i19)) {
                return false;
            }
            int i20 = (267386880 & zzc2) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc(t11, i16, i15) && !zza((Object) t11, zzc2, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd2 = this.zzs.zzd(zzamk.zze(t11, (long) (zzc2 & 1048575)));
                            if (!zzd2.isEmpty()) {
                                if (this.zzs.zza(zzf(i15)).zzc.zzb() == zzanb.MESSAGE) {
                                    zzalf<?> zzalf = null;
                                    Iterator<?> it = zzd2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzalf == null) {
                                            zzalf = zzalb.zza().zza(next.getClass());
                                        }
                                        if (!zzalf.zzd(next)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzamk.zze(t11, (long) (zzc2 & 1048575));
                if (!list.isEmpty()) {
                    zzalf zze2 = zze(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        } else if (!zze2.zzd(list.get(i21))) {
                            z10 = false;
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (zza(t10, i15, i11, i10, i19) && !zza((Object) t11, zzc2, zze(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
    }

    private static zzamd zze(Object obj) {
        zzajc zzajc = (zzajc) obj;
        zzamd zzamd = zzajc.zzb;
        if (zzamd != zzamd.zzc()) {
            return zzamd;
        }
        zzamd zzd2 = zzamd.zzd();
        zzajc.zzb = zzd2;
        return zzd2;
    }

    private static <T> boolean zze(T t10, long j10) {
        return ((Boolean) zzamk.zze(t10, j10)).booleanValue();
    }

    private final boolean zzc(T t10, T t11, int i10) {
        return zzc(t10, i10) == zzc(t11, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02cf, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x041c, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0582, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r9 = 1048575;
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            sun.misc.Unsafe r8 = zzb
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x0010:
            int[] r2 = r6.zzc
            int r2 = r2.length
            if (r11 >= r2) goto L_0x058d
            int r2 = r6.zzc((int) r11)
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r2
            int r3 = r3 >>> 20
            int[] r4 = r6.zzc
            r13 = r4[r11]
            int r5 = r11 + 2
            r4 = r4[r5]
            r5 = r4 & r9
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0043
            if (r5 == r0) goto L_0x003a
            if (r5 != r9) goto L_0x0033
            r0 = 0
            goto L_0x0038
        L_0x0033:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
        L_0x0038:
            r1 = r0
            r0 = r5
        L_0x003a:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r5 = r4
            goto L_0x0047
        L_0x0043:
            r14 = r0
            r16 = r1
            r5 = 0
        L_0x0047:
            r0 = r2 & r9
            long r1 = (long) r0
            com.google.android.gms.internal.firebase-auth-api.zzaiw r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaiw.DOUBLE_LIST_PACKED
            int r0 = r0.zza()
            if (r3 < r0) goto L_0x0058
            com.google.android.gms.internal.firebase-auth-api.zzaiw r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaiw.SINT64_LIST_PACKED
            int r0 = r0.zza()
        L_0x0058:
            r17 = r5
            r4 = 0
            switch(r3) {
                case 0: goto L_0x0569;
                case 1: goto L_0x0551;
                case 2: goto L_0x0536;
                case 3: goto L_0x051b;
                case 4: goto L_0x04ff;
                case 5: goto L_0x04e7;
                case 6: goto L_0x04d0;
                case 7: goto L_0x04ba;
                case 8: goto L_0x0491;
                case 9: goto L_0x0472;
                case 10: goto L_0x0455;
                case 11: goto L_0x043a;
                case 12: goto L_0x041f;
                case 13: goto L_0x0407;
                case 14: goto L_0x03f1;
                case 15: goto L_0x03d7;
                case 16: goto L_0x03bd;
                case 17: goto L_0x039c;
                case 18: goto L_0x038e;
                case 19: goto L_0x0383;
                case 20: goto L_0x0378;
                case 21: goto L_0x036d;
                case 22: goto L_0x0362;
                case 23: goto L_0x0357;
                case 24: goto L_0x034c;
                case 25: goto L_0x0341;
                case 26: goto L_0x0336;
                case 27: goto L_0x0327;
                case 28: goto L_0x031b;
                case 29: goto L_0x030f;
                case 30: goto L_0x0303;
                case 31: goto L_0x02f7;
                case 32: goto L_0x02eb;
                case 33: goto L_0x02df;
                case 34: goto L_0x02d3;
                case 35: goto L_0x02bb;
                case 36: goto L_0x02a6;
                case 37: goto L_0x0291;
                case 38: goto L_0x027c;
                case 39: goto L_0x0267;
                case 40: goto L_0x0252;
                case 41: goto L_0x023c;
                case 42: goto L_0x0226;
                case 43: goto L_0x0210;
                case 44: goto L_0x01fa;
                case 45: goto L_0x01e4;
                case 46: goto L_0x01ce;
                case 47: goto L_0x01b8;
                case 48: goto L_0x01a2;
                case 49: goto L_0x0192;
                case 50: goto L_0x0182;
                case 51: goto L_0x0174;
                case 52: goto L_0x0167;
                case 53: goto L_0x0157;
                case 54: goto L_0x0147;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x011f;
                case 58: goto L_0x0113;
                case 59: goto L_0x00f5;
                case 60: goto L_0x00e1;
                case 61: goto L_0x00cf;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00af;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0097;
                case 66: goto L_0x0087;
                case 67: goto L_0x0077;
                case 68: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0399
        L_0x0061:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.firebase-auth-api.zzakn r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzakn) r0
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza(r13, r0, r1)
            goto L_0x0398
        L_0x0077:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            long r0 = zzd(r7, r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzd((int) r13, (long) r0)
            goto L_0x0398
        L_0x0087:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = zzc(r7, (long) r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzf((int) r13, (int) r0)
            goto L_0x0398
        L_0x0097:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzc((int) r13, (long) r4)
            goto L_0x0398
        L_0x00a3:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zze((int) r13, (int) r10)
            goto L_0x0398
        L_0x00af:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = zzc(r7, (long) r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzb((int) r13, (int) r0)
            goto L_0x0398
        L_0x00bf:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = zzc(r7, (long) r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzg((int) r13, (int) r0)
            goto L_0x0398
        L_0x00cf:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0)
            goto L_0x0398
        L_0x00e1:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r13, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x0398
        L_0x00f5:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzahp
            if (r1 == 0) goto L_0x010b
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0)
            goto L_0x0398
        L_0x010b:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (java.lang.String) r0)
            goto L_0x0398
        L_0x0113:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (boolean) r15)
            goto L_0x0398
        L_0x011f:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzc((int) r13, (int) r10)
            goto L_0x0398
        L_0x012b:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (long) r4)
            goto L_0x0398
        L_0x0137:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            int r0 = zzc(r7, (long) r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzd((int) r13, (int) r0)
            goto L_0x0398
        L_0x0147:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            long r0 = zzd(r7, r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zze((int) r13, (long) r0)
            goto L_0x0398
        L_0x0157:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            long r0 = zzd(r7, r1)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzb((int) r13, (long) r0)
            goto L_0x0398
        L_0x0167:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            r4 = 0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (float) r4)
            goto L_0x0398
        L_0x0174:
            boolean r0 = r6.zzc(r7, (int) r13, (int) r11)
            if (r0 == 0) goto L_0x0399
            r4 = 0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (double) r4)
            goto L_0x0398
        L_0x0182:
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = r6.zzs
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.zzf((int) r11)
            int r0 = r0.zza(r13, r1, r2)
            goto L_0x0398
        L_0x0192:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r13, (java.util.List<com.google.android.gms.internal.p001firebaseauthapi.zzakn>) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x0398
        L_0x01a2:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzh(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x01b8:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzg(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x01ce:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x01e4:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x01fa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x0210:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzi(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x0226:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.util.List<?>) r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x023c:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x0252:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x0267:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zze(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x027c:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzj(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x0291:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzf(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x02a6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
            goto L_0x02cf
        L_0x02bb:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r0)
            if (r0 <= 0) goto L_0x0399
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzi((int) r13)
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzj((int) r0)
        L_0x02cf:
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x041c
        L_0x02d3:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzh(r13, r0, r10)
            goto L_0x0398
        L_0x02df:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzg(r13, r0, r10)
            goto L_0x0398
        L_0x02eb:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r13, r0, r10)
            goto L_0x0398
        L_0x02f7:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r13, r0, r10)
            goto L_0x0398
        L_0x0303:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r13, (java.util.List<java.lang.Integer>) r0, (boolean) r10)
            goto L_0x0398
        L_0x030f:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzi(r13, r0, r10)
            goto L_0x0398
        L_0x031b:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r13, (java.util.List<com.google.android.gms.internal.p001firebaseauthapi.zzahp>) r0)
            goto L_0x0398
        L_0x0327:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r13, (java.util.List<?>) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x0398
        L_0x0336:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb(r13, r0)
            goto L_0x0398
        L_0x0341:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r13, (java.util.List<?>) r0, (boolean) r10)
            goto L_0x0398
        L_0x034c:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r13, r0, r10)
            goto L_0x0398
        L_0x0357:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r13, r0, r10)
            goto L_0x0398
        L_0x0362:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zze(r13, r0, r10)
            goto L_0x0398
        L_0x036d:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzj(r13, r0, r10)
            goto L_0x0398
        L_0x0378:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzf(r13, r0, r10)
            goto L_0x0398
        L_0x0383:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r13, r0, r10)
            goto L_0x0398
        L_0x038e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r13, r0, r10)
        L_0x0398:
            int r12 = r12 + r0
        L_0x0399:
            r15 = 0
            goto L_0x0582
        L_0x039c:
            r0 = r18
            r4 = r1
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.firebase-auth-api.zzakn r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzakn) r0
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza(r13, r0, r1)
            goto L_0x0398
        L_0x03bd:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzd((int) r13, (long) r0)
            goto L_0x0398
        L_0x03d7:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzf((int) r13, (int) r0)
            goto L_0x0398
        L_0x03f1:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzc((int) r13, (long) r9)
            goto L_0x0398
        L_0x0407:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            r0 = 0
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zze((int) r13, (int) r0)
        L_0x041c:
            int r12 = r12 + r1
            goto L_0x0399
        L_0x041f:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzb((int) r13, (int) r0)
            goto L_0x0398
        L_0x043a:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzg((int) r13, (int) r0)
            goto L_0x0398
        L_0x0455:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0)
            goto L_0x0398
        L_0x0472:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r13, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x0398
        L_0x0491:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzahp
            if (r1 == 0) goto L_0x04b2
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0)
            goto L_0x0398
        L_0x04b2:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (java.lang.String) r0)
            goto L_0x0398
        L_0x04ba:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (boolean) r15)
            goto L_0x0398
        L_0x04d0:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0399
            r15 = 0
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzc((int) r13, (int) r15)
            goto L_0x0581
        L_0x04e7:
            r9 = r4
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0582
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (long) r9)
            goto L_0x0581
        L_0x04ff:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0582
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzd((int) r13, (int) r0)
            goto L_0x0581
        L_0x051b:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0582
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zze((int) r13, (long) r0)
            goto L_0x0581
        L_0x0536:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0582
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zzb((int) r13, (long) r0)
            goto L_0x0581
        L_0x0551:
            r4 = 0
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = 0
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0582
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (float) r9)
            goto L_0x0581
        L_0x0569:
            r4 = 0
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0582
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaik.zza((int) r13, (double) r9)
        L_0x0581:
            int r12 = r12 + r0
        L_0x0582:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            goto L_0x0010
        L_0x058d:
            r15 = 0
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r6.zzq
            java.lang.Object r1 = r0.zzd(r7)
            int r0 = r0.zza(r1)
            int r12 = r12 + r0
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x05eb
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r6.zzr
            com.google.android.gms.internal.firebase-auth-api.zzaiv r0 = r0.zza((java.lang.Object) r7)
            r10 = 0
        L_0x05a4:
            com.google.android.gms.internal.firebase-auth-api.zzalg<T, java.lang.Object> r1 = r0.zza
            int r1 = r1.zza()
            if (r10 >= r1) goto L_0x05c4
            com.google.android.gms.internal.firebase-auth-api.zzalg<T, java.lang.Object> r1 = r0.zza
            java.util.Map$Entry r1 = r1.zzb((int) r10)
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.firebase-auth-api.zzaix r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzaix) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaiv.zza((com.google.android.gms.internal.p001firebaseauthapi.zzaix<?>) r2, (java.lang.Object) r1)
            int r15 = r15 + r1
            int r10 = r10 + 1
            goto L_0x05a4
        L_0x05c4:
            com.google.android.gms.internal.firebase-auth-api.zzalg<T, java.lang.Object> r0 = r0.zza
            java.lang.Iterable r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        L_0x05ce:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05ea
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.firebase-auth-api.zzaix r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzaix) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaiv.zza((com.google.android.gms.internal.p001firebaseauthapi.zzaix<?>) r2, (java.lang.Object) r1)
            int r15 = r15 + r1
            goto L_0x05ce
        L_0x05ea:
            int r12 = r12 + r15
        L_0x05eb:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zza(java.lang.Object):int");
    }

    private final boolean zzc(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = (long) (zzb2 & 1048575);
        if (j10 == 1048575) {
            int zzc2 = zzc(i10);
            long j11 = (long) (zzc2 & 1048575);
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    return Double.doubleToRawLongBits(zzamk.zza((Object) t10, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzamk.zzb(t10, j11)) != 0;
                case 2:
                    return zzamk.zzd(t10, j11) != 0;
                case 3:
                    return zzamk.zzd(t10, j11) != 0;
                case 4:
                    return zzamk.zzc(t10, j11) != 0;
                case 5:
                    return zzamk.zzd(t10, j11) != 0;
                case 6:
                    return zzamk.zzc(t10, j11) != 0;
                case 7:
                    return zzamk.zzh(t10, j11);
                case 8:
                    Object zze2 = zzamk.zze(t10, j11);
                    if (zze2 instanceof String) {
                        return !((String) zze2).isEmpty();
                    }
                    if (zze2 instanceof zzahp) {
                        return !zzahp.zza.equals(zze2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzamk.zze(t10, j11) != null;
                case 10:
                    return !zzahp.zza.equals(zzamk.zze(t10, j11));
                case 11:
                    return zzamk.zzc(t10, j11) != 0;
                case 12:
                    return zzamk.zzc(t10, j11) != 0;
                case 13:
                    return zzamk.zzc(t10, j11) != 0;
                case 14:
                    return zzamk.zzd(t10, j11) != 0;
                case 15:
                    return zzamk.zzc(t10, j11) != 0;
                case 16:
                    return zzamk.zzd(t10, j11) != 0;
                case 17:
                    return zzamk.zze(t10, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzamk.zzc(t10, j10) & (1 << (zzb2 >>> 20))) != 0;
        }
    }

    private final boolean zzc(T t10, int i10, int i11) {
        return zzamk.zzc(t10, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    private final void zzb(T t10, T t11, int i10) {
        int i11 = this.zzc[i10];
        if (zzc(t11, i11, i10)) {
            long zzc2 = (long) (zzc(i10) & 1048575);
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc2);
            if (object != null) {
                zzalf zze2 = zze(i10);
                if (!zzc(t10, i11, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, zzc2, object);
                    } else {
                        Object zza2 = zze2.zza();
                        zze2.zza(zza2, object);
                        unsafe.putObject(t10, zzc2, zza2);
                    }
                    zzb(t10, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, zzc2);
                if (!zzg(object2)) {
                    Object zza3 = zze2.zza();
                    zze2.zza(zza3, object2);
                    unsafe.putObject(t10, zzc2, zza3);
                    object2 = zza3;
                }
                zze2.zza(object2, object);
                return;
            }
            int i12 = this.zzc[i10];
            String valueOf = String.valueOf(t11);
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + valueOf);
        }
    }

    private final void zzb(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = (long) (1048575 & zzb2);
        if (j10 != 1048575) {
            zzamk.zza((Object) t10, j10, (1 << (zzb2 >>> 20)) | zzamk.zzc(t10, j10));
        }
    }

    private final void zzb(T t10, int i10, int i11) {
        zzamk.zza((Object) t10, (long) (zzb(i11) & 1048575), i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.zzc((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.zzb((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r4)
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r3 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r3 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6)
            long r6 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6)
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6)
            long r6 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6)
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6)
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6)
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r11, r6)
            boolean r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r10, r6)
            boolean r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6)
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6)
            long r6 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r10, r6)
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6)
            long r6 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r10, r6)
            long r6 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.zzc(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r10, (long) r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r11, (long) r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r9.zzq
            java.lang.Object r0 = r0.zzd(r10)
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r2 = r9.zzq
            java.lang.Object r2 = r2.zzd(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r9.zzr
            com.google.android.gms.internal.firebase-auth-api.zzaiv r10 = r0.zza((java.lang.Object) r10)
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r9.zzr
            com.google.android.gms.internal.firebase-auth-api.zzaiv r11 = r0.zza((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.gms.internal.firebase-auth-api.zzamd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v54, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v55, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v57, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v58, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v59, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v60, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v61, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v62, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v63, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v128, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v148, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v152, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v67, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v157, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v159, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v161, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v162, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v165, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v172, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v177, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v180, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v68, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v76, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v69, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v185, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v70, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v186, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v71, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v187, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v72, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v189, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v73, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v191, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v74, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v75, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v77, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v194, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v78, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v79, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v80, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v196, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v81, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v197, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v82, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v198, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v83, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v200, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v84, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v85, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v201, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v86, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v203, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v204, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v206, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v207, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v87, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v88, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v209, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v89, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v210, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v88, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v90, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v71, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v211, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v91, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v92, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v212, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v75, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v93, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v213, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v94, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v75, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v94, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v217, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v96, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v63, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v113, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v98, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v73, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v99, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v65, resolved type: int} */
    /* JADX WARNING: type inference failed for: r11v64, types: [int] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x084d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x084d A[SYNTHETIC] */
    final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.p001firebaseauthapi.zzahk r38) throws java.io.IOException {
        /*
            r32 = this;
            r6 = r32
            r7 = r33
            r15 = r34
            r4 = r36
            r5 = r37
            r2 = r38
            zzf((java.lang.Object) r33)
            sun.misc.Unsafe r3 = zzb
            r16 = 0
            r8 = r35
            r9 = -1
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r8 >= r4) goto L_0x0d99
            int r11 = r8 + 1
            byte r8 = r15[r8]
            if (r8 >= 0) goto L_0x002d
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r8, (byte[]) r15, (int) r11, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r2)
            int r11 = r2.zza
            r12 = r11
            r11 = r8
            goto L_0x002e
        L_0x002d:
            r12 = r8
        L_0x002e:
            int r8 = r12 >>> 3
            r0 = r12 & 7
            r1 = 3
            if (r8 <= r9) goto L_0x0045
            int r10 = r10 / r1
            int r9 = r6.zze
            if (r8 < r9) goto L_0x0043
            int r9 = r6.zzf
            if (r8 > r9) goto L_0x0043
            int r9 = r6.zza((int) r8, (int) r10)
            goto L_0x0049
        L_0x0043:
            r9 = -1
            goto L_0x0049
        L_0x0045:
            int r9 = r6.zza((int) r8)
        L_0x0049:
            r10 = r9
            r9 = -1
            if (r10 != r9) goto L_0x005e
            r20 = r3
            r6 = r5
            r4 = r7
            r18 = r13
            r26 = r14
            r13 = r15
            r10 = 0
            r17 = -1
            r7 = r2
            r2 = r8
            r14 = r12
            goto L_0x0d13
        L_0x005e:
            int[] r9 = r6.zzc
            int r19 = r10 + 1
            r1 = r9[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r1 & r19
            int r4 = r19 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r1 & r17
            r19 = r1
            long r1 = (long) r5
            java.lang.String r5 = ""
            r21 = 0
            r23 = r1
            r2 = 1
            r1 = 17
            if (r4 > r1) goto L_0x03e4
            int r1 = r10 + 2
            r1 = r9[r1]
            int r9 = r1 >>> 20
            int r20 = r2 << r9
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r9
            r17 = r10
            if (r1 == r14) goto L_0x00a5
            if (r14 == r9) goto L_0x0096
            long r9 = (long) r14
            r3.putInt(r7, r9, r13)
            r9 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0096:
            if (r1 != r9) goto L_0x009a
            r13 = 0
            goto L_0x00a0
        L_0x009a:
            long r13 = (long) r1
            int r10 = r3.getInt(r7, r13)
            r13 = r10
        L_0x00a0:
            r26 = r1
            r25 = r13
            goto L_0x00a9
        L_0x00a5:
            r25 = r13
            r26 = r14
        L_0x00a9:
            switch(r4) {
                case 0: goto L_0x03a2;
                case 1: goto L_0x0380;
                case 2: goto L_0x0341;
                case 3: goto L_0x0341;
                case 4: goto L_0x031b;
                case 5: goto L_0x02e5;
                case 6: goto L_0x02bd;
                case 7: goto L_0x0290;
                case 8: goto L_0x0248;
                case 9: goto L_0x0209;
                case 10: goto L_0x01db;
                case 11: goto L_0x031b;
                case 12: goto L_0x017d;
                case 13: goto L_0x02bd;
                case 14: goto L_0x02e5;
                case 15: goto L_0x0152;
                case 16: goto L_0x00f7;
                case 17: goto L_0x00c1;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r13 = r36
            r14 = r37
            r23 = r8
            r18 = r12
            r2 = r17
            r17 = -1
            r8 = r38
            r12 = r3
            r3 = r6
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x03d5
        L_0x00c1:
            r1 = 3
            if (r0 != r1) goto L_0x00ac
            r0 = r17
            java.lang.Object r1 = r6.zza(r7, (int) r0)
            int r2 = r8 << 3
            r13 = r2 | 4
            com.google.android.gms.internal.firebase-auth-api.zzalf r2 = r6.zze((int) r0)
            r4 = r8
            r8 = r1
            r5 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r2
            r2 = r0
            r10 = r34
            r0 = r12
            r12 = r36
            r14 = r38
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((java.lang.Object) r8, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r9, (byte[]) r10, (int) r11, (int) r12, (int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r14)
            r6.zza(r7, (int) r2, (java.lang.Object) r1)
            r13 = r25 | r20
            r5 = r37
            r11 = r0
            r10 = r2
            r9 = r4
            r14 = r26
            r4 = r36
            r2 = r38
            goto L_0x001c
        L_0x00f7:
            r4 = r8
            r2 = r17
            r5 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r38
            if (r0 != 0) goto L_0x0140
            r9 = r23
            int r11 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r15, r11, r8)
            long r0 = r8.zzb
            long r13 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((long) r0)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r1 = r33
            r6 = r2
            r18 = r12
            r12 = r3
            r2 = r9
            r9 = r36
            r10 = r37
            r23 = r4
            r35 = r6
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r13
            r0.putLong(r1, r2, r4)
            r13 = r25 | r20
            r6 = r32
            r2 = r8
            r4 = r9
            r5 = r10
            r8 = r11
            r3 = r12
            r11 = r18
            r9 = r23
            r14 = r26
            r10 = r35
            goto L_0x001c
        L_0x0140:
            r23 = r4
            r18 = r12
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r3 = r32
            r13 = r36
            r14 = r37
            goto L_0x03d5
        L_0x0152:
            r13 = r36
            r14 = r37
            r18 = r12
            r35 = r17
            r9 = r23
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r23 = r8
            r8 = r38
            if (r0 != 0) goto L_0x01d5
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r15, r11, r8)
            int r1 = r8.zza
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((int) r1)
            r12.putInt(r7, r9, r1)
            r1 = r25 | r20
            r6 = r32
            r10 = r35
            goto L_0x03c7
        L_0x017d:
            r13 = r36
            r14 = r37
            r18 = r12
            r35 = r17
            r9 = r23
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r23 = r8
            r8 = r38
            if (r0 != 0) goto L_0x01d5
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r15, r11, r8)
            int r1 = r8.zza
            r5 = r32
            r4 = r35
            com.google.android.gms.internal.firebase-auth-api.zzajg r3 = r5.zzd((int) r4)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r19 & r11
            if (r11 == 0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            r2 = 0
        L_0x01a9:
            if (r2 == 0) goto L_0x01cf
            if (r3 == 0) goto L_0x01cf
            boolean r2 = r3.zza(r1)
            if (r2 == 0) goto L_0x01b4
            goto L_0x01cf
        L_0x01b4:
            com.google.android.gms.internal.firebase-auth-api.zzamd r2 = zze((java.lang.Object) r33)
            long r9 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r3 = r18
            r2.zza((int) r3, (java.lang.Object) r1)
            r11 = r3
            r10 = r4
            r6 = r5
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r23
            r13 = r25
            goto L_0x096d
        L_0x01cf:
            r3 = r18
            r12.putInt(r7, r9, r1)
            goto L_0x01fe
        L_0x01d5:
            r3 = r32
            r2 = r35
            goto L_0x03d5
        L_0x01db:
            r13 = r36
            r14 = r37
            r5 = r6
            r4 = r17
            r9 = r23
            r1 = 2
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r23 = r8
            r8 = r38
            r29 = r12
            r12 = r3
            r3 = r29
            if (r0 != r1) goto L_0x0242
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r15, r11, r8)
            java.lang.Object r1 = r8.zzc
            r12.putObject(r7, r9, r1)
        L_0x01fe:
            r1 = r25 | r20
            r11 = r3
            r10 = r4
            r6 = r5
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r14
            goto L_0x03cd
        L_0x0209:
            r13 = r36
            r14 = r37
            r5 = r6
            r23 = r8
            r4 = r17
            r1 = 2
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r8 = r38
            r29 = r12
            r12 = r3
            r3 = r29
            if (r0 != r1) goto L_0x0242
            java.lang.Object r9 = r5.zza(r7, (int) r4)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r5.zze((int) r4)
            r0 = r9
            r2 = r34
            r18 = r3
            r3 = r11
            r10 = r4
            r4 = r36
            r11 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            r11.zza(r7, (int) r10, (java.lang.Object) r9)
            r1 = r25 | r20
            r2 = r8
            r6 = r11
            goto L_0x03c8
        L_0x0242:
            r18 = r3
            r2 = r4
            r3 = r5
            goto L_0x03d5
        L_0x0248:
            r13 = r36
            r14 = r37
            r4 = r6
            r18 = r12
            r9 = r23
            r1 = 2
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r3
            r23 = r8
            r3 = r17
            r17 = -1
            r8 = r38
            if (r0 != r1) goto L_0x02ba
            boolean r0 = zzg((int) r19)
            if (r0 == 0) goto L_0x026b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r15, r11, r8)
            goto L_0x0282
        L_0x026b:
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r15, r11, r8)
            int r1 = r8.zza
            if (r1 < 0) goto L_0x028b
            if (r1 != 0) goto L_0x0278
            r8.zzc = r5
            goto L_0x0282
        L_0x0278:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r5 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza
            r2.<init>(r15, r0, r1, r5)
            r8.zzc = r2
            int r0 = r0 + r1
        L_0x0282:
            java.lang.Object r1 = r8.zzc
            r12.putObject(r7, r9, r1)
            r1 = r25 | r20
            r10 = r3
            goto L_0x02e2
        L_0x028b:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x0290:
            r13 = r36
            r14 = r37
            r4 = r6
            r18 = r12
            r9 = r23
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r3
            r23 = r8
            r3 = r17
            r17 = -1
            r8 = r38
            if (r0 != 0) goto L_0x02ba
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r15, r11, r8)
            r35 = r3
            long r2 = r8.zzb
            int r1 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x02b5
            r2 = 1
            goto L_0x02b6
        L_0x02b5:
            r2 = 0
        L_0x02b6:
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc((java.lang.Object) r7, (long) r9, (boolean) r2)
            goto L_0x02de
        L_0x02ba:
            r2 = r3
            goto L_0x0318
        L_0x02bd:
            r13 = r36
            r14 = r37
            r4 = r6
            r18 = r12
            r35 = r17
            r9 = r23
            r1 = 5
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r23 = r8
            r8 = r38
            if (r0 != r1) goto L_0x0316
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r15, r11)
            r12.putInt(r7, r9, r0)
            int r0 = r11 + 4
        L_0x02de:
            r1 = r25 | r20
            r10 = r35
        L_0x02e2:
            r6 = r4
            goto L_0x03c7
        L_0x02e5:
            r13 = r36
            r14 = r37
            r4 = r6
            r18 = r12
            r35 = r17
            r9 = r23
            r1 = 1
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r23 = r8
            r8 = r38
            if (r0 != r1) goto L_0x0316
            long r21 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r15, r11)
            r0 = r12
            r1 = r33
            r5 = r35
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r11 + 8
            r1 = r25 | r20
            r2 = r8
            r6 = r9
            goto L_0x03c8
        L_0x0316:
            r2 = r35
        L_0x0318:
            r3 = r4
            goto L_0x03d5
        L_0x031b:
            r13 = r36
            r14 = r37
            r4 = r6
            r18 = r12
            r5 = r17
            r9 = r23
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r23 = r8
            r8 = r38
            if (r0 != 0) goto L_0x037c
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r15, r11, r8)
            int r1 = r8.zza
            r12.putInt(r7, r9, r1)
            r1 = r25 | r20
            r6 = r4
            r10 = r5
            goto L_0x03c7
        L_0x0341:
            r13 = r36
            r14 = r37
            r4 = r6
            r18 = r12
            r5 = r17
            r9 = r23
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r17 = -1
            r12 = r3
            r23 = r8
            r8 = r38
            if (r0 != 0) goto L_0x037c
            int r11 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r15, r11, r8)
            long r2 = r8.zzb
            r0 = r12
            r1 = r33
            r21 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r25 | r20
            r2 = r8
            r6 = r9
            r8 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r11 = r18
            r9 = r23
            r14 = r26
            r13 = r0
            goto L_0x001c
        L_0x037c:
            r3 = r4
            r2 = r5
            goto L_0x03d5
        L_0x0380:
            r13 = r36
            r14 = r37
            r18 = r12
            r2 = r17
            r9 = r23
            r1 = 5
            r17 = -1
            r12 = r3
            r3 = r6
            r23 = r8
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r38
            if (r0 != r1) goto L_0x03d5
            float r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r15, r11)
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r7, (long) r9, (float) r0)
            int r0 = r11 + 4
            goto L_0x03c3
        L_0x03a2:
            r13 = r36
            r14 = r37
            r18 = r12
            r2 = r17
            r9 = r23
            r1 = 1
            r17 = -1
            r12 = r3
            r3 = r6
            r23 = r8
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r38
            if (r0 != r1) goto L_0x03d5
            double r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r15, r11)
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r7, (long) r9, (double) r0)
            int r0 = r11 + 8
        L_0x03c3:
            r1 = r25 | r20
            r10 = r2
            r6 = r3
        L_0x03c7:
            r2 = r8
        L_0x03c8:
            r3 = r12
            r4 = r13
            r5 = r14
            r11 = r18
        L_0x03cd:
            r9 = r23
            r14 = r26
            r8 = r0
            r13 = r1
            goto L_0x001c
        L_0x03d5:
            r10 = r2
            r4 = r7
            r7 = r8
            r20 = r12
            r6 = r14
            r13 = r15
            r14 = r18
            r2 = r23
            r18 = r25
            goto L_0x0d13
        L_0x03e4:
            r2 = r10
            r18 = r12
            r17 = -1
            r10 = r37
            r12 = r3
            r3 = r6
            r6 = r23
            r23 = r8
            r8 = r38
            r1 = 27
            r20 = 10
            if (r4 != r1) goto L_0x0460
            r1 = 2
            if (r0 != r1) goto L_0x044b
            r0 = r6
            r6 = r33
            java.lang.Object r4 = r12.getObject(r6, r0)
            com.google.android.gms.internal.firebase-auth-api.zzajj r4 = (com.google.android.gms.internal.p001firebaseauthapi.zzajj) r4
            boolean r5 = r4.zzc()
            if (r5 != 0) goto L_0x041f
            int r5 = r4.size()
            if (r5 != 0) goto L_0x0414
            r5 = 10
            goto L_0x0418
        L_0x0414:
            int r20 = r5 << 1
            r5 = r20
        L_0x0418:
            com.google.android.gms.internal.firebase-auth-api.zzajj r4 = r4.zza(r5)
            r12.putObject(r6, r0, r4)
        L_0x041f:
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = r3.zze((int) r2)
            r7 = r8
            r8 = r0
            r9 = r18
            r1 = r10
            r10 = r34
            r0 = r12
            r5 = r18
            r12 = r36
            r18 = r13
            r13 = r4
            r26 = r14
            r14 = r38
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalf<?>) r8, (int) r9, (byte[]) r10, (int) r11, (int) r12, (com.google.android.gms.internal.p001firebaseauthapi.zzajj<?>) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r14)
            r4 = r36
            r10 = r2
            r11 = r5
            r2 = r7
            r13 = r18
            r9 = r23
            r14 = r26
            r5 = r1
            r7 = r6
            r6 = r3
            r3 = r0
            goto L_0x001c
        L_0x044b:
            r6 = r33
            r7 = r8
            r1 = r10
            r26 = r14
            r5 = r18
            r18 = r13
            r13 = r2
            r6 = r3
            r19 = r5
            r20 = r12
            r14 = r15
            r15 = r36
            goto L_0x0a9d
        L_0x0460:
            r1 = r10
            r26 = r14
            r10 = r9
            r14 = r12
            r29 = r6
            r6 = r33
            r7 = r8
            r8 = r29
            r31 = r18
            r18 = r13
            r13 = r31
            r12 = 49
            if (r4 > r12) goto L_0x0972
            r12 = r19
            r19 = r14
            long r14 = (long) r12
            sun.misc.Unsafe r10 = zzb
            java.lang.Object r12 = r10.getObject(r6, r8)
            com.google.android.gms.internal.firebase-auth-api.zzajj r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajj) r12
            boolean r27 = r12.zzc()
            if (r27 != 0) goto L_0x049e
            int r27 = r12.size()
            if (r27 != 0) goto L_0x0492
            r1 = 10
            goto L_0x0496
        L_0x0492:
            int r20 = r27 << 1
            r1 = r20
        L_0x0496:
            com.google.android.gms.internal.firebase-auth-api.zzajj r1 = r12.zza(r1)
            r10.putObject(r6, r8, r1)
            r12 = r1
        L_0x049e:
            switch(r4) {
                case 18: goto L_0x0904;
                case 19: goto L_0x08b5;
                case 20: goto L_0x0867;
                case 21: goto L_0x0867;
                case 22: goto L_0x0839;
                case 23: goto L_0x07e8;
                case 24: goto L_0x0796;
                case 25: goto L_0x0730;
                case 26: goto L_0x066b;
                case 27: goto L_0x0640;
                case 28: goto L_0x05e1;
                case 29: goto L_0x0839;
                case 30: goto L_0x05aa;
                case 31: goto L_0x0796;
                case 32: goto L_0x07e8;
                case 33: goto L_0x0556;
                case 34: goto L_0x0502;
                case 35: goto L_0x0904;
                case 36: goto L_0x08b5;
                case 37: goto L_0x0867;
                case 38: goto L_0x0867;
                case 39: goto L_0x0839;
                case 40: goto L_0x07e8;
                case 41: goto L_0x0796;
                case 42: goto L_0x0730;
                case 43: goto L_0x0839;
                case 44: goto L_0x05aa;
                case 45: goto L_0x0796;
                case 46: goto L_0x07e8;
                case 47: goto L_0x0556;
                case 48: goto L_0x0502;
                case 49: goto L_0x04af;
                default: goto L_0x04a1;
            }
        L_0x04a1:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
        L_0x04a7:
            r9 = r11
            r8 = r13
            r11 = r19
            r13 = r37
            goto L_0x0952
        L_0x04af:
            r1 = 3
            if (r0 != r1) goto L_0x04fb
            com.google.android.gms.internal.firebase-auth-api.zzalf r8 = r3.zze((int) r2)
            r0 = r13 & -8
            r9 = r0 | 4
            r0 = r8
            r15 = r36
            r14 = r37
            r1 = r34
            r10 = r2
            r2 = r11
            r5 = r3
            r3 = r36
            r4 = r9
            r6 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalf) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            java.lang.Object r1 = r7.zzc
            r12.add(r1)
        L_0x04d3:
            if (r0 >= r15) goto L_0x04f7
            r5 = r34
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r5, r0, r7)
            int r1 = r7.zza
            if (r13 != r1) goto L_0x04f4
            r0 = r8
            r1 = r34
            r3 = r36
            r4 = r9
            r14 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalf) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            java.lang.Object r1 = r7.zzc
            r12.add(r1)
            r14 = r37
            goto L_0x04d3
        L_0x04f4:
            r14 = r5
            goto L_0x05d9
        L_0x04f7:
            r14 = r34
            goto L_0x05d9
        L_0x04fb:
            r15 = r36
            r6 = r3
            r14 = r34
            r10 = r2
            goto L_0x04a7
        L_0x0502:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r1 = 2
            if (r0 != r1) goto L_0x052d
            com.google.android.gms.internal.firebase-auth-api.zzajy r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajy) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r11, r7)
            int r1 = r7.zza
            int r1 = r1 + r0
        L_0x0514:
            if (r0 >= r1) goto L_0x0524
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r0, r7)
            long r2 = r7.zzb
            long r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((long) r2)
            r12.zza((long) r2)
            goto L_0x0514
        L_0x0524:
            if (r0 != r1) goto L_0x0528
            goto L_0x05d9
        L_0x0528:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x052d:
            if (r0 != 0) goto L_0x04a7
            com.google.android.gms.internal.firebase-auth-api.zzajy r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajy) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r11, r7)
            long r1 = r7.zzb
            long r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((long) r1)
            r12.zza((long) r1)
        L_0x053e:
            if (r0 >= r15) goto L_0x05d9
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            if (r13 != r2) goto L_0x05d9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r1, r7)
            long r1 = r7.zzb
            long r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((long) r1)
            r12.zza((long) r1)
            goto L_0x053e
        L_0x0556:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r1 = 2
            if (r0 != r1) goto L_0x0581
            com.google.android.gms.internal.firebase-auth-api.zzajd r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajd) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r11, r7)
            int r1 = r7.zza
            int r1 = r1 + r0
        L_0x0568:
            if (r0 >= r1) goto L_0x0578
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((int) r2)
            r12.zzc(r2)
            goto L_0x0568
        L_0x0578:
            if (r0 != r1) goto L_0x057c
            goto L_0x05d9
        L_0x057c:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0581:
            if (r0 != 0) goto L_0x04a7
            com.google.android.gms.internal.firebase-auth-api.zzajd r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajd) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r11, r7)
            int r1 = r7.zza
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((int) r1)
            r12.zzc(r1)
        L_0x0592:
            if (r0 >= r15) goto L_0x05d9
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            if (r13 != r2) goto L_0x05d9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r1, r7)
            int r1 = r7.zza
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((int) r1)
            r12.zzc(r1)
            goto L_0x0592
        L_0x05aa:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r1 = 2
            if (r0 != r1) goto L_0x05b9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((byte[]) r14, (int) r11, (com.google.android.gms.internal.p001firebaseauthapi.zzajj<?>) r12, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r7)
        L_0x05b7:
            r8 = r0
            goto L_0x05c9
        L_0x05b9:
            if (r0 != 0) goto L_0x04a7
            r0 = r13
            r1 = r34
            r2 = r11
            r3 = r36
            r4 = r12
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzajj<?>) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            goto L_0x05b7
        L_0x05c9:
            com.google.android.gms.internal.firebase-auth-api.zzajg r3 = r6.zzd((int) r10)
            r4 = 0
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r5 = r6.zzq
            r0 = r33
            r1 = r23
            r2 = r12
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(r0, r1, r2, r3, r4, r5)
            r0 = r8
        L_0x05d9:
            r9 = r11
            r8 = r13
            r11 = r19
            r13 = r37
            goto L_0x0953
        L_0x05e1:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r1 = 2
            if (r0 != r1) goto L_0x04a7
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r11, r7)
            int r1 = r7.zza
            if (r1 < 0) goto L_0x063b
            int r2 = r14.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x0636
            if (r1 != 0) goto L_0x05fe
            com.google.android.gms.internal.firebase-auth-api.zzahp r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza
            r12.add(r1)
            goto L_0x0606
        L_0x05fe:
            com.google.android.gms.internal.firebase-auth-api.zzahp r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza((byte[]) r14, (int) r0, (int) r1)
            r12.add(r2)
        L_0x0605:
            int r0 = r0 + r1
        L_0x0606:
            if (r0 >= r15) goto L_0x05d9
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            if (r13 != r2) goto L_0x05d9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r1, r7)
            int r1 = r7.zza
            if (r1 < 0) goto L_0x0631
            int r2 = r14.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x062c
            if (r1 != 0) goto L_0x0624
            com.google.android.gms.internal.firebase-auth-api.zzahp r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza
            r12.add(r1)
            goto L_0x0606
        L_0x0624:
            com.google.android.gms.internal.firebase-auth-api.zzahp r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza((byte[]) r14, (int) r0, (int) r1)
            r12.add(r2)
            goto L_0x0605
        L_0x062c:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0631:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x0636:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x063b:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x0640:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r1 = 2
            if (r0 != r1) goto L_0x04a7
            com.google.android.gms.internal.firebase-auth-api.zzalf r8 = r6.zze((int) r10)
            r9 = r13
            r4 = r10
            r10 = r34
            r3 = r11
            r2 = r12
            r12 = r36
            r1 = r13
            r13 = r2
            r2 = r37
            r0 = r14
            r5 = r19
            r14 = r38
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalf<?>) r8, (int) r9, (byte[]) r10, (int) r11, (int) r12, (com.google.android.gms.internal.p001firebaseauthapi.zzajj<?>) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r14)
            r14 = r0
            r13 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            r0 = r8
            r8 = r1
            goto L_0x0953
        L_0x066b:
            r4 = r2
            r6 = r3
            r3 = r11
            r2 = r12
            r1 = r13
            r8 = r14
            r11 = r19
            r10 = 2
            r14 = r34
            r15 = r36
            r13 = r37
            if (r0 != r10) goto L_0x072b
            r19 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r8 & r19
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x06cb
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r3, r7)
            int r8 = r7.zza
            if (r8 < 0) goto L_0x06c6
            if (r8 != 0) goto L_0x0693
            r2.add(r5)
            goto L_0x069e
        L_0x0693:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza
            r9.<init>(r14, r0, r8, r10)
            r2.add(r9)
        L_0x069d:
            int r0 = r0 + r8
        L_0x069e:
            if (r0 >= r15) goto L_0x084d
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r9 = r7.zza
            if (r1 != r9) goto L_0x084d
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r8, r7)
            int r8 = r7.zza
            if (r8 < 0) goto L_0x06c1
            if (r8 != 0) goto L_0x06b6
            r2.add(r5)
            goto L_0x069e
        L_0x06b6:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza
            r9.<init>(r14, r0, r8, r10)
            r2.add(r9)
            goto L_0x069d
        L_0x06c1:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x06c6:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x06cb:
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r3, r7)
            int r8 = r7.zza
            if (r8 < 0) goto L_0x0726
            if (r8 != 0) goto L_0x06d9
            r2.add(r5)
            goto L_0x06ec
        L_0x06d9:
            int r9 = r0 + r8
            boolean r10 = com.google.android.gms.internal.p001firebaseauthapi.zzaml.zzc(r14, r0, r9)
            if (r10 == 0) goto L_0x0721
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza
            r10.<init>(r14, r0, r8, r12)
            r2.add(r10)
        L_0x06eb:
            r0 = r9
        L_0x06ec:
            if (r0 >= r15) goto L_0x084d
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r9 = r7.zza
            if (r1 != r9) goto L_0x084d
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r8, r7)
            int r8 = r7.zza
            if (r8 < 0) goto L_0x071c
            if (r8 != 0) goto L_0x0704
            r2.add(r5)
            goto L_0x06ec
        L_0x0704:
            int r9 = r0 + r8
            boolean r10 = com.google.android.gms.internal.p001firebaseauthapi.zzaml.zzc(r14, r0, r9)
            if (r10 == 0) goto L_0x0717
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza
            r10.<init>(r14, r0, r8, r12)
            r2.add(r10)
            goto L_0x06eb
        L_0x0717:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzd()
            throw r0
        L_0x071c:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x0721:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzd()
            throw r0
        L_0x0726:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L_0x072b:
            r8 = r1
            r9 = r3
            r10 = r4
            goto L_0x0952
        L_0x0730:
            r14 = r34
            r15 = r36
            r4 = r2
            r6 = r3
            r3 = r11
            r2 = r12
            r1 = r13
            r11 = r19
            r5 = 2
            r13 = r37
            if (r0 != r5) goto L_0x0766
            r12 = r2
            com.google.android.gms.internal.firebase-auth-api.zzahn r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzahn) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r3, r7)
            int r2 = r7.zza
            int r2 = r2 + r0
        L_0x074a:
            if (r0 >= r2) goto L_0x075d
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r0, r7)
            long r8 = r7.zzb
            int r5 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x0758
            r5 = 1
            goto L_0x0759
        L_0x0758:
            r5 = 0
        L_0x0759:
            r12.zza((boolean) r5)
            goto L_0x074a
        L_0x075d:
            if (r0 != r2) goto L_0x0761
            goto L_0x084d
        L_0x0761:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0766:
            if (r0 != 0) goto L_0x072b
            r12 = r2
            com.google.android.gms.internal.firebase-auth-api.zzahn r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzahn) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r3, r7)
            long r8 = r7.zzb
            int r2 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0777
            r2 = 1
            goto L_0x0778
        L_0x0777:
            r2 = 0
        L_0x0778:
            r12.zza((boolean) r2)
        L_0x077b:
            if (r0 >= r15) goto L_0x084d
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r5 = r7.zza
            if (r1 != r5) goto L_0x084d
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r2, r7)
            long r8 = r7.zzb
            int r2 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0791
            r2 = 1
            goto L_0x0792
        L_0x0791:
            r2 = 0
        L_0x0792:
            r12.zza((boolean) r2)
            goto L_0x077b
        L_0x0796:
            r14 = r34
            r15 = r36
            r4 = r2
            r6 = r3
            r3 = r11
            r2 = r12
            r1 = r13
            r11 = r19
            r5 = 2
            r13 = r37
            if (r0 != r5) goto L_0x07c5
            r12 = r2
            com.google.android.gms.internal.firebase-auth-api.zzajd r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajd) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r3, r7)
            int r2 = r7.zza
            int r2 = r2 + r0
        L_0x07b0:
            if (r0 >= r2) goto L_0x07bc
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0)
            r12.zzc(r5)
            int r0 = r0 + 4
            goto L_0x07b0
        L_0x07bc:
            if (r0 != r2) goto L_0x07c0
            goto L_0x084d
        L_0x07c0:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x07c5:
            r5 = 5
            if (r0 != r5) goto L_0x072b
            r12 = r2
            com.google.android.gms.internal.firebase-auth-api.zzajd r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajd) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r3)
            r12.zzc(r0)
            int r0 = r3 + 4
        L_0x07d4:
            if (r0 >= r15) goto L_0x084d
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r5 = r7.zza
            if (r1 != r5) goto L_0x084d
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r2)
            r12.zzc(r0)
            int r0 = r2 + 4
            goto L_0x07d4
        L_0x07e8:
            r14 = r34
            r15 = r36
            r4 = r2
            r6 = r3
            r3 = r11
            r2 = r12
            r1 = r13
            r11 = r19
            r5 = 2
            r13 = r37
            if (r0 != r5) goto L_0x0816
            r12 = r2
            com.google.android.gms.internal.firebase-auth-api.zzajy r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajy) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r3, r7)
            int r2 = r7.zza
            int r2 = r2 + r0
        L_0x0802:
            if (r0 >= r2) goto L_0x080e
            long r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r0)
            r12.zza((long) r8)
            int r0 = r0 + 8
            goto L_0x0802
        L_0x080e:
            if (r0 != r2) goto L_0x0811
            goto L_0x084d
        L_0x0811:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0816:
            r5 = 1
            if (r0 != r5) goto L_0x072b
            r12 = r2
            com.google.android.gms.internal.firebase-auth-api.zzajy r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajy) r12
            long r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r3)
            r12.zza((long) r8)
            int r0 = r3 + 8
        L_0x0825:
            if (r0 >= r15) goto L_0x084d
            int r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r5 = r7.zza
            if (r1 != r5) goto L_0x084d
            long r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r2)
            r12.zza((long) r8)
            int r0 = r2 + 8
            goto L_0x0825
        L_0x0839:
            r14 = r34
            r15 = r36
            r4 = r2
            r6 = r3
            r3 = r11
            r2 = r12
            r1 = r13
            r11 = r19
            r5 = 2
            r13 = r37
            if (r0 != r5) goto L_0x0852
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((byte[]) r14, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzajj<?>) r2, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r7)
        L_0x084d:
            r8 = r1
            r9 = r3
            r10 = r4
            goto L_0x0953
        L_0x0852:
            if (r0 != 0) goto L_0x072b
            r0 = r1
            r8 = r1
            r1 = r34
            r12 = r2
            r2 = r3
            r9 = r3
            r3 = r36
            r10 = r4
            r4 = r12
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzajj<?>) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            goto L_0x0953
        L_0x0867:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r9 = r11
            r8 = r13
            r11 = r19
            r1 = 2
            r13 = r37
            if (r0 != r1) goto L_0x0894
            com.google.android.gms.internal.firebase-auth-api.zzajy r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajy) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r9, r7)
            int r1 = r7.zza
            int r1 = r1 + r0
        L_0x087f:
            if (r0 >= r1) goto L_0x088b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r0, r7)
            long r2 = r7.zzb
            r12.zza((long) r2)
            goto L_0x087f
        L_0x088b:
            if (r0 != r1) goto L_0x088f
            goto L_0x0953
        L_0x088f:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0894:
            if (r0 != 0) goto L_0x0952
            com.google.android.gms.internal.firebase-auth-api.zzajy r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajy) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r9, r7)
            long r1 = r7.zzb
            r12.zza((long) r1)
        L_0x08a1:
            if (r0 >= r15) goto L_0x0953
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            if (r8 != r2) goto L_0x0953
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r14, r1, r7)
            long r1 = r7.zzb
            r12.zza((long) r1)
            goto L_0x08a1
        L_0x08b5:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r9 = r11
            r8 = r13
            r11 = r19
            r1 = 2
            r13 = r37
            if (r0 != r1) goto L_0x08e2
            com.google.android.gms.internal.firebase-auth-api.zzajb r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajb) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r9, r7)
            int r1 = r7.zza
            int r1 = r1 + r0
        L_0x08cd:
            if (r0 >= r1) goto L_0x08d9
            float r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r14, r0)
            r12.zza((float) r2)
            int r0 = r0 + 4
            goto L_0x08cd
        L_0x08d9:
            if (r0 != r1) goto L_0x08dd
            goto L_0x0953
        L_0x08dd:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x08e2:
            r1 = 5
            if (r0 != r1) goto L_0x0952
            com.google.android.gms.internal.firebase-auth-api.zzajb r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzajb) r12
            float r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r14, r9)
            r12.zza((float) r0)
            int r0 = r9 + 4
        L_0x08f0:
            if (r0 >= r15) goto L_0x0953
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            if (r8 != r2) goto L_0x0953
            float r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r14, r1)
            r12.zza((float) r0)
            int r0 = r1 + 4
            goto L_0x08f0
        L_0x0904:
            r14 = r34
            r15 = r36
            r10 = r2
            r6 = r3
            r9 = r11
            r8 = r13
            r11 = r19
            r1 = 2
            r13 = r37
            if (r0 != r1) goto L_0x0930
            com.google.android.gms.internal.firebase-auth-api.zzaim r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzaim) r12
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r9, r7)
            int r1 = r7.zza
            int r1 = r1 + r0
        L_0x091c:
            if (r0 >= r1) goto L_0x0928
            double r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r14, r0)
            r12.zza((double) r2)
            int r0 = r0 + 8
            goto L_0x091c
        L_0x0928:
            if (r0 != r1) goto L_0x092b
            goto L_0x0953
        L_0x092b:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0930:
            r1 = 1
            if (r0 != r1) goto L_0x0952
            com.google.android.gms.internal.firebase-auth-api.zzaim r12 = (com.google.android.gms.internal.p001firebaseauthapi.zzaim) r12
            double r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r14, r9)
            r12.zza((double) r0)
            int r0 = r9 + 8
        L_0x093e:
            if (r0 >= r15) goto L_0x0953
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r0, r7)
            int r2 = r7.zza
            if (r8 != r2) goto L_0x0953
            double r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r14, r1)
            r12.zza((double) r2)
            int r0 = r1 + 8
            goto L_0x093e
        L_0x0952:
            r0 = r9
        L_0x0953:
            if (r0 != r9) goto L_0x0961
            r4 = r33
            r20 = r11
            r6 = r13
            r13 = r14
            r2 = r23
            r11 = r0
            r14 = r8
            goto L_0x0d13
        L_0x0961:
            r2 = r7
            r3 = r11
            r5 = r13
            r4 = r15
            r13 = r18
            r9 = r23
            r7 = r33
            r11 = r8
            r15 = r14
        L_0x096d:
            r14 = r26
            r8 = r0
            goto L_0x001c
        L_0x0972:
            r6 = r3
            r12 = r19
            r19 = r13
            r13 = r1
            r1 = r11
            r11 = r14
            r14 = r15
            r15 = r36
            r3 = 50
            if (r4 != r3) goto L_0x0aa9
            r3 = 2
            if (r0 != r3) goto L_0x0a99
            sun.misc.Unsafe r0 = zzb
            java.lang.Object r3 = r6.zzf((int) r2)
            r10 = r33
            java.lang.Object r4 = r0.getObject(r10, r8)
            com.google.android.gms.internal.firebase-auth-api.zzakg r5 = r6.zzs
            boolean r5 = r5.zzf(r4)
            if (r5 == 0) goto L_0x09a7
            com.google.android.gms.internal.firebase-auth-api.zzakg r5 = r6.zzs
            java.lang.Object r5 = r5.zzb(r3)
            com.google.android.gms.internal.firebase-auth-api.zzakg r12 = r6.zzs
            r12.zza(r5, r4)
            r0.putObject(r10, r8, r5)
            r4 = r5
        L_0x09a7:
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = r6.zzs
            com.google.android.gms.internal.firebase-auth-api.zzake r8 = r0.zza(r3)
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = r6.zzs
            java.util.Map r9 = r0.zze(r4)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r14, r1, r7)
            int r3 = r7.zza
            if (r3 < 0) goto L_0x0a94
            int r4 = r15 - r0
            if (r3 > r4) goto L_0x0a94
            int r12 = r0 + r3
            K r3 = r8.zzb
            V r4 = r8.zzd
            r5 = r3
        L_0x09c6:
            if (r0 >= r12) goto L_0x0a68
            int r3 = r0 + 1
            byte r0 = r14[r0]
            if (r0 >= 0) goto L_0x09d9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r0, (byte[]) r14, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r7)
            int r3 = r7.zza
            r29 = r3
            r3 = r0
            r0 = r29
        L_0x09d9:
            r20 = r1
            int r1 = r0 >>> 3
            r27 = r2
            r2 = r0 & 7
            r35 = r4
            r4 = 1
            if (r1 == r4) goto L_0x0a30
            r4 = 2
            if (r1 == r4) goto L_0x09f6
            r4 = r35
            r10 = r5
            r13 = r27
            r29 = r20
            r20 = r11
            r11 = r29
            goto L_0x0a59
        L_0x09f6:
            com.google.android.gms.internal.firebase-auth-api.zzamr r1 = r8.zzc
            int r1 = r1.zza()
            if (r2 != r1) goto L_0x0a26
            com.google.android.gms.internal.firebase-auth-api.zzamr r2 = r8.zzc
            V r0 = r8.zzd
            java.lang.Class r21 = r0.getClass()
            r0 = r34
            r4 = r20
            r20 = r11
            r11 = 2
            r1 = r3
            r22 = r2
            r13 = r27
            r3 = 1
            r2 = r36
            r11 = r19
            r3 = r22
            r11 = r4
            r4 = r21
            r10 = r5
            r5 = r38
            int r0 = zza((byte[]) r0, (int) r1, (int) r2, (com.google.android.gms.internal.p001firebaseauthapi.zzamr) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            java.lang.Object r4 = r7.zzc
            goto L_0x0a5d
        L_0x0a26:
            r10 = r5
            r13 = r27
            r29 = r20
            r20 = r11
            r11 = r29
            goto L_0x0a57
        L_0x0a30:
            r10 = r5
            r13 = r27
            r29 = r20
            r20 = r11
            r11 = r29
            com.google.android.gms.internal.firebase-auth-api.zzamr r1 = r8.zza
            int r1 = r1.zza()
            if (r2 != r1) goto L_0x0a57
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r8.zza
            r5 = 0
            r0 = r34
            r1 = r3
            r2 = r36
            r3 = r4
            r10 = r35
            r4 = r5
            r5 = r38
            int r0 = zza((byte[]) r0, (int) r1, (int) r2, (com.google.android.gms.internal.p001firebaseauthapi.zzamr) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            java.lang.Object r5 = r7.zzc
            r4 = r10
            goto L_0x0a5e
        L_0x0a57:
            r4 = r35
        L_0x0a59:
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r0, (byte[]) r14, (int) r3, (int) r15, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r7)
        L_0x0a5d:
            r5 = r10
        L_0x0a5e:
            r1 = r11
            r2 = r13
            r11 = r20
            r10 = r33
            r13 = r37
            goto L_0x09c6
        L_0x0a68:
            r13 = r2
            r10 = r5
            r20 = r11
            r11 = r1
            if (r0 != r12) goto L_0x0a8f
            r9.put(r10, r4)
            if (r12 != r11) goto L_0x0a7a
            r4 = r33
            r6 = r37
            r11 = r12
            goto L_0x0aa1
        L_0x0a7a:
            r5 = r37
            r2 = r7
            r8 = r12
            r10 = r13
            r4 = r15
            r13 = r18
            r11 = r19
            r3 = r20
            r9 = r23
            r7 = r33
            r15 = r14
            r14 = r26
            goto L_0x001c
        L_0x0a8f:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzg()
            throw r0
        L_0x0a94:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        L_0x0a99:
            r13 = r2
            r20 = r11
            r11 = r1
        L_0x0a9d:
            r4 = r33
            r6 = r37
        L_0x0aa1:
            r10 = r13
            r13 = r14
            r14 = r19
            r2 = r23
            goto L_0x0d13
        L_0x0aa9:
            r3 = r33
            r13 = r2
            r20 = r11
            r11 = r1
            sun.misc.Unsafe r1 = zzb
            int r2 = r13 + 2
            r2 = r10[r2]
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r10
            r24 = r11
            long r10 = (long) r2
            switch(r4) {
                case 51: goto L_0x0cea;
                case 52: goto L_0x0cca;
                case 53: goto L_0x0cab;
                case 54: goto L_0x0cab;
                case 55: goto L_0x0c8b;
                case 56: goto L_0x0c6a;
                case 57: goto L_0x0c49;
                case 58: goto L_0x0c20;
                case 59: goto L_0x0be2;
                case 60: goto L_0x0ba6;
                case 61: goto L_0x0b83;
                case 62: goto L_0x0c8b;
                case 63: goto L_0x0b4c;
                case 64: goto L_0x0c49;
                case 65: goto L_0x0c6a;
                case 66: goto L_0x0b26;
                case 67: goto L_0x0b02;
                case 68: goto L_0x0acd;
                default: goto L_0x0abf;
            }
        L_0x0abf:
            r4 = r3
            r2 = r23
            r15 = r24
        L_0x0ac4:
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            goto L_0x0d0b
        L_0x0acd:
            r2 = 3
            if (r0 != r2) goto L_0x0afc
            r5 = r23
            java.lang.Object r0 = r6.zza(r3, (int) r5, (int) r13)
            r1 = r19 & -8
            r1 = r1 | 4
            com.google.android.gms.internal.firebase-auth-api.zzalf r9 = r6.zze((int) r13)
            r8 = r0
            r10 = r34
            r2 = r19
            r4 = r20
            r12 = r24
            r11 = r12
            r15 = r12
            r12 = r36
            r19 = r4
            r4 = r13
            r13 = r1
            r1 = r14
            r14 = r38
            int r8 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((java.lang.Object) r8, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r9, (byte[]) r10, (int) r11, (int) r12, (int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r14)
            r6.zza(r3, (int) r5, (int) r4, (java.lang.Object) r0)
            r13 = r1
            goto L_0x0b9d
        L_0x0afc:
            r15 = r24
            r4 = r3
            r2 = r23
            goto L_0x0ac4
        L_0x0b02:
            r4 = r13
            r13 = r14
            r2 = r19
            r19 = r20
            r5 = r23
            r15 = r24
            if (r0 != 0) goto L_0x0b48
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r13, r15, r7)
            long r12 = r7.zzb
            long r12 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((long) r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r1.putObject(r3, r8, r12)
            r1.putInt(r3, r10, r5)
            r13 = r34
            goto L_0x0b9c
        L_0x0b26:
            r4 = r13
            r2 = r19
            r19 = r20
            r5 = r23
            r15 = r24
            if (r0 != 0) goto L_0x0b48
            r13 = r34
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r13, r15, r7)
            int r12 = r7.zza
            int r12 = com.google.android.gms.internal.p001firebaseauthapi.zzaia.zza((int) r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1.putObject(r3, r8, r12)
            r1.putInt(r3, r10, r5)
            goto L_0x0b9c
        L_0x0b48:
            r13 = r34
            goto L_0x0bd9
        L_0x0b4c:
            r4 = r13
            r13 = r14
            r2 = r19
            r19 = r20
            r5 = r23
            r15 = r24
            if (r0 != 0) goto L_0x0bd9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r13, r15, r7)
            int r12 = r7.zza
            com.google.android.gms.internal.firebase-auth-api.zzajg r14 = r6.zzd((int) r4)
            if (r14 == 0) goto L_0x0b78
            boolean r14 = r14.zza(r12)
            if (r14 == 0) goto L_0x0b6b
            goto L_0x0b78
        L_0x0b6b:
            com.google.android.gms.internal.firebase-auth-api.zzamd r1 = zze((java.lang.Object) r33)
            long r8 = (long) r12
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r1.zza((int) r2, (java.lang.Object) r8)
            goto L_0x0b9c
        L_0x0b78:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1.putObject(r3, r8, r12)
            r1.putInt(r3, r10, r5)
            goto L_0x0b9c
        L_0x0b83:
            r4 = r13
            r13 = r14
            r2 = r19
            r19 = r20
            r5 = r23
            r15 = r24
            r12 = 2
            if (r0 != r12) goto L_0x0bd9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r13, r15, r7)
            java.lang.Object r12 = r7.zzc
            r1.putObject(r3, r8, r12)
            r1.putInt(r3, r10, r5)
        L_0x0b9c:
            r8 = r0
        L_0x0b9d:
            r14 = r2
            r2 = r5
            r20 = r19
            r19 = r4
            r4 = r3
            goto L_0x0d0c
        L_0x0ba6:
            r4 = r13
            r13 = r14
            r2 = r19
            r19 = r20
            r5 = r23
            r15 = r24
            r12 = 2
            if (r0 != r12) goto L_0x0bd9
            java.lang.Object r8 = r6.zza(r3, (int) r5, (int) r4)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r4)
            r0 = r8
            r14 = r2
            r2 = r34
            r9 = r3
            r3 = r15
            r11 = r4
            r10 = r19
            r4 = r36
            r12 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            r6.zza(r9, (int) r12, (int) r11, (java.lang.Object) r8)
            r8 = r0
            r4 = r9
            r20 = r10
            r19 = r11
            r2 = r12
            goto L_0x0d0c
        L_0x0bd9:
            r14 = r2
            r2 = r5
            r20 = r19
            r19 = r4
            r4 = r3
            goto L_0x0d0b
        L_0x0be2:
            r4 = r3
            r2 = r23
            r15 = r24
            r3 = 2
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != r3) goto L_0x0d0b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r13, r15, r7)
            int r3 = r7.zza
            if (r3 != 0) goto L_0x0bfd
            r1.putObject(r4, r8, r5)
            goto L_0x0c1b
        L_0x0bfd:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r12
            if (r5 == 0) goto L_0x0c10
            int r5 = r0 + r3
            boolean r5 = com.google.android.gms.internal.p001firebaseauthapi.zzaml.zzc(r13, r0, r5)
            if (r5 == 0) goto L_0x0c0b
            goto L_0x0c10
        L_0x0c0b:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzd()
            throw r0
        L_0x0c10:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza
            r5.<init>(r13, r0, r3, r12)
            r1.putObject(r4, r8, r5)
            int r0 = r0 + r3
        L_0x0c1b:
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0c20:
            r4 = r3
            r2 = r23
            r15 = r24
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != 0) goto L_0x0d0b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r13, r15, r7)
            long r5 = r7.zzb
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x0c3b
            r28 = 1
            goto L_0x0c3d
        L_0x0c3b:
            r28 = 0
        L_0x0c3d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r28)
            r1.putObject(r4, r8, r3)
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0c49:
            r4 = r3
            r2 = r23
            r15 = r24
            r3 = 5
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != r3) goto L_0x0d0b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r13, r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.putObject(r4, r8, r0)
            int r0 = r15 + 4
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0c6a:
            r4 = r3
            r2 = r23
            r15 = r24
            r3 = 1
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != r3) goto L_0x0d0b
            long r5 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r13, r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.putObject(r4, r8, r0)
            int r0 = r15 + 8
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0c8b:
            r4 = r3
            r2 = r23
            r15 = r24
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != 0) goto L_0x0d0b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r13, r15, r7)
            int r3 = r7.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.putObject(r4, r8, r3)
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0cab:
            r4 = r3
            r2 = r23
            r15 = r24
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != 0) goto L_0x0d0b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzd(r13, r15, r7)
            long r5 = r7.zzb
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.putObject(r4, r8, r3)
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0cca:
            r4 = r3
            r2 = r23
            r15 = r24
            r3 = 5
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != r3) goto L_0x0d0b
            float r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzb(r13, r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.putObject(r4, r8, r0)
            int r0 = r15 + 4
            r1.putInt(r4, r10, r2)
            goto L_0x0d09
        L_0x0cea:
            r4 = r3
            r2 = r23
            r15 = r24
            r3 = 1
            r29 = r19
            r19 = r13
            r13 = r14
            r14 = r29
            if (r0 != r3) goto L_0x0d0b
            double r5 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r13, r15)
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r1.putObject(r4, r8, r0)
            int r0 = r15 + 8
            r1.putInt(r4, r10, r2)
        L_0x0d09:
            r8 = r0
            goto L_0x0d0c
        L_0x0d0b:
            r8 = r15
        L_0x0d0c:
            if (r8 != r15) goto L_0x0d83
            r6 = r37
            r11 = r8
            r10 = r19
        L_0x0d13:
            if (r14 != r6) goto L_0x0d25
            if (r6 != 0) goto L_0x0d18
            goto L_0x0d25
        L_0x0d18:
            r9 = r32
            r10 = r4
            r8 = r11
            r11 = r14
            r13 = r18
            r15 = r20
            r14 = r26
            goto L_0x0da1
        L_0x0d25:
            r9 = r32
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x0d5e
            com.google.android.gms.internal.firebase-auth-api.zzaio r0 = r7.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaio r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaio.zza
            if (r0 == r1) goto L_0x0d5e
            com.google.android.gms.internal.firebase-auth-api.zzakn r1 = r9.zzg
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzd r0 = r0.zza(r1, r2)
            if (r0 != 0) goto L_0x0d4f
            com.google.android.gms.internal.firebase-auth-api.zzamd r5 = zze((java.lang.Object) r33)
            r0 = r14
            r1 = r34
            r12 = r2
            r2 = r11
            r15 = r20
            r3 = r36
            r8 = r4
            r4 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzamd) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
            goto L_0x0d72
        L_0x0d4f:
            r8 = r4
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzb r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzajc.zzb) r0
            r0.zza()
            com.google.android.gms.internal.firebase-auth-api.zzaiv<com.google.android.gms.internal.firebase-auth-api.zzajc$zze> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0d5e:
            r12 = r2
            r8 = r4
            r15 = r20
            com.google.android.gms.internal.firebase-auth-api.zzamd r4 = zze((java.lang.Object) r33)
            r0 = r14
            r1 = r34
            r2 = r11
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzamd) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r5)
        L_0x0d72:
            r4 = r36
            r5 = r6
            r2 = r7
            r7 = r8
            r6 = r9
            r9 = r12
            r11 = r14
            r3 = r15
            r14 = r26
            r8 = r0
            r15 = r13
            r13 = r18
            goto L_0x001c
        L_0x0d83:
            r12 = r2
            r6 = r32
            r5 = r37
            r2 = r7
            r9 = r12
            r15 = r13
            r11 = r14
            r13 = r18
            r10 = r19
            r3 = r20
            r14 = r26
            r7 = r4
            r4 = r36
            goto L_0x001c
        L_0x0d99:
            r15 = r3
            r9 = r6
            r10 = r7
            r18 = r13
            r26 = r14
            r6 = r5
        L_0x0da1:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == r0) goto L_0x0daa
            long r0 = (long) r14
            r15.putInt(r10, r0, r13)
        L_0x0daa:
            r0 = 0
            int r1 = r9.zzm
            r3 = r0
            r7 = r1
        L_0x0daf:
            int r0 = r9.zzn
            if (r7 >= r0) goto L_0x0dc9
            int[] r0 = r9.zzl
            r2 = r0[r7]
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r4 = r9.zzq
            r0 = r32
            r1 = r33
            r5 = r33
            java.lang.Object r0 = r0.zza((java.lang.Object) r1, (int) r2, r3, r4, (java.lang.Object) r5)
            r3 = r0
            com.google.android.gms.internal.firebase-auth-api.zzamd r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzamd) r3
            int r7 = r7 + 1
            goto L_0x0daf
        L_0x0dc9:
            if (r3 == 0) goto L_0x0dd0
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r9.zzq
            r0.zzb((java.lang.Object) r10, r3)
        L_0x0dd0:
            if (r6 != 0) goto L_0x0ddc
            r0 = r36
            if (r8 != r0) goto L_0x0dd7
            goto L_0x0de2
        L_0x0dd7:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzg()
            throw r0
        L_0x0ddc:
            r0 = r36
            if (r8 > r0) goto L_0x0de3
            if (r11 != r6) goto L_0x0de3
        L_0x0de2:
            return r8
        L_0x0de3:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzahk):int");
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.p001firebaseauthapi.zzakr<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p001firebaseauthapi.zzakl r33, com.google.android.gms.internal.p001firebaseauthapi.zzakv r34, com.google.android.gms.internal.p001firebaseauthapi.zzajs r35, com.google.android.gms.internal.p001firebaseauthapi.zzame<?, ?> r36, com.google.android.gms.internal.p001firebaseauthapi.zzaiq<?> r37, com.google.android.gms.internal.p001firebaseauthapi.zzakg r38) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzald
            if (r1 == 0) goto L_0x03f5
            com.google.android.gms.internal.firebase-auth-api.zzald r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzald) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 1
            if (r4 < r5) goto L_0x0026
            r4 = 1
        L_0x001c:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0027
            r4 = r7
            goto L_0x001c
        L_0x0026:
            r7 = 1
        L_0x0027:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0046
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0033:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0043
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0033
        L_0x0043:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0046:
            if (r7 != 0) goto L_0x0057
            int[] r7 = zza
            r17 = r7
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            goto L_0x0167
        L_0x0057:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0063:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0073
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0063
        L_0x0073:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0076:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0095
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0082:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0092
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0082
        L_0x0092:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0095:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a1
        L_0x00b1:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b4:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 << 1
            int r16 = r16 + r7
            r7 = r4
            r17 = r13
            r18 = r14
            r4 = r15
            r13 = r9
            r14 = r10
        L_0x0167:
            sun.misc.Unsafe r9 = zzb
            java.lang.Object[] r10 = r0.zze()
            com.google.android.gms.internal.firebase-auth-api.zzakn r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r3 = r11 * 3
            int[] r3 = new int[r3]
            int r11 = r11 << r6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r19 = r18 + r12
            r21 = r18
            r22 = r19
            r12 = 0
            r20 = 0
        L_0x0185:
            if (r4 >= r2) goto L_0x03cf
            int r23 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01ad
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r23
            r23 = 13
        L_0x0195:
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01a7
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r23
            r4 = r4 | r8
            int r23 = r23 + 13
            r8 = r24
            goto L_0x0195
        L_0x01a7:
            int r8 = r8 << r23
            r4 = r4 | r8
            r8 = r24
            goto L_0x01af
        L_0x01ad:
            r8 = r23
        L_0x01af:
            int r23 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01d5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L_0x01bd:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L_0x01cf
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r23
            r8 = r8 | r6
            int r23 = r23 + 13
            r6 = r25
            goto L_0x01bd
        L_0x01cf:
            int r6 = r6 << r23
            r8 = r8 | r6
            r6 = r25
            goto L_0x01d7
        L_0x01d5:
            r6 = r23
        L_0x01d7:
            r5 = r8 & 255(0xff, float:3.57E-43)
            r25 = r2
            r2 = r8 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x01e5
            int r2 = r20 + 1
            r17[r20] = r12
            r20 = r2
        L_0x01e5:
            r2 = 51
            r28 = r14
            if (r5 < r2) goto L_0x0289
            int r2 = r6 + 1
            char r6 = r1.charAt(r6)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0214
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x01fa:
            int r30 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r14) goto L_0x020f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r29
            r6 = r6 | r2
            int r29 = r29 + 13
            r2 = r30
            r14 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fa
        L_0x020f:
            int r2 = r2 << r29
            r6 = r6 | r2
            r2 = r30
        L_0x0214:
            int r14 = r5 + -51
            r29 = r2
            r2 = 9
            if (r14 == r2) goto L_0x0243
            r2 = 17
            if (r14 != r2) goto L_0x0221
            goto L_0x0243
        L_0x0221:
            r2 = 12
            if (r14 != r2) goto L_0x0241
            com.google.android.gms.internal.firebase-auth-api.zzaky r2 = r0.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzaky r14 = com.google.android.gms.internal.p001firebaseauthapi.zzaky.PROTO2
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x0235
            r2 = r8 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0241
        L_0x0235:
            int r2 = r12 / 3
            r14 = 1
            int r2 = r2 << r14
            int r2 = r2 + r14
            int r24 = r16 + 1
            r16 = r10[r16]
            r11[r2] = r16
            goto L_0x024e
        L_0x0241:
            r14 = 1
            goto L_0x0250
        L_0x0243:
            r14 = 1
            int r2 = r12 / 3
            int r2 = r2 << r14
            int r2 = r2 + r14
            int r24 = r16 + 1
            r16 = r10[r16]
            r11[r2] = r16
        L_0x024e:
            r16 = r24
        L_0x0250:
            int r2 = r6 << 1
            r6 = r10[r2]
            boolean r14 = r6 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x025b
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x0263
        L_0x025b:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = zza((java.lang.Class<?>) r15, (java.lang.String) r6)
            r10[r2] = r6
        L_0x0263:
            r30 = r13
            long r13 = r9.objectFieldOffset(r6)
            int r6 = (int) r13
            int r2 = r2 + 1
            r13 = r10[r2]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0275
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x027d
        L_0x0275:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zza((java.lang.Class<?>) r15, (java.lang.String) r13)
            r10[r2] = r13
        L_0x027d:
            long r13 = r9.objectFieldOffset(r13)
            int r2 = (int) r13
            r26 = r0
            r27 = r29
            r0 = 0
            goto L_0x0392
        L_0x0289:
            r30 = r13
            int r2 = r16 + 1
            r13 = r10[r16]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zza((java.lang.Class<?>) r15, (java.lang.String) r13)
            r14 = 9
            if (r5 == r14) goto L_0x030b
            r14 = 17
            if (r5 != r14) goto L_0x029f
            goto L_0x030b
        L_0x029f:
            r14 = 27
            if (r5 == r14) goto L_0x02fb
            r14 = 49
            if (r5 != r14) goto L_0x02a8
            goto L_0x02fb
        L_0x02a8:
            r14 = 12
            if (r5 == r14) goto L_0x02e1
            r14 = 30
            if (r5 == r14) goto L_0x02e1
            r14 = 44
            if (r5 != r14) goto L_0x02b5
            goto L_0x02e1
        L_0x02b5:
            r14 = 50
            if (r5 != r14) goto L_0x02de
            int r14 = r21 + 1
            r17[r21] = r12
            int r21 = r12 / 3
            r24 = 1
            int r21 = r21 << 1
            int r26 = r2 + 1
            r2 = r10[r2]
            r11[r21] = r2
            r2 = r8 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02da
            int r21 = r21 + 1
            int r2 = r26 + 1
            r26 = r10[r26]
            r11[r21] = r26
            r26 = r0
            r21 = r14
            goto L_0x0318
        L_0x02da:
            r21 = r14
            r2 = r26
        L_0x02de:
            r26 = r0
            goto L_0x0318
        L_0x02e1:
            com.google.android.gms.internal.firebase-auth-api.zzaky r14 = r0.zzb()
            r26 = r0
            com.google.android.gms.internal.firebase-auth-api.zzaky r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaky.PROTO2
            if (r14 == r0) goto L_0x02ef
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0318
        L_0x02ef:
            int r0 = r12 / 3
            r14 = 1
            int r0 = r0 << r14
            int r0 = r0 + r14
            int r24 = r2 + 1
            r2 = r10[r2]
            r11[r0] = r2
            goto L_0x0308
        L_0x02fb:
            r26 = r0
            r14 = 1
            int r0 = r12 / 3
            int r0 = r0 << r14
            int r0 = r0 + r14
            int r24 = r2 + 1
            r2 = r10[r2]
            r11[r0] = r2
        L_0x0308:
            r2 = r24
            goto L_0x0318
        L_0x030b:
            r26 = r0
            r14 = 1
            int r0 = r12 / 3
            int r0 = r0 << r14
            int r0 = r0 + r14
            java.lang.Class r14 = r13.getType()
            r11[r0] = r14
        L_0x0318:
            long r13 = r9.objectFieldOffset(r13)
            int r0 = (int) r13
            r13 = r8 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0323
            r14 = 1
            goto L_0x0324
        L_0x0323:
            r14 = 0
        L_0x0324:
            if (r14 == 0) goto L_0x0372
            r13 = 17
            if (r5 > r13) goto L_0x0372
            int r13 = r6 + 1
            char r6 = r1.charAt(r6)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x034f
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L_0x0339:
            int r27 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r14) goto L_0x034b
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r23
            r6 = r6 | r13
            int r23 = r23 + 13
            r13 = r27
            goto L_0x0339
        L_0x034b:
            int r13 = r13 << r23
            r6 = r6 | r13
            goto L_0x0351
        L_0x034f:
            r27 = r13
        L_0x0351:
            r13 = 1
            int r23 = r7 << 1
            int r24 = r6 / 32
            int r23 = r23 + r24
            r13 = r10[r23]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0361
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0369
        L_0x0361:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zza((java.lang.Class<?>) r15, (java.lang.String) r13)
            r10[r23] = r13
        L_0x0369:
            long r13 = r9.objectFieldOffset(r13)
            int r14 = (int) r13
            int r6 = r6 % 32
            r13 = r14
            goto L_0x0378
        L_0x0372:
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r6
            r6 = 0
        L_0x0378:
            r14 = 18
            if (r5 < r14) goto L_0x038a
            r14 = 49
            if (r5 > r14) goto L_0x038a
            int r14 = r22 + 1
            r17[r22] = r0
            r16 = r2
            r2 = r13
            r22 = r14
            goto L_0x038d
        L_0x038a:
            r16 = r2
            r2 = r13
        L_0x038d:
            r31 = r6
            r6 = r0
            r0 = r31
        L_0x0392:
            int r13 = r12 + 1
            r3[r12] = r4
            int r4 = r13 + 1
            r12 = r8 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x039f
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a0
        L_0x039f:
            r12 = 0
        L_0x03a0:
            r14 = r8 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x03a7
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a8
        L_0x03a7:
            r14 = 0
        L_0x03a8:
            r12 = r12 | r14
            r8 = r8 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x03b0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03b1
        L_0x03b0:
            r8 = 0
        L_0x03b1:
            r8 = r8 | r12
            int r5 = r5 << 20
            r5 = r5 | r8
            r5 = r5 | r6
            r3[r13] = r5
            int r12 = r4 + 1
            int r0 = r0 << 20
            r0 = r0 | r2
            r3[r4] = r0
            r2 = r25
            r0 = r26
            r4 = r27
            r14 = r28
            r13 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 1
            goto L_0x0185
        L_0x03cf:
            r26 = r0
            r30 = r13
            r28 = r14
            com.google.android.gms.internal.firebase-auth-api.zzakr r0 = new com.google.android.gms.internal.firebase-auth-api.zzakr
            com.google.android.gms.internal.firebase-auth-api.zzakn r14 = r26.zza()
            com.google.android.gms.internal.firebase-auth-api.zzaky r15 = r26.zzb()
            r16 = 0
            r9 = r0
            r10 = r3
            r12 = r30
            r13 = r28
            r20 = r34
            r21 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x03f5:
            com.google.android.gms.internal.firebase-auth-api.zzalx r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzalx) r0
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzakl, com.google.android.gms.internal.firebase-auth-api.zzakv, com.google.android.gms.internal.firebase-auth-api.zzajs, com.google.android.gms.internal.firebase-auth-api.zzame, com.google.android.gms.internal.firebase-auth-api.zzaiq, com.google.android.gms.internal.firebase-auth-api.zzakg):com.google.android.gms.internal.firebase-auth-api.zzakr");
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzame<UT, UB> zzame, Object obj2) {
        zzajg zzd2;
        int i11 = this.zzc[i10];
        Object zze2 = zzamk.zze(obj, (long) (zzc(i10) & 1048575));
        if (zze2 == null || (zzd2 = zzd(i10)) == null) {
            return ub2;
        }
        return zza(i10, i11, this.zzs.zze(zze2), zzd2, ub2, zzame, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzajg zzajg, UB ub2, zzame<UT, UB> zzame, Object obj) {
        zzake<?, ?> zza2 = this.zzs.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzajg.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzame.zzc(obj);
                }
                zzahu zzc2 = zzahp.zzc(zzakf.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzakf.zza(zzc2.zzb(), zza2, next.getKey(), next.getValue());
                    zzame.zza(ub2, i11, zzc2.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private final Object zza(T t10, int i10) {
        zzalf zze2 = zze(i10);
        long zzc2 = (long) (zzc(i10) & 1048575);
        if (!zzc(t10, i10)) {
            return zze2.zza();
        }
        Object object = zzb.getObject(t10, zzc2);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze2.zza();
        if (object != null) {
            zze2.zza(zza2, object);
        }
        return zza2;
    }

    private final Object zza(T t10, int i10, int i11) {
        zzalf zze2 = zze(i11);
        if (!zzc(t10, i10, i11)) {
            return zze2.zza();
        }
        Object object = zzb.getObject(t10, (long) (zzc(i11) & 1048575));
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze2.zza();
        if (object != null) {
            zze2.zza(zza2, object);
        }
        return zza2;
    }

    public final T zza() {
        return this.zzo.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public final void zza(T t10, T t11) {
        zzf((Object) t10);
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc2 = zzc(i10);
            long j10 = (long) (1048575 & zzc2);
            int i11 = this.zzc[i10];
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zza((Object) t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 1:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzb(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 2:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 3:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 4:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 5:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 6:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 7:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zzc((Object) t10, j10, zzamk.zzh(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 8:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zze(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 9:
                    zza(t10, t11, i10);
                    break;
                case 10:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zze(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 11:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 12:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 13:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 14:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 15:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 16:
                    if (!zzc(t11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                        zzb(t10, i10);
                        break;
                    }
                case 17:
                    zza(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t10, t11, j10);
                    break;
                case 50:
                    zzalh.zza(this.zzs, t10, t11, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzc(t11, i11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zze(t11, j10));
                        zzb(t10, i11, i10);
                        break;
                    }
                case 60:
                    zzb(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzc(t11, i11, i10)) {
                        break;
                    } else {
                        zzamk.zza((Object) t10, j10, zzamk.zze(t11, j10));
                        zzb(t10, i11, i10);
                        break;
                    }
                case 68:
                    zzb(t10, t11, i10);
                    break;
            }
        }
        zzalh.zza(this.zzq, t10, t11);
        if (this.zzh) {
            zzalh.zza(this.zzr, t10, t11);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:94|93|154|167|168|(1:170)|171|(5:193|173|(2:176|174)|201|(2:178|209)(1:210))|166|149|150|197|191) */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x05e8, code lost:
        r15 = r9;
        r5 = r11;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017d, code lost:
        r13 = r4;
        r11 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0297, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x061f */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0624 A[Catch:{ all -> 0x0297 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x065b A[LOOP:5: B:185:0x0657->B:187:0x065b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x062f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r18, com.google.android.gms.internal.p001firebaseauthapi.zzalc r19, com.google.android.gms.internal.p001firebaseauthapi.zzaio r20) throws java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r15 = r18
            r0 = r19
            r6 = r20
            java.util.Objects.requireNonNull(r20)
            zzf((java.lang.Object) r18)
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r14 = r7.zzq
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r5 = r7.zzr
            r16 = 0
            r4 = r16
            r8 = r4
        L_0x0017:
            int r2 = r19.zzc()     // Catch:{ all -> 0x0650 }
            int r1 = r7.zza((int) r2)     // Catch:{ all -> 0x0650 }
            if (r1 >= 0) goto L_0x00af
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0044
            int r0 = r7.zzm
        L_0x0028:
            int r1 = r7.zzn
            if (r0 >= r1) goto L_0x003e
            int[] r1 = r7.zzl
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r14
            r6 = r18
            java.lang.Object r4 = r1.zza((java.lang.Object) r2, (int) r3, r4, r5, (java.lang.Object) r6)
            int r0 = r0 + 1
            goto L_0x0028
        L_0x003e:
            if (r4 == 0) goto L_0x0043
            r14.zzb((java.lang.Object) r15, r4)
        L_0x0043:
            return
        L_0x0044:
            boolean r1 = r7.zzh     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x004b
            r11 = r16
            goto L_0x0052
        L_0x004b:
            com.google.android.gms.internal.firebase-auth-api.zzakn r1 = r7.zzg     // Catch:{ all -> 0x00ac }
            java.lang.Object r1 = r5.zza(r6, r1, r2)     // Catch:{ all -> 0x00ac }
            r11 = r1
        L_0x0052:
            if (r11 == 0) goto L_0x0070
            if (r8 != 0) goto L_0x005b
            com.google.android.gms.internal.firebase-auth-api.zzaiv r1 = r5.zzb(r15)     // Catch:{ all -> 0x00ac }
            goto L_0x005c
        L_0x005b:
            r1 = r8
        L_0x005c:
            r8 = r5
            r9 = r18
            r10 = r19
            r12 = r20
            r13 = r1
            r3 = r14
            r14 = r4
            r2 = r15
            r15 = r3
            java.lang.Object r4 = r8.zza(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00a7 }
            r8 = r1
        L_0x006d:
            r15 = r2
            r14 = r3
            goto L_0x0017
        L_0x0070:
            r3 = r14
            r2 = r15
            r3.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x007c
            java.lang.Object r1 = r3.zzc(r2)     // Catch:{ all -> 0x00a7 }
            r4 = r1
        L_0x007c:
            boolean r1 = r3.zza(r4, (com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x006d
            int r0 = r7.zzm
        L_0x0084:
            int r1 = r7.zzn
            if (r0 >= r1) goto L_0x009f
            int[] r1 = r7.zzl
            r5 = r1[r0]
            r1 = r17
            r9 = r2
            r2 = r18
            r10 = r3
            r3 = r5
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zza((java.lang.Object) r2, (int) r3, r4, r5, (java.lang.Object) r6)
            int r0 = r0 + 1
            r2 = r9
            r3 = r10
            goto L_0x0084
        L_0x009f:
            r9 = r2
            r10 = r3
            if (r4 == 0) goto L_0x00a6
            r10.zzb((java.lang.Object) r9, r4)
        L_0x00a6:
            return
        L_0x00a7:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x0654
        L_0x00ac:
            r0 = move-exception
            goto L_0x0652
        L_0x00af:
            r10 = r14
            r9 = r15
            int r3 = r7.zzc((int) r1)     // Catch:{ all -> 0x064d }
            r11 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = r11 & r3
            int r11 = r11 >>> 20
            r12 = 1048575(0xfffff, float:1.469367E-39)
            switch(r11) {
                case 0: goto L_0x05d8;
                case 1: goto L_0x05c7;
                case 2: goto L_0x05b6;
                case 3: goto L_0x05a5;
                case 4: goto L_0x0594;
                case 5: goto L_0x0583;
                case 6: goto L_0x0571;
                case 7: goto L_0x055f;
                case 8: goto L_0x0554;
                case 9: goto L_0x053f;
                case 10: goto L_0x052d;
                case 11: goto L_0x051b;
                case 12: goto L_0x04f6;
                case 13: goto L_0x04e4;
                case 14: goto L_0x04d2;
                case 15: goto L_0x04c0;
                case 16: goto L_0x04ae;
                case 17: goto L_0x0499;
                case 18: goto L_0x0488;
                case 19: goto L_0x0477;
                case 20: goto L_0x0466;
                case 21: goto L_0x0455;
                case 22: goto L_0x0444;
                case 23: goto L_0x0433;
                case 24: goto L_0x0422;
                case 25: goto L_0x0411;
                case 26: goto L_0x03ec;
                case 27: goto L_0x03d7;
                case 28: goto L_0x03c6;
                case 29: goto L_0x03b5;
                case 30: goto L_0x0399;
                case 31: goto L_0x0388;
                case 32: goto L_0x0377;
                case 33: goto L_0x0366;
                case 34: goto L_0x0355;
                case 35: goto L_0x0344;
                case 36: goto L_0x0333;
                case 37: goto L_0x0322;
                case 38: goto L_0x0311;
                case 39: goto L_0x0300;
                case 40: goto L_0x02ef;
                case 41: goto L_0x02de;
                case 42: goto L_0x02cd;
                case 43: goto L_0x02bc;
                case 44: goto L_0x029a;
                case 45: goto L_0x0289;
                case 46: goto L_0x027b;
                case 47: goto L_0x026d;
                case 48: goto L_0x025f;
                case 49: goto L_0x024d;
                case 50: goto L_0x020b;
                case 51: goto L_0x01f9;
                case 52: goto L_0x01e8;
                case 53: goto L_0x01d7;
                case 54: goto L_0x01c6;
                case 55: goto L_0x01b5;
                case 56: goto L_0x01a4;
                case 57: goto L_0x0193;
                case 58: goto L_0x0182;
                case 59: goto L_0x0177;
                case 60: goto L_0x0166;
                case 61: goto L_0x0159;
                case 62: goto L_0x0148;
                case 63: goto L_0x0123;
                case 64: goto L_0x0112;
                case 65: goto L_0x0101;
                case 66: goto L_0x00ef;
                case 67: goto L_0x00dd;
                case 68: goto L_0x00cb;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            r13 = r4
            r11 = r5
            r14 = r6
            if (r13 != 0) goto L_0x05f7
            java.lang.Object r1 = r10.zzc(r9)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05f3
        L_0x00cb:
            java.lang.Object r3 = r7.zza(r9, (int) r2, (int) r1)     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzakn r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzakn) r3     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzalf r11 = r7.zze((int) r1)     // Catch:{  }
            r0.zza(r3, r11, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r6)     // Catch:{  }
            r7.zza(r9, (int) r2, (int) r1, (java.lang.Object) r3)     // Catch:{  }
            goto L_0x017d
        L_0x00dd:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            long r13 = r19.zzn()     // Catch:{  }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x00ef:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            int r3 = r19.zzi()     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0101:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            long r13 = r19.zzm()     // Catch:{  }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0112:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            int r3 = r19.zzh()     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0123:
            int r11 = r19.zze()     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzajg r13 = r7.zzd((int) r1)     // Catch:{  }
            if (r13 == 0) goto L_0x013b
            boolean r13 = r13.zza(r11)     // Catch:{  }
            if (r13 == 0) goto L_0x0134
            goto L_0x013b
        L_0x0134:
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(r9, r2, r11, r4, r10)     // Catch:{  }
            r15 = r9
            goto L_0x05ec
        L_0x013b:
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r12, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0148:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            int r3 = r19.zzj()     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0159:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzahp r3 = r19.zzp()     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0166:
            java.lang.Object r3 = r7.zza(r9, (int) r2, (int) r1)     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzakn r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzakn) r3     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzalf r11 = r7.zze((int) r1)     // Catch:{  }
            r0.zzb(r3, r11, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r6)     // Catch:{  }
            r7.zza(r9, (int) r2, (int) r1, (java.lang.Object) r3)     // Catch:{  }
            goto L_0x017d
        L_0x0177:
            r7.zza((java.lang.Object) r9, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
        L_0x017d:
            r13 = r4
            r11 = r5
            r14 = r6
            goto L_0x05e8
        L_0x0182:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            boolean r3 = r19.zzs()     // Catch:{  }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x0193:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            int r3 = r19.zzf()     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x01a4:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            long r13 = r19.zzk()     // Catch:{  }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x01b5:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            int r3 = r19.zzg()     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x01c6:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            long r13 = r19.zzo()     // Catch:{  }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x01d7:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            long r13 = r19.zzl()     // Catch:{  }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x01e8:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            float r3 = r19.zzb()     // Catch:{  }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x01f9:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{  }
            double r13 = r19.zza()     // Catch:{  }
            java.lang.Double r3 = java.lang.Double.valueOf(r13)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r7.zzb(r9, (int) r2, (int) r1)     // Catch:{  }
            goto L_0x017d
        L_0x020b:
            java.lang.Object r2 = r7.zzf((int) r1)     // Catch:{  }
            int r1 = r7.zzc((int) r1)     // Catch:{  }
            r1 = r1 & r12
            long r11 = (long) r1     // Catch:{  }
            java.lang.Object r1 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r9, r11)     // Catch:{  }
            if (r1 != 0) goto L_0x0225
            com.google.android.gms.internal.firebase-auth-api.zzakg r1 = r7.zzs     // Catch:{  }
            java.lang.Object r1 = r1.zzb(r2)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r1)     // Catch:{  }
            goto L_0x023c
        L_0x0225:
            com.google.android.gms.internal.firebase-auth-api.zzakg r3 = r7.zzs     // Catch:{  }
            boolean r3 = r3.zzf(r1)     // Catch:{  }
            if (r3 == 0) goto L_0x023c
            com.google.android.gms.internal.firebase-auth-api.zzakg r3 = r7.zzs     // Catch:{  }
            java.lang.Object r3 = r3.zzb(r2)     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzakg r13 = r7.zzs     // Catch:{  }
            r13.zza(r3, r1)     // Catch:{  }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r11, (java.lang.Object) r3)     // Catch:{  }
            r1 = r3
        L_0x023c:
            com.google.android.gms.internal.firebase-auth-api.zzakg r3 = r7.zzs     // Catch:{  }
            java.util.Map r1 = r3.zze(r1)     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzakg r3 = r7.zzs     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzake r2 = r3.zza(r2)     // Catch:{  }
            r0.zza(r1, r2, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r6)     // Catch:{  }
            goto L_0x017d
        L_0x024d:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r7.zze((int) r1)     // Catch:{  }
            com.google.android.gms.internal.firebase-auth-api.zzajs r11 = r7.zzp     // Catch:{  }
            java.util.List r2 = r11.zza(r9, r2)     // Catch:{  }
            r0.zza(r2, r1, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r6)     // Catch:{  }
            goto L_0x017d
        L_0x025f:
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{  }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{  }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{  }
            r0.zzm(r1)     // Catch:{  }
            goto L_0x017d
        L_0x026d:
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{  }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{  }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{  }
            r0.zzl(r1)     // Catch:{  }
            goto L_0x017d
        L_0x027b:
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{  }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{  }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{  }
            r0.zzk(r1)     // Catch:{  }
            goto L_0x017d
        L_0x0289:
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{  }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{  }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{  }
            r0.zzj(r1)     // Catch:{  }
            goto L_0x017d
        L_0x0297:
            r0 = move-exception
            goto L_0x0654
        L_0x029a:
            com.google.android.gms.internal.firebase-auth-api.zzajs r11 = r7.zzp     // Catch:{ zzajl -> 0x02b7 }
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ zzajl -> 0x02b7 }
            java.util.List r3 = r11.zza(r9, r12)     // Catch:{ zzajl -> 0x02b7 }
            r0.zzd(r3)     // Catch:{ zzajl -> 0x02b7 }
            com.google.android.gms.internal.firebase-auth-api.zzajg r11 = r7.zzd((int) r1)     // Catch:{ zzajl -> 0x02b7 }
            r1 = r18
            r13 = r4
            r4 = r11
            r11 = r5
            r5 = r13
            r14 = r6
            r6 = r10
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(r1, r2, r3, r4, r5, r6)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x061c
        L_0x02b7:
            r13 = r4
            r11 = r5
            r14 = r6
            goto L_0x05f5
        L_0x02bc:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzp(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x02cd:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zza(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x02de:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zze(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x02ef:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzf(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0300:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzh(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0311:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzq(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0322:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzi(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0333:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzg(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0344:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzc(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0355:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzm(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0366:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzl(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0377:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzk(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0388:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzj(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0399:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r4 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r3 = r3 & r12
            long r5 = (long) r3     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r3 = r4.zza(r9, r5)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzd(r3)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzajg r4 = r7.zzd((int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r1 = r18
            r5 = r13
            r6 = r10
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(r1, r2, r3, r4, r5, r6)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x061c
        L_0x03b5:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzp(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x03c6:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzb(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x03d7:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r7.zze((int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzajs r4 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r2 = r4.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzb(r2, r1, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r14)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x03ec:
            r13 = r4
            r11 = r5
            r14 = r6
            boolean r1 = zzg((int) r3)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            if (r1 == 0) goto L_0x0403
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzo(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0403:
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzn(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0411:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zza(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0422:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zze(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0433:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzf(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0444:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzh(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0455:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzq(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0466:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzi(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0477:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzg(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0488:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzajs r1 = r7.zzp     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzc(r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0499:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.zza(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzakn r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzakn) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzalf r3 = r7.zze((int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zza(r2, r3, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r14)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zza(r9, (int) r1, (java.lang.Object) r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x04ae:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            long r4 = r19.zzn()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (long) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x04c0:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            int r4 = r19.zzi()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (int) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x04d2:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            long r4 = r19.zzm()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (long) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x04e4:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            int r4 = r19.zzh()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (int) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x04f6:
            r13 = r4
            r11 = r5
            r14 = r6
            int r4 = r19.zze()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzajg r5 = r7.zzd((int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            if (r5 == 0) goto L_0x0510
            boolean r5 = r5.zza(r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            if (r5 == 0) goto L_0x050a
            goto L_0x0510
        L_0x050a:
            java.lang.Object r4 = com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza(r9, r2, r4, r13, r10)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x061c
        L_0x0510:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (int) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x051b:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            int r4 = r19.zzj()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (int) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x052d:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzahp r4 = r19.zzp()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (java.lang.Object) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x053f:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.zza(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzakn r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzakn) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.firebase-auth-api.zzalf r3 = r7.zze((int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r0.zzb(r2, r3, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r14)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zza(r9, (int) r1, (java.lang.Object) r2)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0554:
            r13 = r4
            r11 = r5
            r14 = r6
            r7.zza((java.lang.Object) r9, (int) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x055f:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            boolean r4 = r19.zzs()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc((java.lang.Object) r9, (long) r2, (boolean) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0571:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            int r4 = r19.zzf()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (int) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0583:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            long r4 = r19.zzk()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (long) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x0594:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            int r4 = r19.zzg()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (int) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x05a5:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            long r4 = r19.zzo()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (long) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x05b6:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            long r4 = r19.zzl()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (long) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x05c7:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            float r4 = r19.zzb()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (float) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            goto L_0x05e8
        L_0x05d8:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            double r4 = r19.zza()     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r9, (long) r2, (double) r4)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
            r7.zzb(r9, (int) r1)     // Catch:{ zzajl -> 0x05f5, all -> 0x05ef }
        L_0x05e8:
            r15 = r9
            r5 = r11
            r4 = r13
        L_0x05eb:
            r6 = r14
        L_0x05ec:
            r14 = r10
            goto L_0x0017
        L_0x05ef:
            r0 = move-exception
            r4 = r13
            goto L_0x0654
        L_0x05f3:
            r4 = r1
            goto L_0x05f8
        L_0x05f5:
            r4 = r13
            goto L_0x061f
        L_0x05f7:
            r4 = r13
        L_0x05f8:
            boolean r1 = r10.zza(r4, (com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{ zzajl -> 0x061f }
            if (r1 != 0) goto L_0x061c
            int r0 = r7.zzm
        L_0x0600:
            int r1 = r7.zzn
            if (r0 >= r1) goto L_0x0616
            int[] r1 = r7.zzl
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zza((java.lang.Object) r2, (int) r3, r4, r5, (java.lang.Object) r6)
            int r0 = r0 + 1
            goto L_0x0600
        L_0x0616:
            if (r4 == 0) goto L_0x061b
            r10.zzb((java.lang.Object) r9, r4)
        L_0x061b:
            return
        L_0x061c:
            r15 = r9
            r5 = r11
            goto L_0x05eb
        L_0x061f:
            r10.zza((com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{ all -> 0x0297 }
            if (r4 != 0) goto L_0x0629
            java.lang.Object r1 = r10.zzc(r9)     // Catch:{ all -> 0x0297 }
            r4 = r1
        L_0x0629:
            boolean r1 = r10.zza(r4, (com.google.android.gms.internal.p001firebaseauthapi.zzalc) r0)     // Catch:{ all -> 0x0297 }
            if (r1 != 0) goto L_0x061c
            int r0 = r7.zzm
        L_0x0631:
            int r1 = r7.zzn
            if (r0 >= r1) goto L_0x0647
            int[] r1 = r7.zzl
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zza((java.lang.Object) r2, (int) r3, r4, r5, (java.lang.Object) r6)
            int r0 = r0 + 1
            goto L_0x0631
        L_0x0647:
            if (r4 == 0) goto L_0x064c
            r10.zzb((java.lang.Object) r9, r4)
        L_0x064c:
            return
        L_0x064d:
            r0 = move-exception
            r13 = r4
            goto L_0x0654
        L_0x0650:
            r0 = move-exception
            r13 = r4
        L_0x0652:
            r10 = r14
            r9 = r15
        L_0x0654:
            int r1 = r7.zzm
            r8 = r1
        L_0x0657:
            int r1 = r7.zzn
            if (r8 >= r1) goto L_0x066d
            int[] r1 = r7.zzl
            r3 = r1[r8]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zza((java.lang.Object) r2, (int) r3, r4, r5, (java.lang.Object) r6)
            int r8 = r8 + 1
            goto L_0x0657
        L_0x066d:
            if (r4 == 0) goto L_0x0672
            r10.zzb((java.lang.Object) r9, r4)
        L_0x0672:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzalc, com.google.android.gms.internal.firebase-auth-api.zzaio):void");
    }

    public final void zza(T t10, byte[] bArr, int i10, int i11, zzahk zzahk) throws IOException {
        zza(t10, bArr, i10, i11, 0, zzahk);
    }

    private final void zza(T t10, T t11, int i10) {
        if (zzc(t11, i10)) {
            long zzc2 = (long) (zzc(i10) & 1048575);
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc2);
            if (object != null) {
                zzalf zze2 = zze(i10);
                if (!zzc(t10, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, zzc2, object);
                    } else {
                        Object zza2 = zze2.zza();
                        zze2.zza(zza2, object);
                        unsafe.putObject(t10, zzc2, zza2);
                    }
                    zzb(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, zzc2);
                if (!zzg(object2)) {
                    Object zza3 = zze2.zza();
                    zze2.zza(zza3, object2);
                    unsafe.putObject(t10, zzc2, zza3);
                    object2 = zza3;
                }
                zze2.zza(object2, object);
                return;
            }
            int i11 = this.zzc[i10];
            String valueOf = String.valueOf(t11);
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + valueOf);
        }
    }

    private final void zza(Object obj, int i10, zzalc zzalc) throws IOException {
        if (zzg(i10)) {
            zzamk.zza(obj, (long) (i10 & 1048575), (Object) zzalc.zzr());
        } else if (this.zzi) {
            zzamk.zza(obj, (long) (i10 & 1048575), (Object) zzalc.zzq());
        } else {
            zzamk.zza(obj, (long) (i10 & 1048575), (Object) zzalc.zzp());
        }
    }

    private final void zza(T t10, int i10, Object obj) {
        zzb.putObject(t10, (long) (zzc(i10) & 1048575), obj);
        zzb(t10, i10);
    }

    private final void zza(T t10, int i10, int i11, Object obj) {
        zzb.putObject(t10, (long) (zzc(i11) & 1048575), obj);
        zzb(t10, i10, i11);
    }

    private final <K, V> void zza(zzana zzana, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            zzana.zza(i10, this.zzs.zza(zzf(i11)), this.zzs.zzd(obj));
        }
    }

    private static void zza(int i10, Object obj, zzana zzana) throws IOException {
        if (obj instanceof String) {
            zzana.zza(i10, (String) obj);
        } else {
            zzana.zza(i10, (zzahp) obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0b90  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r24, com.google.android.gms.internal.p001firebaseauthapi.zzana r25) throws java.io.IOException {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            int r0 = r25.zza()
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzand.zzb
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = 1
            r12 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x052d
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r6.zzq
            zza(r0, r7, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r6.zzr
            com.google.android.gms.internal.firebase-auth-api.zzaiv r0 = r0.zza((java.lang.Object) r7)
            com.google.android.gms.internal.firebase-auth-api.zzalg<T, java.lang.Object> r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0037
            java.util.Iterator r0 = r0.zzc()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0039
        L_0x0037:
            r0 = 0
            r1 = 0
        L_0x0039:
            int[] r2 = r6.zzc
            int r2 = r2.length
            int r2 = r2 + -3
        L_0x003e:
            if (r2 < 0) goto L_0x0516
            int r3 = r6.zzc((int) r2)
            int[] r4 = r6.zzc
            r4 = r4[r2]
        L_0x0048:
            if (r1 == 0) goto L_0x0066
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r5 = r6.zzr
            int r5 = r5.zza((java.util.Map.Entry<?, ?>) r1)
            if (r5 <= r4) goto L_0x0066
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r5 = r6.zzr
            r5.zza(r8, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0048
        L_0x0064:
            r1 = 0
            goto L_0x0048
        L_0x0066:
            r5 = r3 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L_0x0503;
                case 1: goto L_0x04f3;
                case 2: goto L_0x04e3;
                case 3: goto L_0x04d3;
                case 4: goto L_0x04c3;
                case 5: goto L_0x04b3;
                case 6: goto L_0x04a3;
                case 7: goto L_0x0492;
                case 8: goto L_0x0481;
                case 9: goto L_0x046c;
                case 10: goto L_0x0459;
                case 11: goto L_0x0448;
                case 12: goto L_0x0437;
                case 13: goto L_0x0426;
                case 14: goto L_0x0415;
                case 15: goto L_0x0404;
                case 16: goto L_0x03f3;
                case 17: goto L_0x03de;
                case 18: goto L_0x03cd;
                case 19: goto L_0x03bc;
                case 20: goto L_0x03ab;
                case 21: goto L_0x039a;
                case 22: goto L_0x0389;
                case 23: goto L_0x0378;
                case 24: goto L_0x0367;
                case 25: goto L_0x0356;
                case 26: goto L_0x0345;
                case 27: goto L_0x0330;
                case 28: goto L_0x031f;
                case 29: goto L_0x030e;
                case 30: goto L_0x02fd;
                case 31: goto L_0x02ec;
                case 32: goto L_0x02db;
                case 33: goto L_0x02ca;
                case 34: goto L_0x02b9;
                case 35: goto L_0x02a8;
                case 36: goto L_0x0297;
                case 37: goto L_0x0286;
                case 38: goto L_0x0275;
                case 39: goto L_0x0264;
                case 40: goto L_0x0253;
                case 41: goto L_0x0242;
                case 42: goto L_0x0231;
                case 43: goto L_0x0220;
                case 44: goto L_0x020f;
                case 45: goto L_0x01fe;
                case 46: goto L_0x01ed;
                case 47: goto L_0x01dc;
                case 48: goto L_0x01cb;
                case 49: goto L_0x01b6;
                case 50: goto L_0x01ab;
                case 51: goto L_0x019a;
                case 52: goto L_0x0189;
                case 53: goto L_0x0178;
                case 54: goto L_0x0167;
                case 55: goto L_0x0156;
                case 56: goto L_0x0145;
                case 57: goto L_0x0134;
                case 58: goto L_0x0123;
                case 59: goto L_0x0112;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00ea;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00c8;
                case 64: goto L_0x00b7;
                case 65: goto L_0x00a6;
                case 66: goto L_0x0095;
                case 67: goto L_0x0084;
                case 68: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0512
        L_0x006f:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            com.google.android.gms.internal.firebase-auth-api.zzalf r5 = r6.zze((int) r2)
            r8.zza((int) r4, (java.lang.Object) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r5)
            goto L_0x0512
        L_0x0084:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = zzd(r7, r14)
            r8.zzd((int) r4, (long) r14)
            goto L_0x0512
        L_0x0095:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = zzc(r7, (long) r14)
            r8.zze((int) r4, (int) r3)
            goto L_0x0512
        L_0x00a6:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = zzd(r7, r14)
            r8.zzc((int) r4, (long) r14)
            goto L_0x0512
        L_0x00b7:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = zzc(r7, (long) r14)
            r8.zzd((int) r4, (int) r3)
            goto L_0x0512
        L_0x00c8:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = zzc(r7, (long) r14)
            r8.zza((int) r4, (int) r3)
            goto L_0x0512
        L_0x00d9:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = zzc(r7, (long) r14)
            r8.zzf(r4, r3)
            goto L_0x0512
        L_0x00ea:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            com.google.android.gms.internal.firebase-auth-api.zzahp r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r3
            r8.zza((int) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r3)
            goto L_0x0512
        L_0x00fd:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            com.google.android.gms.internal.firebase-auth-api.zzalf r5 = r6.zze((int) r2)
            r8.zzb((int) r4, (java.lang.Object) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r5)
            goto L_0x0512
        L_0x0112:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            zza((int) r4, (java.lang.Object) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x0512
        L_0x0123:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            boolean r3 = zze(r7, r14)
            r8.zza((int) r4, (boolean) r3)
            goto L_0x0512
        L_0x0134:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = zzc(r7, (long) r14)
            r8.zzb((int) r4, (int) r3)
            goto L_0x0512
        L_0x0145:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = zzd(r7, r14)
            r8.zza((int) r4, (long) r14)
            goto L_0x0512
        L_0x0156:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = zzc(r7, (long) r14)
            r8.zzc((int) r4, (int) r3)
            goto L_0x0512
        L_0x0167:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = zzd(r7, r14)
            r8.zze((int) r4, (long) r14)
            goto L_0x0512
        L_0x0178:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = zzd(r7, r14)
            r8.zzb((int) r4, (long) r14)
            goto L_0x0512
        L_0x0189:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            float r3 = zzb(r7, (long) r14)
            r8.zza((int) r4, (float) r3)
            goto L_0x0512
        L_0x019a:
            boolean r5 = r6.zzc(r7, (int) r4, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            double r14 = zza(r7, (long) r14)
            r8.zza((int) r4, (double) r14)
            goto L_0x0512
        L_0x01ab:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            r6.zza((com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (int) r4, (java.lang.Object) r3, (int) r2)
            goto L_0x0512
        L_0x01b6:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.firebase-auth-api.zzalf r5 = r6.zze((int) r2)
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r4, (java.util.List<?>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r5)
            goto L_0x0512
        L_0x01cb:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzl(r4, r3, r8, r11)
            goto L_0x0512
        L_0x01dc:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzk(r4, r3, r8, r11)
            goto L_0x0512
        L_0x01ed:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzj(r4, r3, r8, r11)
            goto L_0x0512
        L_0x01fe:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzi(r4, r3, r8, r11)
            goto L_0x0512
        L_0x020f:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0220:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzm(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0231:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r4, (java.util.List<java.lang.Boolean>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r11)
            goto L_0x0512
        L_0x0242:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0253:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zze(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0264:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzg(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0275:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzn(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0286:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzh(r4, r3, r8, r11)
            goto L_0x0512
        L_0x0297:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzf(r4, r3, r8, r11)
            goto L_0x0512
        L_0x02a8:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r4, (java.util.List<java.lang.Double>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r11)
            goto L_0x0512
        L_0x02b9:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzl(r4, r3, r8, r12)
            goto L_0x0512
        L_0x02ca:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzk(r4, r3, r8, r12)
            goto L_0x0512
        L_0x02db:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzj(r4, r3, r8, r12)
            goto L_0x0512
        L_0x02ec:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzi(r4, r3, r8, r12)
            goto L_0x0512
        L_0x02fd:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r4, r3, r8, r12)
            goto L_0x0512
        L_0x030e:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzm(r4, r3, r8, r12)
            goto L_0x0512
        L_0x031f:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r4, (java.util.List<com.google.android.gms.internal.p001firebaseauthapi.zzahp>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x0512
        L_0x0330:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.firebase-auth-api.zzalf r5 = r6.zze((int) r2)
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r4, (java.util.List<?>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r5)
            goto L_0x0512
        L_0x0345:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r4, (java.util.List<java.lang.String>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x0512
        L_0x0356:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r4, (java.util.List<java.lang.Boolean>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r12)
            goto L_0x0512
        L_0x0367:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r4, r3, r8, r12)
            goto L_0x0512
        L_0x0378:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zze(r4, r3, r8, r12)
            goto L_0x0512
        L_0x0389:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzg(r4, r3, r8, r12)
            goto L_0x0512
        L_0x039a:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzn(r4, r3, r8, r12)
            goto L_0x0512
        L_0x03ab:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzh(r4, r3, r8, r12)
            goto L_0x0512
        L_0x03bc:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzf(r4, r3, r8, r12)
            goto L_0x0512
        L_0x03cd:
            int[] r4 = r6.zzc
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r4, (java.util.List<java.lang.Double>) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r12)
            goto L_0x0512
        L_0x03de:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            com.google.android.gms.internal.firebase-auth-api.zzalf r5 = r6.zze((int) r2)
            r8.zza((int) r4, (java.lang.Object) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r5)
            goto L_0x0512
        L_0x03f3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r7, r14)
            r8.zzd((int) r4, (long) r14)
            goto L_0x0512
        L_0x0404:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r7, r14)
            r8.zze((int) r4, (int) r3)
            goto L_0x0512
        L_0x0415:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r7, r14)
            r8.zzc((int) r4, (long) r14)
            goto L_0x0512
        L_0x0426:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r7, r14)
            r8.zzd((int) r4, (int) r3)
            goto L_0x0512
        L_0x0437:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r7, r14)
            r8.zza((int) r4, (int) r3)
            goto L_0x0512
        L_0x0448:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r7, r14)
            r8.zzf(r4, r3)
            goto L_0x0512
        L_0x0459:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            com.google.android.gms.internal.firebase-auth-api.zzahp r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r3
            r8.zza((int) r4, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r3)
            goto L_0x0512
        L_0x046c:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            com.google.android.gms.internal.firebase-auth-api.zzalf r5 = r6.zze((int) r2)
            r8.zzb((int) r4, (java.lang.Object) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r5)
            goto L_0x0512
        L_0x0481:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zze(r7, r14)
            zza((int) r4, (java.lang.Object) r3, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x0512
        L_0x0492:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            boolean r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r7, r14)
            r8.zza((int) r4, (boolean) r3)
            goto L_0x0512
        L_0x04a3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r7, r14)
            r8.zzb((int) r4, (int) r3)
            goto L_0x0512
        L_0x04b3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r7, r14)
            r8.zza((int) r4, (long) r14)
            goto L_0x0512
        L_0x04c3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzc(r7, r14)
            r8.zzc((int) r4, (int) r3)
            goto L_0x0512
        L_0x04d3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r7, r14)
            r8.zze((int) r4, (long) r14)
            goto L_0x0512
        L_0x04e3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzd(r7, r14)
            r8.zzb((int) r4, (long) r14)
            goto L_0x0512
        L_0x04f3:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            float r3 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r7, r14)
            r8.zza((int) r4, (float) r3)
            goto L_0x0512
        L_0x0503:
            boolean r5 = r6.zzc(r7, (int) r2)
            if (r5 == 0) goto L_0x0512
            r3 = r3 & r13
            long r14 = (long) r3
            double r14 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r7, (long) r14)
            r8.zza((int) r4, (double) r14)
        L_0x0512:
            int r2 = r2 + -3
            goto L_0x003e
        L_0x0516:
            if (r1 == 0) goto L_0x052c
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r2 = r6.zzr
            r2.zza(r8, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x052a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0516
        L_0x052a:
            r1 = 0
            goto L_0x0516
        L_0x052c:
            return
        L_0x052d:
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x054b
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r6.zzr
            com.google.android.gms.internal.firebase-auth-api.zzaiv r0 = r0.zza((java.lang.Object) r7)
            com.google.android.gms.internal.firebase-auth-api.zzalg<T, java.lang.Object> r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054b
            java.util.Iterator r0 = r0.zzd()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r14 = r0
            goto L_0x054d
        L_0x054b:
            r1 = 0
            r14 = 0
        L_0x054d:
            int[] r0 = r6.zzc
            int r15 = r0.length
            sun.misc.Unsafe r5 = zzb
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r4 = 0
        L_0x0557:
            if (r4 >= r15) goto L_0x0b8c
            int r3 = r6.zzc((int) r4)
            int[] r10 = r6.zzc
            r12 = r10[r4]
            r17 = r3 & r9
            int r9 = r17 >>> 20
            r11 = 17
            if (r9 > r11) goto L_0x058d
            int r11 = r4 + 2
            r10 = r10[r11]
            r11 = r10 & r13
            if (r11 == r0) goto L_0x0581
            if (r11 != r13) goto L_0x0577
            r19 = r14
            r2 = 0
            goto L_0x057f
        L_0x0577:
            r19 = r14
            long r13 = (long) r11
            int r0 = r5.getInt(r7, r13)
            r2 = r0
        L_0x057f:
            r0 = r11
            goto L_0x0583
        L_0x0581:
            r19 = r14
        L_0x0583:
            int r10 = r10 >>> 20
            r11 = 1
            int r10 = r11 << r10
            r11 = r1
            r13 = r2
            r14 = r10
            r10 = r0
            goto L_0x0593
        L_0x058d:
            r19 = r14
            r10 = r0
            r11 = r1
            r13 = r2
            r14 = 0
        L_0x0593:
            if (r11 == 0) goto L_0x05b2
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r6.zzr
            int r0 = r0.zza((java.util.Map.Entry<?, ?>) r11)
            if (r0 > r12) goto L_0x05b2
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r6.zzr
            r0.zza(r8, r11)
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x05b0
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r11 = r0
            goto L_0x0593
        L_0x05b0:
            r11 = 0
            goto L_0x0593
        L_0x05b2:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            long r2 = (long) r0
            switch(r9) {
                case 0: goto L_0x0b56;
                case 1: goto L_0x0b34;
                case 2: goto L_0x0b12;
                case 3: goto L_0x0aef;
                case 4: goto L_0x0acc;
                case 5: goto L_0x0aa9;
                case 6: goto L_0x0a86;
                case 7: goto L_0x0a63;
                case 8: goto L_0x0a40;
                case 9: goto L_0x0a19;
                case 10: goto L_0x09f4;
                case 11: goto L_0x09d1;
                case 12: goto L_0x09ae;
                case 13: goto L_0x098b;
                case 14: goto L_0x0968;
                case 15: goto L_0x0945;
                case 16: goto L_0x0922;
                case 17: goto L_0x08f6;
                case 18: goto L_0x08e5;
                case 19: goto L_0x08d4;
                case 20: goto L_0x08c3;
                case 21: goto L_0x08b2;
                case 22: goto L_0x08a1;
                case 23: goto L_0x0890;
                case 24: goto L_0x087f;
                case 25: goto L_0x086e;
                case 26: goto L_0x085e;
                case 27: goto L_0x084a;
                case 28: goto L_0x083a;
                case 29: goto L_0x0829;
                case 30: goto L_0x0818;
                case 31: goto L_0x0807;
                case 32: goto L_0x07f6;
                case 33: goto L_0x07e5;
                case 34: goto L_0x07d4;
                case 35: goto L_0x07c4;
                case 36: goto L_0x07b4;
                case 37: goto L_0x07a4;
                case 38: goto L_0x0794;
                case 39: goto L_0x0784;
                case 40: goto L_0x0774;
                case 41: goto L_0x0764;
                case 42: goto L_0x0754;
                case 43: goto L_0x0744;
                case 44: goto L_0x0734;
                case 45: goto L_0x0724;
                case 46: goto L_0x0714;
                case 47: goto L_0x0704;
                case 48: goto L_0x06f4;
                case 49: goto L_0x06e1;
                case 50: goto L_0x06d8;
                case 51: goto L_0x06c9;
                case 52: goto L_0x06ba;
                case 53: goto L_0x06ab;
                case 54: goto L_0x069c;
                case 55: goto L_0x068d;
                case 56: goto L_0x067e;
                case 57: goto L_0x066f;
                case 58: goto L_0x0660;
                case 59: goto L_0x0651;
                case 60: goto L_0x063e;
                case 61: goto L_0x062d;
                case 62: goto L_0x061f;
                case 63: goto L_0x0611;
                case 64: goto L_0x0603;
                case 65: goto L_0x05f5;
                case 66: goto L_0x05e7;
                case 67: goto L_0x05d9;
                case 68: goto L_0x05c7;
                default: goto L_0x05bb;
            }
        L_0x05bb:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r11 = r4
            r15 = r5
            goto L_0x0b77
        L_0x05c7:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r4)
            r8.zza((int) r12, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x05bb
        L_0x05d9:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            long r0 = zzd(r7, r2)
            r8.zzd((int) r12, (long) r0)
            goto L_0x05bb
        L_0x05e7:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            int r0 = zzc(r7, (long) r2)
            r8.zze((int) r12, (int) r0)
            goto L_0x05bb
        L_0x05f5:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            long r0 = zzd(r7, r2)
            r8.zzc((int) r12, (long) r0)
            goto L_0x05bb
        L_0x0603:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            int r0 = zzc(r7, (long) r2)
            r8.zzd((int) r12, (int) r0)
            goto L_0x05bb
        L_0x0611:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            int r0 = zzc(r7, (long) r2)
            r8.zza((int) r12, (int) r0)
            goto L_0x05bb
        L_0x061f:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            int r0 = zzc(r7, (long) r2)
            r8.zzf(r12, r0)
            goto L_0x05bb
        L_0x062d:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0
            r8.zza((int) r12, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0)
            goto L_0x05bb
        L_0x063e:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r4)
            r8.zzb((int) r12, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x05bb
        L_0x0651:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            java.lang.Object r0 = r5.getObject(r7, r2)
            zza((int) r12, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x05bb
        L_0x0660:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            boolean r0 = zze(r7, r2)
            r8.zza((int) r12, (boolean) r0)
            goto L_0x05bb
        L_0x066f:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            int r0 = zzc(r7, (long) r2)
            r8.zzb((int) r12, (int) r0)
            goto L_0x05bb
        L_0x067e:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            long r0 = zzd(r7, r2)
            r8.zza((int) r12, (long) r0)
            goto L_0x05bb
        L_0x068d:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            int r0 = zzc(r7, (long) r2)
            r8.zzc((int) r12, (int) r0)
            goto L_0x05bb
        L_0x069c:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            long r0 = zzd(r7, r2)
            r8.zze((int) r12, (long) r0)
            goto L_0x05bb
        L_0x06ab:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            long r0 = zzd(r7, r2)
            r8.zzb((int) r12, (long) r0)
            goto L_0x05bb
        L_0x06ba:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            float r0 = zzb(r7, (long) r2)
            r8.zza((int) r12, (float) r0)
            goto L_0x05bb
        L_0x06c9:
            boolean r0 = r6.zzc(r7, (int) r12, (int) r4)
            if (r0 == 0) goto L_0x05bb
            double r0 = zza(r7, (long) r2)
            r8.zza((int) r12, (double) r0)
            goto L_0x05bb
        L_0x06d8:
            java.lang.Object r0 = r5.getObject(r7, r2)
            r6.zza((com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (int) r12, (java.lang.Object) r0, (int) r4)
            goto L_0x05bb
        L_0x06e1:
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.firebase-auth-api.zzalf r2 = r6.zze((int) r4)
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r0, (java.util.List<?>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r2)
            goto L_0x05bb
        L_0x06f4:
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r9 = 1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzl(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0704:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzk(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0714:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzj(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0724:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzi(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0734:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0744:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzm(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0754:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r0, (java.util.List<java.lang.Boolean>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r9)
            goto L_0x05bb
        L_0x0764:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0774:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zze(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0784:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzg(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x0794:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzn(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x07a4:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzh(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x07b4:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzf(r0, r1, r8, r9)
            goto L_0x05bb
        L_0x07c4:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r0, (java.util.List<java.lang.Double>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r9)
            goto L_0x05bb
        L_0x07d4:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r12 = 0
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzl(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x07e5:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzk(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x07f6:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzj(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x0807:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzi(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x0818:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzc(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x0829:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzm(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x083a:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r0, (java.util.List<com.google.android.gms.internal.p001firebaseauthapi.zzahp>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x05bb
        L_0x084a:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.firebase-auth-api.zzalf r2 = r6.zze((int) r4)
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r0, (java.util.List<?>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r2)
            goto L_0x05bb
        L_0x085e:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r0, (java.util.List<java.lang.String>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x05bb
        L_0x086e:
            r9 = 1
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r12 = 0
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zza((int) r0, (java.util.List<java.lang.Boolean>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r12)
            goto L_0x05bb
        L_0x087f:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzd(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x0890:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zze(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x08a1:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzg(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x08b2:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzn(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x08c3:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzh(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x08d4:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzf(r0, r1, r8, r12)
            goto L_0x05bb
        L_0x08e5:
            r9 = 1
            r12 = 0
            int[] r0 = r6.zzc
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.p001firebaseauthapi.zzalh.zzb((int) r0, (java.util.List<java.lang.Double>) r1, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8, (boolean) r12)
            goto L_0x05bb
        L_0x08f6:
            r9 = 1
            r16 = 0
            r0 = r23
            r1 = r24
            r8 = r2
            r2 = r4
            r3 = r10
            r20 = r11
            r11 = r4
            r4 = r13
            r21 = r15
            r15 = r5
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x091c
            java.lang.Object r0 = r15.getObject(r7, r8)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            r8 = r25
            r8.zza((int) r12, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x091e
        L_0x091c:
            r8 = r25
        L_0x091e:
            r22 = r10
            goto L_0x0b77
        L_0x0922:
            r20 = r11
            r21 = r15
            r16 = 0
            r11 = r4
            r15 = r5
            r4 = r2
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r10
            r22 = r10
            r9 = r4
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.zzd((int) r12, (long) r0)
            goto L_0x0b77
        L_0x0945:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.zze((int) r12, (int) r0)
            goto L_0x0b77
        L_0x0968:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.zzc((int) r12, (long) r0)
            goto L_0x0b77
        L_0x098b:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.zzd((int) r12, (int) r0)
            goto L_0x0b77
        L_0x09ae:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.zza((int) r12, (int) r0)
            goto L_0x0b77
        L_0x09d1:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.zzf(r12, r0)
            goto L_0x0b77
        L_0x09f4:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r0 = r15.getObject(r7, r9)
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0
            r8.zza((int) r12, (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r0)
            goto L_0x0b77
        L_0x0a19:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r0 = r15.getObject(r7, r9)
            com.google.android.gms.internal.firebase-auth-api.zzalf r1 = r6.zze((int) r11)
            r8.zzb((int) r12, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzalf) r1)
            goto L_0x0b77
        L_0x0a40:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r0 = r15.getObject(r7, r9)
            zza((int) r12, (java.lang.Object) r0, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            goto L_0x0b77
        L_0x0a63:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            boolean r0 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzh(r7, r9)
            r8.zza((int) r12, (boolean) r0)
            goto L_0x0b77
        L_0x0a86:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.zzb((int) r12, (int) r0)
            goto L_0x0b77
        L_0x0aa9:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.zza((int) r12, (long) r0)
            goto L_0x0b77
        L_0x0acc:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.zzc((int) r12, (int) r0)
            goto L_0x0b77
        L_0x0aef:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.zze((int) r12, (long) r0)
            goto L_0x0b77
        L_0x0b12:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.zzb((int) r12, (long) r0)
            goto L_0x0b77
        L_0x0b34:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            float r0 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zzb(r7, r9)
            r8.zza((int) r12, (float) r0)
            goto L_0x0b77
        L_0x0b56:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.zza(r1, (int) r2, (int) r3, (int) r4, (int) r5)
            if (r0 == 0) goto L_0x0b77
            double r0 = com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r7, (long) r9)
            r8.zza((int) r12, (double) r0)
        L_0x0b77:
            int r4 = r11 + 3
            r2 = r13
            r5 = r15
            r14 = r19
            r1 = r20
            r15 = r21
            r0 = r22
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = 1
            r12 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0557
        L_0x0b8c:
            r19 = r14
        L_0x0b8e:
            if (r1 == 0) goto L_0x0ba5
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r6.zzr
            r0.zza(r8, r1)
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0ba3
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = r0
            goto L_0x0b8e
        L_0x0ba3:
            r1 = 0
            goto L_0x0b8e
        L_0x0ba5:
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r6.zzq
            zza(r0, r7, (com.google.android.gms.internal.p001firebaseauthapi.zzana) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzana):void");
    }

    private static <UT, UB> void zza(zzame<UT, UB> zzame, T t10, zzana zzana) throws IOException {
        zzame.zzb(zzame.zzd(t10), zzana);
    }

    private final boolean zza(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzc(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zza(Object obj, int i10, zzalf zzalf) {
        return zzalf.zzd(zzamk.zze(obj, (long) (i10 & 1048575)));
    }
}
