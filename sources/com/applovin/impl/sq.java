package com.applovin.impl;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class sq extends GLSurfaceView implements uq {

    /* renamed from: a  reason: collision with root package name */
    private final a f12167a;

    public sq(Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public uq getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(tq tqVar) {
        this.f12167a.a(tqVar);
    }

    public sq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f12167a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: j  reason: collision with root package name */
        private static final float[] f12168j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: k  reason: collision with root package name */
        private static final float[] f12169k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: l  reason: collision with root package name */
        private static final float[] f12170l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: m  reason: collision with root package name */
        private static final String[] f12171m = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: n  reason: collision with root package name */
        private static final FloatBuffer f12172n = z9.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a  reason: collision with root package name */
        private final GLSurfaceView f12173a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f12174b = new int[3];

        /* renamed from: c  reason: collision with root package name */
        private final int[] f12175c = new int[3];

        /* renamed from: d  reason: collision with root package name */
        private final int[] f12176d = new int[3];

        /* renamed from: e  reason: collision with root package name */
        private final int[] f12177e = new int[3];

        /* renamed from: f  reason: collision with root package name */
        private final AtomicReference f12178f = new AtomicReference();

        /* renamed from: g  reason: collision with root package name */
        private final FloatBuffer[] f12179g = new FloatBuffer[3];

        /* renamed from: h  reason: collision with root package name */
        private int f12180h;

        /* renamed from: i  reason: collision with root package name */
        private int f12181i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f12173a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f12176d;
                this.f12177e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        public void a(tq tqVar) {
            b8.a(this.f12178f.getAndSet(tqVar));
            this.f12173a.requestRender();
        }

        public void onDrawFrame(GL10 gl10) {
            b8.a(this.f12178f.getAndSet((Object) null));
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int a10 = z9.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f12180h = a10;
            GLES20.glUseProgram(a10);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f12180h, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f12172n);
            this.f12175c[0] = GLES20.glGetAttribLocation(this.f12180h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f12175c[0]);
            this.f12175c[1] = GLES20.glGetAttribLocation(this.f12180h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f12175c[1]);
            this.f12175c[2] = GLES20.glGetAttribLocation(this.f12180h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f12175c[2]);
            z9.a();
            this.f12181i = GLES20.glGetUniformLocation(this.f12180h, "mColorConversion");
            z9.a();
            a();
            z9.a();
        }

        private void a() {
            GLES20.glGenTextures(3, this.f12174b, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f12180h, f12171m[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f12174b[i10]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            z9.a();
        }
    }
}
