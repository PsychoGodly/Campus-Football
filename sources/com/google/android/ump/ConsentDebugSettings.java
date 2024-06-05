package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzcn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public class ConsentDebugSettings {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26107a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26108b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final List f26109a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Context f26110b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f26111c = 0;

        /* renamed from: d  reason: collision with root package name */
        private boolean f26112d;

        public Builder(@RecentlyNonNull Context context) {
            this.f26110b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f26109a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            Context context = this.f26110b;
            List list = this.f26109a;
            boolean z10 = true;
            if (!zzcn.zzb() && !list.contains(zzcn.zza(context)) && !this.f26112d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, (zza) null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f26111c = i10;
            return this;
        }

        @RecentlyNonNull
        public Builder setForceTesting(boolean z10) {
            this.f26112d = z10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zza) {
        this.f26107a = z10;
        this.f26108b = builder.f26111c;
    }

    public int getDebugGeography() {
        return this.f26108b;
    }

    public boolean isTestDevice() {
        return this.f26107a;
    }
}
