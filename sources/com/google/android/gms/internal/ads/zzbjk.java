package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbjk implements zzakh {
    /* access modifiers changed from: private */
    public volatile zzbix zza;
    private final Context zzb;

    public zzbjk(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbjk zzbjk) {
        if (zzbjk.zza != null) {
            zzbjk.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzakk zza(zzako zzako) throws zzakx {
        Parcelable.Creator<zzbiy> creator = zzbiy.CREATOR;
        Map zzl = zzako.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbiy zzbiy = new zzbiy(zzako.zzk(), strArr, strArr2);
        long b10 = t.b().b();
        try {
            zzbzs zzbzs = new zzbzs();
            this.zza = new zzbix(this.zzb, t.v().b(), new zzbji(this, zzbzs), new zzbjj(this, zzbzs));
            this.zza.checkAvailabilityAndConnect();
            zzbjg zzbjg = new zzbjg(this, zzbiy);
            zzfuu zzfuu = zzbzn.zza;
            zzfut zzn = zzfuj.zzn(zzfuj.zzm(zzbzs, zzbjg, zzfuu), (long) ((Integer) a0.c().zzb(zzbar.zzea)).intValue(), TimeUnit.MILLISECONDS, zzbzn.zzd);
            zzn.zzc(new zzbjh(this), zzfuu);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzn.get();
            long b11 = t.b().b() - b10;
            n1.a("Http assets remote cache took " + b11 + "ms");
            zzbja zzbja = (zzbja) new zzbtl(parcelFileDescriptor).zza(zzbja.CREATOR);
            if (zzbja == null) {
                return null;
            }
            if (zzbja.zza) {
                throw new zzakx(zzbja.zzb);
            } else if (zzbja.zze.length != zzbja.zzf.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbja.zze;
                    if (i10 >= strArr3.length) {
                        return new zzakk(zzbja.zzc, zzbja.zzd, (Map) hashMap, zzbja.zzg, zzbja.zzh);
                    }
                    hashMap.put(strArr3[i10], zzbja.zzf[i10]);
                    i10++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            n1.a("Http assets remote cache took " + (t.b().b() - b10) + "ms");
            return null;
        } catch (Throwable th) {
            n1.a("Http assets remote cache took " + (t.b().b() - b10) + "ms");
            throw th;
        }
    }
}
