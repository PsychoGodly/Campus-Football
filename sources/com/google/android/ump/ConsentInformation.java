package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public interface ConsentInformation {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(@RecentlyNonNull FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public enum PrivacyOptionsRequirementStatus {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentRequestParameters consentRequestParameters, @RecentlyNonNull OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, @RecentlyNonNull OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
