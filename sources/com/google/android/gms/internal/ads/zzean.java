package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.browser.customtabs.b;
import androidx.core.app.l;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.t0;
import com.google.android.gms.dynamic.a;
import java.util.HashMap;
import java.util.Map;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzean extends zzbqu {
    private final Context zza;
    private final zzdpi zzb;
    private final zzbzf zzc;
    private final zzeaf zzd;
    private final zzfdk zze;

    public zzean(Context context, zzeaf zzeaf, zzbzf zzbzf, zzdpi zzdpi, zzfdk zzfdk) {
        this.zza = context;
        this.zzb = zzdpi;
        this.zzc = zzbzf;
        this.zzd = zzeaf;
        this.zze = zzfdk;
    }

    public static void zzc(Context context, zzdpi zzdpi, zzfdk zzfdk, zzeaf zzeaf, String str, String str2) {
        zzd(context, zzdpi, zzfdk, zzeaf, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdpi zzdpi, zzfdk zzfdk, zzeaf zzeaf, String str, String str2, Map map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) a0.c().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzb2 = zzfdj.zzb(str2);
            zzb2.zza("gqi", str);
            if (true == t.q().zzx(context)) {
                str4 = b.ONLINE_EXTRAS_KEY;
            }
            zzb2.zza("device_connectivity", str4);
            zzb2.zza("event_timestamp", String.valueOf(t.b().a()));
            for (Map.Entry entry : map.entrySet()) {
                zzb2.zza((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zzfdk.zza(zzb2);
        } else {
            zzdph zza2 = zzdpi.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            if (true == t.q().zzx(context)) {
                str4 = b.ONLINE_EXTRAS_KEY;
            }
            zza2.zzb("device_connectivity", str4);
            zza2.zzb("event_timestamp", String.valueOf(t.b().a()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            str3 = zza2.zzf();
        }
        zzeaf.zzd(new zzeah(t.b().a(), str, str3, 2));
    }

    public static void zzh(Activity activity, r rVar, t0 t0Var, zzeaf zzeaf, zzdpi zzdpi, zzfdk zzfdk, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        t.r();
        AlertDialog.Builder g10 = b2.g(activity);
        Resources zzd2 = t.q().zzd();
        if (zzd2 == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = zzd2.getString(s4.b.offline_opt_in_title);
        }
        AlertDialog.Builder title = g10.setTitle(str3);
        if (zzd2 == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = zzd2.getString(s4.b.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (zzd2 == null) {
            str5 = "OK";
        } else {
            str5 = zzd2.getString(s4.b.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new zzeaj(zzdpi, activity, zzfdk, zzeaf, str, t0Var, str2, zzd2, rVar));
        if (zzd2 == null) {
            str6 = "No thanks";
        } else {
            str6 = zzd2.getString(s4.b.offline_opt_in_decline);
        }
        positiveButton.setNegativeButton(str6, new zzeak(zzeaf, str, zzdpi, activity, zzfdk, rVar)).setOnCancelListener(new zzeal(zzeaf, str, zzdpi, activity, zzfdk, rVar));
        g10.create().show();
    }

    private final void zzi(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private static final PendingIntent zzj(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfla.zza(context, 0, intent, zzfla.zza | 1073741824, 0);
    }

    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzx = t.q().zzx(this.zza);
            HashMap hashMap = new HashMap();
            char c10 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzx) {
                    c10 = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (c10 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzeaf.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                zzbza.zzg("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    public final void zzf() {
        this.zzd.zze(new zzeab(this.zzc));
    }

    public final void zzg(a aVar, String str, String str2) {
        String str3;
        String str4;
        String str5;
        Context context = (Context) com.google.android.gms.dynamic.b.A1(aVar);
        t.s().f(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzj = zzj(context, "offline_notification_clicked", str2, str);
        PendingIntent zzj2 = zzj(context, "offline_notification_dismissed", str2, str);
        Resources zzd2 = t.q().zzd();
        l.e eVar = new l.e(context, "offline_notification_channel");
        if (zzd2 == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = zzd2.getString(s4.b.offline_notification_title);
        }
        l.e q10 = eVar.q(str3);
        if (zzd2 == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = zzd2.getString(s4.b.offline_notification_text);
        }
        l.e G = q10.p(str4).k(true).s(zzj2).o(zzj).G(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, G.c());
            str5 = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            hashMap.put("notification_not_shown_reason", e10.getMessage());
            str5 = "offline_notification_failed";
        }
        zzi(str2, str5, hashMap);
    }
}
