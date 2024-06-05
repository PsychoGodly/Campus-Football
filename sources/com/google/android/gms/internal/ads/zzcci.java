package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.k1;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcci implements zzbhp {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                x.b();
                i10 = zzbyt.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (n1.c()) {
            n1.a("Parse pixels for " + str + ", got string " + str2 + ", int " + i10 + ".");
        }
        return i10;
    }

    private static void zzc(zzcax zzcax, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcax.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbza.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzcax.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcax.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcax.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcax.zzD(Integer.parseInt(str5));
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        int i11;
        int i12;
        Map map2 = map;
        zzcbj zzcbj = (zzcbj) obj;
        Integer num = null;
        Integer valueOf = map2.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map2.get("playerId"))) : null;
        Integer zzl = (zzcbj.zzo() == null || zzcbj.zzo().zza() == null) ? null : zzcbj.zzo().zza().zzl();
        if (valueOf == null || zzl == null || valueOf.equals(zzl)) {
            String str = (String) map2.get("action");
            if (str == null) {
                zzbza.zzj("Action missing from video GMSG.");
                return;
            }
            if (zzbza.zzm(3)) {
                JSONObject jSONObject = new JSONObject(map2);
                jSONObject.remove("google.afma.Notify_dt");
                zzbza.zze("Video GMSG: " + str + " " + jSONObject.toString());
            }
            if ("background".equals(str)) {
                String str2 = (String) map2.get("color");
                if (TextUtils.isEmpty(str2)) {
                    zzbza.zzj("Color parameter missing from background video GMSG.");
                    return;
                }
                try {
                    zzcbj.setBackgroundColor(Color.parseColor(str2));
                } catch (IllegalArgumentException unused) {
                    zzbza.zzj("Invalid color parameter in background video GMSG.");
                }
            } else if ("playerBackground".equals(str)) {
                String str3 = (String) map2.get("color");
                if (TextUtils.isEmpty(str3)) {
                    zzbza.zzj("Color parameter missing from playerBackground video GMSG.");
                    return;
                }
                try {
                    zzcbj.zzB(Color.parseColor(str3));
                } catch (IllegalArgumentException unused2) {
                    zzbza.zzj("Invalid color parameter in playerBackground video GMSG.");
                }
            } else if ("decoderProps".equals(str)) {
                String str4 = (String) map2.get("mimeTypes");
                if (str4 == null) {
                    zzbza.zzj("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzcbj.zzd("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, k1.a(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzcbj.zzd("onVideoEvent", hashMap3);
            } else {
                zzcay zzo = zzcbj.zzo();
                if (zzo == null) {
                    zzbza.zzj("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = zzcbj.getContext();
                    int zzb = zzb(context, map2, "x", 0);
                    int zzb2 = zzb(context, map2, "y", 0);
                    int zzb3 = zzb(context, map2, "w", -1);
                    zzbaj zzbaj = zzbar.zzdt;
                    if (!((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                        if (n1.c()) {
                            n1.a("Calculate width with original width " + zzb3 + ", videoHost.getVideoBoundingWidth() " + zzcbj.zzh() + ", x " + zzb + ".");
                        }
                        i10 = Math.min(zzb3, zzcbj.zzh() - zzb);
                    } else if (zzb3 == -1) {
                        i10 = zzcbj.zzh();
                    } else {
                        i10 = Math.min(zzb3, zzcbj.zzh());
                    }
                    int zzb4 = zzb(context, map2, "h", -1);
                    if (!((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                        if (n1.c()) {
                            n1.a("Calculate height with original height " + zzb4 + ", videoHost.getVideoBoundingHeight() " + zzcbj.zzg() + ", y " + zzb2 + ".");
                        }
                        i11 = Math.min(zzb4, zzcbj.zzg() - zzb2);
                    } else if (zzb4 == -1) {
                        i11 = zzcbj.zzg();
                    } else {
                        i11 = Math.min(zzb4, zzcbj.zzg());
                    }
                    int i13 = i11;
                    try {
                        i12 = Integer.parseInt((String) map2.get("player"));
                    } catch (NumberFormatException unused3) {
                        i12 = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                    if (!equals || zzo.zza() != null) {
                        zzo.zzb(zzb, zzb2, i10, i13);
                        return;
                    }
                    zzo.zzc(zzb, zzb2, i10, i13, i12, parseBoolean, new zzcbi((String) map2.get("flags")), valueOf);
                    zzcax zza2 = zzo.zza();
                    if (zza2 != null) {
                        zzc(zza2, map2);
                        return;
                    }
                    return;
                }
                zzcfe zzq = zzcbj.zzq();
                if (zzq != null) {
                    if ("timeupdate".equals(str)) {
                        String str6 = (String) map2.get("currentTime");
                        if (str6 == null) {
                            zzbza.zzj("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            zzq.zzt(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused4) {
                            zzbza.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        zzq.zzu();
                        return;
                    }
                }
                zzcax zza3 = zzo.zza();
                if (zza3 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    zzcbj.zzd("onVideoEvent", hashMap4);
                } else if ("click".equals(str)) {
                    Context context2 = zzcbj.getContext();
                    int zzb5 = zzb(context2, map2, "x", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) zzb5, (float) zzb(context2, map2, "y", 0), 0);
                    zza3.zzx(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map2.get("time");
                    if (str7 == null) {
                        zzbza.zzj("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        zza3.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                    } catch (NumberFormatException unused5) {
                        zzbza.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                    }
                } else if ("hide".equals(str)) {
                    zza3.setVisibility(4);
                } else if ("load".equals(str)) {
                    zza3.zzr();
                } else if ("loadControl".equals(str)) {
                    zzc(zza3, map2);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map2.get("muted"))) {
                        zza3.zzs();
                    } else {
                        zza3.zzI();
                    }
                } else if ("pause".equals(str)) {
                    zza3.zzu();
                } else if ("play".equals(str)) {
                    zza3.zzv();
                } else if ("show".equals(str)) {
                    zza3.setVisibility(0);
                } else if ("src".equals(str)) {
                    String str8 = (String) map2.get("src");
                    if (map2.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map2.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused6) {
                            zzbza.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map2.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map2.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                strArr2[i14] = jSONArray.getString(i14);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused7) {
                            zzbza.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num != null) {
                        zzcbj.zzA(num.intValue());
                    }
                    zza3.zzE(str8, strArr);
                } else if ("touchMove".equals(str)) {
                    Context context3 = zzcbj.getContext();
                    zza3.zzH((float) zzb(context3, map2, "dx", 0), (float) zzb(context3, map2, "dy", 0));
                    if (!this.zza) {
                        zzcbj.zzu();
                        this.zza = true;
                    }
                } else if ("volume".equals(str)) {
                    String str10 = (String) map2.get("volume");
                    if (str10 == null) {
                        zzbza.zzj("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        zza3.zzG(Float.parseFloat(str10));
                    } catch (NumberFormatException unused8) {
                        zzbza.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                    }
                } else if ("watermark".equals(str)) {
                    zza3.zzn();
                } else {
                    zzbza.zzj("Unknown video action: ".concat(str));
                }
            }
        } else {
            zzbza.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", new Object[]{valueOf, zzl}));
        }
    }
}
