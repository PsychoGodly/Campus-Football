package r7;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.e;
import com.google.firebase.firestore.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: ActivityScope */
public class d {

    /* compiled from: ActivityScope */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<Runnable> f29873a;

        private b() {
            this.f29873a = new ArrayList();
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(Runnable runnable) {
            this.f29873a.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            for (Runnable next : this.f29873a) {
                if (next != null) {
                    next.run();
                }
            }
        }
    }

    /* compiled from: ActivityScope */
    public static class c extends Fragment {

        /* renamed from: a  reason: collision with root package name */
        b f29874a = new b();

        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.f29874a) {
                bVar = this.f29874a;
                this.f29874a = new b();
            }
            bVar.b();
        }
    }

    /* renamed from: r7.d$d  reason: collision with other inner class name */
    /* compiled from: ActivityScope */
    public static class C0332d extends androidx.fragment.app.Fragment {

        /* renamed from: c0  reason: collision with root package name */
        b f29875c0 = new b();

        public void K0() {
            b bVar;
            super.K0();
            synchronized (this.f29875c0) {
                bVar = this.f29875c0;
                this.f29875c0 = new b();
            }
            bVar.b();
        }
    }

    public static f0 c(Activity activity, f0 f0Var) {
        if (activity != null) {
            if (activity instanceof e) {
                Objects.requireNonNull(f0Var);
                h((e) activity, new c(f0Var));
            } else {
                Objects.requireNonNull(f0Var);
                g(activity, new c(f0Var));
            }
        }
        return f0Var;
    }

    private static <T> T d(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Activity activity, Runnable runnable) {
        c cVar = (c) d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f29874a.a(runnable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(e eVar, Runnable runnable) {
        C0332d dVar = (C0332d) d(C0332d.class, eVar.getSupportFragmentManager().i0("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (dVar == null || dVar.b0()) {
            dVar = new C0332d();
            eVar.getSupportFragmentManager().l().d(dVar, "FirestoreOnStopObserverSupportFragment").g();
            eVar.getSupportFragmentManager().e0();
        }
        dVar.f29875c0.a(runnable);
    }

    private static void g(Activity activity, Runnable runnable) {
        y7.b.d(!(activity instanceof e), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new a(activity, runnable));
    }

    private static void h(e eVar, Runnable runnable) {
        eVar.runOnUiThread(new b(eVar, runnable));
    }
}
