package com.startapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.Map;

/* compiled from: Sta */
public class a7 extends f7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15607a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f15608b;

    public a7(String str, Map<String, String> map) {
        this.f15607a = str;
        this.f15608b = map;
    }

    public boolean a(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.first != this) {
            return false;
        }
        Object obj2 = pair.second;
        if (!(obj2 instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) obj2;
        if (!this.f15607a.equals(intent.getAction())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        for (Map.Entry next : this.f15608b.entrySet()) {
            if (!((String) next.getValue()).equals(String.valueOf(extras.get((String) next.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
