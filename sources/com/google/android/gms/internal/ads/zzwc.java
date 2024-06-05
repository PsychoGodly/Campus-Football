package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzwc extends zzwh {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final zzfrs zzc = zzfrs.zzb(zzvi.zza);
    /* access modifiers changed from: private */
    public static final zzfrs zzd = zzfrs.zzb(zzvj.zza);
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzvq zzg;
    private zzvv zzh;
    private zzk zzi;
    private final zzux zzj;

    @Deprecated
    public zzwc() {
        zzvq zzvq = zzvq.zzD;
        throw null;
    }

    protected static int zza(zzaf zzaf, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzaf.zzd)) {
            return 4;
        }
        String zzf2 = zzf(str);
        String zzf3 = zzf(zzaf.zzd);
        if (zzf3 == null || zzf2 == null) {
            if (!z10 || zzf3 != null) {
                return 0;
            }
            return 1;
        } else if (zzf3.startsWith(zzf2) || zzf2.startsWith(zzf3)) {
            return 3;
        } else {
            if (zzew.zzai(zzf3, "-")[0].equals(zzew.zzai(zzf2, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    protected static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        if (r8.zzh.zzd(r8.zzi, r9) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzwc r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzvq r1 = r8.zzg     // Catch:{ all -> 0x008e }
            boolean r1 = r1.zzP     // Catch:{ all -> 0x008e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008b
            boolean r1 = r8.zzf     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x008b
            int r1 = r9.zzz     // Catch:{ all -> 0x008e }
            r4 = 2
            if (r1 <= r4) goto L_0x008b
            java.lang.String r1 = r9.zzm     // Catch:{ all -> 0x008e }
            r5 = 32
            if (r1 != 0) goto L_0x001b
            goto L_0x0065
        L_0x001b:
            int r6 = r1.hashCode()     // Catch:{ all -> 0x008e }
            r7 = 3
            switch(r6) {
                case -2123537834: goto L_0x0042;
                case 187078296: goto L_0x0038;
                case 187078297: goto L_0x002e;
                case 1504578661: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x002e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 3
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 2
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            if (r1 == 0) goto L_0x0056
            if (r1 == r3) goto L_0x0056
            if (r1 == r4) goto L_0x0056
            if (r1 == r7) goto L_0x0056
            goto L_0x0065
        L_0x0056:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008b
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.zzg()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            boolean r4 = r1.zzg()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x008c
            boolean r1 = r1.zze()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch:{ all -> 0x008e }
            boolean r1 = r1.zzf()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch:{ all -> 0x008e }
            boolean r8 = r1.zzd(r8, r9)     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x008c
        L_0x008b:
            r2 = 1
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return r2
        L_0x008e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwc.zzk(com.google.android.gms.internal.ads.zzwc, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    protected static boolean zzm(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    private static void zzs(zzur zzur, zzcu zzcu, Map map) {
        int i10 = 0;
        while (i10 < zzur.zzc) {
            if (((zzcr) zzcu.zzB.get(zzur.zzb(i10))) == null) {
                i10++;
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzt() {
        boolean z10;
        zzvv zzvv;
        synchronized (this.zze) {
            z10 = false;
            if (this.zzg.zzP && !this.zzf && zzew.zza >= 32 && (zzvv = this.zzh) != null && zzvv.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzr();
        }
    }

    private static final Pair zzu(int i10, zzwg zzwg, int[][][] iArr, zzvx zzvx, Comparator comparator) {
        Object obj;
        zzwg zzwg2 = zzwg;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == zzwg2.zzc(i11)) {
                zzur zzd2 = zzwg2.zzd(i11);
                for (int i12 = 0; i12 < zzd2.zzc; i12++) {
                    zzcp zzb2 = zzd2.zzb(i12);
                    List zza2 = zzvx.zza(i11, zzb2, iArr[i11][i12]);
                    int i13 = zzb2.zzb;
                    int i14 = 1;
                    boolean[] zArr = new boolean[1];
                    int i15 = 0;
                    while (i15 <= 0) {
                        zzvy zzvy = (zzvy) zza2.get(i15);
                        int zzb3 = zzvy.zzb();
                        if (!zArr[i15] && zzb3 != 0) {
                            if (zzb3 == i14) {
                                obj = zzfqk.zzp(zzvy);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvy);
                                for (int i16 = i15 + 1; i16 <= 0; i16++) {
                                    zzvy zzvy2 = (zzvy) zza2.get(i16);
                                    if (zzvy2.zzb() == 2 && zzvy.zzc(zzvy2)) {
                                        arrayList2.add(zzvy2);
                                        zArr[i16] = true;
                                    }
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i15++;
                        i14 = 1;
                    }
                }
            }
            zzvx zzvx2 = zzvx;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzvy) list.get(i17)).zzc;
        }
        zzvy zzvy3 = (zzvy) list.get(0);
        return Pair.create(new zzwd(zzvy3.zzb, iArr2, 0), Integer.valueOf(zzvy3.zza));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.google.android.gms.internal.ads.zzwe[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: com.google.android.gms.internal.ads.zzuy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: com.google.android.gms.internal.ads.zzwf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.gms.internal.ads.zzwf} */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzwg r24, int[][][] r25, int[] r26, com.google.android.gms.internal.ads.zzss r27, com.google.android.gms.internal.ads.zzcn r28) throws com.google.android.gms.internal.ads.zzhj {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            java.lang.Object r3 = r1.zze
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzvq r4 = r1.zzg     // Catch:{ all -> 0x021f }
            boolean r5 = r4.zzP     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0023
            int r5 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ all -> 0x021f }
            r6 = 32
            if (r5 < r6) goto L_0x0023
            com.google.android.gms.internal.ads.zzvv r5 = r1.zzh     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0023
            android.os.Looper r6 = android.os.Looper.myLooper()     // Catch:{ all -> 0x021f }
            com.google.android.gms.internal.ads.zzdl.zzb(r6)     // Catch:{ all -> 0x021f }
            r5.zzb(r1, r6)     // Catch:{ all -> 0x021f }
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x021f }
            r3 = 2
            com.google.android.gms.internal.ads.zzwd[] r5 = new com.google.android.gms.internal.ads.zzwd[r3]
            com.google.android.gms.internal.ads.zzve r6 = new com.google.android.gms.internal.ads.zzve
            r7 = r26
            r6.<init>(r4, r7)
            com.google.android.gms.internal.ads.zzvf r7 = com.google.android.gms.internal.ads.zzvf.zza
            android.util.Pair r6 = zzu(r3, r0, r2, r6, r7)
            if (r6 == 0) goto L_0x0044
            java.lang.Object r7 = r6.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.zzwd r6 = (com.google.android.gms.internal.ads.zzwd) r6
            r5[r7] = r6
        L_0x0044:
            r6 = 0
            r7 = 0
        L_0x0046:
            r8 = 1
            if (r7 >= r3) goto L_0x005c
            int r9 = r0.zzc(r7)
            if (r9 != r3) goto L_0x0059
            com.google.android.gms.internal.ads.zzur r9 = r0.zzd(r7)
            int r9 = r9.zzc
            if (r9 <= 0) goto L_0x0059
            r7 = 1
            goto L_0x005d
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0046
        L_0x005c:
            r7 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzvc r9 = new com.google.android.gms.internal.ads.zzvc
            r9.<init>(r1, r4, r7)
            com.google.android.gms.internal.ads.zzvd r7 = com.google.android.gms.internal.ads.zzvd.zza
            android.util.Pair r7 = zzu(r8, r0, r2, r9, r7)
            if (r7 == 0) goto L_0x0078
            java.lang.Object r9 = r7.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r7.first
            com.google.android.gms.internal.ads.zzwd r10 = (com.google.android.gms.internal.ads.zzwd) r10
            r5[r9] = r10
        L_0x0078:
            if (r7 != 0) goto L_0x007c
            r7 = 0
            goto L_0x008f
        L_0x007c:
            java.lang.Object r7 = r7.first
            r10 = r7
            com.google.android.gms.internal.ads.zzwd r10 = (com.google.android.gms.internal.ads.zzwd) r10
            com.google.android.gms.internal.ads.zzcp r10 = r10.zza
            com.google.android.gms.internal.ads.zzwd r7 = (com.google.android.gms.internal.ads.zzwd) r7
            int[] r7 = r7.zzb
            r7 = r7[r6]
            com.google.android.gms.internal.ads.zzaf r7 = r10.zzb(r7)
            java.lang.String r7 = r7.zzd
        L_0x008f:
            com.google.android.gms.internal.ads.zzvg r10 = new com.google.android.gms.internal.ads.zzvg
            r10.<init>(r4, r7)
            com.google.android.gms.internal.ads.zzvh r7 = com.google.android.gms.internal.ads.zzvh.zza
            r11 = 3
            android.util.Pair r7 = zzu(r11, r0, r2, r10, r7)
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r10 = r7.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.zzwd r7 = (com.google.android.gms.internal.ads.zzwd) r7
            r5[r10] = r7
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 >= r3) goto L_0x011e
            int r10 = r0.zzc(r7)
            if (r10 == r3) goto L_0x0115
            if (r10 == r8) goto L_0x0115
            if (r10 == r11) goto L_0x0115
            com.google.android.gms.internal.ads.zzur r10 = r0.zzd(r7)
            r12 = r2[r7]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x00c3:
            int r11 = r10.zzc
            if (r13 >= r11) goto L_0x0104
            com.google.android.gms.internal.ads.zzcp r11 = r10.zzb(r13)
            r17 = r12[r13]
            r9 = r16
            r3 = 0
        L_0x00d0:
            int r6 = r11.zzb
            if (r3 > 0) goto L_0x00fa
            r6 = r17[r3]
            boolean r8 = r4.zzQ
            boolean r6 = zzm(r6, r8)
            if (r6 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzaf r6 = r11.zzb(r3)
            com.google.android.gms.internal.ads.zzvl r8 = new com.google.android.gms.internal.ads.zzvl
            r2 = r17[r3]
            r8.<init>(r6, r2)
            if (r9 == 0) goto L_0x00f1
            int r2 = r8.compareTo(r9)
            if (r2 <= 0) goto L_0x00f4
        L_0x00f1:
            r15 = r3
            r9 = r8
            r14 = r11
        L_0x00f4:
            int r3 = r3 + 1
            r2 = r25
            r8 = 1
            goto L_0x00d0
        L_0x00fa:
            int r13 = r13 + 1
            r2 = r25
            r16 = r9
            r3 = 2
            r6 = 0
            r8 = 1
            goto L_0x00c3
        L_0x0104:
            if (r14 != 0) goto L_0x0108
            r2 = 0
            goto L_0x0113
        L_0x0108:
            com.google.android.gms.internal.ads.zzwd r2 = new com.google.android.gms.internal.ads.zzwd
            r3 = 1
            int[] r6 = new int[r3]
            r3 = 0
            r6[r3] = r15
            r2.<init>(r14, r6, r3)
        L_0x0113:
            r5[r7] = r2
        L_0x0115:
            int r7 = r7 + 1
            r2 = r25
            r3 = 2
            r6 = 0
            r8 = 1
            r11 = 3
            goto L_0x00ac
        L_0x011e:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            r6 = 2
        L_0x0125:
            if (r3 >= r6) goto L_0x0131
            com.google.android.gms.internal.ads.zzur r7 = r0.zzd(r3)
            zzs(r7, r4, r2)
            int r3 = r3 + 1
            goto L_0x0125
        L_0x0131:
            com.google.android.gms.internal.ads.zzur r3 = r24.zze()
            zzs(r3, r4, r2)
            r3 = 0
        L_0x0139:
            if (r3 >= r6) goto L_0x0150
            int r7 = r0.zzc(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.get(r7)
            com.google.android.gms.internal.ads.zzcr r7 = (com.google.android.gms.internal.ads.zzcr) r7
            if (r7 != 0) goto L_0x014e
            int r3 = r3 + 1
            goto L_0x0139
        L_0x014e:
            r3 = 0
            throw r3
        L_0x0150:
            r3 = 0
            r2 = 0
        L_0x0152:
            if (r2 >= r6) goto L_0x016c
            com.google.android.gms.internal.ads.zzur r6 = r0.zzd(r2)
            boolean r7 = r4.zzg(r2, r6)
            if (r7 != 0) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            com.google.android.gms.internal.ads.zzvs r6 = r4.zze(r2, r6)
            if (r6 != 0) goto L_0x016b
            r5[r2] = r3
        L_0x0167:
            int r2 = r2 + 1
            r6 = 2
            goto L_0x0152
        L_0x016b:
            throw r3
        L_0x016c:
            r2 = 2
            r3 = 0
        L_0x016e:
            if (r3 >= r2) goto L_0x0190
            int r2 = r0.zzc(r3)
            boolean r6 = r4.zzf(r3)
            if (r6 != 0) goto L_0x0189
            com.google.android.gms.internal.ads.zzfqp r6 = r4.zzC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r2 = 0
            goto L_0x018c
        L_0x0189:
            r2 = 0
            r5[r3] = r2
        L_0x018c:
            int r3 = r3 + 1
            r2 = 2
            goto L_0x016e
        L_0x0190:
            r2 = 0
            com.google.android.gms.internal.ads.zzux r3 = r1.zzj
            com.google.android.gms.internal.ads.zzws r12 = r23.zzp()
            com.google.android.gms.internal.ads.zzfqk r13 = com.google.android.gms.internal.ads.zzuy.zzf(r5)
            r6 = 2
            com.google.android.gms.internal.ads.zzwe[] r14 = new com.google.android.gms.internal.ads.zzwe[r6]
            r15 = 0
        L_0x019f:
            if (r15 >= r6) goto L_0x01e8
            r6 = r5[r15]
            if (r6 == 0) goto L_0x01e0
            int[] r8 = r6.zzb
            int r7 = r8.length
            if (r7 != 0) goto L_0x01ab
            goto L_0x01e0
        L_0x01ab:
            r11 = 1
            if (r7 != r11) goto L_0x01c6
            com.google.android.gms.internal.ads.zzwf r7 = new com.google.android.gms.internal.ads.zzwf
            com.google.android.gms.internal.ads.zzcp r6 = r6.zza
            r16 = 0
            r19 = r8[r16]
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r7
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r18 = 1
            goto L_0x01dd
        L_0x01c6:
            r16 = 0
            com.google.android.gms.internal.ads.zzcp r7 = r6.zza
            r9 = 0
            java.lang.Object r6 = r13.get(r15)
            r17 = r6
            com.google.android.gms.internal.ads.zzfqk r17 = (com.google.android.gms.internal.ads.zzfqk) r17
            r6 = r3
            r10 = r12
            r18 = 1
            r11 = r17
            com.google.android.gms.internal.ads.zzuy r7 = r6.zza(r7, r8, r9, r10, r11)
        L_0x01dd:
            r14[r15] = r7
            goto L_0x01e4
        L_0x01e0:
            r16 = 0
            r18 = 1
        L_0x01e4:
            int r15 = r15 + 1
            r6 = 2
            goto L_0x019f
        L_0x01e8:
            r16 = 0
            com.google.android.gms.internal.ads.zzkp[] r3 = new com.google.android.gms.internal.ads.zzkp[r6]
            r5 = 0
        L_0x01ed:
            if (r5 >= r6) goto L_0x021a
            int r7 = r0.zzc(r5)
            boolean r8 = r4.zzf(r5)
            if (r8 != 0) goto L_0x0214
            com.google.android.gms.internal.ads.zzfqp r8 = r4.zzC
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x0206
            goto L_0x0214
        L_0x0206:
            int r7 = r0.zzc(r5)
            r8 = -2
            if (r7 == r8) goto L_0x0211
            r7 = r14[r5]
            if (r7 == 0) goto L_0x0214
        L_0x0211:
            com.google.android.gms.internal.ads.zzkp r7 = com.google.android.gms.internal.ads.zzkp.zza
            goto L_0x0215
        L_0x0214:
            r7 = r2
        L_0x0215:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x01ed
        L_0x021a:
            android.util.Pair r0 = android.util.Pair.create(r3, r14)
            return r0
        L_0x021f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x021f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwc.zzb(com.google.android.gms.internal.ads.zzwg, int[][][], int[], com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzcn):android.util.Pair");
    }

    public final zzvq zzc() {
        zzvq zzvq;
        synchronized (this.zze) {
            zzvq = this.zzg;
        }
        return zzvq;
    }

    public final void zzh() {
        zzvv zzvv;
        synchronized (this.zze) {
            if (zzew.zza >= 32 && (zzvv = this.zzh) != null) {
                zzvv.zzc();
            }
        }
        super.zzh();
    }

    public final void zzi(zzk zzk) {
        boolean z10;
        synchronized (this.zze) {
            z10 = !this.zzi.equals(zzk);
            this.zzi = zzk;
        }
        if (z10) {
            zzt();
        }
    }

    public final void zzj(zzvo zzvo) {
        boolean z10;
        zzvq zzvq = new zzvq(zzvo);
        synchronized (this.zze) {
            z10 = !this.zzg.equals(zzvq);
            this.zzg = zzvq;
        }
        if (z10) {
            if (zzvq.zzP && this.zza == null) {
                zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzr();
        }
    }

    public final boolean zzl() {
        return true;
    }

    public zzwc(Context context) {
        zzux zzux = new zzux();
        zzvq zzd2 = zzvq.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzux;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z10 = false;
        if (context != null && zzew.zzY(context)) {
            z10 = true;
        }
        this.zzf = z10;
        if (!z10 && context != null && zzew.zza >= 32) {
            this.zzh = zzvv.zza(context);
        }
        if (this.zzg.zzP && context == null) {
            zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
