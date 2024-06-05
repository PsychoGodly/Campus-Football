package x9;

import android.view.View;
import ca.g;

public abstract class b {
    public static b a(c cVar, d dVar) {
        g.a();
        g.b(cVar, "AdSessionConfiguration is null");
        g.b(dVar, "AdSessionContext is null");
        return new o(cVar, dVar);
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
