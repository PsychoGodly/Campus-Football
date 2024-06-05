package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzpl extends zzra implements zzjq {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzob zzc;
    private final zzoi zzd;
    private int zze;
    private boolean zzf;
    private zzaf zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    /* access modifiers changed from: private */
    public zzkm zzl;

    public zzpl(Context context, zzqt zzqt, zzrc zzrc, boolean z10, Handler handler, zzoc zzoc, zzoi zzoi) {
        super(1, zzqt, zzrc, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzoi;
        this.zzc = new zzob(handler, zzoc);
        zzoi.zzn(new zzpk(this, (zzpj) null));
    }

    private final int zzax(zzqx zzqx, zzaf zzaf) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(zzqx.zza) || (i10 = zzew.zza) >= 24 || (i10 == 23 && zzew.zzY(this.zzb))) {
            return zzaf.zzn;
        }
        return -1;
    }

    private static List zzay(zzrc zzrc, zzaf zzaf, boolean z10, zzoi zzoi) throws zzrj {
        zzqx zzd2;
        String str = zzaf.zzm;
        if (str == null) {
            return zzfqk.zzo();
        }
        if (zzoi.zzw(zzaf) && (zzd2 = zzrp.zzd()) != null) {
            return zzfqk.zzp(zzd2);
        }
        List zzf2 = zzrp.zzf(str, false, false);
        String zze2 = zzrp.zze(zzaf);
        if (zze2 == null) {
            return zzfqk.zzm(zzf2);
        }
        List zzf3 = zzrp.zzf(zze2, false, false);
        zzfqh zzi2 = zzfqk.zzi();
        zzi2.zzh(zzf2);
        zzi2.zzh(zzf3);
        return zzi2.zzi();
    }

    private final void zzaz() {
        long zzb2 = this.zzd.zzb(zzM());
        if (zzb2 != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb2 = Math.max(this.zzh, zzb2);
            }
            this.zzh = zzb2;
            this.zzj = false;
        }
    }

    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzM() {
        return super.zzM() && this.zzd.zzv();
    }

    public final boolean zzN() {
        return this.zzd.zzu() || super.zzN();
    }

    /* access modifiers changed from: protected */
    public final float zzP(float f10, zzaf zzaf, zzaf[] zzafArr) {
        int i10 = -1;
        for (zzaf zzaf2 : zzafArr) {
            int i11 = zzaf2.zzA;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return ((float) i10) * f10;
    }

    /* access modifiers changed from: protected */
    public final int zzQ(zzrc zzrc, zzaf zzaf) throws zzrj {
        boolean z10;
        int i10 = 128;
        if (!zzbt.zzg(zzaf.zzm)) {
            return 128;
        }
        int i11 = zzew.zza >= 21 ? 32 : 0;
        int i12 = zzaf.zzF;
        boolean zzaw = zzra.zzaw(zzaf);
        if (zzaw && this.zzd.zzw(zzaf) && (i12 == 0 || zzrp.zzd() != null)) {
            return i11 | 140;
        }
        if (("audio/raw".equals(zzaf.zzm) && !this.zzd.zzw(zzaf)) || !this.zzd.zzw(zzew.zzF(2, zzaf.zzz, zzaf.zzA))) {
            return 129;
        }
        List zzay = zzay(zzrc, zzaf, false, this.zzd);
        if (zzay.isEmpty()) {
            return 129;
        }
        if (!zzaw) {
            return 130;
        }
        zzqx zzqx = (zzqx) zzay.get(0);
        boolean zze2 = zzqx.zze(zzaf);
        if (!zze2) {
            int i13 = 1;
            while (true) {
                if (i13 >= zzay.size()) {
                    break;
                }
                zzqx zzqx2 = (zzqx) zzay.get(i13);
                if (zzqx2.zze(zzaf)) {
                    zzqx = zzqx2;
                    z10 = false;
                    zze2 = true;
                    break;
                }
                i13++;
            }
        }
        z10 = true;
        int i14 = true != zze2 ? 3 : 4;
        int i15 = 8;
        if (zze2 && zzqx.zzf(zzaf)) {
            i15 = 16;
        }
        int i16 = true != zzqx.zzg ? 0 : 64;
        if (true != z10) {
            i10 = 0;
        }
        return i14 | i15 | i11 | i16 | i10;
    }

    /* access modifiers changed from: protected */
    public final zzhc zzR(zzqx zzqx, zzaf zzaf, zzaf zzaf2) {
        int i10;
        int i11;
        zzhc zzb2 = zzqx.zzb(zzaf, zzaf2);
        int i12 = zzb2.zze;
        if (zzax(zzqx, zzaf2) > this.zze) {
            i12 |= 64;
        }
        String str = zzqx.zza;
        if (i12 != 0) {
            i10 = i12;
            i11 = 0;
        } else {
            i11 = zzb2.zzd;
            i10 = 0;
        }
        return new zzhc(str, zzaf, zzaf2, i11, i10);
    }

    /* access modifiers changed from: protected */
    public final zzhc zzS(zzjo zzjo) throws zzhj {
        zzhc zzS = super.zzS(zzjo);
        this.zzc.zzg(zzjo.zza, zzS);
        return zzS;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzqs zzV(com.google.android.gms.internal.ads.zzqx r8, com.google.android.gms.internal.ads.zzaf r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzaf[] r10 = r7.zzJ()
            int r0 = r10.length
            int r1 = r7.zzax(r8, r9)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r0) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.zzhc r6 = r8.zzb(r9, r5)
            int r6 = r6.zzd
            if (r6 == 0) goto L_0x0023
            int r5 = r7.zzax(r8, r5)
            int r1 = java.lang.Math.max(r1, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.zze = r1
            java.lang.String r10 = r8.zza
            int r0 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzew.zzc
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzew.zzb
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.zzf = r10
            java.lang.String r10 = r8.zzc
            int r4 = r7.zze
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.zzz
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.zzA
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List r10 = r9.zzo
            com.google.android.gms.internal.ads.zzeg.zzb(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.zzeg.zza(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.zzm
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.zzoi r10 = r7.zzd
            int r11 = r9.zzz
            int r1 = r9.zzA
            r2 = 4
            com.google.android.gms.internal.ads.zzaf r11 = com.google.android.gms.internal.ads.zzew.zzF(r2, r11, r1)
            int r10 = r10.zza(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r2)
        L_0x00db:
            r10 = 32
            if (r0 < r10) goto L_0x00e6
            r10 = 99
            java.lang.String r11 = "max-output-channel-count"
            r5.setInteger(r11, r10)
        L_0x00e6:
            java.lang.String r10 = r8.zzb
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = r9.zzm
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fb
            r10 = r9
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            r7.zzg = r10
            com.google.android.gms.internal.ads.zzqs r8 = com.google.android.gms.internal.ads.zzqs.zza(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpl.zzV(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqs");
    }

    /* access modifiers changed from: protected */
    public final List zzW(zzrc zzrc, zzaf zzaf, boolean z10) throws zzrj {
        return zzrp.zzg(zzay(zzrc, zzaf, false, this.zzd), zzaf);
    }

    /* access modifiers changed from: protected */
    public final void zzX(Exception exc) {
        zzee.zzc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzY(String str, zzqs zzqs, long j10, long j11) {
        this.zzc.zzc(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    public final long zza() {
        if (zzbc() == 2) {
            zzaz();
        }
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final void zzaa(zzaf zzaf, MediaFormat mediaFormat) throws zzhj {
        int i10;
        int i11;
        zzaf zzaf2 = this.zzg;
        int[] iArr = null;
        if (zzaf2 != null) {
            zzaf = zzaf2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzaf.zzm)) {
                i10 = zzaf.zzB;
            } else if (zzew.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.containsKey("v-bits-per-sample") ? zzew.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i10 = mediaFormat.getInteger("pcm-encoding");
            }
            zzad zzad = new zzad();
            zzad.zzS("audio/raw");
            zzad.zzN(i10);
            zzad.zzC(zzaf.zzC);
            zzad.zzD(zzaf.zzD);
            zzad.zzw(mediaFormat.getInteger("channel-count"));
            zzad.zzT(mediaFormat.getInteger("sample-rate"));
            zzaf zzY = zzad.zzY();
            if (this.zzf && zzY.zzz == 6 && (i11 = zzaf.zzz) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < zzaf.zzz; i12++) {
                    iArr[i12] = i12;
                }
            }
            zzaf = zzY;
        }
        try {
            this.zzd.zzd(zzaf, 0, iArr);
        } catch (zzod e10) {
            throw zzbe(e10, e10.zza, false, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzab() {
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        this.zzd.zzf();
    }

    /* access modifiers changed from: protected */
    public final void zzad(zzgr zzgr) {
        if (this.zzi && !zzgr.zzf()) {
            if (Math.abs(zzgr.zzd - this.zzh) > 500000) {
                this.zzh = zzgr.zzd;
            }
            this.zzi = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzae() throws zzhj {
        try {
            this.zzd.zzi();
        } catch (zzoh e10) {
            throw zzbe(e10, e10.zzc, e10.zzb, 5002);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzaf(long j10, long j11, zzqu zzqu, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzaf zzaf) throws zzhj {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i11 & 2) != 0) {
            Objects.requireNonNull(zzqu);
            zzqu.zzn(i10, false);
            return true;
        } else if (z10) {
            if (zzqu != null) {
                zzqu.zzn(i10, false);
            }
            this.zza.zzf += i12;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (!this.zzd.zzt(byteBuffer, j12, i12)) {
                    return false;
                }
                if (zzqu != null) {
                    zzqu.zzn(i10, false);
                }
                this.zza.zze += i12;
                return true;
            } catch (zzoe e10) {
                throw zzbe(e10, e10.zzc, e10.zzb, 5001);
            } catch (zzoh e11) {
                throw zzbe(e11, zzaf, e11.zzb, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzag(zzaf zzaf) {
        return this.zzd.zzw(zzaf);
    }

    public final zzby zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzby zzby) {
        this.zzd.zzo(zzby);
    }

    public final zzjq zzi() {
        return this;
    }

    public final void zzp(int i10, Object obj) throws zzhj {
        if (i10 == 2) {
            this.zzd.zzs(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.zzd.zzk((zzk) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.zzd.zzr(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzkm) obj;
                    return;
                case 12:
                    if (zzew.zza >= 23) {
                        zzpi.zza(this.zzd, obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzl) obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
                this.zzc.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzs();
            throw th;
        } finally {
            this.zzc.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzt(boolean z10, boolean z11) throws zzhj {
        super.zzt(z10, z11);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    /* access modifiers changed from: protected */
    public final void zzu(long j10, boolean z10) throws zzhj {
        super.zzu(j10, z10);
        this.zzd.zze();
        this.zzh = j10;
        this.zzi = true;
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        this.zzd.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        zzaz();
        this.zzd.zzg();
    }
}
