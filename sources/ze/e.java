package ze;

import android.hardware.Camera;
import java.util.Objects;

/* compiled from: CameraWrapper */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Camera f39585a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39586b;

    private e(Camera camera, int i10) {
        Objects.requireNonNull(camera, "Camera cannot be null");
        this.f39585a = camera;
        this.f39586b = i10;
    }

    public static e a(Camera camera, int i10) {
        if (camera == null) {
            return null;
        }
        return new e(camera, i10);
    }
}
