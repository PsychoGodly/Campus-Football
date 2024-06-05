package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzccb extends zzcap implements TextureView.SurfaceTextureListener, zzcaz {
    private final zzcbj zzd;
    private final zzcbk zze;
    private final zzcbi zzf;
    private zzcao zzg;
    private Surface zzh;
    private zzcba zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm = 1;
    private zzcbh zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzccb(Context context, zzcbk zzcbk, zzcbj zzcbj, boolean z10, boolean z11, zzcbi zzcbi, Integer num) {
        super(context, num);
        this.zzd = zzcbj;
        this.zze = zzcbk;
        this.zzo = z10;
        this.zzf = zzcbi;
        setSurfaceTextureListener(this);
        zzcbk.zza(this);
    }

    private static String zzS(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + canonicalName + ":" + message;
    }

    private final void zzT() {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzO(true);
        }
    }

    private final void zzU() {
        if (!this.zzp) {
            this.zzp = true;
            b2.f14773i.post(new zzcbw(this));
            zzn();
            this.zze.zzb();
            if (this.zzq) {
                zzp();
            }
        }
    }

    private final void zzV(boolean z10) {
        zzcba zzcba = this.zzi;
        if ((zzcba == null || z10) && this.zzj != null && this.zzh != null) {
            if (z10) {
                if (zzac()) {
                    zzcba.zzS();
                    zzX();
                } else {
                    zzbza.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzj.startsWith("cache:")) {
                zzccu zzp2 = this.zzd.zzp(this.zzj);
                if (zzp2 instanceof zzcdd) {
                    zzcba zza = ((zzcdd) zzp2).zza();
                    this.zzi = zza;
                    if (!zza.zzT()) {
                        zzbza.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp2 instanceof zzcda) {
                    zzcda zzcda = (zzcda) zzp2;
                    String zzE = zzE();
                    ByteBuffer zzk2 = zzcda.zzk();
                    boolean zzl2 = zzcda.zzl();
                    String zzi2 = zzcda.zzi();
                    if (zzi2 == null) {
                        zzbza.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcba zzD = zzD();
                    this.zzi = zzD;
                    zzD.zzF(new Uri[]{Uri.parse(zzi2)}, zzE, zzk2, zzl2);
                } else {
                    zzbza.zzj("Stream cache miss: ".concat(String.valueOf(this.zzj)));
                    return;
                }
            } else {
                this.zzi = zzD();
                String zzE2 = zzE();
                Uri[] uriArr = new Uri[this.zzk.length];
                int i10 = 0;
                while (true) {
                    String[] strArr = this.zzk;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
                }
                this.zzi.zzE(uriArr, zzE2);
            }
            this.zzi.zzK(this);
            zzY(this.zzh, false);
            if (this.zzi.zzT()) {
                int zzt2 = this.zzi.zzt();
                this.zzm = zzt2;
                if (zzt2 == 3) {
                    zzU();
                }
            }
        }
    }

    private final void zzW() {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzO(false);
        }
    }

    private final void zzX() {
        if (this.zzi != null) {
            zzY((Surface) null, true);
            zzcba zzcba = this.zzi;
            if (zzcba != null) {
                zzcba.zzK((zzcaz) null);
                this.zzi.zzG();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzY(Surface surface, boolean z10) {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            try {
                zzcba.zzQ(surface, z10);
            } catch (IOException e10) {
                zzbza.zzk(MaxReward.DEFAULT_LABEL, e10);
            }
        } else {
            zzbza.zzj("Trying to set surface before player is initialized.");
        }
    }

    private final void zzZ() {
        zzaa(this.zzr, this.zzs);
    }

    private final void zzaa(int i10, int i11) {
        float f10 = i11 > 0 ? ((float) i10) / ((float) i11) : 1.0f;
        if (this.zzt != f10) {
            this.zzt = f10;
            requestLayout();
        }
    }

    private final boolean zzab() {
        return zzac() && this.zzm != 1;
    }

    private final boolean zzac() {
        zzcba zzcba = this.zzi;
        return zzcba != null && zzcba.zzT() && !this.zzl;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzt;
        if (f10 != 0.0f && this.zzn == null) {
            float f11 = (float) measuredWidth;
            float f12 = f11 / ((float) measuredHeight);
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (((float) measuredHeight) * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbh zzcbh = this.zzn;
        if (zzcbh != null) {
            zzcbh.zzc(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzo) {
            zzcbh zzcbh = new zzcbh(getContext());
            this.zzn = zzcbh;
            zzcbh.zzd(surfaceTexture, i10, i11);
            this.zzn.start();
            SurfaceTexture zzb = this.zzn.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false);
        } else {
            zzY(surface, true);
            if (!this.zzf.zza) {
                zzT();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzaa(i10, i11);
        } else {
            zzZ();
        }
        b2.f14773i.post(new zzcbv(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbh zzcbh = this.zzn;
        if (zzcbh != null) {
            zzcbh.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzW();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzY((Surface) null, true);
        }
        b2.f14773i.post(new zzcbz(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzcbh zzcbh = this.zzn;
        if (zzcbh != null) {
            zzcbh.zzc(i10, i11);
        }
        b2.f14773i.post(new zzcbp(this, i10, i11));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i10) {
        n1.a("AdExoPlayerView3 window visibility changed to " + i10);
        b2.f14773i.post(new zzcby(this, i10));
        super.onWindowVisibilityChanged(i10);
    }

    public final void zzA(int i10) {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzP(i10);
        }
    }

    public final void zzB(String str, String[] strArr) {
        if (str != null) {
            boolean z10 = true;
            if (strArr == null) {
                this.zzk = new String[]{str};
            } else {
                this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.zzj;
            if (!this.zzf.zzl || str2 == null || str.equals(str2) || this.zzm != 4) {
                z10 = false;
            }
            this.zzj = str;
            zzV(z10);
        }
    }

    public final void zzC(int i10, int i11) {
        this.zzr = i10;
        this.zzs = i11;
        zzZ();
    }

    /* access modifiers changed from: package-private */
    public final zzcba zzD() {
        zzcdv zzcdv = new zzcdv(this.zzd.getContext(), this.zzf, this.zzd);
        zzbza.zzi("ExoPlayerAdapter initialized.");
        return zzcdv;
    }

    /* access modifiers changed from: package-private */
    public final String zzE() {
        return t.r().B(this.zzd.getContext(), this.zzd.zzn().zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(String str) {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zza();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(boolean z10, long j10) {
        this.zzd.zzv(z10, j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(String str) {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzK() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzi();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN(int i10, int i11) {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzj(i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzO() {
        float zza = this.zzb.zza();
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            try {
                zzcba.zzR(zza, false);
            } catch (IOException e10) {
                zzbza.zzk(MaxReward.DEFAULT_LABEL, e10);
            }
        } else {
            zzbza.zzj("Trying to set volume before player is initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzP(int i10) {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.onWindowVisibilityChanged(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzcao zzcao = this.zzg;
        if (zzcao != null) {
            zzcao.zze();
        }
    }

    public final int zza() {
        if (zzab()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            return zzcba.zzr();
        }
        return -1;
    }

    public final int zzc() {
        if (zzab()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzs;
    }

    public final int zze() {
        return this.zzr;
    }

    public final long zzf() {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            return zzcba.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            return zzcba.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            return zzcba.zzB();
        }
        return -1;
    }

    public final void zzi(boolean z10, long j10) {
        if (this.zzd != null) {
            zzbzn.zze.execute(new zzcbx(this, z10, j10));
        }
    }

    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzo ? MaxReward.DEFAULT_LABEL : " spherical");
    }

    public final void zzk(String str, Exception exc) {
        String zzS = zzS(str, exc);
        zzbza.zzj("ExoPlayerAdapter error: ".concat(zzS));
        this.zzl = true;
        if (this.zzf.zza) {
            zzW();
        }
        b2.f14773i.post(new zzcbo(this, zzS));
        t.q().zzt(exc, "AdExoPlayerView.onError");
    }

    public final void zzl(String str, Exception exc) {
        String zzS = zzS("onLoadException", exc);
        zzbza.zzj("ExoPlayerAdapter exception: ".concat(zzS));
        t.q().zzt(exc, "AdExoPlayerView.onException");
        b2.f14773i.post(new zzcbr(this, zzS));
    }

    public final void zzm(int i10) {
        if (this.zzm != i10) {
            this.zzm = i10;
            if (i10 == 3) {
                zzU();
            } else if (i10 == 4) {
                if (this.zzf.zza) {
                    zzW();
                }
                this.zze.zze();
                this.zzb.zzc();
                b2.f14773i.post(new zzcbu(this));
            }
        }
    }

    public final void zzn() {
        b2.f14773i.post(new zzcbs(this));
    }

    public final void zzo() {
        if (zzab()) {
            if (this.zzf.zza) {
                zzW();
            }
            this.zzi.zzN(false);
            this.zze.zze();
            this.zzb.zzc();
            b2.f14773i.post(new zzcbt(this));
        }
    }

    public final void zzp() {
        if (zzab()) {
            if (this.zzf.zza) {
                zzT();
            }
            this.zzi.zzN(true);
            this.zze.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            b2.f14773i.post(new zzcbq(this));
            return;
        }
        this.zzq = true;
    }

    public final void zzq(int i10) {
        if (zzab()) {
            this.zzi.zzH((long) i10);
        }
    }

    public final void zzr(zzcao zzcao) {
        this.zzg = zzcao;
    }

    public final void zzs(String str) {
        if (str != null) {
            zzB(str, (String[]) null);
        }
    }

    public final void zzt() {
        if (zzac()) {
            this.zzi.zzS();
            zzX();
        }
        this.zze.zze();
        this.zzb.zzc();
        this.zze.zzd();
    }

    public final void zzu(float f10, float f11) {
        zzcbh zzcbh = this.zzn;
        if (zzcbh != null) {
            zzcbh.zzf(f10, f11);
        }
    }

    public final void zzv() {
        b2.f14773i.post(new zzcca(this));
    }

    public final void zzw(int i10) {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzI(i10);
        }
    }

    public final void zzx(int i10) {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzJ(i10);
        }
    }

    public final void zzy(int i10) {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzL(i10);
        }
    }

    public final void zzz(int i10) {
        zzcba zzcba = this.zzi;
        if (zzcba != null) {
            zzcba.zzM(i10);
        }
    }
}
