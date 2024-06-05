package h5;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class o extends zaq {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18862a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f18863b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f18863b = eVar;
        this.f18862a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i11 = this.f18863b.i(this.f18862a);
        if (this.f18863b.m(i11)) {
            this.f18863b.s(this.f18862a, i11);
        }
    }
}
