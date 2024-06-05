package g5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f18130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f18131b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f18132c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f18133d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f18134f;

    public /* synthetic */ j(b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f18130a = bVar;
        this.f18131b = intent;
        this.f18132c = context;
        this.f18133d = z10;
        this.f18134f = pendingResult;
    }

    public final void run() {
        this.f18130a.d(this.f18131b, this.f18132c, this.f18133d, this.f18134f);
    }
}
