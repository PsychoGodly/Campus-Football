package k4;

import java.util.concurrent.CopyOnWriteArraySet;
import k4.q;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f35781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35782b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q.a f35783c;

    public /* synthetic */ p(CopyOnWriteArraySet copyOnWriteArraySet, int i10, q.a aVar) {
        this.f35781a = copyOnWriteArraySet;
        this.f35782b = i10;
        this.f35783c = aVar;
    }

    public final void run() {
        q.h(this.f35781a, this.f35782b, this.f35783c);
    }
}
