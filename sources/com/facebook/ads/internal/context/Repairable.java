package com.facebook.ads.internal.context;

import androidx.annotation.Keep;

@Keep
public interface Repairable {
    void repair(Throwable th);
}
