package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeap implements zzeaq {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzffp zzf(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zzffp r4 = com.google.android.gms.internal.ads.zzffp.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zzffp r4 = com.google.android.gms.internal.ads.zzffp.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zzffp r4 = com.google.android.gms.internal.ads.zzffp.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeap.zzf(java.lang.String):com.google.android.gms.internal.ads.zzffp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzffr zzg(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeap.zzg(java.lang.String):com.google.android.gms.internal.ads.zzffr");
    }

    private static zzffs zzh(String str) {
        if ("native".equals(str)) {
            return zzffs.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzffs.JAVASCRIPT;
        }
        return zzffs.NONE;
    }

    public final a zza(String str, WebView webView, String str2, String str3, String str4, zzeas zzeas, zzear zzear, String str5) {
        if (!((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue() || !zzffi.zzb()) {
            return null;
        }
        zzfft zza = zzfft.zza("Google", str);
        zzffs zzh = zzh("javascript");
        zzffp zzf = zzf(zzear.toString());
        zzffs zzffs = zzffs.NONE;
        if (zzh == zzffs) {
            zzbza.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzf == null) {
            zzbza.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzear)));
            return null;
        } else {
            zzffs zzh2 = zzh(str4);
            if (zzf == zzffp.VIDEO && zzh2 == zzffs) {
                zzbza.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            return b.B1(zzffk.zza(zzffl.zza(zzf, zzg(zzeas.toString()), zzh, zzh2, true), zzffm.zzb(zza, webView, str5, MaxReward.DEFAULT_LABEL)));
        }
    }

    public final a zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzeas zzeas, zzear zzear, String str6) {
        if (!((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue() || !zzffi.zzb()) {
            return null;
        }
        zzfft zza = zzfft.zza(str5, str);
        zzffs zzh = zzh("javascript");
        zzffs zzh2 = zzh(str4);
        zzffp zzf = zzf(zzear.toString());
        zzffs zzffs = zzffs.NONE;
        if (zzh == zzffs) {
            zzbza.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzf == null) {
            zzbza.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzear)));
            return null;
        } else if (zzf == zzffp.VIDEO && zzh2 == zzffs) {
            zzbza.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            return b.B1(zzffk.zza(zzffl.zza(zzf, zzg(zzeas.toString()), zzh, zzh2, true), zzffm.zzc(zza, webView, str6, MaxReward.DEFAULT_LABEL)));
        }
    }

    public final void zzc(a aVar, View view) {
        if (((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object A1 = b.A1(aVar);
            if (A1 instanceof zzffk) {
                ((zzffk) A1).zzd(view);
            }
        }
    }

    public final void zzd(a aVar) {
        if (((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object A1 = b.A1(aVar);
            if (A1 instanceof zzffk) {
                ((zzffk) A1).zze();
            }
        }
    }

    public final boolean zze(Context context) {
        if (!((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue()) {
            zzbza.zzj("Omid flag is disabled");
            return false;
        } else if (zzffi.zzb()) {
            return true;
        } else {
            zzffi.zza(context);
            return zzffi.zzb();
        }
    }
}
