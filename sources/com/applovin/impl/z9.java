package com.applovin.impl;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public abstract class z9 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13813a = false;

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    private static void a(int i10, String str, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            a(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        a();
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return iArr[0];
    }

    public static boolean c() {
        String eglQueryString;
        if (yp.f13662a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }

    public static void a() {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            kc.b("GlUtil", "glError " + GLU.gluErrorString(glGetError));
            i10 = glGetError;
        }
        if (i10 != 0) {
            a("glError " + GLU.gluErrorString(i10));
        }
    }

    public static FloatBuffer a(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) a(fArr.length).put(fArr).flip();
    }

    public static boolean a(Context context) {
        String eglQueryString;
        int i10 = yp.f13662a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(yp.f13664c) || "XT1650".equals(yp.f13665d))) {
            return false;
        }
        if ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return true;
        }
        return false;
    }

    public static int a(String[] strArr, String[] strArr2) {
        return a(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
    }

    public static int a(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        a();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        a();
        return glCreateProgram;
    }

    private static void a(String str) {
        kc.b("GlUtil", str);
        if (f13813a) {
            throw new a(str);
        }
    }
}
