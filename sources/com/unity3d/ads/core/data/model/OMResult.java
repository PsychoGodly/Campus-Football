package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: OMResult.kt */
public abstract class OMResult {

    /* compiled from: OMResult.kt */
    public static final class Failure extends OMResult {
        private final String reason;
        private final String reasonDebug;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(String str, String str2, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failure.reason;
            }
            if ((i10 & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.reasonDebug;
        }

        public final Failure copy(String str, String str2) {
            m.e(str, "reason");
            return new Failure(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return m.a(this.reason, failure.reason) && m.a(this.reasonDebug, failure.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(String str, String str2) {
            super((h) null);
            m.e(str, "reason");
            this.reason = str;
            this.reasonDebug = str2;
        }
    }

    /* compiled from: OMResult.kt */
    public static final class Success extends OMResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super((h) null);
        }
    }

    private OMResult() {
    }

    public /* synthetic */ OMResult(h hVar) {
        this();
    }
}
