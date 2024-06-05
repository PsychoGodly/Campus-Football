package com.unity3d.ads.core.extensions;

import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.unity3d.ads.adplayer.model.ErrorReason;

/* compiled from: IntExtension.kt */
public final class IntExtensionKt {
    public static final ErrorReason webResourceToErrorReason(int i10) {
        switch (i10) {
            case IntegrityErrorCode.CLOUD_PROJECT_NUMBER_IS_INVALID:
                return ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
            case IntegrityErrorCode.PLAY_SERVICES_VERSION_OUTDATED:
                return ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
            case IntegrityErrorCode.PLAY_STORE_VERSION_OUTDATED:
                return ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
            case IntegrityErrorCode.NONCE_IS_NOT_BASE64:
                return ErrorReason.REASON_WEB_ERROR_FILE;
            case IntegrityErrorCode.GOOGLE_SERVER_UNAVAILABLE:
                return ErrorReason.REASON_WEB_ERROR_BAD_URL;
            case IntegrityErrorCode.NONCE_TOO_LONG:
                return ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
            case IntegrityErrorCode.NONCE_TOO_SHORT:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
            case IntegrityErrorCode.CANNOT_BIND_TO_SERVICE:
                return ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
            case -8:
                return ErrorReason.REASON_WEB_ERROR_TIMEOUT;
            case -7:
                return ErrorReason.REASON_WEB_ERROR_IO;
            case -6:
                return ErrorReason.REASON_WEB_ERROR_CONNECT;
            case IntegrityErrorCode.APP_NOT_INSTALLED:
                return ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
            case IntegrityErrorCode.PLAY_STORE_ACCOUNT_NOT_FOUND:
                return ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
            case IntegrityErrorCode.NETWORK_ERROR:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
            case IntegrityErrorCode.PLAY_STORE_NOT_FOUND:
                return ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
            case -1:
                return ErrorReason.REASON_WEB_ERROR_UNKNOWN;
            default:
                return ErrorReason.REASON_UNKNOWN;
        }
    }
}
