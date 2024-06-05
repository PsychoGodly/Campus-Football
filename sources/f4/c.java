package f4;

import android.text.Layout;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.n0;
import k4.o0;
import k4.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import y3.g;
import y3.h;
import y3.j;

/* compiled from: TtmlDecoder */
public final class c extends g {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f18008p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f18009q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f18010r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s  reason: collision with root package name */
    static final Pattern f18011s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    static final Pattern f18012t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f18013u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f18014v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w  reason: collision with root package name */
    private static final b f18015w = new b(30.0f, 1, 1);

    /* renamed from: x  reason: collision with root package name */
    private static final a f18016x = new a(32, 15);

    /* renamed from: o  reason: collision with root package name */
    private final XmlPullParserFactory f18017o;

    /* compiled from: TtmlDecoder */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f18018a;

        /* renamed from: b  reason: collision with root package name */
        final int f18019b;

        a(int i10, int i11) {
            this.f18018a = i10;
            this.f18019b = i11;
        }
    }

    /* compiled from: TtmlDecoder */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final float f18020a;

        /* renamed from: b  reason: collision with root package name */
        final int f18021b;

        /* renamed from: c  reason: collision with root package name */
        final int f18022c;

        b(float f10, int i10, int i11) {
            this.f18020a = f10;
            this.f18021b = i10;
            this.f18022c = i11;
        }
    }

    /* renamed from: f4.c$c  reason: collision with other inner class name */
    /* compiled from: TtmlDecoder */
    private static final class C0189c {

        /* renamed from: a  reason: collision with root package name */
        final int f18023a;

        /* renamed from: b  reason: collision with root package name */
        final int f18024b;

        C0189c(int i10, int i11) {
            this.f18023a = i10;
            this.f18024b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f18017o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g B(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(JsonStorageKeyNames.DATA_KEY) || str.equals("information");
    }

    private static Layout.Alignment D(String str) {
        String e10 = r6.c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1364013995:
                if (e10.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (e10.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e10.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e10.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e10.equals("start")) {
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

    private static a E(XmlPullParser xmlPullParser, a aVar) throws j {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f18014v.matcher(attributeValue);
        if (!matcher.matches()) {
            r.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) k4.a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) k4.a.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new j("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            r.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void F(String str, g gVar) throws j {
        Matcher matcher;
        String[] R0 = n0.R0(str, "\\s+");
        if (R0.length == 1) {
            matcher = f18010r.matcher(str);
        } else if (R0.length == 2) {
            matcher = f18010r.matcher(R0[1]);
            r.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new j("Invalid number of entries for fontSize: " + R0.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) k4.a.e(matcher.group(3));
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
                    gVar.z(3);
                    break;
                case 1:
                    gVar.z(2);
                    break;
                case 2:
                    gVar.z(1);
                    break;
                default:
                    throw new j("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.y(Float.parseFloat((String) k4.a.e(matcher.group(1))));
            return;
        }
        throw new j("Invalid expression for fontSize: '" + str + "'.");
    }

    private static b G(XmlPullParser xmlPullParser) throws j {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] R0 = n0.R0(attributeValue2, " ");
            if (R0.length == 2) {
                f10 = ((float) Integer.parseInt(R0[0])) / ((float) Integer.parseInt(R0[1]));
            } else {
                throw new j("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = f18015w;
        int i10 = bVar.f18021b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f18022c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f10, i10, i11);
    }

    private static Map<String, g> H(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0189c cVar, Map<String, e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "style")) {
                String a10 = o0.a(xmlPullParser, "style");
                g M = M(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : N(a10)) {
                        M.a(map.get(str));
                    }
                }
                String g10 = M.g();
                if (g10 != null) {
                    map.put(g10, M);
                }
            } else if (o0.f(xmlPullParser, "region")) {
                e K = K(xmlPullParser, aVar, cVar);
                if (K != null) {
                    map2.put(K.f18038a, K);
                }
            } else if (o0.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!o0.d(xmlPullParser, "head"));
        return map;
    }

    private static void I(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a10;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "image") && (a10 = o0.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!o0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static f4.d J(org.xmlpull.v1.XmlPullParser r19, f4.d r20, java.util.Map<java.lang.String, f4.e> r21, f4.c.b r22) throws y3.j {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            f4.g r5 = M(r0, r3)
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
                case 1: goto L_0x00a2;
                case 2: goto L_0x009d;
                case 3: goto L_0x0096;
                case 4: goto L_0x008d;
                case 5: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x009a
        L_0x007f:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x009a
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
            goto L_0x009a
        L_0x008d:
            java.lang.String[] r4 = N(r6)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x009a
            r8 = r4
            goto L_0x009a
        L_0x0096:
            long r12 = O(r6, r1)
        L_0x009a:
            r4 = r21
            goto L_0x00b0
        L_0x009d:
            long r14 = O(r6, r1)
            goto L_0x009a
        L_0x00a2:
            long r16 = O(r6, r1)
            goto L_0x009a
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
            long r1 = r9.f18028d
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
            long r6 = r9.f18029e
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
            f4.d r0 = f4.d.c(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.J(org.xmlpull.v1.XmlPullParser, f4.d, java.util.Map, f4.c$b):f4.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a7, code lost:
        if (r0.equals("tb") == false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static f4.e K(org.xmlpull.v1.XmlPullParser r17, f4.c.a r18, f4.c.C0189c r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = k4.o0.a(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = k4.o0.a(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x0216
            java.util.regex.Pattern r6 = f18012t
            java.util.regex.Matcher r7 = r6.matcher(r3)
            java.util.regex.Pattern r8 = f18013u
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L_0x0069
            java.lang.String r9 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r9 = k4.a.e(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = k4.a.e(r7)     // Catch:{ NumberFormatException -> 0x0056 }
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
            k4.r.i(r5, r0)
            return r2
        L_0x0069:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L_0x0201
            if (r1 != 0) goto L_0x0084
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            k4.r.i(r5, r0)
            return r2
        L_0x0084:
            java.lang.String r7 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.Object r7 = k4.a.e(r7)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x01ee }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.String r9 = r9.group(r14)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.Object r9 = k4.a.e(r9)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01ee }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01ee }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x01ee }
            int r10 = r1.f18023a     // Catch:{ NumberFormatException -> 0x01ee }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01ee }
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01ee }
            int r10 = r1.f18024b     // Catch:{ NumberFormatException -> 0x01ee }
            float r10 = (float) r10
            float r9 = r9 / r10
        L_0x00aa:
            java.lang.String r10 = "extent"
            java.lang.String r10 = k4.o0.a(r0, r10)
            if (r10 == 0) goto L_0x01e8
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L_0x00f5
            java.lang.String r1 = r6.group(r15)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r1 = k4.a.e(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = r1 / r13
            java.lang.String r6 = r6.group(r14)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r6 = k4.a.e(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
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
            k4.r.i(r5, r0)
            return r2
        L_0x00f5:
            boolean r6 = r8.matches()
            if (r6 == 0) goto L_0x01d3
            if (r1 != 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            k4.r.i(r5, r0)
            return r2
        L_0x0110:
            java.lang.String r6 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.Object r6 = k4.a.e(r6)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x01c0 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.String r8 = r8.group(r14)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.Object r8 = k4.a.e(r8)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01c0 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01c0 }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x01c0 }
            int r10 = r1.f18023a     // Catch:{ NumberFormatException -> 0x01c0 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01c0 }
            float r6 = r6 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01c0 }
            int r1 = r1.f18024b     // Catch:{ NumberFormatException -> 0x01c0 }
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = r6
            r10 = r8
        L_0x0138:
            java.lang.String r2 = "displayAlign"
            java.lang.String r2 = k4.o0.a(r0, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0165
            java.lang.String r2 = r6.c.e(r2)
            r2.hashCode()
            java.lang.String r5 = "center"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x015d
            java.lang.String r5 = "after"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0159
            goto L_0x0165
        L_0x0159:
            float r9 = r9 + r10
            r6 = r9
            r8 = 2
            goto L_0x0167
        L_0x015d:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r2
            float r9 = r9 + r2
            r6 = r9
            r8 = 1
            goto L_0x0167
        L_0x0165:
            r6 = r9
            r8 = 0
        L_0x0167:
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.f18019b
            float r5 = (float) r5
            float r12 = r2 / r5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = "writingMode"
            java.lang.String r0 = k4.o0.a(r0, r5)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = r6.c.e(r0)
            r0.hashCode()
            r5 = -1
            int r9 = r0.hashCode()
            switch(r9) {
                case 3694: goto L_0x01a1;
                case 3553396: goto L_0x0196;
                case 3553576: goto L_0x018b;
                default: goto L_0x0189;
            }
        L_0x0189:
            r3 = -1
            goto L_0x01aa
        L_0x018b:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0194
            goto L_0x0189
        L_0x0194:
            r3 = 2
            goto L_0x01aa
        L_0x0196:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x019f
            goto L_0x0189
        L_0x019f:
            r3 = 1
            goto L_0x01aa
        L_0x01a1:
            java.lang.String r9 = "tb"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01aa
            goto L_0x0189
        L_0x01aa:
            switch(r3) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x01b0;
                case 2: goto L_0x01ae;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            goto L_0x01b2
        L_0x01ae:
            r13 = 1
            goto L_0x01b4
        L_0x01b0:
            r13 = 2
            goto L_0x01b4
        L_0x01b2:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01b4:
            f4.e r0 = new f4.e
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r7
            r7 = r2
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            k4.r.i(r5, r0)
            return r2
        L_0x01d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            k4.r.i(r5, r0)
            return r2
        L_0x01e8:
            java.lang.String r0 = "Ignoring region without an extent"
            k4.r.i(r5, r0)
            return r2
        L_0x01ee:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            k4.r.i(r5, r0)
            return r2
        L_0x0201:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            k4.r.i(r5, r0)
            return r2
        L_0x0216:
            java.lang.String r0 = "Ignoring region without an origin"
            k4.r.i(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.K(org.xmlpull.v1.XmlPullParser, f4.c$a, f4.c$c):f4.e");
    }

    private static float L(String str) {
        Matcher matcher = f18011s.matcher(str);
        if (!matcher.matches()) {
            r.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) k4.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            r.j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e0, code lost:
        if (r3.equals("text") == false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static f4.g M(org.xmlpull.v1.XmlPullParser r12, f4.g r13) {
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
            f4.g r13 = B(r13)
            android.text.Layout$Alignment r3 = D(r3)
            f4.g r13 = r13.D(r3)
            goto L_0x02f2
        L_0x00ef:
            f4.g r13 = B(r13)
            int r4 = k4.f.c(r3)     // Catch:{ IllegalArgumentException -> 0x00fc }
            r13.u(r4)     // Catch:{ IllegalArgumentException -> 0x00fc }
            goto L_0x02f2
        L_0x00fc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            k4.r.i(r5, r3)
            goto L_0x02f2
        L_0x0112:
            java.lang.String r3 = r6.c.e(r3)
            r3.hashCode()
            java.lang.String r4 = "before"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0135
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            goto L_0x02f2
        L_0x012b:
            f4.g r13 = B(r13)
            f4.g r13 = r13.E(r10)
            goto L_0x02f2
        L_0x0135:
            f4.g r13 = B(r13)
            f4.g r13 = r13.E(r11)
            goto L_0x02f2
        L_0x013f:
            f4.g r13 = B(r13)
            f4.b r3 = f4.b.a(r3)
            f4.g r13 = r13.J(r3)
            goto L_0x02f2
        L_0x014d:
            f4.g r13 = B(r13)     // Catch:{ j -> 0x0156 }
            F(r3, r13)     // Catch:{ j -> 0x0156 }
            goto L_0x02f2
        L_0x0156:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            k4.r.i(r5, r3)
            goto L_0x02f2
        L_0x016c:
            java.lang.String r3 = r6.c.e(r3)
            r3.hashCode()
            java.lang.String r4 = "all"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x018f
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0185
            goto L_0x02f2
        L_0x0185:
            f4.g r13 = B(r13)
            f4.g r13 = r13.I(r1)
            goto L_0x02f2
        L_0x018f:
            f4.g r13 = B(r13)
            f4.g r13 = r13.I(r11)
            goto L_0x02f2
        L_0x0199:
            f4.g r13 = B(r13)
            float r3 = L(r3)
            f4.g r13 = r13.G(r3)
            goto L_0x02f2
        L_0x01a7:
            f4.g r13 = B(r13)
            int r4 = k4.f.c(r3)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            r13.w(r4)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            goto L_0x02f2
        L_0x01b4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            k4.r.i(r5, r3)
            goto L_0x02f2
        L_0x01ca:
            java.lang.String r3 = r6.c.e(r3)
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
            f4.g r13 = B(r13)
            f4.g r13 = r13.F(r9)
            goto L_0x02f2
        L_0x0228:
            f4.g r13 = B(r13)
            f4.g r13 = r13.F(r7)
            goto L_0x02f2
        L_0x0232:
            f4.g r13 = B(r13)
            f4.g r13 = r13.F(r11)
            goto L_0x02f2
        L_0x023c:
            f4.g r13 = B(r13)
            f4.g r13 = r13.F(r10)
            goto L_0x02f2
        L_0x0246:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02f2
            f4.g r13 = B(r13)
            f4.g r13 = r13.A(r3)
            goto L_0x02f2
        L_0x025c:
            f4.g r13 = B(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            f4.g r13 = r13.v(r3)
            goto L_0x02f2
        L_0x026c:
            java.lang.String r3 = r6.c.e(r3)
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
            f4.g r13 = B(r13)
            f4.g r13 = r13.C(r11)
            goto L_0x02f2
        L_0x02b3:
            f4.g r13 = B(r13)
            f4.g r13 = r13.C(r1)
            goto L_0x02f2
        L_0x02bc:
            f4.g r13 = B(r13)
            f4.g r13 = r13.K(r11)
            goto L_0x02f2
        L_0x02c5:
            f4.g r13 = B(r13)
            f4.g r13 = r13.K(r1)
            goto L_0x02f2
        L_0x02ce:
            f4.g r13 = B(r13)
            android.text.Layout$Alignment r3 = D(r3)
            f4.g r13 = r13.H(r3)
            goto L_0x02f2
        L_0x02db:
            f4.g r13 = B(r13)
            f4.g r13 = r13.x(r3)
            goto L_0x02f2
        L_0x02e4:
            f4.g r13 = B(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            f4.g r13 = r13.B(r3)
        L_0x02f2:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x02f6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.M(org.xmlpull.v1.XmlPullParser, f4.g):f4.g");
    }

    private static String[] N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : n0.R0(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bf, code lost:
        if (r13.equals("ms") == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f6, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0104, code lost:
        r8 = r8 * r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long O(java.lang.String r13, f4.c.b r14) throws y3.j {
        /*
            java.util.regex.Pattern r0 = f18008p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = k4.a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = k4.a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            java.lang.Object r13 = k4.a.e(r13)
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
            float r1 = r14.f18020a
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
            int r13 = r14.f18021b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f18020a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x0083:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0088:
            java.util.regex.Pattern r0 = f18009q
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x010f
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = k4.a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = k4.a.e(r13)
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
                case 0: goto L_0x0107;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00f1;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x010b
        L_0x00f1:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00f6:
            double r8 = r8 / r13
            goto L_0x010b
        L_0x00f8:
            int r13 = r14.f18022c
            double r13 = (double) r13
            goto L_0x00f6
        L_0x00fc:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0104
        L_0x00ff:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0104:
            double r8 = r8 * r13
            goto L_0x010b
        L_0x0107:
            float r13 = r14.f18020a
            double r13 = (double) r13
            goto L_0x00f6
        L_0x010b:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x010f:
            y3.j r14 = new y3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.O(java.lang.String, f4.c$b):long");
    }

    private static C0189c P(XmlPullParser xmlPullParser) {
        String a10 = o0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f18013u.matcher(a10);
        if (!matcher.matches()) {
            r.i("TtmlDecoder", "Ignoring non-pixel tts extent: " + a10);
            return null;
        }
        try {
            return new C0189c(Integer.parseInt((String) k4.a.e(matcher.group(1))), Integer.parseInt((String) k4.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            r.i("TtmlDecoder", "Ignoring malformed tts extent: " + a10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) throws j {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f18017o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(MaxReward.DEFAULT_LABEL, new e(MaxReward.DEFAULT_LABEL));
            C0189c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f18015w;
            a aVar = f18016x;
            h hVar = null;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = G(newPullParser);
                            aVar = E(newPullParser, f18016x);
                            cVar = P(newPullParser);
                        }
                        C0189c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!C(name)) {
                            r.f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d J = J(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (dVar != null) {
                                        dVar.a(J);
                                    }
                                } catch (j e10) {
                                    r.j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) k4.a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) k4.a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new j("No TTML subtitles found");
        } catch (XmlPullParserException e11) {
            throw new j("Unable to decode source", e11);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        }
    }
}
