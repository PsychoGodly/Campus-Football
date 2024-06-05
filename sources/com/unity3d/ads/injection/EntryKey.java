package com.unity3d.ads.injection;

import com.applovin.mediation.MaxReward;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import le.c;

/* compiled from: EntryKey.kt */
public final class EntryKey {
    private final c<?> instanceClass;
    private final String named;

    public EntryKey(String str, c<?> cVar) {
        m.e(str, "named");
        m.e(cVar, "instanceClass");
        this.named = str;
        this.instanceClass = cVar;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, c<?> cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i10 & 2) != 0) {
            cVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c<?> component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String str, c<?> cVar) {
        m.e(str, "named");
        m.e(cVar, "instanceClass");
        return new EntryKey(str, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return m.a(this.named, entryKey.named) && m.a(this.instanceClass, entryKey.instanceClass);
    }

    public final c<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntryKey(String str, c cVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? MaxReward.DEFAULT_LABEL : str, cVar);
    }
}
