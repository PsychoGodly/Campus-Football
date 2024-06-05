package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.q;
import androidx.work.r;
import androidx.work.z;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class WorkManagerUtil extends s0 {
    private static void M0(Context context) {
        try {
            z.h(context.getApplicationContext(), new b.C0091b().a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(a aVar) {
        Context context = (Context) com.google.android.gms.dynamic.b.A1(aVar);
        M0(context);
        try {
            z g10 = z.g(context);
            g10.a("offline_ping_sender_work");
            g10.c((r) ((r.a) ((r.a) new r.a(OfflinePingSender.class).f(new c.a().b(q.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e10) {
            zzbza.zzk("Failed to instantiate WorkManager.", e10);
        }
    }

    public final boolean zzf(a aVar, String str, String str2) {
        Context context = (Context) com.google.android.gms.dynamic.b.A1(aVar);
        M0(context);
        c a10 = new c.a().b(q.CONNECTED).a();
        try {
            z.g(context).c((r) ((r.a) ((r.a) ((r.a) new r.a(OfflineNotificationPoster.class).f(a10)).h(new e.a().h("uri", str).h("gws_query_id", str2).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e10) {
            zzbza.zzk("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
