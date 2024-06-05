package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.e0;
import com.google.android.gms.ads.internal.util.f0;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.t1;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcbk {
    private final Context zza;
    private final String zzb;
    private final zzbzg zzc;
    private final zzbbg zzd;
    private final zzbbj zze;
    private final h0 zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm;
    private zzcap zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq = -1;

    public zzcbk(Context context, zzbzg zzbzg, String str, zzbbj zzbbj, zzbbg zzbbg) {
        f0 f0Var = new f0();
        f0 f0Var2 = f0Var;
        f0Var2.a("min_1", Double.MIN_VALUE, 1.0d);
        f0Var2.a("1_5", 1.0d, 5.0d);
        f0Var2.a("5_10", 5.0d, 10.0d);
        f0Var2.a("10_20", 10.0d, 20.0d);
        f0Var2.a("20_30", 20.0d, 30.0d);
        f0Var2.a("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = f0Var.b();
        this.zza = context;
        this.zzc = zzbzg;
        this.zzb = str;
        this.zze = zzbbj;
        this.zzd = zzbbg;
        String str2 = (String) a0.c().zzb(zzbar.zzy);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzg[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                zzbza.zzk("Unable to parse frame hash target time number.", e10);
                this.zzg[i10] = -1;
            }
        }
    }

    public final void zza(zzcap zzcap) {
        zzbbb.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcap.zzj());
        this.zzn = zzcap;
    }

    public final void zzb() {
        if (this.zzi && !this.zzj) {
            zzbbb.zza(this.zze, this.zzd, "vfr2");
            this.zzj = true;
        }
    }

    public final void zzc() {
        this.zzm = true;
        if (this.zzj && !this.zzk) {
            zzbbb.zza(this.zze, this.zzd, "vfp2");
            this.zzk = true;
        }
    }

    public final void zzd() {
        if (((Boolean) zzbcz.zza.zze()).booleanValue() && !this.zzo) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzb);
            bundle.putString("player", this.zzn.zzj());
            for (e0 e0Var : this.zzf.a()) {
                String valueOf = String.valueOf(e0Var.f14789a);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(e0Var.f14793e));
                String valueOf2 = String.valueOf(e0Var.f14789a);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(e0Var.f14792d));
            }
            int i10 = 0;
            while (true) {
                long[] jArr = this.zzg;
                if (i10 < jArr.length) {
                    String str = this.zzh[i10];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                    }
                    i10++;
                } else {
                    t.r();
                    Context context = this.zza;
                    String str2 = this.zzc.zza;
                    t.r();
                    bundle.putString("device", b2.O());
                    bundle.putString("eids", TextUtils.join(",", zzbar.zza()));
                    x.b();
                    zzbyt.zzx(context, str2, "gmob-apps", bundle, true, new t1(context, str2));
                    this.zzo = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcap zzcap) {
        if (this.zzk && !this.zzl) {
            if (n1.c() && !this.zzl) {
                n1.a("VideoMetricsMixin first frame");
            }
            zzbbb.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long c10 = t.b().c();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.b(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c10 - this.zzq)));
        }
        this.zzp = this.zzm;
        this.zzq = c10;
        long longValue = ((Long) a0.c().zzb(zzbar.zzz)).longValue();
        long zza2 = (long) zzcap.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && longValue > Math.abs(zza2 - this.zzg[i10])) {
                String[] strArr2 = this.zzh;
                int i11 = 8;
                Bitmap bitmap = zzcap.getBitmap(8, 8);
                long j10 = 63;
                long j11 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", new Object[]{Long.valueOf(j11)});
                return;
            }
            zzcap zzcap2 = zzcap;
            i10++;
        }
    }
}
