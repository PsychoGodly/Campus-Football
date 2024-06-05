package bc;

import android.content.Context;
import android.os.Handler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f5547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5548b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String[] f5549c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Handler f5550d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f5551f;

    public /* synthetic */ c(f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f5547a = fVar;
        this.f5548b = context;
        this.f5549c = strArr;
        this.f5550d = handler;
        this.f5551f = runnable;
    }

    public final void run() {
        this.f5547a.q(this.f5548b, this.f5549c, this.f5550d, this.f5551f);
    }
}
