package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaf {
    private static final zzaf zzG = new zzaf(new zzad());
    private static final String zzH = zzew.zzP(0);
    private static final String zzI = zzew.zzP(1);
    private static final String zzJ = zzew.zzP(2);
    private static final String zzK = zzew.zzP(3);
    private static final String zzL = zzew.zzP(4);
    private static final String zzM = zzew.zzP(5);
    private static final String zzN = zzew.zzP(6);
    private static final String zzO = zzew.zzP(7);
    private static final String zzP = zzew.zzP(8);
    private static final String zzQ = zzew.zzP(9);
    private static final String zzR = zzew.zzP(10);
    private static final String zzS = zzew.zzP(11);
    private static final String zzT = zzew.zzP(12);
    private static final String zzU = zzew.zzP(13);
    private static final String zzV = zzew.zzP(14);
    private static final String zzW = zzew.zzP(15);
    private static final String zzX = zzew.zzP(16);
    private static final String zzY = zzew.zzP(17);
    private static final String zzZ = zzew.zzP(18);
    public static final zzn zza = zzab.zza;
    private static final String zzaa = zzew.zzP(19);
    private static final String zzab = zzew.zzP(20);
    private static final String zzac = zzew.zzP(21);
    private static final String zzad = zzew.zzP(22);
    private static final String zzae = zzew.zzP(23);
    private static final String zzaf = zzew.zzP(24);
    private static final String zzag = zzew.zzP(25);
    private static final String zzah = zzew.zzP(26);
    private static final String zzai = zzew.zzP(27);
    private static final String zzaj = zzew.zzP(28);
    private static final String zzak = zzew.zzP(29);
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzal;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbq zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzx zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzq zzy;
    public final int zzz;

    private zzaf(zzad zzad2) {
        this.zzb = zzad2.zza;
        this.zzc = zzad2.zzb;
        this.zzd = zzew.zzQ(zzad2.zzc);
        this.zze = zzad2.zzd;
        int i10 = 0;
        this.zzf = 0;
        int zzd2 = zzad2.zze;
        this.zzg = zzd2;
        int zzl2 = zzad2.zzf;
        this.zzh = zzl2;
        this.zzi = zzl2 != -1 ? zzl2 : zzd2;
        this.zzj = zzad2.zzg;
        this.zzk = zzad2.zzh;
        this.zzl = zzad2.zzi;
        this.zzm = zzad2.zzj;
        this.zzn = zzad2.zzk;
        this.zzo = zzad2.zzl == null ? Collections.emptyList() : zzad2.zzl;
        zzx zzt2 = zzad2.zzm;
        this.zzp = zzt2;
        this.zzq = zzad2.zzn;
        this.zzr = zzad2.zzo;
        this.zzs = zzad2.zzp;
        this.zzt = zzad2.zzq;
        this.zzu = zzad2.zzr == -1 ? 0 : zzad2.zzr;
        this.zzv = zzad2.zzs == -1.0f ? 1.0f : zzad2.zzs;
        this.zzw = zzad2.zzt;
        this.zzx = zzad2.zzu;
        this.zzy = zzad2.zzv;
        this.zzz = zzad2.zzw;
        this.zzA = zzad2.zzx;
        this.zzB = zzad2.zzy;
        this.zzC = zzad2.zzz == -1 ? 0 : zzad2.zzz;
        this.zzD = zzad2.zzA != -1 ? zzad2.zzA : i10;
        this.zzE = zzad2.zzB;
        this.zzF = (zzad2.zzC != 0 || zzt2 == null) ? zzad2.zzC : 1;
    }

    public static String zzd(zzaf zzaf2) {
        if (zzaf2 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(zzaf2.zzb);
        sb2.append(", mimeType=");
        sb2.append(zzaf2.zzm);
        if (zzaf2.zzi != -1) {
            sb2.append(", bitrate=");
            sb2.append(zzaf2.zzi);
        }
        if (zzaf2.zzj != null) {
            sb2.append(", codecs=");
            sb2.append(zzaf2.zzj);
        }
        if (zzaf2.zzp != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                zzx zzx2 = zzaf2.zzp;
                if (i10 >= zzx2.zzb) {
                    break;
                }
                UUID uuid = zzx2.zza(i10).zza;
                if (uuid.equals(zzo.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzo.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzo.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzo.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzo.zza)) {
                    linkedHashSet.add("universal");
                } else {
                    String obj = uuid.toString();
                    linkedHashSet.add("unknown (" + obj + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            zzfnk.zzb(sb2, linkedHashSet, ",");
            sb2.append(']');
        }
        if (!(zzaf2.zzr == -1 || zzaf2.zzs == -1)) {
            sb2.append(", res=");
            sb2.append(zzaf2.zzr);
            sb2.append("x");
            sb2.append(zzaf2.zzs);
        }
        if (zzaf2.zzt != -1.0f) {
            sb2.append(", fps=");
            sb2.append(zzaf2.zzt);
        }
        if (zzaf2.zzz != -1) {
            sb2.append(", channels=");
            sb2.append(zzaf2.zzz);
        }
        if (zzaf2.zzA != -1) {
            sb2.append(", sample_rate=");
            sb2.append(zzaf2.zzA);
        }
        if (zzaf2.zzd != null) {
            sb2.append(", language=");
            sb2.append(zzaf2.zzd);
        }
        if (zzaf2.zzc != null) {
            sb2.append(", label=");
            sb2.append(zzaf2.zzc);
        }
        if (zzaf2.zze != 0) {
            ArrayList arrayList = new ArrayList();
            if ((zzaf2.zze & 1) != 0) {
                arrayList.add("default");
            }
            if ((zzaf2.zze & 2) != 0) {
                arrayList.add("forced");
            }
            sb2.append(", selectionFlags=[");
            zzfnk.zzb(sb2, arrayList, ",");
            sb2.append("]");
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaf.class == obj.getClass()) {
            zzaf zzaf2 = (zzaf) obj;
            int i11 = this.zzal;
            if ((i11 == 0 || (i10 = zzaf2.zzal) == 0 || i11 == i10) && this.zze == zzaf2.zze && this.zzg == zzaf2.zzg && this.zzh == zzaf2.zzh && this.zzn == zzaf2.zzn && this.zzq == zzaf2.zzq && this.zzr == zzaf2.zzr && this.zzs == zzaf2.zzs && this.zzu == zzaf2.zzu && this.zzx == zzaf2.zzx && this.zzz == zzaf2.zzz && this.zzA == zzaf2.zzA && this.zzB == zzaf2.zzB && this.zzC == zzaf2.zzC && this.zzD == zzaf2.zzD && this.zzE == zzaf2.zzE && this.zzF == zzaf2.zzF && Float.compare(this.zzt, zzaf2.zzt) == 0 && Float.compare(this.zzv, zzaf2.zzv) == 0 && zzew.zzU(this.zzb, zzaf2.zzb) && zzew.zzU(this.zzc, zzaf2.zzc) && zzew.zzU(this.zzj, zzaf2.zzj) && zzew.zzU(this.zzl, zzaf2.zzl) && zzew.zzU(this.zzm, zzaf2.zzm) && zzew.zzU(this.zzd, zzaf2.zzd) && Arrays.equals(this.zzw, zzaf2.zzw) && zzew.zzU(this.zzk, zzaf2.zzk) && zzew.zzU(this.zzy, zzaf2.zzy) && zzew.zzU(this.zzp, zzaf2.zzp) && zze(zzaf2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.zzal;
        if (i15 != 0) {
            return i15;
        }
        String str = this.zzb;
        int i16 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        String str2 = this.zzc;
        int hashCode = str2 != null ? str2.hashCode() : 0;
        int i17 = i10 + 527;
        String str3 = this.zzd;
        if (str3 == null) {
            i11 = 0;
        } else {
            i11 = str3.hashCode();
        }
        int i18 = (((((((((i17 * 31) + hashCode) * 31) + i11) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
        String str4 = this.zzj;
        if (str4 == null) {
            i12 = 0;
        } else {
            i12 = str4.hashCode();
        }
        int i19 = ((i18 * 31) + i12) * 31;
        zzbq zzbq = this.zzk;
        if (zzbq == null) {
            i13 = 0;
        } else {
            i13 = zzbq.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        String str5 = this.zzl;
        if (str5 == null) {
            i14 = 0;
        } else {
            i14 = str5.hashCode();
        }
        int i21 = (i20 + i14) * 31;
        String str6 = this.zzm;
        if (str6 != null) {
            i16 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((i21 + i16) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
        this.zzal = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i10 = this.zzi;
        String str6 = this.zzd;
        int i11 = this.zzr;
        int i12 = this.zzs;
        float f10 = this.zzt;
        int i13 = this.zzz;
        int i14 = this.zzA;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i10 + ", " + str6 + ", [" + i11 + ", " + i12 + ", " + f10 + "], [" + i13 + ", " + i14 + "])";
    }

    public final int zza() {
        int i10;
        int i11 = this.zzr;
        if (i11 == -1 || (i10 = this.zzs) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzad zzb() {
        return new zzad(this, (zzac) null);
    }

    public final zzaf zzc(int i10) {
        zzad zzad2 = new zzad(this, (zzac) null);
        zzad2.zzA(i10);
        return new zzaf(zzad2);
    }

    public final boolean zze(zzaf zzaf2) {
        if (this.zzo.size() != zzaf2.zzo.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i10), (byte[]) zzaf2.zzo.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
