package of;

import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import lc.c;
import lc.r;

/* compiled from: BannerFactory */
public class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final c f36788a;

    a(c cVar) {
        super(r.f36128a);
        this.f36788a = cVar;
    }

    public f create(Context context, int i10, Object obj) {
        return new b(context, this.f36788a, i10);
    }
}
