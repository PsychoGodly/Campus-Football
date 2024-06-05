package rc;

import java.util.Map;
import lc.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.b f37935a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f37936b;

    public /* synthetic */ n(d.b bVar, Map map) {
        this.f37935a = bVar;
        this.f37936b = map;
    }

    public final void run() {
        this.f37935a.success(this.f37936b);
    }
}
