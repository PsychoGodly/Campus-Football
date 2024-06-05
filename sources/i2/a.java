package i2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import b2.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j2.d;

/* compiled from: AlarmManagerScheduler */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18871a;

    /* renamed from: b  reason: collision with root package name */
    private final d f18872b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f18873c;

    /* renamed from: d  reason: collision with root package name */
    private final g f18874d;

    /* renamed from: e  reason: collision with root package name */
    private final l2.a f18875e;

    public a(Context context, d dVar, l2.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    public void a(o oVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.b());
        builder.appendQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, String.valueOf(m2.a.a(oVar.d())));
        if (oVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.c(), 0));
        }
        Intent intent = new Intent(this.f18871a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (z10 || !c(intent)) {
            long I0 = this.f18872b.I0(oVar);
            long g10 = this.f18874d.g(oVar.d(), I0, i10);
            f2.a.c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g10), Long.valueOf(I0), Integer.valueOf(i10));
            this.f18873c.set(3, this.f18875e.a() + g10, PendingIntent.getBroadcast(this.f18871a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        f2.a.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    public void b(o oVar, int i10) {
        a(oVar, i10, false);
    }

    /* access modifiers changed from: package-private */
    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f18871a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    a(Context context, d dVar, AlarmManager alarmManager, l2.a aVar, g gVar) {
        this.f18871a = context;
        this.f18872b = dVar;
        this.f18873c = alarmManager;
        this.f18875e = aVar;
        this.f18874d = gVar;
    }
}
