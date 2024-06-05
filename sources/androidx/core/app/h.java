package androidx.core.app;

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
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* compiled from: JobIntentService */
public abstract class h extends Service {

    /* renamed from: i  reason: collision with root package name */
    static final Object f2702i = new Object();

    /* renamed from: j  reason: collision with root package name */
    static final HashMap<ComponentName, C0029h> f2703j = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    b f2704a;

    /* renamed from: b  reason: collision with root package name */
    C0029h f2705b;

    /* renamed from: c  reason: collision with root package name */
    a f2706c;

    /* renamed from: d  reason: collision with root package name */
    boolean f2707d = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f2708f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f2709g = false;

    /* renamed from: h  reason: collision with root package name */
    final ArrayList<d> f2710h;

    /* compiled from: JobIntentService */
    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a10 = h.this.a();
                if (a10 == null) {
                    return null;
                }
                h.this.e(a10.getIntent());
                a10.complete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            h.this.g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            h.this.g();
        }
    }

    /* compiled from: JobIntentService */
    interface b {
        IBinder compatGetBinder();

        e dequeueWork();
    }

    /* compiled from: JobIntentService */
    static final class c extends C0029h {

        /* renamed from: d  reason: collision with root package name */
        private final Context f2712d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f2713e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f2714f;

        /* renamed from: g  reason: collision with root package name */
        boolean f2715g;

        /* renamed from: h  reason: collision with root package name */
        boolean f2716h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2712d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2713e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2714f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void b() {
            synchronized (this) {
                if (this.f2716h) {
                    if (this.f2715g) {
                        this.f2713e.acquire(60000);
                    }
                    this.f2716h = false;
                    this.f2714f.release();
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (!this.f2716h) {
                    this.f2716h = true;
                    this.f2714f.acquire(600000);
                    this.f2713e.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                this.f2715g = false;
            }
        }
    }

    /* compiled from: JobIntentService */
    final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final Intent f2717a;

        /* renamed from: b  reason: collision with root package name */
        final int f2718b;

        d(Intent intent, int i10) {
            this.f2717a = intent;
            this.f2718b = i10;
        }

        public void complete() {
            h.this.stopSelf(this.f2718b);
        }

        public Intent getIntent() {
            return this.f2717a;
        }
    }

    /* compiled from: JobIntentService */
    interface e {
        void complete();

        Intent getIntent();
    }

    /* compiled from: JobIntentService */
    static final class f extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final h f2720a;

        /* renamed from: b  reason: collision with root package name */
        final Object f2721b = new Object();

        /* renamed from: c  reason: collision with root package name */
        JobParameters f2722c;

        /* compiled from: JobIntentService */
        final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f2723a;

            a(JobWorkItem jobWorkItem) {
                this.f2723a = jobWorkItem;
            }

            public void complete() {
                synchronized (f.this.f2721b) {
                    JobParameters jobParameters = f.this.f2722c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2723a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f2723a.getIntent();
            }
        }

        f(h hVar) {
            super(hVar);
            this.f2720a = hVar;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2720a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.h.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.h.e dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2721b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2722c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.h r2 = r3.f2720a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.h$f$a r0 = new androidx.core.app.h$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h.f.dequeueWork():androidx.core.app.h$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2722c = jobParameters;
            this.f2720a.c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b10 = this.f2720a.b();
            synchronized (this.f2721b) {
                this.f2722c = null;
            }
            return b10;
        }
    }

    /* compiled from: JobIntentService */
    static final class g extends C0029h {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f2725d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f2726e;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            a(i10);
            this.f2725d = new JobInfo.Builder(i10, this.f2727a).setOverrideDeadline(0).build();
            this.f2726e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.h$h  reason: collision with other inner class name */
    /* compiled from: JobIntentService */
    static abstract class C0029h {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f2727a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2728b;

        /* renamed from: c  reason: collision with root package name */
        int f2729c;

        C0029h(ComponentName componentName) {
            this.f2727a = componentName;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (!this.f2728b) {
                this.f2728b = true;
                this.f2729c = i10;
            } else if (this.f2729c != i10) {
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f2729c);
            }
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2710h = null;
        } else {
            this.f2710h = new ArrayList<>();
        }
    }

    static C0029h d(Context context, ComponentName componentName, boolean z10, int i10) {
        C0029h hVar;
        HashMap<ComponentName, C0029h> hashMap = f2703j;
        C0029h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z10) {
            hVar = new g(context, componentName, i10);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0029h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    public e a() {
        b bVar = this.f2704a;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.f2710h) {
            if (this.f2710h.size() <= 0) {
                return null;
            }
            e remove = this.f2710h.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        a aVar = this.f2706c;
        if (aVar != null) {
            aVar.cancel(this.f2707d);
        }
        this.f2708f = true;
        return f();
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        if (this.f2706c == null) {
            this.f2706c = new a();
            C0029h hVar = this.f2705b;
            if (hVar != null && z10) {
                hVar.c();
            }
            this.f2706c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void e(Intent intent);

    public boolean f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        ArrayList<d> arrayList = this.f2710h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2706c = null;
                ArrayList<d> arrayList2 = this.f2710h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    c(false);
                } else if (!this.f2709g) {
                    this.f2705b.b();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.f2704a;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2704a = new f(this);
            this.f2705b = null;
            return;
        }
        this.f2704a = null;
        this.f2705b = d(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f2710h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2709g = true;
                this.f2705b.b();
            }
        }
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f2710h == null) {
            return 2;
        }
        this.f2705b.d();
        synchronized (this.f2710h) {
            ArrayList<d> arrayList = this.f2710h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            c(true);
        }
        return 3;
    }
}
