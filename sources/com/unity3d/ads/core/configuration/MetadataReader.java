package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.m;

/* compiled from: MetadataReader.kt */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage2, String str) {
        m.e(jsonStorage2, "jsonStorage");
        m.e(str, "key");
        this.jsonStorage = jsonStorage2;
        this.key = str;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T t10) {
        T t11 = getJsonStorage().get(getKey());
        if (t11 == null) {
            return t10;
        }
        m.j(3, "T");
        return t11;
    }

    public final /* synthetic */ <T> T readAndDelete(T t10) {
        T t11 = getJsonStorage().get(getKey());
        if (t11 != null) {
            m.d(t11, "get(key)");
            m.j(3, "T");
            t10 = t11;
        }
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            m.d(obj, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t10;
    }
}
