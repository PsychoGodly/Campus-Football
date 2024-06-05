package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzfi extends IOException {
    zzfi() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzfi(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzfi(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
