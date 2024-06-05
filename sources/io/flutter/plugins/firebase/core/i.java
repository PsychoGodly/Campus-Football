package io.flutter.plugins.firebase.core;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dc.a;
import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y6.f;
import y6.n;

/* compiled from: FlutterFirebaseCorePlugin */
public class i implements a, p.b, p.a {

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, String> f33799c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private Context f33800a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33801b = false;

    private Task<p.f> o(f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, fVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private p.e p(n nVar) {
        p.e.a aVar = new p.e.a();
        aVar.b(nVar.b());
        aVar.c(nVar.c());
        if (nVar.f() != null) {
            aVar.e(nVar.f());
        }
        if (nVar.g() != null) {
            aVar.f(nVar.g());
        }
        aVar.d(nVar.d());
        aVar.g(nVar.h());
        aVar.h(nVar.e());
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                f.p(str).j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            p.f.a aVar = new p.f.a();
            aVar.c(fVar.q());
            aVar.d(p(fVar.r()));
            aVar.b(Boolean.valueOf(fVar.x()));
            aVar.e((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(fVar)));
            taskCompletionSource.setResult(aVar.a());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004a A[Catch:{ Exception -> 0x0067 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void s(io.flutter.plugins.firebase.core.p.e r3, java.lang.String r4, com.google.android.gms.tasks.TaskCompletionSource r5) {
        /*
            r2 = this;
            y6.n$b r0 = new y6.n$b     // Catch:{ Exception -> 0x0067 }
            r0.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.b()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.b(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.c()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.c(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.e()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.d(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.f()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.f(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.g()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.g(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.h()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.h(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.i()     // Catch:{ Exception -> 0x0067 }
            y6.n$b r0 = r0.e(r1)     // Catch:{ Exception -> 0x0067 }
            y6.n r0 = r0.a()     // Catch:{ Exception -> 0x0067 }
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            java.lang.String r1 = r3.d()     // Catch:{ Exception -> 0x0067 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.String> r1 = f33799c     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.d()     // Catch:{ Exception -> 0x0067 }
            r1.put(r4, r3)     // Catch:{ Exception -> 0x0067 }
        L_0x0053:
            android.content.Context r3 = r2.f33800a     // Catch:{ Exception -> 0x0067 }
            y6.f r3 = y6.f.w(r3, r0, r4)     // Catch:{ Exception -> 0x0067 }
            com.google.android.gms.tasks.Task r3 = r2.o(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)     // Catch:{ Exception -> 0x0067 }
            io.flutter.plugins.firebase.core.p$f r3 = (io.flutter.plugins.firebase.core.p.f) r3     // Catch:{ Exception -> 0x0067 }
            r5.setResult(r3)     // Catch:{ Exception -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r3 = move-exception
            r5.setException(r3)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.core.i.s(io.flutter.plugins.firebase.core.p$e, java.lang.String, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(TaskCompletionSource taskCompletionSource) {
        try {
            if (!this.f33801b) {
                this.f33801b = true;
            } else {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List<f> n10 = f.n(this.f33800a);
            ArrayList arrayList = new ArrayList(n10.size());
            for (f o10 : n10) {
                arrayList.add((p.f) Tasks.await(o(o10)));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void u(p.g gVar, Task task) {
        if (task.isSuccessful()) {
            gVar.success(task.getResult());
        } else {
            gVar.a(task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(TaskCompletionSource taskCompletionSource) {
        try {
            n a10 = n.a(this.f33800a);
            if (a10 == null) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setResult(p(a10));
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            f.p(str).F(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void x(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            f.p(str).E(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private <T> void y(TaskCompletionSource<T> taskCompletionSource, p.g<T> gVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new a(gVar));
    }

    public void a(String str, p.e eVar, p.g<p.f> gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, eVar, str, taskCompletionSource));
        y(taskCompletionSource, gVar);
    }

    public void b(p.g<List<p.f>> gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, taskCompletionSource));
        y(taskCompletionSource, gVar);
    }

    public void c(p.g<p.e> gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, taskCompletionSource));
        y(taskCompletionSource, gVar);
    }

    public void d(String str, Boolean bool, p.g<Void> gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(str, bool, taskCompletionSource));
        y(taskCompletionSource, gVar);
    }

    public void e(String str, p.g<Void> gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(str, taskCompletionSource));
        y(taskCompletionSource, gVar);
    }

    public void f(String str, Boolean bool, p.g<Void> gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(str, bool, taskCompletionSource));
        y(taskCompletionSource, gVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        t.h(bVar.b(), this);
        o.h(bVar.b(), this);
        this.f33800a = bVar.a();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f33800a = null;
        t.h(bVar.b(), (p.b) null);
        o.h(bVar.b(), (p.a) null);
    }
}
