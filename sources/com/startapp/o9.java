package com.startapp;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* compiled from: Sta */
public class o9 {

    /* renamed from: a  reason: collision with root package name */
    public final Node f16230a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16231b = true;

    public o9(Node node) {
        this.f16230a = node;
    }

    public final List<o9> a(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) bb.a(this.f16230a, str, str2, list)).iterator();
        while (it.hasNext()) {
            arrayList.add(new o9((Node) it.next()));
        }
        return arrayList;
    }

    public final o9 b(String str, String str2, List<String> list) {
        ArrayList arrayList = (ArrayList) bb.a(this.f16230a, str, str2, (List<String>) null);
        Node node = arrayList.isEmpty() ? null : (Node) arrayList.get(0);
        if (node != null) {
            return new o9(node);
        }
        return null;
    }

    public final List<String> c(String str) {
        List<o9> a10 = a(str, (String) null, (List<String>) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) a10).iterator();
        while (it.hasNext()) {
            String d10 = ((o9) it.next()).d();
            if (!TextUtils.isEmpty(d10)) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public final String d() {
        Node node = this.f16230a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    public List<String> e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) d(str)).iterator();
        while (it.hasNext()) {
            String d10 = ((o9) it.next()).d();
            if (!TextUtils.isEmpty(d10)) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public final String f(String str) {
        o9 b10 = b(str, (String) null, (List<String>) null);
        if (b10 == null) {
            return null;
        }
        return b10.d();
    }

    public o9(String str) throws ParserConfigurationException, SAXException, IOException {
        String replaceFirst = str.replaceFirst("<\\?.*\\?>", MaxReward.DEFAULT_LABEL);
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        newInstance.setExpandEntityReferences(false);
        this.f16230a = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst))).getFirstChild();
    }

    public final List<o9> d(String str) {
        return a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    public final List<o9> a(String str, String str2, String str3, List<String> list) {
        ArrayList arrayList = new ArrayList();
        o9 b10 = b(str2, (String) null, (List<String>) null);
        if (b10 == null) {
            return arrayList;
        }
        return b10.a(str, str3, list);
    }

    public final Integer b(String str) {
        try {
            String a10 = a(str);
            if (a10 != null) {
                return Integer.valueOf(Integer.parseInt(a10));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final List<String> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) a(str, str2, (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            String d10 = ((o9) it.next()).d();
            if (!TextUtils.isEmpty(d10)) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public List<o9> c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) a("Creative", "Creatives", (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            o9 b10 = ((o9) it.next()).b("Linear", (String) null, (List<String>) null);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    public final String a(String str) {
        Node namedItem = this.f16230a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public final String a(String str, String str2) {
        o9 b10;
        o9 b11 = b(str2, (String) null, (List<String>) null);
        if (b11 == null || (b10 = b11.b(str, (String) null, (List<String>) null)) == null) {
            return null;
        }
        return b10.d();
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) d("creativeView")).iterator();
        while (it.hasNext()) {
            String d10 = ((o9) it.next()).d();
            if (!TextUtils.isEmpty(d10)) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public List<o9> a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) a("Creative", "Creatives", (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((o9) it.next()).a("Companion", "CompanionAds", (String) null, (List<String>) null));
        }
        return arrayList;
    }
}
