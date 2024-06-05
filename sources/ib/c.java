package ib;

import android.content.Context;
import android.widget.RelativeLayout;
import bb.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.g;
import hb.a;
import n4.h;
import n4.j;

/* compiled from: ScarBannerAd */
public class c extends a<j> {

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f33299g;

    /* renamed from: h  reason: collision with root package name */
    private int f33300h;

    /* renamed from: i  reason: collision with root package name */
    private int f33301i;

    /* renamed from: j  reason: collision with root package name */
    private j f33302j = new j(this.f33293b);

    public c(Context context, RelativeLayout relativeLayout, a aVar, bb.c cVar, int i10, int i11, d dVar, g gVar) {
        super(context, cVar, aVar, dVar);
        this.f33299g = relativeLayout;
        this.f33300h = i10;
        this.f33301i = i11;
        this.f33296e = new d(gVar, this);
    }

    /* access modifiers changed from: protected */
    public void c(n4.g gVar, b bVar) {
        j jVar;
        RelativeLayout relativeLayout = this.f33299g;
        if (relativeLayout != null && (jVar = this.f33302j) != null) {
            relativeLayout.addView(jVar);
            this.f33302j.setAdSize(new h(this.f33300h, this.f33301i));
            this.f33302j.setAdUnitId(this.f33294c.b());
            this.f33302j.setAdListener(((d) this.f33296e).d());
            this.f33302j.b(gVar);
        }
    }

    public void e() {
        j jVar;
        RelativeLayout relativeLayout = this.f33299g;
        if (relativeLayout != null && (jVar = this.f33302j) != null) {
            relativeLayout.removeView(jVar);
        }
    }
}
