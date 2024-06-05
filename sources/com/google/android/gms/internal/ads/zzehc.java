package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzehc extends t0 {
    private final Context zza;
    private final h0 zzb;
    private final zzeyx zzc;
    private final zzcok zzd;
    private final ViewGroup zze;

    public zzehc(Context context, h0 h0Var, zzeyx zzeyx, zzcok zzcok) {
        this.zza = context;
        this.zzb = h0Var;
        this.zzc = zzeyx;
        this.zzd = zzcok;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzc2 = zzcok.zzc();
        t.r();
        frameLayout.addView(zzc2, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f14648c);
        frameLayout.setMinimumWidth(zzg().f14651g);
        this.zze = frameLayout;
    }

    public final void zzA() throws RemoteException {
        this.zzd.zzg();
    }

    public final void zzB() throws RemoteException {
        q.f("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc((Context) null);
    }

    public final void zzC(e0 e0Var) throws RemoteException {
        zzbza.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(h0 h0Var) throws RemoteException {
        zzbza.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(y0 y0Var) throws RemoteException {
        zzbza.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(z4 z4Var) throws RemoteException {
        q.f("setAdSize must be called on the main UI thread.");
        zzcok zzcok = this.zzd;
        if (zzcok != null) {
            zzcok.zzh(this.zze, z4Var);
        }
    }

    public final void zzG(c1 c1Var) throws RemoteException {
        zzeib zzeib = this.zzc.zzc;
        if (zzeib != null) {
            zzeib.zzi(c1Var);
        }
    }

    public final void zzH(zzavb zzavb) throws RemoteException {
    }

    public final void zzI(f5 f5Var) throws RemoteException {
    }

    public final void zzJ(j1 j1Var) {
    }

    public final void zzK(w2 w2Var) throws RemoteException {
    }

    public final void zzL(boolean z10) throws RemoteException {
    }

    public final void zzM(zzbrl zzbrl) throws RemoteException {
    }

    public final void zzN(boolean z10) throws RemoteException {
        zzbza.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbbp zzbbp) throws RemoteException {
        zzbza.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(i2 i2Var) {
        if (((Boolean) a0.c().zzb(zzbar.zzjJ)).booleanValue()) {
            zzeib zzeib = this.zzc.zzc;
            if (zzeib != null) {
                zzeib.zzg(i2Var);
                return;
            }
            return;
        }
        zzbza.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzbro zzbro, String str) throws RemoteException {
    }

    public final void zzR(String str) throws RemoteException {
    }

    public final void zzS(zzbuj zzbuj) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(n4 n4Var) throws RemoteException {
        zzbza.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(a aVar) {
    }

    public final void zzX() throws RemoteException {
    }

    public final boolean zzY() throws RemoteException {
        return false;
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa(u4 u4Var) throws RemoteException {
        zzbza.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzab(g1 g1Var) throws RemoteException {
        zzbza.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() throws RemoteException {
        zzbza.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final z4 zzg() {
        q.f("getAdSize must be called on the main UI thread.");
        return zzezb.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    public final h0 zzi() throws RemoteException {
        return this.zzb;
    }

    public final c1 zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    public final p2 zzk() {
        return this.zzd.zzl();
    }

    public final s2 zzl() throws RemoteException {
        return this.zzd.zzd();
    }

    public final a zzn() throws RemoteException {
        return b.B1(this.zze);
    }

    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    public final String zzs() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final String zzt() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final void zzx() throws RemoteException {
        q.f("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    public final void zzz() throws RemoteException {
        q.f("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb((Context) null);
    }
}
