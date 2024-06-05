package qb;

import android.app.Activity;
import kotlin.jvm.internal.m;
import qb.a;

/* compiled from: Wakelock.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Activity f37481a;

    private final boolean a() {
        Activity activity = this.f37481a;
        m.b(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    public final a.C0425a b() {
        if (this.f37481a != null) {
            a.C0425a aVar = new a.C0425a();
            aVar.b(Boolean.valueOf(a()));
            return aVar;
        }
        throw new e();
    }

    public final void c(Activity activity) {
        this.f37481a = activity;
    }

    public final void d(a.b bVar) {
        m.e(bVar, "message");
        Activity activity = this.f37481a;
        if (activity != null) {
            m.b(activity);
            boolean a10 = a();
            Boolean b10 = bVar.b();
            m.b(b10);
            if (b10.booleanValue()) {
                if (!a10) {
                    activity.getWindow().addFlags(128);
                }
            } else if (a10) {
                activity.getWindow().clearFlags(128);
            }
        } else {
            throw new e();
        }
    }
}
