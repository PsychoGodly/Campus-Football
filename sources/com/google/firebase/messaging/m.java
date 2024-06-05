package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: FcmBroadcastProcessor */
public class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f26843c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static k1 f26844d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f26845a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f26846b = g.f4296a;

    public m(Context context) {
        this.f26845a = context;
    }

    private static Task<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        k1 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.c(intent).continueWith(g.f4296a, j.f26823a);
        }
        if (u0.b().e(context)) {
            f1.f(context, f10, intent);
        } else {
            f10.c(intent);
        }
        return Tasks.forResult(-1);
    }

    private static k1 f(Context context, String str) {
        k1 k1Var;
        synchronized (f26843c) {
            if (f26844d == null) {
                f26844d = new k1(context, str);
            }
            k1Var = f26844d;
        }
        return k1Var;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) throws Exception {
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer i(Task task) throws Exception {
        return 403;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z10, Task task) throws Exception {
        return (!m5.m.i() || ((Integer) task.getResult()).intValue() != 402) ? task : e(context, intent, z10).continueWith(g.f4296a, k.f26830a);
    }

    public Task<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f26845a, intent);
    }

    public Task<Integer> l(Context context, Intent intent) {
        boolean z10 = true;
        boolean z11 = m5.m.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z10 = false;
        }
        if (!z11 || z10) {
            return Tasks.call(this.f26846b, new l(context, intent)).continueWithTask(this.f26846b, new i(context, intent, z10));
        }
        return e(context, intent, z10);
    }
}
