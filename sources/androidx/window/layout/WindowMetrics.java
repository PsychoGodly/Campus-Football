package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.m;

/* compiled from: WindowMetrics.kt */
public final class WindowMetrics {
    private final Bounds _bounds;

    public WindowMetrics(Bounds bounds) {
        m.e(bounds, "_bounds");
        this._bounds = bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m.a(WindowMetrics.class, obj.getClass())) {
            return false;
        }
        return m.a(this._bounds, ((WindowMetrics) obj)._bounds);
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect) {
        this(new Bounds(rect));
        m.e(rect, "bounds");
    }
}
