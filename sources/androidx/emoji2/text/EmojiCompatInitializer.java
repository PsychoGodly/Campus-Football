package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.core.os.o;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.d;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements e1.a<Boolean> {

    static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3324a;

        class a extends e.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e.h f3325a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f3326b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3325a = hVar;
                this.f3326b = threadPoolExecutor;
            }

            public void a(Throwable th) {
                try {
                    this.f3325a.a(th);
                } finally {
                    this.f3326b.shutdown();
                }
            }

            public void b(m mVar) {
                try {
                    this.f3325a.b(mVar);
                } finally {
                    this.f3326b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f3324a = context.getApplicationContext();
        }

        public void a(e.h hVar) {
            ThreadPoolExecutor b10 = b.b("EmojiCompatInitializer");
            b10.execute(new f(this, hVar, b10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j a10 = c.a(this.f3324a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                o.b();
            }
        }
    }

    /* renamed from: a */
    public Boolean create(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return Boolean.FALSE;
        }
        e.g(new a(context));
        b(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        final i lifecycle = ((p) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new d() {
            public void a(p pVar) {
                EmojiCompatInitializer.this.c();
                lifecycle.d(this);
            }

            public /* synthetic */ void b(p pVar) {
                androidx.lifecycle.c.a(this, pVar);
            }

            public /* synthetic */ void c(p pVar) {
                androidx.lifecycle.c.c(this, pVar);
            }

            public /* synthetic */ void d(p pVar) {
                androidx.lifecycle.c.e(this, pVar);
            }

            public /* synthetic */ void e(p pVar) {
                androidx.lifecycle.c.b(this, pVar);
            }

            public /* synthetic */ void f(p pVar) {
                androidx.lifecycle.c.d(this, pVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void c() {
        b.d().postDelayed(new c(), 500);
    }

    public List<Class<? extends e1.a<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
