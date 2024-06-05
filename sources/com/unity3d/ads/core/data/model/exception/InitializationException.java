package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.e3;

/* compiled from: InitializationException.kt */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion((h) null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* compiled from: InitializationException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final InitializationException parseFrom(Exception exc) {
            m.e(exc, "e");
            if (exc instanceof e3) {
                return new InitializationException(InitializeAndroidBoldSDK.MSG_TIMEOUT, exc, "timeout", exc.getMessage());
            }
            if (exc instanceof UnityAdsNetworkException) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("network.");
                UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) exc;
                sb2.append(unityAdsNetworkException.getCode());
                return new InitializationException(InitializeAndroidBoldSDK.MSG_NETWORK, exc, sb2.toString(), unityAdsNetworkException.getMessage());
            } else if (exc instanceof InitializationException) {
                return (InitializationException) exc;
            } else {
                return new InitializationException(InitializeAndroidBoldSDK.MSG_UNKNOWN, exc, "unknown", exc.getMessage());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? null : th, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final InitializationException copy(String str, Throwable th, String str2, String str3) {
        m.e(str, "message");
        m.e(str2, "reason");
        return new InitializationException(str, th, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return m.a(getMessage(), initializationException.getMessage()) && m.a(this.throwable, initializationException.throwable) && m.a(this.reason, initializationException.reason) && m.a(this.reasonDebug, initializationException.reasonDebug);
    }

    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int i10 = 0;
        int hashCode2 = (((hashCode + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitializationException(String str, Throwable th, String str2, String str3) {
        super(str);
        m.e(str, "message");
        m.e(str2, "reason");
        this.message = str;
        this.throwable = th;
        this.reason = str2;
        this.reasonDebug = str3;
    }
}
