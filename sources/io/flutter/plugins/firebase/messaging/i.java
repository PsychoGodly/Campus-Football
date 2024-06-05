package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: JobIntentService */
abstract class i extends Service {

    /* renamed from: i  reason: collision with root package name */
    static final Object f33895i = new Object();

    /* renamed from: j  reason: collision with root package name */
    static final HashMap<e, C0386i> f33896j = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    b f33897a;

    /* renamed from: b  reason: collision with root package name */
    C0386i f33898b;

    /* renamed from: c  reason: collision with root package name */
    a f33899c;

    /* renamed from: d  reason: collision with root package name */
    boolean f33900d = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f33901f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f33902g = false;

    /* renamed from: h  reason: collision with root package name */
    final ArrayList<d> f33903h = new ArrayList<>();

    /* compiled from: JobIntentService */
    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                f a10 = i.this.a();
                if (a10 == null) {
                    return null;
                }
                i.this.g(a10.getIntent());
                a10.complete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            i.this.i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            i.this.i();
        }
    }

    /* compiled from: JobIntentService */
    interface b {
        IBinder compatGetBinder();

        f dequeueWork();
    }

    /* compiled from: JobIntentService */
    static final class c extends C0386i {

        /* renamed from: d  reason: collision with root package name */
        private final Context f33905d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f33906e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f33907f;

        /* renamed from: g  reason: collision with root package name */
        boolean f33908g;

        /* renamed from: h  reason: collision with root package name */
        boolean f33909h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f33905d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f33906e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f33907f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f33922a);
            if (this.f33905d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f33908g) {
                        this.f33908g = true;
                        if (!this.f33909h) {
                            this.f33906e.acquire(60000);
                        }
                    }
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (this.f33909h) {
                    if (this.f33908g) {
                        this.f33906e.acquire(60000);
                    }
                    this.f33909h = false;
                    this.f33907f.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                if (!this.f33909h) {
                    this.f33909h = true;
                    this.f33907f.acquire(600000);
                    this.f33906e.release();
                }
            }
        }

        public void e() {
            synchronized (this) {
                this.f33908g = false;
            }
        }
    }

    /* compiled from: JobIntentService */
    final class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final Intent f33910a;

        /* renamed from: b  reason: collision with root package name */
        final int f33911b;

        d(Intent intent, int i10) {
            this.f33910a = intent;
            this.f33911b = i10;
        }

        public void complete() {
            i.this.stopSelf(this.f33911b);
        }

        public Intent getIntent() {
            return this.f33910a;
        }
    }

    /* compiled from: JobIntentService */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private ComponentName f33913a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f33914b;

        e(ComponentName componentName, boolean z10) {
            this.f33913a = componentName;
            this.f33914b = z10;
        }
    }

    /* compiled from: JobIntentService */
    interface f {
        void complete();

        Intent getIntent();
    }

    /* compiled from: JobIntentService */
    static final class g extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final i f33915a;

        /* renamed from: b  reason: collision with root package name */
        final Object f33916b = new Object();

        /* renamed from: c  reason: collision with root package name */
        JobParameters f33917c;

        /* compiled from: JobIntentService */
        final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f33918a;

            a(JobWorkItem jobWorkItem) {
                this.f33918a = jobWorkItem;
            }

            public void complete() {
                synchronized (g.this.f33916b) {
                    JobParameters jobParameters = g.this.f33917c;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.f33918a);
                        } catch (SecurityException e10) {
                            Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e10);
                        } catch (IllegalArgumentException e11) {
                            Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e11);
                        }
                    }
                }
            }

            public Intent getIntent() {
                return this.f33918a.getIntent();
            }
        }

        g(i iVar) {
            super(iVar);
            this.f33915a = iVar;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r5.f33915a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            return new io.flutter.plugins.firebase.messaging.i.g.a(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.flutter.plugins.firebase.messaging.i.f dequeueWork() {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f33916b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.f33917c     // Catch:{ all -> 0x002f }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                io.flutter.plugins.firebase.messaging.i r2 = r5.f33915a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                io.flutter.plugins.firebase.messaging.i$g$a r0 = new io.flutter.plugins.firebase.messaging.i$g$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                java.lang.String r3 = "JobServiceEngineImpl"
                java.lang.String r4 = "Failed to run mParams.dequeueWork()!"
                android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x002f }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x002f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.messaging.i.g.dequeueWork():io.flutter.plugins.firebase.messaging.i$f");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f33917c = jobParameters;
            this.f33915a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b10 = this.f33915a.b();
            synchronized (this.f33916b) {
                this.f33917c = null;
            }
            return b10;
        }
    }

    /* compiled from: JobIntentService */
    static final class h extends C0386i {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f33920d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f33921e;

        h(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f33920d = new JobInfo.Builder(i10, this.f33922a).setOverrideDeadline(0).build();
            this.f33921e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        public void a(Intent intent) {
            this.f33921e.enqueue(this.f33920d, new JobWorkItem(intent));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$i  reason: collision with other inner class name */
    /* compiled from: JobIntentService */
    static abstract class C0386i {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f33922a;

        /* renamed from: b  reason: collision with root package name */
        boolean f33923b;

        /* renamed from: c  reason: collision with root package name */
        int f33924c;

        C0386i(ComponentName componentName) {
            this.f33922a = componentName;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Intent intent);

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (!this.f33923b) {
                this.f33923b = true;
                this.f33924c = i10;
            } else if (this.f33924c != i10) {
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f33924c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i10, Intent intent, boolean z10) {
        if (intent != null) {
            synchronized (f33895i) {
                C0386i f10 = f(context, componentName, true, i10, z10);
                f10.b(i10);
                try {
                    f10.a(intent);
                } catch (IllegalStateException e10) {
                    if (z10) {
                        f(context, componentName, true, i10, false).a(intent);
                    } else {
                        throw e10;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(Context context, Class cls, int i10, Intent intent, boolean z10) {
        c(context, new ComponentName(context, cls), i10, intent, z10);
    }

    static C0386i f(Context context, ComponentName componentName, boolean z10, int i10, boolean z11) {
        C0386i iVar;
        e eVar = new e(componentName, z11);
        HashMap<e, C0386i> hashMap = f33896j;
        C0386i iVar2 = hashMap.get(eVar);
        if (iVar2 != null) {
            return iVar2;
        }
        if (Build.VERSION.SDK_INT < 26 || z11) {
            iVar = new c(context, componentName);
        } else if (z10) {
            iVar = new h(context, componentName, i10);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0386i iVar3 = iVar;
        hashMap.put(eVar, iVar3);
        return iVar3;
    }

    /* access modifiers changed from: package-private */
    public f a() {
        f dequeueWork;
        b bVar = this.f33897a;
        if (bVar != null && (dequeueWork = bVar.dequeueWork()) != null) {
            return dequeueWork;
        }
        synchronized (this.f33903h) {
            if (this.f33903h.size() <= 0) {
                return null;
            }
            f remove = this.f33903h.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        a aVar = this.f33899c;
        if (aVar != null) {
            aVar.cancel(this.f33900d);
        }
        this.f33901f = true;
        return h();
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z10) {
        if (this.f33899c == null) {
            this.f33899c = new a();
            C0386i iVar = this.f33898b;
            if (iVar != null && z10) {
                iVar.d();
            }
            this.f33899c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        ArrayList<d> arrayList = this.f33903h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33899c = null;
                ArrayList<d> arrayList2 = this.f33903h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f33902g) {
                    this.f33898b.c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.f33897a;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33897a = new g(this);
            this.f33898b = null;
        }
        this.f33898b = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f33903h) {
            this.f33902g = true;
            this.f33898b.c();
        }
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f33898b.e();
        synchronized (this.f33903h) {
            ArrayList<d> arrayList = this.f33903h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }
}
