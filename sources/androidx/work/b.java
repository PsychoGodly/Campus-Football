package androidx.work;

import android.os.Build;
import com.google.android.gms.common.api.a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Executor f5118a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f5119b;

    /* renamed from: c  reason: collision with root package name */
    final b0 f5120c;

    /* renamed from: d  reason: collision with root package name */
    final l f5121d;

    /* renamed from: e  reason: collision with root package name */
    final w f5122e;

    /* renamed from: f  reason: collision with root package name */
    final j f5123f;

    /* renamed from: g  reason: collision with root package name */
    final String f5124g;

    /* renamed from: h  reason: collision with root package name */
    final int f5125h;

    /* renamed from: i  reason: collision with root package name */
    final int f5126i;

    /* renamed from: j  reason: collision with root package name */
    final int f5127j;

    /* renamed from: k  reason: collision with root package name */
    final int f5128k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f5129l;

    /* compiled from: Configuration */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5130a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f5131b;

        a(boolean z10) {
            this.f5131b = z10;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f5131b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f5130a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* compiled from: Configuration */
    public static final class C0091b {

        /* renamed from: a  reason: collision with root package name */
        Executor f5133a;

        /* renamed from: b  reason: collision with root package name */
        b0 f5134b;

        /* renamed from: c  reason: collision with root package name */
        l f5135c;

        /* renamed from: d  reason: collision with root package name */
        Executor f5136d;

        /* renamed from: e  reason: collision with root package name */
        w f5137e;

        /* renamed from: f  reason: collision with root package name */
        j f5138f;

        /* renamed from: g  reason: collision with root package name */
        String f5139g;

        /* renamed from: h  reason: collision with root package name */
        int f5140h = 4;

        /* renamed from: i  reason: collision with root package name */
        int f5141i = 0;

        /* renamed from: j  reason: collision with root package name */
        int f5142j = a.e.API_PRIORITY_OTHER;

        /* renamed from: k  reason: collision with root package name */
        int f5143k = 20;

        public b a() {
            return new b(this);
        }

        public C0091b b(Executor executor) {
            this.f5133a = executor;
            return this;
        }
    }

    /* compiled from: Configuration */
    public interface c {
        b a();
    }

    b(C0091b bVar) {
        Executor executor = bVar.f5133a;
        if (executor == null) {
            this.f5118a = a(false);
        } else {
            this.f5118a = executor;
        }
        Executor executor2 = bVar.f5136d;
        if (executor2 == null) {
            this.f5129l = true;
            this.f5119b = a(true);
        } else {
            this.f5129l = false;
            this.f5119b = executor2;
        }
        b0 b0Var = bVar.f5134b;
        if (b0Var == null) {
            this.f5120c = b0.c();
        } else {
            this.f5120c = b0Var;
        }
        l lVar = bVar.f5135c;
        if (lVar == null) {
            this.f5121d = l.c();
        } else {
            this.f5121d = lVar;
        }
        w wVar = bVar.f5137e;
        if (wVar == null) {
            this.f5122e = new k1.a();
        } else {
            this.f5122e = wVar;
        }
        this.f5125h = bVar.f5140h;
        this.f5126i = bVar.f5141i;
        this.f5127j = bVar.f5142j;
        this.f5128k = bVar.f5143k;
        this.f5123f = bVar.f5138f;
        this.f5124g = bVar.f5139g;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(z10);
    }

    public String c() {
        return this.f5124g;
    }

    public j d() {
        return this.f5123f;
    }

    public Executor e() {
        return this.f5118a;
    }

    public l f() {
        return this.f5121d;
    }

    public int g() {
        return this.f5127j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f5128k / 2;
        }
        return this.f5128k;
    }

    public int i() {
        return this.f5126i;
    }

    public int j() {
        return this.f5125h;
    }

    public w k() {
        return this.f5122e;
    }

    public Executor l() {
        return this.f5119b;
    }

    public b0 m() {
        return this.f5120c;
    }
}
