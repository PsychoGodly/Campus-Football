package mb;

import android.content.Context;
import android.widget.RelativeLayout;
import bb.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.g;
import lb.a;
import n4.h;
import n4.j;

/* compiled from: ScarBannerAd */
public class c extends a<j> {

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f36312g;

    /* renamed from: h  reason: collision with root package name */
    private int f36313h;

    /* renamed from: i  reason: collision with root package name */
    private int f36314i;

    /* renamed from: j  reason: collision with root package name */
    private j f36315j = new j(this.f36306b);

    public c(Context context, RelativeLayout relativeLayout, a aVar, bb.c cVar, int i10, int i11, d dVar, g gVar) {
        super(context, cVar, aVar, dVar);
        this.f36312g = relativeLayout;
        this.f36313h = i10;
        this.f36314i = i11;
        this.f36309e = new d(gVar, this);
    }

    /* access modifiers changed from: protected */
    public void c(n4.g gVar, b bVar) {
        j jVar;
        RelativeLayout relativeLayout = this.f36312g;
        if (relativeLayout != null && (jVar = this.f36315j) != null) {
            relativeLayout.addView(jVar);
            this.f36315j.setAdSize(new h(this.f36313h, this.f36314i));
            this.f36315j.setAdUnitId(this.f36307c.b());
            this.f36315j.setAdListener(((d) this.f36309e).d());
            this.f36315j.b(gVar);
        }
    }

    public void e() {
        j jVar;
        RelativeLayout relativeLayout = this.f36312g;
        if (relativeLayout != null && (jVar = this.f36315j) != null) {
            relativeLayout.removeView(jVar);
        }
    }
}
