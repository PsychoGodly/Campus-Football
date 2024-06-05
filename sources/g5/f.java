package g5;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class f extends zzf {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f18127a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(d dVar, Looper looper) {
        super(looper);
        this.f18127a = dVar;
    }

    public final void handleMessage(Message message) {
        d.d(this.f18127a, message);
    }
}
