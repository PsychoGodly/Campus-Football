package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import h5.f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbsf implements zzbsh {
    static zzbsh zza;
    static zzbsh zzb;
    private static final Object zzc = new Object();
    private final Object zzd = new Object();
    private final Context zze;
    private final WeakHashMap zzf = new WeakHashMap();
    private final ExecutorService zzg;
    private final zzbzg zzh;

    protected zzbsf(Context context, zzbzg zzbzg) {
        zzfkq.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzg;
    }

    public static zzbsh zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbct.zze.zze()).booleanValue()) {
                    if (!((Boolean) a0.c().zzb(zzbar.zzhf)).booleanValue()) {
                        zza = new zzbsf(context, zzbzg.zza());
                    }
                }
                zza = new zzbsg();
            }
        }
        return zza;
    }

    public static zzbsh zzb(Context context, zzbzg zzbzg) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbct.zze.zze()).booleanValue()) {
                    if (!((Boolean) a0.c().zzb(zzbar.zzhf)).booleanValue()) {
                        zzbsf zzbsf = new zzbsf(context, zzbzg);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbsf.zzd) {
                                zzbsf.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbse(zzbsf, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbsd(zzbsf, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbsf;
                    }
                }
                zzb = new zzbsg();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfoj.zzc(zzbyt.zzf(zzc(th)));
    }

    /* access modifiers changed from: protected */
    public final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z10 |= zzbyt.zzp(stackTraceElement.getClassName());
                    z11 |= zzbsf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z10 && !z11) {
                zzg(th, MaxReward.DEFAULT_LABEL, 1.0f);
            }
        }
    }

    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    public final void zzg(Throwable th, String str, float f10) {
        boolean z10;
        String str2;
        if (zzbyt.zzg(th) != null) {
            String name = th.getClass().getName();
            String zzc2 = zzc(th);
            String zzd2 = ((Boolean) a0.c().zzb(zzbar.zzib)).booleanValue() ? zzd(th) : MaxReward.DEFAULT_LABEL;
            double d10 = (double) f10;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            double random = Math.random();
            int i11 = i10 > 0 ? (int) (1.0f / f10) : 1;
            if (random < d10) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z10 = c.a(this.zze).g();
                } catch (Throwable th2) {
                    zzbza.zzh("Error fetching instant app info", th2);
                    z10 = false;
                }
                try {
                    str2 = this.zze.getPackageName();
                } catch (Throwable unused) {
                    zzbza.zzj("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", zzbar.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "513548808").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(zzbct.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(f.h().b(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                if (!TextUtils.isEmpty(zzd2)) {
                    appendQueryParameter2.appendQueryParameter("hash", zzd2);
                }
                arrayList.add(appendQueryParameter2.toString());
                for (String zzbsc : arrayList) {
                    this.zzg.execute(new zzbsc(new zzbzf((String) null), zzbsc));
                }
            }
        }
    }
}
