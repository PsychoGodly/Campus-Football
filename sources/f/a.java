package f;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m;

/* compiled from: ContextAwareHelper.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f17934a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f17935b;

    public final void a(b bVar) {
        m.e(bVar, "listener");
        Context context = this.f17935b;
        if (context != null) {
            bVar.a(context);
        }
        this.f17934a.add(bVar);
    }

    public final void b() {
        this.f17935b = null;
    }

    public final void c(Context context) {
        m.e(context, "context");
        this.f17935b = context;
        for (b a10 : this.f17934a) {
            a10.a(context);
        }
    }

    public final Context d() {
        return this.f17935b;
    }

    public final void e(b bVar) {
        m.e(bVar, "listener");
        this.f17934a.remove(bVar);
    }
}
