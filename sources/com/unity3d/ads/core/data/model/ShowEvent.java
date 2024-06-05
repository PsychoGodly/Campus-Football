package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: ShowEvent.kt */
public abstract class ShowEvent {

    /* compiled from: ShowEvent.kt */
    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super((h) null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super((h) null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Completed extends ShowEvent {
        private final ShowStatus status;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Completed(ShowStatus showStatus) {
            super((h) null);
            m.e(showStatus, "status");
            this.status = showStatus;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                showStatus = completed.status;
            }
            return completed.copy(showStatus);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final Completed copy(ShowStatus showStatus) {
            m.e(showStatus, "status");
            return new Completed(showStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && this.status == ((Completed) obj).status;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "Completed(status=" + this.status + ')';
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(String str, int i10, String str2) {
            super((h) null);
            m.e(str, "message");
            m.e(str2, "reason");
            this.message = str;
            this.errorCode = i10;
            this.reason = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            if ((i11 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i10, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String str, int i10, String str2) {
            m.e(str, "message");
            m.e(str2, "reason");
            return new Error(str, i10, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return m.a(this.message, error.message) && this.errorCode == error.errorCode && m.a(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.errorCode) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super((h) null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super((h) null);
        }
    }

    private ShowEvent() {
    }

    public /* synthetic */ ShowEvent(h hVar) {
        this();
    }
}
