package ib;

import android.app.Activity;
import android.content.Context;
import bb.c;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;
import n4.g;
import u4.a;

/* compiled from: ScarInterstitialAd */
public class e extends a<a> implements bb.a {
    public e(Context context, hb.a aVar, c cVar, d dVar, h hVar) {
        super(context, cVar, aVar, dVar);
        this.f33296e = new f(hVar, this);
    }

    public void a(Activity activity) {
        T t10 = this.f33292a;
        if (t10 != null) {
            ((a) t10).show(activity);
        } else {
            this.f33297f.handleError(b.a(this.f33294c));
        }
    }

    /* access modifiers changed from: protected */
    public void c(g gVar, bb.b bVar) {
        a.load(this.f33293b, this.f33294c.b(), gVar, ((f) this.f33296e).e());
    }
}