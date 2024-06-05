package mb;

import a5.c;
import android.app.Activity;
import android.content.Context;
import bb.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.i;

/* compiled from: ScarRewardedAd */
public class g extends a<c> implements a {
    public g(Context context, lb.a aVar, bb.c cVar, d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f36309e = new h(iVar, this);
    }

    public void a(Activity activity) {
        T t10 = this.f36305a;
        if (t10 != null) {
            ((c) t10).show(activity, ((h) this.f36309e).f());
        } else {
            this.f36310f.handleError(b.a(this.f36307c));
        }
    }

    /* access modifiers changed from: protected */
    public void c(n4.g gVar, bb.b bVar) {
        c.load(this.f36306b, this.f36307c.b(), gVar, ((h) this.f36309e).e());
    }
}
