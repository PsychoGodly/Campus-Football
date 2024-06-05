package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zznk implements zzle, zznl {
    private final Context zza;
    private final zznm zzb;
    private final PlaybackSession zzc;
    private final long zzd = SystemClock.elapsedRealtime();
    private final zzcm zze = new zzcm();
    private final zzck zzf = new zzck();
    private final HashMap zzg = new HashMap();
    private final HashMap zzh = new HashMap();
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl = 0;
    private int zzm = 0;
    private zzbw zzn;
    private zznj zzo;
    private zznj zzp;
    private zznj zzq;
    private zzaf zzr;
    private zzaf zzs;
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zznk(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzni zzni = new zzni(zzni.zza);
        this.zzb = zzni;
        zzni.zzg(this);
    }

    public static zznk zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zznk(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i10) {
        switch (zzew.zzl(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long j10;
        long j11;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l10 == null) {
                j10 = 0;
            } else {
                j10 = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j10);
            Long l11 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l11 == null) {
                j11 = 0;
            } else {
                j11 = l11.longValue();
            }
            builder3.setNetworkBytesRead(j11);
            this.zzj.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzaf zzaf, int i10) {
        if (!zzew.zzU(this.zzs, zzaf)) {
            int i11 = this.zzs == null ? 1 : 0;
            this.zzs = zzaf;
            zzx(0, j10, zzaf, i11);
        }
    }

    private final void zzu(long j10, zzaf zzaf, int i10) {
        if (!zzew.zzU(this.zzt, zzaf)) {
            int i11 = this.zzt == null ? 1 : 0;
            this.zzt = zzaf;
            zzx(2, j10, zzaf, i11);
        }
    }

    private final void zzv(zzcn zzcn, zzss zzss) {
        int zza2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzss != null && (zza2 = zzcn.zza(zzss.zza)) != -1) {
            int i10 = 0;
            zzcn.zzd(zza2, this.zzf, false);
            zzcn.zze(this.zzf.zzd, this.zze, 0);
            zzay zzay = this.zze.zzd.zzd;
            int i11 = 2;
            if (zzay != null) {
                int zzp2 = zzew.zzp(zzay.zza);
                i10 = zzp2 != 0 ? zzp2 != 1 ? zzp2 != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i10);
            zzcm zzcm = this.zze;
            if (zzcm.zzn != -9223372036854775807L && !zzcm.zzl && !zzcm.zzi && !zzcm.zzb()) {
                builder.setMediaDurationMillis(zzew.zzz(this.zze.zzn));
            }
            if (true != this.zze.zzb()) {
                i11 = 1;
            }
            builder.setPlaybackType(i11);
            this.zzz = true;
        }
    }

    private final void zzw(long j10, zzaf zzaf, int i10) {
        if (!zzew.zzU(this.zzr, zzaf)) {
            int i11 = this.zzr == null ? 1 : 0;
            this.zzr = zzaf;
            zzx(1, j10, zzaf, i11);
        }
    }

    private final void zzx(int i10, long j10, zzaf zzaf, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzaf != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzaf.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzaf.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzaf.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzaf.zzi;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzaf.zzr;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzaf.zzs;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzaf.zzz;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzaf.zzA;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzaf.zzd;
            if (str4 != null) {
                String[] zzah = zzew.zzah(str4, "-");
                Pair create = Pair.create(zzah[0], zzah.length >= 2 ? zzah[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzaf.zzt;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zznj zznj) {
        return zznj != null && zznj.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public final void zzc(zzlc zzlc, String str) {
        zzss zzss = zzlc.zzd;
        if (zzss == null || !zzss.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta03");
            zzv(zzlc.zzb, zzlc.zzd);
        }
    }

    public final void zzd(zzlc zzlc, String str, boolean z10) {
        zzss zzss = zzlc.zzd;
        if ((zzss == null || !zzss.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    public final /* synthetic */ void zze(zzlc zzlc, zzaf zzaf, zzhc zzhc) {
    }

    public final void zzf(zzlc zzlc, int i10, long j10, long j11) {
        long j12;
        zzss zzss = zzlc.zzd;
        if (zzss != null) {
            String zze2 = this.zzb.zze(zzlc.zzb, zzss);
            Long l10 = (Long) this.zzh.get(zze2);
            Long l11 = (Long) this.zzg.get(zze2);
            HashMap hashMap = this.zzh;
            long j13 = 0;
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            hashMap.put(zze2, Long.valueOf(j12 + j10));
            HashMap hashMap2 = this.zzg;
            if (l11 != null) {
                j13 = l11.longValue();
            }
            hashMap2.put(zze2, Long.valueOf(j13 + ((long) i10)));
        }
    }

    public final void zzg(zzlc zzlc, zzso zzso) {
        zzss zzss = zzlc.zzd;
        if (zzss != null) {
            zzaf zzaf = zzso.zzb;
            Objects.requireNonNull(zzaf);
            zznj zznj = new zznj(zzaf, 0, this.zzb.zze(zzlc.zzb, zzss));
            int i10 = zzso.zza;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.zzp = zznj;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.zzq = zznj;
                        return;
                    }
                    return;
                }
            }
            this.zzo = zznj;
        }
    }

    public final /* synthetic */ void zzh(zzlc zzlc, int i10, long j10) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:182:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzcg r21, com.google.android.gms.internal.ads.zzld r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 == 0) goto L_0x03ef
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzlc r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zznm r4 = r0.zzb
            r4.zzj(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.zznm r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzi(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zznm r4 = r0.zzb
            r4.zzh(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzlc r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzcn r7 = r6.zzb
            com.google.android.gms.internal.ads.zzss r6 = r6.zzd
            r0.zzv(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zzcy r7 = r21.zzr()
            com.google.android.gms.internal.ads.zzfqk r7 = r7.zza()
            int r12 = r7.size()
            r13 = 0
        L_0x006a:
            if (r13 >= r12) goto L_0x008f
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzcx r14 = (com.google.android.gms.internal.ads.zzcx) r14
            r15 = 0
        L_0x0073:
            int r5 = r14.zzb
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008b
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzaf r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzx r5 = r5.zzp
            if (r5 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008b:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008f:
            r5 = r10
        L_0x0090:
            if (r5 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzew.zza
            r12 = 0
        L_0x0097:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c2
            com.google.android.gms.internal.ads.zzw r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ab
            r5 = 3
            goto L_0x00c3
        L_0x00ab:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b5
            r5 = 2
            goto L_0x00c3
        L_0x00b5:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00bf
            r5 = 6
            goto L_0x00c3
        L_0x00bf:
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            r7.setDrmType(r5)
        L_0x00c6:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        L_0x00d3:
            com.google.android.gms.internal.ads.zzbw r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto L_0x00db
            goto L_0x0299
        L_0x00db:
            android.content.Context r7 = r0.zza
            int r8 = r5.zzb
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f3
            r17 = 20
            r14 = 20
            goto L_0x0273
        L_0x00f3:
            r8 = r5
            com.google.android.gms.internal.ads.zzhj r8 = (com.google.android.gms.internal.ads.zzhj) r8
            int r12 = r8.zze
            if (r12 != r11) goto L_0x00fc
            r12 = 1
            goto L_0x00fd
        L_0x00fc:
            r12 = 0
        L_0x00fd:
            int r8 = r8.zzi
            java.lang.Throwable r15 = r5.getCause()
            java.util.Objects.requireNonNull(r15)
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x0202
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzgb
            if (r2 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.zzgb r15 = (com.google.android.gms.internal.ads.zzgb) r15
            int r2 = r15.zzd
            r14 = 5
            goto L_0x0273
        L_0x0115:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzga
            if (r2 != 0) goto L_0x01fd
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzbu
            if (r2 == 0) goto L_0x011f
            goto L_0x01fd
        L_0x011f:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfz
            if (r2 != 0) goto L_0x01ca
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.zzgj
            if (r8 == 0) goto L_0x0129
            goto L_0x01ca
        L_0x0129:
            int r2 = r5.zzb
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x0134
            r2 = 0
            r14 = 21
            goto L_0x0273
        L_0x0134:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzpr
            if (r2 == 0) goto L_0x0192
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            int r7 = com.google.android.gms.internal.ads.zzew.zza
            if (r7 < r13) goto L_0x0157
            boolean r8 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0157
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.zzew.zzm(r2)
            int r17 = zzr(r2)
            goto L_0x026b
        L_0x0157:
            if (r7 < r14) goto L_0x0164
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x0164
            r17 = 27
            r2 = 0
            r14 = 27
            goto L_0x0273
        L_0x0164:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x016f
            r17 = 24
            r2 = 0
            r14 = 24
            goto L_0x0273
        L_0x016f:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x017a
            r17 = 29
            r2 = 0
            r14 = 29
            goto L_0x0273
        L_0x017a:
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzqc
            if (r7 == 0) goto L_0x0180
            goto L_0x021b
        L_0x0180:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzpp
            if (r2 == 0) goto L_0x018b
            r17 = 28
            r2 = 0
            r14 = 28
            goto L_0x0273
        L_0x018b:
            r17 = 30
            r2 = 0
            r14 = 30
            goto L_0x0273
        L_0x0192:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfv
            if (r2 == 0) goto L_0x01c5
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01c5
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.zzew.zza
            if (r7 < r13) goto L_0x01c0
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01c0
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01c0
            r17 = 32
            r2 = 0
            r14 = 32
            goto L_0x0273
        L_0x01c0:
            r2 = 0
            r14 = 31
            goto L_0x0273
        L_0x01c5:
            r2 = 0
            r14 = 9
            goto L_0x0273
        L_0x01ca:
            com.google.android.gms.internal.ads.zzel r7 = com.google.android.gms.internal.ads.zzel.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01d8
            r2 = 0
            r14 = 3
            goto L_0x0273
        L_0x01d8:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01e4
            r2 = 0
            r14 = 6
            goto L_0x0273
        L_0x01e4:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01ec
            r2 = 0
            r14 = 7
            goto L_0x0273
        L_0x01ec:
            if (r2 == 0) goto L_0x01f8
            com.google.android.gms.internal.ads.zzfz r15 = (com.google.android.gms.internal.ads.zzfz) r15
            int r2 = r15.zzc
            if (r2 != r11) goto L_0x01f8
            r2 = 0
            r14 = 4
            goto L_0x0273
        L_0x01f8:
            r2 = 0
            r14 = 8
            goto L_0x0273
        L_0x01fd:
            r2 = 0
            r14 = 11
            goto L_0x0273
        L_0x0202:
            if (r12 == 0) goto L_0x020d
            if (r8 == 0) goto L_0x0208
            if (r8 != r11) goto L_0x020d
        L_0x0208:
            r2 = 0
            r14 = 35
            goto L_0x0273
        L_0x020d:
            if (r12 == 0) goto L_0x0217
            if (r8 != r9) goto L_0x0217
            r17 = 15
            r2 = 0
            r14 = 15
            goto L_0x0273
        L_0x0217:
            if (r12 == 0) goto L_0x021d
            if (r8 != r6) goto L_0x021d
        L_0x021b:
            r2 = 0
            goto L_0x0273
        L_0x021d:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqz
            if (r2 == 0) goto L_0x022c
            com.google.android.gms.internal.ads.zzqz r15 = (com.google.android.gms.internal.ads.zzqz) r15
            java.lang.String r2 = r15.zzd
            int r2 = com.google.android.gms.internal.ads.zzew.zzm(r2)
            r14 = 13
            goto L_0x0273
        L_0x022c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqv
            if (r2 == 0) goto L_0x023b
            com.google.android.gms.internal.ads.zzqv r15 = (com.google.android.gms.internal.ads.zzqv) r15
            java.lang.String r2 = r15.zzb
            int r2 = com.google.android.gms.internal.ads.zzew.zzm(r2)
        L_0x0238:
            r14 = 14
            goto L_0x0273
        L_0x023b:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x0241
            r2 = 0
            goto L_0x0238
        L_0x0241:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzoe
            if (r2 == 0) goto L_0x024e
            com.google.android.gms.internal.ads.zzoe r15 = (com.google.android.gms.internal.ads.zzoe) r15
            int r2 = r15.zza
            r17 = 17
            r14 = 17
            goto L_0x0273
        L_0x024e:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzoh
            if (r2 == 0) goto L_0x025b
            com.google.android.gms.internal.ads.zzoh r15 = (com.google.android.gms.internal.ads.zzoh) r15
            int r2 = r15.zza
            r17 = 18
            r14 = 18
            goto L_0x0273
        L_0x025b:
            int r2 = com.google.android.gms.internal.ads.zzew.zza
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x026e
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = zzr(r2)
        L_0x026b:
            r14 = r17
            goto L_0x0273
        L_0x026e:
            r17 = 22
            r2 = 0
            r14 = 22
        L_0x0273:
            android.media.metrics.PlaybackSession r7 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.zzz = r11
            r0.zzn = r10
        L_0x0299:
            boolean r2 = r1.zzd(r6)
            if (r2 == 0) goto L_0x02c8
            com.google.android.gms.internal.ads.zzcy r2 = r21.zzr()
            boolean r5 = r2.zzb(r6)
            boolean r7 = r2.zzb(r11)
            boolean r2 = r2.zzb(r9)
            if (r5 != 0) goto L_0x02b6
            if (r7 != 0) goto L_0x02b6
            if (r2 == 0) goto L_0x02c8
            r2 = 1
        L_0x02b6:
            if (r5 != 0) goto L_0x02bd
            r5 = 0
            r0.zzw(r3, r10, r5)
            goto L_0x02be
        L_0x02bd:
            r5 = 0
        L_0x02be:
            if (r7 != 0) goto L_0x02c3
            r0.zzt(r3, r10, r5)
        L_0x02c3:
            if (r2 != 0) goto L_0x02c8
            r0.zzu(r3, r10, r5)
        L_0x02c8:
            com.google.android.gms.internal.ads.zznj r2 = r0.zzo
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02e0
            com.google.android.gms.internal.ads.zznj r2 = r0.zzo
            com.google.android.gms.internal.ads.zzaf r2 = r2.zza
            int r5 = r2.zzs
            r7 = -1
            if (r5 == r7) goto L_0x02e0
            r5 = 0
            r0.zzw(r3, r2, r5)
            r0.zzo = r10
            goto L_0x02e1
        L_0x02e0:
            r5 = 0
        L_0x02e1:
            com.google.android.gms.internal.ads.zznj r2 = r0.zzp
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02f2
            com.google.android.gms.internal.ads.zznj r2 = r0.zzp
            com.google.android.gms.internal.ads.zzaf r2 = r2.zza
            r0.zzt(r3, r2, r5)
            r0.zzp = r10
        L_0x02f2:
            com.google.android.gms.internal.ads.zznj r2 = r0.zzq
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x0303
            com.google.android.gms.internal.ads.zznj r2 = r0.zzq
            com.google.android.gms.internal.ads.zzaf r2 = r2.zza
            r0.zzu(r3, r2, r5)
            r0.zzq = r10
        L_0x0303:
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzel r2 = com.google.android.gms.internal.ads.zzel.zzb(r2)
            int r2 = r2.zza()
            switch(r2) {
                case 0: goto L_0x0324;
                case 1: goto L_0x0321;
                case 2: goto L_0x031f;
                case 3: goto L_0x031d;
                case 4: goto L_0x031b;
                case 5: goto L_0x0319;
                case 6: goto L_0x0310;
                case 7: goto L_0x0317;
                case 8: goto L_0x0310;
                case 9: goto L_0x0314;
                case 10: goto L_0x0312;
                default: goto L_0x0310;
            }
        L_0x0310:
            r13 = 1
            goto L_0x0325
        L_0x0312:
            r13 = 7
            goto L_0x0325
        L_0x0314:
            r13 = 8
            goto L_0x0325
        L_0x0317:
            r13 = 3
            goto L_0x0325
        L_0x0319:
            r13 = 6
            goto L_0x0325
        L_0x031b:
            r13 = 5
            goto L_0x0325
        L_0x031d:
            r13 = 4
            goto L_0x0325
        L_0x031f:
            r13 = 2
            goto L_0x0325
        L_0x0321:
            r13 = 9
            goto L_0x0325
        L_0x0324:
            r13 = 0
        L_0x0325:
            int r2 = r0.zzm
            if (r13 == r2) goto L_0x0345
            r0.zzm = r13
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.zzd
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x0345:
            int r2 = r21.zzi()
            if (r2 == r6) goto L_0x034f
            r2 = 0
            r0.zzu = r2
            goto L_0x0350
        L_0x034f:
            r2 = 0
        L_0x0350:
            r5 = r21
            com.google.android.gms.internal.ads.zzks r5 = (com.google.android.gms.internal.ads.zzks) r5
            com.google.android.gms.internal.ads.zzhj r5 = r5.zzF()
            r7 = 10
            if (r5 != 0) goto L_0x035f
            r0.zzv = r2
            goto L_0x0367
        L_0x035f:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x0367
            r0.zzv = r11
        L_0x0367:
            int r2 = r21.zzi()
            boolean r5 = r0.zzu
            if (r5 == 0) goto L_0x0371
            r5 = 5
            goto L_0x03bb
        L_0x0371:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x0378
            r5 = 13
            goto L_0x03bb
        L_0x0378:
            r5 = 4
            if (r2 != r5) goto L_0x037e
            r5 = 11
            goto L_0x03bb
        L_0x037e:
            if (r2 != r6) goto L_0x039c
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x039a
            if (r2 != r6) goto L_0x0387
            goto L_0x039a
        L_0x0387:
            boolean r2 = r21.zzy()
            if (r2 != 0) goto L_0x038f
            r5 = 7
            goto L_0x03bb
        L_0x038f:
            int r2 = r21.zzj()
            if (r2 == 0) goto L_0x0398
            r5 = 10
            goto L_0x03bb
        L_0x0398:
            r5 = 6
            goto L_0x03bb
        L_0x039a:
            r5 = 2
            goto L_0x03bb
        L_0x039c:
            if (r2 != r9) goto L_0x03b0
            boolean r2 = r21.zzy()
            if (r2 != 0) goto L_0x03a5
            goto L_0x03bb
        L_0x03a5:
            int r2 = r21.zzj()
            if (r2 == 0) goto L_0x03ae
            r5 = 9
            goto L_0x03bb
        L_0x03ae:
            r5 = 3
            goto L_0x03bb
        L_0x03b0:
            if (r2 != r11) goto L_0x03b9
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x03b9
            r5 = 12
            goto L_0x03bb
        L_0x03b9:
            int r5 = r0.zzl
        L_0x03bb:
            int r2 = r0.zzl
            if (r2 == r5) goto L_0x03de
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03de:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03ef
            com.google.android.gms.internal.ads.zznm r3 = r0.zzb
            com.google.android.gms.internal.ads.zzlc r1 = r1.zzc(r2)
            r3.zzf(r1)
        L_0x03ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznk.zzi(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzld):void");
    }

    public final void zzj(zzlc zzlc, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
    }

    public final /* synthetic */ void zzk(zzlc zzlc, int i10) {
    }

    public final void zzl(zzlc zzlc, zzbw zzbw) {
        this.zzn = zzbw;
    }

    public final void zzm(zzlc zzlc, zzcf zzcf, zzcf zzcf2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    public final /* synthetic */ void zzn(zzlc zzlc, Object obj, long j10) {
    }

    public final void zzo(zzlc zzlc, zzhb zzhb) {
        this.zzw += zzhb.zzg;
        this.zzx += zzhb.zze;
    }

    public final /* synthetic */ void zzp(zzlc zzlc, zzaf zzaf, zzhc zzhc) {
    }

    public final void zzq(zzlc zzlc, zzda zzda) {
        zznj zznj = this.zzo;
        if (zznj != null) {
            zzaf zzaf = zznj.zza;
            if (zzaf.zzs == -1) {
                zzad zzb2 = zzaf.zzb();
                zzb2.zzX(zzda.zzc);
                zzb2.zzF(zzda.zzd);
                this.zzo = new zznj(zzb2.zzY(), 0, zznj.zzc);
            }
        }
    }
}
