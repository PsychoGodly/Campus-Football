package com.applovin.impl;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class fs {

    /* renamed from: f  reason: collision with root package name */
    public static final fs f7857f = new fs();

    /* renamed from: a  reason: collision with root package name */
    private final fs f7858a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7859b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f7860c;

    /* renamed from: d  reason: collision with root package name */
    protected String f7861d;

    /* renamed from: e  reason: collision with root package name */
    protected final List f7862e;

    private fs() {
        this.f7858a = null;
        this.f7859b = MaxReward.DEFAULT_LABEL;
        this.f7860c = Collections.emptyMap();
        this.f7861d = MaxReward.DEFAULT_LABEL;
        this.f7862e = Collections.emptyList();
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f7862e.size());
            for (fs fsVar : this.f7862e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    arrayList.add(fsVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public List b() {
        return Collections.unmodifiableList(this.f7862e);
    }

    public String c() {
        return this.f7859b;
    }

    public String d() {
        return this.f7861d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f7859b + '\'' + ", text='" + this.f7861d + '\'' + ", attributes=" + this.f7860c + '}';
    }

    public fs b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        } else if (this.f7862e.size() <= 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                fs fsVar = (fs) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
                arrayList.addAll(fsVar.b());
            }
            return null;
        }
    }

    public fs c(String str) {
        if (str != null) {
            for (fs fsVar : this.f7862e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map a() {
        return this.f7860c;
    }

    public fs(String str, Map map, fs fsVar) {
        this.f7858a = fsVar;
        this.f7859b = str;
        this.f7860c = Collections.unmodifiableMap(map);
        this.f7862e = new ArrayList();
    }
}
