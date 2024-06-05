package g5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
abstract class u<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f18151a;

    /* renamed from: b  reason: collision with root package name */
    final TaskCompletionSource<T> f18152b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    final int f18153c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f18154d;

    u(int i10, int i11, Bundle bundle) {
        this.f18151a = i10;
        this.f18153c = i11;
        this.f18154d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public final void c(v vVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(vVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f18152b.setException(vVar);
    }

    /* access modifiers changed from: package-private */
    public final void d(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f18152b.setResult(t10);
    }

    public final String toString() {
        int i10 = this.f18153c;
        int i11 = this.f18151a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
