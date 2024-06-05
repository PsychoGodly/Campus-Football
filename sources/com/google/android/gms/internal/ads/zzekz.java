package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzekz implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzekz(zzfuu zzfuu, Context context) {
        this.zza = zzfuu;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzeky(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzela zzc() throws Exception {
        int i10;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i11 = -1;
        if (((Boolean) a0.c().zzb(zzbar.zzjm)).booleanValue()) {
            i10 = t.s().i(audioManager);
            i11 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
        }
        return new zzela(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i10, i11, audioManager.getRingerMode(), audioManager.getStreamVolume(2), t.t().a(), t.t().e());
    }
}
