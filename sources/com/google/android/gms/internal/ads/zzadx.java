package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadx extends zzadp {
    public static final Parcelable.Creator<zzadx> CREATOR = new zzadw();
    public final String zza;
    @Deprecated
    public final String zzb;
    public final zzfqk zzc;

    public zzadx(String str, String str2, List list) {
        super(str);
        zzdl.zzd(!list.isEmpty());
        this.zza = str2;
        zzfqk zzm = zzfqk.zzm(list);
        this.zzc = zzm;
        this.zzb = (String) zzm.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadx.class == obj.getClass()) {
            zzadx zzadx = (zzadx) obj;
            return zzew.zzU(this.zzf, zzadx.zzf) && zzew.zzU(this.zza, zzadx.zza) && this.zzc.equals(zzadx.zzc);
        }
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzc);
        return str + ": description=" + str2 + ": values=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzbk r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.zzf
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            switch(r1) {
                case 82815: goto L_0x00fc;
                case 82878: goto L_0x00f1;
                case 82897: goto L_0x00e6;
                case 83253: goto L_0x00dc;
                case 83254: goto L_0x00d2;
                case 83255: goto L_0x00c7;
                case 83341: goto L_0x00bc;
                case 83378: goto L_0x00b2;
                case 83536: goto L_0x00a7;
                case 83552: goto L_0x009c;
                case 2567331: goto L_0x0091;
                case 2569357: goto L_0x0085;
                case 2569891: goto L_0x0079;
                case 2570401: goto L_0x006d;
                case 2570410: goto L_0x0061;
                case 2571565: goto L_0x0055;
                case 2575251: goto L_0x004a;
                case 2581512: goto L_0x003f;
                case 2581513: goto L_0x0034;
                case 2581514: goto L_0x0028;
                case 2583398: goto L_0x001c;
                case 2590194: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0106
        L_0x0010:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 11
            goto L_0x0107
        L_0x001c:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 9
            goto L_0x0107
        L_0x0028:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 19
            goto L_0x0107
        L_0x0034:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 5
            goto L_0x0107
        L_0x003f:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 3
            goto L_0x0107
        L_0x004a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 1
            goto L_0x0107
        L_0x0055:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 21
            goto L_0x0107
        L_0x0061:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 15
            goto L_0x0107
        L_0x006d:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 14
            goto L_0x0107
        L_0x0079:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 13
            goto L_0x0107
        L_0x0085:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 17
            goto L_0x0107
        L_0x0091:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 7
            goto L_0x0107
        L_0x009c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 10
            goto L_0x0107
        L_0x00a7:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 20
            goto L_0x0107
        L_0x00b2:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 0
            goto L_0x0107
        L_0x00bc:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 8
            goto L_0x0107
        L_0x00c7:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 18
            goto L_0x0107
        L_0x00d2:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 4
            goto L_0x0107
        L_0x00dc:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 2
            goto L_0x0107
        L_0x00e6:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 12
            goto L_0x0107
        L_0x00f1:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 16
            goto L_0x0107
        L_0x00fc:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 6
            goto L_0x0107
        L_0x0106:
            r0 = -1
        L_0x0107:
            switch(r0) {
                case 0: goto L_0x0225;
                case 1: goto L_0x0225;
                case 2: goto L_0x0219;
                case 3: goto L_0x0219;
                case 4: goto L_0x020d;
                case 5: goto L_0x020d;
                case 6: goto L_0x0201;
                case 7: goto L_0x0201;
                case 8: goto L_0x01d3;
                case 9: goto L_0x01d3;
                case 10: goto L_0x01bf;
                case 11: goto L_0x01bf;
                case 12: goto L_0x0198;
                case 13: goto L_0x0198;
                case 14: goto L_0x0164;
                case 15: goto L_0x0130;
                case 16: goto L_0x0124;
                case 17: goto L_0x0124;
                case 18: goto L_0x0118;
                case 19: goto L_0x0118;
                case 20: goto L_0x010c;
                case 21: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0230
        L_0x010c:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zzt(r0)
            return
        L_0x0118:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zzg(r0)
            return
        L_0x0124:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zzf(r0)
            return
        L_0x0130:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zzb(r0)
            int r1 = r0.size()
            if (r1 == r4) goto L_0x015a
            if (r1 == r5) goto L_0x0151
            if (r1 == r3) goto L_0x0148
            goto L_0x0230
        L_0x0148:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.zzm(r1)
        L_0x0151:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.zzn(r1)
        L_0x015a:
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.zzo(r0)
            return
        L_0x0164:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zzb(r0)
            int r1 = r0.size()
            if (r1 == r4) goto L_0x018e
            if (r1 == r5) goto L_0x0185
            if (r1 == r3) goto L_0x017c
            goto L_0x0230
        L_0x017c:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.zzj(r1)
        L_0x0185:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.zzk(r1)
        L_0x018e:
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.zzl(r0)
            return
        L_0x0198:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            java.lang.String r1 = r0.substring(r5, r2)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            java.lang.String r0 = r0.substring(r6, r5)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            r8.zzk(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
            r8.zzj(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01be }
        L_0x01be:
            return
        L_0x01bf:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc     // Catch:{ NumberFormatException -> 0x01d2 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ NumberFormatException -> 0x01d2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x01d2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01d2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01d2 }
            r8.zzl(r0)     // Catch:{ NumberFormatException -> 0x01d2 }
        L_0x01d2:
            return
        L_0x01d3:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "/"
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzew.zzah(r0, r1)
            r1 = r0[r6]     // Catch:{ NumberFormatException -> 0x0200 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0200 }
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x0200 }
            if (r2 <= r4) goto L_0x01f5
            r0 = r0[r4]     // Catch:{ NumberFormatException -> 0x0200 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0200 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0200 }
            goto L_0x01f6
        L_0x01f5:
            r0 = 0
        L_0x01f6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0200 }
            r8.zzs(r1)     // Catch:{ NumberFormatException -> 0x0200 }
            r8.zzr(r0)     // Catch:{ NumberFormatException -> 0x0200 }
        L_0x0200:
            return
        L_0x0201:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zzd(r0)
            return
        L_0x020d:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zzc(r0)
            return
        L_0x0219:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zze(r0)
            return
        L_0x0225:
            com.google.android.gms.internal.ads.zzfqk r0 = r7.zzc
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.zzq(r0)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadx.zza(com.google.android.gms.internal.ads.zzbk):void");
    }
}
