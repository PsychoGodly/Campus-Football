package qa;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.Map;
import lc.c;
import lc.r;

/* compiled from: BannerAdFactory */
public class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final c f29760a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f29761b;

    public a(c cVar) {
        super(r.f36128a);
        this.f29760a = cVar;
    }

    public void a(Activity activity) {
        this.f29761b = activity;
    }

    public f create(Context context, int i10, Object obj) {
        return new c(this.f29761b, i10, (Map) obj, this.f29760a);
    }
}
