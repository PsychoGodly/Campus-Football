package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import java.util.Objects;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: HardwareFoldingFeature.kt */
public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion((h) null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            m.e(bounds, "bounds");
            boolean z10 = false;
            if ((bounds.getWidth() == 0 && bounds.getHeight() == 0) ? false : true) {
                if (bounds.getLeft() == 0 || bounds.getTop() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class Type {
        public static final Companion Companion = new Companion((h) null);
        /* access modifiers changed from: private */
        public static final Type FOLD = new Type("FOLD");
        /* access modifiers changed from: private */
        public static final Type HINGE = new Type("HINGE");
        private final String description;

        /* compiled from: HardwareFoldingFeature.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(Bounds bounds, Type type2, FoldingFeature.State state2) {
        m.e(bounds, "featureBounds");
        m.e(type2, "type");
        m.e(state2, "state");
        this.featureBounds = bounds;
        this.type = type2;
        this.state = state2;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.a(HardwareFoldingFeature.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
        return m.a(this.featureBounds, hardwareFoldingFeature.featureBounds) && m.a(this.type, hardwareFoldingFeature.type) && m.a(getState(), hardwareFoldingFeature.getState());
    }

    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) {
            return FoldingFeature.OcclusionType.NONE;
        }
        return FoldingFeature.OcclusionType.FULL;
    }

    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    public FoldingFeature.State getState() {
        return this.state;
    }

    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    public boolean isSeparating() {
        Type type2 = this.type;
        Type.Companion companion = Type.Companion;
        if (m.a(type2, companion.getHINGE())) {
            return true;
        }
        if (!m.a(this.type, companion.getFOLD()) || !m.a(getState(), FoldingFeature.State.HALF_OPENED)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return HardwareFoldingFeature.class.getSimpleName() + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
