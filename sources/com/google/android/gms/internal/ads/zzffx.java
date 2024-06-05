package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzffx extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzffv zzc;
    private float zzd;
    private final zzfgf zze;

    public zzffx(Handler handler, Context context, zzffv zzffv, zzfgf zzfgf, byte[] bArr) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzc = zzffv;
        this.zze = zzfgf;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void zzd() {
        this.zze.zzd(this.zzd);
    }

    public final void onChange(boolean z10) {
        super.onChange(z10);
        float zzc2 = zzc();
        if (zzc2 != this.zzd) {
            this.zzd = zzc2;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
