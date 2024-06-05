package r5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.gms.measurement.internal.nb;
import com.google.android.gms.measurement.internal.w5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class h0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final w5 f29768a;

    public h0(w5 w5Var) {
        this.f29768a = w5Var;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f29768a.zzj().G().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f29768a.zzj().G().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f29768a.zzj().G().a("App receiver called with unknown action");
        } else {
            w5 w5Var = this.f29768a;
            if (zzpg.zza() && w5Var.u().y((String) null, e0.M0)) {
                w5Var.zzj().F().a("App receiver notified triggers are available");
                w5Var.zzl().y(new nb(w5Var));
            }
        }
    }
}
