package com.startapp;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class h9<T> implements e9<List<T>> {
    private static final String LOG_TAG = "h9";
    private final Class<T> itemClass;

    /* compiled from: Sta */
    public class a implements g2<Integer, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f15903a;

        public a(h9 h9Var, Object obj) {
            this.f15903a = obj;
        }

        public Object a(Object obj) {
            try {
                return ((JSONArray) this.f15903a).getJSONObject(((Integer) obj).intValue());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements g2<Integer, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f15904a;

        public b(h9 h9Var, Object obj) {
            this.f15904a = obj;
        }

        public Object a(Object obj) {
            try {
                return ((JSONObject) this.f15904a).getJSONObject(((Integer) obj).toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public h9(Class<T> cls) {
        this.itemClass = cls;
    }

    public List<T> parse(Class<List<T>> cls, Object obj) {
        int i10;
        g2 g2Var;
        if (obj instanceof JSONArray) {
            i10 = ((JSONArray) obj).length();
            g2Var = new a(this, obj);
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            i10 = ((JSONObject) obj).length();
            g2Var = new b(this, obj);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                arrayList.add(e4.a(this.itemClass, (JSONObject) g2Var.a(Integer.valueOf(i11))));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
