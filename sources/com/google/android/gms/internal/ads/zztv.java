package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zztv implements zzsq, zzzx, zzwy, zzxd, zzuh {
    /* access modifiers changed from: private */
    public static final Map zzb;
    /* access modifiers changed from: private */
    public static final zzaf zzc;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwx zzM;
    private final zzwt zzN;
    private final Uri zzd;
    private final zzfg zze;
    private final zzpz zzf;
    private final zztb zzg;
    private final zzpt zzh;
    private final zztr zzi;
    /* access modifiers changed from: private */
    public final long zzj;
    private final zzxg zzk = new zzxg("ProgressiveMediaPeriod");
    private final zztl zzl;
    private final zzdo zzm;
    private final Runnable zzn;
    /* access modifiers changed from: private */
    public final Runnable zzo;
    /* access modifiers changed from: private */
    public final Handler zzp;
    private zzsp zzq;
    /* access modifiers changed from: private */
    public zzacy zzr;
    private zzui[] zzs;
    private zztt[] zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztu zzx;
    private zzaax zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzad = new zzad();
        zzad.zzH("icy");
        zzad.zzS("application/x-icy");
        zzc = zzad.zzY();
    }

    public zztv(Uri uri, zzfg zzfg, zztl zztl, zzpz zzpz, zzpt zzpt, zzwx zzwx, zztb zztb, zztr zztr, zzwt zzwt, String str, int i10, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzfg;
        this.zzf = zzpz;
        this.zzh = zzpt;
        this.zzM = zzwx;
        this.zzg = zztb;
        this.zzi = zztr;
        this.zzN = zzwt;
        this.zzj = (long) i10;
        this.zzl = zztl;
        this.zzm = new zzdo(zzdm.zza);
        this.zzn = new zztm(this);
        this.zzo = new zztn(this);
        this.zzp = zzew.zzD((Handler.Callback) null);
        this.zzt = new zztt[0];
        this.zzs = new zzui[0];
        this.zzH = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = 1;
    }

    private final int zzP() {
        int i10 = 0;
        for (zzui zzc2 : this.zzs) {
            i10 += zzc2.zzc();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public final long zzQ(boolean z10) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        while (true) {
            zzui[] zzuiArr = this.zzs;
            if (i10 >= zzuiArr.length) {
                return j10;
            }
            if (!z10) {
                zztu zztu = this.zzx;
                Objects.requireNonNull(zztu);
                if (!zztu.zzc[i10]) {
                    i10++;
                }
            }
            j10 = Math.max(j10, zzuiArr[i10].zzg());
            i10++;
        }
    }

    private final zzabb zzR(zztt zztt) {
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zztt.equals(this.zzt[i10])) {
                return this.zzs[i10];
            }
        }
        zzui zzui = new zzui(this.zzN, this.zzf, this.zzh, (byte[]) null);
        zzui.zzu(this);
        int i11 = length + 1;
        zztt[] zzttArr = (zztt[]) Arrays.copyOf(this.zzt, i11);
        zzttArr[length] = zztt;
        this.zzt = (zztt[]) zzew.zzad(zzttArr);
        zzui[] zzuiArr = (zzui[]) Arrays.copyOf(this.zzs, i11);
        zzuiArr[length] = zzui;
        this.zzs = (zzui[]) zzew.zzad(zzuiArr);
        return zzui;
    }

    private final void zzS() {
        zzdl.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    /* access modifiers changed from: private */
    public final void zzT() {
        int i10;
        zzbq zzbq;
        if (!this.zzL && !this.zzv && this.zzu && this.zzy != null) {
            zzui[] zzuiArr = this.zzs;
            int length = zzuiArr.length;
            int i11 = 0;
            while (i11 < length) {
                if (zzuiArr[i11].zzh() != null) {
                    i11++;
                } else {
                    return;
                }
            }
            this.zzm.zzc();
            int length2 = this.zzs.length;
            zzcp[] zzcpArr = new zzcp[length2];
            boolean[] zArr = new boolean[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                zzaf zzh2 = this.zzs[i12].zzh();
                Objects.requireNonNull(zzh2);
                String str = zzh2.zzm;
                boolean zzg2 = zzbt.zzg(str);
                boolean z10 = zzg2 || zzbt.zzh(str);
                zArr[i12] = z10;
                this.zzw = z10 | this.zzw;
                zzacy zzacy = this.zzr;
                if (zzacy != null) {
                    if (zzg2 || this.zzt[i12].zzb) {
                        zzbq zzbq2 = zzh2.zzk;
                        if (zzbq2 == null) {
                            zzbq = new zzbq(-9223372036854775807L, zzacy);
                        } else {
                            zzbq = zzbq2.zzc(zzacy);
                        }
                        zzad zzb2 = zzh2.zzb();
                        zzb2.zzM(zzbq);
                        zzh2 = zzb2.zzY();
                    }
                    if (zzg2 && zzh2.zzg == -1 && zzh2.zzh == -1 && (i10 = zzacy.zza) != -1) {
                        zzad zzb3 = zzh2.zzb();
                        zzb3.zzv(i10);
                        zzh2 = zzb3.zzY();
                    }
                }
                zzcpArr[i12] = new zzcp(Integer.toString(i12), zzh2.zzc(this.zzf.zza(zzh2)));
            }
            this.zzx = new zztu(new zzur(zzcpArr), zArr);
            this.zzv = true;
            zzsp zzsp = this.zzq;
            Objects.requireNonNull(zzsp);
            zzsp.zzi(this);
        }
    }

    private final void zzU(int i10) {
        zzS();
        zztu zztu = this.zzx;
        boolean[] zArr = zztu.zzd;
        if (!zArr[i10]) {
            zzaf zzb2 = zztu.zza.zzb(i10).zzb(0);
            this.zzg.zzd(zzbt.zzb(zzb2.zzm), zzb2, 0, (Object) null, this.zzG);
            zArr[i10] = true;
        }
    }

    private final void zzV(int i10) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i10] && !this.zzs[i10].zzx(false)) {
            this.zzH = 0;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0;
            this.zzJ = 0;
            for (zzui zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
            zzsp zzsp = this.zzq;
            Objects.requireNonNull(zzsp);
            zzsp.zzg(this);
        }
    }

    private final void zzW() {
        zztq zztq = new zztq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdl.zzf(zzX());
            long j10 = this.zzz;
            if (j10 == -9223372036854775807L || this.zzH <= j10) {
                zzaax zzaax = this.zzy;
                Objects.requireNonNull(zzaax);
                zztq.zzf(zztq, zzaax.zzg(this.zzH).zza.zzc, this.zzH);
                for (zzui zzt2 : this.zzs) {
                    zzt2.zzt(this.zzH);
                }
                this.zzH = -9223372036854775807L;
            } else {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zztq, this, zzwx.zza(this.zzB));
        zzfl zzd2 = zztq.zzl;
        this.zzg.zzl(new zzsj(zztq.zzb, zzd2, zzd2.zza, Collections.emptyMap(), zza, 0, 0), 1, -1, (zzaf) null, 0, (Object) null, zztq.zzk, this.zzz);
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzD() {
        if (!this.zzL) {
            zzsp zzsp = this.zzq;
            Objects.requireNonNull(zzsp);
            zzsp.zzg(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(zzaax zzaax) {
        zzaax zzaax2;
        if (this.zzr == null) {
            zzaax2 = zzaax;
        } else {
            zzaax2 = new zzaaw(-9223372036854775807L, 0);
        }
        this.zzy = zzaax2;
        this.zzz = zzaax.zze();
        boolean z10 = false;
        int i10 = 1;
        if (!this.zzF && zzaax.zze() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzA = z10;
        if (true == z10) {
            i10 = 7;
        }
        this.zzB = i10;
        this.zzi.zza(this.zzz, zzaax.zzh(), this.zzA);
        if (!this.zzv) {
            zzT();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzG() throws IOException {
        this.zzk.zzi(zzwx.zza(this.zzB));
    }

    /* access modifiers changed from: package-private */
    public final void zzH(int i10) throws IOException {
        this.zzs[i10].zzm();
        zzG();
    }

    public final /* bridge */ /* synthetic */ void zzI(zzxc zzxc, long j10, long j11, boolean z10) {
        zztq zztq = (zztq) zzxc;
        zzgh zze2 = zztq.zzd;
        zzsj zzsj = new zzsj(zztq.zzb, zztq.zzl, zze2.zzh(), zze2.zzi(), j10, j11, zze2.zzg());
        long unused = zztq.zzb;
        this.zzg.zzf(zzsj, 1, -1, (zzaf) null, 0, (Object) null, zztq.zzk, this.zzz);
        if (!z10) {
            for (zzui zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
            if (this.zzE > 0) {
                zzsp zzsp = this.zzq;
                Objects.requireNonNull(zzsp);
                zzsp.zzg(this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzJ(zzxc zzxc, long j10, long j11) {
        zzaax zzaax;
        if (this.zzz == -9223372036854775807L && (zzaax = this.zzy) != null) {
            boolean zzh2 = zzaax.zzh();
            long zzQ = zzQ(true);
            long j12 = zzQ == Long.MIN_VALUE ? 0 : zzQ + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            this.zzz = j12;
            this.zzi.zza(j12, zzh2, this.zzA);
        }
        zztq zztq = (zztq) zzxc;
        zzgh zze2 = zztq.zzd;
        zzsj zzsj = new zzsj(zztq.zzb, zztq.zzl, zze2.zzh(), zze2.zzi(), j10, j11, zze2.zzg());
        long unused = zztq.zzb;
        this.zzg.zzh(zzsj, 1, -1, (zzaf) null, 0, (Object) null, zztq.zzk, this.zzz);
        this.zzK = true;
        zzsp zzsp = this.zzq;
        Objects.requireNonNull(zzsp);
        zzsp.zzg(this);
    }

    public final void zzK() {
        for (zzui zzo2 : this.zzs) {
            zzo2.zzo();
        }
        this.zzl.zze();
    }

    public final void zzL(zzaf zzaf) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzui zzn2 : this.zzs) {
                zzn2.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages((Object) null);
        this.zzq = null;
        this.zzL = true;
    }

    public final void zzN(zzaax zzaax) {
        this.zzp.post(new zztp(this, zzaax));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzO(int i10) {
        return !zzY() && this.zzs[i10].zzx(this.zzK);
    }

    public final long zza(long j10, zzkq zzkq) {
        long j11;
        long j12 = j10;
        zzkq zzkq2 = zzkq;
        zzS();
        if (!this.zzy.zzh()) {
            return 0;
        }
        zzaav zzg2 = this.zzy.zzg(j12);
        long j13 = zzg2.zza.zzb;
        long j14 = zzg2.zzb.zzb;
        long j15 = zzkq2.zzf;
        if (j15 != 0) {
            j11 = j15;
        } else if (zzkq2.zzg == 0) {
            return j12;
        } else {
            j11 = 0;
        }
        long j16 = j10;
        long zzx2 = zzew.zzx(j16, j11, Long.MIN_VALUE);
        long zzq2 = zzew.zzq(j16, zzkq2.zzg, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = zzx2 <= j13 && j13 <= zzq2;
        if (zzx2 > j14 || j14 > zzq2) {
            z10 = false;
        }
        if (!z11 || !z10) {
            if (!z11) {
                return z10 ? j14 : zzx2;
            }
        } else if (Math.abs(j13 - j12) > Math.abs(j14 - j12)) {
            return j14;
        }
        return j13;
    }

    public final long zzb() {
        long j10;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zztu zztu = this.zzx;
                if (zztu.zzb[i10] && zztu.zzc[i10] && !this.zzs[i10].zzw()) {
                    j10 = Math.min(j10, this.zzs[i10].zzg());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzQ(false);
        }
        return j10 == Long.MIN_VALUE ? this.zzG : j10;
    }

    public final long zzc() {
        return zzb();
    }

    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzP() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    public final long zze(long j10) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j10 = 0;
        }
        this.zzD = false;
        this.zzG = j10;
        if (zzX()) {
            this.zzH = j10;
            return j10;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            int i10 = 0;
            while (i10 < length) {
                if (this.zzs[i10].zzy(j10, false) || (!zArr[i10] && this.zzw)) {
                    i10++;
                }
            }
            return j10;
        }
        this.zzI = false;
        this.zzH = j10;
        this.zzK = false;
        zzxg zzxg = this.zzk;
        if (zzxg.zzl()) {
            for (zzui zzj2 : this.zzs) {
                zzj2.zzj();
            }
            this.zzk.zzg();
        } else {
            zzxg.zzh();
            for (zzui zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
        }
        return j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r2 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzwe[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzuj[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.zzS()
            com.google.android.gms.internal.ads.zztu r0 = r7.zzx
            com.google.android.gms.internal.ads.zzur r1 = r0.zza
            boolean[] r0 = r0.zzc
            int r2 = r7.zzE
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.android.gms.internal.ads.zzts r5 = (com.google.android.gms.internal.ads.zzts) r5
            int r5 = r5.zzb
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.zzdl.zzf(r6)
            int r6 = r7.zzE
            int r6 = r6 + -1
            r7.zzE = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.zzC
            r4 = 0
            r6 = 1
            if (r9 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x0046
            goto L_0x0043
        L_0x003f:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0045
        L_0x0043:
            r9 = 1
            goto L_0x0047
        L_0x0045:
            r12 = r4
        L_0x0046:
            r9 = 0
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x00a1
            r4 = r10[r2]
            if (r4 != 0) goto L_0x009e
            r4 = r8[r2]
            if (r4 == 0) goto L_0x009e
            int r5 = r4.zzc()
            if (r5 != r6) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            com.google.android.gms.internal.ads.zzdl.zzf(r5)
            int r5 = r4.zza(r3)
            if (r5 != 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            com.google.android.gms.internal.ads.zzdl.zzf(r5)
            com.google.android.gms.internal.ads.zzcp r4 = r4.zze()
            int r4 = r1.zza(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.gms.internal.ads.zzdl.zzf(r5)
            int r5 = r7.zzE
            int r5 = r5 + r6
            r7.zzE = r5
            r0[r4] = r6
            com.google.android.gms.internal.ads.zzts r5 = new com.google.android.gms.internal.ads.zzts
            r5.<init>(r7, r4)
            r10[r2] = r5
            r11[r2] = r6
            if (r9 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzui[] r9 = r7.zzs
            r9 = r9[r4]
            boolean r4 = r9.zzy(r12, r6)
            if (r4 != 0) goto L_0x009d
            int r9 = r9.zza()
            if (r9 == 0) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x00a1:
            int r8 = r7.zzE
            if (r8 != 0) goto L_0x00d2
            r7.zzI = r3
            r7.zzD = r3
            com.google.android.gms.internal.ads.zzxg r8 = r7.zzk
            boolean r8 = r8.zzl()
            if (r8 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzui[] r8 = r7.zzs
            int r9 = r8.length
        L_0x00b4:
            if (r3 >= r9) goto L_0x00be
            r10 = r8[r3]
            r10.zzj()
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x00be:
            com.google.android.gms.internal.ads.zzxg r8 = r7.zzk
            r8.zzg()
            goto L_0x00e4
        L_0x00c4:
            com.google.android.gms.internal.ads.zzui[] r8 = r7.zzs
            int r9 = r8.length
            r10 = 0
        L_0x00c8:
            if (r10 >= r9) goto L_0x00e4
            r11 = r8[r10]
            r11.zzp(r3)
            int r10 = r10 + 1
            goto L_0x00c8
        L_0x00d2:
            if (r9 == 0) goto L_0x00e4
            long r12 = r7.zze(r12)
        L_0x00d8:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e4
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e1
            r11[r3] = r6
        L_0x00e1:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00e4:
            r7.zzC = r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzf(com.google.android.gms.internal.ads.zzwe[], boolean[], com.google.android.gms.internal.ads.zzuj[], boolean[], long):long");
    }

    /* access modifiers changed from: package-private */
    public final int zzg(int i10, zzjo zzjo, zzgr zzgr, int i11) {
        if (zzY()) {
            return -3;
        }
        zzU(i10);
        int zzd2 = this.zzs[i10].zzd(zzjo, zzgr, i11, this.zzK);
        if (zzd2 == -3) {
            zzV(i10);
        }
        return zzd2;
    }

    public final zzur zzh() {
        zzS();
        return this.zzx.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzi(int i10, long j10) {
        if (zzY()) {
            return 0;
        }
        zzU(i10);
        zzui zzui = this.zzs[i10];
        int zzb2 = zzui.zzb(j10, this.zzK);
        zzui.zzv(zzb2);
        if (zzb2 != 0) {
            return zzb2;
        }
        zzV(i10);
        return 0;
    }

    public final void zzj(long j10, boolean z10) {
        zzS();
        if (!zzX()) {
            boolean[] zArr = this.zzx.zzc;
            int length = this.zzs.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.zzs[i10].zzi(j10, false, zArr[i10]);
            }
        }
    }

    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzbu.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final void zzl(zzsp zzsp, long j10) {
        this.zzq = zzsp;
        this.zzm.zze();
        zzW();
    }

    public final void zzm(long j10) {
    }

    public final boolean zzo(long j10) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze2 = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze2;
        }
        zzW();
        return true;
    }

    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzxa zzt(com.google.android.gms.internal.ads.zzxc r28, long r29, long r31, java.io.IOException r33, int r34) {
        /*
            r27 = this;
            r0 = r27
            r12 = r33
            r14 = r28
            com.google.android.gms.internal.ads.zztq r14 = (com.google.android.gms.internal.ads.zztq) r14
            com.google.android.gms.internal.ads.zzgh r1 = r14.zzd
            com.google.android.gms.internal.ads.zzsj r2 = new com.google.android.gms.internal.ads.zzsj
            long r16 = r14.zzb
            com.google.android.gms.internal.ads.zzfl r18 = r14.zzl
            android.net.Uri r19 = r1.zzh()
            java.util.Map r20 = r1.zzi()
            long r25 = r1.zzg()
            r15 = r2
            r21 = r29
            r23 = r31
            r15.<init>(r16, r18, r19, r20, r21, r23, r25)
            long unused = r14.zzk
            int r1 = com.google.android.gms.internal.ads.zzew.zza
            boolean r1 = r12 instanceof com.google.android.gms.internal.ads.zzbu
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0066
            boolean r1 = r12 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L_0x0066
            boolean r1 = r12 instanceof com.google.android.gms.internal.ads.zzfy
            if (r1 != 0) goto L_0x0066
            boolean r1 = r12 instanceof com.google.android.gms.internal.ads.zzxf
            if (r1 != 0) goto L_0x0066
            r1 = r12
        L_0x0045:
            if (r1 == 0) goto L_0x005a
            boolean r5 = r1 instanceof com.google.android.gms.internal.ads.zzfh
            if (r5 == 0) goto L_0x0055
            r5 = r1
            com.google.android.gms.internal.ads.zzfh r5 = (com.google.android.gms.internal.ads.zzfh) r5
            int r5 = r5.zza
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r5 != r6) goto L_0x0055
            goto L_0x0066
        L_0x0055:
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0045
        L_0x005a:
            int r1 = r34 + -1
            int r1 = r1 * 1000
            r5 = 5000(0x1388, float:7.006E-42)
            int r1 = java.lang.Math.min(r1, r5)
            long r5 = (long) r1
            goto L_0x0067
        L_0x0066:
            r5 = r3
        L_0x0067:
            r1 = 1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            com.google.android.gms.internal.ads.zzxa r3 = com.google.android.gms.internal.ads.zzxg.zzd
        L_0x006e:
            r15 = r3
            goto L_0x00bd
        L_0x0070:
            int r7 = r27.zzP()
            int r8 = r0.zzJ
            r9 = 0
            if (r7 <= r8) goto L_0x007b
            r8 = 1
            goto L_0x007c
        L_0x007b:
            r8 = 0
        L_0x007c:
            boolean r10 = r0.zzF
            if (r10 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzaax r10 = r0.zzy
            if (r10 == 0) goto L_0x008d
            long r10 = r10.zze()
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x008d
            goto L_0x00b6
        L_0x008d:
            boolean r3 = r0.zzv
            if (r3 == 0) goto L_0x009c
            boolean r4 = r27.zzY()
            if (r4 != 0) goto L_0x009c
            r0.zzI = r1
            com.google.android.gms.internal.ads.zzxa r3 = com.google.android.gms.internal.ads.zzxg.zzc
            goto L_0x006e
        L_0x009c:
            r0.zzD = r3
            r3 = 0
            r0.zzG = r3
            r0.zzJ = r9
            com.google.android.gms.internal.ads.zzui[] r7 = r0.zzs
            int r10 = r7.length
            r11 = 0
        L_0x00a8:
            if (r11 >= r10) goto L_0x00b2
            r13 = r7[r11]
            r13.zzp(r9)
            int r11 = r11 + 1
            goto L_0x00a8
        L_0x00b2:
            com.google.android.gms.internal.ads.zztq.zzf(r14, r3, r3)
            goto L_0x00b8
        L_0x00b6:
            r0.zzJ = r7
        L_0x00b8:
            com.google.android.gms.internal.ads.zzxa r3 = com.google.android.gms.internal.ads.zzxg.zzb(r8, r5)
            goto L_0x006e
        L_0x00bd:
            boolean r3 = r15.zzc()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.zztb r1 = r0.zzg
            r3 = 1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            long r8 = r14.zzk
            long r10 = r0.zzz
            r12 = r33
            r13 = r16
            r1.zzj(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r16 == 0) goto L_0x00dc
            long unused = r14.zzb
        L_0x00dc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzt(com.google.android.gms.internal.ads.zzxc, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzxa");
    }

    /* access modifiers changed from: package-private */
    public final zzabb zzu() {
        return zzR(new zztt(0, true));
    }

    public final zzabb zzv(int i10, int i11) {
        return zzR(new zztt(i10, false));
    }
}
