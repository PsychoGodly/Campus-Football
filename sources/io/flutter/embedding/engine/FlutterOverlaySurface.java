package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public class FlutterOverlaySurface {

    /* renamed from: id  reason: collision with root package name */
    private final int f33535id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface2) {
        this.f33535id = i10;
        this.surface = surface2;
    }

    public int getId() {
        return this.f33535id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
