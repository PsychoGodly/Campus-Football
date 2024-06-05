package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.e;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* compiled from: TypefaceCompat */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final l f2934a;

    /* renamed from: b  reason: collision with root package name */
    private static final e<String, Typeface> f2935b = new e<>(16);

    /* compiled from: TypefaceCompat */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.f f2936a;

        public a(h.f fVar) {
            this.f2936a = fVar;
        }

        public void a(int i10) {
            h.f fVar = this.f2936a;
            if (fVar != null) {
                fVar.f(i10);
            }
        }

        public void b(Typeface typeface) {
            h.f fVar = this.f2936a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f2934a = new k();
        } else if (i10 >= 28) {
            f2934a = new j();
        } else if (i10 >= 26) {
            f2934a = new i();
        } else if (i10 >= 24 && h.n()) {
            f2934a = new h();
        } else if (i10 >= 21) {
            f2934a = new g();
        } else {
            f2934a = new l();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        Typeface g10;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (g10 = g(context, typeface, i10)) == null) {
            return Typeface.create(typeface, i10);
        } else {
            return g10;
        }
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f2934a.c(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.f fVar, Handler handler, boolean z10) {
        Typeface typeface;
        e.b bVar2 = bVar;
        h.f fVar2 = fVar;
        Handler handler2 = handler;
        if (bVar2 instanceof e.C0033e) {
            e.C0033e eVar = (e.C0033e) bVar2;
            Typeface h10 = h(eVar.c());
            if (h10 != null) {
                if (fVar2 != null) {
                    fVar2.d(h10, handler2);
                }
                return h10;
            }
            typeface = g.c(context, eVar.b(), i12, !z10 ? fVar2 == null : eVar.a() == 0, z10 ? eVar.d() : -1, h.f.e(handler), new a(fVar2));
            Resources resources2 = resources;
            int i13 = i12;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f2934a.b(context, (e.c) bVar2, resources, i12);
            if (fVar2 != null) {
                if (typeface != null) {
                    fVar2.d(typeface, handler2);
                } else {
                    fVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f2935b.put(e(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface e10 = f2934a.e(context, resources, i10, str, i12);
        if (e10 != null) {
            f2935b.put(e(resources, i10, str, i11, i12), e10);
        }
        return e10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f2935b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(Context context, Typeface typeface, int i10) {
        l lVar = f2934a;
        e.c j10 = lVar.j(typeface);
        if (j10 == null) {
            return null;
        }
        return lVar.b(context, j10, context.getResources(), i10);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
