package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import java.util.List;
import l8.h;

@Keep
/* compiled from: Logging.kt */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public List<c<?>> getComponents() {
        return p.b(h.b("fire-core-ktx", "20.4.2"));
    }
}
