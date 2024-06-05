package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.a0;
import e1.a;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: ProcessLifecycleInitializer.kt */
public final class ProcessLifecycleInitializer implements a<p> {
    /* renamed from: a */
    public p create(Context context) {
        m.e(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        m.d(e10, "getInstance(context)");
        if (e10.g(ProcessLifecycleInitializer.class)) {
            l.a(context);
            a0.b bVar = a0.f3878j;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    public List<Class<? extends a<?>>> dependencies() {
        return q.d();
    }
}
