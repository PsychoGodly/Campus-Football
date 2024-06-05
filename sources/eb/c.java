package eb;

import android.content.Context;
import android.widget.RelativeLayout;
import bb.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.g;
import n4.h;
import n4.j;
import z4.a;

/* compiled from: ScarBannerAd */
public class c extends a<j> {

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f32493g;

    /* renamed from: h  reason: collision with root package name */
    private int f32494h;

    /* renamed from: i  reason: collision with root package name */
    private int f32495i;

    /* renamed from: j  reason: collision with root package name */
    private j f32496j = new j(this.f32487b);

    public c(Context context, a aVar, RelativeLayout relativeLayout, bb.c cVar, int i10, int i11, d dVar, g gVar) {
        super(context, cVar, aVar, dVar);
        this.f32493g = relativeLayout;
        this.f32494h = i10;
        this.f32495i = i11;
        this.f32490e = new d(gVar, this);
    }

    /* access modifiers changed from: protected */
    public void c(n4.g gVar, b bVar) {
        j jVar;
        RelativeLayout relativeLayout = this.f32493g;
        if (relativeLayout != null && (jVar = this.f32496j) != null) {
            relativeLayout.addView(jVar);
            this.f32496j.setAdSize(new h(this.f32494h, this.f32495i));
            this.f32496j.setAdUnitId(this.f32488c.b());
            this.f32496j.setAdListener(((d) this.f32490e).d());
            this.f32496j.b(gVar);
        }
    }

    public void e() {
        j jVar;
        RelativeLayout relativeLayout = this.f32493g;
        if (relativeLayout != null && (jVar = this.f32496j) != null) {
            relativeLayout.removeView(jVar);
        }
    }
}
