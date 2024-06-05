package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzccj implements zzbhp {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbj zzcbj = (zzcbj) obj;
        zzcfe zzq = zzcbj.zzq();
        if (zzq == null) {
            try {
                zzcfe zzcfe = new zzcfe(zzcbj, Float.parseFloat((String) map.get("duration")), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("customControlsAllowed")), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("clickToExpandAllowed")));
                zzcbj.zzC(zzcfe);
                zzq = zzcfe;
            } catch (NullPointerException e10) {
                e = e10;
                zzbza.zzh("Unable to parse videoMeta message.", e);
                t.q().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                zzbza.zzh("Unable to parse videoMeta message.", e);
                t.q().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i10 = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i10 = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzbza.zzm(3)) {
            zzbza.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i10 + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat2, parseFloat, i10, equals, parseFloat3);
    }
}
