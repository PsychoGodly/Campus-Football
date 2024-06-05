package gb;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
import ib.e;
import ib.g;

/* compiled from: ScarAdapter */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    private hb.a f32804e;

    /* renamed from: gb.a$a  reason: collision with other inner class name */
    /* compiled from: ScarAdapter */
    class C0370a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32805a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb.c f32806b;

        /* renamed from: gb.a$a$a  reason: collision with other inner class name */
        /* compiled from: ScarAdapter */
        class C0371a implements bb.b {
            C0371a() {
            }

            public void onAdLoaded() {
                a.this.f32044b.put(C0370a.this.f32806b.c(), C0370a.this.f32805a);
            }
        }

        C0370a(e eVar, bb.c cVar) {
            this.f32805a = eVar;
            this.f32806b = cVar;
        }

        public void run() {
            this.f32805a.b(new C0371a());
        }
    }

    /* compiled from: ScarAdapter */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f32809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb.c f32810b;

        /* renamed from: gb.a$b$a  reason: collision with other inner class name */
        /* compiled from: ScarAdapter */
        class C0372a implements bb.b {
            C0372a() {
            }

            public void onAdLoaded() {
                a.this.f32044b.put(b.this.f32810b.c(), b.this.f32809a);
            }
        }

        b(g gVar, bb.c cVar) {
            this.f32809a = gVar;
            this.f32810b = cVar;
        }

        public void run() {
            this.f32809a.b(new C0372a());
        }
    }

    /* compiled from: ScarAdapter */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ib.c f32813a;

        c(ib.c cVar) {
            this.f32813a = cVar;
        }

        public void run() {
            this.f32813a.b((bb.b) null);
        }
    }

    public a(d<m> dVar, String str) {
        super(dVar);
        hb.a aVar = new hb.a(new ab.a(str));
        this.f32804e = aVar;
        this.f32043a = new jb.b(aVar);
    }

    public void d(Context context, bb.c cVar, i iVar) {
        l.a(new b(new g(context, this.f32804e, cVar, this.f32046d, iVar), cVar));
    }

    public void e(Context context, RelativeLayout relativeLayout, bb.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new ib.c(context, relativeLayout, this.f32804e, cVar, i10, i11, this.f32046d, gVar)));
    }

    public void f(Context context, bb.c cVar, h hVar) {
        l.a(new C0370a(new e(context, this.f32804e, cVar, this.f32046d, hVar), cVar));
    }
}
