package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzjc extends zzm implements zzhu {
    public static final /* synthetic */ int zzd = 0;
    private final zzkz zzA;
    private final zzla zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzkq zzH;
    private zzcc zzI;
    private zzbm zzJ;
    private zzbm zzK;
    /* access modifiers changed from: private */
    public zzaf zzL;
    /* access modifiers changed from: private */
    public zzaf zzM;
    private AudioTrack zzN;
    /* access modifiers changed from: private */
    public Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzeo zzR;
    /* access modifiers changed from: private */
    public zzhb zzS;
    /* access modifiers changed from: private */
    public zzhb zzT;
    private int zzU;
    private zzk zzV;
    private float zzW;
    /* access modifiers changed from: private */
    public boolean zzX;
    private zzdk zzY;
    private boolean zzZ;
    private boolean zzaa;
    /* access modifiers changed from: private */
    public zzt zzab;
    /* access modifiers changed from: private */
    public zzda zzac;
    private zzbm zzad;
    private zzkh zzae;
    private int zzaf;
    private long zzag;
    private final zzip zzah;
    private zzum zzai;
    final zzwl zzb;
    final zzcc zzc;
    private final zzdo zze;
    private final Context zzf;
    private final zzcg zzg;
    private final zzkn[] zzh;
    private final zzwk zzi;
    private final zzdv zzj;
    private final zzjm zzk;
    /* access modifiers changed from: private */
    public final zzeb zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzck zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsr zzq;
    /* access modifiers changed from: private */
    public final zzlb zzr;
    private final Looper zzs;
    private final zzws zzt;
    private final zzdm zzu;
    private final zziy zzv;
    private final zzja zzw;
    private final zzgv zzx;
    private final zzgz zzy;
    /* access modifiers changed from: private */
    public final zzky zzz;

    static {
        zzbh.zzb("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzwr, java.lang.Object, com.google.android.gms.internal.ads.zzlb] */
    public zzjc(zzht zzht, zzcg zzcg) {
        zzno zza;
        Object obj;
        zzht zzht2 = zzht;
        zzcg zzcg2 = zzcg;
        zzdo zzdo = new zzdo(zzdm.zza);
        this.zze = zzdo;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzew.zze;
            zzee.zzd("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta03] [" + str + "]");
            Context applicationContext = zzht2.zza.getApplicationContext();
            this.zzf = applicationContext;
            ? apply = zzht2.zzh.apply(zzht2.zzb);
            this.zzr = apply;
            this.zzV = zzht2.zzj;
            this.zzQ = zzht2.zzk;
            this.zzX = false;
            this.zzC = zzht2.zzo;
            zziy zziy = new zziy(this, (zzix) null);
            this.zzv = zziy;
            zzja zzja = new zzja((zziz) null);
            this.zzw = zzja;
            Handler handler = new Handler(zzht2.zzi);
            Handler handler2 = handler;
            zzkn[] zza2 = ((zzhn) zzht2.zzc).zza.zza(handler, zziy, zziy, zziy, zziy);
            this.zzh = zza2;
            int length = zza2.length;
            zzwk zzwk = (zzwk) zzht2.zze.zza();
            this.zzi = zzwk;
            this.zzq = zzht.zza(((zzho) zzht2.zzd).zza);
            zzww zzg2 = zzww.zzg(((zzhr) zzht2.zzg).zza);
            this.zzt = zzg2;
            this.zzp = zzht2.zzl;
            this.zzH = zzht2.zzm;
            Looper looper = zzht2.zzi;
            this.zzs = looper;
            zzdm zzdm = zzht2.zzb;
            this.zzu = zzdm;
            this.zzg = zzcg2;
            zzeb zzeb = new zzeb(looper, zzdm, new zzio(this));
            this.zzl = zzeb;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            zzja zzja2 = zzja;
            this.zzai = new zzum(0);
            int length2 = zza2.length;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            zzww zzww = zzg2;
            zzeb zzeb2 = zzeb;
            zzwl zzwl = new zzwl(new zzkp[2], new zzwe[2], zzcy.zza, (Object) null);
            this.zzb = zzwl;
            this.zzn = new zzck();
            zzca zzca = new zzca();
            zzca.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzwk.zzl();
            zzca.zzd(29, true);
            zzcc zze2 = zzca.zze();
            this.zzc = zze2;
            zzca zzca2 = new zzca();
            zzca2.zzb(zze2);
            zzca2.zza(4);
            zzca2.zza(10);
            this.zzI = zzca2.zze();
            this.zzj = zzdm.zzb(looper, (Handler.Callback) null);
            zzip zzip = new zzip(this);
            this.zzah = zzip;
            this.zzae = zzkh.zzg(zzwl);
            apply.zzS(zzcg2, looper);
            int i10 = zzew.zza;
            if (i10 < 31) {
                zza = new zzno();
            } else {
                zza = zzir.zza(applicationContext, this, zzht2.zzp);
            }
            zzno zzno = zza;
            zzkq zzkq = this.zzH;
            zzeb zzeb3 = zzeb2;
            zzhe zzhe = zzht2.zzr;
            zzjm zzjm = r7;
            CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
            zzkn[] zzknArr = zza2;
            zzwk zzwk2 = zzwk;
            Looper looper2 = looper;
            zzwl zzwl2 = zzwl;
            zzww zzww2 = zzww;
            zzwk zzwk3 = zzwk;
            zzja zzja3 = zzja2;
            zziy zziy2 = zziy;
            zzjm zzjm2 = new zzjm(zzknArr, zzwk2, zzwl2, (zzjp) zzht2.zzf.zza(), zzww2, 0, false, apply, zzkq, zzhe, zzht2.zzn, false, looper2, zzdm, zzip, zzno, (Looper) null, (byte[]) null);
            this.zzk = zzjm;
            this.zzW = 1.0f;
            zzbm zzbm = zzbm.zza;
            this.zzJ = zzbm;
            this.zzK = zzbm;
            this.zzad = zzbm;
            this.zzaf = -1;
            if (i10 >= 21) {
                this.zzU = zzew.zzi(applicationContext);
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzU = this.zzN.getAudioSessionId();
            }
            this.zzY = zzdk.zza;
            this.zzZ = true;
            Objects.requireNonNull(apply);
            zzeb3.zzb(apply);
            zzww2.zze(new Handler(looper2), apply);
            zziy zziy3 = zziy2;
            copyOnWriteArraySet3.add(zziy3);
            Handler handler3 = handler2;
            this.zzx = new zzgv(zzht2.zza, handler3, zziy3);
            this.zzy = new zzgz(zzht2.zza, handler3, zziy3);
            zzew.zzU(obj, obj);
            zzky zzky = new zzky(zzht2.zza, handler3, zziy3);
            this.zzz = zzky;
            int i11 = this.zzV.zzc;
            zzky.zzf(3);
            this.zzA = new zzkz(zzht2.zza);
            this.zzB = new zzla(zzht2.zza);
            this.zzab = zzal(zzky);
            this.zzac = zzda.zza;
            this.zzR = zzeo.zza;
            zzwk3.zzi(this.zzV);
            zzap(1, 10, Integer.valueOf(this.zzU));
            zzap(2, 10, Integer.valueOf(this.zzU));
            zzap(1, 3, this.zzV);
            zzap(2, 4, Integer.valueOf(this.zzQ));
            zzap(2, 5, 0);
            zzap(1, 9, Boolean.valueOf(this.zzX));
            zzja zzja4 = zzja3;
            zzap(2, 7, zzja4);
            zzap(6, 8, zzja4);
            zzdo.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzW(zzjc zzjc, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjc.zzar(surface);
        zzjc.zzP = surface;
    }

    private final int zzaf() {
        if (this.zzae.zza.zzo()) {
            return this.zzaf;
        }
        zzkh zzkh = this.zzae;
        return zzkh.zza.zzn(zzkh.zzb.zza, this.zzn).zzd;
    }

    /* access modifiers changed from: private */
    public static int zzag(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private final long zzah(zzkh zzkh) {
        if (zzkh.zza.zzo()) {
            return zzew.zzv(this.zzag);
        }
        if (zzkh.zzb.zzb()) {
            return zzkh.zzr;
        }
        zzcn zzcn = zzkh.zza;
        zzss zzss = zzkh.zzb;
        long j10 = zzkh.zzr;
        zzaj(zzcn, zzss, j10);
        return j10;
    }

    private static long zzai(zzkh zzkh) {
        zzcm zzcm = new zzcm();
        zzck zzck = new zzck();
        zzkh.zza.zzn(zzkh.zzb.zza, zzck);
        long j10 = zzkh.zzc;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = zzkh.zza.zze(zzck.zzd, zzcm, 0).zzm;
        return 0;
    }

    private final long zzaj(zzcn zzcn, zzss zzss, long j10) {
        zzcn.zzn(zzss.zza, this.zzn);
        return j10;
    }

    private final Pair zzak(zzcn zzcn, int i10, long j10) {
        if (zzcn.zzo()) {
            this.zzaf = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzag = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzcn.zzc()) {
            i10 = zzcn.zzg(false);
            long j11 = zzcn.zze(i10, this.zza, 0).zzm;
            j10 = zzew.zzz(0);
        }
        return zzcn.zzl(this.zza, this.zzn, i10, zzew.zzv(j10));
    }

    /* access modifiers changed from: private */
    public static zzt zzal(zzky zzky) {
        return new zzt(0, zzky.zzb(), zzky.zza());
    }

    private final zzkh zzam(zzkh zzkh, zzcn zzcn, Pair pair) {
        zzss zzss;
        zzur zzur;
        zzwl zzwl;
        zzss zzss2;
        List list;
        int i10;
        zzkh zzkh2;
        long j10;
        zzcn zzcn2 = zzcn;
        Pair pair2 = pair;
        zzdl.zzd(zzcn.zzo() || pair2 != null);
        zzcn zzcn3 = zzkh.zza;
        zzkh zzf2 = zzkh.zzf(zzcn);
        if (zzcn.zzo()) {
            zzss zzh2 = zzkh.zzh();
            long zzv2 = zzew.zzv(this.zzag);
            zzkh zza = zzf2.zzb(zzh2, zzv2, zzv2, zzv2, 0, zzur.zza, this.zzb, zzfqk.zzo()).zza(zzh2);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf2.zzb.zza;
        int i11 = zzew.zza;
        boolean z10 = !obj.equals(pair2.first);
        if (z10) {
            zzss = new zzss(pair2.first);
        } else {
            zzss = zzf2.zzb;
        }
        zzss zzss3 = zzss;
        long longValue = ((Long) pair2.second).longValue();
        long zzv3 = zzew.zzv(zzm());
        if (!zzcn3.zzo()) {
            zzcn3.zzn(obj, this.zzn);
        }
        if (z10 || longValue < zzv3) {
            zzss zzss4 = zzss3;
            zzdl.zzf(!zzss4.zzb());
            if (z10) {
                zzur = zzur.zza;
            } else {
                zzur = zzf2.zzh;
            }
            zzur zzur2 = zzur;
            if (z10) {
                zzss2 = zzss4;
                zzwl = this.zzb;
            } else {
                zzss2 = zzss4;
                zzwl = zzf2.zzi;
            }
            zzwl zzwl2 = zzwl;
            if (z10) {
                list = zzfqk.zzo();
            } else {
                list = zzf2.zzj;
            }
            zzkh zza2 = zzf2.zzb(zzss2, longValue, longValue, longValue, 0, zzur2, zzwl2, list).zza(zzss2);
            zza2.zzp = longValue;
            return zza2;
        }
        if (i10 == 0) {
            int zza3 = zzcn2.zza(zzf2.zzk.zza);
            if (zza3 != -1 && zzcn2.zzd(zza3, this.zzn, false).zzd == zzcn2.zzn(zzss3.zza, this.zzn).zzd) {
                return zzf2;
            }
            zzcn2.zzn(zzss3.zza, this.zzn);
            if (zzss3.zzb()) {
                j10 = this.zzn.zzg(zzss3.zzb, zzss3.zzc);
            } else {
                j10 = this.zzn.zze;
            }
            zzkh2 = zzf2.zzb(zzss3, zzf2.zzr, zzf2.zzr, zzf2.zzd, j10 - zzf2.zzr, zzf2.zzh, zzf2.zzi, zzf2.zzj).zza(zzss3);
            zzkh2.zzp = j10;
        } else {
            zzss zzss5 = zzss3;
            zzdl.zzf(!zzss5.zzb());
            long max = Math.max(0, zzf2.zzq - (longValue - zzv3));
            long j11 = zzf2.zzp;
            if (zzf2.zzk.equals(zzf2.zzb)) {
                j11 = longValue + max;
            }
            zzkh2 = zzf2.zzb(zzss5, longValue, longValue, longValue, max, zzf2.zzh, zzf2.zzi, zzf2.zzj);
            zzkh2.zzp = j11;
        }
        return zzkh2;
    }

    private final zzkk zzan(zzkj zzkj) {
        int zzaf2 = zzaf();
        zzjm zzjm = this.zzk;
        return new zzkk(zzjm, zzkj, this.zzae.zza, zzaf2 == -1 ? 0 : zzaf2, this.zzu, zzjm.zzb());
    }

    /* access modifiers changed from: private */
    public final void zzao(int i10, int i11) {
        if (i10 != this.zzR.zzb() || i11 != this.zzR.zza()) {
            this.zzR = new zzeo(i10, i11);
            zzeb zzeb = this.zzl;
            zzeb.zzd(24, new zzhw(i10, i11));
            zzeb.zzc();
            zzap(2, 13, new zzeo(i10, i11));
        }
    }

    private final void zzap(int i10, int i11, Object obj) {
        zzkn[] zzknArr = this.zzh;
        int length = zzknArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzkn zzkn = zzknArr[i12];
            if (zzkn.zzb() == i10) {
                zzkk zzan = zzan(zzkn);
                zzan.zzf(i11);
                zzan.zze(obj);
                zzan.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzaq() {
        zzap(1, 2, Float.valueOf(this.zzW * this.zzy.zza()));
    }

    /* access modifiers changed from: private */
    public final void zzar(Object obj) {
        boolean z10;
        ArrayList<zzkk> arrayList = new ArrayList<>();
        zzkn[] zzknArr = this.zzh;
        int length = zzknArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= 2) {
                break;
            }
            zzkn zzkn = zzknArr[i10];
            if (zzkn.zzb() == 2) {
                zzkk zzan = zzan(zzkn);
                zzan.zzf(1);
                zzan.zze(obj);
                zzan.zzd();
                arrayList.add(zzan);
            }
            i10++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (zzkk zzi2 : arrayList) {
                    zzi2.zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z10) {
            zzas(false, zzhj.zzd(new zzjn(3), 1003));
        }
    }

    private final void zzas(boolean z10, zzhj zzhj) {
        zzkh zzkh = this.zzae;
        zzkh zza = zzkh.zza(zzkh.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0;
        zzkh zze2 = zza.zze(1);
        if (zzhj != null) {
            zze2 = zze2.zzd(zzhj);
        }
        zzkh zzkh2 = zze2;
        this.zzD++;
        this.zzk.zzo();
        zzau(zzkh2, 0, 1, false, zzkh2.zza.zzo() && !this.zzae.zza.zzo(), 4, zzah(zzkh2), -1, false);
    }

    /* access modifiers changed from: private */
    public final void zzat(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzkh zzkh = this.zzae;
        if (zzkh.zzl != z11 || zzkh.zzm != i12) {
            this.zzD++;
            zzkh zzc2 = zzkh.zzc(z11, i12);
            this.zzk.zzn(z11, i12);
            zzau(zzc2, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzau(com.google.android.gms.internal.ads.zzkh r44, int r45, int r46, boolean r47, boolean r48, int r49, long r50, int r52, boolean r53) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r49
            com.google.android.gms.internal.ads.zzkh r3 = r0.zzae
            r0.zzae = r1
            com.google.android.gms.internal.ads.zzcn r4 = r3.zza
            com.google.android.gms.internal.ads.zzcn r5 = r1.zza
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzcn r6 = r3.zza
            com.google.android.gms.internal.ads.zzcn r7 = r1.zza
            boolean r8 = r7.zzo()
            r10 = 3
            r11 = 0
            r13 = 0
            r14 = -1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.zzo()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r15)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.zzo()
            boolean r9 = r6.zzo()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r6.<init>(r7, r8)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.zzss r8 = r3.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzck r9 = r0.zzn
            com.google.android.gms.internal.ads.zzck r8 = r6.zzn(r8, r9)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzcm r9 = r0.zza
            com.google.android.gms.internal.ads.zzcm r6 = r6.zze(r8, r9, r11)
            java.lang.Object r6 = r6.zzc
            com.google.android.gms.internal.ads.zzss r8 = r1.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzck r9 = r0.zzn
            com.google.android.gms.internal.ads.zzck r8 = r7.zzn(r8, r9)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzcm r9 = r0.zza
            com.google.android.gms.internal.ads.zzcm r7 = r7.zze(r8, r9, r11)
            java.lang.Object r7 = r7.zzc
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r48 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r6 = 1
            goto L_0x008a
        L_0x0081:
            if (r48 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r6 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r6 = 3
        L_0x008a:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r8, r6)
            r6 = r7
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r48 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzss r6 = r3.zzb
            long r6 = r6.zzd
            com.google.android.gms.internal.ads.zzss r8 = r1.zzb
            long r8 = r8.zzd
            int r16 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x00b9
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r6.<init>(r7, r8)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r15)
        L_0x00c0:
            java.lang.Object r7 = r6.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzJ
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzcn r15 = r1.zza
            boolean r15 = r15.zzo()
            if (r15 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzcn r15 = r1.zza
            com.google.android.gms.internal.ads.zzss r9 = r1.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzck r10 = r0.zzn
            com.google.android.gms.internal.ads.zzck r9 = r15.zzn(r9, r10)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzcn r10 = r1.zza
            com.google.android.gms.internal.ads.zzcm r15 = r0.zza
            com.google.android.gms.internal.ads.zzcm r9 = r10.zze(r9, r15, r11)
            com.google.android.gms.internal.ads.zzbg r9 = r9.zzd
            goto L_0x00f6
        L_0x00f5:
            r9 = 0
        L_0x00f6:
            com.google.android.gms.internal.ads.zzbm r10 = com.google.android.gms.internal.ads.zzbm.zza
            r0.zzad = r10
            goto L_0x00fc
        L_0x00fb:
            r9 = 0
        L_0x00fc:
            if (r7 != 0) goto L_0x0108
            java.util.List r10 = r3.zzj
            java.util.List r15 = r1.zzj
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x0160
        L_0x0108:
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzad
            com.google.android.gms.internal.ads.zzbk r8 = r8.zza()
            java.util.List r10 = r1.zzj
            r15 = 0
        L_0x0111:
            int r14 = r10.size()
            if (r15 >= r14) goto L_0x0132
            java.lang.Object r14 = r10.get(r15)
            com.google.android.gms.internal.ads.zzbq r14 = (com.google.android.gms.internal.ads.zzbq) r14
        L_0x011d:
            int r5 = r14.zza()
            if (r13 >= r5) goto L_0x012d
            com.google.android.gms.internal.ads.zzbp r5 = r14.zzb(r13)
            r5.zza(r8)
            int r13 = r13 + 1
            goto L_0x011d
        L_0x012d:
            int r15 = r15 + 1
            r5 = 1
            r13 = 0
            goto L_0x0111
        L_0x0132:
            com.google.android.gms.internal.ads.zzbm r5 = r8.zzu()
            r0.zzad = r5
            com.google.android.gms.internal.ads.zzcn r5 = r43.zzq()
            boolean r8 = r5.zzo()
            if (r8 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzad
            goto L_0x0160
        L_0x0145:
            int r8 = r43.zzg()
            com.google.android.gms.internal.ads.zzcm r10 = r0.zza
            com.google.android.gms.internal.ads.zzcm r5 = r5.zze(r8, r10, r11)
            com.google.android.gms.internal.ads.zzbg r5 = r5.zzd
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzad
            com.google.android.gms.internal.ads.zzbk r8 = r8.zza()
            com.google.android.gms.internal.ads.zzbm r5 = r5.zzg
            r8.zzb(r5)
            com.google.android.gms.internal.ads.zzbm r8 = r8.zzu()
        L_0x0160:
            com.google.android.gms.internal.ads.zzbm r5 = r0.zzJ
            boolean r5 = r8.equals(r5)
            r10 = 1
            r5 = r5 ^ r10
            r0.zzJ = r8
            boolean r8 = r3.zzl
            boolean r10 = r1.zzl
            if (r8 == r10) goto L_0x0172
            r10 = 1
            goto L_0x0173
        L_0x0172:
            r10 = 0
        L_0x0173:
            int r8 = r3.zze
            int r13 = r1.zze
            if (r8 == r13) goto L_0x017b
            r8 = 1
            goto L_0x017c
        L_0x017b:
            r8 = 0
        L_0x017c:
            if (r8 != 0) goto L_0x0180
            if (r10 == 0) goto L_0x0183
        L_0x0180:
            r43.zzav()
        L_0x0183:
            boolean r13 = r3.zzg
            boolean r14 = r1.zzg
            if (r13 == r14) goto L_0x018b
            r13 = 1
            goto L_0x018c
        L_0x018b:
            r13 = 0
        L_0x018c:
            if (r4 == 0) goto L_0x019b
            com.google.android.gms.internal.ads.zzeb r4 = r0.zzl
            com.google.android.gms.internal.ads.zzhx r14 = new com.google.android.gms.internal.ads.zzhx
            r15 = r45
            r14.<init>(r1, r15)
            r15 = 0
            r4.zzd(r15, r14)
        L_0x019b:
            if (r48 == 0) goto L_0x02c9
            com.google.android.gms.internal.ads.zzck r4 = new com.google.android.gms.internal.ads.zzck
            r4.<init>()
            com.google.android.gms.internal.ads.zzcn r14 = r3.zza
            boolean r14 = r14.zzo()
            if (r14 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.zzss r14 = r3.zzb
            java.lang.Object r14 = r14.zza
            com.google.android.gms.internal.ads.zzcn r15 = r3.zza
            r15.zzn(r14, r4)
            int r15 = r4.zzd
            com.google.android.gms.internal.ads.zzcn r11 = r3.zza
            int r11 = r11.zza(r14)
            com.google.android.gms.internal.ads.zzcn r12 = r3.zza
            r45 = r11
            com.google.android.gms.internal.ads.zzcm r11 = r0.zza
            r17 = r13
            r48 = r14
            r13 = 0
            com.google.android.gms.internal.ads.zzcm r11 = r12.zze(r15, r11, r13)
            java.lang.Object r11 = r11.zzc
            com.google.android.gms.internal.ads.zzcm r12 = r0.zza
            com.google.android.gms.internal.ads.zzbg r12 = r12.zzd
            r23 = r45
            r22 = r48
            r19 = r11
            r21 = r12
            r20 = r15
            goto L_0x01e8
        L_0x01dc:
            r17 = r13
            r20 = r52
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01e8:
            if (r2 != 0) goto L_0x0212
            com.google.android.gms.internal.ads.zzss r11 = r3.zzb
            boolean r11 = r11.zzb()
            if (r11 == 0) goto L_0x0201
            com.google.android.gms.internal.ads.zzss r11 = r3.zzb
            int r12 = r11.zzb
            int r11 = r11.zzc
            long r11 = r4.zzg(r12, r11)
            long r13 = zzai(r3)
            goto L_0x0224
        L_0x0201:
            com.google.android.gms.internal.ads.zzss r11 = r3.zzb
            int r11 = r11.zze
            r12 = -1
            if (r11 == r12) goto L_0x020f
            com.google.android.gms.internal.ads.zzkh r4 = r0.zzae
            long r11 = zzai(r4)
            goto L_0x0223
        L_0x020f:
            long r11 = r4.zze
            goto L_0x0223
        L_0x0212:
            com.google.android.gms.internal.ads.zzss r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L_0x0221
            long r11 = r3.zzr
            long r13 = zzai(r3)
            goto L_0x0224
        L_0x0221:
            long r11 = r3.zzr
        L_0x0223:
            r13 = r11
        L_0x0224:
            com.google.android.gms.internal.ads.zzcf r4 = new com.google.android.gms.internal.ads.zzcf
            int r15 = com.google.android.gms.internal.ads.zzew.zza
            com.google.android.gms.internal.ads.zzss r15 = r3.zzb
            r30 = r10
            int r10 = r15.zzb
            int r15 = r15.zzc
            long r24 = com.google.android.gms.internal.ads.zzew.zzz(r11)
            long r26 = com.google.android.gms.internal.ads.zzew.zzz(r13)
            r18 = r4
            r28 = r10
            r29 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r10 = r43.zzg()
            com.google.android.gms.internal.ads.zzkh r11 = r0.zzae
            com.google.android.gms.internal.ads.zzcn r11 = r11.zza
            boolean r11 = r11.zzo()
            if (r11 != 0) goto L_0x0282
            com.google.android.gms.internal.ads.zzkh r11 = r0.zzae
            com.google.android.gms.internal.ads.zzss r12 = r11.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzcn r11 = r11.zza
            com.google.android.gms.internal.ads.zzck r13 = r0.zzn
            r11.zzn(r12, r13)
            com.google.android.gms.internal.ads.zzkh r11 = r0.zzae
            com.google.android.gms.internal.ads.zzcn r11 = r11.zza
            int r11 = r11.zza(r12)
            com.google.android.gms.internal.ads.zzkh r13 = r0.zzae
            com.google.android.gms.internal.ads.zzcn r13 = r13.zza
            com.google.android.gms.internal.ads.zzcm r14 = r0.zza
            r45 = r11
            r15 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzcm r11 = r13.zze(r10, r14, r11)
            java.lang.Object r11 = r11.zzc
            com.google.android.gms.internal.ads.zzcm r12 = r0.zza
            com.google.android.gms.internal.ads.zzbg r12 = r12.zzd
            r36 = r45
            r32 = r11
            r34 = r12
            r35 = r15
            goto L_0x028a
        L_0x0282:
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = -1
        L_0x028a:
            long r37 = com.google.android.gms.internal.ads.zzew.zzz(r50)
            com.google.android.gms.internal.ads.zzcf r11 = new com.google.android.gms.internal.ads.zzcf
            com.google.android.gms.internal.ads.zzkh r12 = r0.zzae
            com.google.android.gms.internal.ads.zzss r12 = r12.zzb
            boolean r12 = r12.zzb()
            if (r12 == 0) goto L_0x02a7
            com.google.android.gms.internal.ads.zzkh r12 = r0.zzae
            long r12 = zzai(r12)
            long r12 = com.google.android.gms.internal.ads.zzew.zzz(r12)
            r39 = r12
            goto L_0x02a9
        L_0x02a7:
            r39 = r37
        L_0x02a9:
            com.google.android.gms.internal.ads.zzkh r12 = r0.zzae
            com.google.android.gms.internal.ads.zzss r12 = r12.zzb
            int r13 = r12.zzb
            int r12 = r12.zzc
            r31 = r11
            r33 = r10
            r41 = r13
            r42 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r42)
            com.google.android.gms.internal.ads.zzeb r10 = r0.zzl
            r12 = 11
            com.google.android.gms.internal.ads.zzid r13 = new com.google.android.gms.internal.ads.zzid
            r13.<init>(r2, r4, r11)
            r10.zzd(r12, r13)
            goto L_0x02cd
        L_0x02c9:
            r30 = r10
            r17 = r13
        L_0x02cd:
            if (r7 == 0) goto L_0x02da
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzie r4 = new com.google.android.gms.internal.ads.zzie
            r4.<init>(r9, r6)
            r6 = 1
            r2.zzd(r6, r4)
        L_0x02da:
            com.google.android.gms.internal.ads.zzhj r2 = r3.zzf
            com.google.android.gms.internal.ads.zzhj r4 = r1.zzf
            if (r2 == r4) goto L_0x02fa
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzif r4 = new com.google.android.gms.internal.ads.zzif
            r4.<init>(r1)
            r6 = 10
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzhj r2 = r1.zzf
            if (r2 == 0) goto L_0x02fa
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzig r4 = new com.google.android.gms.internal.ads.zzig
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L_0x02fa:
            com.google.android.gms.internal.ads.zzwl r2 = r3.zzi
            com.google.android.gms.internal.ads.zzwl r4 = r1.zzi
            if (r2 == r4) goto L_0x0312
            com.google.android.gms.internal.ads.zzwk r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzo(r4)
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzih r4 = new com.google.android.gms.internal.ads.zzih
            r4.<init>(r1)
            r6 = 2
            r2.zzd(r6, r4)
        L_0x0312:
            if (r5 == 0) goto L_0x0322
            com.google.android.gms.internal.ads.zzbm r2 = r0.zzJ
            com.google.android.gms.internal.ads.zzeb r4 = r0.zzl
            r5 = 14
            com.google.android.gms.internal.ads.zzii r6 = new com.google.android.gms.internal.ads.zzii
            r6.<init>(r2)
            r4.zzd(r5, r6)
        L_0x0322:
            if (r17 == 0) goto L_0x032f
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzij r4 = new com.google.android.gms.internal.ads.zzij
            r4.<init>(r1)
            r5 = 3
            r2.zzd(r5, r4)
        L_0x032f:
            if (r8 != 0) goto L_0x0333
            if (r30 == 0) goto L_0x033e
        L_0x0333:
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzik r4 = new com.google.android.gms.internal.ads.zzik
            r4.<init>(r1)
            r5 = -1
            r2.zzd(r5, r4)
        L_0x033e:
            if (r8 == 0) goto L_0x034b
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r4 = 4
            com.google.android.gms.internal.ads.zzil r5 = new com.google.android.gms.internal.ads.zzil
            r5.<init>(r1)
            r2.zzd(r4, r5)
        L_0x034b:
            if (r30 == 0) goto L_0x035a
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r4 = 5
            com.google.android.gms.internal.ads.zzhy r5 = new com.google.android.gms.internal.ads.zzhy
            r6 = r46
            r5.<init>(r1, r6)
            r2.zzd(r4, r5)
        L_0x035a:
            int r2 = r3.zzm
            int r4 = r1.zzm
            if (r2 == r4) goto L_0x036b
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r4 = 6
            com.google.android.gms.internal.ads.zzhz r5 = new com.google.android.gms.internal.ads.zzhz
            r5.<init>(r1)
            r2.zzd(r4, r5)
        L_0x036b:
            boolean r2 = zzax(r3)
            boolean r4 = zzax(r44)
            if (r2 == r4) goto L_0x0380
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r4 = 7
            com.google.android.gms.internal.ads.zzia r5 = new com.google.android.gms.internal.ads.zzia
            r5.<init>(r1)
            r2.zzd(r4, r5)
        L_0x0380:
            com.google.android.gms.internal.ads.zzby r2 = r3.zzn
            com.google.android.gms.internal.ads.zzby r4 = r1.zzn
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0396
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r4 = 12
            com.google.android.gms.internal.ads.zzib r5 = new com.google.android.gms.internal.ads.zzib
            r5.<init>(r1)
            r2.zzd(r4, r5)
        L_0x0396:
            if (r47 == 0) goto L_0x03a0
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            com.google.android.gms.internal.ads.zzic r4 = com.google.android.gms.internal.ads.zzic.zza
            r5 = -1
            r2.zzd(r5, r4)
        L_0x03a0:
            com.google.android.gms.internal.ads.zzcc r2 = r0.zzI
            com.google.android.gms.internal.ads.zzcg r4 = r0.zzg
            com.google.android.gms.internal.ads.zzcc r5 = r0.zzc
            com.google.android.gms.internal.ads.zzcc r4 = com.google.android.gms.internal.ads.zzew.zzG(r4, r5)
            r0.zzI = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03be
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r4 = 13
            com.google.android.gms.internal.ads.zzin r5 = new com.google.android.gms.internal.ads.zzin
            r5.<init>(r0)
            r2.zzd(r4, r5)
        L_0x03be:
            com.google.android.gms.internal.ads.zzeb r2 = r0.zzl
            r2.zzc()
            boolean r2 = r3.zzo
            boolean r3 = r1.zzo
            if (r2 == r3) goto L_0x03e1
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x03cf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e1
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzhk r3 = (com.google.android.gms.internal.ads.zzhk) r3
            boolean r4 = r1.zzo
            r3.zza(r4)
            goto L_0x03cf
        L_0x03e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjc.zzau(com.google.android.gms.internal.ads.zzkh, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void zzav() {
        int zzi2 = zzi();
        if (zzi2 == 2 || zzi2 == 3) {
            zzaw();
            boolean z10 = this.zzae.zzo;
            zzy();
            zzy();
        }
    }

    private final void zzaw() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzI2 = zzew.zzI("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzZ) {
                if (this.zzaa) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzee.zzf("ExoPlayerImpl", zzI2, illegalStateException);
                this.zzaa = true;
                return;
            }
            throw new IllegalStateException(zzI2);
        }
    }

    private static boolean zzax(zzkh zzkh) {
        return zzkh.zze == 3 && zzkh.zzl && zzkh.zzm == 0;
    }

    public final boolean zzA() {
        zzaw();
        return this.zzae.zzb.zzb();
    }

    public final int zzB() {
        zzaw();
        int length = this.zzh.length;
        return 2;
    }

    public final void zzC(zzle zzle) {
        zzlb zzlb = this.zzr;
        Objects.requireNonNull(zzle);
        zzlb.zzw(zzle);
    }

    public final void zzD(zzle zzle) {
        zzaw();
        this.zzr.zzR(zzle);
    }

    public final void zzE(zzsu zzsu) {
        zzaw();
        List singletonList = Collections.singletonList(zzsu);
        zzaw();
        zzaw();
        zzaf();
        zzn();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzai = this.zzai.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzke zzke = new zzke((zzsu) singletonList.get(i11), this.zzp);
            arrayList.add(zzke);
            this.zzo.add(i11, new zzjb(zzke.zzb, zzke.zza.zzB()));
        }
        this.zzai = this.zzai.zzg(0, arrayList.size());
        zzkl zzkl = new zzkl(this.zzo, this.zzai, (byte[]) null);
        if (zzkl.zzo() || zzkl.zzc() >= 0) {
            int zzg2 = zzkl.zzg(false);
            zzkh zzam = zzam(this.zzae, zzkl, zzak(zzkl, zzg2, -9223372036854775807L));
            int i12 = zzam.zze;
            if (!(zzg2 == -1 || i12 == 1)) {
                i12 = (zzkl.zzo() || zzg2 >= zzkl.zzc()) ? 4 : 2;
            }
            zzkh zze2 = zzam.zze(i12);
            this.zzk.zzq(arrayList, zzg2, zzew.zzv(-9223372036854775807L), this.zzai);
            zzau(zze2, 0, 1, false, !this.zzae.zzb.zza.equals(zze2.zzb.zza) && !this.zzae.zza.zzo(), 4, zzah(zze2), -1, false);
            return;
        }
        throw new zzag(zzkl, -1, -9223372036854775807L);
    }

    public final zzhj zzJ() {
        zzaw();
        return this.zzae.zzf;
    }

    public final void zza(int i10, long j10, int i11, boolean z10) {
        int i12 = i10;
        zzaw();
        int i13 = 1;
        zzdl.zzd(i12 >= 0);
        this.zzr.zzx();
        zzcn zzcn = this.zzae.zza;
        if (zzcn.zzo() || i12 < zzcn.zzc()) {
            this.zzD++;
            if (zzA()) {
                zzee.zze("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzjk zzjk = new zzjk(this.zzae);
                zzjk.zza(1);
                this.zzah.zza.zzab(zzjk);
                return;
            }
            if (zzi() != 1) {
                i13 = 2;
            }
            int zzg2 = zzg();
            zzkh zzam = zzam(this.zzae.zze(i13), zzcn, zzak(zzcn, i12, j10));
            this.zzk.zzl(zzcn, i12, zzew.zzv(j10));
            zzau(zzam, 0, 1, true, true, 1, zzah(zzam), zzg2, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaa(zzjk zzjk) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.zzD - zzjk.zzb;
        this.zzD = i10;
        boolean z11 = true;
        if (zzjk.zzc) {
            this.zzE = zzjk.zzd;
            this.zzF = true;
        }
        if (zzjk.zze) {
            this.zzG = zzjk.zzf;
        }
        if (i10 == 0) {
            zzcn zzcn = zzjk.zza.zza;
            if (!this.zzae.zza.zzo() && zzcn.zzo()) {
                this.zzaf = -1;
                this.zzag = 0;
            }
            if (!zzcn.zzo()) {
                List zzw2 = ((zzkl) zzcn).zzw();
                zzdl.zzf(zzw2.size() == this.zzo.size());
                for (int i11 = 0; i11 < zzw2.size(); i11++) {
                    ((zzjb) this.zzo.get(i11)).zzb = (zzcn) zzw2.get(i11);
                }
            }
            if (this.zzF) {
                if (zzjk.zza.zzb.equals(this.zzae.zzb) && zzjk.zza.zzd == this.zzae.zzr) {
                    z11 = false;
                }
                if (z11) {
                    if (zzcn.zzo() || zzjk.zza.zzb.zzb()) {
                        j11 = zzjk.zza.zzd;
                    } else {
                        zzkh zzkh = zzjk.zza;
                        zzss zzss = zzkh.zzb;
                        j11 = zzkh.zzd;
                        zzaj(zzcn, zzss, j11);
                    }
                    z10 = z11;
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                    z10 = z11;
                }
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzF = false;
            zzau(zzjk.zza, 1, this.zzG, false, z10, this.zzE, j10, -1, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(zzjk zzjk) {
        this.zzj.zzh(new zziq(this, zzjk));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzac(zzcd zzcd) {
        zzcd.zza(this.zzI);
    }

    public final int zze() {
        zzaw();
        if (zzA()) {
            return this.zzae.zzb.zzb;
        }
        return -1;
    }

    public final int zzf() {
        zzaw();
        if (zzA()) {
            return this.zzae.zzb.zzc;
        }
        return -1;
    }

    public final int zzg() {
        zzaw();
        int zzaf2 = zzaf();
        if (zzaf2 == -1) {
            return 0;
        }
        return zzaf2;
    }

    public final int zzh() {
        zzaw();
        if (this.zzae.zza.zzo()) {
            return 0;
        }
        zzkh zzkh = this.zzae;
        return zzkh.zza.zza(zzkh.zzb.zza);
    }

    public final int zzi() {
        zzaw();
        return this.zzae.zze;
    }

    public final int zzj() {
        zzaw();
        return this.zzae.zzm;
    }

    public final int zzk() {
        zzaw();
        return 0;
    }

    public final long zzl() {
        zzaw();
        if (zzA()) {
            zzkh zzkh = this.zzae;
            if (zzkh.zzk.equals(zzkh.zzb)) {
                return zzew.zzz(this.zzae.zzp);
            }
            return zzo();
        }
        zzaw();
        if (this.zzae.zza.zzo()) {
            return this.zzag;
        }
        zzkh zzkh2 = this.zzae;
        long j10 = 0;
        if (zzkh2.zzk.zzd != zzkh2.zzb.zzd) {
            return zzew.zzz(zzkh2.zza.zze(zzg(), this.zza, 0).zzn);
        }
        long j11 = zzkh2.zzp;
        if (this.zzae.zzk.zzb()) {
            zzkh zzkh3 = this.zzae;
            zzkh3.zza.zzn(zzkh3.zzk.zza, this.zzn).zzh(this.zzae.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzkh zzkh4 = this.zzae;
        zzaj(zzkh4.zza, zzkh4.zzk, j10);
        return zzew.zzz(j10);
    }

    public final long zzm() {
        zzaw();
        if (!zzA()) {
            return zzn();
        }
        zzkh zzkh = this.zzae;
        zzkh.zza.zzn(zzkh.zzb.zza, this.zzn);
        zzkh zzkh2 = this.zzae;
        long j10 = zzkh2.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzkh2.zza.zze(zzg(), this.zza, 0).zzm;
            return zzew.zzz(0);
        }
        int i10 = zzew.zza;
        return zzew.zzz(j10) + zzew.zzz(0);
    }

    public final long zzn() {
        zzaw();
        return zzew.zzz(zzah(this.zzae));
    }

    public final long zzo() {
        zzaw();
        if (!zzA()) {
            zzcn zzq2 = zzq();
            if (zzq2.zzo()) {
                return -9223372036854775807L;
            }
            return zzew.zzz(zzq2.zze(zzg(), this.zza, 0).zzn);
        }
        zzkh zzkh = this.zzae;
        zzss zzss = zzkh.zzb;
        zzkh.zza.zzn(zzss.zza, this.zzn);
        return zzew.zzz(this.zzn.zzg(zzss.zzb, zzss.zzc));
    }

    public final long zzp() {
        zzaw();
        return zzew.zzz(this.zzae.zzq);
    }

    public final zzcn zzq() {
        zzaw();
        return this.zzae.zza;
    }

    public final zzcy zzr() {
        zzaw();
        return this.zzae.zzi.zzd;
    }

    public final void zzs() {
        zzaw();
        boolean zzy2 = zzy();
        int i10 = 2;
        int zzb2 = this.zzy.zzb(zzy2, 2);
        zzat(zzy2, zzb2, zzag(zzy2, zzb2));
        zzkh zzkh = this.zzae;
        if (zzkh.zze == 1) {
            zzkh zzd2 = zzkh.zzd((zzhj) null);
            if (true == zzd2.zza.zzo()) {
                i10 = 4;
            }
            zzkh zze2 = zzd2.zze(i10);
            this.zzD++;
            this.zzk.zzk();
            zzau(zze2, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void zzt() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzew.zze;
        String zza = zzbh.zza();
        zzee.zzd("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta03] [" + str + "] [" + zza + "]");
        zzaw();
        if (zzew.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzeb zzeb = this.zzl;
            zzeb.zzd(10, zzhv.zza);
            zzeb.zzc();
        }
        this.zzl.zze();
        this.zzj.zze((Object) null);
        this.zzt.zzf(this.zzr);
        zzkh zze2 = this.zzae.zze(1);
        this.zzae = zze2;
        zzkh zza2 = zze2.zza(zze2.zzb);
        this.zzae = zza2;
        zza2.zzp = zza2.zzr;
        this.zzae.zzq = 0;
        this.zzr.zzQ();
        this.zzi.zzh();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzY = zzdk.zza;
    }

    public final void zzu(boolean z10) {
        zzaw();
        int zzb2 = this.zzy.zzb(z10, zzi());
        zzat(z10, zzb2, zzag(z10, zzb2));
    }

    public final void zzv(Surface surface) {
        zzaw();
        zzar(surface);
        int i10 = surface == null ? 0 : -1;
        zzao(i10, i10);
    }

    public final void zzw(float f10) {
        zzaw();
        float zza = zzew.zza(f10, 0.0f, 1.0f);
        if (this.zzW != zza) {
            this.zzW = zza;
            zzaq();
            zzeb zzeb = this.zzl;
            zzeb.zzd(22, new zzim(zza));
            zzeb.zzc();
        }
    }

    public final void zzx() {
        zzaw();
        zzaw();
        this.zzy.zzb(zzy(), 1);
        zzas(false, (zzhj) null);
        this.zzY = new zzdk(zzfqk.zzo(), this.zzae.zzr);
    }

    public final boolean zzy() {
        zzaw();
        return this.zzae.zzl;
    }

    public final boolean zzz() {
        zzaw();
        return false;
    }
}
