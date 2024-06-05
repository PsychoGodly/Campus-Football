package androidx.work;

import android.content.Context;
import androidx.work.b;
import e1.a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements a<z> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5091a = p.f("WrkMgrInitializer");

    /* renamed from: a */
    public z create(Context context) {
        p.c().a(f5091a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        z.h(context, new b.C0091b().a());
        return z.g(context);
    }

    public List<Class<? extends a<?>>> dependencies() {
        return Collections.emptyList();
    }
}
