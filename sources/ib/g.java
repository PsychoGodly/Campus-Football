package ib;

import a5.c;
import android.app.Activity;
import android.content.Context;
import bb.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.i;

/* compiled from: ScarRewardedAd */
public class g extends a<c> implements a {
    public g(Context context, hb.a aVar, bb.c cVar, d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f33296e = new h(iVar, this);
    }

    public void a(Activity activity) {
        T t10 = this.f33292a;
        if (t10 != null) {
            ((c) t10).show(activity, ((h) this.f33296e).f());
        } else {
            this.f33297f.handleError(b.a(this.f33294c));
        }
    }

    /* access modifiers changed from: protected */
    public void c(n4.g gVar, bb.b bVar) {
        c.load(this.f33293b, this.f33294c.b(), gVar, ((h) this.f33296e).e());
    }
}
