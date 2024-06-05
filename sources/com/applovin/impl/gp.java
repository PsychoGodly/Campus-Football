package com.applovin.impl;

import android.text.Layout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class gp extends bk {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f8084p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f8085q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f8086r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s  reason: collision with root package name */
    static final Pattern f8087s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    static final Pattern f8088t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f8089u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f8090v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w  reason: collision with root package name */
    private static final b f8091w = new b(30.0f, 1, 1);

    /* renamed from: x  reason: collision with root package name */
    private static final a f8092x = new a(32, 15);

    /* renamed from: o  reason: collision with root package name */
    private final XmlPullParserFactory f8093o;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f8094a;

        /* renamed from: b  reason: collision with root package name */
        final int f8095b;

        a(int i10, int i11) {
            this.f8094a = i10;
            this.f8095b = i11;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final float f8096a;

        /* renamed from: b  reason: collision with root package name */
        final int f8097b;

        /* renamed from: c  reason: collision with root package name */
        final int f8098c;

        b(float f10, int i10, int i11) {
            this.f8096a = f10;
            this.f8097b = i10;
            this.f8098c = i11;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        final int f8099a;

        /* renamed from: b  reason: collision with root package name */
        final int f8100b;

        c(int i10, int i11) {
            this.f8099a = i10;
            this.f8100b = i11;
        }
    }

    public gp() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f8093o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static kp a(kp kpVar) {
        return kpVar == null ? new kp() : kpVar;
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static float c(String str) {
        Matcher matcher = f8087s.matcher(str);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) a1.a((Object) matcher.group(1)))));
        } catch (NumberFormatException e10) {
            kc.c("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    private static String[] d(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : yp.a(trim, "\\s+");
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f8093o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(MaxReward.DEFAULT_LABEL, new ip(MaxReward.DEFAULT_LABEL));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f8091w;
            a aVar = f8092x;
            lp lpVar = null;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                hp hpVar = (hp) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = a(newPullParser);
                            aVar = a(newPullParser, f8092x);
                            cVar = b(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!a(name)) {
                            kc.c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            bVar = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                a(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    hp a10 = a(newPullParser, hpVar, hashMap2, bVar);
                                    arrayDeque.push(a10);
                                    if (hpVar != null) {
                                        hpVar.a(a10);
                                    }
                                } catch (ml e10) {
                                    kc.c("TtmlDecoder", "Suppressing parser error", e10);
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((hp) a1.a((Object) hpVar)).a(hp.a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            lpVar = new lp((hp) a1.a((Object) (hp) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else if (eventType != 2) {
                    if (eventType == 3) {
                        i11--;
                    }
                    newPullParser.next();
                }
                i11++;
                newPullParser.next();
            }
            if (lpVar != null) {
                return lpVar;
            }
            throw new ml("No TTML subtitles found");
        } catch (XmlPullParserException e11) {
            throw new ml("Unable to decode source", e11);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        }
    }

    private static c b(XmlPullParser xmlPullParser) {
        String a10 = hs.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f8089u.matcher(a10);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring non-pixel tts extent: " + a10);
            return null;
        }
        try {
            return new c(Integer.parseInt((String) a1.a((Object) matcher.group(1))), Integer.parseInt((String) a1.a((Object) matcher.group(2))));
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed tts extent: " + a10);
            return null;
        }
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(JsonStorageKeyNames.DATA_KEY) || str.equals("information");
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f8090v.matcher(attributeValue);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) a1.a((Object) matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) a1.a((Object) matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new ml("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void a(String str, kp kpVar) {
        Matcher matcher;
        String[] a10 = yp.a(str, "\\s+");
        if (a10.length == 1) {
            matcher = f8086r.matcher(str);
        } else if (a10.length == 2) {
            matcher = f8086r.matcher(a10[1]);
            kc.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new ml("Invalid number of entries for fontSize: " + a10.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) a1.a((Object) matcher.group(3));
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    kpVar.c(3);
                    break;
                case 1:
                    kpVar.c(2);
                    break;
                case 2:
                    kpVar.c(1);
                    break;
                default:
                    throw new ml("Invalid unit for fontSize: '" + str2 + "'.");
            }
            kpVar.a(Float.parseFloat((String) a1.a((Object) matcher.group(1))));
            return;
        }
        throw new ml("Invalid expression for fontSize: '" + str + "'.");
    }

    private static b a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] a10 = yp.a(attributeValue2, " ");
            if (a10.length == 2) {
                f10 = ((float) Integer.parseInt(a10[0])) / ((float) Integer.parseInt(a10[1]));
            } else {
                throw new ml("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = f8091w;
        int i10 = bVar.f8097b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f8098c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f10, i10, i11);
    }

    private static Map a(XmlPullParser xmlPullParser, Map map, a aVar, c cVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, "style")) {
                String a10 = hs.a(xmlPullParser, "style");
                kp a11 = a(xmlPullParser, new kp());
                if (a10 != null) {
                    for (String str : d(a10)) {
                        a11.a((kp) map.get(str));
                    }
                }
                String f10 = a11.f();
                if (f10 != null) {
                    map.put(f10, a11);
                }
            } else if (hs.c(xmlPullParser, "region")) {
                ip a12 = a(xmlPullParser, aVar, cVar);
                if (a12 != null) {
                    map2.put(a12.f8577a, a12);
                }
            } else if (hs.c(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!hs.b(xmlPullParser, "head"));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map map) {
        String a10;
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, "image") && (a10 = hs.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!hs.b(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.hp a(org.xmlpull.v1.XmlPullParser r19, com.applovin.impl.hp r20, java.util.Map r21, com.applovin.impl.gp.b r22) {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            com.applovin.impl.kp r5 = a((org.xmlpull.v1.XmlPullParser) r0, (com.applovin.impl.kp) r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00b4
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            r4.hashCode()
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0071;
                case 99841: goto L_0x0066;
                case 100571: goto L_0x005b;
                case 93616297: goto L_0x0050;
                case 109780401: goto L_0x0045;
                case 1292595405: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            r7 = -1
            goto L_0x007b
        L_0x003a:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            r7 = 5
            goto L_0x007b
        L_0x0045:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x004e
            goto L_0x0038
        L_0x004e:
            r7 = 4
            goto L_0x007b
        L_0x0050:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0059
            goto L_0x0038
        L_0x0059:
            r7 = 3
            goto L_0x007b
        L_0x005b:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0064
            goto L_0x0038
        L_0x0064:
            r7 = 2
            goto L_0x007b
        L_0x0066:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x006f
            goto L_0x0038
        L_0x006f:
            r7 = 1
            goto L_0x007b
        L_0x0071:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x007a
            goto L_0x0038
        L_0x007a:
            r7 = 0
        L_0x007b:
            switch(r7) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00a0;
                case 2: goto L_0x009b;
                case 3: goto L_0x0096;
                case 4: goto L_0x008d;
                case 5: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00a4
        L_0x007f:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x00a4
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
            goto L_0x00a4
        L_0x008d:
            java.lang.String[] r4 = d(r6)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x00a4
            r8 = r4
            goto L_0x00a4
        L_0x0096:
            long r12 = a((java.lang.String) r6, (com.applovin.impl.gp.b) r1)
            goto L_0x00a4
        L_0x009b:
            long r14 = a((java.lang.String) r6, (com.applovin.impl.gp.b) r1)
            goto L_0x00a4
        L_0x00a0:
            long r16 = a((java.lang.String) r6, (com.applovin.impl.gp.b) r1)
        L_0x00a4:
            r4 = r21
            goto L_0x00b0
        L_0x00a7:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00b0
            r10 = r6
        L_0x00b0:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00b4:
            if (r9 == 0) goto L_0x00cc
            long r1 = r9.f8347d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00c6
            long r12 = r12 + r1
        L_0x00c6:
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            long r14 = r14 + r1
            goto L_0x00d1
        L_0x00cc:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00d1:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00e9
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00df
            long r16 = r1 + r16
            r3 = r16
            goto L_0x00ea
        L_0x00df:
            if (r9 == 0) goto L_0x00e9
            long r6 = r9.f8348e
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00e9
            r3 = r6
            goto L_0x00ea
        L_0x00e9:
            r3 = r14
        L_0x00ea:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            com.applovin.impl.hp r0 = com.applovin.impl.hp.a(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.hp, java.util.Map, com.applovin.impl.gp$b):com.applovin.impl.hp");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ab, code lost:
        if (r0.equals("tb") == false) goto L_0x018d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.ip a(org.xmlpull.v1.XmlPullParser r17, com.applovin.impl.gp.a r18, com.applovin.impl.gp.c r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = com.applovin.impl.hs.a(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = com.applovin.impl.hs.a(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x021a
            java.util.regex.Pattern r6 = f8088t
            java.util.regex.Matcher r7 = r6.matcher(r3)
            java.util.regex.Pattern r8 = f8089u
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L_0x0069
            java.lang.String r9 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r9 = com.applovin.impl.a1.a((java.lang.Object) r9)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = com.applovin.impl.a1.a((java.lang.Object) r7)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = r7 / r13
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x00aa
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x0069:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L_0x0205
            if (r1 != 0) goto L_0x0084
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x0084:
            java.lang.String r7 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.Object r7 = com.applovin.impl.a1.a((java.lang.Object) r7)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x01f2 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.String r9 = r9.group(r14)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.Object r9 = com.applovin.impl.a1.a((java.lang.Object) r9)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01f2 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01f2 }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x01f2 }
            int r10 = r1.f8099a     // Catch:{ NumberFormatException -> 0x01f2 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01f2 }
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01f2 }
            int r10 = r1.f8100b     // Catch:{ NumberFormatException -> 0x01f2 }
            float r10 = (float) r10
            float r9 = r9 / r10
        L_0x00aa:
            java.lang.String r10 = "extent"
            java.lang.String r10 = com.applovin.impl.hs.a(r0, r10)
            if (r10 == 0) goto L_0x01ec
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L_0x00f5
            java.lang.String r1 = r6.group(r15)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r1 = com.applovin.impl.a1.a((java.lang.Object) r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = r1 / r13
            java.lang.String r6 = r6.group(r14)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r6 = com.applovin.impl.a1.a((java.lang.Object) r6)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00e2 }
            float r2 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r2 = r2 / r13
            r10 = r2
            goto L_0x0138
        L_0x00e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x00f5:
            boolean r6 = r8.matches()
            if (r6 == 0) goto L_0x01d7
            if (r1 != 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x0110:
            java.lang.String r6 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x01c4 }
            java.lang.Object r6 = com.applovin.impl.a1.a((java.lang.Object) r6)     // Catch:{ NumberFormatException -> 0x01c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x01c4 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01c4 }
            java.lang.String r8 = r8.group(r14)     // Catch:{ NumberFormatException -> 0x01c4 }
            java.lang.Object r8 = com.applovin.impl.a1.a((java.lang.Object) r8)     // Catch:{ NumberFormatException -> 0x01c4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01c4 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01c4 }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x01c4 }
            int r10 = r1.f8099a     // Catch:{ NumberFormatException -> 0x01c4 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01c4 }
            float r6 = r6 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01c4 }
            int r1 = r1.f8100b     // Catch:{ NumberFormatException -> 0x01c4 }
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = r6
            r10 = r8
        L_0x0138:
            java.lang.String r2 = "displayAlign"
            java.lang.String r2 = com.applovin.impl.hs.a(r0, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0169
            java.lang.String r2 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r2)
            r2.hashCode()
            java.lang.String r5 = "center"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x015f
            java.lang.String r5 = "after"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0159
            goto L_0x0169
        L_0x0159:
            float r9 = r9 + r10
            r2 = r18
            r6 = r9
            r8 = 2
            goto L_0x016d
        L_0x015f:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r2
            float r9 = r9 + r2
            r2 = r18
            r6 = r9
            r8 = 1
            goto L_0x016d
        L_0x0169:
            r2 = r18
            r6 = r9
            r8 = 0
        L_0x016d:
            int r2 = r2.f8095b
            float r2 = (float) r2
            r5 = 1065353216(0x3f800000, float:1.0)
            float r12 = r5 / r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = "writingMode"
            java.lang.String r0 = com.applovin.impl.hs.a(r0, r5)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r0)
            r0.hashCode()
            r5 = -1
            int r9 = r0.hashCode()
            switch(r9) {
                case 3694: goto L_0x01a5;
                case 3553396: goto L_0x019a;
                case 3553576: goto L_0x018f;
                default: goto L_0x018d;
            }
        L_0x018d:
            r3 = -1
            goto L_0x01ae
        L_0x018f:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0198
            goto L_0x018d
        L_0x0198:
            r3 = 2
            goto L_0x01ae
        L_0x019a:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01a3
            goto L_0x018d
        L_0x01a3:
            r3 = 1
            goto L_0x01ae
        L_0x01a5:
            java.lang.String r9 = "tb"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01ae
            goto L_0x018d
        L_0x01ae:
            switch(r3) {
                case 0: goto L_0x01b4;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01b2;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            goto L_0x01b6
        L_0x01b2:
            r13 = 1
            goto L_0x01b8
        L_0x01b4:
            r13 = 2
            goto L_0x01b8
        L_0x01b6:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01b8:
            com.applovin.impl.ip r0 = new com.applovin.impl.ip
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r7
            r7 = r2
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01c4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x01d7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x01ec:
            java.lang.String r0 = "Ignoring region without an extent"
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x01f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x0205:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.d(r5, r0)
            return r2
        L_0x021a:
            java.lang.String r0 = "Ignoring region without an origin"
            com.applovin.impl.kc.d(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.gp$a, com.applovin.impl.gp$c):com.applovin.impl.ip");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e0, code lost:
        if (r3.equals("text") == false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.kp a(org.xmlpull.v1.XmlPullParser r12, com.applovin.impl.kp r13) {
        /*
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x02f6
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00cf;
                case -1224696685: goto L_0x00c3;
                case -1065511464: goto L_0x00b7;
                case -879295043: goto L_0x00ab;
                case -734428249: goto L_0x009f;
                case 3355: goto L_0x0094;
                case 3511770: goto L_0x0089;
                case 94842723: goto L_0x007e;
                case 109403361: goto L_0x0071;
                case 110138194: goto L_0x0064;
                case 365601008: goto L_0x0057;
                case 921125321: goto L_0x004a;
                case 1115953443: goto L_0x003d;
                case 1287124693: goto L_0x0030;
                case 1754920356: goto L_0x0023;
                default: goto L_0x0020;
            }
        L_0x0020:
            r4 = -1
            goto L_0x00da
        L_0x0023:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002c
            goto L_0x0020
        L_0x002c:
            r4 = 14
            goto L_0x00da
        L_0x0030:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0039
            goto L_0x0020
        L_0x0039:
            r4 = 13
            goto L_0x00da
        L_0x003d:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0046
            goto L_0x0020
        L_0x0046:
            r4 = 12
            goto L_0x00da
        L_0x004a:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            r4 = 11
            goto L_0x00da
        L_0x0057:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0060
            goto L_0x0020
        L_0x0060:
            r4 = 10
            goto L_0x00da
        L_0x0064:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006d
            goto L_0x0020
        L_0x006d:
            r4 = 9
            goto L_0x00da
        L_0x0071:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x0020
        L_0x007a:
            r4 = 8
            goto L_0x00da
        L_0x007e:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0087
            goto L_0x0020
        L_0x0087:
            r4 = 7
            goto L_0x00da
        L_0x0089:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0092
            goto L_0x0020
        L_0x0092:
            r4 = 6
            goto L_0x00da
        L_0x0094:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009d
            goto L_0x0020
        L_0x009d:
            r4 = 5
            goto L_0x00da
        L_0x009f:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00a9
            goto L_0x0020
        L_0x00a9:
            r4 = 4
            goto L_0x00da
        L_0x00ab:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b5
            goto L_0x0020
        L_0x00b5:
            r4 = 3
            goto L_0x00da
        L_0x00b7:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00c1
            goto L_0x0020
        L_0x00c1:
            r4 = 2
            goto L_0x00da
        L_0x00c3:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00cd
            goto L_0x0020
        L_0x00cd:
            r4 = 1
            goto L_0x00da
        L_0x00cf:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00d9
            goto L_0x0020
        L_0x00d9:
            r4 = 0
        L_0x00da:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x02e4;
                case 1: goto L_0x02db;
                case 2: goto L_0x02ce;
                case 3: goto L_0x026c;
                case 4: goto L_0x025c;
                case 5: goto L_0x0246;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01a7;
                case 8: goto L_0x0199;
                case 9: goto L_0x016c;
                case 10: goto L_0x014d;
                case 11: goto L_0x013f;
                case 12: goto L_0x0112;
                case 13: goto L_0x00ef;
                case 14: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x02f2
        L_0x00e1:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            android.text.Layout$Alignment r3 = b((java.lang.String) r3)
            com.applovin.impl.kp r13 = r13.a((android.text.Layout.Alignment) r3)
            goto L_0x02f2
        L_0x00ef:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            int r4 = com.applovin.impl.q3.b(r3)     // Catch:{ IllegalArgumentException -> 0x00fc }
            r13.a((int) r4)     // Catch:{ IllegalArgumentException -> 0x00fc }
            goto L_0x02f2
        L_0x00fc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.applovin.impl.kc.d(r5, r3)
            goto L_0x02f2
        L_0x0112:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            r3.hashCode()
            java.lang.String r4 = "before"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0135
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            goto L_0x02f2
        L_0x012b:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.d((int) r10)
            goto L_0x02f2
        L_0x0135:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.d((int) r11)
            goto L_0x02f2
        L_0x013f:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.yn r3 = com.applovin.impl.yn.a((java.lang.String) r3)
            com.applovin.impl.kp r13 = r13.a((com.applovin.impl.yn) r3)
            goto L_0x02f2
        L_0x014d:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)     // Catch:{ ml -> 0x0156 }
            a((java.lang.String) r3, (com.applovin.impl.kp) r13)     // Catch:{ ml -> 0x0156 }
            goto L_0x02f2
        L_0x0156:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.applovin.impl.kc.d(r5, r3)
            goto L_0x02f2
        L_0x016c:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            r3.hashCode()
            java.lang.String r4 = "all"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x018f
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0185
            goto L_0x02f2
        L_0x0185:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.d((boolean) r1)
            goto L_0x02f2
        L_0x018f:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.d((boolean) r11)
            goto L_0x02f2
        L_0x0199:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            float r3 = c(r3)
            com.applovin.impl.kp r13 = r13.b((float) r3)
            goto L_0x02f2
        L_0x01a7:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            int r4 = com.applovin.impl.q3.b(r3)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            r13.b((int) r4)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            goto L_0x02f2
        L_0x01b4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.applovin.impl.kc.d(r5, r3)
            goto L_0x02f2
        L_0x01ca:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x020f;
                case -410956671: goto L_0x0204;
                case -250518009: goto L_0x01f9;
                case -136074796: goto L_0x01ee;
                case 3016401: goto L_0x01e3;
                case 3556653: goto L_0x01da;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            r6 = -1
            goto L_0x0219
        L_0x01da:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0219
            goto L_0x01d8
        L_0x01e3:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01ec
            goto L_0x01d8
        L_0x01ec:
            r6 = 4
            goto L_0x0219
        L_0x01ee:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01f7
            goto L_0x01d8
        L_0x01f7:
            r6 = 3
            goto L_0x0219
        L_0x01f9:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0202
            goto L_0x01d8
        L_0x0202:
            r6 = 2
            goto L_0x0219
        L_0x0204:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x020d
            goto L_0x01d8
        L_0x020d:
            r6 = 1
            goto L_0x0219
        L_0x020f:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0218
            goto L_0x01d8
        L_0x0218:
            r6 = 0
        L_0x0219:
            switch(r6) {
                case 0: goto L_0x023c;
                case 1: goto L_0x0232;
                case 2: goto L_0x0228;
                case 3: goto L_0x021e;
                case 4: goto L_0x023c;
                case 5: goto L_0x021e;
                default: goto L_0x021c;
            }
        L_0x021c:
            goto L_0x02f2
        L_0x021e:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.e((int) r9)
            goto L_0x02f2
        L_0x0228:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.e((int) r7)
            goto L_0x02f2
        L_0x0232:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.e((int) r11)
            goto L_0x02f2
        L_0x023c:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.e((int) r10)
            goto L_0x02f2
        L_0x0246:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02f2
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.b((java.lang.String) r3)
            goto L_0x02f2
        L_0x025c:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.applovin.impl.kp r13 = r13.a((boolean) r3)
            goto L_0x02f2
        L_0x026c:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x029c;
                case -1026963764: goto L_0x0291;
                case 913457136: goto L_0x0286;
                case 1679736913: goto L_0x027b;
                default: goto L_0x027a;
            }
        L_0x027a:
            goto L_0x02a6
        L_0x027b:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0284
            goto L_0x02a6
        L_0x0284:
            r8 = 3
            goto L_0x02a6
        L_0x0286:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x028f
            goto L_0x02a6
        L_0x028f:
            r8 = 2
            goto L_0x02a6
        L_0x0291:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x029a
            goto L_0x02a6
        L_0x029a:
            r8 = 1
            goto L_0x02a6
        L_0x029c:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02a5
            goto L_0x02a6
        L_0x02a5:
            r8 = 0
        L_0x02a6:
            switch(r8) {
                case 0: goto L_0x02c5;
                case 1: goto L_0x02bc;
                case 2: goto L_0x02b3;
                case 3: goto L_0x02aa;
                default: goto L_0x02a9;
            }
        L_0x02a9:
            goto L_0x02f2
        L_0x02aa:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.c((boolean) r11)
            goto L_0x02f2
        L_0x02b3:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.c((boolean) r1)
            goto L_0x02f2
        L_0x02bc:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.e((boolean) r11)
            goto L_0x02f2
        L_0x02c5:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.e((boolean) r1)
            goto L_0x02f2
        L_0x02ce:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            android.text.Layout$Alignment r3 = b((java.lang.String) r3)
            com.applovin.impl.kp r13 = r13.b((android.text.Layout.Alignment) r3)
            goto L_0x02f2
        L_0x02db:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            com.applovin.impl.kp r13 = r13.a((java.lang.String) r3)
            goto L_0x02f2
        L_0x02e4:
            com.applovin.impl.kp r13 = a((com.applovin.impl.kp) r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.applovin.impl.kp r13 = r13.b((boolean) r3)
        L_0x02f2:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x02f6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.kp):com.applovin.impl.kp");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bf, code lost:
        if (r13.equals("ms") == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0103, code lost:
        r8 = r8 * r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0109, code lost:
        r8 = r8 / r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.lang.String r13, com.applovin.impl.gp.b r14) {
        /*
            java.util.regex.Pattern r0 = f8084p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = com.applovin.impl.a1.a((java.lang.Object) r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = com.applovin.impl.a1.a((java.lang.Object) r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            java.lang.Object r13 = com.applovin.impl.a1.a((java.lang.Object) r13)
            java.lang.String r13 = (java.lang.String) r13
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0059
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x005a
        L_0x0059:
            r9 = r4
        L_0x005a:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x006c
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f8096a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x006d
        L_0x006c:
            r9 = r4
        L_0x006d:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f8097b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f8096a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x0083:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0088:
            java.util.regex.Pattern r0 = f8085q
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x010e
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = com.applovin.impl.a1.a((java.lang.Object) r13)
            java.lang.String r13 = (java.lang.String) r13
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = com.applovin.impl.a1.a((java.lang.Object) r13)
            java.lang.String r13 = (java.lang.String) r13
            r13.hashCode()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00e3;
                case 104: goto L_0x00d8;
                case 109: goto L_0x00cd;
                case 116: goto L_0x00c2;
                case 3494: goto L_0x00b9;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            r4 = -1
            goto L_0x00ed
        L_0x00b9:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ed
            goto L_0x00b7
        L_0x00c2:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00cb
            goto L_0x00b7
        L_0x00cb:
            r4 = 3
            goto L_0x00ed
        L_0x00cd:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d6
            goto L_0x00b7
        L_0x00d6:
            r4 = 2
            goto L_0x00ed
        L_0x00d8:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e1
            goto L_0x00b7
        L_0x00e1:
            r4 = 1
            goto L_0x00ed
        L_0x00e3:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ec
            goto L_0x00b7
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x0106;
                case 1: goto L_0x00fe;
                case 2: goto L_0x00fb;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f1;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x010a
        L_0x00f1:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0109
        L_0x00f7:
            int r13 = r14.f8098c
            double r13 = (double) r13
            goto L_0x0109
        L_0x00fb:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0103
        L_0x00fe:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0103:
            double r8 = r8 * r13
            goto L_0x010a
        L_0x0106:
            float r13 = r14.f8096a
            double r13 = (double) r13
        L_0x0109:
            double r8 = r8 / r13
        L_0x010a:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x010e:
            com.applovin.impl.ml r14 = new com.applovin.impl.ml
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(java.lang.String, com.applovin.impl.gp$b):long");
    }
}
