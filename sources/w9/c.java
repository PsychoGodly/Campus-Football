package w9;

import android.content.Context;
import ca.a;
import ca.e;
import ca.g;
import z9.b;
import z9.f;
import z9.h;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f30855a;

    private void d(Context context) {
        g.b(context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return "1.4.9-Unity3d";
    }

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        d(context);
        if (!e()) {
            c(true);
            h.d().b(context);
            b.k().a(context);
            a.b(context);
            ca.c.d(context);
            e.c(context);
            f.c().b(context);
            z9.a.a().b(context);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f30855a = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f30855a;
    }
}
