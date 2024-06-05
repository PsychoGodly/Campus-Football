package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import h5.g;
import h5.h;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaqx {
    private static final String zzd = "zzaqx";
    protected final Context zza;
    protected boolean zzb;
    protected boolean zzc;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzaqc zzg;
    private byte[] zzh;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj;
    private Future zzk;
    private final boolean zzl;
    /* access modifiers changed from: private */
    public volatile zzans zzm;
    private Future zzn;
    private zzapr zzo;
    private final Map zzp;
    private boolean zzq;
    private zzaqq zzr;

    private zzaqx(Context context) {
        boolean z10 = false;
        this.zzj = false;
        this.zzk = null;
        this.zzm = null;
        this.zzn = null;
        this.zzb = false;
        this.zzc = false;
        this.zzq = false;
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null ? true : z10;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzp = new HashMap();
        if (this.zzr == null) {
            this.zzr = new zzaqq(context);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|(3:27|28|(17:30|(2:32|33)|34|35|36|37|(2:39|(1:41)(2:42|43))|44|(1:46)|47|48|49|50|51|52|53|82)(3:71|72|73))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ zzaqn -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086 A[Catch:{ IllegalArgumentException -> 0x0157, zzaqb -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0151 A[SYNTHETIC, Splitter:B:71:0x0151] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaqx zzg(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r11 = "1673051109277"
            com.google.android.gms.internal.ads.zzaqx r0 = new com.google.android.gms.internal.ads.zzaqx
            r0.<init>(r9)
            com.google.android.gms.internal.ads.zzaqt r9 = new com.google.android.gms.internal.ads.zzaqt     // Catch:{ zzaqn -> 0x0165 }
            r9.<init>()     // Catch:{ zzaqn -> 0x0165 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzaqn -> 0x0165 }
            r0.zze = r9     // Catch:{ zzaqn -> 0x0165 }
            r0.zzj = r12     // Catch:{ zzaqn -> 0x0165 }
            if (r12 == 0) goto L_0x0025
            java.util.concurrent.ExecutorService r9 = r0.zze     // Catch:{ zzaqn -> 0x0165 }
            com.google.android.gms.internal.ads.zzaqu r12 = new com.google.android.gms.internal.ads.zzaqu     // Catch:{ zzaqn -> 0x0165 }
            r12.<init>(r0)     // Catch:{ zzaqn -> 0x0165 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzaqn -> 0x0165 }
            r0.zzk = r9     // Catch:{ zzaqn -> 0x0165 }
        L_0x0025:
            java.util.concurrent.ExecutorService r9 = r0.zze     // Catch:{ zzaqn -> 0x0165 }
            com.google.android.gms.internal.ads.zzaqw r12 = new com.google.android.gms.internal.ads.zzaqw     // Catch:{ zzaqn -> 0x0165 }
            r12.<init>(r0)     // Catch:{ zzaqn -> 0x0165 }
            r9.execute(r12)     // Catch:{ zzaqn -> 0x0165 }
            r9 = 1
            r12 = 0
            h5.f r1 = h5.f.h()     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.zza     // Catch:{ all -> 0x004f }
            int r2 = r1.b(r2)     // Catch:{ all -> 0x004f }
            if (r2 <= 0) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r0.zzb = r2     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.zza     // Catch:{ all -> 0x004f }
            int r1 = r1.i(r2)     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0.zzc = r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0.zzo(r12, r9)     // Catch:{ zzaqn -> 0x0165 }
            boolean r1 = com.google.android.gms.internal.ads.zzarb.zzf()     // Catch:{ zzaqn -> 0x0165 }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzcP     // Catch:{ zzaqn -> 0x0165 }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ zzaqn -> 0x0165 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ zzaqn -> 0x0165 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ zzaqn -> 0x0165 }
            boolean r1 = r1.booleanValue()     // Catch:{ zzaqn -> 0x0165 }
            if (r1 != 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzaqn -> 0x0165 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzaqn -> 0x0165 }
            throw r9     // Catch:{ zzaqn -> 0x0165 }
        L_0x0073:
            com.google.android.gms.internal.ads.zzaqc r1 = new com.google.android.gms.internal.ads.zzaqc     // Catch:{ zzaqn -> 0x0165 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ zzaqn -> 0x0165 }
            r0.zzg = r1     // Catch:{ zzaqn -> 0x0165 }
            java.lang.String r3 = "6zId8d9NaX80sl0M8SJ9SnojSxUu8C5CZiLILGnPeUQ="
            byte[] r3 = com.google.android.gms.internal.ads.zzaoh.zzb(r3, r12)     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0157 }
            r5 = 32
            if (r4 != r5) goto L_0x0151
            r4 = 4
            r5 = 16
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0157 }
            byte[] r4 = new byte[r5]     // Catch:{ IllegalArgumentException -> 0x0157 }
            r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x0157 }
            r3 = 0
        L_0x0093:
            if (r3 >= r5) goto L_0x009f
            byte r6 = r4[r3]     // Catch:{ IllegalArgumentException -> 0x0157 }
            r6 = r6 ^ 68
            byte r6 = (byte) r6     // Catch:{ IllegalArgumentException -> 0x0157 }
            r4[r3] = r6     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r3 = r3 + 1
            goto L_0x0093
        L_0x009f:
            r0.zzh = r4     // Catch:{ zzaqb -> 0x015e }
            android.content.Context r1 = r0.zza     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r0.zza     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r3 = "dex"
            java.io.File r1 = r1.getDir(r3, r12)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            if (r1 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            com.google.android.gms.internal.ads.zzaqn r9 = new com.google.android.gms.internal.ads.zzaqn     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            throw r9     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
        L_0x00ba:
            java.lang.String r3 = "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"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r7[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r7[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            if (r5 != 0) goto L_0x00eb
            com.google.android.gms.internal.ads.zzaqc r5 = r0.zzg     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            byte[] r7 = r0.zzh     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            byte[] r3 = r5.zzb(r7, r3)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            int r7 = r3.length     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r5.write(r3, r12, r7)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
        L_0x00eb:
            r0.zzx(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            dalvik.system.DexClassLoader r3 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x0120 }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x0120 }
            android.content.Context r8 = r0.zza     // Catch:{ all -> 0x0120 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x0120 }
            r3.<init>(r5, r7, r2, r8)     // Catch:{ all -> 0x0120 }
            r0.zzf = r3     // Catch:{ all -> 0x0120 }
            zzy(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r0.zzw(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r2[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r2[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r10 = java.lang.String.format(r10, r2)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            zzz(r10)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            com.google.android.gms.internal.ads.zzapr r10 = new com.google.android.gms.internal.ads.zzapr     // Catch:{ zzaqn -> 0x0165 }
            r10.<init>(r0)     // Catch:{ zzaqn -> 0x0165 }
            r0.zzo = r10     // Catch:{ zzaqn -> 0x0165 }
            r0.zzq = r9     // Catch:{ zzaqn -> 0x0165 }
            goto L_0x0165
        L_0x0120:
            r2 = move-exception
            zzy(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r0.zzw(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r3[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            r3[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r9 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            zzz(r9)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
            throw r2     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaqb -> 0x013c, NullPointerException -> 0x0135 }
        L_0x0135:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaqn r10 = new com.google.android.gms.internal.ads.zzaqn     // Catch:{ zzaqn -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaqn -> 0x0165 }
            throw r10     // Catch:{ zzaqn -> 0x0165 }
        L_0x013c:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaqn r10 = new com.google.android.gms.internal.ads.zzaqn     // Catch:{ zzaqn -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaqn -> 0x0165 }
            throw r10     // Catch:{ zzaqn -> 0x0165 }
        L_0x0143:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaqn r10 = new com.google.android.gms.internal.ads.zzaqn     // Catch:{ zzaqn -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaqn -> 0x0165 }
            throw r10     // Catch:{ zzaqn -> 0x0165 }
        L_0x014a:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaqn r10 = new com.google.android.gms.internal.ads.zzaqn     // Catch:{ zzaqn -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaqn -> 0x0165 }
            throw r10     // Catch:{ zzaqn -> 0x0165 }
        L_0x0151:
            com.google.android.gms.internal.ads.zzaqb r9 = new com.google.android.gms.internal.ads.zzaqb     // Catch:{ IllegalArgumentException -> 0x0157 }
            r9.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0157 }
            throw r9     // Catch:{ IllegalArgumentException -> 0x0157 }
        L_0x0157:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaqb r10 = new com.google.android.gms.internal.ads.zzaqb     // Catch:{ zzaqb -> 0x015e }
            r10.<init>(r1, r9)     // Catch:{ zzaqb -> 0x015e }
            throw r10     // Catch:{ zzaqb -> 0x015e }
        L_0x015e:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaqn r10 = new com.google.android.gms.internal.ads.zzaqn     // Catch:{ zzaqn -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaqn -> 0x0165 }
            throw r10     // Catch:{ zzaqn -> 0x0165 }
        L_0x0165:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.zzg(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzaqx");
    }

    /* access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (g | h | IOException unused) {
            this.zzi = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3 A[SYNTHETIC, Splitter:B:42:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da A[SYNTHETIC, Splitter:B:46:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4 A[SYNTHETIC, Splitter:B:54:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC, Splitter:B:58:0x00eb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzw(java.io.File r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r12 = "test"
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r11
            r4 = 1
            java.lang.String r5 = "1673051109277"
            r2[r4] = r5
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001f
            return
        L_0x001f:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r4] = r5
            java.lang.String r11 = "%s/%s.dex"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r2.<init>(r11)
            boolean r11 = r2.exists()
            if (r11 != 0) goto L_0x0037
            return
        L_0x0037:
            long r6 = r2.length()
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0042
            return
        L_0x0042:
            int r11 = (int) r6
            byte[] r11 = new byte[r11]
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e1, all -> 0x00ce }
            r4.<init>(r2)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e1, all -> 0x00ce }
            int r6 = r4.read(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            if (r6 > 0) goto L_0x0058
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            zzy(r2)
            return
        L_0x0058:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzanv r12 = com.google.android.gms.internal.ads.zzanw.zza()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgpe r6 = com.google.android.gms.internal.ads.zzgpe.zzv(r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zzc(r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r5 = r5.getBytes()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgpe r5 = com.google.android.gms.internal.ads.zzgpe.zzv(r5)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zzd(r5)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzaqc r5 = r10.zzg     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r10.zzh     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r11 = r5.zza(r6, r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r11 = r11.getBytes()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgpe r5 = com.google.android.gms.internal.ads.zzgpe.zzv(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zza(r5)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r11 = com.google.android.gms.internal.ads.zzaol.zze(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgpe r11 = com.google.android.gms.internal.ads.zzgpe.zzv(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zzb(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.createNewFile()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r11.<init>(r0)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgqm r12 = r12.zzal()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzanw r12 = (com.google.android.gms.internal.ads.zzanw) r12     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            byte[] r12 = r12.zzax()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            int r0 = r12.length     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r11.write(r12, r3, r0)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r11.close()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r4.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r11.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            zzy(r2)
            return
        L_0x00c4:
            r12 = move-exception
            goto L_0x00c9
        L_0x00c6:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00c9:
            r1 = r4
            goto L_0x00d1
        L_0x00cb:
            r11 = r1
        L_0x00cc:
            r1 = r4
            goto L_0x00e2
        L_0x00ce:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00d1:
            if (r1 == 0) goto L_0x00d8
            r1.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            if (r11 == 0) goto L_0x00dd
            r11.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            zzy(r2)
            throw r12
        L_0x00e1:
            r11 = r1
        L_0x00e2:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r11 == 0) goto L_0x00ee
            r11.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00ee:
            zzy(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.zzw(java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:31|32|33|34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: zzaqb | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea A[SYNTHETIC, Splitter:B:61:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f1 A[SYNTHETIC, Splitter:B:65:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f8 A[SYNTHETIC, Splitter:B:72:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ff A[SYNTHETIC, Splitter:B:76:0x00ff] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzx(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r11 = new java.io.File
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            r3 = 1
            java.lang.String r4 = "1673051109277"
            r1[r3] = r4
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            r11.<init>(r1)
            boolean r1 = r11.exists()
            if (r1 != 0) goto L_0x001d
            return r2
        L_0x001d:
            java.io.File r1 = new java.io.File
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            r0[r3] = r4
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 != 0) goto L_0x0102
            r10 = 0
            long r5 = r11.length()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
            zzy(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            return r2
        L_0x0043:
            int r0 = (int) r5     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            byte[] r0 = new byte[r0]     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            r5.<init>(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            int r6 = r5.read(r0)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r6 > 0) goto L_0x005f
            java.lang.String r0 = zzd     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r0, r1)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            zzy(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r5.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return r2
        L_0x005f:
            com.google.android.gms.internal.ads.zzgpy r6 = com.google.android.gms.internal.ads.zzgpy.zza()     // Catch:{ NullPointerException -> 0x00db, zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3 }
            com.google.android.gms.internal.ads.zzanw r0 = com.google.android.gms.internal.ads.zzanw.zzd(r0, r6)     // Catch:{ NullPointerException -> 0x00db, zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.zzgpe r7 = r0.zzh()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r7 = r7.zzE()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r7)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = r4.equals(r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzgpe r4 = r0.zzf()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.zzE()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.zzgpe r6 = r0.zze()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.zzE()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = com.google.android.gms.internal.ads.zzaol.zze(r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzgpe r4 = r0.zzg()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.zzE()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.getBytes()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 != 0) goto L_0x00a9
            goto L_0x00d4
        L_0x00a9:
            com.google.android.gms.internal.ads.zzaqc r11 = r9.zzg     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r9.zzh     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.zzgpe r0 = r0.zze()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r0 = r0.zzE()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r0)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r11 = r11.zzb(r4, r6)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r1.createNewFile()     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r0.<init>(r1)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            int r10 = r11.length     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r0.write(r11, r2, r10)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r5.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r0.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            return r3
        L_0x00d1:
            r10 = move-exception
            r11 = r10
            goto L_0x00e1
        L_0x00d4:
            zzy(r11)     // Catch:{ zzaqb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r5.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r2
        L_0x00db:
            r5.close()     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            return r2
        L_0x00df:
            r11 = move-exception
            r0 = r10
        L_0x00e1:
            r10 = r5
            goto L_0x00e8
        L_0x00e3:
            r0 = r10
        L_0x00e4:
            r10 = r5
            goto L_0x00f6
        L_0x00e6:
            r11 = move-exception
            r0 = r10
        L_0x00e8:
            if (r10 == 0) goto L_0x00ef
            r10.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r0 == 0) goto L_0x00f4
            r0.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            throw r11
        L_0x00f5:
            r0 = r10
        L_0x00f6:
            if (r10 == 0) goto L_0x00fd
            r10.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            if (r0 == 0) goto L_0x0102
            r0.close()     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.zzx(java.io.File, java.lang.String):boolean");
    }

    private static final void zzy(File file) {
        if (!file.exists()) {
            Log.d(zzd, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        return this.zzo != null ? zzapr.zzd() : RecyclerView.UNDEFINED_DURATION;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzans zzc() {
        return this.zzm;
    }

    public final zzapr zzd() {
        return this.zzo;
    }

    public final zzaqc zze() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final zzaqq zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        if (!this.zzj) {
            return null;
        }
        if (this.zzi != null) {
            return this.zzi;
        }
        Future future = this.zzk;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.zzk = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzk.cancel(true);
            }
        }
        return this.zzi;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzasl zzasl = (zzasl) this.zzp.get(new Pair(str, str2));
        if (zzasl == null) {
            return null;
        }
        return zzasl.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(int i10, boolean z10) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzaqv(this, i10, true));
            if (i10 == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.zzp.containsKey(pair)) {
            return false;
        }
        this.zzp.put(pair, new zzasl(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}
