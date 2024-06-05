package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
@Deprecated
public enum VideoAutoplayBehavior {
    DEFAULT,
    ON,
    OFF
}
