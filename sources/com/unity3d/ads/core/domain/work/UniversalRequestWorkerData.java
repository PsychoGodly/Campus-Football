package com.unity3d.ads.core.domain.work;

import androidx.work.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: UniversalRequestWorkerData.kt */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion((h) null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    /* compiled from: UniversalRequestWorkerData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public UniversalRequestWorkerData(String str) {
        m.e(str, KEY_UNIVERSAL_REQUEST_ID);
        this.universalRequestId = str;
    }

    public final e invoke() {
        e a10 = new e.a().h(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).a();
        m.d(a10, "Builder()\n            .p…tId)\n            .build()");
        return a10;
    }
}
