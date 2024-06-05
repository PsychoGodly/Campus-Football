package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class gs {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t f8141a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Stack f8142b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public StringBuilder f8143c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f8144d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public b f8145e;

    class a implements ContentHandler {
        a() {
        }

        public void characters(char[] cArr, int i10, int i11) {
            String trim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(trim)) {
                gs.this.f8143c.append(trim);
            }
        }

        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - gs.this.f8144d;
            t unused = gs.this.f8141a;
            if (t.a()) {
                t a10 = gs.this.f8141a;
                a10.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        public void endElement(String str, String str2, String str3) {
            gs gsVar = gs.this;
            b unused = gsVar.f8145e = (b) gsVar.f8142b.pop();
            gs.this.f8145e.d(gs.this.f8143c.toString().trim());
            gs.this.f8143c.setLength(0);
        }

        public void endPrefixMapping(String str) {
        }

        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        }

        public void processingInstruction(String str, String str2) {
        }

        public void setDocumentLocator(Locator locator) {
        }

        public void skippedEntity(String str) {
        }

        public void startDocument() {
            t unused = gs.this.f8141a;
            if (t.a()) {
                gs.this.f8141a.a("XmlParser", "Begin parsing...");
            }
            long unused2 = gs.this.f8144d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            try {
                b bVar = !gs.this.f8142b.isEmpty() ? (b) gs.this.f8142b.peek() : null;
                b bVar2 = new b(str2, gs.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                gs.this.f8142b.push(bVar2);
            } catch (Exception e10) {
                t unused = gs.this.f8141a;
                if (t.a()) {
                    t a10 = gs.this.f8141a;
                    a10.a("XmlParser", "Unable to process element <" + str2 + ">", e10);
                }
                throw new SAXException("Failed to start element", e10);
            }
        }

        public void startPrefixMapping(String str, String str2) {
        }
    }

    private static class b extends fs {
        b(String str, Map map, fs fsVar) {
            super(str, map, fsVar);
        }

        /* access modifiers changed from: package-private */
        public void a(fs fsVar) {
            if (fsVar != null) {
                this.f7862e.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        /* access modifiers changed from: package-private */
        public void d(String str) {
            this.f7861d = str;
        }
    }

    gs(k kVar) {
        if (kVar != null) {
            this.f8141a = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap hashMap = new HashMap(length);
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(attributes.getQName(i10), attributes.getValue(i10));
        }
        return hashMap;
    }

    public fs a(String str) {
        if (str != null) {
            this.f8143c = new StringBuilder();
            this.f8142b = new Stack();
            this.f8145e = null;
            Xml.parse(str, new a());
            b bVar = this.f8145e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    public static fs a(String str, k kVar) {
        return new gs(kVar).a(str);
    }
}
