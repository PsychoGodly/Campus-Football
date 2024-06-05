package com.startapp;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class x9 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BloomVersion, w9> f17539a;

    public x9() {
        HashMap hashMap = new HashMap();
        this.f17539a = hashMap;
        hashMap.put(BloomVersion.ZERO, new ba());
        hashMap.put(BloomVersion.THREE, new aa());
        hashMap.put(BloomVersion.FOUR, new z9());
        hashMap.put(BloomVersion.FIVE, new y9());
    }
}
