package l4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import k4.j;
import k4.m;
import k4.r;

/* compiled from: PlaceholderSurface */
public final class i extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f19960d;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f19961f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19962a;

    /* renamed from: b  reason: collision with root package name */
    private final b f19963b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19964c;

    /* compiled from: PlaceholderSurface */
    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private j f19965a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f19966b;

        /* renamed from: c  reason: collision with root package name */
        private Error f19967c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f19968d;

        /* renamed from: f  reason: collision with root package name */
        private i f19969f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws m.a {
            k4.a.e(this.f19965a);
            this.f19965a.h(i10);
            this.f19969f = new i(this, this.f19965a.g(), i10 != 0);
        }

        private void d() {
            k4.a.e(this.f19965a);
            this.f19965a.i();
        }

        public i a(int i10) {
            boolean z10;
            start();
            this.f19966b = new Handler(getLooper(), this);
            this.f19965a = new j(this.f19966b);
            synchronized (this) {
                z10 = false;
                this.f19966b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f19969f == null && this.f19968d == null && this.f19967c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f19968d;
            if (runtimeException == null) {
                Error error = this.f19967c;
                if (error == null) {
                    return (i) k4.a.e(this.f19969f);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            k4.a.e(this.f19966b);
            this.f19966b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f19968d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (m.a e11) {
                    r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f19968d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    try {
                        r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                        this.f19967c = e12;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    private static int a(Context context) {
        if (m.c(context)) {
            return m.d() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (i.class) {
            z10 = true;
            if (!f19961f) {
                f19960d = a(context);
                f19961f = true;
            }
            if (f19960d == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static i c(Context context, boolean z10) {
        int i10 = 0;
        k4.a.f(!z10 || b(context));
        b bVar = new b();
        if (z10) {
            i10 = f19960d;
        }
        return bVar.a(i10);
    }

    public void release() {
        super.release();
        synchronized (this.f19963b) {
            if (!this.f19964c) {
                this.f19963b.c();
                this.f19964c = true;
            }
        }
    }

    private i(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f19963b = bVar;
        this.f19962a = z10;
    }
}
