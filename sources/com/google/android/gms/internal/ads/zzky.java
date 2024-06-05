package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzky {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Handler zzb;
    private final zzku zzc;
    private final AudioManager zzd;
    private zzkx zze;
    private int zzf = 3;
    private int zzg;
    private boolean zzh;

    public zzky(Context context, Handler handler, zzku zzku) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzku;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        zzdl.zzb(audioManager);
        this.zzd = audioManager;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzkx zzkx = new zzkx(this, (zzkw) null);
        try {
            zzew.zzA(applicationContext, zzkx, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzkx;
        } catch (RuntimeException e10) {
            zzee.zzf("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static int zzg(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            zzee.zzf("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        int zzg2 = zzg(this.zzd, this.zzf);
        boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg != zzg2 || this.zzh != zzi) {
            this.zzg = zzg2;
            this.zzh = zzi;
            zzeb zzI = ((zziy) this.zzc).zza.zzl;
            zzI.zzd(30, new zzit(zzg2, zzi));
            zzI.zzc();
        }
    }

    private static boolean zzi(AudioManager audioManager, int i10) {
        if (zzew.zza >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return zzg(audioManager, i10) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzew.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzkx zzkx = this.zze;
        if (zzkx != null) {
            try {
                this.zza.unregisterReceiver(zzkx);
            } catch (RuntimeException e10) {
                zzee.zzf("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i10) {
        if (this.zzf != 3) {
            this.zzf = 3;
            zzh();
            zziy zziy = (zziy) this.zzc;
            zzt zzH = zzjc.zzal(zziy.zza.zzz);
            if (!zzH.equals(zziy.zza.zzab)) {
                zziy.zza.zzab = zzH;
                zzeb zzI = zziy.zza.zzl;
                zzI.zzd(29, new zziu(zzH));
                zzI.zzc();
            }
        }
    }
}
