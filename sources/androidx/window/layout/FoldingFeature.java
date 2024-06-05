package androidx.window.layout;

import kotlin.jvm.internal.h;

/* compiled from: FoldingFeature.kt */
public interface FoldingFeature extends DisplayFeature {

    /* compiled from: FoldingFeature.kt */
    public static final class OcclusionType {
        public static final Companion Companion = new Companion((h) null);
        public static final OcclusionType FULL = new OcclusionType("FULL");
        public static final OcclusionType NONE = new OcclusionType("NONE");
        private final String description;

        /* compiled from: FoldingFeature.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }
        }

        private OcclusionType(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    public static final class Orientation {
        public static final Companion Companion = new Companion((h) null);
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        private final String description;

        /* compiled from: FoldingFeature.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }
        }

        private Orientation(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    public static final class State {
        public static final Companion Companion = new Companion((h) null);
        public static final State FLAT = new State("FLAT");
        public static final State HALF_OPENED = new State("HALF_OPENED");
        private final String description;

        /* compiled from: FoldingFeature.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }
        }

        private State(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    OcclusionType getOcclusionType();

    Orientation getOrientation();

    State getState();

    boolean isSeparating();
}
