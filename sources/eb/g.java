package eb;

import a5.c;
import android.app.Activity;
import android.content.Context;
import bb.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.i;

/* compiled from: ScarRewardedAd */
public class g extends a<c> implements a {
    public g(Context context, z4.a aVar, bb.c cVar, d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f32490e = new h(iVar, this);
    }

    public void a(Activity activity) {
        T t10 = this.f32486a;
        if (t10 != null) {
            ((c) t10).show(activity, ((h) this.f32490e).f());
        } else {
            this.f32491f.handleError(b.a(this.f32488c));
        }
    }

    /* access modifiers changed from: protected */
    public void c(n4.g gVar, bb.b bVar) {
        c.load(this.f32487b, this.f32488c.b(), gVar, ((h) this.f32490e).e());
    }
}
