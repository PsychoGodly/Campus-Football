package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgrz<T> implements zzgsp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgtq.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgrw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzgrk zzn;
    private final zzgtg zzo;
    private final zzgpz zzp;
    private final zzgsb zzq;
    private final zzgrr zzr;

    private zzgrz(int[] iArr, Object[] objArr, int i10, int i11, zzgrw zzgrw, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzgsb zzgsb, zzgrk zzgrk, zzgtg zzgtg, zzgpz zzgpz, zzgrr zzgrr, byte[] bArr) {
        zzgrw zzgrw2 = zzgrw;
        zzgpz zzgpz2 = zzgpz;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzgrw2 instanceof zzgqm;
        this.zzj = z10;
        boolean z12 = false;
        if (zzgpz2 != null && zzgpz2.zzh(zzgrw)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzgsb;
        this.zzn = zzgrk;
        this.zzo = zzgtg;
        this.zzp = zzgpz2;
        this.zzg = zzgrw2;
        this.zzr = zzgrr;
    }

    private static long zzA(Object obj, long j10) {
        return ((Long) zzgtq.zzh(obj, j10)).longValue();
    }

    private final zzgqq zzB(int i10) {
        int i11 = i10 / 3;
        return (zzgqq) this.zzd[i11 + i11 + 1];
    }

    private final zzgsp zzC(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgsp zzgsp = (zzgsp) this.zzd[i12];
        if (zzgsp != null) {
            return zzgsp;
        }
        zzgsp zzb2 = zzgse.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i10, Object obj2, zzgtg zzgtg, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzh2 = zzgtq.zzh(obj, (long) (zzz(i10) & 1048575));
        if (zzh2 == null || zzB(i10) == null) {
            return obj2;
        }
        zzgrq zzgrq = (zzgrq) zzh2;
        zzgrp zzgrp = (zzgrp) zzE(i10);
        throw null;
    }

    private final Object zzE(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzF(Object obj, int i10) {
        zzgsp zzC = zzC(i10);
        int zzz = zzz(i10) & 1048575;
        if (!zzS(obj, i10)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, (long) zzz);
        if (zzV(object)) {
            return object;
        }
        Object zze2 = zzC.zze();
        if (object != null) {
            zzC.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzG(Object obj, int i10, int i11) {
        zzgsp zzC = zzC(i11);
        if (!zzW(obj, i10, i11)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, (long) (zzz(i11) & 1048575));
        if (zzV(object)) {
            return object;
        }
        Object zze2 = zzC.zze();
        if (object != null) {
            zzC.zzg(zze2, object);
        }
        return zze2;
    }

    private static Field zzH(Class cls, String str) {
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

    private static void zzI(Object obj) {
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        if (zzS(obj2, i10)) {
            Unsafe unsafe = zzb;
            long zzz = (long) (zzz(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzz);
            if (object != null) {
                zzgsp zzC = zzC(i10);
                if (!zzS(obj, i10)) {
                    if (!zzV(object)) {
                        unsafe.putObject(obj, zzz, object);
                    } else {
                        Object zze2 = zzC.zze();
                        zzC.zzg(zze2, object);
                        unsafe.putObject(obj, zzz, zze2);
                    }
                    zzM(obj, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzz);
                if (!zzV(object2)) {
                    Object zze3 = zzC.zze();
                    zzC.zzg(zze3, object2);
                    unsafe.putObject(obj, zzz, zze3);
                    object2 = zze3;
                }
                zzC.zzg(object2, object);
                return;
            }
            int i11 = this.zzc[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + obj3);
        }
    }

    private final void zzK(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzW(obj2, i11, i10)) {
            Unsafe unsafe = zzb;
            long zzz = (long) (zzz(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzz);
            if (object != null) {
                zzgsp zzC = zzC(i10);
                if (!zzW(obj, i11, i10)) {
                    if (!zzV(object)) {
                        unsafe.putObject(obj, zzz, object);
                    } else {
                        Object zze2 = zzC.zze();
                        zzC.zzg(zze2, object);
                        unsafe.putObject(obj, zzz, zze2);
                    }
                    zzN(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzz);
                if (!zzV(object2)) {
                    Object zze3 = zzC.zze();
                    zzC.zzg(zze3, object2);
                    unsafe.putObject(obj, zzz, zze3);
                    object2 = zze3;
                }
                zzC.zzg(object2, object);
                return;
            }
            int i12 = this.zzc[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + obj3);
        }
    }

    private final void zzL(Object obj, int i10, zzgsh zzgsh) throws IOException {
        if (zzR(i10)) {
            zzgtq.zzv(obj, (long) (i10 & 1048575), zzgsh.zzs());
        } else if (this.zzi) {
            zzgtq.zzv(obj, (long) (i10 & 1048575), zzgsh.zzr());
        } else {
            zzgtq.zzv(obj, (long) (i10 & 1048575), zzgsh.zzp());
        }
    }

    private final void zzM(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = (long) (1048575 & zzw);
        if (j10 != 1048575) {
            zzgtq.zzt(obj, j10, (1 << (zzw >>> 20)) | zzgtq.zzd(obj, j10));
        }
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzgtq.zzt(obj, (long) (zzw(i11) & 1048575), i10);
    }

    private final void zzO(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, (long) (zzz(i10) & 1048575), obj2);
        zzM(obj, i10);
    }

    private final void zzP(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, (long) (zzz(i11) & 1048575), obj2);
        zzN(obj, i10, i11);
    }

    private final boolean zzQ(Object obj, Object obj2, int i10) {
        return zzS(obj, i10) == zzS(obj2, i10);
    }

    private static boolean zzR(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzS(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = (long) (zzw & 1048575);
        if (j10 == 1048575) {
            int zzz = zzz(i10);
            long j11 = (long) (zzz & 1048575);
            switch (zzy(zzz)) {
                case 0:
                    return Double.doubleToRawLongBits(zzgtq.zzb(obj, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzgtq.zzc(obj, j11)) != 0;
                case 2:
                    return zzgtq.zzf(obj, j11) != 0;
                case 3:
                    return zzgtq.zzf(obj, j11) != 0;
                case 4:
                    return zzgtq.zzd(obj, j11) != 0;
                case 5:
                    return zzgtq.zzf(obj, j11) != 0;
                case 6:
                    return zzgtq.zzd(obj, j11) != 0;
                case 7:
                    return zzgtq.zzz(obj, j11);
                case 8:
                    Object zzh2 = zzgtq.zzh(obj, j11);
                    if (zzh2 instanceof String) {
                        return !((String) zzh2).isEmpty();
                    }
                    if (zzh2 instanceof zzgpe) {
                        return !zzgpe.zzb.equals(zzh2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzgtq.zzh(obj, j11) != null;
                case 10:
                    return !zzgpe.zzb.equals(zzgtq.zzh(obj, j11));
                case 11:
                    return zzgtq.zzd(obj, j11) != 0;
                case 12:
                    return zzgtq.zzd(obj, j11) != 0;
                case 13:
                    return zzgtq.zzd(obj, j11) != 0;
                case 14:
                    return zzgtq.zzf(obj, j11) != 0;
                case 15:
                    return zzgtq.zzd(obj, j11) != 0;
                case 16:
                    return zzgtq.zzf(obj, j11) != 0;
                case 17:
                    return zzgtq.zzh(obj, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzgtq.zzd(obj, j10) & (1 << (zzw >>> 20))) != 0;
        }
    }

    private final boolean zzT(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzS(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzU(Object obj, int i10, zzgsp zzgsp) {
        return zzgsp.zzk(zzgtq.zzh(obj, (long) (i10 & 1048575)));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgqm) {
            return ((zzgqm) obj).zzaX();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i10, int i11) {
        return zzgtq.zzd(obj, (long) (zzw(i11) & 1048575)) == i10;
    }

    private static boolean zzX(Object obj, long j10) {
        return ((Boolean) zzgtq.zzh(obj, j10)).booleanValue();
    }

    private final void zzY(zzgpu zzgpu, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            zzgrp zzgrp = (zzgrp) zzE(i11);
            throw null;
        }
    }

    private static final void zzZ(int i10, Object obj, zzgpu zzgpu) throws IOException {
        if (obj instanceof String) {
            zzgpu.zzF(i10, (String) obj);
        } else {
            zzgpu.zzd(i10, (zzgpe) obj);
        }
    }

    static zzgth zzd(Object obj) {
        zzgqm zzgqm = (zzgqm) obj;
        zzgth zzgth = zzgqm.zzc;
        if (zzgth != zzgth.zzc()) {
            return zzgth;
        }
        zzgth zzf2 = zzgth.zzf();
        zzgqm.zzc = zzf2;
        return zzf2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.zzgrz zzl(java.lang.Class r31, com.google.android.gms.internal.ads.zzgrt r32, com.google.android.gms.internal.ads.zzgsb r33, com.google.android.gms.internal.ads.zzgrk r34, com.google.android.gms.internal.ads.zzgtg r35, com.google.android.gms.internal.ads.zzgpz r36, com.google.android.gms.internal.ads.zzgrr r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgsg
            if (r1 == 0) goto L_0x03da
            com.google.android.gms.internal.ads.zzgsg r0 = (com.google.android.gms.internal.ads.zzgsg) r0
            int r1 = r0.zzc()
            java.lang.String r2 = r0.zzd()
            int r3 = r2.length()
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0029
            r5 = 1
        L_0x001f:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x002a
            r5 = r8
            goto L_0x001f
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r5 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0049
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0036:
            int r11 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0046
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r8 = r8 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L_0x0036
        L_0x0046:
            int r5 = r5 << r10
            r8 = r8 | r5
            r5 = r11
        L_0x0049:
            if (r8 != 0) goto L_0x0058
            int[] r8 = zza
            r18 = r8
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r19 = 0
            goto L_0x016e
        L_0x0058:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0077
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0064:
            int r11 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0074
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r5 = r5 | r8
            int r10 = r10 + 13
            r8 = r11
            goto L_0x0064
        L_0x0074:
            int r8 = r8 << r10
            r5 = r5 | r8
            r8 = r11
        L_0x0077:
            int r10 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0096
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0083:
            int r12 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x0093
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x0083
        L_0x0093:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x0096:
            int r11 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x00b5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a2:
            int r13 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00b2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00a2
        L_0x00b2:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00b5:
            int r12 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00d4
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c1:
            int r14 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00d1
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c1
        L_0x00d1:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00d4:
            int r13 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00f3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e0:
            int r15 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x00f0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e0
        L_0x00f0:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f3:
            int r14 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x0114
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00ff:
            int r16 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0110
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00ff
        L_0x0110:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0114:
            int r15 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0137
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0120:
            int r17 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0132
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0120
        L_0x0132:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0137:
            int r16 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x015c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0145:
            int r17 = r4 + 1
            char r4 = r2.charAt(r4)
            if (r4 < r6) goto L_0x0157
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x0145
        L_0x0157:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x015c:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int r14 = r5 + r5
            int r14 = r14 + r8
            int[] r8 = new int[r4]
            r4 = r5
            r18 = r8
            r8 = r10
            r10 = r14
            r19 = r15
            r5 = r16
            r14 = r11
        L_0x016e:
            sun.misc.Unsafe r11 = zzb
            java.lang.Object[] r15 = r0.zze()
            com.google.android.gms.internal.ads.zzgrw r16 = r0.zza()
            java.lang.Class r9 = r16.getClass()
            int r20 = r19 + r13
            int r13 = r12 + r12
            int r12 = r12 * 3
            int[] r12 = new int[r12]
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r21 = r19
            r22 = r20
            r16 = 0
            r17 = 0
        L_0x018e:
            r7 = 2
            if (r1 != r7) goto L_0x0193
            r7 = 1
            goto L_0x0194
        L_0x0193:
            r7 = 0
        L_0x0194:
            if (r5 >= r3) goto L_0x03b7
            int r24 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x01c3
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r6 = r24
            r24 = 13
        L_0x01a4:
            int r26 = r6 + 1
            char r6 = r2.charAt(r6)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x01bd
            r1 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r5 = r5 | r1
            int r24 = r24 + 13
            r6 = r26
            r1 = r27
            goto L_0x01a4
        L_0x01bd:
            int r1 = r6 << r24
            r5 = r5 | r1
            r1 = r26
            goto L_0x01c7
        L_0x01c3:
            r27 = r1
            r1 = r24
        L_0x01c7:
            int r6 = r1 + 1
            char r1 = r2.charAt(r1)
            r24 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r3) goto L_0x01f2
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x01d8:
            int r28 = r6 + 1
            char r6 = r2.charAt(r6)
            if (r6 < r3) goto L_0x01ed
            r3 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r1 = r1 | r3
            int r26 = r26 + 13
            r6 = r28
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d8
        L_0x01ed:
            int r3 = r6 << r26
            r1 = r1 | r3
            r6 = r28
        L_0x01f2:
            r3 = r1 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x01fc
            int r3 = r16 + 1
            r18[r16] = r17
            r16 = r3
        L_0x01fc:
            r3 = r1 & 255(0xff, float:3.57E-43)
            r28 = r14
            r14 = 51
            if (r3 < r14) goto L_0x029b
            int r14 = r6 + 1
            char r6 = r2.charAt(r6)
            r26 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0236
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = r26
            r26 = 13
        L_0x0217:
            int r29 = r14 + 1
            char r14 = r2.charAt(r14)
            r30 = r8
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r8) goto L_0x0230
            r8 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r6 = r6 | r8
            int r26 = r26 + 13
            r14 = r29
            r8 = r30
            goto L_0x0217
        L_0x0230:
            int r8 = r14 << r26
            r6 = r6 | r8
            r14 = r29
            goto L_0x023a
        L_0x0236:
            r30 = r8
            r14 = r26
        L_0x023a:
            int r8 = r3 + -51
            r26 = r14
            r14 = 9
            if (r8 == r14) goto L_0x0259
            r14 = 17
            if (r8 != r14) goto L_0x0247
            goto L_0x0259
        L_0x0247:
            r14 = 12
            if (r8 != r14) goto L_0x0265
            if (r7 != 0) goto L_0x0265
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
            goto L_0x0264
        L_0x0259:
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
        L_0x0264:
            r10 = r8
        L_0x0265:
            int r6 = r6 + r6
            r7 = r15[r6]
            boolean r8 = r7 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x026f
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0277
        L_0x026f:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzH(r9, r7)
            r15[r6] = r7
        L_0x0277:
            long r7 = r11.objectFieldOffset(r7)
            int r8 = (int) r7
            int r6 = r6 + 1
            r7 = r15[r6]
            boolean r14 = r7 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0287
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x028f
        L_0x0287:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzH(r9, r7)
            r15[r6] = r7
        L_0x028f:
            long r6 = r11.objectFieldOffset(r7)
            int r7 = (int) r6
            r23 = r15
            r25 = r26
            r6 = 0
            goto L_0x0382
        L_0x029b:
            r30 = r8
            int r8 = r10 + 1
            r10 = r15[r10]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = zzH(r9, r10)
            r14 = 9
            if (r3 == r14) goto L_0x030b
            r14 = 17
            if (r3 != r14) goto L_0x02b0
            goto L_0x030b
        L_0x02b0:
            r14 = 27
            if (r3 == r14) goto L_0x02fd
            r14 = 49
            if (r3 != r14) goto L_0x02b9
            goto L_0x02fd
        L_0x02b9:
            r14 = 12
            if (r3 == r14) goto L_0x02ed
            r14 = 30
            if (r3 == r14) goto L_0x02ed
            r14 = 44
            if (r3 != r14) goto L_0x02c6
            goto L_0x02ed
        L_0x02c6:
            r7 = 50
            if (r3 != r7) goto L_0x02fb
            int r7 = r21 + 1
            r18[r21] = r17
            int r14 = r17 / 3
            int r21 = r8 + 1
            r8 = r15[r8]
            int r14 = r14 + r14
            r13[r14] = r8
            r8 = r1 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e6
            int r14 = r14 + 1
            int r8 = r21 + 1
            r21 = r15[r21]
            r13[r14] = r21
            r21 = r7
            goto L_0x0316
        L_0x02e6:
            r23 = r15
            r8 = r21
            r21 = r7
            goto L_0x0318
        L_0x02ed:
            if (r7 != 0) goto L_0x02fb
            int r7 = r17 / 3
            int r7 = r7 + r7
            r14 = 1
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
            goto L_0x0308
        L_0x02fb:
            r14 = 1
            goto L_0x0316
        L_0x02fd:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
        L_0x0308:
            r8 = r23
            goto L_0x0316
        L_0x030b:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            java.lang.Class r23 = r10.getType()
            r13[r7] = r23
        L_0x0316:
            r23 = r15
        L_0x0318:
            long r14 = r11.objectFieldOffset(r10)
            int r7 = (int) r14
            r10 = r1 & 4096(0x1000, float:5.74E-42)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 4096(0x1000, float:5.74E-42)
            if (r10 != r15) goto L_0x036e
            r10 = 17
            if (r3 > r10) goto L_0x036e
            int r10 = r6 + 1
            char r6 = r2.charAt(r6)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x034d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0339:
            int r25 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r15) goto L_0x034a
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r14
            r6 = r6 | r10
            int r14 = r14 + 13
            r10 = r25
            goto L_0x0339
        L_0x034a:
            int r10 = r10 << r14
            r6 = r6 | r10
            goto L_0x034f
        L_0x034d:
            r25 = r10
        L_0x034f:
            int r10 = r4 + r4
            int r14 = r6 / 32
            int r10 = r10 + r14
            r14 = r23[r10]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x035d
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0365
        L_0x035d:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = zzH(r9, r14)
            r23[r10] = r14
        L_0x0365:
            long r14 = r11.objectFieldOffset(r14)
            int r10 = (int) r14
            int r6 = r6 % 32
            r14 = r10
            goto L_0x0371
        L_0x036e:
            r25 = r6
            r6 = 0
        L_0x0371:
            r10 = 18
            if (r3 < r10) goto L_0x037f
            r10 = 49
            if (r3 > r10) goto L_0x037f
            int r10 = r22 + 1
            r18[r22] = r7
            r22 = r10
        L_0x037f:
            r10 = r8
            r8 = r7
            r7 = r14
        L_0x0382:
            int r14 = r17 + 1
            r12[r17] = r5
            int r5 = r14 + 1
            r15 = r1 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x038f
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0390
        L_0x038f:
            r15 = 0
        L_0x0390:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0397
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0398
        L_0x0397:
            r1 = 0
        L_0x0398:
            int r3 = r3 << 20
            r1 = r1 | r15
            r1 = r1 | r3
            r1 = r1 | r8
            r12[r14] = r1
            int r17 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r7
            r12[r5] = r1
            r15 = r23
            r3 = r24
            r5 = r25
            r1 = r27
            r14 = r28
            r8 = r30
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x018e
        L_0x03b7:
            r30 = r8
            r28 = r14
            com.google.android.gms.internal.ads.zzgrz r1 = new com.google.android.gms.internal.ads.zzgrz
            r10 = r1
            com.google.android.gms.internal.ads.zzgrw r15 = r0.zza()
            r17 = 0
            r26 = 0
            r11 = r12
            r12 = r13
            r13 = r30
            r16 = r7
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r25 = r37
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        L_0x03da:
            com.google.android.gms.internal.ads.zzgtd r0 = (com.google.android.gms.internal.ads.zzgtd) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgrt, com.google.android.gms.internal.ads.zzgsb, com.google.android.gms.internal.ads.zzgrk, com.google.android.gms.internal.ads.zzgtg, com.google.android.gms.internal.ads.zzgpz, com.google.android.gms.internal.ads.zzgrr):com.google.android.gms.internal.ads.zzgrz");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzgtq.zzh(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzgtq.zzh(obj, j10)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0310, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0381, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x048f, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0542, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0551, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0555, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f4, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b2, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c2, code lost:
        r3 = r3 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzp(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = zzb
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.zzc
            int r9 = r9.length
            if (r5 >= r9) goto L_0x055c
            int r9 = r0.zzz(r5)
            int[] r10 = r0.zzc
            r11 = r10[r5]
            int r12 = zzy(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            if (r13 == r7) goto L_0x0035
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0035:
            int r10 = r14 << r10
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0546;
                case 1: goto L_0x0537;
                case 2: goto L_0x0521;
                case 3: goto L_0x050d;
                case 4: goto L_0x04f9;
                case 5: goto L_0x04ed;
                case 6: goto L_0x04e1;
                case 7: goto L_0x04d3;
                case 8: goto L_0x04a5;
                case 9: goto L_0x0492;
                case 10: goto L_0x0473;
                case 11: goto L_0x045e;
                case 12: goto L_0x0449;
                case 13: goto L_0x043c;
                case 14: goto L_0x042f;
                case 15: goto L_0x0415;
                case 16: goto L_0x03fb;
                case 17: goto L_0x03e7;
                case 18: goto L_0x03d9;
                case 19: goto L_0x03cd;
                case 20: goto L_0x03c1;
                case 21: goto L_0x03b5;
                case 22: goto L_0x03a9;
                case 23: goto L_0x039d;
                case 24: goto L_0x0391;
                case 25: goto L_0x0385;
                case 26: goto L_0x0377;
                case 27: goto L_0x0368;
                case 28: goto L_0x035d;
                case 29: goto L_0x0351;
                case 30: goto L_0x0345;
                case 31: goto L_0x0339;
                case 32: goto L_0x032d;
                case 33: goto L_0x0321;
                case 34: goto L_0x0315;
                case 35: goto L_0x02fc;
                case 36: goto L_0x02e7;
                case 37: goto L_0x02d2;
                case 38: goto L_0x02bd;
                case 39: goto L_0x02a8;
                case 40: goto L_0x0293;
                case 41: goto L_0x027d;
                case 42: goto L_0x0267;
                case 43: goto L_0x0251;
                case 44: goto L_0x023b;
                case 45: goto L_0x0225;
                case 46: goto L_0x020f;
                case 47: goto L_0x01f9;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01d3;
                case 50: goto L_0x01c6;
                case 51: goto L_0x01b6;
                case 52: goto L_0x01a6;
                case 53: goto L_0x0190;
                case 54: goto L_0x017a;
                case 55: goto L_0x0164;
                case 56: goto L_0x0157;
                case 57: goto L_0x014a;
                case 58: goto L_0x013b;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0382
        L_0x0042:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.zzgrw r3 = (com.google.android.gms.internal.ads.zzgrw) r3
            com.google.android.gms.internal.ads.zzgsp r4 = r0.zzC(r5)
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzx(r11, r3, r4)
            goto L_0x0381
        L_0x0058:
            boolean r10 = r0.zzW(r1, r11, r5)
            if (r10 == 0) goto L_0x0382
            long r3 = zzA(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r10)
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzF(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0382
        L_0x0074:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0311
        L_0x008f:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x01c2
        L_0x009d:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x01b2
        L_0x00ab:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzy(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0311
        L_0x00c1:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0311
        L_0x00d7:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.zzgpe r3 = (com.google.android.gms.internal.ads.zzgpe) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
        L_0x00f4:
            int r3 = r3 + r9
            goto L_0x0381
        L_0x00f7:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.zzgsp r4 = r0.zzC(r5)
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzo(r11, r3, r4)
            goto L_0x0381
        L_0x010b:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzgpe
            if (r4 == 0) goto L_0x012d
            com.google.android.gms.internal.ads.zzgpe r3 = (com.google.android.gms.internal.ads.zzgpe) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x00f4
        L_0x012d:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzC(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0311
        L_0x013b:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r3 = r3 + r14
            goto L_0x0381
        L_0x014a:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x01b2
        L_0x0157:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x01c2
        L_0x0164:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzy(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0311
        L_0x017a:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            long r3 = zzA(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzF(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r9)
            goto L_0x0311
        L_0x0190:
            boolean r9 = r0.zzW(r1, r11, r5)
            if (r9 == 0) goto L_0x0382
            long r3 = zzA(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzF(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r9)
            goto L_0x0311
        L_0x01a6:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
        L_0x01b2:
            int r3 = r3 + 4
            goto L_0x0381
        L_0x01b6:
            boolean r3 = r0.zzW(r1, r11, r5)
            if (r3 == 0) goto L_0x0382
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
        L_0x01c2:
            int r3 = r3 + 8
            goto L_0x0381
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.zzE(r5)
            com.google.android.gms.internal.ads.zzgrr.zza(r11, r3, r4)
            goto L_0x0382
        L_0x01d3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.zzgsp r4 = r0.zzC(r5)
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzj(r11, r3, r4)
            goto L_0x0381
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzt(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x01f9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzr(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x020f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzi(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x0225:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzg(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x023b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zze(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x0251:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzw(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x0267:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzb(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x027d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzg(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x0293:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzi(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x02a8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzl(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x02bd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzy(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x02d2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzn(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x02e7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzg(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0310
        L_0x02fc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzi(r3)
            if (r3 <= 0) goto L_0x0382
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzD(r11)
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
        L_0x0310:
            int r4 = r4 + r9
        L_0x0311:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0382
        L_0x0315:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzs(r11, r3, r9)
            goto L_0x0381
        L_0x0321:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzq(r11, r3, r9)
            goto L_0x0381
        L_0x032d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzh(r11, r3, r9)
            goto L_0x0381
        L_0x0339:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzf(r11, r3, r9)
            goto L_0x0381
        L_0x0345:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzd(r11, r3, r9)
            goto L_0x0381
        L_0x0351:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzv(r11, r3, r9)
            goto L_0x0381
        L_0x035d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzc(r11, r3)
            goto L_0x0381
        L_0x0368:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.zzgsp r4 = r0.zzC(r5)
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzp(r11, r3, r4)
            goto L_0x0381
        L_0x0377:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzu(r11, r3)
        L_0x0381:
            int r6 = r6 + r3
        L_0x0382:
            r12 = 0
            goto L_0x0555
        L_0x0385:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.ads.zzgsr.zza(r11, r3, r12)
            goto L_0x03e4
        L_0x0391:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzf(r11, r3, r12)
            goto L_0x03e4
        L_0x039d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzh(r11, r3, r12)
            goto L_0x03e4
        L_0x03a9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzk(r11, r3, r12)
            goto L_0x03e4
        L_0x03b5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzx(r11, r3, r12)
            goto L_0x03e4
        L_0x03c1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzm(r11, r3, r12)
            goto L_0x03e4
        L_0x03cd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzf(r11, r3, r12)
            goto L_0x03e4
        L_0x03d9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzh(r11, r3, r12)
        L_0x03e4:
            int r6 = r6 + r3
            goto L_0x0555
        L_0x03e7:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.zzgrw r3 = (com.google.android.gms.internal.ads.zzgrw) r3
            com.google.android.gms.internal.ads.zzgsp r4 = r0.zzC(r5)
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzx(r11, r3, r4)
            goto L_0x03e4
        L_0x03fb:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0555
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r14 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r10)
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzF(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0555
        L_0x0415:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0534
        L_0x042f:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0551
        L_0x043c:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0542
        L_0x0449:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzy(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0534
        L_0x045e:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0534
        L_0x0473:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.zzgpe r3 = (com.google.android.gms.internal.ads.zzgpe) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
        L_0x048f:
            int r3 = r3 + r9
            goto L_0x03e4
        L_0x0492:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.zzgsp r4 = r0.zzC(r5)
            int r3 = com.google.android.gms.internal.ads.zzgsr.zzo(r11, r3, r4)
            goto L_0x03e4
        L_0x04a5:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzgpe
            if (r4 == 0) goto L_0x04c6
            com.google.android.gms.internal.ads.zzgpe r3 = (com.google.android.gms.internal.ads.zzgpe) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x048f
        L_0x04c6:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzC(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0534
        L_0x04d3:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            int r3 = r3 + r14
            goto L_0x03e4
        L_0x04e1:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0542
        L_0x04ed:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
            goto L_0x0551
        L_0x04f9:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzy(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0534
        L_0x050d:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzF(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r9)
            goto L_0x0534
        L_0x0521:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0555
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzF(r3)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r9)
        L_0x0534:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0555
        L_0x0537:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
        L_0x0542:
            int r3 = r3 + 4
            goto L_0x03e4
        L_0x0546:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0555
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zzgpt.zzE(r3)
        L_0x0551:
            int r3 = r3 + 8
            goto L_0x03e4
        L_0x0555:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x055c:
            com.google.android.gms.internal.ads.zzgtg r2 = r0.zzo
            java.lang.Object r3 = r2.zzd(r1)
            int r2 = r2.zza(r3)
            int r6 = r6 + r2
            boolean r2 = r0.zzh
            if (r2 != 0) goto L_0x056c
            return r6
        L_0x056c:
            com.google.android.gms.internal.ads.zzgpz r2 = r0.zzp
            r2.zza(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzp(java.lang.Object):int");
    }

    private static int zzq(Object obj, long j10) {
        return ((Integer) zzgtq.zzh(obj, j10)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzgoq zzgoq) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzgrr.zzb(object)) {
            zzgrq zzb2 = zzgrq.zza().zzb();
            zzgrr.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzgrp zzgrp = (zzgrp) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzgoq zzgoq) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        zzgoq zzgoq2 = zzgoq;
        Unsafe unsafe = zzb;
        long j12 = (long) (this.zzc[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(zzgor.zzp(bArr, i10))));
                    int i23 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(zzgor.zzb(bArr, i10))));
                    int i24 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int zzm2 = zzgor.zzm(bArr2, i18, zzgoq2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzgoq2.zzb));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int zzj2 = zzgor.zzj(bArr2, i18, zzgoq2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzgoq2.zza));
                    unsafe.putInt(obj2, j12, i20);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(zzgor.zzp(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzgor.zzb(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int zzm3 = zzgor.zzm(bArr2, i18, zzgoq2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(zzgoq2.zzb != 0));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm3;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int zzj3 = zzgor.zzj(bArr2, i18, zzgoq2);
                    int i27 = zzgoq2.zza;
                    if (i27 == 0) {
                        unsafe.putObject(obj2, j11, MaxReward.DEFAULT_LABEL);
                    } else if ((i15 & 536870912) == 0 || zzgtv.zzj(bArr2, zzj3, zzj3 + i27)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, zzj3, i27, zzgqw.zzb));
                        zzj3 += i27;
                    } else {
                        throw zzgqy.zzd();
                    }
                    unsafe.putInt(obj2, j12, i20);
                    return zzj3;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object zzG = zzG(obj2, i20, i22);
                    int zzo2 = zzgor.zzo(zzG, zzC(i22), bArr, i10, i11, zzgoq);
                    zzP(obj2, i20, i22, zzG);
                    return zzo2;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int zza2 = zzgor.zza(bArr2, i18, zzgoq2);
                    unsafe.putObject(obj2, j11, zzgoq2.zzc);
                    unsafe.putInt(obj2, j12, i20);
                    return zza2;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int zzj4 = zzgor.zzj(bArr2, i18, zzgoq2);
                    int i28 = zzgoq2.zza;
                    zzgqq zzB = zzB(i22);
                    if (zzB == null || zzB.zza(i28)) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i28));
                        unsafe.putInt(obj2, j12, i20);
                    } else {
                        zzd(obj).zzj(i19, Long.valueOf((long) i28));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int zzj5 = zzgor.zzj(bArr2, i18, zzgoq2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzgpm.zzF(zzgoq2.zza)));
                    unsafe.putInt(obj2, j12, i20);
                    return zzj5;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int zzm4 = zzgor.zzm(bArr2, i18, zzgoq2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzgpm.zzG(zzgoq2.zzb)));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm4;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object zzG2 = zzG(obj2, i20, i22);
                    int zzn2 = zzgor.zzn(zzG2, zzC(i22), bArr, i10, i11, (i19 & -8) | 4, zzgoq);
                    zzP(obj2, i20, i22, zzG2);
                    return zzn2;
                }
                break;
        }
        return i18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x017a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0443 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0443 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgoq r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzgqv r12 = (com.google.android.gms.internal.ads.zzgqv) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.ads.zzgqv r12 = r12.zzd(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03d5;
                case 19: goto L_0x0388;
                case 20: goto L_0x0345;
                case 21: goto L_0x0345;
                case 22: goto L_0x032c;
                case 23: goto L_0x02eb;
                case 24: goto L_0x02aa;
                case 25: goto L_0x0251;
                case 26: goto L_0x019e;
                case 27: goto L_0x0185;
                case 28: goto L_0x012b;
                case 29: goto L_0x032c;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02aa;
                case 32: goto L_0x02eb;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03d5;
                case 36: goto L_0x0388;
                case 37: goto L_0x0345;
                case 38: goto L_0x0345;
                case 39: goto L_0x032c;
                case 40: goto L_0x02eb;
                case 41: goto L_0x02aa;
                case 42: goto L_0x0251;
                case 43: goto L_0x032c;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02aa;
                case 46: goto L_0x02eb;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x0443
            com.google.android.gms.internal.ads.zzgsp r1 = r15.zzC(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.zzgor.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x0421
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.ads.zzgrl r12 = (com.google.android.gms.internal.ads.zzgrl) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.ads.zzgpm.zzG(r4)
            r12.zzg(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0444
        L_0x007b:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x0443
            com.google.android.gms.internal.ads.zzgrl r12 = (com.google.android.gms.internal.ads.zzgrl) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.ads.zzgpm.zzG(r8)
            r12.zzg(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.ads.zzgpm.zzG(r8)
            r12.zzg(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.ads.zzgqn r12 = (com.google.android.gms.internal.ads.zzgqn) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.ads.zzgpm.zzF(r4)
            r12.zzh(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0444
        L_0x00ca:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x0443
            com.google.android.gms.internal.ads.zzgqn r12 = (com.google.android.gms.internal.ads.zzgqn) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.ads.zzgpm.zzF(r4)
            r12.zzh(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.ads.zzgpm.zzF(r4)
            r12.zzh(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.ads.zzgor.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0443
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.zzgor.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.ads.zzgqq r3 = r15.zzB(r8)
            r4 = 0
            com.google.android.gms.internal.ads.zzgtg r5 = r0.zzo
            r22 = r16
            r23 = r21
            r24 = r12
            r25 = r3
            r26 = r4
            r27 = r5
            com.google.android.gms.internal.ads.zzgsr.zzC(r22, r23, r24, r25, r26, r27)
        L_0x0128:
            r1 = r2
            goto L_0x0444
        L_0x012b:
            if (r6 != r14) goto L_0x0443
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0180
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017b
            if (r4 != 0) goto L_0x0141
            com.google.android.gms.internal.ads.zzgpe r4 = com.google.android.gms.internal.ads.zzgpe.zzb
            r12.add(r4)
            goto L_0x0149
        L_0x0141:
            com.google.android.gms.internal.ads.zzgpe r6 = com.google.android.gms.internal.ads.zzgpe.zzw(r3, r1, r4)
            r12.add(r6)
        L_0x0148:
            int r1 = r1 + r4
        L_0x0149:
            if (r1 >= r5) goto L_0x017a
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0154
            goto L_0x017a
        L_0x0154:
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0175
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0170
            if (r4 != 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzgpe r4 = com.google.android.gms.internal.ads.zzgpe.zzb
            r12.add(r4)
            goto L_0x0149
        L_0x0168:
            com.google.android.gms.internal.ads.zzgpe r6 = com.google.android.gms.internal.ads.zzgpe.zzw(r3, r1, r4)
            r12.add(r6)
            goto L_0x0148
        L_0x0170:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x0175:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzf()
            throw r1
        L_0x017a:
            return r1
        L_0x017b:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x0180:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzf()
            throw r1
        L_0x0185:
            if (r6 != r14) goto L_0x0443
            com.google.android.gms.internal.ads.zzgsp r1 = r15.zzC(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.ads.zzgor.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x019e:
            if (r6 != r14) goto L_0x0443
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01f1
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01ec
            if (r6 != 0) goto L_0x01b9
            r12.add(r1)
            goto L_0x01c4
        L_0x01b9:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzgqw.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01c3:
            int r4 = r4 + r6
        L_0x01c4:
            if (r4 >= r5) goto L_0x0443
            int r6 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0443
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01e7
            if (r6 != 0) goto L_0x01dc
            r12.add(r1)
            goto L_0x01c4
        L_0x01dc:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzgqw.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01c3
        L_0x01e7:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzf()
            throw r1
        L_0x01ec:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzf()
            throw r1
        L_0x01f1:
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024c
            if (r6 != 0) goto L_0x01ff
            r12.add(r1)
            goto L_0x0212
        L_0x01ff:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.zzgtv.zzj(r3, r4, r8)
            if (r9 == 0) goto L_0x0247
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzgqw.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0211:
            r4 = r8
        L_0x0212:
            if (r4 >= r5) goto L_0x0443
            int r6 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0443
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0242
            if (r6 != 0) goto L_0x022a
            r12.add(r1)
            goto L_0x0212
        L_0x022a:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.zzgtv.zzj(r3, r4, r8)
            if (r9 == 0) goto L_0x023d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzgqw.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0211
        L_0x023d:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzd()
            throw r1
        L_0x0242:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzf()
            throw r1
        L_0x0247:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzd()
            throw r1
        L_0x024c:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzf()
            throw r1
        L_0x0251:
            r1 = 0
            if (r6 != r14) goto L_0x0279
            com.google.android.gms.internal.ads.zzgos r12 = (com.google.android.gms.internal.ads.zzgos) r12
            int r2 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x025d:
            if (r2 >= r4) goto L_0x0270
            int r2 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r2, r7)
            long r5 = r7.zzb
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x026b
            r5 = 1
            goto L_0x026c
        L_0x026b:
            r5 = 0
        L_0x026c:
            r12.zze(r5)
            goto L_0x025d
        L_0x0270:
            if (r2 != r4) goto L_0x0274
            goto L_0x0128
        L_0x0274:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x0279:
            if (r6 != 0) goto L_0x0443
            com.google.android.gms.internal.ads.zzgos r12 = (com.google.android.gms.internal.ads.zzgos) r12
            int r4 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0289
            r6 = 1
            goto L_0x028a
        L_0x0289:
            r6 = 0
        L_0x028a:
            r12.zze(r6)
        L_0x028d:
            if (r4 >= r5) goto L_0x02a9
            int r6 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x0298
            goto L_0x02a9
        L_0x0298:
            int r4 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02a4
            r6 = 1
            goto L_0x02a5
        L_0x02a4:
            r6 = 0
        L_0x02a5:
            r12.zze(r6)
            goto L_0x028d
        L_0x02a9:
            return r4
        L_0x02aa:
            if (r6 != r14) goto L_0x02ca
            com.google.android.gms.internal.ads.zzgqn r12 = (com.google.android.gms.internal.ads.zzgqn) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02b5:
            if (r1 >= r2) goto L_0x02c1
            int r4 = com.google.android.gms.internal.ads.zzgor.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02b5
        L_0x02c1:
            if (r1 != r2) goto L_0x02c5
            goto L_0x0444
        L_0x02c5:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x02ca:
            if (r6 != r9) goto L_0x0443
            com.google.android.gms.internal.ads.zzgqn r12 = (com.google.android.gms.internal.ads.zzgqn) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzb(r17, r18)
            r12.zzh(r1)
        L_0x02d5:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02ea
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02e2
            goto L_0x02ea
        L_0x02e2:
            int r1 = com.google.android.gms.internal.ads.zzgor.zzb(r3, r4)
            r12.zzh(r1)
            goto L_0x02d5
        L_0x02ea:
            return r1
        L_0x02eb:
            if (r6 != r14) goto L_0x030b
            com.google.android.gms.internal.ads.zzgrl r12 = (com.google.android.gms.internal.ads.zzgrl) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02f6:
            if (r1 >= r2) goto L_0x0302
            long r4 = com.google.android.gms.internal.ads.zzgor.zzp(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 8
            goto L_0x02f6
        L_0x0302:
            if (r1 != r2) goto L_0x0306
            goto L_0x0444
        L_0x0306:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x030b:
            if (r6 != r13) goto L_0x0443
            com.google.android.gms.internal.ads.zzgrl r12 = (com.google.android.gms.internal.ads.zzgrl) r12
            long r8 = com.google.android.gms.internal.ads.zzgor.zzp(r17, r18)
            r12.zzg(r8)
        L_0x0316:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x032b
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0323
            goto L_0x032b
        L_0x0323:
            long r8 = com.google.android.gms.internal.ads.zzgor.zzp(r3, r4)
            r12.zzg(r8)
            goto L_0x0316
        L_0x032b:
            return r1
        L_0x032c:
            if (r6 != r14) goto L_0x0334
            int r1 = com.google.android.gms.internal.ads.zzgor.zzf(r3, r4, r12, r7)
            goto L_0x0444
        L_0x0334:
            if (r6 != 0) goto L_0x0443
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.ads.zzgor.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0345:
            if (r6 != r14) goto L_0x0365
            com.google.android.gms.internal.ads.zzgrl r12 = (com.google.android.gms.internal.ads.zzgrl) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0350:
            if (r1 >= r2) goto L_0x035c
            int r1 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzg(r4)
            goto L_0x0350
        L_0x035c:
            if (r1 != r2) goto L_0x0360
            goto L_0x0444
        L_0x0360:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x0365:
            if (r6 != 0) goto L_0x0443
            com.google.android.gms.internal.ads.zzgrl r12 = (com.google.android.gms.internal.ads.zzgrl) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
        L_0x0372:
            if (r1 >= r5) goto L_0x0387
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x037d
            goto L_0x0387
        L_0x037d:
            int r1 = com.google.android.gms.internal.ads.zzgor.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
            goto L_0x0372
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ac
            com.google.android.gms.internal.ads.zzgqf r12 = (com.google.android.gms.internal.ads.zzgqf) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            int r4 = com.google.android.gms.internal.ads.zzgor.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a7
            goto L_0x0444
        L_0x03a7:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x03ac:
            if (r6 != r9) goto L_0x0443
            com.google.android.gms.internal.ads.zzgqf r12 = (com.google.android.gms.internal.ads.zzgqf) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03bb:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d4
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03c8
            goto L_0x03d4
        L_0x03c8:
            int r1 = com.google.android.gms.internal.ads.zzgor.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03bb
        L_0x03d4:
            return r1
        L_0x03d5:
            if (r6 != r14) goto L_0x03f8
            com.google.android.gms.internal.ads.zzgpv r12 = (com.google.android.gms.internal.ads.zzgpv) r12
            int r1 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03e0:
            if (r1 >= r2) goto L_0x03f0
            long r4 = com.google.android.gms.internal.ads.zzgor.zzp(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03e0
        L_0x03f0:
            if (r1 != r2) goto L_0x03f3
            goto L_0x0444
        L_0x03f3:
            com.google.android.gms.internal.ads.zzgqy r1 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r1
        L_0x03f8:
            if (r6 != r13) goto L_0x0443
            com.google.android.gms.internal.ads.zzgpv r12 = (com.google.android.gms.internal.ads.zzgpv) r12
            long r8 = com.google.android.gms.internal.ads.zzgor.zzp(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0407:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0414
            goto L_0x0420
        L_0x0414:
            long r8 = com.google.android.gms.internal.ads.zzgor.zzp(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0407
        L_0x0420:
            return r1
        L_0x0421:
            if (r4 >= r5) goto L_0x0442
            int r8 = com.google.android.gms.internal.ads.zzgor.zzj(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x042c
            goto L_0x0442
        L_0x042c:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.zzgor.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x0421
        L_0x0442:
            return r4
        L_0x0443:
            r1 = r4
        L_0x0444:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgoq):int");
    }

    private final int zzu(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzx(i10, 0);
    }

    private final int zzv(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzx(i10, i11);
    }

    private final int zzw(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzx(int i10, int i11) {
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

    private static int zzy(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzz(int i10) {
        return this.zzc[i10 + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0307, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0401, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0483, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04d5, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0540, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0550, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0554, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzj
            if (r0 == 0) goto L_0x0564
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0009:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0558
            int r4 = r11.zzz(r2)
            int r5 = zzy(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.google.android.gms.internal.ads.zzgqe r7 = com.google.android.gms.internal.ads.zzgqe.DOUBLE_LIST_PACKED
            int r7 = r7.zza()
            if (r5 < r7) goto L_0x0034
            com.google.android.gms.internal.ads.zzgqe r7 = com.google.android.gms.internal.ads.zzgqe.SINT64_LIST_PACKED
            int r7 = r7.zza()
            if (r5 > r7) goto L_0x0034
            int[] r7 = r11.zzc
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0034:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0544;
                case 1: goto L_0x0534;
                case 2: goto L_0x051d;
                case 3: goto L_0x0508;
                case 4: goto L_0x04f3;
                case 5: goto L_0x04e6;
                case 6: goto L_0x04d9;
                case 7: goto L_0x04c9;
                case 8: goto L_0x049a;
                case 9: goto L_0x0486;
                case 10: goto L_0x0466;
                case 11: goto L_0x0450;
                case 12: goto L_0x043a;
                case 13: goto L_0x042c;
                case 14: goto L_0x041e;
                case 15: goto L_0x0403;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d2;
                case 18: goto L_0x03c5;
                case 19: goto L_0x03ba;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a4;
                case 22: goto L_0x0399;
                case 23: goto L_0x038e;
                case 24: goto L_0x0383;
                case 25: goto L_0x0378;
                case 26: goto L_0x036d;
                case 27: goto L_0x035e;
                case 28: goto L_0x0352;
                case 29: goto L_0x0346;
                case 30: goto L_0x033a;
                case 31: goto L_0x032e;
                case 32: goto L_0x0322;
                case 33: goto L_0x0316;
                case 34: goto L_0x030a;
                case 35: goto L_0x02f3;
                case 36: goto L_0x02de;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02b4;
                case 39: goto L_0x029f;
                case 40: goto L_0x028a;
                case 41: goto L_0x0274;
                case 42: goto L_0x025e;
                case 43: goto L_0x0248;
                case 44: goto L_0x0232;
                case 45: goto L_0x021c;
                case 46: goto L_0x0206;
                case 47: goto L_0x01f0;
                case 48: goto L_0x01da;
                case 49: goto L_0x01ca;
                case 50: goto L_0x01bd;
                case 51: goto L_0x01af;
                case 52: goto L_0x01a1;
                case 53: goto L_0x018b;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0151;
                case 57: goto L_0x0143;
                case 58: goto L_0x0135;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00bb;
                case 63: goto L_0x00a5;
                case 64: goto L_0x0097;
                case 65: goto L_0x0089;
                case 66: goto L_0x006e;
                case 67: goto L_0x0052;
                case 68: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0554
        L_0x003c:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgrw r4 = (com.google.android.gms.internal.ads.zzgrw) r4
            com.google.android.gms.internal.ads.zzgsp r5 = r11.zzC(r2)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzx(r6, r4, r5)
            goto L_0x03cf
        L_0x0052:
            boolean r5 = r11.zzW(r12, r6, r2)
            if (r5 == 0) goto L_0x0554
            long r7 = zzA(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzF(r5)
            goto L_0x0401
        L_0x006e:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0531
        L_0x0089:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0550
        L_0x0097:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0540
        L_0x00a5:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzy(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x00bb:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x00d1:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgpe r4 = (com.google.android.gms.internal.ads.zzgpe) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0483
        L_0x00f0:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgsp r5 = r11.zzC(r2)
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzo(r6, r4, r5)
            goto L_0x03cf
        L_0x0104:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzgpe
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.internal.ads.zzgpe r4 = (com.google.android.gms.internal.ads.zzgpe) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0483
        L_0x0127:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzC(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x0135:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x04d5
        L_0x0143:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0540
        L_0x0151:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0550
        L_0x015f:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzy(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x0175:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            long r4 = zzA(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzF(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r6)
            goto L_0x0531
        L_0x018b:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            long r4 = zzA(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzF(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r6)
            goto L_0x0531
        L_0x01a1:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0540
        L_0x01af:
            boolean r4 = r11.zzW(r12, r6, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0550
        L_0x01bd:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.lang.Object r5 = r11.zzE(r2)
            com.google.android.gms.internal.ads.zzgrr.zza(r6, r4, r5)
            goto L_0x0554
        L_0x01ca:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzgsp r5 = r11.zzC(r2)
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzj(r6, r4, r5)
            goto L_0x03cf
        L_0x01da:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzt(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x01f0:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzr(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x0206:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzi(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x021c:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzg(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x0232:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zze(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x0248:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzw(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x025e:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzb(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x0274:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzg(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x028a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzi(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x029f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzl(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x02b4:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzy(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x02c9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzn(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x02de:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzg(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0307
        L_0x02f3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzi(r4)
            if (r4 <= 0) goto L_0x0554
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
        L_0x0307:
            int r5 = r5 + r6
            goto L_0x0531
        L_0x030a:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzs(r6, r4, r1)
            goto L_0x03cf
        L_0x0316:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzq(r6, r4, r1)
            goto L_0x03cf
        L_0x0322:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzh(r6, r4, r1)
            goto L_0x03cf
        L_0x032e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzf(r6, r4, r1)
            goto L_0x03cf
        L_0x033a:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzd(r6, r4, r1)
            goto L_0x03cf
        L_0x0346:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzv(r6, r4, r1)
            goto L_0x03cf
        L_0x0352:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzc(r6, r4)
            goto L_0x03cf
        L_0x035e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzgsp r5 = r11.zzC(r2)
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzp(r6, r4, r5)
            goto L_0x03cf
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzu(r6, r4)
            goto L_0x03cf
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zza(r6, r4, r1)
            goto L_0x03cf
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzf(r6, r4, r1)
            goto L_0x03cf
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzh(r6, r4, r1)
            goto L_0x03cf
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzk(r6, r4, r1)
            goto L_0x03cf
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzx(r6, r4, r1)
            goto L_0x03cf
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzm(r6, r4, r1)
            goto L_0x03cf
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzf(r6, r4, r1)
            goto L_0x03cf
        L_0x03c5:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzh(r6, r4, r1)
        L_0x03cf:
            int r3 = r3 + r4
            goto L_0x0554
        L_0x03d2:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgrw r4 = (com.google.android.gms.internal.ads.zzgrw) r4
            com.google.android.gms.internal.ads.zzgsp r5 = r11.zzC(r2)
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzx(r6, r4, r5)
            goto L_0x03cf
        L_0x03e7:
            boolean r5 = r11.zzS(r12, r2)
            if (r5 == 0) goto L_0x0554
            long r7 = com.google.android.gms.internal.ads.zzgtq.zzf(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzF(r5)
        L_0x0401:
            int r4 = r4 + r5
            goto L_0x03cf
        L_0x0403:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = com.google.android.gms.internal.ads.zzgtq.zzd(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0531
        L_0x041e:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0550
        L_0x042c:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0540
        L_0x043a:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = com.google.android.gms.internal.ads.zzgtq.zzd(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzy(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x0450:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = com.google.android.gms.internal.ads.zzgtq.zzd(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x0466:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgpe r4 = (com.google.android.gms.internal.ads.zzgpe) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
        L_0x0483:
            int r4 = r4 + r6
            goto L_0x03cf
        L_0x0486:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgsp r5 = r11.zzC(r2)
            int r4 = com.google.android.gms.internal.ads.zzgsr.zzo(r6, r4, r5)
            goto L_0x03cf
        L_0x049a:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgtq.zzh(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzgpe
            if (r5 == 0) goto L_0x04bc
            com.google.android.gms.internal.ads.zzgpe r4 = (com.google.android.gms.internal.ads.zzgpe) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzf
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0483
        L_0x04bc:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzC(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x04c9:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
        L_0x04d5:
            int r4 = r4 + 1
            goto L_0x03cf
        L_0x04d9:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0540
        L_0x04e6:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
            goto L_0x0550
        L_0x04f3:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = com.google.android.gms.internal.ads.zzgtq.zzd(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzy(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r5)
            goto L_0x0531
        L_0x0508:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            long r4 = com.google.android.gms.internal.ads.zzgtq.zzf(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzF(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r6)
            goto L_0x0531
        L_0x051d:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            long r4 = com.google.android.gms.internal.ads.zzgtq.zzf(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzF(r4)
            int r5 = com.google.android.gms.internal.ads.zzgpt.zzE(r6)
        L_0x0531:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0554
        L_0x0534:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
        L_0x0540:
            int r4 = r4 + 4
            goto L_0x03cf
        L_0x0544:
            boolean r4 = r11.zzS(r12, r2)
            if (r4 == 0) goto L_0x0554
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgpt.zzE(r4)
        L_0x0550:
            int r4 = r4 + 8
            goto L_0x03cf
        L_0x0554:
            int r2 = r2 + 3
            goto L_0x0009
        L_0x0558:
            com.google.android.gms.internal.ads.zzgtg r0 = r11.zzo
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            goto L_0x0568
        L_0x0564:
            int r3 = r11.zzp(r12)
        L_0x0568:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.zzz(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = zzy(r3)
            long r5 = (long) r5
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzA(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzq(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzA(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzq(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzq(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzq(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = zzX(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zza(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzq(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzA(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzq(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzA(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzA(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = zzo(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.zzW(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = zzn(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgtq.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgtq.zzd(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgtq.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgtq.zzd(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgtq.zzd(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgtq.zzd(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.zzgtq.zzz(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zza(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgtq.zzd(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgtq.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgtq.zzd(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgtq.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgtq.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.zzgtq.zzc(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.zzgtq.zzb(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzgqw.zzc(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.zzgtg r0 = r8.zzo
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzh
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.ads.zzgpz r0 = r8.zzp
            r0.zza(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030a, code lost:
        if (r0 != r15) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0327, code lost:
        r2 = r0;
        r7 = r20;
        r6 = r23;
        r0 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x035b, code lost:
        if (r0 != r15) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0383, code lost:
        if (r0 != r15) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0151, code lost:
        r5 = r7 | r8;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        r1 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0158, code lost:
        r12 = r6;
        r20 = r13;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ec, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021f, code lost:
        r6 = r23;
        r8 = -1;
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x024d, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024f, code lost:
        r5 = r7 | r8;
        r13 = r31;
        r2 = r6;
        r1 = r11;
        r3 = r20;
        r6 = r23;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025a, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025e, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x025f, code lost:
        r0 = r32;
        r19 = r7;
        r26 = r10;
        r30 = r11;
        r21 = r12;
        r2 = r13;
        r7 = r20;
        r6 = r23;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzgoq r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            zzI(r28)
            sun.misc.Unsafe r10 = zzb
            r8 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x03f7
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.android.gms.internal.ads.zzgor.zzk(r0, r12, r3, r9)
            int r3 = r9.zza
            r4 = r3
            r3 = r0
            goto L_0x002f
        L_0x002e:
            r4 = r0
        L_0x002f:
            int r0 = r4 >>> 3
            r7 = 3
            if (r0 <= r1) goto L_0x003a
            int r2 = r2 / r7
            int r1 = r15.zzv(r0, r2)
            goto L_0x003e
        L_0x003a:
            int r1 = r15.zzu(r0)
        L_0x003e:
            r2 = r1
            if (r2 != r8) goto L_0x0050
            r30 = r0
            r2 = r3
            r7 = r4
            r19 = r5
            r26 = r10
            r0 = r11
            r18 = -1
            r21 = 0
            goto L_0x0386
        L_0x0050:
            r1 = r4 & 7
            int[] r8 = r15.zzc
            int r19 = r2 + 1
            r7 = r8[r19]
            int r11 = zzy(r7)
            r19 = r0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r17
            r21 = r3
            r20 = r4
            long r3 = (long) r0
            r0 = 17
            if (r11 > r0) goto L_0x0272
            int r0 = r2 + 2
            r0 = r8[r0]
            int r8 = r0 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            r17 = r7
            if (r0 == r6) goto L_0x008c
            if (r6 == r13) goto L_0x0083
            long r6 = (long) r6
            r10.putInt(r14, r6, r5)
        L_0x0083:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r23 = r0
            r7 = r5
            goto L_0x008f
        L_0x008c:
            r7 = r5
            r23 = r6
        L_0x008f:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x023a;
                case 1: goto L_0x0225;
                case 2: goto L_0x0200;
                case 3: goto L_0x0200;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01d4;
                case 6: goto L_0x01c2;
                case 7: goto L_0x01a7;
                case 8: goto L_0x0189;
                case 9: goto L_0x015e;
                case 10: goto L_0x013e;
                case 11: goto L_0x01ef;
                case 12: goto L_0x010f;
                case 13: goto L_0x01c2;
                case 14: goto L_0x01d4;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00c9;
                default: goto L_0x0093;
            }
        L_0x0093:
            r6 = r2
            r11 = r19
            r13 = r21
            r0 = 3
            if (r1 != r0) goto L_0x025e
            java.lang.Object r5 = r15.zzF(r14, r6)
            int r0 = r11 << 3
            r17 = r0 | 4
            com.google.android.gms.internal.ads.zzgsp r1 = r15.zzC(r6)
            r0 = r5
            r2 = r29
            r3 = r13
            r4 = r31
            r13 = r5
            r5 = r17
            r12 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.ads.zzgor.zzn(r0, r1, r2, r3, r4, r5, r6)
            r15.zzO(r14, r12, r13)
            r5 = r7 | r8
            r13 = r31
            r1 = r11
            r2 = r12
            r3 = r20
            r6 = r23
            r8 = -1
            r12 = r29
            goto L_0x025a
        L_0x00c9:
            if (r1 != 0) goto L_0x00f1
            r5 = r21
            int r6 = com.google.android.gms.internal.ads.zzgor.zzm(r12, r5, r9)
            long r0 = r9.zzb
            long r21 = com.google.android.gms.internal.ads.zzgpm.zzG(r0)
            r11 = r19
            r0 = r10
            r1 = r28
            r5 = r2
            r2 = r3
            r17 = r6
            r13 = r20
            r6 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r3 = r13
            r0 = r17
            goto L_0x021f
        L_0x00f1:
            r11 = r19
            r12 = r2
            r13 = r21
            goto L_0x025f
        L_0x00f8:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            if (r1 != 0) goto L_0x0158
            int r0 = com.google.android.gms.internal.ads.zzgor.zzj(r12, r5, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.ads.zzgpm.zzF(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0151
        L_0x010f:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            if (r1 != 0) goto L_0x0158
            int r0 = com.google.android.gms.internal.ads.zzgor.zzj(r12, r5, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.ads.zzgqq r2 = r15.zzB(r6)
            if (r2 == 0) goto L_0x013a
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x012b
            goto L_0x013a
        L_0x012b:
            com.google.android.gms.internal.ads.zzgth r2 = zzd(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzj(r13, r1)
            r2 = r6
            r5 = r7
            goto L_0x0154
        L_0x013a:
            r10.putInt(r14, r3, r1)
            goto L_0x0151
        L_0x013e:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0158
            int r0 = com.google.android.gms.internal.ads.zzgor.zza(r12, r5, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
        L_0x0151:
            r5 = r7 | r8
            r2 = r6
        L_0x0154:
            r1 = r11
            r3 = r13
            goto L_0x021f
        L_0x0158:
            r12 = r6
            r20 = r13
            r13 = r5
            goto L_0x025f
        L_0x015e:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0185
            java.lang.Object r4 = r15.zzF(r14, r6)
            com.google.android.gms.internal.ads.zzgsp r1 = r15.zzC(r6)
            r0 = r4
            r2 = r29
            r3 = r5
            r5 = r4
            r4 = r31
            r20 = r13
            r13 = r5
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.zzgor.zzo(r0, r1, r2, r3, r4, r5)
            r15.zzO(r14, r6, r13)
            goto L_0x024f
        L_0x0185:
            r20 = r13
            goto L_0x01ec
        L_0x0189:
            r6 = r2
            r11 = r19
            r5 = r21
            r0 = 2
            if (r1 != r0) goto L_0x01ec
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r17 & r0
            if (r0 != 0) goto L_0x019c
            int r0 = com.google.android.gms.internal.ads.zzgor.zzg(r12, r5, r9)
            goto L_0x01a0
        L_0x019c:
            int r0 = com.google.android.gms.internal.ads.zzgor.zzh(r12, r5, r9)
        L_0x01a0:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x024f
        L_0x01a7:
            r6 = r2
            r11 = r19
            r5 = r21
            if (r1 != 0) goto L_0x01ec
            int r0 = com.google.android.gms.internal.ads.zzgor.zzm(r12, r5, r9)
            long r1 = r9.zzb
            r21 = 0
            int r5 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x01bc
            r13 = 1
            goto L_0x01bd
        L_0x01bc:
            r13 = 0
        L_0x01bd:
            com.google.android.gms.internal.ads.zzgtq.zzp(r14, r3, r13)
            goto L_0x024f
        L_0x01c2:
            r6 = r2
            r11 = r19
            r5 = r21
            if (r1 != r0) goto L_0x01ec
            int r0 = com.google.android.gms.internal.ads.zzgor.zzb(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
            goto L_0x024f
        L_0x01d4:
            r6 = r2
            r11 = r19
            r5 = r21
            r0 = 1
            if (r1 != r0) goto L_0x01ec
            long r21 = com.google.android.gms.internal.ads.zzgor.zzp(r12, r5)
            r0 = r10
            r1 = r28
            r13 = r5
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x024d
        L_0x01ec:
            r13 = r5
            goto L_0x025e
        L_0x01ef:
            r6 = r2
            r11 = r19
            r13 = r21
            if (r1 != 0) goto L_0x025e
            int r0 = com.google.android.gms.internal.ads.zzgor.zzj(r12, r13, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x024f
        L_0x0200:
            r6 = r2
            r11 = r19
            r13 = r21
            if (r1 != 0) goto L_0x025e
            int r13 = com.google.android.gms.internal.ads.zzgor.zzm(r12, r13, r9)
            long r1 = r9.zzb
            r0 = r10
            r21 = r1
            r1 = r28
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r0 = r13
            r3 = r20
        L_0x021f:
            r6 = r23
            r8 = -1
            r13 = r31
            goto L_0x025a
        L_0x0225:
            r6 = r2
            r11 = r19
            r13 = r21
            if (r1 != r0) goto L_0x025e
            int r0 = com.google.android.gms.internal.ads.zzgor.zzb(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.zzgtq.zzs(r14, r3, r0)
            int r0 = r13 + 4
            goto L_0x024f
        L_0x023a:
            r6 = r2
            r11 = r19
            r13 = r21
            r0 = 1
            if (r1 != r0) goto L_0x025e
            long r0 = com.google.android.gms.internal.ads.zzgor.zzp(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.zzgtq.zzr(r14, r3, r0)
        L_0x024d:
            int r0 = r13 + 8
        L_0x024f:
            r5 = r7 | r8
            r13 = r31
            r2 = r6
            r1 = r11
            r3 = r20
            r6 = r23
            r8 = -1
        L_0x025a:
            r11 = r32
            goto L_0x001d
        L_0x025e:
            r12 = r6
        L_0x025f:
            r0 = r32
            r19 = r7
            r26 = r10
            r30 = r11
            r21 = r12
            r2 = r13
            r7 = r20
            r6 = r23
            r18 = -1
            goto L_0x0386
        L_0x0272:
            r12 = r2
            r17 = r7
            r8 = r19
            r13 = r21
            r0 = 27
            if (r11 != r0) goto L_0x02d4
            r0 = 2
            if (r1 != r0) goto L_0x02c5
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.google.android.gms.internal.ads.zzgqv r0 = (com.google.android.gms.internal.ads.zzgqv) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x029d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0295
            r1 = 10
            goto L_0x0296
        L_0x0295:
            int r1 = r1 + r1
        L_0x0296:
            com.google.android.gms.internal.ads.zzgqv r0 = r0.zzd(r1)
            r10.putObject(r14, r3, r0)
        L_0x029d:
            r7 = r0
            com.google.android.gms.internal.ads.zzgsp r0 = r15.zzC(r12)
            r1 = r20
            r2 = r29
            r3 = r13
            r4 = r31
            r19 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.ads.zzgor.zze(r0, r1, r2, r3, r4, r5, r6)
            r13 = r31
            r11 = r32
            r1 = r8
            r2 = r12
            r5 = r19
            r3 = r20
            r6 = r23
            r8 = -1
            r12 = r29
            goto L_0x001d
        L_0x02c5:
            r19 = r5
            r23 = r6
            r30 = r8
            r26 = r10
            r21 = r12
            r15 = r13
            r18 = -1
            goto L_0x035e
        L_0x02d4:
            r19 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0330
            r7 = r17
            long r6 = (long) r7
            r0 = r27
            r5 = r1
            r1 = r28
            r2 = r29
            r24 = r3
            r3 = r13
            r4 = r31
            r17 = r5
            r5 = r20
            r21 = r6
            r6 = r8
            r7 = r17
            r30 = r8
            r18 = -1
            r8 = r12
            r26 = r10
            r9 = r21
            r15 = r32
            r21 = r12
            r15 = r13
            r12 = r24
            r14 = r33
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0327
        L_0x030c:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r5 = r19
            r3 = r20
            r2 = r21
            r6 = r23
            r10 = r26
            r8 = -1
            goto L_0x001d
        L_0x0327:
            r2 = r0
            r7 = r20
            r6 = r23
            r0 = r32
            goto L_0x0386
        L_0x0330:
            r24 = r3
            r30 = r8
            r26 = r10
            r21 = r12
            r15 = r13
            r7 = r17
            r18 = -1
            r17 = r1
            r0 = 50
            if (r11 != r0) goto L_0x0366
            r8 = r17
            r0 = 2
            if (r8 != r0) goto L_0x035e
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r21
            r6 = r24
            r8 = r33
            int r0 = r0.zzr(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0327
            goto L_0x030c
        L_0x035e:
            r0 = r32
            r2 = r15
            r7 = r20
            r6 = r23
            goto L_0x0386
        L_0x0366:
            r8 = r17
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r20
            r6 = r30
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r24
            r12 = r21
            r13 = r33
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0327
            goto L_0x030c
        L_0x0386:
            if (r7 != r0) goto L_0x0398
            if (r0 == 0) goto L_0x0398
            r8 = r27
            r12 = r28
            r9 = r0
            r0 = r6
            r5 = r19
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            goto L_0x0407
        L_0x0398:
            r8 = r27
            r9 = r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x03cf
            r10 = r33
            com.google.android.gms.internal.ads.zzgpy r0 = r10.zzd
            com.google.android.gms.internal.ads.zzgpy r1 = com.google.android.gms.internal.ads.zzgpy.zza
            if (r0 == r1) goto L_0x03ca
            com.google.android.gms.internal.ads.zzgrw r1 = r8.zzg
            r11 = r30
            com.google.android.gms.internal.ads.zzgqk r0 = r0.zzc(r1, r11)
            if (r0 != 0) goto L_0x03c3
            com.google.android.gms.internal.ads.zzgth r4 = zzd(r28)
            r0 = r7
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.zzgor.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r28
            goto L_0x03e4
        L_0x03c3:
            r12 = r28
            r0 = r12
            com.google.android.gms.internal.ads.zzgqj r0 = (com.google.android.gms.internal.ads.zzgqj) r0
            r0 = 0
            throw r0
        L_0x03ca:
            r12 = r28
            r11 = r30
            goto L_0x03d5
        L_0x03cf:
            r12 = r28
            r11 = r30
            r10 = r33
        L_0x03d5:
            com.google.android.gms.internal.ads.zzgth r4 = zzd(r28)
            r0 = r7
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.zzgor.zzi(r0, r1, r2, r3, r4, r5)
        L_0x03e4:
            r13 = r31
            r3 = r7
            r15 = r8
            r1 = r11
            r14 = r12
            r5 = r19
            r2 = r21
            r8 = -1
            r12 = r29
            r11 = r9
            r9 = r10
            r10 = r26
            goto L_0x001d
        L_0x03f7:
            r19 = r5
            r23 = r6
            r26 = r10
            r9 = r11
            r12 = r14
            r8 = r15
            r6 = r0
            r7 = r3
            r0 = r23
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0407:
            if (r0 == r1) goto L_0x040f
            long r0 = (long) r0
            r2 = r26
            r2.putInt(r12, r0, r5)
        L_0x040f:
            int r0 = r8.zzl
            r10 = r0
        L_0x0412:
            int r0 = r8.zzm
            if (r10 >= r0) goto L_0x0429
            int[] r0 = r8.zzk
            r2 = r0[r10]
            r3 = 0
            com.google.android.gms.internal.ads.zzgtg r4 = r8.zzo
            r0 = r27
            r1 = r28
            r5 = r28
            r0.zzD(r1, r2, r3, r4, r5)
            int r10 = r10 + 1
            goto L_0x0412
        L_0x0429:
            if (r9 != 0) goto L_0x0435
            r0 = r31
            if (r6 != r0) goto L_0x0430
            goto L_0x043b
        L_0x0430:
            com.google.android.gms.internal.ads.zzgqy r0 = com.google.android.gms.internal.ads.zzgqy.zzg()
            throw r0
        L_0x0435:
            r0 = r31
            if (r6 > r0) goto L_0x043c
            if (r7 != r9) goto L_0x043c
        L_0x043b:
            return r6
        L_0x043c:
            com.google.android.gms.internal.ads.zzgqy r0 = com.google.android.gms.internal.ads.zzgqy.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgoq):int");
    }

    public final Object zze() {
        return ((zzgqm) this.zzg).zzaD();
    }

    public final void zzf(Object obj) {
        if (zzV(obj)) {
            if (obj instanceof zzgqm) {
                zzgqm zzgqm = (zzgqm) obj;
                zzgqm.zzaU(a.e.API_PRIORITY_OTHER);
                zzgqm.zza = 0;
                zzgqm.zzaS();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzz = zzz(i10);
                int i11 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j10 = (long) i11;
                if (zzy != 9) {
                    switch (zzy) {
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
                            this.zzn.zzb(obj, j10);
                            continue;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzgrq) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (zzS(obj, i10)) {
                    zzC(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zze(obj);
            }
        }
    }

    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzz = zzz(i10);
            int i11 = this.zzc[i10];
            long j10 = (long) (1048575 & zzz);
            switch (zzy(zzz)) {
                case 0:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzr(obj, j10, zzgtq.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzs(obj, j10, zzgtq.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzu(obj, j10, zzgtq.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzu(obj, j10, zzgtq.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzt(obj, j10, zzgtq.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzu(obj, j10, zzgtq.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzt(obj, j10, zzgtq.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzp(obj, j10, zzgtq.zzz(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzv(obj, j10, zzgtq.zzh(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzv(obj, j10, zzgtq.zzh(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzt(obj, j10, zzgtq.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzt(obj, j10, zzgtq.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzt(obj, j10, zzgtq.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzu(obj, j10, zzgtq.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzt(obj, j10, zzgtq.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzS(obj2, i10)) {
                        break;
                    } else {
                        zzgtq.zzu(obj, j10, zzgtq.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i10);
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
                    this.zzn.zzc(obj, obj2, j10);
                    break;
                case 50:
                    zzgsr.zzI(this.zzr, obj, obj2, j10);
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
                    if (!zzW(obj2, i11, i10)) {
                        break;
                    } else {
                        zzgtq.zzv(obj, j10, zzgtq.zzh(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzW(obj2, i11, i10)) {
                        break;
                    } else {
                        zzgtq.zzv(obj, j10, zzgtq.zzh(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i10);
                    break;
            }
        }
        zzgsr.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgsr.zzE(this.zzp, obj, obj2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05e5, code lost:
        r15 = r9;
        r5 = r11;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0621, code lost:
        r4 = r10.zzc(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x062c, code lost:
        r0 = r7.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0630, code lost:
        if (r0 < r7.zzm) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0632, code lost:
        r4 = zzD(r18, r7.zzk[r0], r4, r10, r18);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0644, code lost:
        if (r4 != null) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0646, code lost:
        r10.zzn(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0183, code lost:
        r13 = r4;
        r11 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:179:0x061c */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0621 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0659 A[LOOP:5: B:197:0x0655->B:199:0x0659, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x062c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgsh r19, com.google.android.gms.internal.ads.zzgpy r20) throws java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r15 = r18
            r0 = r19
            r6 = r20
            java.util.Objects.requireNonNull(r20)
            zzI(r18)
            com.google.android.gms.internal.ads.zzgtg r14 = r7.zzo
            com.google.android.gms.internal.ads.zzgpz r5 = r7.zzp
            r16 = 0
            r4 = r16
            r8 = r4
        L_0x0017:
            int r2 = r19.zzc()     // Catch:{ all -> 0x064d }
            int r1 = r7.zzu(r2)     // Catch:{ all -> 0x064d }
            if (r1 >= 0) goto L_0x00b6
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0044
            int r0 = r7.zzl
        L_0x0028:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x003e
            int[] r1 = r7.zzk
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r14
            r6 = r18
            java.lang.Object r4 = r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0028
        L_0x003e:
            if (r4 == 0) goto L_0x0649
            r14.zzn(r15, r4)
            return
        L_0x0044:
            boolean r1 = r7.zzh     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x004b
            r11 = r16
            goto L_0x0052
        L_0x004b:
            com.google.android.gms.internal.ads.zzgrw r1 = r7.zzg     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r5.zzc(r6, r1, r2)     // Catch:{ all -> 0x00b1 }
            r11 = r1
        L_0x0052:
            if (r11 == 0) goto L_0x0070
            if (r8 != 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzgqd r1 = r5.zzb(r15)     // Catch:{ all -> 0x064d }
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
            java.lang.Object r4 = r8.zzd(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ac }
            r8 = r1
        L_0x006d:
            r15 = r2
            r14 = r3
            goto L_0x0017
        L_0x0070:
            r3 = r14
            r2 = r15
            r3.zzq(r0)     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x007c
            java.lang.Object r1 = r3.zzc(r2)     // Catch:{ all -> 0x00ac }
            r4 = r1
        L_0x007c:
            boolean r1 = r3.zzp(r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x006d
            int r0 = r7.zzl
        L_0x0084:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x009f
            int[] r1 = r7.zzk
            r5 = r1[r0]
            r1 = r17
            r9 = r2
            r2 = r18
            r10 = r3
            r3 = r5
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r2 = r9
            r3 = r10
            goto L_0x0084
        L_0x009f:
            r9 = r2
            r10 = r3
            if (r4 == 0) goto L_0x0649
            r10.zzn(r9, r4)
            return
        L_0x00a7:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x0652
        L_0x00ac:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x064b
        L_0x00b1:
            r0 = move-exception
            r10 = r14
            r9 = r15
            goto L_0x064b
        L_0x00b6:
            r10 = r14
            r9 = r15
            int r3 = r7.zzz(r1)     // Catch:{ all -> 0x064a }
            int r11 = zzy(r3)     // Catch:{ zzgqx -> 0x0618 }
            r12 = 1048575(0xfffff, float:1.469367E-39)
            switch(r11) {
                case 0: goto L_0x05d5;
                case 1: goto L_0x05c4;
                case 2: goto L_0x05b3;
                case 3: goto L_0x05a2;
                case 4: goto L_0x0591;
                case 5: goto L_0x0580;
                case 6: goto L_0x056e;
                case 7: goto L_0x055c;
                case 8: goto L_0x054e;
                case 9: goto L_0x0539;
                case 10: goto L_0x0527;
                case 11: goto L_0x0515;
                case 12: goto L_0x04f0;
                case 13: goto L_0x04de;
                case 14: goto L_0x04cc;
                case 15: goto L_0x04ba;
                case 16: goto L_0x04a8;
                case 17: goto L_0x0493;
                case 18: goto L_0x0482;
                case 19: goto L_0x0471;
                case 20: goto L_0x0460;
                case 21: goto L_0x044f;
                case 22: goto L_0x043e;
                case 23: goto L_0x042d;
                case 24: goto L_0x041c;
                case 25: goto L_0x040b;
                case 26: goto L_0x03de;
                case 27: goto L_0x03c9;
                case 28: goto L_0x03b8;
                case 29: goto L_0x03a7;
                case 30: goto L_0x038b;
                case 31: goto L_0x037a;
                case 32: goto L_0x0369;
                case 33: goto L_0x0358;
                case 34: goto L_0x0347;
                case 35: goto L_0x0336;
                case 36: goto L_0x0325;
                case 37: goto L_0x0314;
                case 38: goto L_0x0303;
                case 39: goto L_0x02f2;
                case 40: goto L_0x02e1;
                case 41: goto L_0x02d0;
                case 42: goto L_0x02bf;
                case 43: goto L_0x02ae;
                case 44: goto L_0x0291;
                case 45: goto L_0x0283;
                case 46: goto L_0x0275;
                case 47: goto L_0x0267;
                case 48: goto L_0x0259;
                case 49: goto L_0x0247;
                case 50: goto L_0x0211;
                case 51: goto L_0x01ff;
                case 52: goto L_0x01ee;
                case 53: goto L_0x01dd;
                case 54: goto L_0x01cc;
                case 55: goto L_0x01bb;
                case 56: goto L_0x01aa;
                case 57: goto L_0x0199;
                case 58: goto L_0x0188;
                case 59: goto L_0x017d;
                case 60: goto L_0x016c;
                case 61: goto L_0x015f;
                case 62: goto L_0x014e;
                case 63: goto L_0x0129;
                case 64: goto L_0x0118;
                case 65: goto L_0x0107;
                case 66: goto L_0x00f5;
                case 67: goto L_0x00e3;
                case 68: goto L_0x00d1;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            r13 = r4
            r11 = r5
            r14 = r6
            if (r13 != 0) goto L_0x05ee
            java.lang.Object r1 = r10.zzc(r9)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05ec
        L_0x00d1:
            java.lang.Object r3 = r7.zzG(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrw r3 = (com.google.android.gms.internal.ads.zzgrw) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgsp r11 = r7.zzC(r1)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzt(r3, r11, r6)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzP(r9, r2, r1, r3)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x00e3:
            r3 = r3 & r12
            long r11 = r19.zzn()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x00f5:
            r3 = r3 & r12
            int r11 = r19.zzi()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0107:
            r3 = r3 & r12
            long r11 = r19.zzm()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0118:
            r3 = r3 & r12
            int r11 = r19.zzh()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0129:
            int r11 = r19.zze()     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgqq r13 = r7.zzB(r1)     // Catch:{ zzgqx -> 0x0618 }
            if (r13 == 0) goto L_0x0141
            boolean r13 = r13.zza(r11)     // Catch:{ zzgqx -> 0x0618 }
            if (r13 == 0) goto L_0x013a
            goto L_0x0141
        L_0x013a:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgsr.zzD(r9, r2, r11, r4, r10)     // Catch:{ zzgqx -> 0x0618 }
            r15 = r9
            goto L_0x05e9
        L_0x0141:
            r3 = r3 & r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x014e:
            r3 = r3 & r12
            int r11 = r19.zzj()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x015f:
            r3 = r3 & r12
            com.google.android.gms.internal.ads.zzgpe r11 = r19.zzp()     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x016c:
            java.lang.Object r3 = r7.zzG(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrw r3 = (com.google.android.gms.internal.ads.zzgrw) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgsp r11 = r7.zzC(r1)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzu(r3, r11, r6)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzP(r9, r2, r1, r3)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x017d:
            r7.zzL(r9, r3, r0)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
        L_0x0183:
            r13 = r4
            r11 = r5
            r14 = r6
            goto L_0x05e5
        L_0x0188:
            r3 = r3 & r12
            boolean r11 = r19.zzN()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0199:
            r3 = r3 & r12
            int r11 = r19.zzf()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x01aa:
            r3 = r3 & r12
            long r11 = r19.zzk()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x01bb:
            r3 = r3 & r12
            int r11 = r19.zzg()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x01cc:
            r3 = r3 & r12
            long r11 = r19.zzo()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x01dd:
            r3 = r3 & r12
            long r11 = r19.zzl()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x01ee:
            r3 = r3 & r12
            float r11 = r19.zzb()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x01ff:
            r3 = r3 & r12
            double r11 = r19.zza()     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ zzgqx -> 0x0618 }
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r12, r11)     // Catch:{ zzgqx -> 0x0618 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0211:
            java.lang.Object r2 = r7.zzE(r1)     // Catch:{ zzgqx -> 0x0618 }
            int r1 = r7.zzz(r1)     // Catch:{ zzgqx -> 0x0618 }
            r1 = r1 & r12
            long r11 = (long) r1     // Catch:{ zzgqx -> 0x0618 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgtq.zzh(r9, r11)     // Catch:{ zzgqx -> 0x0618 }
            if (r1 == 0) goto L_0x0237
            boolean r3 = com.google.android.gms.internal.ads.zzgrr.zzb(r1)     // Catch:{ zzgqx -> 0x0618 }
            if (r3 == 0) goto L_0x0242
            com.google.android.gms.internal.ads.zzgrq r3 = com.google.android.gms.internal.ads.zzgrq.zza()     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrq r3 = r3.zzb()     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrr.zzc(r3, r1)     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r11, r3)     // Catch:{ zzgqx -> 0x0618 }
            r1 = r3
            goto L_0x0242
        L_0x0237:
            com.google.android.gms.internal.ads.zzgrq r1 = com.google.android.gms.internal.ads.zzgrq.zza()     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrq r1 = r1.zzb()     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r11, r1)     // Catch:{ zzgqx -> 0x0618 }
        L_0x0242:
            com.google.android.gms.internal.ads.zzgrq r1 = (com.google.android.gms.internal.ads.zzgrq) r1     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrp r2 = (com.google.android.gms.internal.ads.zzgrp) r2     // Catch:{ zzgqx -> 0x0618 }
            throw r16     // Catch:{ zzgqx -> 0x0618 }
        L_0x0247:
            r2 = r3 & r12
            com.google.android.gms.internal.ads.zzgsp r1 = r7.zzC(r1)     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgrk r3 = r7.zzn     // Catch:{ zzgqx -> 0x0618 }
            long r11 = (long) r2     // Catch:{ zzgqx -> 0x0618 }
            java.util.List r2 = r3.zza(r9, r11)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzC(r2, r1, r6)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0259:
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x0618 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzJ(r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0267:
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x0618 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzI(r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0275:
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x0618 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzH(r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0283:
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x0618 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzG(r1)     // Catch:{ zzgqx -> 0x0618 }
            goto L_0x0183
        L_0x0291:
            com.google.android.gms.internal.ads.zzgrk r11 = r7.zzn     // Catch:{ zzgqx -> 0x0618 }
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ zzgqx -> 0x0618 }
            java.util.List r3 = r11.zza(r9, r12)     // Catch:{ zzgqx -> 0x0618 }
            r0.zzy(r3)     // Catch:{ zzgqx -> 0x0618 }
            com.google.android.gms.internal.ads.zzgqq r11 = r7.zzB(r1)     // Catch:{ zzgqx -> 0x0618 }
            r1 = r18
            r13 = r4
            r4 = r11
            r11 = r5
            r5 = r13
            r14 = r6
            r6 = r10
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgsr.zzC(r1, r2, r3, r4, r5, r6)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x0613
        L_0x02ae:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzL(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x02bf:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzv(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x02d0:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzz(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x02e1:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzA(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x02f2:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzD(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0303:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzM(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0314:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzE(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0325:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzB(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0336:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzx(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0347:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzJ(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0358:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzI(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0369:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzH(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x037a:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzG(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x038b:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r4 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r3 = r3 & r12
            long r5 = (long) r3     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r3 = r4.zza(r9, r5)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzy(r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgqq r4 = r7.zzB(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r1 = r18
            r5 = r13
            r6 = r10
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgsr.zzC(r1, r2, r3, r4, r5, r6)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x0613
        L_0x03a7:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzL(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x03b8:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzw(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x03c9:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgsp r1 = r7.zzC(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            com.google.android.gms.internal.ads.zzgrk r3 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r2 = r3.zza(r9, r4)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzF(r2, r1, r14)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x03de:
            r13 = r4
            r11 = r5
            r14 = r6
            boolean r1 = zzR(r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            if (r1 == 0) goto L_0x03f9
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r0
            com.google.android.gms.internal.ads.zzgpn r2 = (com.google.android.gms.internal.ads.zzgpn) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r3 = 1
            r2.zzK(r1, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x03f9:
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r0
            com.google.android.gms.internal.ads.zzgpn r2 = (com.google.android.gms.internal.ads.zzgpn) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r3 = 0
            r2.zzK(r1, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x040b:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzv(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x041c:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzz(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x042d:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzA(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x043e:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzD(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x044f:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzM(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0460:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzE(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0471:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzB(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0482:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.ads.zzgrk r1 = r7.zzn     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzx(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0493:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.zzF(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgrw r2 = (com.google.android.gms.internal.ads.zzgrw) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgsp r3 = r7.zzC(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzt(r2, r3, r14)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzO(r9, r1, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x04a8:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzn()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r5 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzu(r9, r5, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x04ba:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzi()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzt(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x04cc:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzm()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r5 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzu(r9, r5, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x04de:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzh()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzt(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x04f0:
            r13 = r4
            r11 = r5
            r14 = r6
            int r4 = r19.zze()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgqq r5 = r7.zzB(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            if (r5 == 0) goto L_0x050a
            boolean r5 = r5.zza(r4)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            if (r5 == 0) goto L_0x0504
            goto L_0x050a
        L_0x0504:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgsr.zzD(r9, r2, r4, r13, r10)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x0613
        L_0x050a:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzt(r9, r2, r4)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0515:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzj()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzt(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0527:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            com.google.android.gms.internal.ads.zzgpe r3 = r19.zzp()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzv(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0539:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.zzF(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgrw r2 = (com.google.android.gms.internal.ads.zzgrw) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgsp r3 = r7.zzC(r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r0.zzu(r2, r3, r14)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzO(r9, r1, r2)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x054e:
            r13 = r4
            r11 = r5
            r14 = r6
            r7.zzL(r9, r3, r0)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0559:
            r0 = move-exception
            goto L_0x0651
        L_0x055c:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            boolean r3 = r19.zzN()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzp(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x056e:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzf()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzt(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0580:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzk()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r5 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzu(r9, r5, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x0591:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzg()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzt(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x05a2:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzo()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r5 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzu(r9, r5, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x05b3:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzl()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r5 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzu(r9, r5, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x05c4:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            float r3 = r19.zzb()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r4 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzs(r9, r4, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            goto L_0x05e5
        L_0x05d5:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            double r3 = r19.zza()     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            long r5 = (long) r2     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            com.google.android.gms.internal.ads.zzgtq.zzr(r9, r5, r3)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
            r7.zzM(r9, r1)     // Catch:{ zzgqx -> 0x061b, all -> 0x0559 }
        L_0x05e5:
            r15 = r9
            r5 = r11
            r4 = r13
        L_0x05e8:
            r6 = r14
        L_0x05e9:
            r14 = r10
            goto L_0x0017
        L_0x05ec:
            r4 = r1
            goto L_0x05ef
        L_0x05ee:
            r4 = r13
        L_0x05ef:
            boolean r1 = r10.zzp(r4, r0)     // Catch:{ zzgqx -> 0x061c }
            if (r1 != 0) goto L_0x0613
            int r0 = r7.zzl
        L_0x05f7:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x060d
            int[] r1 = r7.zzk
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x05f7
        L_0x060d:
            if (r4 == 0) goto L_0x0649
            r10.zzn(r9, r4)
            return
        L_0x0613:
            r15 = r9
            r5 = r11
            goto L_0x05e8
        L_0x0616:
            r0 = move-exception
            goto L_0x0652
        L_0x0618:
            r13 = r4
            r11 = r5
            r14 = r6
        L_0x061b:
            r4 = r13
        L_0x061c:
            r10.zzq(r0)     // Catch:{ all -> 0x0616 }
            if (r4 != 0) goto L_0x0626
            java.lang.Object r1 = r10.zzc(r9)     // Catch:{ all -> 0x0616 }
            r4 = r1
        L_0x0626:
            boolean r1 = r10.zzp(r4, r0)     // Catch:{ all -> 0x0616 }
            if (r1 != 0) goto L_0x0613
            int r0 = r7.zzl
        L_0x062e:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x0644
            int[] r1 = r7.zzk
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x062e
        L_0x0644:
            if (r4 == 0) goto L_0x0649
            r10.zzn(r9, r4)
        L_0x0649:
            return
        L_0x064a:
            r0 = move-exception
        L_0x064b:
            r13 = r4
            goto L_0x0651
        L_0x064d:
            r0 = move-exception
            r13 = r4
            r10 = r14
            r9 = r15
        L_0x0651:
            r4 = r13
        L_0x0652:
            int r1 = r7.zzl
            r8 = r1
        L_0x0655:
            int r1 = r7.zzm
            if (r8 >= r1) goto L_0x066b
            int[] r1 = r7.zzk
            r3 = r1[r8]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.zzD(r2, r3, r4, r5, r6)
            int r8 = r8 + 1
            goto L_0x0655
        L_0x066b:
            if (r4 == 0) goto L_0x0670
            r10.zzn(r9, r4)
        L_0x0670:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgsh, com.google.android.gms.internal.ads.zzgpy):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0300, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x032c, code lost:
        if (r0 != r14) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x034f, code lost:
        if (r0 != r14) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0116, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0149, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021f, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023d, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0240, code lost:
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0249, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x024d, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ed, code lost:
        if (r0 != r24) goto L_0x02ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgoq r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.zzj
            if (r0 == 0) goto L_0x0394
            zzI(r31)
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0021:
            if (r0 >= r13) goto L_0x0377
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0033
            int r0 = com.google.android.gms.internal.ads.zzgor.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x0036
        L_0x0033:
            r17 = r0
            r4 = r3
        L_0x0036:
            int r5 = r17 >>> 3
            if (r5 <= r1) goto L_0x0041
            int r2 = r2 / 3
            int r0 = r15.zzv(r5, r2)
            goto L_0x0045
        L_0x0041:
            int r0 = r15.zzu(r5)
        L_0x0045:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r23 = r5
            r29 = r9
            r15 = 0
        L_0x004e:
            r18 = -1
            goto L_0x0352
        L_0x0052:
            r3 = r17 & 7
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = zzy(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0254
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            r22 = r1
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r15) goto L_0x0085
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r19
        L_0x0087:
            if (r0 == r15) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r19
        L_0x0094:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x0222;
                case 1: goto L_0x0206;
                case 2: goto L_0x01e5;
                case 3: goto L_0x01e5;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ad;
                case 6: goto L_0x0196;
                case 7: goto L_0x0175;
                case 8: goto L_0x0150;
                case 9: goto L_0x0121;
                case 10: goto L_0x0103;
                case 11: goto L_0x01cd;
                case 12: goto L_0x00f0;
                case 13: goto L_0x0196;
                case 14: goto L_0x01ad;
                case 15: goto L_0x00d9;
                case 16: goto L_0x00a6;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x024d
        L_0x00a6:
            if (r3 != 0) goto L_0x00d0
            int r13 = com.google.android.gms.internal.ads.zzgor.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.gms.internal.ads.zzgpm.zzG(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0249
        L_0x00d0:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0149
        L_0x00d9:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0149
            int r0 = com.google.android.gms.internal.ads.zzgor.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.ads.zzgpm.zzF(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0116
        L_0x00f0:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0149
            int r0 = com.google.android.gms.internal.ads.zzgor.zzj(r12, r4, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x0116
        L_0x0103:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0149
            int r0 = com.google.android.gms.internal.ads.zzgor.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
        L_0x0116:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            goto L_0x036f
        L_0x0121:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0149
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.zzF(r14, r15)
            com.google.android.gms.internal.ads.zzgsp r1 = r13.zzC(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.zzgor.zzo(r0, r1, r2, r3, r4, r5)
            r13.zzO(r14, r15, r8)
            goto L_0x023d
        L_0x0149:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x024d
        L_0x0150:
            r13 = r30
            r23 = r33
            r15 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x016a
            int r0 = com.google.android.gms.internal.ads.zzgor.zzg(r12, r4, r11)
            goto L_0x016e
        L_0x016a:
            int r0 = com.google.android.gms.internal.ads.zzgor.zzh(r12, r4, r11)
        L_0x016e:
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x023d
        L_0x0175:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024d
            int r0 = com.google.android.gms.internal.ads.zzgor.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r5 = 0
        L_0x0191:
            com.google.android.gms.internal.ads.zzgtq.zzp(r14, r8, r5)
            goto L_0x023d
        L_0x0196:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024d
            int r0 = com.google.android.gms.internal.ads.zzgor.zzb(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021f
        L_0x01ad:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024d
            long r21 = com.google.android.gms.internal.ads.zzgor.zzp(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x023d
        L_0x01cd:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024d
            int r0 = com.google.android.gms.internal.ads.zzgor.zzj(r12, r4, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x023d
        L_0x01e5:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024d
            int r17 = com.google.android.gms.internal.ads.zzgor.zzm(r12, r4, r11)
            long r4 = r11.zzb
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x0240
        L_0x0206:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024d
            int r0 = com.google.android.gms.internal.ads.zzgor.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.zzgtq.zzs(r14, r8, r0)
        L_0x021f:
            int r0 = r4 + 4
            goto L_0x023d
        L_0x0222:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024d
            long r0 = com.google.android.gms.internal.ads.zzgor.zzp(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.zzgtq.zzr(r14, r8, r0)
            int r0 = r4 + 8
        L_0x023d:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x0240:
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r13
        L_0x0249:
            r13 = r34
            goto L_0x0021
        L_0x024d:
            r2 = r4
            r29 = r7
            r7 = r20
            goto L_0x004e
        L_0x0254:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02b3
            r0 = 2
            if (r3 != r0) goto L_0x02a8
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.ads.zzgqv r0 = (com.google.android.gms.internal.ads.zzgqv) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0285
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027d
            r1 = 10
            goto L_0x027e
        L_0x027d:
            int r1 = r1 + r1
        L_0x027e:
            com.google.android.gms.internal.ads.zzgqv r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
        L_0x0285:
            r5 = r0
            com.google.android.gms.internal.ads.zzgsp r0 = r10.zzC(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.zzgor.zze(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r10
            r10 = -1
            goto L_0x0021
        L_0x02a8:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x032f
        L_0x02b3:
            r0 = 49
            if (r13 > r0) goto L_0x0302
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x0300
        L_0x02ef:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x036d
        L_0x0300:
            r2 = r0
            goto L_0x0330
        L_0x0302:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x0335
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x032f
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            int r0 = r0.zzr(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x0300
            goto L_0x02ef
        L_0x032f:
            r2 = r14
        L_0x0330:
            r6 = r25
            r7 = r26
            goto L_0x0352
        L_0x0335:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x0300
            goto L_0x02ef
        L_0x0352:
            com.google.android.gms.internal.ads.zzgth r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.zzgor.zzi(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
        L_0x036d:
            r9 = r29
        L_0x036f:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0021
        L_0x0377:
            r25 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x038a
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x038a:
            r4 = r34
            if (r0 != r4) goto L_0x038f
            return
        L_0x038f:
            com.google.android.gms.internal.ads.zzgqy r0 = com.google.android.gms.internal.ads.zzgqy.zzg()
            throw r0
        L_0x0394:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.zzc(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgoq):void");
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z10;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzz = zzz(i10);
            long j10 = (long) (zzz & 1048575);
            switch (zzy(zzz)) {
                case 0:
                    if (zzQ(obj, obj2, i10) && Double.doubleToLongBits(zzgtq.zzb(obj, j10)) == Double.doubleToLongBits(zzgtq.zzb(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (zzQ(obj, obj2, i10) && Float.floatToIntBits(zzgtq.zzc(obj, j10)) == Float.floatToIntBits(zzgtq.zzc(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzf(obj, j10) == zzgtq.zzf(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzf(obj, j10) == zzgtq.zzf(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzd(obj, j10) == zzgtq.zzd(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzf(obj, j10) == zzgtq.zzf(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzd(obj, j10) == zzgtq.zzd(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzz(obj, j10) == zzgtq.zzz(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (zzQ(obj, obj2, i10) && zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (zzQ(obj, obj2, i10) && zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (zzQ(obj, obj2, i10) && zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10))) {
                        continue;
                    }
                case 11:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzd(obj, j10) == zzgtq.zzd(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzd(obj, j10) == zzgtq.zzd(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzd(obj, j10) == zzgtq.zzd(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzf(obj, j10) == zzgtq.zzf(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzd(obj, j10) == zzgtq.zzd(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (zzQ(obj, obj2, i10) && zzgtq.zzf(obj, j10) == zzgtq.zzf(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (zzQ(obj, obj2, i10) && zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10))) {
                        continue;
                    }
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
                    z10 = zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10));
                    break;
                case 50:
                    z10 = zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzw = (long) (zzw(i10) & 1048575);
                    if (zzgtq.zzd(obj, zzw) == zzgtq.zzd(obj2, zzw) && zzgsr.zzH(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10))) {
                        continue;
                    }
            }
            if (!z10) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzl) {
            int i15 = this.zzk[i14];
            int i16 = this.zzc[i15];
            int zzz = zzz(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj2, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if ((268435456 & zzz) != 0 && !zzT(obj, i15, i11, i10, i19)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzW(obj2, i16, i15) && !zzU(obj2, zzz, zzC(i15))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzgrq) zzgtq.zzh(obj2, (long) (zzz & 1048575))).isEmpty()) {
                            zzgrp zzgrp = (zzgrp) zzE(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgtq.zzh(obj2, (long) (zzz & 1048575));
                if (!list.isEmpty()) {
                    zzgsp zzC = zzC(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzC.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzT(obj, i15, i11, i10, i19) && !zzU(obj2, zzz, zzC(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    public final void zzm(Object obj, zzgpu zzgpu) throws IOException {
        int i10;
        Object obj2 = obj;
        zzgpu zzgpu2 = zzgpu;
        int i11 = 1048575;
        if (this.zzj) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i12 = 0; i12 < length; i12 += 3) {
                    int zzz = zzz(i12);
                    int i13 = this.zzc[i12];
                    switch (zzy(zzz)) {
                        case 0:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzf(i13, zzgtq.zzb(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 1:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzo(i13, zzgtq.zzc(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 2:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzt(i13, zzgtq.zzf(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 3:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzJ(i13, zzgtq.zzf(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 4:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzr(i13, zzgtq.zzd(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 5:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzm(i13, zzgtq.zzf(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 6:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzk(i13, zzgtq.zzd(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 7:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzb(i13, zzgtq.zzz(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 8:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzZ(i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2);
                                break;
                            }
                        case 9:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzv(i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzC(i12));
                                break;
                            }
                        case 10:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzd(i13, (zzgpe) zzgtq.zzh(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 11:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzH(i13, zzgtq.zzd(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 12:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzi(i13, zzgtq.zzd(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 13:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzw(i13, zzgtq.zzd(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 14:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzy(i13, zzgtq.zzf(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 15:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzA(i13, zzgtq.zzd(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 16:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzC(i13, zzgtq.zzf(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 17:
                            if (!zzS(obj2, i12)) {
                                break;
                            } else {
                                zzgpu2.zzq(i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzC(i12));
                                break;
                            }
                        case 18:
                            zzgsr.zzL(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 19:
                            zzgsr.zzP(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 20:
                            zzgsr.zzS(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 21:
                            zzgsr.zzaa(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 22:
                            zzgsr.zzR(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 23:
                            zzgsr.zzO(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 24:
                            zzgsr.zzN(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 25:
                            zzgsr.zzJ(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 26:
                            zzgsr.zzY(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2);
                            break;
                        case 27:
                            zzgsr.zzT(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, zzC(i12));
                            break;
                        case 28:
                            zzgsr.zzK(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2);
                            break;
                        case 29:
                            zzgsr.zzZ(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 30:
                            zzgsr.zzM(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 31:
                            zzgsr.zzU(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 32:
                            zzgsr.zzV(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 33:
                            zzgsr.zzW(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 34:
                            zzgsr.zzX(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, false);
                            break;
                        case 35:
                            zzgsr.zzL(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 36:
                            zzgsr.zzP(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 37:
                            zzgsr.zzS(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 38:
                            zzgsr.zzaa(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 39:
                            zzgsr.zzR(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 40:
                            zzgsr.zzO(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 41:
                            zzgsr.zzN(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 42:
                            zzgsr.zzJ(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 43:
                            zzgsr.zzZ(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 44:
                            zzgsr.zzM(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 45:
                            zzgsr.zzU(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 46:
                            zzgsr.zzV(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 47:
                            zzgsr.zzW(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 48:
                            zzgsr.zzX(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, true);
                            break;
                        case 49:
                            zzgsr.zzQ(i13, (List) zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2, zzC(i12));
                            break;
                        case 50:
                            zzY(zzgpu2, i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), i12);
                            break;
                        case 51:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzf(i13, zzn(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 52:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzo(i13, zzo(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 53:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzt(i13, zzA(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 54:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzJ(i13, zzA(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 55:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzr(i13, zzq(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 56:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzm(i13, zzA(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 57:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzk(i13, zzq(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 58:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzb(i13, zzX(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 59:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzZ(i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzgpu2);
                                break;
                            }
                        case 60:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzv(i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzC(i12));
                                break;
                            }
                        case 61:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzd(i13, (zzgpe) zzgtq.zzh(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 62:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzH(i13, zzq(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 63:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzi(i13, zzq(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 64:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzw(i13, zzq(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 65:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzy(i13, zzA(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 66:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzA(i13, zzq(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 67:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzC(i13, zzA(obj2, (long) (zzz & 1048575)));
                                break;
                            }
                        case 68:
                            if (!zzW(obj2, i13, i12)) {
                                break;
                            } else {
                                zzgpu2.zzq(i13, zzgtq.zzh(obj2, (long) (zzz & 1048575)), zzC(i12));
                                break;
                            }
                    }
                }
                zzgtg zzgtg = this.zzo;
                zzgtg.zzr(zzgtg.zzd(obj2), zzgpu2);
                return;
            }
            this.zzp.zza(obj2);
            throw null;
        } else if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i14 = 0;
            int i15 = 1048575;
            int i16 = 0;
            while (i14 < length2) {
                int zzz2 = zzz(i14);
                int[] iArr = this.zzc;
                int i17 = iArr[i14];
                int zzy = zzy(zzz2);
                if (zzy <= 17) {
                    int i18 = iArr[i14 + 2];
                    int i19 = i18 & i11;
                    if (i19 != i15) {
                        i16 = unsafe.getInt(obj2, (long) i19);
                        i15 = i19;
                    }
                    i10 = 1 << (i18 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = (long) (zzz2 & i11);
                switch (zzy) {
                    case 0:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            zzgpu2.zzf(i17, zzgtq.zzb(obj2, j10));
                            continue;
                        }
                    case 1:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzo(i17, zzgtq.zzc(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzt(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzJ(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzr(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzm(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzk(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzb(i17, zzgtq.zzz(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i16 & i10) != 0) {
                            zzZ(i17, unsafe.getObject(obj2, j10), zzgpu2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzv(i17, unsafe.getObject(obj2, j10), zzC(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzd(i17, (zzgpe) unsafe.getObject(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzH(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzi(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzw(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzy(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzA(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzC(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i16 & i10) != 0) {
                            zzgpu2.zzq(i17, unsafe.getObject(obj2, j10), zzC(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzgsr.zzL(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 19:
                        zzgsr.zzP(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 20:
                        zzgsr.zzS(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 21:
                        zzgsr.zzaa(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 22:
                        zzgsr.zzR(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 23:
                        zzgsr.zzO(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 24:
                        zzgsr.zzN(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 25:
                        zzgsr.zzJ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        continue;
                    case 26:
                        zzgsr.zzY(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2);
                        break;
                    case 27:
                        zzgsr.zzT(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, zzC(i14));
                        break;
                    case 28:
                        zzgsr.zzK(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2);
                        break;
                    case 29:
                        zzgsr.zzZ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        break;
                    case 30:
                        zzgsr.zzM(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        break;
                    case 31:
                        zzgsr.zzU(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        break;
                    case 32:
                        zzgsr.zzV(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        break;
                    case 33:
                        zzgsr.zzW(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        break;
                    case 34:
                        zzgsr.zzX(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, false);
                        break;
                    case 35:
                        zzgsr.zzL(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 36:
                        zzgsr.zzP(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 37:
                        zzgsr.zzS(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 38:
                        zzgsr.zzaa(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 39:
                        zzgsr.zzR(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 40:
                        zzgsr.zzO(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 41:
                        zzgsr.zzN(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 42:
                        zzgsr.zzJ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 43:
                        zzgsr.zzZ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 44:
                        zzgsr.zzM(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 45:
                        zzgsr.zzU(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 46:
                        zzgsr.zzV(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 47:
                        zzgsr.zzW(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 48:
                        zzgsr.zzX(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, true);
                        break;
                    case 49:
                        zzgsr.zzQ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzgpu2, zzC(i14));
                        break;
                    case 50:
                        zzY(zzgpu2, i17, unsafe.getObject(obj2, j10), i14);
                        break;
                    case 51:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzf(i17, zzn(obj2, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzo(i17, zzo(obj2, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzt(i17, zzA(obj2, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzJ(i17, zzA(obj2, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzr(i17, zzq(obj2, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzm(i17, zzA(obj2, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzk(i17, zzq(obj2, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzb(i17, zzX(obj2, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzW(obj2, i17, i14)) {
                            zzZ(i17, unsafe.getObject(obj2, j10), zzgpu2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzv(i17, unsafe.getObject(obj2, j10), zzC(i14));
                            break;
                        }
                        break;
                    case 61:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzd(i17, (zzgpe) unsafe.getObject(obj2, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzH(i17, zzq(obj2, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzi(i17, zzq(obj2, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzw(i17, zzq(obj2, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzy(i17, zzA(obj2, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzA(i17, zzq(obj2, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzC(i17, zzA(obj2, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzW(obj2, i17, i14)) {
                            zzgpu2.zzq(i17, unsafe.getObject(obj2, j10), zzC(i14));
                            break;
                        }
                        break;
                }
                i14 += 3;
                i11 = 1048575;
            }
            zzgtg zzgtg2 = this.zzo;
            zzgtg2.zzr(zzgtg2.zzd(obj2), zzgpu2);
        } else {
            this.zzp.zza(obj2);
            throw null;
        }
    }
}
