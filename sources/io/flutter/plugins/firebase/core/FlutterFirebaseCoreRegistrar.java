package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import java.util.Collections;
import java.util.List;
import l8.h;

@Keep
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    public List<c<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-core", "2.24.2"));
    }
}
