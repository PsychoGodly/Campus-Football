package com.startapp.sdk.common.utils;

import android.app.Activity;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class Pair<F, S> implements Serializable {
    private static final long serialVersionUID = 1680587643219848112L;
    public final F first;
    public final S second;

    public Pair(F f10, S s10) {
        this.first = f10;
        this.second = s10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!j9.a(this.first, pair.first) || !j9.a(this.second, pair.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.first, this.second};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        return super.toString();
    }
}
