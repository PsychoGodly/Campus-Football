package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public class FormError {

    /* renamed from: a  reason: collision with root package name */
    private final int f26120a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26121b;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f26120a = i10;
        this.f26121b = str;
    }

    public int getErrorCode() {
        return this.f26120a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f26121b;
    }
}
