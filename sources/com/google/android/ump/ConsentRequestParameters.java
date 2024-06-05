package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public class ConsentRequestParameters {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26114a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26115b;

    /* renamed from: c  reason: collision with root package name */
    private final ConsentDebugSettings f26116c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f26117a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f26118b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public ConsentDebugSettings f26119c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, (zzb) null);
        }

        @RecentlyNonNull
        public Builder setAdMobAppId(String str) {
            this.f26118b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f26119c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f26117a = z10;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzb) {
        this.f26114a = builder.f26117a;
        this.f26115b = builder.f26118b;
        this.f26116c = builder.f26119c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f26116c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f26114a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f26115b;
    }
}
