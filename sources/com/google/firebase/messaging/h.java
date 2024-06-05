package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.profileinstaller.g;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.h1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: EnhancedIntentService */
public abstract class h extends Service {

    /* renamed from: a  reason: collision with root package name */
    final ExecutorService f26811a = n.d();

    /* renamed from: b  reason: collision with root package name */
    private Binder f26812b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f26813c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f26814d;

    /* renamed from: f  reason: collision with root package name */
    private int f26815f = 0;

    /* compiled from: EnhancedIntentService */
    class a implements h1.a {
        a() {
        }

        public Task<Void> a(Intent intent) {
            return h.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            f1.c(intent);
        }
        synchronized (this.f26813c) {
            int i10 = this.f26815f - 1;
            this.f26815f = i10;
            if (i10 == 0) {
                k(this.f26814d);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: private */
    public Task<Void> j(Intent intent) {
        if (g(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f26811a.execute(new g(this, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: protected */
    public Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i10) {
        return stopSelfResult(i10);
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f26812b == null) {
            this.f26812b = new h1(new a());
        }
        return this.f26812b;
    }

    public void onDestroy() {
        this.f26811a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f26813c) {
            this.f26814d = i11;
            this.f26815f++;
        }
        Intent e10 = e(intent);
        if (e10 == null) {
            d(intent);
            return 2;
        }
        Task<Void> j10 = j(e10);
        if (j10.isComplete()) {
            d(intent);
            return 2;
        }
        j10.addOnCompleteListener((Executor) g.f4296a, (OnCompleteListener<Void>) new f(this, intent));
        return 3;
    }
}
