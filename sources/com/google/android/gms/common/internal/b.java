package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class b {
    public static com.google.android.gms.common.api.b a(Status status) {
        if (status.y()) {
            return new h(status);
        }
        return new com.google.android.gms.common.api.b(status);
    }
}
