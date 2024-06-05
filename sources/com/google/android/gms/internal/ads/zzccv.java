package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzccv implements zzbhp {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzbza.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccu zzccu;
        zzccm zzccm;
        Map map2 = map;
        zzcbj zzcbj = (zzcbj) obj;
        if (zzbza.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zzbza.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccn A = t.A();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer zzb = zzb(map2, "periodicReportIntervalMs");
            Integer zzb2 = zzb(map2, "exoPlayerRenderingIntervalMs");
            Integer zzb3 = zzb(map2, "exoPlayerIdleIntervalMs");
            zzcbi zzcbi = new zzcbi((String) map2.get("flags"));
            boolean z10 = zzcbi.zzl;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            strArr2[i10] = jSONArray.getString(i10);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zzbza.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z10) {
                    Iterator it = A.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzccm = null;
                            break;
                        }
                        zzccm zzccm2 = (zzccm) it.next();
                        if (zzccm2.zza == zzcbj && str.equals(zzccm2.zze())) {
                            zzccm = zzccm2;
                            break;
                        }
                    }
                } else {
                    zzccm = A.zza(zzcbj);
                }
                if (zzccm != null) {
                    zzbza.zzj("Precache task is already running.");
                    return;
                } else if (zzcbj.zzj() == null) {
                    zzbza.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer zzb4 = zzb(map2, "player");
                    if (zzb4 == null) {
                        zzb4 = 0;
                    }
                    if (zzb != null) {
                        zzcbj.zzA(zzb.intValue());
                    }
                    if (zzb2 != null) {
                        zzcbj.zzy(zzb2.intValue());
                    }
                    if (zzb3 != null) {
                        zzcbj.zzx(zzb3.intValue());
                    }
                    int intValue = zzb4.intValue();
                    zzccg zzccg = zzcbj.zzj().f14403b;
                    if (intValue > 0) {
                        int zzu = zzcba.zzu();
                        if (zzu < zzcbi.zzh) {
                            zzccu = new zzcdd(zzcbj, zzcbi);
                        } else if (zzu < zzcbi.zzb) {
                            zzccu = new zzcda(zzcbj, zzcbi);
                        } else {
                            zzccu = new zzccy(zzcbj);
                        }
                    } else {
                        zzccu = new zzccx(zzcbj);
                    }
                    new zzccm(zzcbj, zzccu, str, strArr).zzb();
                }
            } else {
                zzccm zza = A.zza(zzcbj);
                if (zza != null) {
                    zzccu = zza.zzb;
                } else {
                    zzbza.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb5 = zzb(map2, "minBufferMs");
            if (zzb5 != null) {
                zzccu.zzs(zzb5.intValue());
            }
            Integer zzb6 = zzb(map2, "maxBufferMs");
            if (zzb6 != null) {
                zzccu.zzr(zzb6.intValue());
            }
            Integer zzb7 = zzb(map2, "bufferForPlaybackMs");
            if (zzb7 != null) {
                zzccu.zzp(zzb7.intValue());
            }
            Integer zzb8 = zzb(map2, "bufferForPlaybackAfterRebufferMs");
            if (zzb8 != null) {
                zzccu.zzq(zzb8.intValue());
            }
        } else if (!A.zzd(zzcbj)) {
            zzbza.zzj("Precache abort but no precache task running.");
        }
    }
}
