package k4;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: GlUtil */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f19735a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f19736b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f19737c = {12344};

    /* compiled from: GlUtil */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a() throws a {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append(10);
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    public static void b(boolean z10, String str) throws a {
        if (!z10) {
            throw new a(str);
        }
    }

    public static boolean c(Context context) {
        String eglQueryString;
        int i10 = n0.f19738a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(n0.f19740c) || "XT1650".equals(n0.f19741d))) {
            return false;
        }
        if ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        String eglQueryString;
        if (n0.f19738a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }
}
