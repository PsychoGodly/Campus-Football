package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.unity3d.services.UnityAdsConstants;
import h5.a;
import h5.f;
import h5.g;
import h5.h;
import h5.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class AdvertisingIdClient {
    a zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z10) {
            this.zza = str;
            this.zzb = z10;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z10 = this.zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, g, h {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd2 = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd2, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, MaxReward.DEFAULT_LABEL, (Throwable) null);
            advertisingIdClient.zza();
            return zzd2;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, g, h {
        boolean zzd2;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, false, false);
        try {
            advertisingIdClient.zzb(false);
            q.j("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.zzc) {
                    synchronized (advertisingIdClient.zzd) {
                        zzb zzb2 = advertisingIdClient.zze;
                        if (zzb2 == null || !zzb2.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    } catch (Exception e11) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                    }
                }
                q.k(advertisingIdClient.zza);
                q.k(advertisingIdClient.zzb);
                zzd2 = advertisingIdClient.zzb.zzd();
            }
            advertisingIdClient.zze();
            return zzd2;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }

    private final Info zzd(int i10) throws IOException {
        Info info;
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzc) {
                synchronized (this.zzd) {
                    zzb zzb2 = this.zze;
                    if (zzb2 == null || !zzb2.zzb) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            q.k(this.zza);
            q.k(this.zzb);
            info = new Info(this.zzb.zzc(), this.zzb.zze(true));
        }
        zze();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zze() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzd
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r6.zze     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.zza     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.ads.identifier.zzb r1 = r6.zze     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.zzf     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.zze = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zze():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws IOException, IllegalStateException, g, h {
        zzb(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.q.j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.zzg     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            h5.a r0 = r3.zza     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.zzc     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            l5.a r0 = l5.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.zzg     // Catch:{ all -> 0x001f }
            h5.a r2 = r3.zza     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.zzc = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.zzb = r0     // Catch:{ all -> 0x0033 }
            r3.zza = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z10) throws IOException, IllegalStateException, g, h {
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j10 = f.h().j(context, j.f18843a);
                if (j10 != 0) {
                    if (j10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                a aVar = new a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (l5.a.b().a(context, intent, aVar, 1)) {
                    this.zza = aVar;
                    this.zzb = zze.zza(aVar.a(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, TimeUnit.MILLISECONDS));
                    this.zzc = true;
                    if (z10) {
                        zze();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new g(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(Info info, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String id2 = info.getId();
            if (id2 != null) {
                hashMap.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new zza(this, hashMap).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.zzd = new Object();
        q.k(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j10;
    }
}
