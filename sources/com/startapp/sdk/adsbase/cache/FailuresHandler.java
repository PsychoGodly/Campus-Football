package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = -4588601967418450964L;
    private boolean infiniteLastRetry = true;
    @d9(type = ArrayList.class, value = Integer.class)
    private List<Integer> intervals = Arrays.asList(new Integer[]{10, 30, 60, 300});

    public List<Integer> a() {
        return this.intervals;
    }

    public boolean b() {
        return this.infiniteLastRetry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailuresHandler failuresHandler = (FailuresHandler) obj;
        if (this.infiniteLastRetry != failuresHandler.infiniteLastRetry || !j9.a(this.intervals, failuresHandler.intervals)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.intervals, Boolean.valueOf(this.infiniteLastRetry)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
