package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import jc.c;
import xb.b;

/* compiled from: FlutterTextureView */
public class i extends TextureView implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f33431a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f33432b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33433c;

    /* renamed from: d  reason: collision with root package name */
    private jc.a f33434d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Surface f33435f;

    /* renamed from: g  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f33436g;

    /* compiled from: FlutterTextureView */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = i.this.f33431a = true;
            if (i.this.f33432b) {
                i.this.k();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = i.this.f33431a = false;
            if (i.this.f33432b) {
                i.this.l();
            }
            if (i.this.f33435f == null) {
                return true;
            }
            i.this.f33435f.release();
            Surface unused2 = i.this.f33435f = null;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (i.this.f33432b) {
                i.this.j(i10, i11);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void j(int i10, int i11) {
        if (this.f33434d != null) {
            b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
            this.f33434d.w(i10, i11);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void k() {
        if (this.f33434d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f33435f;
        if (surface != null) {
            surface.release();
            this.f33435f = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f33435f = surface2;
        this.f33434d.u(surface2, this.f33433c);
        this.f33433c = false;
    }

    /* access modifiers changed from: private */
    public void l() {
        jc.a aVar = this.f33434d;
        if (aVar != null) {
            aVar.v();
            Surface surface = this.f33435f;
            if (surface != null) {
                surface.release();
                this.f33435f = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void m() {
        setSurfaceTextureListener(this.f33436g);
    }

    public void a(jc.a aVar) {
        b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f33434d != null) {
            b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f33434d.v();
        }
        this.f33434d = aVar;
        this.f33432b = true;
        if (this.f33431a) {
            b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
    }

    public void b() {
        if (this.f33434d != null) {
            if (getWindowToken() != null) {
                b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                l();
            }
            this.f33434d = null;
            this.f33432b = false;
            return;
        }
        b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public jc.a getAttachedRenderer() {
        return this.f33434d;
    }

    public void pause() {
        if (this.f33434d != null) {
            this.f33434d = null;
            this.f33433c = true;
            this.f33432b = false;
            return;
        }
        b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public void setRenderSurface(Surface surface) {
        this.f33435f = surface;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33431a = false;
        this.f33432b = false;
        this.f33433c = false;
        this.f33436g = new a();
        m();
    }
}
