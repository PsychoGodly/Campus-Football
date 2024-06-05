package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.profileinstaller.g;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.k1;
import java.util.concurrent.Executor;

/* compiled from: WithinAppServiceBinder */
class h1 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f26818a;

    /* compiled from: WithinAppServiceBinder */
    interface a {
        Task<Void> a(Intent intent);
    }

    h1(a aVar) {
        this.f26818a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void c(k1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f26818a.a(aVar.f26838a).addOnCompleteListener((Executor) g.f4296a, new g1(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
