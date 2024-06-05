package com.unity3d.ads.injection;

import com.applovin.mediation.MaxReward;
import fe.a;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import sd.g;
import sd.s;
import se.k0;
import se.v;

/* compiled from: Registry.kt */
public final class Registry {
    private final v<Map<EntryKey, g<?>>> _services = k0.a(k0.g());

    public static /* synthetic */ EntryKey factory$default(Registry registry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        EntryKey entryKey = new EntryKey(str, a0.b(Object.class));
        registry.add(entryKey, new Factory(aVar));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.j(4, "T");
        EntryKey entryKey = new EntryKey(str, a0.b(Object.class));
        g gVar = registry.getServices().get(entryKey);
        if (gVar != null) {
            Object value = gVar.getValue();
            m.j(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.j(4, "T");
        g gVar = registry.getServices().get(new EntryKey(str, a0.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        Object value = gVar.getValue();
        m.j(1, "T");
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MaxReward.DEFAULT_LABEL;
        }
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        EntryKey entryKey = new EntryKey(str, a0.b(Object.class));
        registry.add(entryKey, i.a(aVar));
        return entryKey;
    }

    public final <T> void add(EntryKey entryKey, g<? extends T> gVar) {
        Map<EntryKey, g<?>> value;
        m.e(entryKey, "key");
        m.e(gVar, "instance");
        if (!getServices().containsKey(entryKey)) {
            v<Map<EntryKey, g<?>>> vVar = this._services;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, k0.n(value, j0.e(s.a(entryKey, gVar)))));
            return;
        }
        throw new IllegalStateException("Cannot have identical entries.".toString());
    }

    public final /* synthetic */ <T> EntryKey factory(String str, a<? extends T> aVar) {
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        EntryKey entryKey = new EntryKey(str, a0.b(Object.class));
        add(entryKey, new Factory(aVar));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String str) {
        m.e(str, "named");
        m.j(4, "T");
        EntryKey entryKey = new EntryKey(str, a0.b(Object.class));
        g gVar = getServices().get(entryKey);
        if (gVar != null) {
            T value = gVar.getValue();
            m.j(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String str) {
        m.e(str, "named");
        m.j(4, "T");
        g gVar = getServices().get(new EntryKey(str, a0.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        T value = gVar.getValue();
        m.j(1, "T");
        return value;
    }

    public final Map<EntryKey, g<?>> getServices() {
        return this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String str, a<? extends T> aVar) {
        m.e(str, "named");
        m.e(aVar, "instance");
        m.j(4, "T");
        EntryKey entryKey = new EntryKey(str, a0.b(Object.class));
        add(entryKey, i.a(aVar));
        return entryKey;
    }
}
