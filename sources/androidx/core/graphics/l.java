package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.google.android.gms.common.api.a;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl */
class l {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, e.c> f2953a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl */
    class a implements c<g.b> {
        a() {
        }

        /* renamed from: c */
        public int a(g.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl */
    class b implements c<e.d> {
        b() {
        }

        /* renamed from: c */
        public int a(e.d dVar) {
            return dVar.e();
        }

        /* renamed from: d */
        public boolean b(e.d dVar) {
            return dVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl */
    private interface c<T> {
        int a(T t10);

        boolean b(T t10);
    }

    l() {
    }

    private void a(Typeface typeface, e.c cVar) {
        long k10 = k(typeface);
        if (k10 != 0) {
            this.f2953a.put(Long.valueOf(k10), cVar);
        }
    }

    private e.d f(e.c cVar, int i10) {
        return (e.d) g(cVar.a(), i10, new b());
    }

    private static <T> T g(T[] tArr, int i10, c<T> cVar) {
        return h(tArr, (i10 & 1) == 0 ? CommonGatewayClient.CODE_400 : 700, (i10 & 2) != 0, cVar);
    }

    private static <T> T h(T[] tArr, int i10, boolean z10, c<T> cVar) {
        T t10 = null;
        int i11 = a.e.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int abs = (Math.abs(cVar.a(t11) - i10) * 2) + (cVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    private static long k(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e10) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            return 0;
        } catch (IllegalAccessException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0;
        }
    }

    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        e.d f10 = f(cVar, i10);
        if (f10 == null) {
            return null;
        }
        Typeface d10 = f.d(context, resources, f10.b(), f10.a(), 0, i10);
        a(d10, cVar);
        return d10;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(i(bVarArr, i10).d());
            try {
                Typeface d10 = d(context, inputStream);
                m.a(inputStream);
                return d10;
            } catch (IOException unused) {
                m.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                m.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            m.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            m.a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e10 = m.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!m.d(e10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = m.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!m.c(e10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    /* access modifiers changed from: protected */
    public g.b i(g.b[] bVarArr, int i10) {
        return (g.b) g(bVarArr, i10, new a());
    }

    /* access modifiers changed from: package-private */
    public e.c j(Typeface typeface) {
        long k10 = k(typeface);
        if (k10 == 0) {
            return null;
        }
        return this.f2953a.get(Long.valueOf(k10));
    }
}
