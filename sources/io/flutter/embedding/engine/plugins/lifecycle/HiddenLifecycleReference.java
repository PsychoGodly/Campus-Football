package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.i;

@Keep
public class HiddenLifecycleReference {
    private final i lifecycle;

    public HiddenLifecycleReference(i iVar) {
        this.lifecycle = iVar;
    }

    public i getLifecycle() {
        return this.lifecycle;
    }
}
