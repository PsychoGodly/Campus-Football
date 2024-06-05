package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzduj implements zzdvh {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdtj zzb;
    private final zzfuu zzc;
    private final zzeyx zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzdzf zzf;
    private final zzfen zzg;
    private final Context zzh;

    zzduj(Context context, zzeyx zzeyx, zzdtj zzdtj, zzfuu zzfuu, ScheduledExecutorService scheduledExecutorService, zzdzf zzdzf, zzfen zzfen) {
        this.zzh = context;
        this.zzd = zzeyx;
        this.zzb = zzdtj;
        this.zzc = zzfuu;
        this.zze = scheduledExecutorService;
        this.zzf = zzdzf;
        this.zzg = zzfen;
    }

    public final zzfut zzb(zzbtn zzbtn) {
        zzfut zzb2 = this.zzb.zzb(zzbtn);
        zzfec zza2 = zzfeb.zza(this.zzh, 11);
        zzfem.zzd(zzb2, zza2);
        zzfut zzm = zzfuj.zzm(zzb2, new zzdug(this), this.zzc);
        if (((Boolean) a0.c().zzb(zzbar.zzfb)).booleanValue()) {
            zzm = zzfuj.zzf(zzfuj.zzn(zzm, (long) ((Integer) a0.c().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzduh.zza, zzbzn.zzf);
        }
        zzfem.zza(zzm, this.zzg, zza2);
        zzfuj.zzq(zzm, new zzdui(this), zzbzn.zzf);
        return zzm;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(InputStream inputStream) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zzd), zzeyn.zza(new InputStreamReader(inputStream))));
    }
}
