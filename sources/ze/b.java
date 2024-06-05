package ze;

import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: CameraHandlerThread */
public class b extends HandlerThread {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public a f39568a;

    /* compiled from: CameraHandlerThread */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f39569a;

        /* renamed from: ze.b$a$a  reason: collision with other inner class name */
        /* compiled from: CameraHandlerThread */
        class C0472a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Camera f39571a;

            C0472a(Camera camera) {
                this.f39571a = camera;
            }

            public void run() {
                b.this.f39568a.setupCameraPreview(e.a(this.f39571a, a.this.f39569a));
            }
        }

        a(int i10) {
            this.f39569a = i10;
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C0472a(d.a(this.f39569a)));
        }
    }

    public b(a aVar) {
        super("CameraHandlerThread");
        this.f39568a = aVar;
        start();
    }

    public void b(int i10) {
        new Handler(getLooper()).post(new a(i10));
    }
}
