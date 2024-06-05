package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import m5.k;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcdi extends zzfa {
    private final Context zza;
    private final zzfg zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze = ((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue();
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzavq zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private long zzn = 0;
    private zzfut zzo = null;
    private final AtomicLong zzp = new AtomicLong(-1);
    private final zzcdl zzq;

    public zzcdi(Context context, zzfg zzfg, String str, int i10, zzgi zzgi, zzcdl zzcdl, byte[] bArr) {
        super(false);
        this.zza = context;
        this.zzb = zzfg;
        this.zzq = zzcdl;
        this.zzc = str;
        this.zzd = i10;
        zzf(zzgi);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzdT)).booleanValue() && !this.zzl) {
            return true;
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzdU)).booleanValue() || this.zzm) {
            return false;
        }
        return true;
    }

    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                i12 = inputStream.read(bArr, i10, i11);
            } else {
                i12 = this.zzb.zza(bArr, i10, i11);
            }
            if (!this.zze || this.zzf != null) {
                zzg(i12);
            }
            return i12;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0130=Splitter:B:39:0x0130, B:34:0x010d=Splitter:B:34:0x010d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.zzg
            if (r2 != 0) goto L_0x0208
            r2 = 1
            r13.zzg = r2
            android.net.Uri r3 = r14.zza
            r13.zzh = r3
            boolean r3 = r13.zze
            if (r3 != 0) goto L_0x0016
            r13.zzj(r14)
        L_0x0016:
            android.net.Uri r3 = r14.zza
            com.google.android.gms.internal.ads.zzavq r3 = com.google.android.gms.internal.ads.zzavq.zza(r3)
            r13.zzi = r3
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzdQ
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.zzavq r3 = r13.zzi
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzavq r3 = r13.zzi
            long r7 = r14.zzf
            r3.zzh = r7
            com.google.android.gms.internal.ads.zzavq r3 = r13.zzi
            java.lang.String r7 = r13.zzc
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfoj.zzc(r7)
            r3.zzi = r7
            com.google.android.gms.internal.ads.zzavq r3 = r13.zzi
            int r7 = r13.zzd
            r3.zzj = r7
            com.google.android.gms.internal.ads.zzavq r3 = r13.zzi
            boolean r3 = r3.zzg
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzdS
            com.google.android.gms.internal.ads.zzbap r7 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r3 = r7.zzb(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006c
        L_0x0060:
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzdR
            com.google.android.gms.internal.ads.zzbap r7 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r3 = r7.zzb(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006c:
            long r7 = r3.longValue()
            m5.e r3 = com.google.android.gms.ads.internal.t.b()
            long r9 = r3.b()
            com.google.android.gms.ads.internal.t.f()
            android.content.Context r3 = r13.zza
            com.google.android.gms.internal.ads.zzavq r11 = r13.zzi
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.zzawb.zza(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            java.lang.Object r7 = r3.get(r7, r11)     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            com.google.android.gms.internal.ads.zzawc r7 = (com.google.android.gms.internal.ads.zzawc) r7     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            boolean r8 = r7.zzd()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzj = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.zzf()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzl = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.zze()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzm = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            long r11 = r7.zza()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzn = r11     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r13.zzr()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r8 != 0) goto L_0x00de
            java.io.InputStream r7 = r7.zzc()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzf = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r7 = r13.zze     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b6
            r13.zzj(r14)     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
        L_0x00b6:
            m5.e r14 = com.google.android.gms.ads.internal.t.b()
            long r6 = r14.b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.zzcdl r14 = r13.zzq
            com.google.android.gms.internal.ads.zzcdv r14 = r14.zza
            r14.zzZ(r2, r6)
            r13.zzk = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r6)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.ads.internal.util.n1.a(r14)
            return r4
        L_0x00de:
            m5.e r3 = com.google.android.gms.ads.internal.t.b()
            long r3 = r3.b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzcdl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcdv r5 = r5.zza
            r5.zzZ(r2, r3)
            r13.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0157
        L_0x0103:
            r14 = move-exception
            goto L_0x015e
        L_0x0105:
            r4 = 1
            goto L_0x010d
        L_0x0107:
            r4 = 1
            goto L_0x0130
        L_0x0109:
            r14 = move-exception
            r2 = 0
            goto L_0x015e
        L_0x010c:
            r4 = 0
        L_0x010d:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015c }
            r2.interrupt()     // Catch:{ all -> 0x015c }
            m5.e r2 = com.google.android.gms.ads.internal.t.b()
            long r2 = r2.b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzcdl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcdv r5 = r5.zza
            r5.zzZ(r4, r2)
            r13.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x014a
        L_0x012f:
            r4 = 0
        L_0x0130:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            m5.e r2 = com.google.android.gms.ads.internal.t.b()
            long r2 = r2.b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzcdl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcdv r5 = r5.zza
            r5.zzZ(r4, r2)
            r13.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x014a:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0157:
            com.google.android.gms.ads.internal.util.n1.a(r0)
            goto L_0x01e2
        L_0x015c:
            r14 = move-exception
            r2 = r4
        L_0x015e:
            m5.e r3 = com.google.android.gms.ads.internal.t.b()
            long r3 = r3.b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzcdl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcdv r5 = r5.zza
            r5.zzZ(r2, r3)
            r13.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.n1.a(r0)
            throw r14
        L_0x0186:
            com.google.android.gms.internal.ads.zzavq r0 = r13.zzi
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.zzavq r0 = r13.zzi
            long r7 = r14.zzf
            r0.zzh = r7
            com.google.android.gms.internal.ads.zzavq r0 = r13.zzi
            java.lang.String r1 = r13.zzc
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfoj.zzc(r1)
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzavq r0 = r13.zzi
            int r1 = r13.zzd
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzavm r0 = com.google.android.gms.ads.internal.t.e()
            com.google.android.gms.internal.ads.zzavq r1 = r13.zzi
            com.google.android.gms.internal.ads.zzavn r0 = r0.zzb(r1)
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e2
            boolean r1 = r0.zze()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r0.zzd()
            r13.zzj = r1
            boolean r1 = r0.zzg()
            r13.zzl = r1
            boolean r1 = r0.zzf()
            r13.zzm = r1
            long r7 = r0.zza()
            r13.zzn = r7
            r13.zzk = r2
            boolean r1 = r13.zzr()
            if (r1 != 0) goto L_0x01e2
            java.io.InputStream r0 = r0.zzc()
            r13.zzf = r0
            boolean r0 = r13.zze
            if (r0 == 0) goto L_0x01e1
            r13.zzj(r14)
        L_0x01e1:
            return r4
        L_0x01e2:
            r13.zzk = r6
            com.google.android.gms.internal.ads.zzavq r0 = r13.zzi
            if (r0 == 0) goto L_0x0201
            com.google.android.gms.internal.ads.zzfl r0 = new com.google.android.gms.internal.ads.zzfl
            com.google.android.gms.internal.ads.zzavq r1 = r13.zzi
            java.lang.String r1 = r1.zza
            android.net.Uri r2 = android.net.Uri.parse(r1)
            r3 = 0
            long r4 = r14.zze
            long r6 = r14.zzf
            long r8 = r14.zzg
            r10 = 0
            int r11 = r14.zzi
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r14 = r0
        L_0x0201:
            com.google.android.gms.internal.ads.zzfg r0 = r13.zzb
            long r0 = r0.zzb(r14)
            return r0
        L_0x0208:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdi.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    public final Uri zzc() {
        return this.zzh;
    }

    public final void zzd() throws IOException {
        if (this.zzg) {
            boolean z10 = false;
            this.zzg = false;
            this.zzh = null;
            if (!this.zze || this.zzf != null) {
                z10 = true;
            }
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                k.a(inputStream);
                this.zzf = null;
            } else {
                this.zzb.zzd();
            }
            if (z10) {
                zzh();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi == null) {
            return -1;
        }
        if (this.zzp.get() != -1) {
            return this.zzp.get();
        }
        synchronized (this) {
            if (this.zzo == null) {
                this.zzo = zzbzn.zza.zzb(new zzcdh(this));
            }
        }
        if (!this.zzo.isDone()) {
            return -1;
        }
        try {
            this.zzp.compareAndSet(-1, ((Long) this.zzo.get()).longValue());
            return this.zzp.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(t.e().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
