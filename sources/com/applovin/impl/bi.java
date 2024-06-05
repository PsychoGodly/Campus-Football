package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.zh;
import java.nio.FloatBuffer;

final class bi {

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f6714j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f6715k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f6716l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    private static final float[] f6717m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    private static final float[] f6718n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o  reason: collision with root package name */
    private static final float[] f6719o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p  reason: collision with root package name */
    private static final float[] f6720p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private int f6721a;

    /* renamed from: b  reason: collision with root package name */
    private a f6722b;

    /* renamed from: c  reason: collision with root package name */
    private a f6723c;

    /* renamed from: d  reason: collision with root package name */
    private int f6724d;

    /* renamed from: e  reason: collision with root package name */
    private int f6725e;

    /* renamed from: f  reason: collision with root package name */
    private int f6726f;

    /* renamed from: g  reason: collision with root package name */
    private int f6727g;

    /* renamed from: h  reason: collision with root package name */
    private int f6728h;

    /* renamed from: i  reason: collision with root package name */
    private int f6729i;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f6730a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f6731b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f6732c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final int f6733d;

        public a(zh.b bVar) {
            this.f6730a = bVar.a();
            this.f6731b = z9.a(bVar.f13868c);
            this.f6732c = z9.a(bVar.f13869d);
            int i10 = bVar.f13867b;
            if (i10 == 1) {
                this.f6733d = 5;
            } else if (i10 != 2) {
                this.f6733d = 4;
            } else {
                this.f6733d = 6;
            }
        }
    }

    bi() {
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f6723c : this.f6722b;
        if (aVar != null) {
            GLES20.glUseProgram(this.f6724d);
            z9.a();
            GLES20.glEnableVertexAttribArray(this.f6727g);
            GLES20.glEnableVertexAttribArray(this.f6728h);
            z9.a();
            int i11 = this.f6721a;
            if (i11 == 1) {
                fArr2 = z10 ? f6718n : f6717m;
            } else if (i11 == 2) {
                fArr2 = z10 ? f6720p : f6719o;
            } else {
                fArr2 = f6716l;
            }
            GLES20.glUniformMatrix3fv(this.f6726f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f6725e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(this.f6729i, 0);
            z9.a();
            GLES20.glVertexAttribPointer(this.f6727g, 3, 5126, false, 12, aVar.f6731b);
            z9.a();
            GLES20.glVertexAttribPointer(this.f6728h, 2, 5126, false, 8, aVar.f6732c);
            z9.a();
            GLES20.glDrawArrays(aVar.f6733d, 0, aVar.f6730a);
            z9.a();
            GLES20.glDisableVertexAttribArray(this.f6727g);
            GLES20.glDisableVertexAttribArray(this.f6728h);
        }
    }

    public void b(zh zhVar) {
        if (a(zhVar)) {
            this.f6721a = zhVar.f13863c;
            a aVar = new a(zhVar.f13861a.a(0));
            this.f6722b = aVar;
            if (!zhVar.f13864d) {
                aVar = new a(zhVar.f13862b.a(0));
            }
            this.f6723c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int a10 = z9.a(f6714j, f6715k);
        this.f6724d = a10;
        this.f6725e = GLES20.glGetUniformLocation(a10, "uMvpMatrix");
        this.f6726f = GLES20.glGetUniformLocation(this.f6724d, "uTexMatrix");
        this.f6727g = GLES20.glGetAttribLocation(this.f6724d, "aPosition");
        this.f6728h = GLES20.glGetAttribLocation(this.f6724d, "aTexCoords");
        this.f6729i = GLES20.glGetUniformLocation(this.f6724d, "uTexture");
    }

    public static boolean a(zh zhVar) {
        zh.a aVar = zhVar.f13861a;
        zh.a aVar2 = zhVar.f13862b;
        if (aVar.a() == 1 && aVar.a(0).f13866a == 0 && aVar2.a() == 1 && aVar2.a(0).f13866a == 0) {
            return true;
        }
        return false;
    }
}
