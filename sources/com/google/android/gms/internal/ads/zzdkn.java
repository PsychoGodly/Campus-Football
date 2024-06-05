package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.g;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdkn extends zzbeq {
    private final Context zza;
    private final zzdgi zzb;
    private zzdhi zzc;
    /* access modifiers changed from: private */
    public zzdgd zzd;

    public zzdkn(Context context, zzdgi zzdgi, zzdhi zzdhi, zzdgd zzdgd) {
        this.zza = context;
        this.zzb = zzdgi;
        this.zzc = zzdhi;
        this.zzd = zzdgd;
    }

    public final s2 zze() {
        return this.zzb.zzj();
    }

    public final zzbdu zzf() throws RemoteException {
        return this.zzd.zzc().zza();
    }

    public final zzbdx zzg(String str) {
        return (zzbdx) this.zzb.zzh().get(str);
    }

    public final a zzh() {
        return b.B1(this.zza);
    }

    public final String zzi() {
        return this.zzb.zzz();
    }

    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    public final List zzk() {
        g zzh = this.zzb.zzh();
        g zzi = this.zzb.zzi();
        String[] strArr = new String[(zzh.size() + zzi.size())];
        int i10 = 0;
        for (int i11 = 0; i11 < zzh.size(); i11++) {
            strArr[i10] = (String) zzh.j(i11);
            i10++;
        }
        for (int i12 = 0; i12 < zzi.size(); i12++) {
            strArr[i10] = (String) zzi.j(i12);
            i10++;
        }
        return Arrays.asList(strArr);
    }

    public final void zzl() {
        zzdgd zzdgd = this.zzd;
        if (zzdgd != null) {
            zzdgd.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final void zzm() {
        String zzB = this.zzb.zzB();
        if ("Google".equals(zzB)) {
            zzbza.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzB)) {
            zzbza.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdgd zzdgd = this.zzd;
            if (zzdgd != null) {
                zzdgd.zzt(zzB, false);
            }
        }
    }

    public final void zzn(String str) {
        zzdgd zzdgd = this.zzd;
        if (zzdgd != null) {
            zzdgd.zzE(str);
        }
    }

    public final void zzo() {
        zzdgd zzdgd = this.zzd;
        if (zzdgd != null) {
            zzdgd.zzH();
        }
    }

    public final void zzp(a aVar) {
        zzdgd zzdgd;
        Object A1 = b.A1(aVar);
        if ((A1 instanceof View) && this.zzb.zzu() != null && (zzdgd = this.zzd) != null) {
            zzdgd.zzI((View) A1);
        }
    }

    public final boolean zzq() {
        zzdgd zzdgd = this.zzd;
        if ((zzdgd == null || zzdgd.zzV()) && this.zzb.zzq() != null && this.zzb.zzr() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzr(a aVar) {
        zzdhi zzdhi;
        Object A1 = b.A1(aVar);
        if (!(A1 instanceof ViewGroup) || (zzdhi = this.zzc) == null || !zzdhi.zzf((ViewGroup) A1)) {
            return false;
        }
        this.zzb.zzr().zzao(new zzdkm(this));
        return true;
    }

    public final boolean zzs() {
        a zzu = this.zzb.zzu();
        if (zzu != null) {
            t.a().zzd(zzu);
            if (this.zzb.zzq() == null) {
                return true;
            }
            this.zzb.zzq().zzd("onSdkLoaded", new androidx.collection.a());
            return true;
        }
        zzbza.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
