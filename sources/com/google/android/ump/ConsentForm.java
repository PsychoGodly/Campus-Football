package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public interface ConsentForm {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
