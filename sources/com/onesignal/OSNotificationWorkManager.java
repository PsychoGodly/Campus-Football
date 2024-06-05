package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.g;
import androidx.work.r;
import com.onesignal.k3;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationWorkManager {

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f27505a = OSUtils.L();

    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        private void a(Context context, int i10, JSONObject jSONObject, boolean z10, Long l10) {
            w1 w1Var = new w1((List<w1>) null, jSONObject, i10);
            g2 g2Var = new g2(new y1(context, w1Var, jSONObject, z10, true, l10), w1Var);
            k3.a1 a1Var = k3.f27934q;
            if (a1Var != null) {
                try {
                    a1Var.a(context, g2Var);
                } catch (Throwable th) {
                    k3.b(k3.r0.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    g2Var.b(w1Var);
                    throw th;
                }
            } else {
                k3.a(k3.r0.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
                g2Var.b(w1Var);
            }
        }

        public ListenableWorker.a doWork() {
            e inputData = getInputData();
            try {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "NotificationWorker running doWork with data: " + inputData);
                int i10 = inputData.i("android_notif_id", 0);
                JSONObject jSONObject = new JSONObject(inputData.l("json_payload"));
                long k10 = inputData.k("timestamp", System.currentTimeMillis() / 1000);
                boolean h10 = inputData.h("is_restoring", false);
                a(getApplicationContext(), i10, jSONObject, h10, Long.valueOf(k10));
                return ListenableWorker.a.c();
            } catch (JSONException e10) {
                k3.r0 r0Var2 = k3.r0.ERROR;
                k3.A1(r0Var2, "Error occurred doing work for job with id: " + getId().toString());
                e10.printStackTrace();
                return ListenableWorker.a.a();
            }
        }
    }

    static boolean a(String str) {
        if (!OSUtils.I(str)) {
            return true;
        }
        if (f27505a.contains(str)) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
            return false;
        }
        f27505a.add(str);
        return true;
    }

    static void b(Context context, String str, int i10, String str2, long j10, boolean z10, boolean z11) {
        e a10 = new e.a().f("android_notif_id", i10).h("json_payload", str2).g("timestamp", j10).e("is_restoring", z10).a();
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        j3.a(context).e(str, g.KEEP, (r) ((r.a) new r.a(NotificationWorker.class).h(a10)).b());
    }

    static void c(String str) {
        if (OSUtils.I(str)) {
            f27505a.remove(str);
        }
    }
}
