package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzffb {
    private final zzeeh zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzeyp zzf;
    private final zzeyq zzg;
    private final e zzh;
    private final zzapw zzi;

    public zzffb(zzeeh zzeeh, zzbzg zzbzg, String str, String str2, Context context, zzeyp zzeyp, zzeyq zzeyq, e eVar, zzapw zzapw) {
        this.zza = zzeeh;
        this.zzb = zzbzg.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzeyp;
        this.zzg = zzeyq;
        this.zzh = eVar;
        this.zzi = zzapw;
    }

    public static final List zzf(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_mpe@", "2." + i11));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static String zzh(String str) {
        if (TextUtils.isEmpty(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        return zzbyz.zzl() ? "fakeForAdDebugLog" : str;
    }

    private static String zzi(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = MaxReward.DEFAULT_LABEL;
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzeyo zzeyo, zzeyc zzeyc, List list) {
        return zzd(zzeyo, zzeyc, false, MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, list);
    }

    public final List zzd(zzeyo zzeyo, zzeyc zzeyc, boolean z10, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            String zzi2 = zzi(zzi(zzi((String) it.next(), "@gw_adlocid@", zzeyo.zza.zza.zzf), "@gw_adnetrefresh@", true != z10 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION), "@gw_sdkver@", this.zzb);
            if (zzeyc != null) {
                zzi2 = zzbxh.zzc(zzi(zzi(zzi(zzi2, "@gw_qdata@", zzeyc.zzz), "@gw_adnetid@", zzeyc.zzy), "@gw_allocid@", zzeyc.zzx), this.zze, zzeyc.zzX);
            }
            String zzi3 = zzi(zzi(zzi(zzi2, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z12 = false;
            if (((Boolean) a0.c().zzb(zzbar.zzda)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (z12) {
                z11 = z13;
            } else if (!z13) {
                arrayList.add(zzi3);
            }
            if (this.zzi.zzf(Uri.parse(zzi3))) {
                Uri.Builder buildUpon = Uri.parse(zzi3).buildUpon();
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzi3 = buildUpon.build().toString();
            }
            arrayList.add(zzi3);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzeyc r10, java.util.List r11, com.google.android.gms.internal.ads.zzbud r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m5.e r1 = r9.zzh
            long r1 = r1.a()
            java.lang.String r3 = r12.zzc()     // Catch:{ RemoteException -> 0x00a8 }
            int r12 = r12.zzb()     // Catch:{ RemoteException -> 0x00a8 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ RemoteException -> 0x00a8 }
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzdb
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzeyq r4 = r9.zzg
            if (r4 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzfnq r4 = com.google.android.gms.internal.ads.zzfnq.zzc()
            goto L_0x003b
        L_0x0032:
            com.google.android.gms.internal.ads.zzeyp r4 = r4.zza
            goto L_0x0037
        L_0x0035:
            com.google.android.gms.internal.ads.zzeyp r4 = r9.zzf
        L_0x0037:
            com.google.android.gms.internal.ads.zzfnq r4 = com.google.android.gms.internal.ads.zzfnq.zzd(r4)
        L_0x003b:
            com.google.android.gms.internal.ads.zzfez r5 = com.google.android.gms.internal.ads.zzfez.zza
            com.google.android.gms.internal.ads.zzfnq r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzffa r7 = com.google.android.gms.internal.ads.zzffa.zza
            com.google.android.gms.internal.ads.zzfnq r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L_0x0059:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzi(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzi(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzX
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbxh.zzc(r6, r7, r8)
            r0.add(r6)
            goto L_0x0059
        L_0x00a7:
            return r0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzbza.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffb.zze(com.google.android.gms.internal.ads.zzeyc, java.util.List, com.google.android.gms.internal.ads.zzbud):java.util.List");
    }
}
