package bc;

import android.content.Context;
import android.os.Handler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f5552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5553b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String[] f5554c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Handler f5555d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f5556f;

    public /* synthetic */ d(f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f5552a = fVar;
        this.f5553b = context;
        this.f5554c = strArr;
        this.f5555d = handler;
        this.f5556f = runnable;
    }

    public final void run() {
        this.f5552a.p(this.f5553b, this.f5554c, this.f5555d, this.f5556f);
    }
}
