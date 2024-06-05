package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zziy implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzyp, zzoc, zzuu, zzrs, zzgy, zzgu, zzku, zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjc zza;

    /* synthetic */ zziy(zzjc zzjc, zzix zzix) {
        this.zza = zzjc;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjc.zzW(this.zza, surfaceTexture);
        this.zza.zzao(i10, i11);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzar((Object) null);
        this.zza.zzao(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zza.zzao(i10, i11);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.zza.zzao(i11, i12);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzao(0, 0);
    }

    public final void zza(boolean z10) {
        this.zza.zzav();
    }

    public final void zzb(Exception exc) {
        this.zza.zzr.zzy(exc);
    }

    public final void zzc(String str, long j10, long j11) {
        this.zza.zzr.zzz(str, j10, j11);
    }

    public final void zzd(String str) {
        this.zza.zzr.zzA(str);
    }

    public final void zze(zzhb zzhb) {
        this.zza.zzr.zzB(zzhb);
        this.zza.zzM = null;
        this.zza.zzT = null;
    }

    public final void zzf(zzhb zzhb) {
        this.zza.zzT = zzhb;
        this.zza.zzr.zzC(zzhb);
    }

    public final void zzg(zzaf zzaf, zzhc zzhc) {
        this.zza.zzM = zzaf;
        this.zza.zzr.zzD(zzaf, zzhc);
    }

    public final void zzh(long j10) {
        this.zza.zzr.zzE(j10);
    }

    public final void zzi(Exception exc) {
        this.zza.zzr.zzF(exc);
    }

    public final void zzj(int i10, long j10, long j11) {
        this.zza.zzr.zzG(i10, j10, j11);
    }

    public final void zzk(int i10, long j10) {
        this.zza.zzr.zzH(i10, j10);
    }

    public final void zzl(Object obj, long j10) {
        this.zza.zzr.zzI(obj, j10);
        zzjc zzjc = this.zza;
        if (zzjc.zzO == obj) {
            zzeb zzI = zzjc.zzl;
            zzI.zzd(26, zzis.zza);
            zzI.zzc();
        }
    }

    public final void zzm(boolean z10) {
        zzjc zzjc = this.zza;
        if (zzjc.zzX != z10) {
            zzjc.zzX = z10;
            zzeb zzI = this.zza.zzl;
            zzI.zzd(23, new zziv(z10));
            zzI.zzc();
        }
    }

    public final void zzn(Exception exc) {
        this.zza.zzr.zzJ(exc);
    }

    public final void zzo(String str, long j10, long j11) {
        this.zza.zzr.zzK(str, j10, j11);
    }

    public final void zzp(String str) {
        this.zza.zzr.zzL(str);
    }

    public final void zzq(zzhb zzhb) {
        this.zza.zzr.zzM(zzhb);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    public final void zzr(zzhb zzhb) {
        this.zza.zzS = zzhb;
        this.zza.zzr.zzN(zzhb);
    }

    public final void zzs(long j10, int i10) {
        this.zza.zzr.zzO(j10, i10);
    }

    public final void zzt(zzaf zzaf, zzhc zzhc) {
        this.zza.zzL = zzaf;
        this.zza.zzr.zzP(zzaf, zzhc);
    }

    public final void zzu(zzda zzda) {
        this.zza.zzac = zzda;
        zzeb zzI = this.zza.zzl;
        zzI.zzd(25, new zziw(zzda));
        zzI.zzc();
    }
}
