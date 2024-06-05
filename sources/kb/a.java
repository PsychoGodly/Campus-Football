package kb;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
import mb.e;
import mb.g;

/* compiled from: ScarAdapter */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    private lb.a f35786e;

    /* renamed from: kb.a$a  reason: collision with other inner class name */
    /* compiled from: ScarAdapter */
    class C0404a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f35787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb.c f35788b;

        /* renamed from: kb.a$a$a  reason: collision with other inner class name */
        /* compiled from: ScarAdapter */
        class C0405a implements bb.b {
            C0405a() {
            }

            public void onAdLoaded() {
                a.this.f32044b.put(C0404a.this.f35788b.c(), C0404a.this.f35787a);
            }
        }

        C0404a(e eVar, bb.c cVar) {
            this.f35787a = eVar;
            this.f35788b = cVar;
        }

        public void run() {
            this.f35787a.b(new C0405a());
        }
    }

    /* compiled from: ScarAdapter */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f35791a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb.c f35792b;

        /* renamed from: kb.a$b$a  reason: collision with other inner class name */
        /* compiled from: ScarAdapter */
        class C0406a implements bb.b {
            C0406a() {
            }

            public void onAdLoaded() {
                a.this.f32044b.put(b.this.f35792b.c(), b.this.f35791a);
            }
        }

        b(g gVar, bb.c cVar) {
            this.f35791a = gVar;
            this.f35792b = cVar;
        }

        public void run() {
            this.f35791a.b(new C0406a());
        }
    }

    /* compiled from: ScarAdapter */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ mb.c f35795a;

        c(mb.c cVar) {
            this.f35795a = cVar;
        }

        public void run() {
            this.f35795a.b((bb.b) null);
        }
    }

    public a(d<m> dVar, String str) {
        super(dVar);
        lb.a aVar = new lb.a(new ab.a(str));
        this.f35786e = aVar;
        this.f32043a = new nb.b(aVar);
    }

    public void d(Context context, bb.c cVar, i iVar) {
        l.a(new b(new g(context, this.f35786e, cVar, this.f32046d, iVar), cVar));
    }

    public void e(Context context, RelativeLayout relativeLayout, bb.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new mb.c(context, relativeLayout, this.f35786e, cVar, i10, i11, this.f32046d, gVar)));
    }

    public void f(Context context, bb.c cVar, h hVar) {
        l.a(new C0404a(new e(context, this.f35786e, cVar, this.f32046d, hVar), cVar));
    }
}
