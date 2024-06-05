package qe;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;

/* compiled from: HandlerDispatcher.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f37731a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        e eVar = null;
        try {
            o.a aVar = o.f38128b;
            obj = o.b(new d(a(Looper.getMainLooper(), true), (String) null, 2, (h) null));
        } catch (Throwable th) {
            o.a aVar2 = o.f38128b;
            obj = o.b(p.a(th));
        }
        if (!o.f(obj)) {
            eVar = obj;
        }
        f37731a = eVar;
    }

    public static final Handler a(Looper looper, boolean z10) {
        int i10;
        if (!z10 || (i10 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i10 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            m.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
