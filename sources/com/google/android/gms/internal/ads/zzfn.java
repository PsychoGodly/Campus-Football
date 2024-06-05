package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfn implements zzfg {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfg zzc;
    private zzfg zzd;
    private zzfg zze;
    private zzfg zzf;
    private zzfg zzg;
    private zzfg zzh;
    private zzfg zzi;
    private zzfg zzj;
    private zzfg zzk;

    public zzfn(Context context, zzfg zzfg) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfg;
    }

    private final zzfg zzg() {
        if (this.zze == null) {
            zzez zzez = new zzez(this.zza);
            this.zze = zzez;
            zzh(zzez);
        }
        return this.zze;
    }

    private final void zzh(zzfg zzfg) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzfg.zzf((zzgi) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzfg zzfg, zzgi zzgi) {
        if (zzfg != null) {
            zzfg.zzf(zzgi);
        }
    }

    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzfg zzfg = this.zzk;
        Objects.requireNonNull(zzfg);
        return zzfg.zza(bArr, i10, i11);
    }

    public final long zzb(zzfl zzfl) throws IOException {
        zzfg zzfg;
        zzdl.zzf(this.zzk == null);
        String scheme = zzfl.zza.getScheme();
        if (zzew.zzX(zzfl.zza)) {
            String path = zzfl.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzfw zzfw = new zzfw();
                    this.zzd = zzfw;
                    zzh(zzfw);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzfd zzfd = new zzfd(this.zza);
                this.zzf = zzfd;
                zzh(zzfd);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzfg zzfg2 = (zzfg) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzfg2;
                    zzh(zzfg2);
                } catch (ClassNotFoundException unused) {
                    zzee.zze("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzgk zzgk = new zzgk(AdError.SERVER_ERROR_CODE);
                this.zzh = zzgk;
                zzh(zzgk);
            }
            this.zzk = this.zzh;
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            if (this.zzi == null) {
                zzfe zzfe = new zzfe();
                this.zzi = zzfe;
                zzh(zzfe);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzgg zzgg = new zzgg(this.zza);
                    this.zzj = zzgg;
                    zzh(zzgg);
                }
                zzfg = this.zzj;
            } else {
                zzfg = this.zzc;
            }
            this.zzk = zzfg;
        }
        return this.zzk.zzb(zzfl);
    }

    public final Uri zzc() {
        zzfg zzfg = this.zzk;
        if (zzfg == null) {
            return null;
        }
        return zzfg.zzc();
    }

    public final void zzd() throws IOException {
        zzfg zzfg = this.zzk;
        if (zzfg != null) {
            try {
                zzfg.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        zzfg zzfg = this.zzk;
        return zzfg == null ? Collections.emptyMap() : zzfg.zze();
    }

    public final void zzf(zzgi zzgi) {
        Objects.requireNonNull(zzgi);
        this.zzc.zzf(zzgi);
        this.zzb.add(zzgi);
        zzi(this.zzd, zzgi);
        zzi(this.zze, zzgi);
        zzi(this.zzf, zzgi);
        zzi(this.zzg, zzgi);
        zzi(this.zzh, zzgi);
        zzi(this.zzi, zzgi);
        zzi(this.zzj, zzgi);
    }
}
