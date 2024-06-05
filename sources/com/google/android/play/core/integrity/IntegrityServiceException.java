package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.play.core.integrity.model.a;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public class IntegrityServiceException extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f26036a;

    IntegrityServiceException(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", new Object[]{Integer.valueOf(i10), a.a(i10)})));
        if (i10 != 0) {
            this.f26036a = th;
            return;
        }
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    public final synchronized Throwable getCause() {
        return this.f26036a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
