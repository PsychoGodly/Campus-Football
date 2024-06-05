package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfii {
    private final Context zza;
    private final Executor zzb;
    private final zzfhp zzc;
    private final zzfhr zzd;
    private final zzfih zze;
    private final zzfih zzf;
    private Task zzg;
    private Task zzh;

    zzfii(Context context, Executor executor, zzfhp zzfhp, zzfhr zzfhr, zzfif zzfif, zzfig zzfig) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfhp;
        this.zzd = zzfhr;
        this.zze = zzfif;
        this.zzf = zzfig;
    }

    public static zzfii zze(Context context, Executor executor, zzfhp zzfhp, zzfhr zzfhr) {
        zzfii zzfii = new zzfii(context, executor, zzfhp, zzfhr, new zzfif(), new zzfig());
        if (zzfii.zzd.zzd()) {
            zzfii.zzg = zzfii.zzh(new zzfic(zzfii));
        } else {
            zzfii.zzg = Tasks.forResult(zzfii.zze.zza());
        }
        zzfii.zzh = zzfii.zzh(new zzfid(zzfii));
        return zzfii;
    }

    private static zzans zzg(Task task, zzans zzans) {
        if (!task.isSuccessful()) {
            return zzans;
        }
        return (zzans) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, (OnFailureListener) new zzfie(this));
    }

    public final zzans zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzans zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzans zzc() throws Exception {
        Context context = this.zza;
        zzamv zza2 = zzans.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id2 = advertisingIdInfo.getId();
        if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id2 = Base64.encodeToString(bArr, 11);
        }
        if (id2 != null) {
            zza2.zzs(id2);
            zza2.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza2.zzab(6);
        }
        return (zzans) zza2.zzal();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzans zzd() throws Exception {
        Context context = this.zza;
        return zzfhx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1, exc);
    }
}
