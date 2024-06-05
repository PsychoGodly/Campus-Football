package tc;

import android.os.Handler;
import bc.f;
import io.flutter.embedding.engine.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.firebase.messaging.b f38556a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f38557b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f38558c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f38559d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f38560f;

    public /* synthetic */ b(io.flutter.plugins.firebase.messaging.b bVar, f fVar, Handler handler, g gVar, long j10) {
        this.f38556a = bVar;
        this.f38557b = fVar;
        this.f38558c = handler;
        this.f38559d = gVar;
        this.f38560f = j10;
    }

    public final void run() {
        this.f38556a.k(this.f38557b, this.f38558c, this.f38559d, this.f38560f);
    }
}
