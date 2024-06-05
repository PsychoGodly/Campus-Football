package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return l.a(context).a();
    }
}
