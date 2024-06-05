package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient */
class f {

    /* renamed from: a  reason: collision with root package name */
    final Context f4718a;

    /* renamed from: b  reason: collision with root package name */
    final String f4719b;

    /* renamed from: c  reason: collision with root package name */
    int f4720c;

    /* renamed from: d  reason: collision with root package name */
    final e f4721d;

    /* renamed from: e  reason: collision with root package name */
    final e.c f4722e;

    /* renamed from: f  reason: collision with root package name */
    c f4723f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f4724g;

    /* renamed from: h  reason: collision with root package name */
    final b f4725h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f4726i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f4727j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f4728k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f4729l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f4730m;

    /* compiled from: MultiInstanceInvalidationClient */
    class a extends b.a {

        /* renamed from: androidx.room.f$a$a  reason: collision with other inner class name */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0079a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String[] f4732a;

            C0079a(String[] strArr) {
                this.f4732a = strArr;
            }

            public void run() {
                f.this.f4721d.e(this.f4732a);
            }
        }

        a() {
        }

        public void J(String[] strArr) {
            f.this.f4724g.execute(new C0079a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f4723f = c.a.M0(iBinder);
            f fVar = f.this;
            fVar.f4724g.execute(fVar.f4728k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f4724g.execute(fVar.f4729l);
            f.this.f4723f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                f fVar = f.this;
                c cVar = fVar.f4723f;
                if (cVar != null) {
                    fVar.f4720c = cVar.W(fVar.f4725h, fVar.f4719b);
                    f fVar2 = f.this;
                    fVar2.f4721d.a(fVar2.f4722e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class d implements Runnable {
        d() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f4721d.g(fVar.f4722e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class e implements Runnable {
        e() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f4721d.g(fVar.f4722e);
            try {
                f fVar2 = f.this;
                c cVar = fVar2.f4723f;
                if (cVar != null) {
                    cVar.u1(fVar2.f4725h, fVar2.f4720c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            f fVar3 = f.this;
            fVar3.f4718a.unbindService(fVar3.f4727j);
        }
    }

    /* renamed from: androidx.room.f$f  reason: collision with other inner class name */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0080f extends e.c {
        C0080f(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        public void b(Set<String> set) {
            if (!f.this.f4726i.get()) {
                try {
                    f fVar = f.this;
                    c cVar = fVar.f4723f;
                    if (cVar != null) {
                        cVar.l1(fVar.f4720c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e10);
                }
            }
        }
    }

    f(Context context, String str, e eVar, Executor executor) {
        b bVar = new b();
        this.f4727j = bVar;
        this.f4728k = new c();
        this.f4729l = new d();
        this.f4730m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f4718a = applicationContext;
        this.f4719b = str;
        this.f4721d = eVar;
        this.f4724g = executor;
        this.f4722e = new C0080f((String[]) eVar.f4695a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
