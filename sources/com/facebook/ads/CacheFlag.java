package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import java.util.EnumSet;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;
    
    public static final EnumSet<CacheFlag> ALL = null;

    static {
        ALL = EnumSet.allOf(CacheFlag.class);
    }
}
