package y4;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f24001a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f24002b;

    public /* synthetic */ u(a aVar, String str) {
        this.f24001a = aVar;
        this.f24002b = str;
    }

    public final Object call() {
        return this.f24001a.getClickSignals(this.f24002b);
    }
}
