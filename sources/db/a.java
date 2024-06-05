package db;

import android.content.Context;
import android.widget.RelativeLayout;
import cb.g;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
import eb.e;

/* compiled from: ScarAdapter */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    private g<z4.a> f32089e;

    /* renamed from: db.a$a  reason: collision with other inner class name */
    /* compiled from: ScarAdapter */
    class C0357a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb.c f32091b;

        /* renamed from: db.a$a$a  reason: collision with other inner class name */
        /* compiled from: ScarAdapter */
        class C0358a implements bb.b {
            C0358a() {
            }

            public void onAdLoaded() {
                a.this.f32044b.put(C0357a.this.f32091b.c(), C0357a.this.f32090a);
            }
        }

        C0357a(e eVar, bb.c cVar) {
            this.f32090a = eVar;
            this.f32091b = cVar;
        }

        public void run() {
            this.f32090a.b(new C0358a());
        }
    }

    /* compiled from: ScarAdapter */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eb.g f32094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb.c f32095b;

        /* renamed from: db.a$b$a  reason: collision with other inner class name */
        /* compiled from: ScarAdapter */
        class C0359a implements bb.b {
            C0359a() {
            }

            public void onAdLoaded() {
                a.this.f32044b.put(b.this.f32095b.c(), b.this.f32094a);
            }
        }

        b(eb.g gVar, bb.c cVar) {
            this.f32094a = gVar;
            this.f32095b = cVar;
        }

        public void run() {
            this.f32094a.b(new C0359a());
        }
    }

    /* compiled from: ScarAdapter */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eb.c f32098a;

        c(eb.c cVar) {
            this.f32098a = cVar;
        }

        public void run() {
            this.f32098a.b((bb.b) null);
        }
    }

    public a(d<m> dVar) {
        super(dVar);
        g<z4.a> gVar = new g<>();
        this.f32089e = gVar;
        this.f32043a = new fb.b(gVar);
    }

    public void d(Context context, bb.c cVar, i iVar) {
        l.a(new b(new eb.g(context, this.f32089e.a(cVar.c()), cVar, this.f32046d, iVar), cVar));
    }

    public void e(Context context, RelativeLayout relativeLayout, bb.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new eb.c(context, this.f32089e.a(cVar.c()), relativeLayout, cVar, i10, i11, this.f32046d, gVar)));
    }

    public void f(Context context, bb.c cVar, h hVar) {
        l.a(new C0357a(new e(context, this.f32089e.a(cVar.c()), cVar, this.f32046d, hVar), cVar));
    }
}
