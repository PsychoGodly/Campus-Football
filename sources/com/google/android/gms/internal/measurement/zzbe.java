package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzbe {
    private static zzaf zza(zzaf zzaf, zzh zzh, zzal zzal, Boolean bool, Boolean bool2) {
        zzaf zzaf2 = new zzaf();
        Iterator<Integer> zzg = zzaf.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzaf.zzc(intValue)) {
                zzaq zza = zzal.zza(zzh, (List<zzaq>) Arrays.asList(new zzaq[]{zzaf.zza(intValue), new zzai(Double.valueOf((double) intValue)), zzaf}));
                if (zza.zzd().equals(bool)) {
                    return zzaf2;
                }
                if (bool2 == null || zza.zzd().equals(bool2)) {
                    zzaf2.zzb(intValue, zza);
                }
            }
        }
        return zzaf2;
    }

    private static zzaf zza(zzaf zzaf, zzh zzh, zzal zzal) {
        return zza(zzaf, zzh, zzal, (Boolean) null, (Boolean) null);
    }

    public static zzaq zza(String str, zzaf zzaf, zzh zzh, List<zzaq> list) {
        String str2;
        zzal zzal;
        double d10;
        zzh zzh2;
        String str3 = str;
        zzaf zzaf2 = zzaf;
        zzh zzh3 = zzh;
        List<zzaq> list2 = list;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str3.equals("toString")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1354795244:
                if (str3.equals("concat")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1274492040:
                if (str3.equals("filter")) {
                    c10 = 2;
                    break;
                }
                break;
            case -934873754:
                if (str3.equals("reduce")) {
                    c10 = 3;
                    break;
                }
                break;
            case -895859076:
                if (str3.equals("splice")) {
                    c10 = 4;
                    break;
                }
                break;
            case -678635926:
                if (str3.equals("forEach")) {
                    c10 = 5;
                    break;
                }
                break;
            case -467511597:
                if (str3.equals("lastIndexOf")) {
                    c10 = 6;
                    break;
                }
                break;
            case -277637751:
                if (str3.equals("unshift")) {
                    c10 = 7;
                    break;
                }
                break;
            case 107868:
                if (str3.equals("map")) {
                    c10 = 8;
                    break;
                }
                break;
            case 111185:
                if (str3.equals("pop")) {
                    c10 = 9;
                    break;
                }
                break;
            case 3267882:
                if (str3.equals("join")) {
                    c10 = 10;
                    break;
                }
                break;
            case 3452698:
                if (str3.equals("push")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3536116:
                if (str3.equals("some")) {
                    c10 = 12;
                    break;
                }
                break;
            case 3536286:
                if (str3.equals("sort")) {
                    c10 = 13;
                    break;
                }
                break;
            case 96891675:
                if (str3.equals("every")) {
                    c10 = 14;
                    break;
                }
                break;
            case 109407362:
                if (str3.equals("shift")) {
                    c10 = 15;
                    break;
                }
                break;
            case 109526418:
                if (str3.equals("slice")) {
                    c10 = 16;
                    break;
                }
                break;
            case 965561430:
                if (str3.equals("reduceRight")) {
                    c10 = 17;
                    break;
                }
                break;
            case 1099846370:
                if (str3.equals("reverse")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1943291465:
                if (str3.equals("indexOf")) {
                    c10 = 19;
                    break;
                }
                break;
        }
        String str4 = "filter";
        double d11 = 0.0d;
        switch (c10) {
            case 0:
                zzaf zzaf3 = zzaf;
                zzg.zza("toString", 0, list);
                return new zzas(zzaf.toString());
            case 1:
                zzaf zzaf4 = zzaf;
                zzh zzh4 = zzh;
                List<zzaq> list3 = list;
                zzaf zzaf5 = (zzaf) zzaf.zzc();
                if (!list.isEmpty()) {
                    for (zzaq zza : list) {
                        zzaq zza2 = zzh4.zza(zza);
                        if (!(zza2 instanceof zzaj)) {
                            int zzb = zzaf5.zzb();
                            if (zza2 instanceof zzaf) {
                                zzaf zzaf6 = (zzaf) zza2;
                                Iterator<Integer> zzg = zzaf6.zzg();
                                while (zzg.hasNext()) {
                                    Integer next = zzg.next();
                                    zzaf5.zzb(next.intValue() + zzb, zzaf6.zza(next.intValue()));
                                }
                            } else {
                                zzaf5.zzb(zzb, zza2);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzaf5;
            case 2:
                zzaf zzaf7 = zzaf;
                zzh zzh5 = zzh;
                List<zzaq> list4 = list;
                zzg.zza(str4, 1, list4);
                zzaq zza3 = zzh5.zza(list4.get(0));
                if (!(zza3 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                } else if (zzaf.zza() == 0) {
                    return new zzaf();
                } else {
                    zzaf zzaf8 = (zzaf) zzaf.zzc();
                    zzaf zza4 = zza(zzaf7, zzh5, (zzar) zza3, (Boolean) null, Boolean.TRUE);
                    zzaf zzaf9 = new zzaf();
                    Iterator<Integer> zzg2 = zza4.zzg();
                    while (zzg2.hasNext()) {
                        zzaf9.zza(zzaf8.zza(zzg2.next().intValue()));
                    }
                    return zzaf9;
                }
            case 3:
                return zza(zzaf, zzh, list, true);
            case 4:
                zzaf zzaf10 = zzaf;
                zzh zzh6 = zzh;
                List<zzaq> list5 = list;
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int zza5 = (int) zzg.zza(zzh6.zza(list5.get(0)).zze().doubleValue());
                if (zza5 < 0) {
                    zza5 = Math.max(0, zza5 + zzaf.zzb());
                } else if (zza5 > zzaf.zzb()) {
                    zza5 = zzaf.zzb();
                }
                int zzb2 = zzaf.zzb();
                zzaf zzaf11 = new zzaf();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) zzg.zza(zzh6.zza(list5.get(1)).zze().doubleValue()));
                    if (max > 0) {
                        for (int i10 = zza5; i10 < Math.min(zzb2, zza5 + max); i10++) {
                            zzaf11.zza(zzaf10.zza(zza5));
                            zzaf10.zzb(zza5);
                        }
                    }
                    if (list.size() > 2) {
                        int i11 = 2;
                        while (i11 < list.size()) {
                            zzaq zza6 = zzh6.zza(list5.get(i11));
                            if (!(zza6 instanceof zzaj)) {
                                zzaf10.zza((zza5 + i11) - 2, zza6);
                                i11++;
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                    return zzaf11;
                }
                while (zza5 < zzb2) {
                    zzaf11.zza(zzaf10.zza(zza5));
                    zzaf10.zzb(zza5, (zzaq) null);
                    zza5++;
                }
                return zzaf11;
            case 5:
                zzaf zzaf12 = zzaf;
                zzh zzh7 = zzh;
                List<zzaq> list6 = list;
                zzg.zza("forEach", 1, list6);
                zzaq zza7 = zzh7.zza(list6.get(0));
                if (!(zza7 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                } else if (zzaf.zza() == 0) {
                    return zzaq.zzc;
                } else {
                    zza(zzaf12, zzh7, (zzar) zza7);
                    return zzaq.zzc;
                }
            case 6:
                zzaf zzaf13 = zzaf;
                zzh zzh8 = zzh;
                List<zzaq> list7 = list;
                zzg.zzc("lastIndexOf", 2, list7);
                zzaq zzaq = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaq = zzh8.zza(list7.get(0));
                }
                double zzb3 = (double) (zzaf.zzb() - 1);
                if (list.size() > 1) {
                    zzaq zza8 = zzh8.zza(list7.get(1));
                    if (Double.isNaN(zza8.zze().doubleValue())) {
                        zzb3 = (double) (zzaf.zzb() - 1);
                    } else {
                        zzb3 = zzg.zza(zza8.zze().doubleValue());
                    }
                    if (zzb3 < 0.0d) {
                        zzb3 += (double) zzaf.zzb();
                    }
                }
                if (zzb3 < 0.0d) {
                    return new zzai(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min((double) zzaf.zzb(), zzb3); min >= 0; min--) {
                    if (zzaf13.zzc(min) && zzg.zza(zzaf13.zza(min), zzaq)) {
                        return new zzai(Double.valueOf((double) min));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            case 7:
                zzaf zzaf14 = zzaf;
                zzh zzh9 = zzh;
                List<zzaq> list8 = list;
                if (!list.isEmpty()) {
                    zzaf zzaf15 = new zzaf();
                    for (zzaq zza9 : list) {
                        zzaq zza10 = zzh9.zza(zza9);
                        if (!(zza10 instanceof zzaj)) {
                            zzaf15.zza(zza10);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int zzb4 = zzaf15.zzb();
                    Iterator<Integer> zzg3 = zzaf.zzg();
                    while (zzg3.hasNext()) {
                        Integer next2 = zzg3.next();
                        zzaf15.zzb(next2.intValue() + zzb4, zzaf14.zza(next2.intValue()));
                    }
                    zzaf.zzj();
                    Iterator<Integer> zzg4 = zzaf15.zzg();
                    while (zzg4.hasNext()) {
                        Integer next3 = zzg4.next();
                        zzaf14.zzb(next3.intValue(), zzaf15.zza(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf((double) zzaf.zzb()));
            case 8:
                zzaf zzaf16 = zzaf;
                zzh zzh10 = zzh;
                List<zzaq> list9 = list;
                zzg.zza("map", 1, list9);
                zzaq zza11 = zzh10.zza(list9.get(0));
                if (!(zza11 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                } else if (zzaf.zzb() == 0) {
                    return new zzaf();
                } else {
                    return zza(zzaf16, zzh10, (zzar) zza11);
                }
            case 9:
                zzaf zzaf17 = zzaf;
                zzg.zza("pop", 0, list);
                int zzb5 = zzaf.zzb();
                if (zzb5 == 0) {
                    return zzaq.zzc;
                }
                int i12 = zzb5 - 1;
                zzaq zza12 = zzaf17.zza(i12);
                zzaf17.zzb(i12);
                return zza12;
            case 10:
                zzaf zzaf18 = zzaf;
                zzh zzh11 = zzh;
                List<zzaq> list10 = list;
                zzg.zzc("join", 1, list10);
                if (zzaf.zzb() == 0) {
                    return zzaq.zzj;
                }
                if (!list.isEmpty()) {
                    zzaq zza13 = zzh11.zza(list10.get(0));
                    str2 = ((zza13 instanceof zzao) || (zza13 instanceof zzax)) ? MaxReward.DEFAULT_LABEL : zza13.zzf();
                } else {
                    str2 = ",";
                }
                return new zzas(zzaf18.zzb(str2));
            case 11:
                zzaf zzaf19 = zzaf;
                zzh zzh12 = zzh;
                List<zzaq> list11 = list;
                if (!list.isEmpty()) {
                    for (zzaq zza14 : list) {
                        zzaf19.zza(zzh12.zza(zza14));
                    }
                }
                return new zzai(Double.valueOf((double) zzaf.zzb()));
            case 12:
                zzaf zzaf20 = zzaf;
                zzh zzh13 = zzh;
                List<zzaq> list12 = list;
                zzg.zza("some", 1, list12);
                zzaq zza15 = zzh13.zza(list12.get(0));
                if (zza15 instanceof zzal) {
                    if (zzaf.zzb() != 0) {
                        zzal zzal2 = (zzal) zza15;
                        Iterator<Integer> zzg5 = zzaf.zzg();
                        while (zzg5.hasNext()) {
                            int intValue = zzg5.next().intValue();
                            if (zzaf20.zzc(intValue)) {
                                if (zzal2.zza(zzh13, (List<zzaq>) Arrays.asList(new zzaq[]{zzaf20.zza(intValue), new zzai(Double.valueOf((double) intValue)), zzaf20})).zzd().booleanValue()) {
                                    return zzaq.zzh;
                                }
                            }
                        }
                    }
                    return zzaq.zzi;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 13:
                zzaf zzaf21 = zzaf;
                zzh zzh14 = zzh;
                List<zzaq> list13 = list;
                zzg.zzc("sort", 1, list13);
                if (zzaf.zzb() >= 2) {
                    List<zzaq> zzi = zzaf.zzi();
                    if (!list.isEmpty()) {
                        zzaq zza16 = zzh14.zza(list13.get(0));
                        if (zza16 instanceof zzal) {
                            zzal = (zzal) zza16;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        zzal = null;
                    }
                    Collections.sort(zzi, new zzbh(zzal, zzh14));
                    zzaf.zzj();
                    int i13 = 0;
                    for (zzaq zzb6 : zzi) {
                        zzaf21.zzb(i13, zzb6);
                        i13++;
                    }
                }
                return zzaf21;
            case 14:
                zzaf zzaf22 = zzaf;
                zzh zzh15 = zzh;
                List<zzaq> list14 = list;
                zzg.zza("every", 1, list14);
                zzaq zza17 = zzh15.zza(list14.get(0));
                if (!(zza17 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                } else if (zzaf.zzb() == 0 || zza(zzaf22, zzh15, (zzar) zza17, Boolean.FALSE, Boolean.TRUE).zzb() == zzaf.zzb()) {
                    return zzaq.zzh;
                } else {
                    return zzaq.zzi;
                }
            case 15:
                zzaf zzaf23 = zzaf;
                zzg.zza("shift", 0, list);
                if (zzaf.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zza18 = zzaf23.zza(0);
                zzaf23.zzb(0);
                return zza18;
            case 16:
                zzaf zzaf24 = zzaf;
                zzh zzh16 = zzh;
                List<zzaq> list15 = list;
                zzg.zzc("slice", 2, list15);
                if (list.isEmpty()) {
                    return zzaf.zzc();
                }
                double zzb7 = (double) zzaf.zzb();
                double zza19 = zzg.zza(zzh16.zza(list15.get(0)).zze().doubleValue());
                if (zza19 < 0.0d) {
                    d10 = Math.max(zza19 + zzb7, 0.0d);
                } else {
                    d10 = Math.min(zza19, zzb7);
                }
                if (list.size() == 2) {
                    double zza20 = zzg.zza(zzh16.zza(list15.get(1)).zze().doubleValue());
                    if (zza20 < 0.0d) {
                        zzb7 = Math.max(zzb7 + zza20, 0.0d);
                    } else {
                        zzb7 = Math.min(zzb7, zza20);
                    }
                }
                zzaf zzaf25 = new zzaf();
                for (int i14 = (int) d10; ((double) i14) < zzb7; i14++) {
                    zzaf25.zza(zzaf24.zza(i14));
                }
                return zzaf25;
            case 17:
                return zza(zzaf, zzh, list, false);
            case 18:
                zzaf zzaf26 = zzaf;
                zzg.zza("reverse", 0, list);
                int zzb8 = zzaf.zzb();
                if (zzb8 != 0) {
                    for (int i15 = 0; i15 < zzb8 / 2; i15++) {
                        if (zzaf26.zzc(i15)) {
                            zzaq zza21 = zzaf26.zza(i15);
                            zzaf26.zzb(i15, (zzaq) null);
                            int i16 = (zzb8 - 1) - i15;
                            if (zzaf26.zzc(i16)) {
                                zzaf26.zzb(i15, zzaf26.zza(i16));
                            }
                            zzaf26.zzb(i16, zza21);
                        }
                    }
                }
                return zzaf26;
            case 19:
                List<zzaq> list16 = list;
                zzg.zzc("indexOf", 2, list16);
                zzaq zzaq2 = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzh2 = zzh;
                    zzaq2 = zzh2.zza(list16.get(0));
                } else {
                    zzh2 = zzh;
                }
                if (list.size() > 1) {
                    double zza22 = zzg.zza(zzh2.zza(list16.get(1)).zze().doubleValue());
                    if (zza22 >= ((double) zzaf.zzb())) {
                        return new zzai(Double.valueOf(-1.0d));
                    }
                    d11 = zza22 < 0.0d ? ((double) zzaf.zzb()) + zza22 : zza22;
                }
                Iterator<Integer> zzg6 = zzaf.zzg();
                while (zzg6.hasNext()) {
                    int intValue2 = zzg6.next().intValue();
                    double d12 = (double) intValue2;
                    zzaf zzaf27 = zzaf;
                    if (d12 >= d11 && zzg.zza(zzaf27.zza(intValue2), zzaq2)) {
                        return new zzai(Double.valueOf(d12));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.zzaq zza(com.google.android.gms.internal.measurement.zzaf r9, com.google.android.gms.internal.measurement.zzh r10, java.util.List<com.google.android.gms.internal.measurement.zzaq> r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zzb((java.lang.String) r0, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r11)
            r2 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r10.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzal
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.zzaq r11 = (com.google.android.gms.internal.measurement.zzaq) r11
            com.google.android.gms.internal.measurement.zzaq r11 = r10.zza((com.google.android.gms.internal.measurement.zzaq) r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            r11 = 0
            int r4 = r9.zzb()
            if (r4 == 0) goto L_0x0098
        L_0x003d:
            com.google.android.gms.internal.measurement.zzal r3 = (com.google.android.gms.internal.measurement.zzal) r3
            int r4 = r9.zzb()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            if (r12 == 0) goto L_0x004d
            int r4 = r4 - r1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r12 == 0) goto L_0x0052
            r12 = 1
            goto L_0x0053
        L_0x0052:
            r12 = -1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzaq r11 = r9.zza((int) r5)
            goto L_0x0095
        L_0x005a:
            int r6 = r4 - r5
            int r6 = r6 * r12
            if (r6 < 0) goto L_0x0097
            boolean r6 = r9.zzc((int) r5)
            if (r6 == 0) goto L_0x0095
            r6 = 4
            com.google.android.gms.internal.measurement.zzaq[] r6 = new com.google.android.gms.internal.measurement.zzaq[r6]
            r6[r0] = r11
            com.google.android.gms.internal.measurement.zzaq r11 = r9.zza((int) r5)
            r6[r1] = r11
            com.google.android.gms.internal.measurement.zzai r11 = new com.google.android.gms.internal.measurement.zzai
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r6[r2] = r11
            r11 = 3
            r6[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.zzaq r11 = r3.zza((com.google.android.gms.internal.measurement.zzh) r10, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r11)
            boolean r6 = r11 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r6 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r12
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbe.zza(com.google.android.gms.internal.measurement.zzaf, com.google.android.gms.internal.measurement.zzh, java.util.List, boolean):com.google.android.gms.internal.measurement.zzaq");
    }
}
