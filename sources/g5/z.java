package g5;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class z implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f18164b;

    public /* synthetic */ z(d dVar, Bundle bundle) {
        this.f18163a = dVar;
        this.f18164b = bundle;
    }

    public final Object then(Task task) {
        return this.f18163a.c(this.f18164b, task);
    }
}
