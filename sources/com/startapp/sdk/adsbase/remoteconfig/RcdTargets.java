package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import androidx.annotation.Keep;
import com.applovin.mediation.MaxReward;
import com.startapp.d9;
import com.startapp.e9;
import com.startapp.j9;
import com.startapp.sdk.common.utils.Pair;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: Sta */
public class RcdTargets implements Serializable {
    private static final long serialVersionUID = 6963217195144137950L;
    @d9
    private final SortedMap<String, Pair<Integer, String>> nameToScopesIds;
    @d9
    private final SortedMap<Integer, SortedMap<String, String>> scopeToNamesIds;

    @Keep
    /* compiled from: Sta */
    public static class Parser implements e9<RcdTargets> {
        private static void add(String str, String str2, int i10, SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
            if (str2.length() >= 1) {
                String replaceAll = str2.replaceAll("~", ".");
                sortedMap.put(replaceAll, new Pair(Integer.valueOf(i10), str));
                for (int i11 = 0; i11 < 16; i11++) {
                    int i12 = 1 << i11;
                    if ((i10 & i12) == i12) {
                        SortedMap sortedMap3 = (SortedMap) sortedMap2.get(Integer.valueOf(i12));
                        if (sortedMap3 == null) {
                            sortedMap3 = new TreeMap();
                            sortedMap2.put(Integer.valueOf(i12), sortedMap3);
                        }
                        sortedMap3.put(replaceAll, str);
                    }
                }
            }
        }

        public static void parseRec(String str, String str2, JSONObject jSONObject, SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.equals("~")) {
                        add(str, str2, jSONObject.optInt(next), sortedMap, sortedMap2);
                    } else if (next.endsWith("~") && (jSONObject.opt(next) instanceof JSONObject)) {
                        parseRec(str, str2 + next, jSONObject.optJSONObject(next), sortedMap, sortedMap2);
                    } else if (next.length() > 0) {
                        add(str, str2 + next, jSONObject.optInt(next), sortedMap, sortedMap2);
                    }
                }
            }
        }

        public RcdTargets parse(Class<RcdTargets> cls, Object obj) {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                parseRec(next, MaxReward.DEFAULT_LABEL, jSONObject.optJSONObject(next), treeMap, treeMap2);
            }
            return new RcdTargets(treeMap, treeMap2);
        }
    }

    public RcdTargets(SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
        this.nameToScopesIds = sortedMap;
        this.scopeToNamesIds = sortedMap2;
    }

    public Collection<String> a(int i10) {
        SortedMap sortedMap = (SortedMap) this.scopeToNamesIds.get(Integer.valueOf(i10));
        return sortedMap != null ? Collections.unmodifiableCollection(sortedMap.keySet()) : Collections.emptyList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RcdTargets rcdTargets = (RcdTargets) obj;
        if (!j9.a(this.nameToScopesIds, rcdTargets.nameToScopesIds) || !j9.a(this.scopeToNamesIds, rcdTargets.scopeToNamesIds)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.nameToScopesIds, this.scopeToNamesIds};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public String a(Map<String, Integer> map) {
        Pair pair;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Integer num = (Integer) next.getValue();
            if (!(str == null || num == null || (pair = (Pair) this.nameToScopesIds.get(str)) == null)) {
                String str2 = (String) pair.second;
                Integer num2 = (Integer) treeMap.get(str2);
                if (num2 == null) {
                    num2 = 0;
                }
                treeMap.put(str2, Integer.valueOf(num.intValue() | num2.intValue()));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            sb2.append(':');
            sb2.append((String) entry.getKey());
            sb2.append(':');
            int intValue = ((Integer) entry.getValue()).intValue();
            int i10 = 1;
            boolean z10 = (57344 & intValue) != 0;
            boolean z11 = (intValue & 7680) != 0;
            if (z10 && z11) {
                i10 = 6;
            } else if (z10) {
                i10 = 5;
            } else if (z11) {
                i10 = 4;
            } else if ((intValue & 256) != 0) {
                i10 = 3;
            } else if ((intValue & 172) != 0) {
                i10 = 2;
            } else if ((intValue & 83) == 0) {
                i10 = 0;
            }
            sb2.append(i10);
        }
        if (sb2.length() > 0) {
            sb2.append(':');
        }
        return sb2.toString();
    }
}
