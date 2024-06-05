package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.o;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.t0;
import com.unity3d.services.UnityAdsConstants;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t4.c0;
import t4.i;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbhz implements zzbhp {
    private final b zza;
    private final zzdpi zzb;
    private final zzfdk zzc;
    private final zzbzf zzd;
    private final zzbpz zze;
    private final zzeaf zzf;
    private c0 zzg = null;

    public zzbhz(b bVar, zzbpz zzbpz, zzeaf zzeaf, zzdpi zzdpi, zzfdk zzfdk) {
        this.zza = bVar;
        this.zze = zzbpz;
        this.zzf = zzeaf;
        this.zzb = zzdpi;
        this.zzc = zzfdk;
        this.zzd = new zzbzf((String) null);
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzapw zzapw, Uri uri, View view, Activity activity) {
        if (zzapw == null) {
            return uri;
        }
        try {
            if (zzapw.zze(uri)) {
                return zzapw.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzapx unused) {
            return uri;
        } catch (Exception e10) {
            t.q().zzu(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzbza.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("custom_close"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r3 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzh(com.google.android.gms.ads.internal.client.a r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 1
            r1.zzi(r3)
            r4 = r0
            com.google.android.gms.internal.ads.zzcei r4 = (com.google.android.gms.internal.ads.zzcei) r4
            android.content.Context r5 = r4.getContext()
            com.google.android.gms.internal.ads.zzapw r6 = r4.zzI()
            android.view.View r7 = r4.zzF()
            java.lang.String r8 = "activity"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.lang.String r9 = "u"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 == 0) goto L_0x0032
            goto L_0x0134
        L_0x0032:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri r9 = zzc(r5, r6, r9, r7, r11)
            android.net.Uri r9 = zzd(r9)
            java.lang.String r10 = "use_first_package"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.String r12 = "use_running_process"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            java.lang.String r13 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzeb
            com.google.android.gms.internal.ads.zzbap r14 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r14.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.String r2 = r9.getScheme()
            java.lang.String r14 = "http"
            boolean r2 = r14.equalsIgnoreCase(r2)
            java.lang.String r15 = "https"
            if (r2 == 0) goto L_0x0093
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
            android.net.Uri r11 = r2.build()
            goto L_0x00a9
        L_0x0093:
            java.lang.String r2 = r9.getScheme()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a9
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r14)
            android.net.Uri r11 = r2.build()
        L_0x00a9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.zzbhy.zza(r9, r5, r6, r7)
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbhy.zza(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00c4
            com.google.android.gms.ads.internal.t.r()
            com.google.android.gms.ads.internal.util.b2.L(r5, r9)
            com.google.android.gms.ads.internal.t.r()
            com.google.android.gms.ads.internal.util.b2.L(r5, r11)
        L_0x00c4:
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbhy.zzd(r9, r2, r5, r6, r7)
            if (r3 == 0) goto L_0x00cf
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbhy.zzb(r9, r3, r5, r6, r7)
            goto L_0x0134
        L_0x00cf:
            if (r11 == 0) goto L_0x00e1
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbhy.zzc(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00e1
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbhy.zzb(r9, r3, r5, r6, r7)
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbhy.zzc(r11, r5, r6, r7)
            if (r3 != 0) goto L_0x0134
        L_0x00e1:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00e8
            goto L_0x0133
        L_0x00e8:
            if (r12 == 0) goto L_0x0125
            if (r8 == 0) goto L_0x0125
            java.util.List r3 = r8.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0125
            int r8 = r2.size()
            r11 = 0
        L_0x00f7:
            if (r11 >= r8) goto L_0x0125
            java.lang.Object r12 = r2.get(r11)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r14 = r3.iterator()
        L_0x0103:
            boolean r15 = r14.hasNext()
            int r16 = r11 + 1
            if (r15 == 0) goto L_0x0122
            java.lang.Object r15 = r14.next()
            android.app.ActivityManager$RunningAppProcessInfo r15 = (android.app.ActivityManager.RunningAppProcessInfo) r15
            java.lang.String r15 = r15.processName
            android.content.pm.ActivityInfo r13 = r12.activityInfo
            java.lang.String r13 = r13.packageName
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0103
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbhy.zzb(r9, r12, r5, r6, r7)
            goto L_0x0134
        L_0x0122:
            r11 = r16
            goto L_0x00f7
        L_0x0125:
            if (r10 == 0) goto L_0x0133
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbhy.zzb(r9, r2, r5, r6, r7)
            goto L_0x0134
        L_0x0133:
            r11 = r9
        L_0x0134:
            if (r20 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzeaf r2 = r1.zzf
            if (r2 == 0) goto L_0x0152
            if (r11 == 0) goto L_0x0152
            android.content.Context r2 = r4.getContext()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r4 = r21
            boolean r2 = r1.zzj(r0, r2, r3, r4)
            if (r2 != 0) goto L_0x0151
            goto L_0x0152
        L_0x0151:
            return
        L_0x0152:
            com.google.android.gms.internal.ads.zzcfn r0 = (com.google.android.gms.internal.ads.zzcfn) r0     // Catch:{ ActivityNotFoundException -> 0x0161 }
            t4.i r2 = new t4.i     // Catch:{ ActivityNotFoundException -> 0x0161 }
            t4.c0 r3 = r1.zzg     // Catch:{ ActivityNotFoundException -> 0x0161 }
            r2.<init>(r11, r3)     // Catch:{ ActivityNotFoundException -> 0x0161 }
            r3 = r22
            r0.zzaD(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x0161 }
            return
        L_0x0161:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.ads.zzbza.zzj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhz.zzh(com.google.android.gms.ads.internal.client.a, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzi(boolean z10) {
        zzbpz zzbpz = this.zze;
        if (zzbpz != null) {
            zzbpz.zza(z10);
        }
    }

    private final boolean zzj(a aVar, Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        zzdpi zzdpi = this.zzb;
        if (zzdpi != null) {
            zzean.zzc(context, zzdpi, this.zzc, this.zzf, str2, "offline_open");
        }
        if (t.q().zzx(context2)) {
            this.zzf.zzh(this.zzd, str3);
            return false;
        }
        t.r();
        t0 U = b2.U(context);
        t.r();
        boolean a10 = o.e(context).a();
        boolean g10 = t.s().g(context2, "offline_notification_channel");
        zzcei zzcei = (zzcei) aVar;
        boolean z10 = zzcei.zzO().zzi() && zzcei.zzi() == null;
        if (a10 && !g10 && U != null && !z10) {
            if (((Boolean) a0.c().zzb(zzbar.zzhK)).booleanValue()) {
                if (zzcei.zzO().zzi()) {
                    String str4 = str3;
                    zzean.zzh(zzcei.zzi(), (r) null, U, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    String str5 = str3;
                    ((zzcfn) aVar).zzaE(U, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdpi zzdpi2 = this.zzb;
                if (zzdpi2 != null) {
                    zzean.zzc(context, zzdpi2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                aVar.onAdClicked();
                return true;
            }
        }
        this.zzf.zzc(str3);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            if (!a10) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (g10) {
                hashMap.put("dialog_not_shown_reason", "notification_channel_disabled");
            } else if (U == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) a0.c().zzb(zzbar.zzhK)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z10) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzean.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void zzk(int i10) {
        if (this.zzb != null) {
            if (((Boolean) a0.c().zzb(zzbar.zzhS)).booleanValue()) {
                zzfdk zzfdk = this.zzc;
                String zza2 = zzbbr.zza(i10);
                zzfdj zzb2 = zzfdj.zzb("cct_action");
                zzb2.zza("cct_open_status", zza2);
                zzfdk.zzb(zzb2);
                return;
            }
            zzdph zza3 = this.zzb.zza();
            zza3.zzb("action", "cct_action");
            zza3.zzb("cct_open_status", zzbbr.zza(i10));
            zza3.zzg();
        }
    }

    /* renamed from: zze */
    public final void zza(a aVar, Map map) {
        String str;
        boolean z10;
        Object obj;
        HashMap hashMap;
        a aVar2 = aVar;
        Map map2 = map;
        zzcei zzcei = (zzcei) aVar2;
        String zzc2 = zzbxh.zzc((String) map2.get("u"), zzcei.getContext(), true);
        String str2 = (String) map2.get("a");
        if (str2 == null) {
            zzbza.zzj("Action missing from an open GMSG.");
            return;
        }
        b bVar = this.zza;
        if (bVar == null || bVar.c()) {
            zzeyc zzD = zzcei.zzD();
            zzeyf zzP = zzcei.zzP();
            boolean z11 = false;
            if (zzD == null || zzP == null) {
                str = MaxReward.DEFAULT_LABEL;
                z10 = false;
            } else {
                z10 = zzD.zzaj;
                str = zzP.zzb;
            }
            boolean z12 = !((Boolean) a0.c().zzb(zzbar.zzjd)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals("0");
            if ("expand".equalsIgnoreCase(str2)) {
                if (zzcei.zzaA()) {
                    zzbza.zzj("Cannot expand WebView that is already expanded.");
                    return;
                }
                zzi(false);
                ((zzcfn) aVar2).zzaF(zzf(map), zzb(map), z12);
            } else if ("webapp".equalsIgnoreCase(str2)) {
                zzi(false);
                if (zzc2 != null) {
                    ((zzcfn) aVar2).zzaG(zzf(map), zzb(map), zzc2, z12);
                } else {
                    ((zzcfn) aVar2).zzaH(zzf(map), zzb(map), (String) map2.get("html"), (String) map2.get("baseurl"), z12);
                }
            } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = zzcei.getContext();
                if (((Boolean) a0.c().zzb(zzbar.zzed)).booleanValue()) {
                    if (((Boolean) a0.c().zzb(zzbar.zzej)).booleanValue()) {
                        n1.a("User opt out chrome custom tab.");
                    } else {
                        if (!((Boolean) a0.c().zzb(zzbar.zzeh)).booleanValue()) {
                            z11 = true;
                        } else {
                            String str3 = (String) a0.c().zzb(zzbar.zzei);
                            if (!str3.isEmpty() && context != null) {
                                String packageName = context.getPackageName();
                                Iterator it = zzfoh.zzc(zzfng.zzc(';')).zzd(str3).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((String) it.next()).equals(packageName)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                z11 = true;
                            }
                        }
                    }
                }
                boolean zzg2 = zzbbs.zzg(zzcei.getContext());
                if (z11) {
                    if (!zzg2) {
                        zzk(4);
                    } else {
                        zzi(true);
                        if (TextUtils.isEmpty(zzc2)) {
                            zzbza.zzj("Cannot open browser with null or empty url");
                            zzk(7);
                            return;
                        }
                        Uri zzd2 = zzd(zzc(zzcei.getContext(), zzcei.zzI(), Uri.parse(zzc2), zzcei.zzF(), zzcei.zzi()));
                        if (!z10 || this.zzf == null || !zzj(aVar2, zzcei.getContext(), zzd2.toString(), str)) {
                            this.zzg = new zzbhw(this);
                            ((zzcfn) aVar2).zzaD(new i((String) null, zzd2.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, com.google.android.gms.dynamic.b.B1(this.zzg).asBinder(), true), z12);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                zzh(aVar, map, z10, str, z12);
            } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                zzh(aVar, map, z10, str, z12);
            } else if ("open_app".equalsIgnoreCase(str2)) {
                if (((Boolean) a0.c().zzb(zzbar.zzhC)).booleanValue()) {
                    zzi(true);
                    String str4 = (String) map2.get("p");
                    if (str4 == null) {
                        zzbza.zzj("Package name missing from open app action.");
                    } else if (!z10 || this.zzf == null || !zzj(aVar2, zzcei.getContext(), str4, str)) {
                        PackageManager packageManager = zzcei.getContext().getPackageManager();
                        if (packageManager == null) {
                            zzbza.zzj("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            ((zzcfn) aVar2).zzaD(new i(launchIntentForPackage, this.zzg), z12);
                        }
                    }
                }
            } else {
                zzi(true);
                String str5 = (String) map2.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        intent = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e10) {
                        zzbza.zzh("Error parsing the url: ".concat(String.valueOf(str5)), e10);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri zzd3 = zzd(zzc(zzcei.getContext(), zzcei.zzI(), data, zzcei.zzF(), zzcei.zzi()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) a0.c().zzb(zzbar.zzhD)).booleanValue()) {
                                intent2.setDataAndType(zzd3, intent2.getType());
                            }
                        }
                        intent2.setData(zzd3);
                    }
                }
                boolean z13 = ((Boolean) a0.c().zzb(zzbar.zzhO)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z13) {
                    hashMap = hashMap2;
                    obj = "p";
                    zzbhx zzbhx = r1;
                    zzbhx zzbhx2 = new zzbhx(this, z12, aVar, hashMap2, map);
                    this.zzg = zzbhx;
                    z12 = false;
                } else {
                    hashMap = hashMap2;
                    obj = "p";
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    if (!TextUtils.isEmpty(zzc2)) {
                        zzc2 = zzd(zzc(zzcei.getContext(), zzcei.zzI(), Uri.parse(zzc2), zzcei.zzF(), zzcei.zzi())).toString();
                    }
                    if (!z10 || this.zzf == null || !zzj(aVar2, zzcei.getContext(), zzc2, str)) {
                        ((zzcfn) aVar2).zzaD(new i((String) map2.get("i"), zzc2, (String) map2.get("m"), (String) map2.get(obj), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzg), z12);
                    } else if (z13) {
                        hashMap3.put((String) map2.get("event_id"), Boolean.TRUE);
                        ((zzbki) aVar2).zzd("openIntentAsync", hashMap3);
                    }
                } else if (!z10 || this.zzf == null || !zzj(aVar2, zzcei.getContext(), intent2.getData().toString(), str)) {
                    ((zzcfn) aVar2).zzaD(new i(intent2, this.zzg), z12);
                } else if (z13) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbki) aVar2).zzd("openIntentAsync", hashMap4);
                }
            }
        } else {
            this.zza.b(zzc2);
        }
    }
}
