package tc;

import bc.f;
import io.flutter.embedding.engine.g;
import io.flutter.plugins.firebase.messaging.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f38561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f38562b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f38563c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f38564d;

    public /* synthetic */ c(b bVar, f fVar, g gVar, long j10) {
        this.f38561a = bVar;
        this.f38562b = fVar;
        this.f38563c = gVar;
        this.f38564d = j10;
    }

    public final void run() {
        this.f38561a.j(this.f38562b, this.f38563c, this.f38564d);
    }
}
