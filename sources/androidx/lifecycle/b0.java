package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: ReportFragment.kt */
public class b0 extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final b f3897b = new b((h) null);

    /* renamed from: a  reason: collision with root package name */
    private a f3898a;

    /* compiled from: ReportFragment.kt */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final void a(Activity activity, i.a aVar) {
            m.e(activity, "activity");
            m.e(aVar, "event");
            if (activity instanceof s) {
                ((s) activity).getLifecycle().i(aVar);
            } else if (activity instanceof p) {
                i lifecycle = ((p) activity).getLifecycle();
                if (lifecycle instanceof r) {
                    ((r) lifecycle).i(aVar);
                }
            }
        }

        public final b0 b(Activity activity) {
            m.e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            m.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (b0) findFragmentByTag;
        }

        public final void c(Activity activity) {
            m.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new b0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((h) null);

        /* compiled from: ReportFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(h hVar) {
                this();
            }

            public final void a(Activity activity) {
                m.e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            m.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            m.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
            b0.f3897b.a(activity, i.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            m.e(activity, "activity");
            b0.f3897b.a(activity, i.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            m.e(activity, "activity");
            b0.f3897b.a(activity, i.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            m.e(activity, "activity");
            b0.f3897b.a(activity, i.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            m.e(activity, "activity");
            b0.f3897b.a(activity, i.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            m.e(activity, "activity");
            b0.f3897b.a(activity, i.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            m.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
            m.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            m.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            m.e(activity, "activity");
        }
    }

    private final void a(i.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f3897b;
            Activity activity = getActivity();
            m.d(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static final void e(Activity activity) {
        f3897b.c(activity);
    }

    public final void f(a aVar) {
        this.f3898a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f3898a);
        a(i.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(i.a.ON_DESTROY);
        this.f3898a = null;
    }

    public void onPause() {
        super.onPause();
        a(i.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f3898a);
        a(i.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f3898a);
        a(i.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(i.a.ON_STOP);
    }
}
