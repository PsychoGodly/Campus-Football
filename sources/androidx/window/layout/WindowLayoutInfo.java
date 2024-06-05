package androidx.window.layout;

import fe.l;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: WindowLayoutInfo.kt */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        m.e(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m.a(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return m.a(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return y.y(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (l) null, 56, (Object) null);
    }
}
