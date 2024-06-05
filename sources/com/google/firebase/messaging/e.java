package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.l;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.m;

/* compiled from: DisplayNotification */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f26787a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f26788b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f26789c;

    public e(Context context, k0 k0Var, ExecutorService executorService) {
        this.f26787a = executorService;
        this.f26788b = context;
        this.f26789c = k0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f26788b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!m.f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f26788b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f26788b.getSystemService("notification")).notify(aVar.f26763b, aVar.f26764c, aVar.f26762a.c());
    }

    private g0 d() {
        g0 n10 = g0.n(this.f26789c.p("gcm.n.image"));
        if (n10 != null) {
            n10.A(this.f26787a);
        }
        return n10;
    }

    private void e(l.e eVar, g0 g0Var) {
        if (g0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(g0Var.q(), 5, TimeUnit.SECONDS);
                eVar.x(bitmap);
                eVar.I(new l.b().n(bitmap).m((Bitmap) null));
            } catch (ExecutionException e10) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                g0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                g0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.f26789c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        g0 d10 = d();
        c.a e10 = c.e(this.f26788b, this.f26789c);
        e(e10.f26762a, d10);
        c(e10);
        return true;
    }
}
