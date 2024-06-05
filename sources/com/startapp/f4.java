package com.startapp;

import java.util.Comparator;
import org.json.JSONObject;

/* compiled from: Sta */
public class f4 implements Comparator<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final String f15817a;

    public f4(String str) {
        this.f15817a = str;
    }

    public int compare(Object obj, Object obj2) {
        Object opt = ((JSONObject) obj).opt(this.f15817a);
        Object opt2 = ((JSONObject) obj2).opt(this.f15817a);
        if ((opt instanceof Comparable) && (opt2 instanceof Comparable)) {
            if (opt.getClass() == opt2.getClass()) {
                return ((Comparable) opt).compareTo(opt2);
            }
            if ((opt instanceof Number) && (opt2 instanceof Number)) {
                return Double.compare(((Number) opt).doubleValue(), ((Number) opt2).doubleValue());
            }
        }
        Object obj3 = JSONObject.NULL;
        if (opt == obj3) {
            opt = null;
        }
        if (opt2 == obj3) {
            opt2 = null;
        }
        if (opt != null && opt2 != null) {
            return opt.toString().compareTo(opt2.toString());
        }
        if (opt != null) {
            return 1;
        }
        return opt2 != null ? -1 : 0;
    }
}
