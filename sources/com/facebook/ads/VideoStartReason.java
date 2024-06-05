package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public enum VideoStartReason {
    NOT_STARTED,
    USER_STARTED,
    AUTO_STARTED
}
