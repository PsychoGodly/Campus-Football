package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcdv extends zzcba implements zzgi, zzle {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdg zzc;
    private final zzwc zzd;
    private final zzcbi zze;
    private final WeakReference zzf;
    private final zzty zzg;
    private zzhu zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcaz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq = new Object();
    private final ArrayList zzr;
    private volatile zzcdi zzs;
    private final Set zzt = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzbG)).booleanValue() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e7, code lost:
        if (r7.zzj == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ec, code lost:
        if (r7.zzm == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ee, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcdm(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f6, code lost:
        if (r7.zzi <= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f8, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcdn(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fe, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcdo(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0105, code lost:
        if (r7.zzj == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0107, code lost:
        r7 = new com.google.android.gms.internal.ads.zzcdp(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010e, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        r6 = r5.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        if (r6 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0117, code lost:
        if (r6.limit() <= 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0119, code lost:
        r6 = new byte[r5.zzi.limit()];
        r5.zzi.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzcdq(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcdv(android.content.Context r6, com.google.android.gms.internal.ads.zzcbi r7, com.google.android.gms.internal.ads.zzcbj r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.zzq = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.zzt = r0
            r5.zzb = r6
            r5.zze = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.zzf = r0
            com.google.android.gms.internal.ads.zzcdg r0 = new com.google.android.gms.internal.ads.zzcdg
            r0.<init>()
            r5.zzc = r0
            com.google.android.gms.internal.ads.zzwc r1 = new com.google.android.gms.internal.ads.zzwc
            r1.<init>(r6)
            r5.zzd = r1
            boolean r2 = com.google.android.gms.ads.internal.util.n1.c()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "SimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.n1.a(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.zzcba.zzC()
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.zzkr r2 = new com.google.android.gms.internal.ads.zzkr
            com.google.android.gms.internal.ads.zzcdr r3 = new com.google.android.gms.internal.ads.zzcdr
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.zzb(r1)
            r2.zza(r0)
            com.google.android.gms.internal.ads.zzks r0 = r2.zzc()
            r5.zzh = r0
            r0.zzC(r5)
            r0 = 0
            r5.zzl = r0
            r1 = 0
            r5.zzn = r1
            r5.zzm = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzr = r1
            r5.zzs = r4
            if (r8 == 0) goto L_0x0077
            java.lang.String r1 = r8.zzbl()
            goto L_0x0078
        L_0x0077:
            r1 = r4
        L_0x0078:
            com.google.android.gms.internal.ads.zzfnq r1 = com.google.android.gms.internal.ads.zzfnq.zzd(r1)
            java.lang.String r2 = ""
            java.lang.Object r1 = r1.zzb(r2)
            java.lang.String r1 = (java.lang.String) r1
            r5.zzo = r1
            if (r8 == 0) goto L_0x008d
            int r1 = r8.zzf()
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            r5.zzp = r1
            com.google.android.gms.internal.ads.zzty r1 = new com.google.android.gms.internal.ads.zzty
            com.google.android.gms.ads.internal.util.b2 r2 = com.google.android.gms.ads.internal.t.r()
            com.google.android.gms.internal.ads.zzbzg r8 = r8.zzn()
            java.lang.String r8 = r8.zza
            java.lang.String r6 = r2.B(r6, r8)
            boolean r8 = r5.zzj
            if (r8 == 0) goto L_0x00c0
            java.nio.ByteBuffer r8 = r5.zzi
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00c0
            java.nio.ByteBuffer r6 = r5.zzi
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.zzi
            r7.get(r6)
            com.google.android.gms.internal.ads.zzcdk r7 = new com.google.android.gms.internal.ads.zzcdk
            r7.<init>(r6)
            goto L_0x012c
        L_0x00c0:
            com.google.android.gms.internal.ads.zzbaj r8 = com.google.android.gms.internal.ads.zzbar.zzbO
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r8 = r2.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.zzbaj r8 = com.google.android.gms.internal.ads.zzbar.zzbG
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r8 = r3.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00e9
        L_0x00e5:
            boolean r8 = r7.zzj
            if (r8 != 0) goto L_0x00ea
        L_0x00e9:
            r0 = 1
        L_0x00ea:
            boolean r8 = r7.zzm
            if (r8 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzcdm r8 = new com.google.android.gms.internal.ads.zzcdm
            r8.<init>(r5, r6, r0)
            goto L_0x0103
        L_0x00f4:
            int r8 = r7.zzi
            if (r8 <= 0) goto L_0x00fe
            com.google.android.gms.internal.ads.zzcdn r8 = new com.google.android.gms.internal.ads.zzcdn
            r8.<init>(r5, r6, r0)
            goto L_0x0103
        L_0x00fe:
            com.google.android.gms.internal.ads.zzcdo r8 = new com.google.android.gms.internal.ads.zzcdo
            r8.<init>(r5, r6, r0)
        L_0x0103:
            boolean r6 = r7.zzj
            if (r6 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzcdp r6 = new com.google.android.gms.internal.ads.zzcdp
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x010f
        L_0x010e:
            r7 = r8
        L_0x010f:
            java.nio.ByteBuffer r6 = r5.zzi
            if (r6 == 0) goto L_0x012c
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x012c
            java.nio.ByteBuffer r6 = r5.zzi
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.zzi
            r8.get(r6)
            com.google.android.gms.internal.ads.zzcdq r8 = new com.google.android.gms.internal.ads.zzcdq
            r8.<init>(r7, r6)
            r7 = r8
        L_0x012c:
            com.google.android.gms.internal.ads.zzbaj r6 = com.google.android.gms.internal.ads.zzbar.zzm
            com.google.android.gms.internal.ads.zzbap r8 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r6 = r8.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0141
            com.google.android.gms.internal.ads.zzcdt r6 = com.google.android.gms.internal.ads.zzcdt.zza
            goto L_0x0143
        L_0x0141:
            com.google.android.gms.internal.ads.zzcdu r6 = com.google.android.gms.internal.ads.zzcdu.zza
        L_0x0143:
            com.google.android.gms.internal.ads.zztx r8 = new com.google.android.gms.internal.ads.zztx
            r8.<init>(r6)
            r1.<init>(r7, r8, r4)
            r5.zzg = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbi, com.google.android.gms.internal.ads.zzcbj):void");
    }

    private final boolean zzab() {
        return this.zzs != null && this.zzs.zzq();
    }

    public final void finalize() {
        zzcba.zzC().decrementAndGet();
        if (n1.c()) {
            n1.a("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzab()) {
            return (long) this.zzl;
        }
        return 0;
    }

    public final long zzB() {
        if (zzab()) {
            return this.zzs.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzr.isEmpty()) {
                long j10 = this.zzn;
                Map zze2 = ((zzgd) this.zzr.remove(0)).zze();
                long j11 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfnb.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j10 + j11;
            }
        }
        return this.zzn;
    }

    public final void zzE(Uri[] uriArr, String str) {
        zzF(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzF(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzsu zzsu;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzsu = zzY(uriArr[0]);
            } else {
                zzsu[] zzsuArr = new zzsu[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zzsuArr[i10] = zzY(uriArr[i10]);
                }
                zzsu = new zztk(false, false, zzsuArr);
            }
            this.zzh.zzE(zzsu);
            this.zzh.zzs();
            zzcba.zzD().incrementAndGet();
        }
    }

    public final void zzG() {
        zzhu zzhu = this.zzh;
        if (zzhu != null) {
            zzhu.zzD(this);
            this.zzh.zzt();
            this.zzh = null;
            zzcba.zzD().decrementAndGet();
        }
    }

    public final void zzH(long j10) {
        zzm zzm2 = (zzm) this.zzh;
        zzm2.zza(zzm2.zzg(), j10, 5, false);
    }

    public final void zzI(int i10) {
        this.zzc.zzk(i10);
    }

    public final void zzJ(int i10) {
        this.zzc.zzl(i10);
    }

    public final void zzK(zzcaz zzcaz) {
        this.zzk = zzcaz;
    }

    public final void zzL(int i10) {
        this.zzc.zzm(i10);
    }

    public final void zzM(int i10) {
        this.zzc.zzn(i10);
    }

    public final void zzN(boolean z10) {
        this.zzh.zzu(z10);
    }

    public final void zzO(boolean z10) {
        if (this.zzh != null) {
            int i10 = 0;
            while (true) {
                this.zzh.zzB();
                if (i10 < 2) {
                    zzwc zzwc = this.zzd;
                    zzvo zzc2 = zzwc.zzc().zzc();
                    zzc2.zzo(i10, !z10);
                    zzwc.zzj(zzc2);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzP(int i10) {
        for (WeakReference weakReference : this.zzt) {
            zzcdf zzcdf = (zzcdf) weakReference.get();
            if (zzcdf != null) {
                zzcdf.zzm(i10);
            }
        }
    }

    public final void zzQ(Surface surface, boolean z10) {
        zzhu zzhu = this.zzh;
        if (zzhu != null) {
            zzhu.zzv(surface);
        }
    }

    public final void zzR(float f10, boolean z10) {
        zzhu zzhu = this.zzh;
        if (zzhu != null) {
            zzhu.zzw(f10);
        }
    }

    public final void zzS() {
        this.zzh.zzx();
    }

    public final boolean zzT() {
        return this.zzh != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfg zzU(String str, boolean z10) {
        zzcbi zzcbi = this.zze;
        return new zzcdy(str, true != z10 ? null : this, zzcbi.zzd, zzcbi.zzf, zzcbi.zzn, zzcbi.zzo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfg zzV(String str, boolean z10) {
        zzcbi zzcbi = this.zze;
        zzcdf zzcdf = new zzcdf(str, true != z10 ? null : this, zzcbi.zzd, zzcbi.zzf, zzcbi.zzi);
        this.zzt.add(new WeakReference(zzcdf));
        return zzcdf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfg zzW(String str, boolean z10) {
        zzfo zzfo = new zzfo();
        zzfo.zzf(str);
        zzfo.zze(true != z10 ? null : this);
        zzfo.zzc(this.zze.zzd);
        zzfo.zzd(this.zze.zzf);
        zzfo.zzb(true);
        return zzfo.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfg zzX(zzff zzff) {
        return new zzcdi(this.zzb, zzff.zza(), this.zzo, this.zzp, this, new zzcdl(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final zzsu zzY(Uri uri) {
        zzaj zzaj = new zzaj();
        zzaj.zzb(uri);
        zzbg zzc2 = zzaj.zzc();
        zzty zzty = this.zzg;
        zzty.zza(this.zze.zzg);
        return zzty.zzb(zzc2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzZ(boolean z10, long j10) {
        zzcaz zzcaz = this.zzk;
        if (zzcaz != null) {
            zzcaz.zzi(z10, j10);
        }
    }

    public final void zza(zzfg zzfg, zzfl zzfl, boolean z10, int i10) {
        this.zzl += i10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzkn[] zzaa(Handler handler, zzyp zzyp, zzoc zzoc, zzuu zzuu, zzrs zzrs) {
        Context context = this.zzb;
        zzrc zzrc = zzrc.zzb;
        zznq zznq = zznq.zza;
        zzde[] zzdeArr = new zzde[0];
        zzot zzot = new zzot();
        if (zznq == null) {
            Objects.requireNonNull(zznq, "Both parameters are null");
        }
        zzot.zzb(zznq);
        zzot.zzc(zzdeArr);
        zzpf zzd2 = zzot.zzd();
        zzqt zzqt = zzqt.zza;
        return new zzkn[]{new zzpl(context, zzqt, zzrc, false, handler, zzoc, zzd2), new zzxs(this.zzb, zzqt, zzrc, 0, false, handler, zzyp, -1, 30.0f)};
    }

    public final void zzb(zzfg zzfg, zzfl zzfl, boolean z10) {
    }

    public final void zzc(zzfg zzfg, zzfl zzfl, boolean z10) {
    }

    public final void zzd(zzfg zzfg, zzfl zzfl, boolean z10) {
        if (zzfg instanceof zzgd) {
            synchronized (this.zzq) {
                this.zzr.add((zzgd) zzfg);
            }
        } else if (zzfg instanceof zzcdi) {
            this.zzs = (zzcdi) zzfg;
            zzcbj zzcbj = (zzcbj) this.zzf.get();
            if (((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue() && zzcbj != null && this.zzs.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzs.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzs.zzo()));
                b2.f14773i.post(new zzcds(zzcbj, hashMap));
            }
        }
    }

    public final void zze(zzlc zzlc, zzaf zzaf, zzhc zzhc) {
        zzcbj zzcbj = (zzcbj) this.zzf.get();
        if (((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue() && zzcbj != null && zzaf != null) {
            HashMap hashMap = new HashMap();
            String str = zzaf.zzl;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzaf.zzm;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzaf.zzj;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzcbj.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzlc zzlc, int i10, long j10, long j11) {
    }

    public final /* synthetic */ void zzg(zzlc zzlc, zzso zzso) {
    }

    public final void zzh(zzlc zzlc, int i10, long j10) {
        this.zzm += i10;
    }

    public final /* synthetic */ void zzi(zzcg zzcg, zzld zzld) {
    }

    public final void zzj(zzlc zzlc, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        zzcaz zzcaz = this.zzk;
        if (zzcaz == null) {
            return;
        }
        if (this.zze.zzk) {
            zzcaz.zzl("onLoadException", iOException);
        } else {
            zzcaz.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzlc zzlc, int i10) {
        zzcaz zzcaz = this.zzk;
        if (zzcaz != null) {
            zzcaz.zzm(i10);
        }
    }

    public final void zzl(zzlc zzlc, zzbw zzbw) {
        zzcaz zzcaz = this.zzk;
        if (zzcaz != null) {
            zzcaz.zzk("onPlayerError", zzbw);
        }
    }

    public final /* synthetic */ void zzm(zzlc zzlc, zzcf zzcf, zzcf zzcf2, int i10) {
    }

    public final void zzn(zzlc zzlc, Object obj, long j10) {
        zzcaz zzcaz = this.zzk;
        if (zzcaz != null) {
            zzcaz.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzlc zzlc, zzhb zzhb) {
    }

    public final void zzp(zzlc zzlc, zzaf zzaf, zzhc zzhc) {
        zzcbj zzcbj = (zzcbj) this.zzf.get();
        if (((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue() && zzcbj != null && zzaf != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzaf.zzt));
            hashMap.put("bitRate", String.valueOf(zzaf.zzi));
            int i10 = zzaf.zzr;
            int i11 = zzaf.zzs;
            hashMap.put("resolution", i10 + "x" + i11);
            String str = zzaf.zzl;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzaf.zzm;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzaf.zzj;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzcbj.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzlc zzlc, zzda zzda) {
        zzcaz zzcaz = this.zzk;
        if (zzcaz != null) {
            zzcaz.zzC(zzda.zzc, zzda.zzd);
        }
    }

    public final int zzr() {
        return this.zzm;
    }

    public final int zzt() {
        return this.zzh.zzi();
    }

    public final long zzv() {
        return this.zzh.zzl();
    }

    public final long zzw() {
        return (long) this.zzl;
    }

    public final long zzx() {
        if (zzab() && this.zzs.zzp()) {
            return Math.min((long) this.zzl, this.zzs.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzh.zzn();
    }

    public final long zzz() {
        return this.zzh.zzo();
    }
}
