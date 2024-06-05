package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.g;
import com.google.android.gms.ads.internal.client.o3;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgi {
    private int zza;
    private s2 zzb;
    private zzbdp zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private o3 zzg;
    private Bundle zzh;
    private zzcei zzi;
    private zzcei zzj;
    private zzcei zzk;
    private a zzl;
    private View zzm;
    private zzfut zzn;
    private View zzo;
    private a zzp;
    private double zzq;
    private zzbdx zzr;
    private zzbdx zzs;
    private String zzt;
    private final g zzu = new g();
    private final g zzv = new g();
    private float zzw;
    private String zzx;

    public static zzdgi zzad(zzbnq zzbnq) {
        try {
            zzdgh zzah = zzah(zzbnq.zzg(), (zzbnu) null);
            zzbdp zzh2 = zzbnq.zzh();
            String zzo2 = zzbnq.zzo();
            List zzr2 = zzbnq.zzr();
            String zzm2 = zzbnq.zzm();
            Bundle zzf2 = zzbnq.zzf();
            String zzn2 = zzbnq.zzn();
            a zzl2 = zzbnq.zzl();
            String zzq2 = zzbnq.zzq();
            String zzp2 = zzbnq.zzp();
            double zze2 = zzbnq.zze();
            zzbdx zzi2 = zzbnq.zzi();
            zzdgi zzdgi = new zzdgi();
            zzdgi.zza = 2;
            zzdgi.zzb = zzah;
            zzdgi.zzc = zzh2;
            zzdgi.zzd = (View) zzaj(zzbnq.zzj());
            zzdgi.zzW("headline", zzo2);
            zzdgi.zze = zzr2;
            zzdgi.zzW("body", zzm2);
            zzdgi.zzh = zzf2;
            zzdgi.zzW("call_to_action", zzn2);
            zzdgi.zzm = (View) zzaj(zzbnq.zzk());
            zzdgi.zzp = zzl2;
            zzdgi.zzW("store", zzq2);
            zzdgi.zzW(InAppPurchaseMetaData.KEY_PRICE, zzp2);
            zzdgi.zzq = zze2;
            zzdgi.zzr = zzi2;
            return zzdgi;
        } catch (RemoteException e10) {
            zzbza.zzk("Failed to get native ad from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdgi zzae(zzbnr zzbnr) {
        try {
            zzdgh zzah = zzah(zzbnr.zzf(), (zzbnu) null);
            zzbdp zzg2 = zzbnr.zzg();
            String zzo2 = zzbnr.zzo();
            List zzp2 = zzbnr.zzp();
            String zzm2 = zzbnr.zzm();
            Bundle zze2 = zzbnr.zze();
            String zzn2 = zzbnr.zzn();
            a zzk2 = zzbnr.zzk();
            String zzl2 = zzbnr.zzl();
            zzbdx zzh2 = zzbnr.zzh();
            zzdgi zzdgi = new zzdgi();
            zzdgi.zza = 1;
            zzdgi.zzb = zzah;
            zzdgi.zzc = zzg2;
            zzdgi.zzd = (View) zzaj(zzbnr.zzi());
            zzdgi.zzW("headline", zzo2);
            zzdgi.zze = zzp2;
            zzdgi.zzW("body", zzm2);
            zzdgi.zzh = zze2;
            zzdgi.zzW("call_to_action", zzn2);
            zzdgi.zzm = (View) zzaj(zzbnr.zzj());
            zzdgi.zzp = zzk2;
            zzdgi.zzW("advertiser", zzl2);
            zzdgi.zzs = zzh2;
            return zzdgi;
        } catch (RemoteException e10) {
            zzbza.zzk("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static zzdgi zzaf(zzbnq zzbnq) {
        try {
            return zzai(zzah(zzbnq.zzg(), (zzbnu) null), zzbnq.zzh(), (View) zzaj(zzbnq.zzj()), zzbnq.zzo(), zzbnq.zzr(), zzbnq.zzm(), zzbnq.zzf(), zzbnq.zzn(), (View) zzaj(zzbnq.zzk()), zzbnq.zzl(), zzbnq.zzq(), zzbnq.zzp(), zzbnq.zze(), zzbnq.zzi(), (String) null, 0.0f);
        } catch (RemoteException e10) {
            zzbza.zzk("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdgi zzag(zzbnr zzbnr) {
        try {
            return zzai(zzah(zzbnr.zzf(), (zzbnu) null), zzbnr.zzg(), (View) zzaj(zzbnr.zzi()), zzbnr.zzo(), zzbnr.zzp(), zzbnr.zzm(), zzbnr.zze(), zzbnr.zzn(), (View) zzaj(zzbnr.zzj()), zzbnr.zzk(), (String) null, (String) null, -1.0d, zzbnr.zzh(), zzbnr.zzl(), 0.0f);
        } catch (RemoteException e10) {
            zzbza.zzk("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdgh zzah(s2 s2Var, zzbnu zzbnu) {
        if (s2Var == null) {
            return null;
        }
        return new zzdgh(s2Var, zzbnu);
    }

    private static zzdgi zzai(s2 s2Var, zzbdp zzbdp, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a aVar, String str4, String str5, double d10, zzbdx zzbdx, String str6, float f10) {
        zzdgi zzdgi = new zzdgi();
        zzdgi.zza = 6;
        zzdgi.zzb = s2Var;
        zzdgi.zzc = zzbdp;
        zzdgi.zzd = view;
        String str7 = str;
        zzdgi.zzW("headline", str);
        zzdgi.zze = list;
        String str8 = str2;
        zzdgi.zzW("body", str2);
        zzdgi.zzh = bundle;
        String str9 = str3;
        zzdgi.zzW("call_to_action", str3);
        zzdgi.zzm = view2;
        zzdgi.zzp = aVar;
        String str10 = str4;
        zzdgi.zzW("store", str4);
        String str11 = str5;
        zzdgi.zzW(InAppPurchaseMetaData.KEY_PRICE, str5);
        zzdgi.zzq = d10;
        zzdgi.zzr = zzbdx;
        zzdgi.zzW("advertiser", str6);
        zzdgi.zzQ(f10);
        return zzdgi;
    }

    private static Object zzaj(a aVar) {
        if (aVar == null) {
            return null;
        }
        return b.A1(aVar);
    }

    public static zzdgi zzs(zzbnu zzbnu) {
        try {
            return zzai(zzah(zzbnu.zzj(), zzbnu), zzbnu.zzk(), (View) zzaj(zzbnu.zzm()), zzbnu.zzs(), zzbnu.zzv(), zzbnu.zzq(), zzbnu.zzi(), zzbnu.zzr(), (View) zzaj(zzbnu.zzn()), zzbnu.zzo(), zzbnu.zzu(), zzbnu.zzt(), zzbnu.zze(), zzbnu.zzl(), zzbnu.zzp(), zzbnu.zzf());
        } catch (RemoteException e10) {
            zzbza.zzk("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String zzA() {
        return zzE("headline");
    }

    public final synchronized String zzB() {
        return this.zzx;
    }

    public final synchronized String zzC() {
        return zzE(InAppPurchaseMetaData.KEY_PRICE);
    }

    public final synchronized String zzD() {
        return zzE("store");
    }

    public final synchronized String zzE(String str) {
        return (String) this.zzv.get(str);
    }

    public final synchronized List zzF() {
        return this.zze;
    }

    public final synchronized List zzG() {
        return this.zzf;
    }

    public final synchronized void zzH() {
        zzcei zzcei = this.zzi;
        if (zzcei != null) {
            zzcei.destroy();
            this.zzi = null;
        }
        zzcei zzcei2 = this.zzj;
        if (zzcei2 != null) {
            zzcei2.destroy();
            this.zzj = null;
        }
        zzcei zzcei3 = this.zzk;
        if (zzcei3 != null) {
            zzcei3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzu.clear();
        this.zzv.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
    }

    public final synchronized void zzI(zzbdp zzbdp) {
        this.zzc = zzbdp;
    }

    public final synchronized void zzJ(String str) {
        this.zzt = str;
    }

    public final synchronized void zzK(o3 o3Var) {
        this.zzg = o3Var;
    }

    public final synchronized void zzL(zzbdx zzbdx) {
        this.zzr = zzbdx;
    }

    public final synchronized void zzM(String str, zzbdj zzbdj) {
        if (zzbdj == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, zzbdj);
        }
    }

    public final synchronized void zzN(zzcei zzcei) {
        this.zzj = zzcei;
    }

    public final synchronized void zzO(List list) {
        this.zze = list;
    }

    public final synchronized void zzP(zzbdx zzbdx) {
        this.zzs = zzbdx;
    }

    public final synchronized void zzQ(float f10) {
        this.zzw = f10;
    }

    public final synchronized void zzR(List list) {
        this.zzf = list;
    }

    public final synchronized void zzS(zzcei zzcei) {
        this.zzk = zzcei;
    }

    public final synchronized void zzT(zzfut zzfut) {
        this.zzn = zzfut;
    }

    public final synchronized void zzU(String str) {
        this.zzx = str;
    }

    public final synchronized void zzV(double d10) {
        this.zzq = d10;
    }

    public final synchronized void zzW(String str, String str2) {
        if (str2 == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, str2);
        }
    }

    public final synchronized void zzX(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzY(s2 s2Var) {
        this.zzb = s2Var;
    }

    public final synchronized void zzZ(View view) {
        this.zzm = view;
    }

    public final synchronized double zza() {
        return this.zzq;
    }

    public final synchronized void zzaa(zzcei zzcei) {
        this.zzi = zzcei;
    }

    public final synchronized void zzab(View view) {
        this.zzo = view;
    }

    public final synchronized void zzac(a aVar) {
        this.zzl = aVar;
    }

    public final synchronized float zzb() {
        return this.zzw;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzo;
    }

    public final synchronized g zzh() {
        return this.zzu;
    }

    public final synchronized g zzi() {
        return this.zzv;
    }

    public final synchronized s2 zzj() {
        return this.zzb;
    }

    public final synchronized o3 zzk() {
        return this.zzg;
    }

    public final synchronized zzbdp zzl() {
        return this.zzc;
    }

    public final zzbdx zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbdw.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbdx zzn() {
        return this.zzr;
    }

    public final synchronized zzbdx zzo() {
        return this.zzs;
    }

    public final synchronized zzcei zzp() {
        return this.zzj;
    }

    public final synchronized zzcei zzq() {
        return this.zzk;
    }

    public final synchronized zzcei zzr() {
        return this.zzi;
    }

    public final synchronized a zzt() {
        return this.zzp;
    }

    public final synchronized a zzu() {
        return this.zzl;
    }

    public final synchronized zzfut zzv() {
        return this.zzn;
    }

    public final synchronized String zzw() {
        return zzE("advertiser");
    }

    public final synchronized String zzx() {
        return zzE("body");
    }

    public final synchronized String zzy() {
        return zzE("call_to_action");
    }

    public final synchronized String zzz() {
        return this.zzt;
    }
}
