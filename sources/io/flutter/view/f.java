package io.flutter.view;

import android.graphics.SurfaceTexture;

/* compiled from: TextureRegistry */
public interface f {

    /* compiled from: TextureRegistry */
    public interface a {
        void a();
    }

    /* compiled from: TextureRegistry */
    public interface b {
        void onTrimMemory(int i10);
    }

    /* compiled from: TextureRegistry */
    public interface c {
        void a(b bVar);

        SurfaceTexture b();

        long c();

        void d(a aVar);

        void release();
    }

    c h();
}
