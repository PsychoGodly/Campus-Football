package y7;

import java.lang.Thread;
import y7.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f39399a;

    public /* synthetic */ j(g.c cVar) {
        this.f39399a = cVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f39399a.r(thread, th);
    }
}
