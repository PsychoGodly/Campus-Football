package t4;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f22707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f22708b;

    public /* synthetic */ o(q qVar, Drawable drawable) {
        this.f22707a = qVar;
        this.f22708b = drawable;
    }

    public final void run() {
        q qVar = this.f22707a;
        qVar.f22709a.f22711a.getWindow().setBackgroundDrawable(this.f22708b);
    }
}
