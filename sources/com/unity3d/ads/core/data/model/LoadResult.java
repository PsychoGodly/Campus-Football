package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: LoadResult.kt */
public abstract class LoadResult {
    public static final Companion Companion = new Companion((h) null);
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID = "[UnityAds] Object ID cannot be null";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: LoadResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: LoadResult.kt */
    public static final class Failure extends LoadResult {
        private final UnityAds.UnityAdsLoadError error;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, int i10, h hVar) {
            this(unityAdsLoadError, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : th, str2, (i10 & 16) != 0 ? null : str3);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i10 & 2) != 0) {
                str = failure.message;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                th = failure.throwable;
            }
            Throwable th2 = th;
            if ((i10 & 8) != 0) {
                str2 = failure.reason;
            }
            String str5 = str2;
            if ((i10 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            return failure.copy(unityAdsLoadError, str4, th2, str5, str3);
        }

        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final String component4() {
            return this.reason;
        }

        public final String component5() {
            return this.reasonDebug;
        }

        public final Failure copy(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3) {
            m.e(unityAdsLoadError, "error");
            m.e(str2, "reason");
            return new Failure(unityAdsLoadError, str, th, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && m.a(this.message, failure.message) && m.a(this.throwable, failure.throwable) && m.a(this.reason, failure.reason) && m.a(this.reasonDebug, failure.reasonDebug);
        }

        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        public final String getMessage() {
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
            int hashCode = this.error.hashCode() * 31;
            String str = this.message;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.throwable;
            int hashCode3 = (((hashCode2 + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
            String str2 = this.reasonDebug;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3) {
            super((h) null);
            m.e(unityAdsLoadError, "error");
            m.e(str2, "reason");
            this.error = unityAdsLoadError;
            this.message = str;
            this.throwable = th;
            this.reason = str2;
            this.reasonDebug = str3;
        }
    }

    /* compiled from: LoadResult.kt */
    public static final class Success extends LoadResult {
        private final AdObject adObject;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(AdObject adObject2) {
            super((h) null);
            m.e(adObject2, "adObject");
            this.adObject = adObject2;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adObject2 = success.adObject;
            }
            return success.copy(adObject2);
        }

        public final AdObject component1() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject2) {
            m.e(adObject2, "adObject");
            return new Success(adObject2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m.a(this.adObject, ((Success) obj).adObject);
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    private LoadResult() {
    }

    public /* synthetic */ LoadResult(h hVar) {
        this();
    }
}
