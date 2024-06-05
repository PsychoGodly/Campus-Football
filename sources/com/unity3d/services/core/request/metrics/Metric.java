package com.unity3d.services.core.request.metrics;

import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: Metric.kt */
public final class Metric {
    public static final Companion Companion = new Companion((h) null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    /* compiled from: Metric.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Metric(String str) {
        this(str, (Object) null, (Map) null, 6, (h) null);
    }

    public Metric(String str, Object obj) {
        this(str, obj, (Map) null, 4, (h) null);
    }

    public Metric(String str, Object obj, Map<String, String> map) {
        m.e(map, "tags");
        this.name = str;
        this.value = obj;
        this.tags = map;
    }

    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map<String, String> map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = metric.name;
        }
        if ((i10 & 2) != 0) {
            obj = metric.value;
        }
        if ((i10 & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map<String, String> map) {
        m.e(map, "tags");
        return new Metric(str, obj, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return m.a(this.name, metric.name) && m.a(this.value, metric.value) && m.a(this.tags, metric.tags);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return ((hashCode + i10) * 31) + this.tags.hashCode();
    }

    public final Map<String, Object> toMap() {
        Map c10 = j0.c();
        String str = this.name;
        if (str != null) {
            c10.put(METRIC_NAME, str);
        }
        Object obj = this.value;
        if (obj != null) {
            c10.put(METRIC_VALUE, obj);
        }
        if (!this.tags.isEmpty()) {
            c10.put(METRIC_TAGS, this.tags);
        }
        return j0.b(c10);
    }

    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Metric(String str, Object obj, Map map, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? k0.g() : map);
    }
}
