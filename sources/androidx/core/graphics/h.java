package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl */
class h extends l {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2942b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f2943c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f2944d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f2945e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            method = null;
        }
        f2943c = constructor;
        f2942b = cls;
        f2944d = method;
        f2945e = method2;
    }

    h() {
    }

    private static boolean l(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f2944d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2942b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2945e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean n() {
        Method method = f2944d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object o() {
        try {
            return f2943c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b10 = m.b(context, resources, dVar.b());
            if (b10 == null || !l(o10, b10, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return m(o10);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        androidx.collection.g gVar = new androidx.collection.g();
        for (g.b bVar : bVarArr) {
            Uri d10 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d10);
            if (byteBuffer == null) {
                byteBuffer = m.f(context, cancellationSignal, d10);
                gVar.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !l(o10, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface m10 = m(o10);
        if (m10 == null) {
            return null;
        }
        return Typeface.create(m10, i10);
    }
}
