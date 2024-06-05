package r5;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.w5;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final a f29769a;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    public interface a {
        void a(Context context, Intent intent);
    }

    public n(a aVar) {
        q.k(aVar);
        this.f29769a = aVar;
    }

    public final void a(Context context, Intent intent) {
        n4 zzj = w5.a(context, (zzdd) null, (Long) null).zzj();
        if (intent == null) {
            zzj.G().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzj.F().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzj.F().a("Starting wakeful intent.");
            this.f29769a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzj.G().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
