package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.p;
import androidx.work.r;
import androidx.work.z;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5249a = p.f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            p.c().a(f5249a, "Requesting diagnostics", new Throwable[0]);
            try {
                z.g(context).c(r.e(DiagnosticsWorker.class));
            } catch (IllegalStateException e10) {
                p.c().b(f5249a, "WorkManager is not initialized", e10);
            }
        }
    }
}
