package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.Map;
import s4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbpx extends zzbqf {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    private final String zzc = zze("description");
    private final long zzd = zzd("start_ticks");
    private final long zze = zzd("end_ticks");
    private final String zzf = zze("summary");
    private final String zzg = zze("location");

    public zzbpx(zzcei zzcei, Map map) {
        super(zzcei, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcei.zzi();
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? MaxReward.DEFAULT_LABEL : (String) this.zza.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        t.r();
        if (!new zzbab(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        t.r();
        AlertDialog.Builder g10 = b2.g(this.zzb);
        Resources zzd2 = t.q().zzd();
        g10.setTitle(zzd2 != null ? zzd2.getString(b.f22501o) : "Create calendar event");
        g10.setMessage(zzd2 != null ? zzd2.getString(b.f22502p) : "Allow Ad to create a calendar event?");
        g10.setPositiveButton(zzd2 != null ? zzd2.getString(b.f22499m) : "Accept", new zzbpv(this));
        g10.setNegativeButton(zzd2 != null ? zzd2.getString(b.f22500n) : "Decline", new zzbpw(this));
        g10.create().show();
    }
}
