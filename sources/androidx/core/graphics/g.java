package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl */
class g extends l {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f2937b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f2938c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2939d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2940e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2941f = false;

    g() {
    }

    private static boolean l(Object obj, String str, int i10, boolean z10) {
        o();
        try {
            return ((Boolean) f2939d.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface m(Object obj) {
        o();
        try {
            Object newInstance = Array.newInstance(f2937b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2940e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File n(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void o() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f2941f) {
            f2941f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                method2 = null;
                cls = null;
                method = null;
            }
            f2938c = constructor;
            f2937b = cls;
            f2939d = method;
            f2940e = method2;
        }
    }

    private static Object p() {
        o();
        try {
            return f2938c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        Object p10 = p();
        e.d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            e.d dVar = a10[i11];
            File e10 = m.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!m.c(e10, resources, dVar.b())) {
                    e10.delete();
                    return null;
                } else if (!l(p10, e10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    e10.delete();
                    i11++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return m(p10);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b i11 = i(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i11.d(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File n10 = n(openFileDescriptor);
                if (n10 != null) {
                    if (n10.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(n10);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d10 = super.d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d10;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
