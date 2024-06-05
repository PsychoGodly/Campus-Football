package x1;

import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.HashMap;
import lc.c;
import lc.r;

/* compiled from: FacebookBannerAdPlugin */
public class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final c f23575a;

    b(c cVar) {
        super(r.f36128a);
        this.f23575a = cVar;
    }

    public f create(Context context, int i10, Object obj) {
        return new c(context, i10, (HashMap) obj, this.f23575a);
    }
}
