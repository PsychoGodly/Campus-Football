package e7;

import java.util.Map;
import o7.a;
import o7.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f32484a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f32485b;

    public /* synthetic */ u(Map.Entry entry, a aVar) {
        this.f32484a = entry;
        this.f32485b = aVar;
    }

    public final void run() {
        ((b) this.f32484a.getKey()).a(this.f32485b);
    }
}
