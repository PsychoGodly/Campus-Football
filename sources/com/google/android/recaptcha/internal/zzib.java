package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzib<T> implements zzil<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhy zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzhm zzn;
    private final zzjf zzo;
    private final zzga zzp;
    private final zzie zzq;
    private final zzht zzr;

    private zzib(int[] iArr, Object[] objArr, int i10, int i11, zzhy zzhy, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzie zzie, zzhm zzhm, zzjf zzjf, zzga zzga, zzht zzht) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhy instanceof zzgo;
        this.zzj = z10;
        boolean z12 = false;
        if (zzga != null && zzga.zzj(zzhy)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzie;
        this.zzn = zzhm;
        this.zzo = zzjf;
        this.zzp = zzga;
        this.zzg = zzhy;
        this.zzr = zzht;
    }

    private static long zzA(Object obj, long j10) {
        return ((Long) zzjp.zzf(obj, j10)).longValue();
    }

    private final zzgs zzB(int i10) {
        int i11 = i10 / 3;
        return (zzgs) this.zzd[i11 + i11 + 1];
    }

    private final zzil zzC(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzil zzil = (zzil) this.zzd[i12];
        if (zzil != null) {
            return zzil;
        }
        zzil zzb2 = zzih.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i10, Object obj2, zzjf zzjf, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf2 = zzjp.zzf(obj, (long) (zzz(i10) & 1048575));
        if (zzf2 == null || zzB(i10) == null) {
            return obj2;
        }
        zzhs zzhs = (zzhs) zzf2;
        zzhr zzhr = (zzhr) zzE(i10);
        throw null;
    }

    private final Object zzE(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzF(Object obj, int i10) {
        zzil zzC = zzC(i10);
        int zzz = zzz(i10) & 1048575;
        if (!zzT(obj, i10)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, (long) zzz);
        if (zzW(object)) {
            return object;
        }
        Object zze2 = zzC.zze();
        if (object != null) {
            zzC.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzG(Object obj, int i10, int i11) {
        zzil zzC = zzC(i11);
        if (!zzX(obj, i10, i11)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, (long) (zzz(i11) & 1048575));
        if (zzW(object)) {
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
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        if (zzT(obj2, i10)) {
            Unsafe unsafe = zzb;
            long zzz = (long) (zzz(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzz);
            if (object != null) {
                zzil zzC = zzC(i10);
                if (!zzT(obj, i10)) {
                    if (!zzW(object)) {
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
                if (!zzW(object2)) {
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
        if (zzX(obj2, i11, i10)) {
            Unsafe unsafe = zzb;
            long zzz = (long) (zzz(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzz);
            if (object != null) {
                zzil zzC = zzC(i10);
                if (!zzX(obj, i11, i10)) {
                    if (!zzW(object)) {
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
                if (!zzW(object2)) {
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

    private final void zzL(Object obj, int i10, zzik zzik) throws IOException {
        if (zzS(i10)) {
            zzjp.zzs(obj, (long) (i10 & 1048575), zzik.zzs());
        } else if (this.zzi) {
            zzjp.zzs(obj, (long) (i10 & 1048575), zzik.zzr());
        } else {
            zzjp.zzs(obj, (long) (i10 & 1048575), zzik.zzp());
        }
    }

    private final void zzM(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = (long) (1048575 & zzw);
        if (j10 != 1048575) {
            zzjp.zzq(obj, j10, (1 << (zzw >>> 20)) | zzjp.zzc(obj, j10));
        }
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzjp.zzq(obj, (long) (zzw(i11) & 1048575), i10);
    }

    private final void zzO(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, (long) (zzz(i10) & 1048575), obj2);
        zzM(obj, i10);
    }

    private final void zzP(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, (long) (zzz(i11) & 1048575), obj2);
        zzN(obj, i10, i11);
    }

    private final void zzQ(zzjx zzjx, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            zzhr zzhr = (zzhr) zzE(i11);
            throw null;
        }
    }

    private final boolean zzR(Object obj, Object obj2, int i10) {
        return zzT(obj, i10) == zzT(obj2, i10);
    }

    private static boolean zzS(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzT(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = (long) (zzw & 1048575);
        if (j10 == 1048575) {
            int zzz = zzz(i10);
            long j11 = (long) (zzz & 1048575);
            switch (zzy(zzz)) {
                case 0:
                    return Double.doubleToRawLongBits(zzjp.zza(obj, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzjp.zzb(obj, j11)) != 0;
                case 2:
                    return zzjp.zzd(obj, j11) != 0;
                case 3:
                    return zzjp.zzd(obj, j11) != 0;
                case 4:
                    return zzjp.zzc(obj, j11) != 0;
                case 5:
                    return zzjp.zzd(obj, j11) != 0;
                case 6:
                    return zzjp.zzc(obj, j11) != 0;
                case 7:
                    return zzjp.zzw(obj, j11);
                case 8:
                    Object zzf2 = zzjp.zzf(obj, j11);
                    if (zzf2 instanceof String) {
                        return !((String) zzf2).isEmpty();
                    }
                    if (zzf2 instanceof zzez) {
                        return !zzez.zzb.equals(zzf2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzjp.zzf(obj, j11) != null;
                case 10:
                    return !zzez.zzb.equals(zzjp.zzf(obj, j11));
                case 11:
                    return zzjp.zzc(obj, j11) != 0;
                case 12:
                    return zzjp.zzc(obj, j11) != 0;
                case 13:
                    return zzjp.zzc(obj, j11) != 0;
                case 14:
                    return zzjp.zzd(obj, j11) != 0;
                case 15:
                    return zzjp.zzc(obj, j11) != 0;
                case 16:
                    return zzjp.zzd(obj, j11) != 0;
                case 17:
                    return zzjp.zzf(obj, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzjp.zzc(obj, j10) & (1 << (zzw >>> 20))) != 0;
        }
    }

    private final boolean zzU(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzT(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzV(Object obj, int i10, zzil zzil) {
        return zzil.zzl(zzjp.zzf(obj, (long) (i10 & 1048575)));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zzF();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i10, int i11) {
        return zzjp.zzc(obj, (long) (zzw(i11) & 1048575)) == i10;
    }

    private static boolean zzY(Object obj, long j10) {
        return ((Boolean) zzjp.zzf(obj, j10)).booleanValue();
    }

    private static final void zzZ(int i10, Object obj, zzjx zzjx) throws IOException {
        if (obj instanceof String) {
            zzjx.zzG(i10, (String) obj);
        } else {
            zzjx.zzd(i10, (zzez) obj);
        }
    }

    static zzjg zzd(Object obj) {
        zzgo zzgo = (zzgo) obj;
        zzjg zzjg = zzgo.zzc;
        if (zzjg != zzjg.zzc()) {
            return zzjg;
        }
        zzjg zzf2 = zzjg.zzf();
        zzgo.zzc = zzf2;
        return zzf2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.recaptcha.internal.zzib zzm(java.lang.Class r31, com.google.android.recaptcha.internal.zzhv r32, com.google.android.recaptcha.internal.zzie r33, com.google.android.recaptcha.internal.zzhm r34, com.google.android.recaptcha.internal.zzjf r35, com.google.android.recaptcha.internal.zzga r36, com.google.android.recaptcha.internal.zzht r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzij
            if (r1 == 0) goto L_0x03d8
            com.google.android.recaptcha.internal.zzij r0 = (com.google.android.recaptcha.internal.zzij) r0
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
            com.google.android.recaptcha.internal.zzhy r16 = r0.zza()
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
            r26 = r14
            r14 = 51
            if (r3 < r14) goto L_0x029b
            int r14 = r6 + 1
            char r6 = r2.charAt(r6)
            r28 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0236
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = r28
            r28 = 13
        L_0x0217:
            int r29 = r14 + 1
            char r14 = r2.charAt(r14)
            r30 = r8
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r8) goto L_0x0230
            r8 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r28
            r6 = r6 | r8
            int r28 = r28 + 13
            r14 = r29
            r8 = r30
            goto L_0x0217
        L_0x0230:
            int r8 = r14 << r28
            r6 = r6 | r8
            r14 = r29
            goto L_0x023a
        L_0x0236:
            r30 = r8
            r14 = r28
        L_0x023a:
            int r8 = r3 + -51
            r28 = r14
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
            r25 = r28
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
            r14 = r26
            r1 = r27
            r8 = r30
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x018e
        L_0x03b7:
            r30 = r8
            r26 = r14
            com.google.android.recaptcha.internal.zzib r1 = new com.google.android.recaptcha.internal.zzib
            com.google.android.recaptcha.internal.zzhy r15 = r0.zza()
            r17 = 0
            r10 = r1
            r11 = r12
            r12 = r13
            r13 = r30
            r16 = r7
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r25 = r37
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x03d8:
            com.google.android.recaptcha.internal.zziz r0 = (com.google.android.recaptcha.internal.zziz) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzhv, com.google.android.recaptcha.internal.zzie, com.google.android.recaptcha.internal.zzhm, com.google.android.recaptcha.internal.zzjf, com.google.android.recaptcha.internal.zzga, com.google.android.recaptcha.internal.zzht):com.google.android.recaptcha.internal.zzib");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzjp.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzjp.zzf(obj, j10)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032f, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03a0, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04ae, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0561, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0570, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0574, code lost:
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
            if (r5 >= r9) goto L_0x057b
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
                case 0: goto L_0x0565;
                case 1: goto L_0x0556;
                case 2: goto L_0x0540;
                case 3: goto L_0x052c;
                case 4: goto L_0x0518;
                case 5: goto L_0x050c;
                case 6: goto L_0x0500;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04b1;
                case 10: goto L_0x0492;
                case 11: goto L_0x047d;
                case 12: goto L_0x0468;
                case 13: goto L_0x045b;
                case 14: goto L_0x044e;
                case 15: goto L_0x0434;
                case 16: goto L_0x041a;
                case 17: goto L_0x0406;
                case 18: goto L_0x03f8;
                case 19: goto L_0x03ec;
                case 20: goto L_0x03e0;
                case 21: goto L_0x03d4;
                case 22: goto L_0x03c8;
                case 23: goto L_0x03bc;
                case 24: goto L_0x03b0;
                case 25: goto L_0x03a4;
                case 26: goto L_0x0396;
                case 27: goto L_0x0387;
                case 28: goto L_0x037c;
                case 29: goto L_0x0370;
                case 30: goto L_0x0364;
                case 31: goto L_0x0358;
                case 32: goto L_0x034c;
                case 33: goto L_0x0340;
                case 34: goto L_0x0334;
                case 35: goto L_0x0319;
                case 36: goto L_0x0302;
                case 37: goto L_0x02eb;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02bd;
                case 40: goto L_0x02a5;
                case 41: goto L_0x028d;
                case 42: goto L_0x0273;
                case 43: goto L_0x025b;
                case 44: goto L_0x0243;
                case 45: goto L_0x022b;
                case 46: goto L_0x0213;
                case 47: goto L_0x01fb;
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
            goto L_0x03a1
        L_0x0042:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.recaptcha.internal.zzhy r3 = (com.google.android.recaptcha.internal.zzhy) r3
            com.google.android.recaptcha.internal.zzil r4 = r0.zzC(r5)
            int r3 = com.google.android.recaptcha.internal.zzfk.zzt(r11, r3, r4)
            goto L_0x03a0
        L_0x0058:
            boolean r10 = r0.zzX(r1, r11, r5)
            if (r10 == 0) goto L_0x03a1
            long r3 = zzA(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r10)
            long r3 = r3 ^ r11
            int r3 = com.google.android.recaptcha.internal.zzfk.zzz(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x03a1
        L_0x0074:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x0330
        L_0x008f:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x01c2
        L_0x009d:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x01b2
        L_0x00ab:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzu(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0330
        L_0x00c1:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0330
        L_0x00d7:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.recaptcha.internal.zzez r3 = (com.google.android.recaptcha.internal.zzez) r3
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
        L_0x00f4:
            int r3 = r3 + r9
            goto L_0x03a0
        L_0x00f7:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.recaptcha.internal.zzil r4 = r0.zzC(r5)
            int r3 = com.google.android.recaptcha.internal.zzin.zzn(r11, r3, r4)
            goto L_0x03a0
        L_0x010b:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.recaptcha.internal.zzez
            if (r4 == 0) goto L_0x012d
            com.google.android.recaptcha.internal.zzez r3 = (com.google.android.recaptcha.internal.zzez) r3
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x00f4
        L_0x012d:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzx(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0330
        L_0x013b:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r3 = r3 + r14
            goto L_0x03a0
        L_0x014a:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x01b2
        L_0x0157:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x01c2
        L_0x0164:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzq(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzu(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0330
        L_0x017a:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = zzA(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzz(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r9)
            goto L_0x0330
        L_0x0190:
            boolean r9 = r0.zzX(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = zzA(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzz(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r9)
            goto L_0x0330
        L_0x01a6:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
        L_0x01b2:
            int r3 = r3 + 4
            goto L_0x03a0
        L_0x01b6:
            boolean r3 = r0.zzX(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
        L_0x01c2:
            int r3 = r3 + 8
            goto L_0x03a0
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.zzE(r5)
            com.google.android.recaptcha.internal.zzht.zza(r11, r3, r4)
            goto L_0x03a1
        L_0x01d3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.recaptcha.internal.zzil r4 = r0.zzC(r5)
            int r3 = com.google.android.recaptcha.internal.zzin.zzi(r11, r3, r4)
            goto L_0x03a0
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzs(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x01fb:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzq(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x0213:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzh(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x022b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzf(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x0243:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzd(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x025b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzv(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x0273:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r4 = com.google.android.recaptcha.internal.zzin.zza
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzf(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x02a5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzh(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x02bd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzk(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzx(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x02eb:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzm(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x0302:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzf(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x032f
        L_0x0319:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzh(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
        L_0x032f:
            int r4 = r4 + r9
        L_0x0330:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x03a1
        L_0x0334:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.recaptcha.internal.zzin.zzr(r11, r3, r9)
            goto L_0x03a0
        L_0x0340:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzp(r11, r3, r9)
            goto L_0x03a0
        L_0x034c:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzg(r11, r3, r9)
            goto L_0x03a0
        L_0x0358:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zze(r11, r3, r9)
            goto L_0x03a0
        L_0x0364:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzc(r11, r3, r9)
            goto L_0x03a0
        L_0x0370:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzu(r11, r3, r9)
            goto L_0x03a0
        L_0x037c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzb(r11, r3)
            goto L_0x03a0
        L_0x0387:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.recaptcha.internal.zzil r4 = r0.zzC(r5)
            int r3 = com.google.android.recaptcha.internal.zzin.zzo(r11, r3, r4)
            goto L_0x03a0
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzt(r11, r3)
        L_0x03a0:
            int r6 = r6 + r3
        L_0x03a1:
            r12 = 0
            goto L_0x0574
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.recaptcha.internal.zzin.zza(r11, r3, r12)
            goto L_0x0403
        L_0x03b0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zze(r11, r3, r12)
            goto L_0x0403
        L_0x03bc:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzg(r11, r3, r12)
            goto L_0x0403
        L_0x03c8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzj(r11, r3, r12)
            goto L_0x0403
        L_0x03d4:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzw(r11, r3, r12)
            goto L_0x0403
        L_0x03e0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzl(r11, r3, r12)
            goto L_0x0403
        L_0x03ec:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zze(r11, r3, r12)
            goto L_0x0403
        L_0x03f8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.recaptcha.internal.zzin.zzg(r11, r3, r12)
        L_0x0403:
            int r6 = r6 + r3
            goto L_0x0574
        L_0x0406:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.recaptcha.internal.zzhy r3 = (com.google.android.recaptcha.internal.zzhy) r3
            com.google.android.recaptcha.internal.zzil r4 = r0.zzC(r5)
            int r3 = com.google.android.recaptcha.internal.zzfk.zzt(r11, r3, r4)
            goto L_0x0403
        L_0x041a:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r14 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r10)
            long r3 = r3 ^ r14
            int r3 = com.google.android.recaptcha.internal.zzfk.zzz(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0574
        L_0x0434:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x0553
        L_0x044e:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x0570
        L_0x045b:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x0561
        L_0x0468:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzu(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0553
        L_0x047d:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0553
        L_0x0492:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.recaptcha.internal.zzez r3 = (com.google.android.recaptcha.internal.zzez) r3
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
        L_0x04ae:
            int r3 = r3 + r9
            goto L_0x0403
        L_0x04b1:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.recaptcha.internal.zzil r4 = r0.zzC(r5)
            int r3 = com.google.android.recaptcha.internal.zzin.zzn(r11, r3, r4)
            goto L_0x0403
        L_0x04c4:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.recaptcha.internal.zzez
            if (r4 == 0) goto L_0x04e5
            com.google.android.recaptcha.internal.zzez r3 = (com.google.android.recaptcha.internal.zzez) r3
            int r4 = r11 << 3
            int r9 = com.google.android.recaptcha.internal.zzfk.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x04ae
        L_0x04e5:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzx(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0553
        L_0x04f2:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            int r3 = r3 + r14
            goto L_0x0403
        L_0x0500:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x0561
        L_0x050c:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
            goto L_0x0570
        L_0x0518:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzu(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0553
        L_0x052c:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzz(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r9)
            goto L_0x0553
        L_0x0540:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzz(r3)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r9)
        L_0x0553:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0574
        L_0x0556:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
        L_0x0561:
            int r3 = r3 + 4
            goto L_0x0403
        L_0x0565:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.recaptcha.internal.zzfk.zzy(r3)
        L_0x0570:
            int r3 = r3 + 8
            goto L_0x0403
        L_0x0574:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x057b:
            r12 = 0
            com.google.android.recaptcha.internal.zzjf r2 = r0.zzo
            java.lang.Object r3 = r2.zzd(r1)
            int r2 = r2.zza(r3)
            int r6 = r6 + r2
            boolean r2 = r0.zzh
            if (r2 == 0) goto L_0x05d9
            com.google.android.recaptcha.internal.zzga r2 = r0.zzp
            com.google.android.recaptcha.internal.zzge r1 = r2.zzb(r1)
            r4 = 0
        L_0x0592:
            com.google.android.recaptcha.internal.zziy r2 = r1.zza
            int r2 = r2.zzb()
            if (r4 >= r2) goto L_0x05b2
            com.google.android.recaptcha.internal.zziy r2 = r1.zza
            java.util.Map$Entry r2 = r2.zzg(r4)
            java.lang.Object r3 = r2.getKey()
            com.google.android.recaptcha.internal.zzgd r3 = (com.google.android.recaptcha.internal.zzgd) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.recaptcha.internal.zzge.zza(r3, r2)
            int r12 = r12 + r2
            int r4 = r4 + 1
            goto L_0x0592
        L_0x05b2:
            com.google.android.recaptcha.internal.zziy r1 = r1.zza
            java.lang.Iterable r1 = r1.zzc()
            java.util.Iterator r1 = r1.iterator()
        L_0x05bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05d8
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.recaptcha.internal.zzgd r3 = (com.google.android.recaptcha.internal.zzgd) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.recaptcha.internal.zzge.zza(r3, r2)
            int r12 = r12 + r2
            goto L_0x05bc
        L_0x05d8:
            int r6 = r6 + r12
        L_0x05d9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzp(java.lang.Object):int");
    }

    private static int zzq(Object obj, long j10) {
        return ((Integer) zzjp.zzf(obj, j10)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzem zzem) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzht.zzb(object)) {
            zzhs zzb2 = zzhs.zza().zzb();
            zzht.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzhr zzhr = (zzhr) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzem zzem) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        zzem zzem2 = zzem;
        Unsafe unsafe = zzb;
        long j12 = (long) (this.zzc[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(zzen.zzq(bArr, i10))));
                    int i23 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(zzen.zzb(bArr, i10))));
                    int i24 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int zzm2 = zzen.zzm(bArr2, i18, zzem2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzem2.zzb));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int zzj2 = zzen.zzj(bArr2, i18, zzem2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzem2.zza));
                    unsafe.putInt(obj2, j12, i20);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(zzen.zzq(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzen.zzb(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int zzm3 = zzen.zzm(bArr2, i18, zzem2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(zzem2.zzb != 0));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm3;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int zzj3 = zzen.zzj(bArr2, i18, zzem2);
                    int i27 = zzem2.zza;
                    if (i27 == 0) {
                        unsafe.putObject(obj2, j11, MaxReward.DEFAULT_LABEL);
                    } else if ((i15 & 536870912) == 0 || zzju.zzf(bArr2, zzj3, zzj3 + i27)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, zzj3, i27, zzgw.zzb));
                        zzj3 += i27;
                    } else {
                        throw zzgy.zzd();
                    }
                    unsafe.putInt(obj2, j12, i20);
                    return zzj3;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object zzG = zzG(obj2, i20, i22);
                    int zzo2 = zzen.zzo(zzG, zzC(i22), bArr, i10, i11, zzem);
                    zzP(obj2, i20, i22, zzG);
                    return zzo2;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int zza2 = zzen.zza(bArr2, i18, zzem2);
                    unsafe.putObject(obj2, j11, zzem2.zzc);
                    unsafe.putInt(obj2, j12, i20);
                    return zza2;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int zzj4 = zzen.zzj(bArr2, i18, zzem2);
                    int i28 = zzem2.zza;
                    zzgs zzB = zzB(i22);
                    if (zzB == null || zzB.zza()) {
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
                    int zzj5 = zzen.zzj(bArr2, i18, zzem2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzff.zzF(zzem2.zza)));
                    unsafe.putInt(obj2, j12, i20);
                    return zzj5;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int zzm4 = zzen.zzm(bArr2, i18, zzem2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzff.zzG(zzem2.zzb)));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm4;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object zzG2 = zzG(obj2, i20, i22);
                    int zzn2 = zzen.zzn(zzG2, zzC(i22), bArr, i10, i11, (i19 & -8) | 4, zzem);
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
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.recaptcha.internal.zzem r29) throws java.io.IOException {
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
            com.google.android.recaptcha.internal.zzgv r12 = (com.google.android.recaptcha.internal.zzgv) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.recaptcha.internal.zzgv r12 = r12.zzd(r13)
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
            com.google.android.recaptcha.internal.zzil r1 = r15.zzC(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.recaptcha.internal.zzen.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x0421
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.recaptcha.internal.zzhn r12 = (com.google.android.recaptcha.internal.zzhn) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.recaptcha.internal.zzen.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.recaptcha.internal.zzff.zzG(r4)
            r12.zzf(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0444
        L_0x007b:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x0443
            com.google.android.recaptcha.internal.zzhn r12 = (com.google.android.recaptcha.internal.zzhn) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.recaptcha.internal.zzff.zzG(r8)
            r12.zzf(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.recaptcha.internal.zzen.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.recaptcha.internal.zzff.zzG(r8)
            r12.zzf(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.recaptcha.internal.zzgp r12 = (com.google.android.recaptcha.internal.zzgp) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.recaptcha.internal.zzff.zzF(r4)
            r12.zzg(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0444
        L_0x00ca:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x0443
            com.google.android.recaptcha.internal.zzgp r12 = (com.google.android.recaptcha.internal.zzgp) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.recaptcha.internal.zzff.zzF(r4)
            r12.zzg(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.recaptcha.internal.zzff.zzF(r4)
            r12.zzg(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.recaptcha.internal.zzen.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0443
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.recaptcha.internal.zzen.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.recaptcha.internal.zzgs r3 = r15.zzB(r8)
            r4 = 0
            com.google.android.recaptcha.internal.zzjf r5 = r0.zzo
            r22 = r16
            r23 = r21
            r24 = r12
            r25 = r3
            r26 = r4
            r27 = r5
            com.google.android.recaptcha.internal.zzin.zzB(r22, r23, r24, r25, r26, r27)
        L_0x0128:
            r1 = r2
            goto L_0x0444
        L_0x012b:
            if (r6 != r14) goto L_0x0443
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0180
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017b
            if (r4 != 0) goto L_0x0141
            com.google.android.recaptcha.internal.zzez r4 = com.google.android.recaptcha.internal.zzez.zzb
            r12.add(r4)
            goto L_0x0149
        L_0x0141:
            com.google.android.recaptcha.internal.zzez r6 = com.google.android.recaptcha.internal.zzez.zzm(r3, r1, r4)
            r12.add(r6)
        L_0x0148:
            int r1 = r1 + r4
        L_0x0149:
            if (r1 >= r5) goto L_0x017a
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0154
            goto L_0x017a
        L_0x0154:
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0175
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0170
            if (r4 != 0) goto L_0x0168
            com.google.android.recaptcha.internal.zzez r4 = com.google.android.recaptcha.internal.zzez.zzb
            r12.add(r4)
            goto L_0x0149
        L_0x0168:
            com.google.android.recaptcha.internal.zzez r6 = com.google.android.recaptcha.internal.zzez.zzm(r3, r1, r4)
            r12.add(r6)
            goto L_0x0148
        L_0x0170:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x0175:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzf()
            throw r1
        L_0x017a:
            return r1
        L_0x017b:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x0180:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzf()
            throw r1
        L_0x0185:
            if (r6 != r14) goto L_0x0443
            com.google.android.recaptcha.internal.zzil r1 = r15.zzC(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.recaptcha.internal.zzen.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x019e:
            if (r6 != r14) goto L_0x0443
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01f1
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01ec
            if (r6 != 0) goto L_0x01b9
            r12.add(r1)
            goto L_0x01c4
        L_0x01b9:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.recaptcha.internal.zzgw.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01c3:
            int r4 = r4 + r6
        L_0x01c4:
            if (r4 >= r5) goto L_0x0443
            int r6 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0443
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01e7
            if (r6 != 0) goto L_0x01dc
            r12.add(r1)
            goto L_0x01c4
        L_0x01dc:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.recaptcha.internal.zzgw.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01c3
        L_0x01e7:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzf()
            throw r1
        L_0x01ec:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzf()
            throw r1
        L_0x01f1:
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024c
            if (r6 != 0) goto L_0x01ff
            r12.add(r1)
            goto L_0x0212
        L_0x01ff:
            int r8 = r4 + r6
            boolean r9 = com.google.android.recaptcha.internal.zzju.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0247
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.recaptcha.internal.zzgw.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0211:
            r4 = r8
        L_0x0212:
            if (r4 >= r5) goto L_0x0443
            int r6 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0443
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0242
            if (r6 != 0) goto L_0x022a
            r12.add(r1)
            goto L_0x0212
        L_0x022a:
            int r8 = r4 + r6
            boolean r9 = com.google.android.recaptcha.internal.zzju.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x023d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.recaptcha.internal.zzgw.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0211
        L_0x023d:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzd()
            throw r1
        L_0x0242:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzf()
            throw r1
        L_0x0247:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzd()
            throw r1
        L_0x024c:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzf()
            throw r1
        L_0x0251:
            r1 = 0
            if (r6 != r14) goto L_0x0279
            com.google.android.recaptcha.internal.zzeo r12 = (com.google.android.recaptcha.internal.zzeo) r12
            int r2 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x025d:
            if (r2 >= r4) goto L_0x0270
            int r2 = com.google.android.recaptcha.internal.zzen.zzm(r3, r2, r7)
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
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x0279:
            if (r6 != 0) goto L_0x0443
            com.google.android.recaptcha.internal.zzeo r12 = (com.google.android.recaptcha.internal.zzeo) r12
            int r4 = com.google.android.recaptcha.internal.zzen.zzm(r3, r4, r7)
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
            int r6 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x0298
            goto L_0x02a9
        L_0x0298:
            int r4 = com.google.android.recaptcha.internal.zzen.zzm(r3, r6, r7)
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
            com.google.android.recaptcha.internal.zzgp r12 = (com.google.android.recaptcha.internal.zzgp) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02b5:
            if (r1 >= r2) goto L_0x02c1
            int r4 = com.google.android.recaptcha.internal.zzen.zzb(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 4
            goto L_0x02b5
        L_0x02c1:
            if (r1 != r2) goto L_0x02c5
            goto L_0x0444
        L_0x02c5:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x02ca:
            if (r6 != r9) goto L_0x0443
            com.google.android.recaptcha.internal.zzgp r12 = (com.google.android.recaptcha.internal.zzgp) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzb(r17, r18)
            r12.zzg(r1)
        L_0x02d5:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02ea
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02e2
            goto L_0x02ea
        L_0x02e2:
            int r1 = com.google.android.recaptcha.internal.zzen.zzb(r3, r4)
            r12.zzg(r1)
            goto L_0x02d5
        L_0x02ea:
            return r1
        L_0x02eb:
            if (r6 != r14) goto L_0x030b
            com.google.android.recaptcha.internal.zzhn r12 = (com.google.android.recaptcha.internal.zzhn) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02f6:
            if (r1 >= r2) goto L_0x0302
            long r4 = com.google.android.recaptcha.internal.zzen.zzq(r3, r1)
            r12.zzf(r4)
            int r1 = r1 + 8
            goto L_0x02f6
        L_0x0302:
            if (r1 != r2) goto L_0x0306
            goto L_0x0444
        L_0x0306:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x030b:
            if (r6 != r13) goto L_0x0443
            com.google.android.recaptcha.internal.zzhn r12 = (com.google.android.recaptcha.internal.zzhn) r12
            long r8 = com.google.android.recaptcha.internal.zzen.zzq(r17, r18)
            r12.zzf(r8)
        L_0x0316:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x032b
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0323
            goto L_0x032b
        L_0x0323:
            long r8 = com.google.android.recaptcha.internal.zzen.zzq(r3, r4)
            r12.zzf(r8)
            goto L_0x0316
        L_0x032b:
            return r1
        L_0x032c:
            if (r6 != r14) goto L_0x0334
            int r1 = com.google.android.recaptcha.internal.zzen.zzf(r3, r4, r12, r7)
            goto L_0x0444
        L_0x0334:
            if (r6 != 0) goto L_0x0443
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.recaptcha.internal.zzen.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0345:
            if (r6 != r14) goto L_0x0365
            com.google.android.recaptcha.internal.zzhn r12 = (com.google.android.recaptcha.internal.zzhn) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0350:
            if (r1 >= r2) goto L_0x035c
            int r1 = com.google.android.recaptcha.internal.zzen.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzf(r4)
            goto L_0x0350
        L_0x035c:
            if (r1 != r2) goto L_0x0360
            goto L_0x0444
        L_0x0360:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x0365:
            if (r6 != 0) goto L_0x0443
            com.google.android.recaptcha.internal.zzhn r12 = (com.google.android.recaptcha.internal.zzhn) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
        L_0x0372:
            if (r1 >= r5) goto L_0x0387
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x037d
            goto L_0x0387
        L_0x037d:
            int r1 = com.google.android.recaptcha.internal.zzen.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
            goto L_0x0372
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ac
            com.google.android.recaptcha.internal.zzgg r12 = (com.google.android.recaptcha.internal.zzgg) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            int r4 = com.google.android.recaptcha.internal.zzen.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a7
            goto L_0x0444
        L_0x03a7:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x03ac:
            if (r6 != r9) goto L_0x0443
            com.google.android.recaptcha.internal.zzgg r12 = (com.google.android.recaptcha.internal.zzgg) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03bb:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d4
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03c8
            goto L_0x03d4
        L_0x03c8:
            int r1 = com.google.android.recaptcha.internal.zzen.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03bb
        L_0x03d4:
            return r1
        L_0x03d5:
            if (r6 != r14) goto L_0x03f8
            com.google.android.recaptcha.internal.zzft r12 = (com.google.android.recaptcha.internal.zzft) r12
            int r1 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03e0:
            if (r1 >= r2) goto L_0x03f0
            long r4 = com.google.android.recaptcha.internal.zzen.zzq(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03e0
        L_0x03f0:
            if (r1 != r2) goto L_0x03f3
            goto L_0x0444
        L_0x03f3:
            com.google.android.recaptcha.internal.zzgy r1 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r1
        L_0x03f8:
            if (r6 != r13) goto L_0x0443
            com.google.android.recaptcha.internal.zzft r12 = (com.google.android.recaptcha.internal.zzft) r12
            long r8 = com.google.android.recaptcha.internal.zzen.zzq(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0407:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.recaptcha.internal.zzen.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0414
            goto L_0x0420
        L_0x0414:
            long r8 = com.google.android.recaptcha.internal.zzen.zzq(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0407
        L_0x0420:
            return r1
        L_0x0421:
            if (r4 >= r5) goto L_0x0442
            int r8 = com.google.android.recaptcha.internal.zzen.zzj(r3, r4, r7)
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
            int r4 = com.google.android.recaptcha.internal.zzen.zzc(r21, r22, r23, r24, r25, r26)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.recaptcha.internal.zzem):int");
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
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0326, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0420, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04a2, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x055f, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x056f, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0573, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzj
            if (r0 == 0) goto L_0x0583
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0009:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0577
            int r4 = r11.zzz(r2)
            int r5 = zzy(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.google.android.recaptcha.internal.zzgf r7 = com.google.android.recaptcha.internal.zzgf.DOUBLE_LIST_PACKED
            int r7 = r7.zza()
            if (r5 < r7) goto L_0x0034
            com.google.android.recaptcha.internal.zzgf r7 = com.google.android.recaptcha.internal.zzgf.SINT64_LIST_PACKED
            int r7 = r7.zza()
            if (r5 > r7) goto L_0x0034
            int[] r7 = r11.zzc
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0034:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0563;
                case 1: goto L_0x0553;
                case 2: goto L_0x053c;
                case 3: goto L_0x0527;
                case 4: goto L_0x0512;
                case 5: goto L_0x0505;
                case 6: goto L_0x04f8;
                case 7: goto L_0x04e8;
                case 8: goto L_0x04b9;
                case 9: goto L_0x04a5;
                case 10: goto L_0x0485;
                case 11: goto L_0x046f;
                case 12: goto L_0x0459;
                case 13: goto L_0x044b;
                case 14: goto L_0x043d;
                case 15: goto L_0x0422;
                case 16: goto L_0x0406;
                case 17: goto L_0x03f1;
                case 18: goto L_0x03e4;
                case 19: goto L_0x03d9;
                case 20: goto L_0x03ce;
                case 21: goto L_0x03c3;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03ad;
                case 24: goto L_0x03a2;
                case 25: goto L_0x0397;
                case 26: goto L_0x038c;
                case 27: goto L_0x037d;
                case 28: goto L_0x0371;
                case 29: goto L_0x0365;
                case 30: goto L_0x0359;
                case 31: goto L_0x034d;
                case 32: goto L_0x0341;
                case 33: goto L_0x0335;
                case 34: goto L_0x0329;
                case 35: goto L_0x0310;
                case 36: goto L_0x02f9;
                case 37: goto L_0x02e2;
                case 38: goto L_0x02cb;
                case 39: goto L_0x02b4;
                case 40: goto L_0x029c;
                case 41: goto L_0x0284;
                case 42: goto L_0x026a;
                case 43: goto L_0x0252;
                case 44: goto L_0x023a;
                case 45: goto L_0x0222;
                case 46: goto L_0x020a;
                case 47: goto L_0x01f2;
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
            goto L_0x0573
        L_0x003c:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            com.google.android.recaptcha.internal.zzhy r4 = (com.google.android.recaptcha.internal.zzhy) r4
            com.google.android.recaptcha.internal.zzil r5 = r11.zzC(r2)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzt(r6, r4, r5)
            goto L_0x03ee
        L_0x0052:
            boolean r5 = r11.zzX(r12, r6, r2)
            if (r5 == 0) goto L_0x0573
            long r7 = zzA(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.recaptcha.internal.zzfk.zzz(r5)
            goto L_0x0420
        L_0x006e:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0550
        L_0x0089:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x056f
        L_0x0097:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x055f
        L_0x00a5:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzu(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x00bb:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x00d1:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            com.google.android.recaptcha.internal.zzez r4 = (com.google.android.recaptcha.internal.zzez) r4
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x04a2
        L_0x00f0:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            com.google.android.recaptcha.internal.zzil r5 = r11.zzC(r2)
            int r4 = com.google.android.recaptcha.internal.zzin.zzn(r6, r4, r5)
            goto L_0x03ee
        L_0x0104:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.recaptcha.internal.zzez
            if (r5 == 0) goto L_0x0127
            com.google.android.recaptcha.internal.zzez r4 = (com.google.android.recaptcha.internal.zzez) r4
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x04a2
        L_0x0127:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzx(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x0135:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x04f4
        L_0x0143:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x055f
        L_0x0151:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x056f
        L_0x015f:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = zzq(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzu(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x0175:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = zzA(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzz(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r6)
            goto L_0x0550
        L_0x018b:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = zzA(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzz(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r6)
            goto L_0x0550
        L_0x01a1:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x055f
        L_0x01af:
            boolean r4 = r11.zzX(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x056f
        L_0x01bd:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.lang.Object r5 = r11.zzE(r2)
            com.google.android.recaptcha.internal.zzht.zza(r6, r4, r5)
            goto L_0x0573
        L_0x01ca:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.recaptcha.internal.zzil r5 = r11.zzC(r2)
            int r4 = com.google.android.recaptcha.internal.zzin.zzi(r6, r4, r5)
            goto L_0x03ee
        L_0x01da:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzs(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x01f2:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzq(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x020a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzh(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x0222:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzf(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x023a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzd(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x0252:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzv(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x026a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r5 = com.google.android.recaptcha.internal.zzin.zza
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x0284:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzf(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x029c:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzh(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x02b4:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzk(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x02cb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzx(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x02e2:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzm(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x02f9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzf(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0326
        L_0x0310:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzh(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
        L_0x0326:
            int r5 = r5 + r6
            goto L_0x0550
        L_0x0329:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzr(r6, r4, r1)
            goto L_0x03ee
        L_0x0335:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzp(r6, r4, r1)
            goto L_0x03ee
        L_0x0341:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzg(r6, r4, r1)
            goto L_0x03ee
        L_0x034d:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zze(r6, r4, r1)
            goto L_0x03ee
        L_0x0359:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzc(r6, r4, r1)
            goto L_0x03ee
        L_0x0365:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzu(r6, r4, r1)
            goto L_0x03ee
        L_0x0371:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzb(r6, r4)
            goto L_0x03ee
        L_0x037d:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.recaptcha.internal.zzil r5 = r11.zzC(r2)
            int r4 = com.google.android.recaptcha.internal.zzin.zzo(r6, r4, r5)
            goto L_0x03ee
        L_0x038c:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzt(r6, r4)
            goto L_0x03ee
        L_0x0397:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zza(r6, r4, r1)
            goto L_0x03ee
        L_0x03a2:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zze(r6, r4, r1)
            goto L_0x03ee
        L_0x03ad:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzg(r6, r4, r1)
            goto L_0x03ee
        L_0x03b8:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzj(r6, r4, r1)
            goto L_0x03ee
        L_0x03c3:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzw(r6, r4, r1)
            goto L_0x03ee
        L_0x03ce:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzl(r6, r4, r1)
            goto L_0x03ee
        L_0x03d9:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zze(r6, r4, r1)
            goto L_0x03ee
        L_0x03e4:
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.recaptcha.internal.zzin.zzg(r6, r4, r1)
        L_0x03ee:
            int r3 = r3 + r4
            goto L_0x0573
        L_0x03f1:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            com.google.android.recaptcha.internal.zzhy r4 = (com.google.android.recaptcha.internal.zzhy) r4
            com.google.android.recaptcha.internal.zzil r5 = r11.zzC(r2)
            int r4 = com.google.android.recaptcha.internal.zzfk.zzt(r6, r4, r5)
            goto L_0x03ee
        L_0x0406:
            boolean r5 = r11.zzT(r12, r2)
            if (r5 == 0) goto L_0x0573
            long r7 = com.google.android.recaptcha.internal.zzjp.zzd(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.recaptcha.internal.zzfk.zzz(r5)
        L_0x0420:
            int r4 = r4 + r5
            goto L_0x03ee
        L_0x0422:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.recaptcha.internal.zzjp.zzc(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x0550
        L_0x043d:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x056f
        L_0x044b:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x055f
        L_0x0459:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.recaptcha.internal.zzjp.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzu(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x046f:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.recaptcha.internal.zzjp.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x0485:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            com.google.android.recaptcha.internal.zzez r4 = (com.google.android.recaptcha.internal.zzez) r4
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
        L_0x04a2:
            int r4 = r4 + r6
            goto L_0x03ee
        L_0x04a5:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            com.google.android.recaptcha.internal.zzil r5 = r11.zzC(r2)
            int r4 = com.google.android.recaptcha.internal.zzin.zzn(r6, r4, r5)
            goto L_0x03ee
        L_0x04b9:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzjp.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.recaptcha.internal.zzez
            if (r5 == 0) goto L_0x04db
            com.google.android.recaptcha.internal.zzez r4 = (com.google.android.recaptcha.internal.zzez) r4
            int r5 = r6 << 3
            int r6 = com.google.android.recaptcha.internal.zzfk.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x04a2
        L_0x04db:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzx(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x04e8:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
        L_0x04f4:
            int r4 = r4 + 1
            goto L_0x03ee
        L_0x04f8:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x055f
        L_0x0505:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
            goto L_0x056f
        L_0x0512:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.recaptcha.internal.zzjp.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzu(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r5)
            goto L_0x0550
        L_0x0527:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = com.google.android.recaptcha.internal.zzjp.zzd(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzz(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r6)
            goto L_0x0550
        L_0x053c:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = com.google.android.recaptcha.internal.zzjp.zzd(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzz(r4)
            int r5 = com.google.android.recaptcha.internal.zzfk.zzy(r6)
        L_0x0550:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0573
        L_0x0553:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
        L_0x055f:
            int r4 = r4 + 4
            goto L_0x03ee
        L_0x0563:
            boolean r4 = r11.zzT(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.recaptcha.internal.zzfk.zzy(r4)
        L_0x056f:
            int r4 = r4 + 8
            goto L_0x03ee
        L_0x0573:
            int r2 = r2 + 3
            goto L_0x0009
        L_0x0577:
            com.google.android.recaptcha.internal.zzjf r0 = r11.zzo
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            goto L_0x0587
        L_0x0583:
            int r3 = r11.zzp(r12)
        L_0x0587:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0201, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        r2 = r2 + ((int) (r3 ^ (r3 >>> 32)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0214, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0218
            int r3 = r9.zzz(r1)
            int[] r4 = r9.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = zzy(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x0203;
                case 1: goto L_0x01f7;
                case 2: goto L_0x01ee;
                case 3: goto L_0x01e5;
                case 4: goto L_0x01de;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01ce;
                case 7: goto L_0x01c3;
                case 8: goto L_0x01b6;
                case 9: goto L_0x01a8;
                case 10: goto L_0x019d;
                case 11: goto L_0x0196;
                case 12: goto L_0x018e;
                case 13: goto L_0x0186;
                case 14: goto L_0x017c;
                case 15: goto L_0x0174;
                case 16: goto L_0x016a;
                case 17: goto L_0x015f;
                case 18: goto L_0x0153;
                case 19: goto L_0x0153;
                case 20: goto L_0x0153;
                case 21: goto L_0x0153;
                case 22: goto L_0x0153;
                case 23: goto L_0x0153;
                case 24: goto L_0x0153;
                case 25: goto L_0x0153;
                case 26: goto L_0x0153;
                case 27: goto L_0x0153;
                case 28: goto L_0x0153;
                case 29: goto L_0x0153;
                case 30: goto L_0x0153;
                case 31: goto L_0x0153;
                case 32: goto L_0x0153;
                case 33: goto L_0x0153;
                case 34: goto L_0x0153;
                case 35: goto L_0x0153;
                case 36: goto L_0x0153;
                case 37: goto L_0x0153;
                case 38: goto L_0x0153;
                case 39: goto L_0x0153;
                case 40: goto L_0x0153;
                case 41: goto L_0x0153;
                case 42: goto L_0x0153;
                case 43: goto L_0x0153;
                case 44: goto L_0x0153;
                case 45: goto L_0x0153;
                case 46: goto L_0x0153;
                case 47: goto L_0x0153;
                case 48: goto L_0x0153;
                case 49: goto L_0x0153;
                case 50: goto L_0x0147;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x0111;
                case 54: goto L_0x0101;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00d5;
                case 58: goto L_0x00c3;
                case 59: goto L_0x00af;
                case 60: goto L_0x009d;
                case 61: goto L_0x008b;
                case 62: goto L_0x007d;
                case 63: goto L_0x006f;
                case 64: goto L_0x0061;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0033;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0214
        L_0x0021:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x0033:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzA(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0043:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzq(r10, r5)
            goto L_0x0201
        L_0x0051:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzA(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0061:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzq(r10, r5)
            goto L_0x0201
        L_0x006f:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzq(r10, r5)
            goto L_0x0201
        L_0x007d:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzq(r10, r5)
            goto L_0x0201
        L_0x008b:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x009d:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x00af:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x00c3:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            boolean r3 = zzY(r10, r5)
            int r3 = com.google.android.recaptcha.internal.zzgw.zza(r3)
            goto L_0x0201
        L_0x00d5:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzq(r10, r5)
            goto L_0x0201
        L_0x00e3:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzA(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x00f3:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzq(r10, r5)
            goto L_0x0201
        L_0x0101:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzA(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0111:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzA(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0121:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            float r3 = zzo(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0201
        L_0x0133:
            boolean r3 = r9.zzX(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            double r3 = zzn(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0147:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x0153:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x015f:
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            if (r3 == 0) goto L_0x01b2
            int r7 = r3.hashCode()
            goto L_0x01b2
        L_0x016a:
            int r2 = r2 * 53
            long r3 = com.google.android.recaptcha.internal.zzjp.zzd(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0174:
            int r2 = r2 * 53
            int r3 = com.google.android.recaptcha.internal.zzjp.zzc(r10, r5)
            goto L_0x0201
        L_0x017c:
            int r2 = r2 * 53
            long r3 = com.google.android.recaptcha.internal.zzjp.zzd(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x0186:
            int r2 = r2 * 53
            int r3 = com.google.android.recaptcha.internal.zzjp.zzc(r10, r5)
            goto L_0x0201
        L_0x018e:
            int r2 = r2 * 53
            int r3 = com.google.android.recaptcha.internal.zzjp.zzc(r10, r5)
            goto L_0x0201
        L_0x0196:
            int r2 = r2 * 53
            int r3 = com.google.android.recaptcha.internal.zzjp.zzc(r10, r5)
            goto L_0x0201
        L_0x019d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x01a8:
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            if (r3 == 0) goto L_0x01b2
            int r7 = r3.hashCode()
        L_0x01b2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0214
        L_0x01b6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzjp.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x01c3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.recaptcha.internal.zzjp.zzw(r10, r5)
            int r3 = com.google.android.recaptcha.internal.zzgw.zza(r3)
            goto L_0x0201
        L_0x01ce:
            int r2 = r2 * 53
            int r3 = com.google.android.recaptcha.internal.zzjp.zzc(r10, r5)
            goto L_0x0201
        L_0x01d5:
            int r2 = r2 * 53
            long r3 = com.google.android.recaptcha.internal.zzjp.zzd(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.recaptcha.internal.zzjp.zzc(r10, r5)
            goto L_0x0201
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.recaptcha.internal.zzjp.zzd(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x01ee:
            int r2 = r2 * 53
            long r3 = com.google.android.recaptcha.internal.zzjp.zzd(r10, r5)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
            goto L_0x020f
        L_0x01f7:
            int r2 = r2 * 53
            float r3 = com.google.android.recaptcha.internal.zzjp.zzb(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
        L_0x0201:
            int r2 = r2 + r3
            goto L_0x0214
        L_0x0203:
            int r2 = r2 * 53
            double r3 = com.google.android.recaptcha.internal.zzjp.zza(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.recaptcha.internal.zzgw.zzd
        L_0x020f:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r4 = (int) r3
            int r2 = r2 + r4
        L_0x0214:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0218:
            int r2 = r2 * 53
            com.google.android.recaptcha.internal.zzjf r0 = r9.zzo
            java.lang.Object r0 = r0.zzd(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x0238
            int r2 = r2 * 53
            com.google.android.recaptcha.internal.zzga r0 = r9.zzp
            com.google.android.recaptcha.internal.zzge r10 = r0.zzb(r10)
            com.google.android.recaptcha.internal.zziy r10 = r10.zza
            int r10 = r10.hashCode()
            int r2 = r2 + r10
        L_0x0238:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0327, code lost:
        if (r0 != r15) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0344, code lost:
        r8 = r36;
        r7 = r38;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x036e, code lost:
        if (r0 != r15) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0394, code lost:
        if (r0 != r15) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x048a, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x049b, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x049d, code lost:
        r1.zzi(r0.zzb, r5);
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016a, code lost:
        r0 = r13 | r7;
        r13 = r37;
        r3 = r6;
        r1 = r11;
        r6 = r26;
        r8 = -1;
        r11 = r38;
        r32 = r5;
        r5 = r0;
        r0 = r2;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017d, code lost:
        r12 = r5;
        r36 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024c, code lost:
        r0 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024f, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0250, code lost:
        r36 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0269, code lost:
        r5 = r13 | r7;
        r13 = r37;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x026e, code lost:
        r1 = r11;
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0271, code lost:
        r6 = r26;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0274, code lost:
        r11 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0278, code lost:
        r12 = r6;
        r36 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027b, code lost:
        r8 = r36;
        r7 = r38;
        r2 = r3;
        r31 = r10;
        r21 = r11;
        r25 = r12;
        r17 = r13;
        r6 = r26;
        r24 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzem r39) throws java.io.IOException {
        /*
            r33 = this;
            r15 = r33
            r14 = r34
            r12 = r35
            r13 = r37
            r11 = r38
            r9 = r39
            zzI(r34)
            sun.misc.Unsafe r10 = zzb
            r8 = -1
            r16 = 0
            r0 = r36
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x04d8
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.android.recaptcha.internal.zzen.zzk(r0, r12, r3, r9)
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
            r18 = 0
            if (r2 != r8) goto L_0x0054
            r21 = r0
            r2 = r3
            r8 = r4
            r17 = r5
            r31 = r10
            r7 = r11
            r20 = -1
            r24 = 1
            r25 = 0
            goto L_0x0397
        L_0x0054:
            r8 = r4 & 7
            int[] r7 = r15.zzc
            int r21 = r2 + 1
            r1 = r7[r21]
            int r11 = zzy(r1)
            r17 = r0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r1 & r13
            long r13 = (long) r0
            r0 = 17
            r23 = r4
            r4 = 2
            if (r11 > r0) goto L_0x0290
            int r0 = r2 + 2
            r0 = r7[r0]
            int r7 = r0 >>> 20
            r22 = 1
            int r7 = r22 << r7
            r24 = r13
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            if (r0 == r6) goto L_0x0096
            if (r6 == r13) goto L_0x008a
            long r13 = (long) r6
            r6 = r34
            r10.putInt(r6, r13, r5)
            goto L_0x008c
        L_0x008a:
            r6 = r34
        L_0x008c:
            long r13 = (long) r0
            int r5 = r10.getInt(r6, r13)
            r26 = r0
            r13 = r5
            r14 = r6
            goto L_0x009b
        L_0x0096:
            r14 = r34
            r13 = r5
            r26 = r6
        L_0x009b:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0254;
                case 1: goto L_0x023a;
                case 2: goto L_0x021b;
                case 3: goto L_0x021b;
                case 4: goto L_0x020a;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01e0;
                case 7: goto L_0x01c7;
                case 8: goto L_0x01a9;
                case 9: goto L_0x0182;
                case 10: goto L_0x0158;
                case 11: goto L_0x020a;
                case 12: goto L_0x0120;
                case 13: goto L_0x01e0;
                case 14: goto L_0x01f0;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00d2;
                default: goto L_0x009f;
            }
        L_0x009f:
            r6 = r2
            r11 = r17
            r0 = 3
            r2 = 1
            if (r8 != r0) goto L_0x0278
            java.lang.Object r8 = r15.zzF(r14, r6)
            int r0 = r11 << 3
            r5 = r0 | 4
            com.google.android.recaptcha.internal.zzil r1 = r15.zzC(r6)
            r0 = r8
            r2 = r35
            r4 = r37
            r12 = r6
            r36 = r23
            r6 = r39
            int r0 = com.google.android.recaptcha.internal.zzen.zzn(r0, r1, r2, r3, r4, r5, r6)
            r15.zzO(r14, r12, r8)
            r5 = r13 | r7
            r3 = r36
            r13 = r37
            r1 = r11
            r2 = r12
            r6 = r26
            r8 = -1
            r12 = r35
            goto L_0x0274
        L_0x00d2:
            if (r8 != 0) goto L_0x00f8
            int r6 = com.google.android.recaptcha.internal.zzen.zzm(r12, r3, r9)
            long r0 = r9.zzb
            long r4 = com.google.android.recaptcha.internal.zzff.zzG(r0)
            r11 = r17
            r0 = r10
            r1 = r34
            r8 = r2
            r2 = r24
            r36 = r6
            r6 = r23
            r0.putLong(r1, r2, r4)
            r5 = r13 | r7
            r0 = r36
            r13 = r37
            r3 = r6
            r2 = r8
            r1 = r11
            goto L_0x0271
        L_0x00f8:
            r11 = r17
            r12 = r2
            goto L_0x0250
        L_0x00fd:
            r5 = r2
            r11 = r17
            r6 = r23
            if (r8 != 0) goto L_0x017d
            int r0 = com.google.android.recaptcha.internal.zzen.zzj(r12, r3, r9)
            int r1 = r9.zza
            int r1 = com.google.android.recaptcha.internal.zzff.zzF(r1)
            r2 = r24
            r10.putInt(r14, r2, r1)
            r1 = r13 | r7
            r13 = r37
            r2 = r5
            r3 = r6
            r6 = r26
            r8 = -1
            r5 = r1
            r1 = r11
            goto L_0x0274
        L_0x0120:
            r5 = r2
            r11 = r17
            r6 = r23
            r0 = r24
            if (r8 != 0) goto L_0x017d
            int r2 = com.google.android.recaptcha.internal.zzen.zzj(r12, r3, r9)
            int r3 = r9.zza
            com.google.android.recaptcha.internal.zzgs r4 = r15.zzB(r5)
            if (r4 == 0) goto L_0x0154
            boolean r4 = r4.zza()
            if (r4 == 0) goto L_0x013c
            goto L_0x0154
        L_0x013c:
            com.google.android.recaptcha.internal.zzjg r0 = zzd(r34)
            long r3 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.zzj(r6, r1)
            r0 = r2
            r2 = r5
            r3 = r6
            r1 = r11
            r5 = r13
            r6 = r26
            r8 = -1
            r13 = r37
            goto L_0x0274
        L_0x0154:
            r10.putInt(r14, r0, r3)
            goto L_0x016a
        L_0x0158:
            r5 = r2
            r11 = r17
            r6 = r23
            r0 = r24
            if (r8 != r4) goto L_0x017d
            int r2 = com.google.android.recaptcha.internal.zzen.zza(r12, r3, r9)
            java.lang.Object r3 = r9.zzc
            r10.putObject(r14, r0, r3)
        L_0x016a:
            r0 = r13 | r7
            r13 = r37
            r3 = r6
            r1 = r11
            r6 = r26
            r8 = -1
            r11 = r38
            r32 = r5
            r5 = r0
            r0 = r2
            r2 = r32
            goto L_0x001d
        L_0x017d:
            r12 = r5
            r36 = r6
            goto L_0x0252
        L_0x0182:
            r5 = r2
            r11 = r17
            r6 = r23
            if (r8 != r4) goto L_0x01a4
            java.lang.Object r8 = r15.zzF(r14, r5)
            com.google.android.recaptcha.internal.zzil r1 = r15.zzC(r5)
            r0 = r8
            r2 = r35
            r4 = r37
            r23 = r6
            r6 = r5
            r5 = r39
            int r0 = com.google.android.recaptcha.internal.zzen.zzo(r0, r1, r2, r3, r4, r5)
            r15.zzO(r14, r6, r8)
            goto L_0x0269
        L_0x01a4:
            r23 = r6
            r12 = r5
            goto L_0x0250
        L_0x01a9:
            r6 = r2
            r11 = r17
            r27 = r24
            if (r8 != r4) goto L_0x024f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01ba
            int r0 = com.google.android.recaptcha.internal.zzen.zzg(r12, r3, r9)
            goto L_0x01be
        L_0x01ba:
            int r0 = com.google.android.recaptcha.internal.zzen.zzh(r12, r3, r9)
        L_0x01be:
            java.lang.Object r1 = r9.zzc
            r4 = r27
            r10.putObject(r14, r4, r1)
            goto L_0x0269
        L_0x01c7:
            r6 = r2
            r11 = r17
            r4 = r24
            if (r8 != 0) goto L_0x024f
            int r0 = com.google.android.recaptcha.internal.zzen.zzm(r12, r3, r9)
            long r1 = r9.zzb
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x01da
            r1 = 1
            goto L_0x01db
        L_0x01da:
            r1 = 0
        L_0x01db:
            com.google.android.recaptcha.internal.zzjp.zzm(r14, r4, r1)
            goto L_0x0269
        L_0x01e0:
            r6 = r2
            r11 = r17
            r4 = r24
            if (r8 != r0) goto L_0x024f
            int r0 = com.google.android.recaptcha.internal.zzen.zzb(r12, r3)
            r10.putInt(r14, r4, r0)
            goto L_0x024c
        L_0x01f0:
            r6 = r2
            r11 = r17
            r4 = r24
            r0 = 1
            if (r8 != r0) goto L_0x024f
            long r17 = com.google.android.recaptcha.internal.zzen.zzq(r12, r3)
            r0 = r10
            r1 = r34
            r8 = r3
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0269
        L_0x020a:
            r6 = r2
            r11 = r17
            r4 = r24
            if (r8 != 0) goto L_0x024f
            int r0 = com.google.android.recaptcha.internal.zzen.zzj(r12, r3, r9)
            int r1 = r9.zza
            r10.putInt(r14, r4, r1)
            goto L_0x0269
        L_0x021b:
            r6 = r2
            r11 = r17
            r4 = r24
            if (r8 != 0) goto L_0x024f
            int r8 = com.google.android.recaptcha.internal.zzen.zzm(r12, r3, r9)
            long r2 = r9.zzb
            r0 = r10
            r1 = r34
            r17 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r13 | r7
            r13 = r37
            r2 = r6
            r0 = r8
            goto L_0x026e
        L_0x023a:
            r6 = r2
            r11 = r17
            r4 = r24
            if (r8 != r0) goto L_0x024f
            int r0 = com.google.android.recaptcha.internal.zzen.zzb(r12, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.recaptcha.internal.zzjp.zzp(r14, r4, r0)
        L_0x024c:
            int r0 = r3 + 4
            goto L_0x0269
        L_0x024f:
            r12 = r6
        L_0x0250:
            r36 = r23
        L_0x0252:
            r2 = 1
            goto L_0x027b
        L_0x0254:
            r6 = r2
            r11 = r17
            r4 = r24
            r2 = 1
            if (r8 != r2) goto L_0x0278
            long r0 = com.google.android.recaptcha.internal.zzen.zzq(r12, r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.recaptcha.internal.zzjp.zzo(r14, r4, r0)
            int r0 = r3 + 8
        L_0x0269:
            r5 = r13 | r7
            r13 = r37
            r2 = r6
        L_0x026e:
            r1 = r11
            r3 = r23
        L_0x0271:
            r6 = r26
            r8 = -1
        L_0x0274:
            r11 = r38
            goto L_0x001d
        L_0x0278:
            r12 = r6
            r36 = r23
        L_0x027b:
            r8 = r36
            r7 = r38
            r2 = r3
            r31 = r10
            r21 = r11
            r25 = r12
            r17 = r13
            r6 = r26
            r20 = -1
            r24 = 1
            goto L_0x0397
        L_0x0290:
            r12 = r2
            r29 = r13
            r13 = r17
            r36 = r23
            r2 = 1
            r14 = r34
            r0 = 27
            if (r11 != r0) goto L_0x02f7
            if (r8 != r4) goto L_0x02e6
            r0 = r29
            java.lang.Object r2 = r10.getObject(r14, r0)
            com.google.android.recaptcha.internal.zzgv r2 = (com.google.android.recaptcha.internal.zzgv) r2
            boolean r4 = r2.zzc()
            if (r4 != 0) goto L_0x02bf
            int r4 = r2.size()
            if (r4 != 0) goto L_0x02b7
            r4 = 10
            goto L_0x02b8
        L_0x02b7:
            int r4 = r4 + r4
        L_0x02b8:
            com.google.android.recaptcha.internal.zzgv r2 = r2.zzd(r4)
            r10.putObject(r14, r0, r2)
        L_0x02bf:
            r7 = r2
            com.google.android.recaptcha.internal.zzil r0 = r15.zzC(r12)
            r1 = r36
            r2 = r35
            r4 = r37
            r17 = r5
            r5 = r7
            r26 = r6
            r6 = r39
            int r0 = com.google.android.recaptcha.internal.zzen.zze(r0, r1, r2, r3, r4, r5, r6)
            r3 = r36
            r11 = r38
            r2 = r12
            r1 = r13
            r5 = r17
            r6 = r26
            r8 = -1
            r12 = r35
            r13 = r37
            goto L_0x001d
        L_0x02e6:
            r17 = r5
            r26 = r6
            r15 = r3
            r31 = r10
            r25 = r12
            r21 = r13
            r20 = -1
            r24 = 1
            goto L_0x0371
        L_0x02f7:
            r17 = r5
            r26 = r6
            r22 = r29
            r0 = 49
            if (r11 > r0) goto L_0x034a
            long r6 = (long) r1
            r0 = r33
            r24 = 1
            r1 = r34
            r2 = r35
            r5 = r3
            r4 = r37
            r15 = r5
            r5 = r36
            r27 = r6
            r6 = r13
            r7 = r8
            r20 = -1
            r8 = r12
            r31 = r10
            r9 = r27
            r25 = r12
            r21 = r13
            r12 = r22
            r14 = r39
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0344
        L_0x0329:
            r15 = r33
            r14 = r34
            r12 = r35
            r3 = r36
            r13 = r37
            r11 = r38
            r9 = r39
            r5 = r17
            r1 = r21
            r2 = r25
            r6 = r26
            r10 = r31
            r8 = -1
            goto L_0x001d
        L_0x0344:
            r8 = r36
            r7 = r38
            r2 = r0
            goto L_0x0376
        L_0x034a:
            r15 = r3
            r31 = r10
            r25 = r12
            r21 = r13
            r20 = -1
            r24 = 1
            r0 = 50
            if (r11 != r0) goto L_0x0379
            if (r8 != r4) goto L_0x0371
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r15
            r4 = r37
            r5 = r25
            r6 = r22
            r8 = r39
            int r0 = r0.zzr(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0344
            goto L_0x0329
        L_0x0371:
            r8 = r36
            r7 = r38
            r2 = r15
        L_0x0376:
            r6 = r26
            goto L_0x0397
        L_0x0379:
            r0 = r33
            r9 = r1
            r1 = r34
            r2 = r35
            r3 = r15
            r4 = r37
            r5 = r36
            r6 = r21
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r22
            r12 = r25
            r13 = r39
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0344
            goto L_0x0329
        L_0x0397:
            if (r8 != r7) goto L_0x03a8
            if (r7 == 0) goto L_0x03a8
            r9 = r33
            r12 = r34
            r0 = r6
            r5 = r17
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            goto L_0x04e8
        L_0x03a8:
            r9 = r33
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x04af
            r10 = r39
            com.google.android.recaptcha.internal.zzfz r0 = r10.zzd
            com.google.android.recaptcha.internal.zzfz r1 = com.google.android.recaptcha.internal.zzfz.zza
            if (r0 == r1) goto L_0x04aa
            com.google.android.recaptcha.internal.zzhy r1 = r9.zzg
            r11 = r21
            com.google.android.recaptcha.internal.zzgm r0 = r0.zza(r1, r11)
            if (r0 != 0) goto L_0x03d5
            com.google.android.recaptcha.internal.zzjg r4 = zzd(r34)
            r0 = r8
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.recaptcha.internal.zzen.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r34
            r13 = r35
            goto L_0x04c6
        L_0x03d5:
            r12 = r34
            r1 = r12
            com.google.android.recaptcha.internal.zzgk r1 = (com.google.android.recaptcha.internal.zzgk) r1
            r1.zzi()
            com.google.android.recaptcha.internal.zzge r1 = r1.zzb
            com.google.android.recaptcha.internal.zzgl r3 = r0.zzb
            com.google.android.recaptcha.internal.zzjv r3 = r3.zzb
            com.google.android.recaptcha.internal.zzjv r4 = com.google.android.recaptcha.internal.zzjv.ENUM
            r5 = 0
            if (r3 == r4) goto L_0x04a4
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L_0x048d;
                case 1: goto L_0x047c;
                case 2: goto L_0x046f;
                case 3: goto L_0x046f;
                case 4: goto L_0x0462;
                case 5: goto L_0x0457;
                case 6: goto L_0x044c;
                case 7: goto L_0x0438;
                case 8: goto L_0x042f;
                case 9: goto L_0x042c;
                case 10: goto L_0x0429;
                case 11: goto L_0x041f;
                case 12: goto L_0x0462;
                case 13: goto L_0x0417;
                case 14: goto L_0x044c;
                case 15: goto L_0x0457;
                case 16: goto L_0x0405;
                case 17: goto L_0x03f3;
                default: goto L_0x03ef;
            }
        L_0x03ef:
            r13 = r35
            goto L_0x049d
        L_0x03f3:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zzm(r13, r2, r10)
            long r3 = r10.zzb
            long r3 = com.google.android.recaptcha.internal.zzff.zzG(r3)
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            goto L_0x049d
        L_0x0405:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zzj(r13, r2, r10)
            int r3 = r10.zza
            int r3 = com.google.android.recaptcha.internal.zzff.zzF(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x049d
        L_0x0417:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x041f:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zza(r13, r2, r10)
            java.lang.Object r5 = r10.zzc
            goto L_0x049d
        L_0x0429:
            int r0 = com.google.android.recaptcha.internal.zzih.zza
            throw r5
        L_0x042c:
            int r0 = com.google.android.recaptcha.internal.zzih.zza
            throw r5
        L_0x042f:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zzg(r13, r2, r10)
            java.lang.Object r5 = r10.zzc
            goto L_0x049d
        L_0x0438:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zzm(r13, r2, r10)
            long r3 = r10.zzb
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x0445
            goto L_0x0447
        L_0x0445:
            r24 = 0
        L_0x0447:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r24)
            goto L_0x049d
        L_0x044c:
            r13 = r35
            int r3 = com.google.android.recaptcha.internal.zzen.zzb(r13, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x048a
        L_0x0457:
            r13 = r35
            long r3 = com.google.android.recaptcha.internal.zzen.zzq(r13, r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            goto L_0x049b
        L_0x0462:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zzj(r13, r2, r10)
            int r3 = r10.zza
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x049d
        L_0x046f:
            r13 = r35
            int r2 = com.google.android.recaptcha.internal.zzen.zzm(r13, r2, r10)
            long r3 = r10.zzb
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            goto L_0x049d
        L_0x047c:
            r13 = r35
            int r3 = com.google.android.recaptcha.internal.zzen.zzb(r13, r2)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
        L_0x048a:
            int r2 = r2 + 4
            goto L_0x049d
        L_0x048d:
            r13 = r35
            long r3 = com.google.android.recaptcha.internal.zzen.zzq(r13, r2)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.Double r5 = java.lang.Double.valueOf(r3)
        L_0x049b:
            int r2 = r2 + 8
        L_0x049d:
            com.google.android.recaptcha.internal.zzgl r0 = r0.zzb
            r1.zzi(r0, r5)
            r0 = r2
            goto L_0x04c6
        L_0x04a4:
            r13 = r35
            com.google.android.recaptcha.internal.zzen.zzj(r13, r2, r10)
            throw r5
        L_0x04aa:
            r12 = r34
            r13 = r35
            goto L_0x04b5
        L_0x04af:
            r12 = r34
            r13 = r35
            r10 = r39
        L_0x04b5:
            r11 = r21
            com.google.android.recaptcha.internal.zzjg r4 = zzd(r34)
            r0 = r8
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.recaptcha.internal.zzen.zzi(r0, r1, r2, r3, r4, r5)
        L_0x04c6:
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r12 = r13
            r5 = r17
            r2 = r25
            r10 = r31
            r8 = -1
            r13 = r37
            r11 = r7
            goto L_0x001d
        L_0x04d8:
            r17 = r5
            r26 = r6
            r31 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r6 = r0
            r8 = r3
            r0 = r26
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x04e8:
            if (r0 == r1) goto L_0x04f0
            long r0 = (long) r0
            r2 = r31
            r2.putInt(r12, r0, r5)
        L_0x04f0:
            int r0 = r9.zzl
            r10 = r0
        L_0x04f3:
            int r0 = r9.zzm
            if (r10 >= r0) goto L_0x050a
            int[] r0 = r9.zzk
            r2 = r0[r10]
            r3 = 0
            com.google.android.recaptcha.internal.zzjf r4 = r9.zzo
            r0 = r33
            r1 = r34
            r5 = r34
            r0.zzD(r1, r2, r3, r4, r5)
            int r10 = r10 + 1
            goto L_0x04f3
        L_0x050a:
            if (r7 != 0) goto L_0x0516
            r0 = r37
            if (r6 != r0) goto L_0x0511
            goto L_0x051c
        L_0x0511:
            com.google.android.recaptcha.internal.zzgy r0 = com.google.android.recaptcha.internal.zzgy.zzg()
            throw r0
        L_0x0516:
            r0 = r37
            if (r6 > r0) goto L_0x051d
            if (r8 != r7) goto L_0x051d
        L_0x051c:
            return r6
        L_0x051d:
            com.google.android.recaptcha.internal.zzgy r0 = com.google.android.recaptcha.internal.zzgy.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzem):int");
    }

    public final Object zze() {
        return ((zzgo) this.zzg).zzs();
    }

    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzgo) {
                zzgo zzgo = (zzgo) obj;
                zzgo.zzD(a.e.API_PRIORITY_OTHER);
                zzgo.zza = 0;
                zzgo.zzB();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzz = zzz(i10);
                int i11 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j10 = (long) i11;
                if (zzy != 9) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzX(obj, this.zzc[i10], i10)) {
                            zzC(i10).zzf(zzb.getObject(obj, j10));
                        }
                    } else {
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
                                    ((zzhs) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (zzT(obj, i10)) {
                    zzC(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zzf(obj);
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
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzo(obj, j10, zzjp.zza(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzp(obj, j10, zzjp.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzm(obj, j10, zzjp.zzw(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzT(obj2, i10)) {
                        break;
                    } else {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
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
                    int i12 = zzin.zza;
                    zzjp.zzs(obj, j10, zzht.zzc(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10)));
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
                    if (!zzX(obj2, i11, i10)) {
                        break;
                    } else {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
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
                    if (!zzX(obj2, i11, i10)) {
                        break;
                    } else {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i10);
                    break;
            }
        }
        zzin.zzE(this.zzo, obj, obj2);
        if (this.zzh) {
            zzin.zzD(this.zzp, obj, obj2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:168|169|(1:171)|172|(5:193|174|(2:177|175)|203|(2:179|205)(1:209))) */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x05e6, code lost:
        r15 = r9;
        r5 = r11;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05e9, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0611, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r10.zzs(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0619, code lost:
        if (r13 == null) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x061b, code lost:
        r13 = r10.zzc(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0624, code lost:
        if (r10.zzr(r13, r0) == false) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0626, code lost:
        r0 = r7.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x062a, code lost:
        if (r0 < r7.zzm) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x062c, code lost:
        zzD(r18, r7.zzk[r0], r13, r10, r18);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x063e, code lost:
        if (r13 != null) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0640, code lost:
        r10.zzn(r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0651, code lost:
        zzD(r18, r7.zzk[r8], r13, r10, r18);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0665, code lost:
        r10.zzn(r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
        r13 = r4;
        r11 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x0616 */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0651 A[LOOP:5: B:185:0x064d->B:187:0x0651, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0665  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzik r19, com.google.android.recaptcha.internal.zzfz r20) throws java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r15 = r18
            r0 = r19
            r6 = r20
            java.util.Objects.requireNonNull(r20)
            zzI(r18)
            com.google.android.recaptcha.internal.zzjf r14 = r7.zzo
            com.google.android.recaptcha.internal.zzga r5 = r7.zzp
            r16 = 0
            r8 = r16
            r13 = r8
        L_0x0017:
            int r2 = r19.zzc()     // Catch:{ all -> 0x0647 }
            int r1 = r7.zzu(r2)     // Catch:{ all -> 0x0647 }
            if (r1 >= 0) goto L_0x00b9
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
            r4 = r13
            r5 = r14
            r6 = r18
            r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0028
        L_0x003e:
            if (r13 == 0) goto L_0x0643
            r14.zzn(r15, r13)
            return
        L_0x0044:
            boolean r1 = r7.zzh     // Catch:{ all -> 0x0647 }
            if (r1 != 0) goto L_0x004b
            r11 = r16
            goto L_0x0052
        L_0x004b:
            com.google.android.recaptcha.internal.zzhy r1 = r7.zzg     // Catch:{ all -> 0x0647 }
            java.lang.Object r1 = r5.zzd(r6, r1, r2)     // Catch:{ all -> 0x0647 }
            r11 = r1
        L_0x0052:
            if (r11 == 0) goto L_0x0071
            if (r8 != 0) goto L_0x005b
            com.google.android.recaptcha.internal.zzge r1 = r5.zzc(r15)     // Catch:{ all -> 0x0647 }
            goto L_0x005c
        L_0x005b:
            r1 = r8
        L_0x005c:
            r8 = r5
            r9 = r18
            r10 = r19
            r12 = r20
            r4 = r13
            r13 = r1
            r3 = r14
            r14 = r4
            r2 = r15
            r15 = r3
            r8.zze(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b4 }
            r8 = r1
            r15 = r2
            r14 = r3
            r13 = r4
            goto L_0x0017
        L_0x0071:
            r4 = r13
            r3 = r14
            r2 = r15
            r3.zzs(r0)     // Catch:{ all -> 0x00b4 }
            if (r4 != 0) goto L_0x007f
            java.lang.Object r1 = r3.zzc(r2)     // Catch:{ all -> 0x00b4 }
            r13 = r1
            goto L_0x0080
        L_0x007f:
            r13 = r4
        L_0x0080:
            boolean r1 = r3.zzr(r13, r0)     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x00ab
            int r0 = r7.zzl
        L_0x0088:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x00a3
            int[] r1 = r7.zzk
            r4 = r1[r0]
            r1 = r17
            r9 = r2
            r2 = r18
            r10 = r3
            r3 = r4
            r4 = r13
            r5 = r10
            r6 = r18
            r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r2 = r9
            r3 = r10
            goto L_0x0088
        L_0x00a3:
            r9 = r2
            r10 = r3
            if (r13 == 0) goto L_0x0643
            r10.zzn(r9, r13)
            return
        L_0x00ab:
            r15 = r2
            r14 = r3
            goto L_0x0017
        L_0x00af:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x064a
        L_0x00b4:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x0645
        L_0x00b9:
            r4 = r13
            r10 = r14
            r9 = r15
            int r3 = r7.zzz(r1)     // Catch:{ all -> 0x0644 }
            int r11 = zzy(r3)     // Catch:{ zzgx -> 0x0613 }
            r12 = 1048575(0xfffff, float:1.469367E-39)
            switch(r11) {
                case 0: goto L_0x05d6;
                case 1: goto L_0x05c5;
                case 2: goto L_0x05b4;
                case 3: goto L_0x05a3;
                case 4: goto L_0x0592;
                case 5: goto L_0x0581;
                case 6: goto L_0x056f;
                case 7: goto L_0x055d;
                case 8: goto L_0x0552;
                case 9: goto L_0x053d;
                case 10: goto L_0x052b;
                case 11: goto L_0x0519;
                case 12: goto L_0x04f4;
                case 13: goto L_0x04e2;
                case 14: goto L_0x04d0;
                case 15: goto L_0x04be;
                case 16: goto L_0x04ac;
                case 17: goto L_0x0497;
                case 18: goto L_0x0486;
                case 19: goto L_0x0475;
                case 20: goto L_0x0464;
                case 21: goto L_0x0453;
                case 22: goto L_0x0442;
                case 23: goto L_0x0431;
                case 24: goto L_0x0420;
                case 25: goto L_0x040f;
                case 26: goto L_0x03e2;
                case 27: goto L_0x03cd;
                case 28: goto L_0x03bc;
                case 29: goto L_0x03ab;
                case 30: goto L_0x038f;
                case 31: goto L_0x037e;
                case 32: goto L_0x036d;
                case 33: goto L_0x035c;
                case 34: goto L_0x034b;
                case 35: goto L_0x033a;
                case 36: goto L_0x0329;
                case 37: goto L_0x0318;
                case 38: goto L_0x0307;
                case 39: goto L_0x02f6;
                case 40: goto L_0x02e5;
                case 41: goto L_0x02d4;
                case 42: goto L_0x02c3;
                case 43: goto L_0x02b2;
                case 44: goto L_0x0295;
                case 45: goto L_0x0287;
                case 46: goto L_0x0279;
                case 47: goto L_0x026b;
                case 48: goto L_0x025d;
                case 49: goto L_0x024b;
                case 50: goto L_0x0215;
                case 51: goto L_0x0203;
                case 52: goto L_0x01f2;
                case 53: goto L_0x01e1;
                case 54: goto L_0x01d0;
                case 55: goto L_0x01bf;
                case 56: goto L_0x01ae;
                case 57: goto L_0x019d;
                case 58: goto L_0x018c;
                case 59: goto L_0x0181;
                case 60: goto L_0x0170;
                case 61: goto L_0x0163;
                case 62: goto L_0x0152;
                case 63: goto L_0x012d;
                case 64: goto L_0x011c;
                case 65: goto L_0x010b;
                case 66: goto L_0x00f9;
                case 67: goto L_0x00e7;
                case 68: goto L_0x00d5;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            r13 = r4
            r11 = r5
            r14 = r6
            if (r13 != 0) goto L_0x05ed
            java.lang.Object r1 = r10.zzc(r9)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05ec
        L_0x00d5:
            java.lang.Object r3 = r7.zzG(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzhy r3 = (com.google.android.recaptcha.internal.zzhy) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzil r11 = r7.zzC(r1)     // Catch:{ zzgx -> 0x0613 }
            r0.zzt(r3, r11, r6)     // Catch:{ zzgx -> 0x0613 }
            r7.zzP(r9, r2, r1, r3)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x00e7:
            r3 = r3 & r12
            long r11 = r19.zzn()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x00f9:
            r3 = r3 & r12
            int r11 = r19.zzi()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x010b:
            r3 = r3 & r12
            long r11 = r19.zzm()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x011c:
            r3 = r3 & r12
            int r11 = r19.zzh()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x012d:
            int r11 = r19.zze()     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzgs r13 = r7.zzB(r1)     // Catch:{ zzgx -> 0x0613 }
            if (r13 == 0) goto L_0x0145
            boolean r13 = r13.zza()     // Catch:{ zzgx -> 0x0613 }
            if (r13 == 0) goto L_0x013e
            goto L_0x0145
        L_0x013e:
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzin.zzC(r9, r2, r11, r4, r10)     // Catch:{ zzgx -> 0x0613 }
            r15 = r9
            goto L_0x05e9
        L_0x0145:
            r3 = r3 & r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0152:
            r3 = r3 & r12
            int r11 = r19.zzj()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0163:
            r3 = r3 & r12
            com.google.android.recaptcha.internal.zzez r11 = r19.zzp()     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0170:
            java.lang.Object r3 = r7.zzG(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzhy r3 = (com.google.android.recaptcha.internal.zzhy) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzil r11 = r7.zzC(r1)     // Catch:{ zzgx -> 0x0613 }
            r0.zzu(r3, r11, r6)     // Catch:{ zzgx -> 0x0613 }
            r7.zzP(r9, r2, r1, r3)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0181:
            r7.zzL(r9, r3, r0)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
        L_0x0187:
            r13 = r4
            r11 = r5
            r14 = r6
            goto L_0x05e6
        L_0x018c:
            r3 = r3 & r12
            boolean r11 = r19.zzN()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x019d:
            r3 = r3 & r12
            int r11 = r19.zzf()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x01ae:
            r3 = r3 & r12
            long r11 = r19.zzk()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x01bf:
            r3 = r3 & r12
            int r11 = r19.zzg()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x01d0:
            r3 = r3 & r12
            long r11 = r19.zzo()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x01e1:
            r3 = r3 & r12
            long r11 = r19.zzl()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x01f2:
            r3 = r3 & r12
            float r11 = r19.zzb()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0203:
            r3 = r3 & r12
            double r11 = r19.zza()     // Catch:{ zzgx -> 0x0613 }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ zzgx -> 0x0613 }
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r12, r11)     // Catch:{ zzgx -> 0x0613 }
            r7.zzN(r9, r2, r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0215:
            java.lang.Object r2 = r7.zzE(r1)     // Catch:{ zzgx -> 0x0613 }
            int r1 = r7.zzz(r1)     // Catch:{ zzgx -> 0x0613 }
            r1 = r1 & r12
            long r11 = (long) r1     // Catch:{ zzgx -> 0x0613 }
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzjp.zzf(r9, r11)     // Catch:{ zzgx -> 0x0613 }
            if (r1 == 0) goto L_0x023b
            boolean r3 = com.google.android.recaptcha.internal.zzht.zzb(r1)     // Catch:{ zzgx -> 0x0613 }
            if (r3 == 0) goto L_0x0246
            com.google.android.recaptcha.internal.zzhs r3 = com.google.android.recaptcha.internal.zzhs.zza()     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzhs r3 = r3.zzb()     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzht.zzc(r3, r1)     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r11, r3)     // Catch:{ zzgx -> 0x0613 }
            r1 = r3
            goto L_0x0246
        L_0x023b:
            com.google.android.recaptcha.internal.zzhs r1 = com.google.android.recaptcha.internal.zzhs.zza()     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzhs r1 = r1.zzb()     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r11, r1)     // Catch:{ zzgx -> 0x0613 }
        L_0x0246:
            com.google.android.recaptcha.internal.zzhs r1 = (com.google.android.recaptcha.internal.zzhs) r1     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzhr r2 = (com.google.android.recaptcha.internal.zzhr) r2     // Catch:{ zzgx -> 0x0613 }
            throw r16     // Catch:{ zzgx -> 0x0613 }
        L_0x024b:
            r2 = r3 & r12
            com.google.android.recaptcha.internal.zzil r1 = r7.zzC(r1)     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzhm r3 = r7.zzn     // Catch:{ zzgx -> 0x0613 }
            long r11 = (long) r2     // Catch:{ zzgx -> 0x0613 }
            java.util.List r2 = r3.zza(r9, r11)     // Catch:{ zzgx -> 0x0613 }
            r0.zzC(r2, r1, r6)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x025d:
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0613 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0613 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0613 }
            r0.zzJ(r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x026b:
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0613 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0613 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0613 }
            r0.zzI(r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0279:
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0613 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0613 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0613 }
            r0.zzH(r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0287:
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0613 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0613 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0613 }
            r0.zzG(r1)     // Catch:{ zzgx -> 0x0613 }
            goto L_0x0187
        L_0x0295:
            com.google.android.recaptcha.internal.zzhm r11 = r7.zzn     // Catch:{ zzgx -> 0x0613 }
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ zzgx -> 0x0613 }
            java.util.List r3 = r11.zza(r9, r12)     // Catch:{ zzgx -> 0x0613 }
            r0.zzy(r3)     // Catch:{ zzgx -> 0x0613 }
            com.google.android.recaptcha.internal.zzgs r11 = r7.zzB(r1)     // Catch:{ zzgx -> 0x0613 }
            r1 = r18
            r13 = r4
            r4 = r11
            r11 = r5
            r5 = r13
            r14 = r6
            r6 = r10
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzin.zzB(r1, r2, r3, r4, r5, r6)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x02b2:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzL(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x02c3:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzv(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x02d4:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzz(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x02e5:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzA(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x02f6:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzD(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0307:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzM(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0318:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzE(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0329:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzB(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x033a:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzx(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x034b:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzJ(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x035c:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzI(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x036d:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzH(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x037e:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzG(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x038f:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r4 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r3 = r3 & r12
            long r5 = (long) r3     // Catch:{ zzgx -> 0x0616 }
            java.util.List r3 = r4.zza(r9, r5)     // Catch:{ zzgx -> 0x0616 }
            r0.zzy(r3)     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzgs r4 = r7.zzB(r1)     // Catch:{ zzgx -> 0x0616 }
            r1 = r18
            r5 = r13
            r6 = r10
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzin.zzB(r1, r2, r3, r4, r5, r6)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x03ab:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzL(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x03bc:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzw(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x03cd:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzil r1 = r7.zzC(r1)     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            com.google.android.recaptcha.internal.zzhm r3 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r2 = r3.zza(r9, r4)     // Catch:{ zzgx -> 0x0616 }
            r0.zzF(r2, r1, r14)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x03e2:
            r13 = r4
            r11 = r5
            r14 = r6
            boolean r1 = zzS(r3)     // Catch:{ zzgx -> 0x0616 }
            if (r1 == 0) goto L_0x03fd
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r2 = r0
            com.google.android.recaptcha.internal.zzfg r2 = (com.google.android.recaptcha.internal.zzfg) r2     // Catch:{ zzgx -> 0x0616 }
            r3 = 1
            r2.zzK(r1, r3)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x03fd:
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r2 = r0
            com.google.android.recaptcha.internal.zzfg r2 = (com.google.android.recaptcha.internal.zzfg) r2     // Catch:{ zzgx -> 0x0616 }
            r3 = 0
            r2.zzK(r1, r3)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x040f:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzv(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0420:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzz(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0431:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzA(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0442:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzD(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0453:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzM(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0464:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzE(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0475:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzB(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0486:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.recaptcha.internal.zzhm r1 = r7.zzn     // Catch:{ zzgx -> 0x0616 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            java.util.List r1 = r1.zza(r9, r2)     // Catch:{ zzgx -> 0x0616 }
            r0.zzx(r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0497:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.zzF(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzhy r2 = (com.google.android.recaptcha.internal.zzhy) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzil r3 = r7.zzC(r1)     // Catch:{ zzgx -> 0x0616 }
            r0.zzt(r2, r3, r14)     // Catch:{ zzgx -> 0x0616 }
            r7.zzO(r9, r1, r2)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x04ac:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzn()     // Catch:{ zzgx -> 0x0616 }
            long r5 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzr(r9, r5, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x04be:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzi()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzq(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x04d0:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzm()     // Catch:{ zzgx -> 0x0616 }
            long r5 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzr(r9, r5, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x04e2:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzh()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzq(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x04f4:
            r13 = r4
            r11 = r5
            r14 = r6
            int r4 = r19.zze()     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzgs r5 = r7.zzB(r1)     // Catch:{ zzgx -> 0x0616 }
            if (r5 == 0) goto L_0x050e
            boolean r5 = r5.zza()     // Catch:{ zzgx -> 0x0616 }
            if (r5 == 0) goto L_0x0508
            goto L_0x050e
        L_0x0508:
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzin.zzC(r9, r2, r4, r13, r10)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x050e:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzq(r9, r2, r4)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0519:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzj()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzq(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x052b:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            com.google.android.recaptcha.internal.zzez r3 = r19.zzp()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzs(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x053d:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.zzF(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzhy r2 = (com.google.android.recaptcha.internal.zzhy) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzil r3 = r7.zzC(r1)     // Catch:{ zzgx -> 0x0616 }
            r0.zzu(r2, r3, r14)     // Catch:{ zzgx -> 0x0616 }
            r7.zzO(r9, r1, r2)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0552:
            r13 = r4
            r11 = r5
            r14 = r6
            r7.zzL(r9, r3, r0)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x055d:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            boolean r3 = r19.zzN()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzm(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x056f:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzf()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzq(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0581:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzk()     // Catch:{ zzgx -> 0x0616 }
            long r5 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzr(r9, r5, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x0592:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            int r3 = r19.zzg()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzq(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x05a3:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzo()     // Catch:{ zzgx -> 0x0616 }
            long r5 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzr(r9, r5, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x05b4:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r3 = r19.zzl()     // Catch:{ zzgx -> 0x0616 }
            long r5 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzr(r9, r5, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x05c5:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            float r3 = r19.zzb()     // Catch:{ zzgx -> 0x0616 }
            long r4 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzp(r9, r4, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
            goto L_0x05e6
        L_0x05d6:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            double r3 = r19.zza()     // Catch:{ zzgx -> 0x0616 }
            long r5 = (long) r2     // Catch:{ zzgx -> 0x0616 }
            com.google.android.recaptcha.internal.zzjp.zzo(r9, r5, r3)     // Catch:{ zzgx -> 0x0616 }
            r7.zzM(r9, r1)     // Catch:{ zzgx -> 0x0616 }
        L_0x05e6:
            r15 = r9
            r5 = r11
            r6 = r14
        L_0x05e9:
            r14 = r10
            goto L_0x0017
        L_0x05ec:
            r13 = r1
        L_0x05ed:
            boolean r1 = r10.zzr(r13, r0)     // Catch:{ zzgx -> 0x0616 }
            if (r1 != 0) goto L_0x05e6
            int r0 = r7.zzl
        L_0x05f5:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x060b
            int[] r1 = r7.zzk
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r4 = r13
            r5 = r10
            r6 = r18
            r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x05f5
        L_0x060b:
            if (r13 == 0) goto L_0x0643
            r10.zzn(r9, r13)
            return
        L_0x0611:
            r0 = move-exception
            goto L_0x064a
        L_0x0613:
            r13 = r4
            r11 = r5
            r14 = r6
        L_0x0616:
            r10.zzs(r0)     // Catch:{ all -> 0x0611 }
            if (r13 != 0) goto L_0x0620
            java.lang.Object r1 = r10.zzc(r9)     // Catch:{ all -> 0x0611 }
            r13 = r1
        L_0x0620:
            boolean r1 = r10.zzr(r13, r0)     // Catch:{ all -> 0x0611 }
            if (r1 != 0) goto L_0x05e6
            int r0 = r7.zzl
        L_0x0628:
            int r1 = r7.zzm
            if (r0 >= r1) goto L_0x063e
            int[] r1 = r7.zzk
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r4 = r13
            r5 = r10
            r6 = r18
            r1.zzD(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0628
        L_0x063e:
            if (r13 == 0) goto L_0x0643
            r10.zzn(r9, r13)
        L_0x0643:
            return
        L_0x0644:
            r0 = move-exception
        L_0x0645:
            r13 = r4
            goto L_0x064a
        L_0x0647:
            r0 = move-exception
            r10 = r14
            r9 = r15
        L_0x064a:
            int r1 = r7.zzl
            r8 = r1
        L_0x064d:
            int r1 = r7.zzm
            if (r8 >= r1) goto L_0x0663
            int[] r1 = r7.zzk
            r3 = r1[r8]
            r1 = r17
            r2 = r18
            r4 = r13
            r5 = r10
            r6 = r18
            r1.zzD(r2, r3, r4, r5, r6)
            int r8 = r8 + 1
            goto L_0x064d
        L_0x0663:
            if (r13 == 0) goto L_0x0668
            r10.zzn(r9, r13)
        L_0x0668:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzik, com.google.android.recaptcha.internal.zzfz):void");
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
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.recaptcha.internal.zzem r35) throws java.io.IOException {
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
            int r0 = com.google.android.recaptcha.internal.zzen.zzk(r0, r12, r3, r11)
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
            int r13 = com.google.android.recaptcha.internal.zzen.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.recaptcha.internal.zzff.zzG(r0)
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
            int r0 = com.google.android.recaptcha.internal.zzen.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.recaptcha.internal.zzff.zzF(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0116
        L_0x00f0:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0149
            int r0 = com.google.android.recaptcha.internal.zzen.zzj(r12, r4, r11)
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
            int r0 = com.google.android.recaptcha.internal.zzen.zza(r12, r4, r11)
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
            com.google.android.recaptcha.internal.zzil r1 = r13.zzC(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.android.recaptcha.internal.zzen.zzo(r0, r1, r2, r3, r4, r5)
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
            int r0 = com.google.android.recaptcha.internal.zzen.zzg(r12, r4, r11)
            goto L_0x016e
        L_0x016a:
            int r0 = com.google.android.recaptcha.internal.zzen.zzh(r12, r4, r11)
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
            int r0 = com.google.android.recaptcha.internal.zzen.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r5 = 0
        L_0x0191:
            com.google.android.recaptcha.internal.zzjp.zzm(r14, r8, r5)
            goto L_0x023d
        L_0x0196:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024d
            int r0 = com.google.android.recaptcha.internal.zzen.zzb(r12, r4)
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
            long r21 = com.google.android.recaptcha.internal.zzen.zzq(r12, r4)
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
            int r0 = com.google.android.recaptcha.internal.zzen.zzj(r12, r4, r11)
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
            int r17 = com.google.android.recaptcha.internal.zzen.zzm(r12, r4, r11)
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
            int r0 = com.google.android.recaptcha.internal.zzen.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.recaptcha.internal.zzjp.zzp(r14, r8, r0)
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
            long r0 = com.google.android.recaptcha.internal.zzen.zzq(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.recaptcha.internal.zzjp.zzo(r14, r8, r0)
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
            com.google.android.recaptcha.internal.zzgv r0 = (com.google.android.recaptcha.internal.zzgv) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0285
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027d
            r1 = 10
            goto L_0x027e
        L_0x027d:
            int r1 = r1 + r1
        L_0x027e:
            com.google.android.recaptcha.internal.zzgv r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
        L_0x0285:
            r5 = r0
            com.google.android.recaptcha.internal.zzil r0 = r10.zzC(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.recaptcha.internal.zzen.zze(r0, r1, r2, r3, r4, r5, r6)
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
            com.google.android.recaptcha.internal.zzjg r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.recaptcha.internal.zzen.zzi(r0, r1, r2, r3, r4, r5)
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
            com.google.android.recaptcha.internal.zzgy r0 = com.google.android.recaptcha.internal.zzgy.zzg()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzem):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v144, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x09e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(java.lang.Object r18, com.google.android.recaptcha.internal.zzjx r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.zzj
            r5 = 1
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x052b
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x002c
            com.google.android.recaptcha.internal.zzga r3 = r0.zzp
            com.google.android.recaptcha.internal.zzge r3 = r3.zzb(r1)
            com.google.android.recaptcha.internal.zziy r8 = r3.zza
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x002c
            java.util.Iterator r3 = r3.zzf()
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x002e
        L_0x002c:
            r3 = 0
            r8 = 0
        L_0x002e:
            int[] r9 = r0.zzc
            int r9 = r9.length
            r10 = 0
        L_0x0032:
            if (r10 >= r9) goto L_0x050a
            int r11 = r0.zzz(r10)
            int[] r12 = r0.zzc
            r12 = r12[r10]
        L_0x003c:
            if (r8 == 0) goto L_0x005a
            com.google.android.recaptcha.internal.zzga r13 = r0.zzp
            int r13 = r13.zza(r8)
            if (r13 > r12) goto L_0x005a
            com.google.android.recaptcha.internal.zzga r13 = r0.zzp
            r13.zzi(r2, r8)
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0058
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x003c
        L_0x0058:
            r8 = 0
            goto L_0x003c
        L_0x005a:
            int r13 = zzy(r11)
            switch(r13) {
                case 0: goto L_0x04f7;
                case 1: goto L_0x04e7;
                case 2: goto L_0x04d7;
                case 3: goto L_0x04c7;
                case 4: goto L_0x04b7;
                case 5: goto L_0x04a7;
                case 6: goto L_0x0497;
                case 7: goto L_0x0486;
                case 8: goto L_0x0475;
                case 9: goto L_0x0460;
                case 10: goto L_0x044d;
                case 11: goto L_0x043c;
                case 12: goto L_0x042b;
                case 13: goto L_0x041a;
                case 14: goto L_0x0409;
                case 15: goto L_0x03f8;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d2;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b0;
                case 20: goto L_0x039f;
                case 21: goto L_0x038e;
                case 22: goto L_0x037d;
                case 23: goto L_0x036c;
                case 24: goto L_0x035b;
                case 25: goto L_0x034a;
                case 26: goto L_0x0339;
                case 27: goto L_0x0324;
                case 28: goto L_0x0313;
                case 29: goto L_0x0302;
                case 30: goto L_0x02f1;
                case 31: goto L_0x02e0;
                case 32: goto L_0x02cf;
                case 33: goto L_0x02be;
                case 34: goto L_0x02ad;
                case 35: goto L_0x029c;
                case 36: goto L_0x028b;
                case 37: goto L_0x027a;
                case 38: goto L_0x0269;
                case 39: goto L_0x0258;
                case 40: goto L_0x0247;
                case 41: goto L_0x0236;
                case 42: goto L_0x0225;
                case 43: goto L_0x0214;
                case 44: goto L_0x0203;
                case 45: goto L_0x01f2;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01d0;
                case 48: goto L_0x01bf;
                case 49: goto L_0x01aa;
                case 50: goto L_0x019f;
                case 51: goto L_0x018e;
                case 52: goto L_0x017d;
                case 53: goto L_0x016c;
                case 54: goto L_0x015b;
                case 55: goto L_0x014a;
                case 56: goto L_0x0139;
                case 57: goto L_0x0128;
                case 58: goto L_0x0117;
                case 59: goto L_0x0106;
                case 60: goto L_0x00f1;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cd;
                case 63: goto L_0x00bc;
                case 64: goto L_0x00ab;
                case 65: goto L_0x009a;
                case 66: goto L_0x0089;
                case 67: goto L_0x0078;
                case 68: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0506
        L_0x0063:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            com.google.android.recaptcha.internal.zzil r13 = r0.zzC(r10)
            r2.zzq(r12, r11, r13)
            goto L_0x0506
        L_0x0078:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = zzA(r1, r13)
            r2.zzD(r12, r13)
            goto L_0x0506
        L_0x0089:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = zzq(r1, r13)
            r2.zzB(r12, r11)
            goto L_0x0506
        L_0x009a:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = zzA(r1, r13)
            r2.zzz(r12, r13)
            goto L_0x0506
        L_0x00ab:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = zzq(r1, r13)
            r2.zzx(r12, r11)
            goto L_0x0506
        L_0x00bc:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = zzq(r1, r13)
            r2.zzi(r12, r11)
            goto L_0x0506
        L_0x00cd:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = zzq(r1, r13)
            r2.zzI(r12, r11)
            goto L_0x0506
        L_0x00de:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            com.google.android.recaptcha.internal.zzez r11 = (com.google.android.recaptcha.internal.zzez) r11
            r2.zzd(r12, r11)
            goto L_0x0506
        L_0x00f1:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            com.google.android.recaptcha.internal.zzil r13 = r0.zzC(r10)
            r2.zzv(r12, r11, r13)
            goto L_0x0506
        L_0x0106:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            zzZ(r12, r11, r2)
            goto L_0x0506
        L_0x0117:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            boolean r11 = zzY(r1, r13)
            r2.zzb(r12, r11)
            goto L_0x0506
        L_0x0128:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = zzq(r1, r13)
            r2.zzk(r12, r11)
            goto L_0x0506
        L_0x0139:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = zzA(r1, r13)
            r2.zzm(r12, r13)
            goto L_0x0506
        L_0x014a:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = zzq(r1, r13)
            r2.zzr(r12, r11)
            goto L_0x0506
        L_0x015b:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = zzA(r1, r13)
            r2.zzK(r12, r13)
            goto L_0x0506
        L_0x016c:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = zzA(r1, r13)
            r2.zzt(r12, r13)
            goto L_0x0506
        L_0x017d:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            float r11 = zzo(r1, r13)
            r2.zzo(r12, r11)
            goto L_0x0506
        L_0x018e:
            boolean r13 = r0.zzX(r1, r12, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            double r13 = zzn(r1, r13)
            r2.zzf(r12, r13)
            goto L_0x0506
        L_0x019f:
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            r0.zzQ(r2, r12, r11, r10)
            goto L_0x0506
        L_0x01aa:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzil r13 = r0.zzC(r10)
            com.google.android.recaptcha.internal.zzin.zzN(r12, r11, r2, r13)
            goto L_0x0506
        L_0x01bf:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzU(r12, r11, r2, r5)
            goto L_0x0506
        L_0x01d0:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzT(r12, r11, r2, r5)
            goto L_0x0506
        L_0x01e1:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzS(r12, r11, r2, r5)
            goto L_0x0506
        L_0x01f2:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzR(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0203:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzJ(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0214:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzW(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0225:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzG(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0236:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzK(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0247:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzL(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0258:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzO(r12, r11, r2, r5)
            goto L_0x0506
        L_0x0269:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzX(r12, r11, r2, r5)
            goto L_0x0506
        L_0x027a:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzP(r12, r11, r2, r5)
            goto L_0x0506
        L_0x028b:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzM(r12, r11, r2, r5)
            goto L_0x0506
        L_0x029c:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzI(r12, r11, r2, r5)
            goto L_0x0506
        L_0x02ad:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzU(r12, r11, r2, r6)
            goto L_0x0506
        L_0x02be:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzT(r12, r11, r2, r6)
            goto L_0x0506
        L_0x02cf:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzS(r12, r11, r2, r6)
            goto L_0x0506
        L_0x02e0:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzR(r12, r11, r2, r6)
            goto L_0x0506
        L_0x02f1:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzJ(r12, r11, r2, r6)
            goto L_0x0506
        L_0x0302:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzW(r12, r11, r2, r6)
            goto L_0x0506
        L_0x0313:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzH(r12, r11, r2)
            goto L_0x0506
        L_0x0324:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzil r13 = r0.zzC(r10)
            com.google.android.recaptcha.internal.zzin.zzQ(r12, r11, r2, r13)
            goto L_0x0506
        L_0x0339:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzV(r12, r11, r2)
            goto L_0x0506
        L_0x034a:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzG(r12, r11, r2, r6)
            goto L_0x0506
        L_0x035b:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzK(r12, r11, r2, r6)
            goto L_0x0506
        L_0x036c:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzL(r12, r11, r2, r6)
            goto L_0x0506
        L_0x037d:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzO(r12, r11, r2, r6)
            goto L_0x0506
        L_0x038e:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzX(r12, r11, r2, r6)
            goto L_0x0506
        L_0x039f:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzP(r12, r11, r2, r6)
            goto L_0x0506
        L_0x03b0:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzM(r12, r11, r2, r6)
            goto L_0x0506
        L_0x03c1:
            int[] r12 = r0.zzc
            r12 = r12[r10]
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzin.zzI(r12, r11, r2, r6)
            goto L_0x0506
        L_0x03d2:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            com.google.android.recaptcha.internal.zzil r13 = r0.zzC(r10)
            r2.zzq(r12, r11, r13)
            goto L_0x0506
        L_0x03e7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = com.google.android.recaptcha.internal.zzjp.zzd(r1, r13)
            r2.zzD(r12, r13)
            goto L_0x0506
        L_0x03f8:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = com.google.android.recaptcha.internal.zzjp.zzc(r1, r13)
            r2.zzB(r12, r11)
            goto L_0x0506
        L_0x0409:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = com.google.android.recaptcha.internal.zzjp.zzd(r1, r13)
            r2.zzz(r12, r13)
            goto L_0x0506
        L_0x041a:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = com.google.android.recaptcha.internal.zzjp.zzc(r1, r13)
            r2.zzx(r12, r11)
            goto L_0x0506
        L_0x042b:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = com.google.android.recaptcha.internal.zzjp.zzc(r1, r13)
            r2.zzi(r12, r11)
            goto L_0x0506
        L_0x043c:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = com.google.android.recaptcha.internal.zzjp.zzc(r1, r13)
            r2.zzI(r12, r11)
            goto L_0x0506
        L_0x044d:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            com.google.android.recaptcha.internal.zzez r11 = (com.google.android.recaptcha.internal.zzez) r11
            r2.zzd(r12, r11)
            goto L_0x0506
        L_0x0460:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            com.google.android.recaptcha.internal.zzil r13 = r0.zzC(r10)
            r2.zzv(r12, r11, r13)
            goto L_0x0506
        L_0x0475:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.recaptcha.internal.zzjp.zzf(r1, r13)
            zzZ(r12, r11, r2)
            goto L_0x0506
        L_0x0486:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            boolean r11 = com.google.android.recaptcha.internal.zzjp.zzw(r1, r13)
            r2.zzb(r12, r11)
            goto L_0x0506
        L_0x0497:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = com.google.android.recaptcha.internal.zzjp.zzc(r1, r13)
            r2.zzk(r12, r11)
            goto L_0x0506
        L_0x04a7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = com.google.android.recaptcha.internal.zzjp.zzd(r1, r13)
            r2.zzm(r12, r13)
            goto L_0x0506
        L_0x04b7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            int r11 = com.google.android.recaptcha.internal.zzjp.zzc(r1, r13)
            r2.zzr(r12, r11)
            goto L_0x0506
        L_0x04c7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = com.google.android.recaptcha.internal.zzjp.zzd(r1, r13)
            r2.zzK(r12, r13)
            goto L_0x0506
        L_0x04d7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            long r13 = com.google.android.recaptcha.internal.zzjp.zzd(r1, r13)
            r2.zzt(r12, r13)
            goto L_0x0506
        L_0x04e7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            float r11 = com.google.android.recaptcha.internal.zzjp.zzb(r1, r13)
            r2.zzo(r12, r11)
            goto L_0x0506
        L_0x04f7:
            boolean r13 = r0.zzT(r1, r10)
            if (r13 == 0) goto L_0x0506
            r11 = r11 & r7
            long r13 = (long) r11
            double r13 = com.google.android.recaptcha.internal.zzjp.zza(r1, r13)
            r2.zzf(r12, r13)
        L_0x0506:
            int r10 = r10 + 3
            goto L_0x0032
        L_0x050a:
            if (r8 == 0) goto L_0x0521
            com.google.android.recaptcha.internal.zzga r5 = r0.zzp
            r5.zzi(r2, r8)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x051f
            java.lang.Object r5 = r3.next()
            r8 = r5
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x050a
        L_0x051f:
            r8 = 0
            goto L_0x050a
        L_0x0521:
            com.google.android.recaptcha.internal.zzjf r3 = r0.zzo
            java.lang.Object r1 = r3.zzd(r1)
            r3.zzq(r1, r2)
            return
        L_0x052b:
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x0548
            com.google.android.recaptcha.internal.zzga r3 = r0.zzp
            com.google.android.recaptcha.internal.zzge r3 = r3.zzb(r1)
            com.google.android.recaptcha.internal.zziy r8 = r3.zza
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0548
            java.util.Iterator r3 = r3.zzf()
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x054a
        L_0x0548:
            r3 = 0
            r8 = 0
        L_0x054a:
            int[] r9 = r0.zzc
            int r9 = r9.length
            sun.misc.Unsafe r10 = zzb
            r11 = 0
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 0
        L_0x0554:
            if (r11 >= r9) goto L_0x09e6
            int r14 = r0.zzz(r11)
            int[] r15 = r0.zzc
            r4 = r15[r11]
            int r6 = zzy(r14)
            r5 = 17
            if (r6 > r5) goto L_0x057a
            int r5 = r11 + 2
            r5 = r15[r5]
            r15 = r5 & r7
            if (r15 == r12) goto L_0x0574
            long r12 = (long) r15
            int r13 = r10.getInt(r1, r12)
            r12 = r15
        L_0x0574:
            int r5 = r5 >>> 20
            r15 = 1
            int r5 = r15 << r5
            goto L_0x057b
        L_0x057a:
            r5 = 0
        L_0x057b:
            if (r8 == 0) goto L_0x0599
            com.google.android.recaptcha.internal.zzga r15 = r0.zzp
            int r15 = r15.zza(r8)
            if (r15 > r4) goto L_0x0599
            com.google.android.recaptcha.internal.zzga r15 = r0.zzp
            r15.zzi(r2, r8)
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0597
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x057b
        L_0x0597:
            r8 = 0
            goto L_0x057b
        L_0x0599:
            r14 = r14 & r7
            long r14 = (long) r14
            switch(r6) {
                case 0: goto L_0x09d3;
                case 1: goto L_0x09c5;
                case 2: goto L_0x09b7;
                case 3: goto L_0x09a9;
                case 4: goto L_0x099b;
                case 5: goto L_0x098d;
                case 6: goto L_0x097f;
                case 7: goto L_0x0971;
                case 8: goto L_0x0962;
                case 9: goto L_0x094f;
                case 10: goto L_0x093e;
                case 11: goto L_0x092f;
                case 12: goto L_0x0920;
                case 13: goto L_0x0911;
                case 14: goto L_0x0902;
                case 15: goto L_0x08f3;
                case 16: goto L_0x08e4;
                case 17: goto L_0x08d1;
                case 18: goto L_0x08c0;
                case 19: goto L_0x08af;
                case 20: goto L_0x089e;
                case 21: goto L_0x088d;
                case 22: goto L_0x087c;
                case 23: goto L_0x086b;
                case 24: goto L_0x085a;
                case 25: goto L_0x0849;
                case 26: goto L_0x0839;
                case 27: goto L_0x0825;
                case 28: goto L_0x0815;
                case 29: goto L_0x0804;
                case 30: goto L_0x07f3;
                case 31: goto L_0x07e2;
                case 32: goto L_0x07d1;
                case 33: goto L_0x07c0;
                case 34: goto L_0x07af;
                case 35: goto L_0x079f;
                case 36: goto L_0x078f;
                case 37: goto L_0x077f;
                case 38: goto L_0x076f;
                case 39: goto L_0x075f;
                case 40: goto L_0x074f;
                case 41: goto L_0x073f;
                case 42: goto L_0x072f;
                case 43: goto L_0x071f;
                case 44: goto L_0x070f;
                case 45: goto L_0x06ff;
                case 46: goto L_0x06ef;
                case 47: goto L_0x06df;
                case 48: goto L_0x06cf;
                case 49: goto L_0x06bc;
                case 50: goto L_0x06b3;
                case 51: goto L_0x06a4;
                case 52: goto L_0x0695;
                case 53: goto L_0x0686;
                case 54: goto L_0x0677;
                case 55: goto L_0x0668;
                case 56: goto L_0x0659;
                case 57: goto L_0x064a;
                case 58: goto L_0x063b;
                case 59: goto L_0x062c;
                case 60: goto L_0x0619;
                case 61: goto L_0x0609;
                case 62: goto L_0x05fb;
                case 63: goto L_0x05ed;
                case 64: goto L_0x05df;
                case 65: goto L_0x05d1;
                case 66: goto L_0x05c3;
                case 67: goto L_0x05b5;
                case 68: goto L_0x05a3;
                default: goto L_0x059e;
            }
        L_0x059e:
            r6 = 1
        L_0x059f:
            r16 = 0
            goto L_0x09e0
        L_0x05a3:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            java.lang.Object r5 = r10.getObject(r1, r14)
            com.google.android.recaptcha.internal.zzil r6 = r0.zzC(r11)
            r2.zzq(r4, r5, r6)
            goto L_0x059e
        L_0x05b5:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            long r5 = zzA(r1, r14)
            r2.zzD(r4, r5)
            goto L_0x059e
        L_0x05c3:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            int r5 = zzq(r1, r14)
            r2.zzB(r4, r5)
            goto L_0x059e
        L_0x05d1:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            long r5 = zzA(r1, r14)
            r2.zzz(r4, r5)
            goto L_0x059e
        L_0x05df:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            int r5 = zzq(r1, r14)
            r2.zzx(r4, r5)
            goto L_0x059e
        L_0x05ed:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            int r5 = zzq(r1, r14)
            r2.zzi(r4, r5)
            goto L_0x059e
        L_0x05fb:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            int r5 = zzq(r1, r14)
            r2.zzI(r4, r5)
            goto L_0x059e
        L_0x0609:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            java.lang.Object r5 = r10.getObject(r1, r14)
            com.google.android.recaptcha.internal.zzez r5 = (com.google.android.recaptcha.internal.zzez) r5
            r2.zzd(r4, r5)
            goto L_0x059e
        L_0x0619:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            java.lang.Object r5 = r10.getObject(r1, r14)
            com.google.android.recaptcha.internal.zzil r6 = r0.zzC(r11)
            r2.zzv(r4, r5, r6)
            goto L_0x059e
        L_0x062c:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            java.lang.Object r5 = r10.getObject(r1, r14)
            zzZ(r4, r5, r2)
            goto L_0x059e
        L_0x063b:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            boolean r5 = zzY(r1, r14)
            r2.zzb(r4, r5)
            goto L_0x059e
        L_0x064a:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            int r5 = zzq(r1, r14)
            r2.zzk(r4, r5)
            goto L_0x059e
        L_0x0659:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            long r5 = zzA(r1, r14)
            r2.zzm(r4, r5)
            goto L_0x059e
        L_0x0668:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            int r5 = zzq(r1, r14)
            r2.zzr(r4, r5)
            goto L_0x059e
        L_0x0677:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            long r5 = zzA(r1, r14)
            r2.zzK(r4, r5)
            goto L_0x059e
        L_0x0686:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            long r5 = zzA(r1, r14)
            r2.zzt(r4, r5)
            goto L_0x059e
        L_0x0695:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            float r5 = zzo(r1, r14)
            r2.zzo(r4, r5)
            goto L_0x059e
        L_0x06a4:
            boolean r5 = r0.zzX(r1, r4, r11)
            if (r5 == 0) goto L_0x059e
            double r5 = zzn(r1, r14)
            r2.zzf(r4, r5)
            goto L_0x059e
        L_0x06b3:
            java.lang.Object r5 = r10.getObject(r1, r14)
            r0.zzQ(r2, r4, r5, r11)
            goto L_0x059e
        L_0x06bc:
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzil r6 = r0.zzC(r11)
            com.google.android.recaptcha.internal.zzin.zzN(r4, r5, r2, r6)
            goto L_0x059e
        L_0x06cf:
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            r6 = 1
            com.google.android.recaptcha.internal.zzin.zzU(r4, r5, r2, r6)
            goto L_0x059f
        L_0x06df:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzT(r4, r5, r2, r6)
            goto L_0x059f
        L_0x06ef:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzS(r4, r5, r2, r6)
            goto L_0x059f
        L_0x06ff:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzR(r4, r5, r2, r6)
            goto L_0x059f
        L_0x070f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzJ(r4, r5, r2, r6)
            goto L_0x059f
        L_0x071f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzW(r4, r5, r2, r6)
            goto L_0x059f
        L_0x072f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzG(r4, r5, r2, r6)
            goto L_0x059f
        L_0x073f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzK(r4, r5, r2, r6)
            goto L_0x059f
        L_0x074f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzL(r4, r5, r2, r6)
            goto L_0x059f
        L_0x075f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzO(r4, r5, r2, r6)
            goto L_0x059f
        L_0x076f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzX(r4, r5, r2, r6)
            goto L_0x059f
        L_0x077f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzP(r4, r5, r2, r6)
            goto L_0x059f
        L_0x078f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzM(r4, r5, r2, r6)
            goto L_0x059f
        L_0x079f:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzI(r4, r5, r2, r6)
            goto L_0x059f
        L_0x07af:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            r14 = 0
            com.google.android.recaptcha.internal.zzin.zzU(r4, r5, r2, r14)
            goto L_0x059f
        L_0x07c0:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzT(r5, r14, r2, r4)
            goto L_0x059f
        L_0x07d1:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzS(r5, r14, r2, r4)
            goto L_0x059f
        L_0x07e2:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzR(r5, r14, r2, r4)
            goto L_0x059f
        L_0x07f3:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzJ(r5, r14, r2, r4)
            goto L_0x059f
        L_0x0804:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzW(r5, r14, r2, r4)
            goto L_0x059f
        L_0x0815:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzH(r4, r5, r2)
            goto L_0x059f
        L_0x0825:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzil r14 = r0.zzC(r11)
            com.google.android.recaptcha.internal.zzin.zzQ(r4, r5, r2, r14)
            goto L_0x059f
        L_0x0839:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            com.google.android.recaptcha.internal.zzin.zzV(r4, r5, r2)
            goto L_0x059f
        L_0x0849:
            r6 = 1
            int[] r4 = r0.zzc
            r4 = r4[r11]
            java.lang.Object r5 = r10.getObject(r1, r14)
            java.util.List r5 = (java.util.List) r5
            r14 = 0
            com.google.android.recaptcha.internal.zzin.zzG(r4, r5, r2, r14)
            goto L_0x059f
        L_0x085a:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzK(r5, r14, r2, r4)
            goto L_0x059f
        L_0x086b:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzL(r5, r14, r2, r4)
            goto L_0x059f
        L_0x087c:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzO(r5, r14, r2, r4)
            goto L_0x059f
        L_0x088d:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzX(r5, r14, r2, r4)
            goto L_0x059f
        L_0x089e:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzP(r5, r14, r2, r4)
            goto L_0x059f
        L_0x08af:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzM(r5, r14, r2, r4)
            goto L_0x059f
        L_0x08c0:
            r4 = 0
            r6 = 1
            int[] r5 = r0.zzc
            r5 = r5[r11]
            java.lang.Object r14 = r10.getObject(r1, r14)
            java.util.List r14 = (java.util.List) r14
            com.google.android.recaptcha.internal.zzin.zzI(r5, r14, r2, r4)
            goto L_0x059f
        L_0x08d1:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            java.lang.Object r5 = r10.getObject(r1, r14)
            com.google.android.recaptcha.internal.zzil r14 = r0.zzC(r11)
            r2.zzq(r4, r5, r14)
            goto L_0x09e0
        L_0x08e4:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            long r14 = r10.getLong(r1, r14)
            r2.zzD(r4, r14)
            goto L_0x09e0
        L_0x08f3:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            int r5 = r10.getInt(r1, r14)
            r2.zzB(r4, r5)
            goto L_0x09e0
        L_0x0902:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            long r14 = r10.getLong(r1, r14)
            r2.zzz(r4, r14)
            goto L_0x09e0
        L_0x0911:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            int r5 = r10.getInt(r1, r14)
            r2.zzx(r4, r5)
            goto L_0x09e0
        L_0x0920:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            int r5 = r10.getInt(r1, r14)
            r2.zzi(r4, r5)
            goto L_0x09e0
        L_0x092f:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            int r5 = r10.getInt(r1, r14)
            r2.zzI(r4, r5)
            goto L_0x09e0
        L_0x093e:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            java.lang.Object r5 = r10.getObject(r1, r14)
            com.google.android.recaptcha.internal.zzez r5 = (com.google.android.recaptcha.internal.zzez) r5
            r2.zzd(r4, r5)
            goto L_0x09e0
        L_0x094f:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            java.lang.Object r5 = r10.getObject(r1, r14)
            com.google.android.recaptcha.internal.zzil r14 = r0.zzC(r11)
            r2.zzv(r4, r5, r14)
            goto L_0x09e0
        L_0x0962:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            java.lang.Object r5 = r10.getObject(r1, r14)
            zzZ(r4, r5, r2)
            goto L_0x09e0
        L_0x0971:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            boolean r5 = com.google.android.recaptcha.internal.zzjp.zzw(r1, r14)
            r2.zzb(r4, r5)
            goto L_0x09e0
        L_0x097f:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            int r5 = r10.getInt(r1, r14)
            r2.zzk(r4, r5)
            goto L_0x09e0
        L_0x098d:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            long r14 = r10.getLong(r1, r14)
            r2.zzm(r4, r14)
            goto L_0x09e0
        L_0x099b:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            int r5 = r10.getInt(r1, r14)
            r2.zzr(r4, r5)
            goto L_0x09e0
        L_0x09a9:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            long r14 = r10.getLong(r1, r14)
            r2.zzK(r4, r14)
            goto L_0x09e0
        L_0x09b7:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            long r14 = r10.getLong(r1, r14)
            r2.zzt(r4, r14)
            goto L_0x09e0
        L_0x09c5:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            float r5 = com.google.android.recaptcha.internal.zzjp.zzb(r1, r14)
            r2.zzo(r4, r5)
            goto L_0x09e0
        L_0x09d3:
            r6 = 1
            r16 = 0
            r5 = r5 & r13
            if (r5 == 0) goto L_0x09e0
            double r14 = com.google.android.recaptcha.internal.zzjp.zza(r1, r14)
            r2.zzf(r4, r14)
        L_0x09e0:
            int r11 = r11 + 3
            r5 = 1
            r6 = 0
            goto L_0x0554
        L_0x09e6:
            if (r8 == 0) goto L_0x09fd
            com.google.android.recaptcha.internal.zzga r4 = r0.zzp
            r4.zzi(r2, r8)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x09fb
            java.lang.Object r4 = r3.next()
            r8 = r4
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x09e6
        L_0x09fb:
            r8 = 0
            goto L_0x09e6
        L_0x09fd:
            com.google.android.recaptcha.internal.zzjf r3 = r0.zzo
            java.lang.Object r1 = r3.zzd(r1)
            r3.zzq(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzjx):void");
    }

    public final boolean zzk(Object obj, Object obj2) {
        boolean z10;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzz = zzz(i10);
            long j10 = (long) (zzz & 1048575);
            switch (zzy(zzz)) {
                case 0:
                    if (zzR(obj, obj2, i10) && Double.doubleToLongBits(zzjp.zza(obj, j10)) == Double.doubleToLongBits(zzjp.zza(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (zzR(obj, obj2, i10) && Float.floatToIntBits(zzjp.zzb(obj, j10)) == Float.floatToIntBits(zzjp.zzb(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (zzR(obj, obj2, i10) && zzjp.zzw(obj, j10) == zzjp.zzw(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        continue;
                    }
                case 11:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
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
                    z10 = zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10));
                    break;
                case 50:
                    z10 = zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10));
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
                    if (zzjp.zzc(obj, zzw) == zzjp.zzc(obj2, zzw) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
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
        if (this.zzh) {
            return this.zzp.zzb(obj).equals(this.zzp.zzb(obj2));
        }
        return true;
    }

    public final boolean zzl(Object obj) {
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
            if ((268435456 & zzz) != 0 && !zzU(obj, i15, i11, i10, i19)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzX(obj2, i16, i15) && !zzV(obj2, zzz, zzC(i15))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzhs) zzjp.zzf(obj2, (long) (zzz & 1048575))).isEmpty()) {
                            zzhr zzhr = (zzhr) zzE(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzjp.zzf(obj2, (long) (zzz & 1048575));
                if (!list.isEmpty()) {
                    zzil zzC = zzC(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzC.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzU(obj, i15, i11, i10, i19) && !zzV(obj2, zzz, zzC(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.zzh || this.zzp.zzb(obj2).zzk();
    }
}
