package x1;

import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.HashMap;
import lc.c;
import lc.r;

/* compiled from: FacebookNativeAdPlugin */
class e extends g {

    /* renamed from: a  reason: collision with root package name */
    private final c f23583a;

    e(c cVar) {
        super(r.f36128a);
        this.f23583a = cVar;
    }

    public f create(Context context, int i10, Object obj) {
        return new f(context, i10, (HashMap) obj, this.f23583a);
    }
}
