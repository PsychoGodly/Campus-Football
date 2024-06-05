package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl */
public class i extends g {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f2946g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f2947h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f2948i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f2949j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f2950k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f2951l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f2952m;

    public i() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> z10 = z();
            constructor = A(z10);
            method4 = w(z10);
            method3 = x(z10);
            method2 = B(z10);
            method = v(z10);
            Class<?> cls2 = z10;
            method5 = y(z10);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2946g = cls;
        this.f2947h = constructor;
        this.f2948i = method4;
        this.f2949j = method3;
        this.f2950k = method2;
        this.f2951l = method;
        this.f2952m = method5;
    }

    private Object p() {
        try {
            return this.f2947h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void q(Object obj) {
        try {
            this.f2951l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean r(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2948i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f2949j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t(Object obj) {
        try {
            return ((Boolean) this.f2950k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean u() {
        if (this.f2948i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2948i != null;
    }

    /* access modifiers changed from: protected */
    public Constructor<?> A(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method B(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        if (!u()) {
            return super.b(context, cVar, resources, i10);
        }
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!r(context, p10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                q(p10);
                return null;
            }
        }
        if (!t(p10)) {
            return null;
        }
        return m(p10);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface m10;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!u()) {
            g.b i11 = i(bVarArr, i10);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(i11.d(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(i11.e()).setItalic(i11.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h10 = m.h(context, bVarArr, cancellationSignal);
            Object p10 = p();
            if (p10 == null) {
                return null;
            }
            boolean z10 = false;
            for (g.b bVar : bVarArr) {
                ByteBuffer byteBuffer = h10.get(bVar.d());
                if (byteBuffer != null) {
                    if (!s(p10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        q(p10);
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                q(p10);
                return null;
            } else if (t(p10) && (m10 = m(p10)) != null) {
                return Typeface.create(m10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!u()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        if (!r(context, p10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            q(p10);
            return null;
        } else if (!t(p10)) {
            return null;
        } else {
            return m(p10);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2946g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2952m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method v(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method y(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> z() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }
}
