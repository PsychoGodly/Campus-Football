package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FlutterInitializationStatus */
class t {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, o> f34130a;

    t(Map<String, o> map) {
        this.f34130a = map;
    }

    t(InitializationStatus initializationStatus) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : initializationStatus.getAdapterStatusMap().entrySet()) {
            hashMap.put((String) next.getKey(), new o((AdapterStatus) next.getValue()));
        }
        this.f34130a = hashMap;
    }
}
