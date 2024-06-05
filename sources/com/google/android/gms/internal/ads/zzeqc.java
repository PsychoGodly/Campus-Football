package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeqc implements zzepn {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbya zzg;

    zzeqc(zzbya zzbya, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.zzg = zzbya;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z10;
        this.zzf = z11;
    }

    public final int zza() {
        return 40;
    }

    public final zzfut zzb() {
        if (!((Boolean) a0.c().zzb(zzbar.zzaO)).booleanValue()) {
            return zzfuj.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfuj.zze((zzfua) zzfuj.zzn(zzfuj.zzl(zzfua.zzv(this.zzg.zza(this.zza, this.zzd)), new zzeqa(this), this.zzc), ((Long) a0.c().zzb(zzbar.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzeqb(this), this.zzc);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        com.google.android.gms.ads.internal.t.q().zzu(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfks();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzcF)).booleanValue() == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzcG)).booleanValue() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = com.google.android.gms.internal.ads.zzfkv.zzj(r7.zza);
        r8.getClass();
        r2 = r8.getId();
        r2.getClass();
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzcJ)).longValue(), r7.zzf);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeqd zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfks r0 = new com.google.android.gms.internal.ads.zzfks
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzcF
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0031
        L_0x001b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzcG
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x006f
        L_0x0031:
            android.content.Context r0 = r7.zza     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzfkv r1 = com.google.android.gms.internal.ads.zzfkv.zzj(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            r8.getClass()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.String r2 = r8.getId()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            r2.getClass()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            android.content.Context r0 = r7.zza     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzcJ     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.Object r0 = r4.zzb(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            long r4 = r0.longValue()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            boolean r6 = r7.zzf     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzfks r0 = r1.zzi(r2, r3, r4, r6)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            goto L_0x006f
        L_0x005e:
            r0 = move-exception
            goto L_0x0061
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            com.google.android.gms.internal.ads.zzbyj r1 = com.google.android.gms.ads.internal.t.q()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.zzu(r0, r2)
            com.google.android.gms.internal.ads.zzfks r0 = new com.google.android.gms.internal.ads.zzfks
            r0.<init>()
        L_0x006f:
            com.google.android.gms.internal.ads.zzeqd r1 = new com.google.android.gms.internal.ads.zzeqd
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqc.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzeqd");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqd zzd(Throwable th) {
        String str;
        x.b();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzeqd((AdvertisingIdClient.Info) null, str, new zzfks());
    }
}
