package t3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinMediationProvider;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import j4.j0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.l0;
import k4.n0;
import k4.o0;
import k4.r;
import k4.v;
import n2.i;
import n2.r1;
import n2.y2;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import r2.m;
import r6.c;
import r6.e;
import s6.e0;
import s6.u;
import t3.k;

/* compiled from: DashManifestParser */
public class d extends DefaultHandler implements j0.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f22599b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f22600c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f22601d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f22602e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f22603a;

    /* compiled from: DashManifestParser */
    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final r1 f22604a;

        /* renamed from: b  reason: collision with root package name */
        public final u<b> f22605b;

        /* renamed from: c  reason: collision with root package name */
        public final k f22606c;

        /* renamed from: d  reason: collision with root package name */
        public final String f22607d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<m.b> f22608e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<e> f22609f;

        /* renamed from: g  reason: collision with root package name */
        public final long f22610g;

        /* renamed from: h  reason: collision with root package name */
        public final List<e> f22611h;

        /* renamed from: i  reason: collision with root package name */
        public final List<e> f22612i;

        public a(r1 r1Var, List<b> list, k kVar, String str, ArrayList<m.b> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j10) {
            this.f22604a = r1Var;
            this.f22605b = u.u(list);
            this.f22606c = kVar;
            this.f22607d = str;
            this.f22608e = arrayList;
            this.f22609f = arrayList2;
            this.f22611h = list2;
            this.f22612i = list3;
            this.f22610g = j10;
        }
    }

    public d() {
        try {
            this.f22603a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int D(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f22613a) && (str = eVar.f22614b) != null) {
                Matcher matcher = f22600c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                r.i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f22614b);
            }
        }
        return -1;
    }

    protected static int E(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f22613a) && (str = eVar.f22614b) != null) {
                Matcher matcher = f22601d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                r.i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f22614b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j10) throws y2 {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j10;
        }
        return n0.J0(attributeValue);
    }

    protected static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String r02 = r0(xmlPullParser, "schemeIdUri", MaxReward.DEFAULT_LABEL);
        String r03 = r0(xmlPullParser, "value", (String) null);
        String r04 = r0(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!o0.d(xmlPullParser, str));
        return new e(r02, r03, r04);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int J(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r4 = r4.getAttributeValue(r0, r1)
            r0 = -1
            if (r4 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r4 = r6.c.e(r4)
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 1596796: goto L_0x003e;
                case 2937391: goto L_0x0033;
                case 3094035: goto L_0x0028;
                case 3133436: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r4 = -1
            goto L_0x0048
        L_0x001d:
            java.lang.String r1 = "fa01"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r4 = 3
            goto L_0x0048
        L_0x0028:
            java.lang.String r1 = "f801"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r4 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "a000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r4 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r1 = "4000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r4 = 0
        L_0x0048:
            switch(r4) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0051;
                case 2: goto L_0x004f;
                case 3: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            return r0
        L_0x004c:
            r4 = 8
            return r4
        L_0x004f:
            r4 = 6
            return r4
        L_0x0051:
            return r2
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.J(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static int K(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    protected static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    protected static long M(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j10;
        }
        return n0.K0(attributeValue);
    }

    protected static String N(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f22613a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f22614b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f22614b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float R(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float S(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f22599b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    protected static int U(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long W(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (c.a("http://dashif.org/guidelines/last-segment-number", eVar.f22613a)) {
                return Long.parseLong(eVar.f22614b);
            }
        }
        return -1;
    }

    protected static long X(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int Z(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U < 0) {
            return -1;
        }
        int[] iArr = f22602e;
        if (U < iArr.length) {
            return iArr[U];
        }
        return -1;
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int m10 = i10 >= 0 ? i10 + 1 : (int) n0.m(j12 - j10, j11);
        for (int i11 = 0; i11 < m10; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        k4.a.f(i10 == i11);
        return i10;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        k4.a.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<m.b> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            m.b bVar = arrayList.get(i10);
            if (i.f20438c.equals(bVar.f22082b) && (str = bVar.f22083c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                m.b bVar2 = arrayList.get(i11);
                if (i.f20437b.equals(bVar2.f22082b) && bVar2.f22083c == null) {
                    arrayList.set(i11, new m.b(i.f20438c, str, bVar2.f22084d, bVar2.f22085f));
                }
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static void s(ArrayList<m.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m.b bVar = arrayList.get(size);
            if (!bVar.c()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i10).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    protected static String s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = MaxReward.DEFAULT_LABEL;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser, str));
        return str2;
    }

    private static long t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private static String u(String str, String str2) {
        if (v.o(str)) {
            return v.c(str2);
        }
        if (v.s(str)) {
            return v.n(str2);
        }
        if (v.r(str) || v.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g10 = v.g(str2);
        return "text/vtt".equals(g10) ? "application/x-mp4-vtt" : g10;
    }

    private boolean v(String[] strArr) {
        for (String startsWith : strArr) {
            if (startsWith.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void w(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (o0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (o0.e(xmlPullParser)) {
                    i10++;
                } else if (o0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r0(r4, r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2128649360: goto L_0x0056;
                case -1352850286: goto L_0x004b;
                case -1138141449: goto L_0x0040;
                case -986633423: goto L_0x0035;
                case -79006963: goto L_0x002a;
                case 312179081: goto L_0x001f;
                case 2036691300: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r0 = -1
            goto L_0x0060
        L_0x0014:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r0 = 6
            goto L_0x0060
        L_0x001f:
            java.lang.String r1 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r0 = 5
            goto L_0x0060
        L_0x002a:
            java.lang.String r1 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r0 = 4
            goto L_0x0060
        L_0x0035:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r0 = 3
            goto L_0x0060
        L_0x0040:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0012
        L_0x0049:
            r0 = 2
            goto L_0x0060
        L_0x004b:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            r0 = 1
            goto L_0x0060
        L_0x0056:
            java.lang.String r1 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            goto L_0x0012
        L_0x005f:
            r0 = 0
        L_0x0060:
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0073;
                case 2: goto L_0x006e;
                case 3: goto L_0x0069;
                case 4: goto L_0x007a;
                case 5: goto L_0x0064;
                case 6: goto L_0x006e;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x007e
        L_0x0064:
            int r2 = L(r4)
            goto L_0x007e
        L_0x0069:
            int r2 = Z(r4)
            goto L_0x007e
        L_0x006e:
            int r2 = J(r4)
            goto L_0x007e
        L_0x0073:
            java.lang.String r0 = "value"
            int r2 = U(r4, r0, r2)
            goto L_0x007e
        L_0x007a:
            int r2 = K(r4)
        L_0x007e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = k4.o0.d(r4, r0)
            if (r0 == 0) goto L_0x007e
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.A(org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: protected */
    public long B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* access modifiers changed from: protected */
    public List<b> C(XmlPullParser xmlPullParser, List<b> list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : RecyclerView.UNDEFINED_DURATION;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String s02 = s0(xmlPullParser, "BaseURL");
        if (l0.b(s02)) {
            if (attributeValue3 == null) {
                attributeValue3 = s02;
            }
            return e0.j(new b(s02, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = list.get(i10);
            String d10 = l0.d(bVar.f22582a, s02);
            String str = attributeValue3 == null ? d10 : attributeValue3;
            if (z10) {
                parseInt = bVar.f22584c;
                parseInt2 = bVar.f22585d;
                str = bVar.f22583b;
            }
            arrayList.add(new b(d10, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r1 = null;
        r4 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, r2.m.b> F(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = r6.c.e(r1)
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1980789791: goto L_0x003b;
                case 489446379: goto L_0x0030;
                case 755418770: goto L_0x0025;
                case 1812765994: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0045
        L_0x001a:
            java.lang.String r4 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0023
            goto L_0x0045
        L_0x0023:
            r3 = 3
            goto L_0x0045
        L_0x0025:
            java.lang.String r4 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            r3 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r4 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            r3 = 1
            goto L_0x0045
        L_0x003b:
            java.lang.String r4 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            switch(r3) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0088;
                case 2: goto L_0x0085;
                case 3: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0090
        L_0x0049:
            java.lang.String r1 = "value"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            java.lang.String r3 = "default_KID"
            java.lang.String r3 = k4.o0.b(r11, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x006d:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x007b
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006d
        L_0x007b:
            java.util.UUID r3 = n2.i.f20437b
            byte[] r4 = a3.l.b(r3, r4, r0)
            r5 = r0
            goto L_0x0094
        L_0x0083:
            r3 = r0
            goto L_0x0092
        L_0x0085:
            java.util.UUID r3 = n2.i.f20439d
            goto L_0x008a
        L_0x0088:
            java.util.UUID r3 = n2.i.f20440e
        L_0x008a:
            r1 = r0
            r4 = r1
            goto L_0x0093
        L_0x008d:
            java.util.UUID r3 = n2.i.f20438c
            goto L_0x008a
        L_0x0090:
            r1 = r0
            r3 = r1
        L_0x0092:
            r4 = r3
        L_0x0093:
            r5 = r4
        L_0x0094:
            r11.next()
            java.lang.String r6 = "clearkey:Laurl"
            boolean r6 = k4.o0.f(r11, r6)
            r7 = 4
            if (r6 == 0) goto L_0x00ac
            int r6 = r11.next()
            if (r6 != r7) goto L_0x00ac
            java.lang.String r5 = r11.getText()
            goto L_0x010f
        L_0x00ac:
            java.lang.String r6 = "ms:laurl"
            boolean r6 = k4.o0.f(r11, r6)
            if (r6 == 0) goto L_0x00bb
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r0, r5)
            goto L_0x010f
        L_0x00bb:
            if (r4 != 0) goto L_0x00e7
            java.lang.String r6 = "pssh"
            boolean r6 = k4.o0.g(r11, r6)
            if (r6 == 0) goto L_0x00e7
            int r6 = r11.next()
            if (r6 != r7) goto L_0x00e7
            java.lang.String r3 = r11.getText()
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.util.UUID r4 = a3.l.f(r3)
            if (r4 != 0) goto L_0x00e3
            java.lang.String r3 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            k4.r.i(r3, r6)
            r3 = r4
            r4 = r0
            goto L_0x010f
        L_0x00e3:
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x010f
        L_0x00e7:
            if (r4 != 0) goto L_0x010c
            java.util.UUID r6 = n2.i.f20440e
            boolean r8 = r6.equals(r3)
            if (r8 == 0) goto L_0x010c
            java.lang.String r8 = "mspr:pro"
            boolean r8 = k4.o0.f(r11, r8)
            if (r8 == 0) goto L_0x010c
            int r8 = r11.next()
            if (r8 != r7) goto L_0x010c
            java.lang.String r4 = r11.getText()
            byte[] r4 = android.util.Base64.decode(r4, r2)
            byte[] r4 = a3.l.a(r6, r4)
            goto L_0x010f
        L_0x010c:
            w(r11)
        L_0x010f:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = k4.o0.d(r11, r6)
            if (r6 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0120
            r2.m$b r0 = new r2.m$b
            java.lang.String r11 = "video/mp4"
            r0.<init>(r3, r5, r11, r4)
        L_0x0120:
            android.util.Pair r11 = android.util.Pair.create(r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
            return 1;
        }
        if (MimeTypes.BASE_TYPE_VIDEO.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if ("image".equals(attributeValue)) {
            return 4;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public Pair<Long, h3.a> O(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long X = X(xmlPullParser2, "id", 0);
        long X2 = X(xmlPullParser2, "duration", -9223372036854775807L);
        long X3 = X(xmlPullParser2, "presentationTime", 0);
        long O0 = n0.O0(X2, 1000, j10);
        long O02 = n0.O0(X3 - j11, 1000000, j10);
        String r02 = r0(xmlPullParser2, "messageData", (String) null);
        byte[] P = P(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(O02);
        if (r02 != null) {
            P = n0.m0(r02);
        }
        return Pair.create(valueOf, d(str, str2, X, O0, P));
    }

    /* access modifiers changed from: protected */
    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, e.f29803c.name());
        xmlPullParser.nextToken();
        while (!o0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument((String) null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: protected */
    public f Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j10;
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String r02 = r0(xmlPullParser2, "schemeIdUri", MaxReward.DEFAULT_LABEL);
        String r03 = r0(xmlPullParser2, "value", MaxReward.DEFAULT_LABEL);
        long X = X(xmlPullParser2, "timescale", 1);
        long X2 = X(xmlPullParser2, "presentationTimeOffset", 0);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j11 = X2;
                j10 = X2;
                arrayList = arrayList2;
                arrayList.add(O(xmlPullParser, r02, r03, X, j11, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j10 = X2;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (o0.d(xmlPullParser2, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            X2 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        h3.a[] aVarArr = new h3.a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            aVarArr[i10] = (h3.a) pair.second;
        }
        return e(r02, r03, X, jArr, aVarArr);
    }

    /* access modifiers changed from: protected */
    public i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    /* access modifiers changed from: protected */
    public String V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return s0(xmlPullParser, "Label");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e6 A[LOOP:0: B:23:0x00a4->B:79:0x01e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t3.c Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r46 = this;
            r14 = r46
            r12 = r47
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "profiles"
            java.lang.String[] r1 = r14.b0(r12, r2, r1)
            boolean r13 = r14.v(r1)
            java.lang.String r1 = "availabilityStartTime"
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r15 = H(r12, r1, r9)
            java.lang.String r1 = "mediaPresentationDuration"
            long r17 = M(r12, r1, r9)
            java.lang.String r1 = "minBufferTime"
            long r19 = M(r12, r1, r9)
            r11 = 0
            java.lang.String r1 = "type"
            java.lang.String r1 = r12.getAttributeValue(r11, r1)
            java.lang.String r2 = "dynamic"
            boolean r21 = r2.equals(r1)
            if (r21 == 0) goto L_0x0040
            java.lang.String r1 = "minimumUpdatePeriod"
            long r1 = M(r12, r1, r9)
            r22 = r1
            goto L_0x0042
        L_0x0040:
            r22 = r9
        L_0x0042:
            if (r21 == 0) goto L_0x004d
            java.lang.String r1 = "timeShiftBufferDepth"
            long r1 = M(r12, r1, r9)
            r24 = r1
            goto L_0x004f
        L_0x004d:
            r24 = r9
        L_0x004f:
            if (r21 == 0) goto L_0x005a
            java.lang.String r1 = "suggestedPresentationDelay"
            long r1 = M(r12, r1, r9)
            r26 = r1
            goto L_0x005c
        L_0x005a:
            r26 = r9
        L_0x005c:
            java.lang.String r1 = "publishTime"
            long r28 = H(r12, r1, r9)
            if (r21 == 0) goto L_0x0067
            r3 = 0
            goto L_0x0068
        L_0x0067:
            r3 = r9
        L_0x0068:
            t3.b r5 = new t3.b
            java.lang.String r6 = r48.toString()
            java.lang.String r7 = r48.toString()
            r8 = 1
            if (r13 == 0) goto L_0x0077
            r1 = 1
            goto L_0x007b
        L_0x0077:
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007b:
            r5.<init>(r6, r7, r1, r8)
            t3.b[] r1 = new t3.b[r8]
            r1[r0] = r5
            java.util.ArrayList r7 = s6.e0.j(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r21 == 0) goto L_0x0094
            r1 = r9
            goto L_0x0096
        L_0x0094:
            r1 = 0
        L_0x0096:
            r32 = r1
            r34 = r11
            r35 = r34
            r36 = r35
            r37 = r36
            r30 = 0
            r31 = 0
        L_0x00a4:
            r47.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = k4.o0.f(r12, r0)
            if (r0 == 0) goto L_0x00bf
            if (r30 != 0) goto L_0x00b7
            long r3 = r14.B(r12, r3)
            r30 = 1
        L_0x00b7:
            java.util.List r0 = r14.C(r12, r7, r13)
            r6.addAll(r0)
            goto L_0x00cd
        L_0x00bf:
            java.lang.String r0 = "ProgramInformation"
            boolean r0 = k4.o0.f(r12, r0)
            if (r0 == 0) goto L_0x00d9
            t3.h r0 = r46.c0(r47)
            r34 = r0
        L_0x00cd:
            r41 = r6
            r43 = r7
            r44 = r9
            r14 = r11
            r42 = 1
            r11 = r5
            goto L_0x019a
        L_0x00d9:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = k4.o0.f(r12, r0)
            if (r0 == 0) goto L_0x00e8
            t3.o r0 = r46.w0(r47)
            r35 = r0
            goto L_0x00cd
        L_0x00e8:
            java.lang.String r0 = "Location"
            boolean r0 = k4.o0.f(r12, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r48.toString()
            java.lang.String r1 = r47.nextText()
            android.net.Uri r0 = k4.l0.e(r0, r1)
            r36 = r0
            goto L_0x00cd
        L_0x00ff:
            java.lang.String r0 = "ServiceDescription"
            boolean r0 = k4.o0.f(r12, r0)
            if (r0 == 0) goto L_0x010e
            t3.l r0 = r46.q0(r47)
            r37 = r0
            goto L_0x00cd
        L_0x010e:
            java.lang.String r0 = "Period"
            boolean r0 = k4.o0.f(r12, r0)
            if (r0 == 0) goto L_0x0189
            if (r31 != 0) goto L_0x0189
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0120
            r2 = r6
            goto L_0x0121
        L_0x0120:
            r2 = r7
        L_0x0121:
            r0 = r46
            r1 = r47
            r38 = r3
            r3 = r32
            r40 = r5
            r41 = r6
            r5 = r38
            r43 = r7
            r42 = 1
            r7 = r15
            r44 = r9
            r9 = r24
            r14 = r11
            r11 = r13
            android.util.Pair r0 = r0.a0(r1, r2, r3, r5, r7, r9, r11)
            java.lang.Object r1 = r0.first
            t3.g r1 = (t3.g) r1
            long r2 = r1.f22622b
            int r4 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r4 != 0) goto L_0x0168
            if (r21 == 0) goto L_0x014e
            r11 = r40
            r8 = 1
            goto L_0x0186
        L_0x014e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to determine start of period "
            r0.append(r1)
            int r1 = r40.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            n2.y2 r0 = n2.y2.c(r0, r14)
            throw r0
        L_0x0168:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r0 != 0) goto L_0x0179
            r11 = r40
            r9 = r44
            goto L_0x017f
        L_0x0179:
            long r4 = r1.f22622b
            long r9 = r4 + r2
            r11 = r40
        L_0x017f:
            r11.add(r1)
            r32 = r9
            r8 = r31
        L_0x0186:
            r31 = r8
            goto L_0x0198
        L_0x0189:
            r38 = r3
            r41 = r6
            r43 = r7
            r44 = r9
            r14 = r11
            r42 = 1
            r11 = r5
            w(r47)
        L_0x0198:
            r3 = r38
        L_0x019a:
            java.lang.String r0 = "MPD"
            boolean r0 = k4.o0.d(r12, r0)
            if (r0 == 0) goto L_0x01e6
            int r0 = (r17 > r44 ? 1 : (r17 == r44 ? 0 : -1))
            if (r0 != 0) goto L_0x01b7
            int r0 = (r32 > r44 ? 1 : (r32 == r44 ? 0 : -1))
            if (r0 == 0) goto L_0x01ad
            r3 = r32
            goto L_0x01b9
        L_0x01ad:
            if (r21 == 0) goto L_0x01b0
            goto L_0x01b7
        L_0x01b0:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            n2.y2 r0 = n2.y2.c(r0, r14)
            throw r0
        L_0x01b7:
            r3 = r17
        L_0x01b9:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01df
            r0 = r46
            r1 = r15
            r5 = r19
            r7 = r21
            r8 = r22
            r38 = r11
            r10 = r24
            r12 = r26
            r14 = r28
            r16 = r34
            r17 = r35
            r18 = r37
            r19 = r36
            r20 = r38
            t3.c r0 = r0.g(r1, r3, r5, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r0
        L_0x01df:
            java.lang.String r0 = "No periods found."
            n2.y2 r0 = n2.y2.c(r0, r14)
            throw r0
        L_0x01e6:
            r5 = r11
            r11 = r14
            r6 = r41
            r7 = r43
            r9 = r44
            r8 = 1
            r14 = r46
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):t3.c");
    }

    /* access modifiers changed from: protected */
    public Pair<g, Long> a0(XmlPullParser xmlPullParser, List<b> list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        long j14;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j15;
        long j16;
        k l02;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "id");
        long M = M(xmlPullParser2, "start", j10);
        long j17 = -9223372036854775807L;
        long j18 = j12 != -9223372036854775807L ? j12 + M : -9223372036854775807L;
        long M2 = M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j19 = j11;
        long j20 = -9223372036854775807L;
        k kVar = null;
        e eVar = null;
        boolean z11 = false;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    j19 = dVar.B(xmlPullParser2, j19);
                    z11 = true;
                }
                arrayList6.addAll(dVar.C(xmlPullParser2, list, z10));
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                j14 = j17;
                obj = obj2;
                arrayList3 = arrayList4;
            } else {
                List<b> list2 = list;
                boolean z12 = z10;
                if (o0.f(xmlPullParser2, "AdaptationSet")) {
                    j15 = j19;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    arrayList3.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list2, kVar, M2, j19, j20, j18, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    arrayList = arrayList5;
                } else {
                    j15 = j19;
                    ArrayList arrayList7 = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (o0.f(xmlPullParser2, "EventStream")) {
                        ArrayList arrayList8 = arrayList7;
                        arrayList8.add(Q(xmlPullParser));
                        arrayList = arrayList8;
                    } else {
                        ArrayList arrayList9 = arrayList7;
                        if (o0.f(xmlPullParser2, "SegmentBase")) {
                            arrayList = arrayList9;
                            kVar = j0(xmlPullParser2, (k.e) null);
                            obj = null;
                            j19 = j15;
                            j14 = -9223372036854775807L;
                        } else {
                            arrayList = arrayList9;
                            if (o0.f(xmlPullParser2, "SegmentList")) {
                                long B = B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                l02 = k0(xmlPullParser, (k.b) null, j18, M2, j15, B, j13);
                                j20 = B;
                                j19 = j15;
                                j14 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (o0.f(xmlPullParser2, "SegmentTemplate")) {
                                    long B2 = B(xmlPullParser2, -9223372036854775807L);
                                    j14 = -9223372036854775807L;
                                    l02 = l0(xmlPullParser, (k.c) null, u.y(), j18, M2, j15, B2, j13);
                                    j20 = B2;
                                    j19 = j15;
                                } else {
                                    j16 = -9223372036854775807L;
                                    if (o0.f(xmlPullParser2, "AssetIdentifier")) {
                                        eVar = I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        w(xmlPullParser);
                                    }
                                    j19 = j15;
                                }
                            }
                            kVar = l02;
                        }
                    }
                }
                obj = null;
                j16 = -9223372036854775807L;
                j19 = j15;
            }
            if (o0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M, arrayList3, arrayList, eVar), Long.valueOf(M2));
            }
            arrayList4 = arrayList3;
            arrayList6 = arrayList2;
            obj2 = obj;
            arrayList5 = arrayList;
            j17 = j14;
            dVar = this;
        }
    }

    /* access modifiers changed from: protected */
    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return strArr;
        }
        return attributeValue.split(",");
    }

    /* access modifiers changed from: protected */
    public a c(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new a(i10, i11, list, list2, list3, list4);
    }

    /* access modifiers changed from: protected */
    public h c0(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String r02 = r0(xmlPullParser, "moreInformationURL", (String) null);
        String r03 = r0(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (o0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (o0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str3;
            if (o0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, r02, r03);
            }
            str3 = str4;
        }
    }

    /* access modifiers changed from: protected */
    public h3.a d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new h3.a(str, str2, j11, j10, bArr);
    }

    /* access modifiers changed from: protected */
    public i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j11 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j11) + 1;
                return i(attributeValue, j11, j10);
            }
        } else {
            j11 = 0;
        }
        j10 = -1;
        return i(attributeValue, j11, j10);
    }

    /* access modifiers changed from: protected */
    public f e(String str, String str2, long j10, long[] jArr, h3.a[] aVarArr) {
        return new f(str, str2, j10, jArr, aVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: t3.k$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r31v1 */
    /* JADX WARNING: type inference failed for: r31v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ee A[LOOP:0: B:1:0x006a->B:53:0x01ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0198 A[EDGE_INSN: B:54:0x0198->B:45:0x0198 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t3.d.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<t3.b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<t3.e> r46, java.util.List<t3.e> r47, java.util.List<t3.e> r48, java.util.List<t3.e> r49, t3.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r35 = this;
            r15 = r35
            r14 = r36
            r0 = 0
            java.lang.String r1 = "id"
            java.lang.String r16 = r14.getAttributeValue(r0, r1)
            java.lang.String r1 = "bandwidth"
            r2 = -1
            int r17 = U(r14, r1, r2)
            java.lang.String r1 = "mimeType"
            r2 = r38
            java.lang.String r18 = r0(r14, r1, r2)
            java.lang.String r1 = "codecs"
            r2 = r39
            java.lang.String r19 = r0(r14, r1, r2)
            java.lang.String r1 = "width"
            r2 = r40
            int r20 = U(r14, r1, r2)
            java.lang.String r1 = "height"
            r2 = r41
            int r21 = U(r14, r1, r2)
            r1 = r42
            float r22 = S(r14, r1)
            java.lang.String r1 = "audioSamplingRate"
            r2 = r44
            int r23 = U(r14, r1, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = r48
            r12.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r49
            r9.<init>(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = 0
            r24 = r43
            r5 = r55
            r1 = r57
            r25 = r0
            r26 = 0
            r0 = r50
        L_0x006a:
            r36.next()
            java.lang.String r3 = "BaseURL"
            boolean r3 = k4.o0.f(r14, r3)
            if (r3 == 0) goto L_0x0090
            if (r26 != 0) goto L_0x007d
            long r5 = r15.B(r14, r5)
            r26 = 1
        L_0x007d:
            r8 = r37
            r3 = r61
            java.util.List r4 = r15.C(r14, r8, r3)
            r7.addAll(r4)
        L_0x0088:
            r31 = r7
            r15 = r13
            r7 = r24
            r24 = r0
            goto L_0x00a6
        L_0x0090:
            r8 = r37
            r3 = r61
            java.lang.String r4 = "AudioChannelConfiguration"
            boolean r4 = k4.o0.f(r14, r4)
            if (r4 == 0) goto L_0x00aa
            int r4 = r35.A(r36)
            r24 = r0
            r31 = r7
            r15 = r13
            r7 = r4
        L_0x00a6:
            r13 = r11
            r11 = r9
            goto L_0x0190
        L_0x00aa:
            java.lang.String r4 = "SegmentBase"
            boolean r4 = k4.o0.f(r14, r4)
            if (r4 == 0) goto L_0x00b9
            t3.k$e r0 = (t3.k.e) r0
            t3.k$e r0 = r15.j0(r14, r0)
            goto L_0x0088
        L_0x00b9:
            java.lang.String r4 = "SegmentList"
            boolean r4 = k4.o0.f(r14, r4)
            if (r4 == 0) goto L_0x00f5
            long r27 = r15.B(r14, r1)
            r2 = r0
            t3.k$b r2 = (t3.k.b) r2
            r0 = r35
            r1 = r36
            r3 = r51
            r29 = r5
            r5 = r53
            r31 = r7
            r7 = r29
            r32 = r9
            r9 = r27
            r33 = r11
            r34 = r12
            r11 = r59
            t3.k$b r0 = r0.k0(r1, r2, r3, r5, r7, r9, r11)
            r15 = r13
        L_0x00e5:
            r7 = r24
            r1 = r27
        L_0x00e9:
            r5 = r29
            r11 = r32
            r13 = r33
            r12 = r34
        L_0x00f1:
            r24 = r0
            goto L_0x0190
        L_0x00f5:
            r29 = r5
            r31 = r7
            r32 = r9
            r33 = r11
            r34 = r12
            java.lang.String r3 = "SegmentTemplate"
            boolean r3 = k4.o0.f(r14, r3)
            if (r3 == 0) goto L_0x0124
            long r27 = r15.B(r14, r1)
            r2 = r0
            t3.k$c r2 = (t3.k.c) r2
            r0 = r35
            r1 = r36
            r3 = r49
            r4 = r51
            r6 = r53
            r8 = r29
            r10 = r27
            r15 = r13
            r12 = r59
            t3.k$c r0 = r0.l0(r1, r2, r3, r4, r6, r8, r10, r12)
            goto L_0x00e5
        L_0x0124:
            r15 = r13
            java.lang.String r3 = "ContentProtection"
            boolean r3 = k4.o0.f(r14, r3)
            if (r3 == 0) goto L_0x0145
            android.util.Pair r3 = r35.F(r36)
            java.lang.Object r4 = r3.first
            if (r4 == 0) goto L_0x0139
            r25 = r4
            java.lang.String r25 = (java.lang.String) r25
        L_0x0139:
            java.lang.Object r3 = r3.second
            if (r3 == 0) goto L_0x0142
            r2.m$b r3 = (r2.m.b) r3
            r15.add(r3)
        L_0x0142:
            r7 = r24
            goto L_0x00e9
        L_0x0145:
            java.lang.String r3 = "InbandEventStream"
            boolean r4 = k4.o0.f(r14, r3)
            if (r4 == 0) goto L_0x015b
            t3.e r3 = I(r14, r3)
            r13 = r33
            r13.add(r3)
            r11 = r32
            r12 = r34
            goto L_0x018a
        L_0x015b:
            r13 = r33
            java.lang.String r3 = "EssentialProperty"
            boolean r4 = k4.o0.f(r14, r3)
            if (r4 == 0) goto L_0x0171
            t3.e r3 = I(r14, r3)
            r12 = r34
            r12.add(r3)
            r11 = r32
            goto L_0x018a
        L_0x0171:
            r12 = r34
            java.lang.String r3 = "SupplementalProperty"
            boolean r4 = k4.o0.f(r14, r3)
            if (r4 == 0) goto L_0x0185
            t3.e r3 = I(r14, r3)
            r11 = r32
            r11.add(r3)
            goto L_0x018a
        L_0x0185:
            r11 = r32
            w(r36)
        L_0x018a:
            r7 = r24
            r5 = r29
            goto L_0x00f1
        L_0x0190:
            java.lang.String r0 = "Representation"
            boolean r0 = k4.o0.d(r14, r0)
            if (r0 == 0) goto L_0x01ee
            r0 = r35
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r7
            r7 = r23
            r8 = r17
            r9 = r45
            r10 = r46
            r27 = r11
            r11 = r47
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r28
            r14 = r27
            n2.r1 r0 = r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r24 == 0) goto L_0x01c2
            goto L_0x01c9
        L_0x01c2:
            t3.k$e r1 = new t3.k$e
            r1.<init>()
            r24 = r1
        L_0x01c9:
            t3.d$a r1 = new t3.d$a
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            r31 = r37
        L_0x01d4:
            r2 = -1
            r36 = r1
            r37 = r0
            r38 = r31
            r39 = r24
            r40 = r25
            r41 = r15
            r42 = r29
            r43 = r28
            r44 = r27
            r45 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r1
        L_0x01ee:
            r10 = r49
            r9 = r11
            r11 = r13
            r13 = r15
            r0 = r24
            r15 = r35
            r24 = r7
            r7 = r31
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, t3.k, long, long, long, long, long, boolean):t3.d$a");
    }

    /* access modifiers changed from: protected */
    public r1 f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str2;
        int i15 = i10;
        int i16 = i11;
        List<e> list5 = list;
        List<e> list6 = list3;
        String str6 = str4;
        String u10 = u(str2, str6);
        if ("audio/eac3".equals(u10)) {
            u10 = N(list4);
            if ("audio/eac3-joc".equals(u10)) {
                str6 = "ec+3";
            }
        }
        int p02 = p0(list5);
        int i02 = i0(list5) | f0(list2) | h0(list6) | h0(list4);
        Pair<Integer, Integer> t02 = t0(list6);
        String str7 = str;
        r1.b X = new r1.b().U(str).M(str2).g0(u10).K(str6).b0(i14).i0(p02).e0(i02).X(str3);
        int i17 = -1;
        r1.b m02 = X.l0(t02 != null ? ((Integer) t02.first).intValue() : -1).m0(t02 != null ? ((Integer) t02.second).intValue() : -1);
        if (v.s(u10)) {
            m02.n0(i10).S(i16).R(f10);
        } else if (v.o(u10)) {
            m02.J(i12).h0(i13);
        } else if (v.r(u10)) {
            if ("application/cea-608".equals(u10)) {
                i17 = D(list2);
            } else if ("application/cea-708".equals(u10)) {
                i17 = E(list2);
            }
            m02.H(i17);
        } else if (v.p(u10)) {
            m02.n0(i10).S(i16);
        }
        return m02.G();
    }

    /* access modifiers changed from: protected */
    public int f0(List<e> list) {
        int u02;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (c.a("urn:mpeg:dash:role:2011", eVar.f22613a)) {
                u02 = g0(eVar.f22614b);
            } else if (c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f22613a)) {
                u02 = u0(eVar.f22614b);
            }
            i10 |= u02;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    /* access modifiers changed from: protected */
    public int g0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = 8;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = 9;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = 12;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case 8:
                return 256;
            case 9:
                return 64;
            case 10:
                return 8;
            case 11:
                return 32;
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public g h(String str, long j10, List<a> list, List<f> list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    /* access modifiers changed from: protected */
    public int h0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (c.a("http://dashif.org/guidelines/trickmode", list.get(i11).f22613a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public int i0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (c.a("urn:mpeg:dash:role:2011", eVar.f22613a)) {
                i10 |= g0(eVar.f22614b);
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public j j(a aVar, String str, String str2, ArrayList<m.b> arrayList, ArrayList<e> arrayList2) {
        r1.b b10 = aVar.f22604a.b();
        if (str != null) {
            b10.W(str);
        }
        String str3 = aVar.f22607d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<m.b> arrayList3 = aVar.f22608e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            b10.O(new m(str2, (List<m.b>) arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f22609f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f22610g, b10.G(), aVar.f22605b, aVar.f22606c, arrayList4, aVar.f22611h, aVar.f22612i, (String) null);
    }

    /* access modifiers changed from: protected */
    public k.e j0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        k.e eVar2 = eVar;
        long X = X(xmlPullParser2, "timescale", eVar2 != null ? eVar2.f22650b : 1);
        long j12 = 0;
        long X2 = X(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.f22651c : 0);
        long j13 = eVar2 != null ? eVar2.f22664d : 0;
        if (eVar2 != null) {
            j12 = eVar2.f22665e;
        }
        i iVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j12;
            j11 = j13;
        }
        if (eVar2 != null) {
            iVar = eVar2.f22649a;
        }
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "Initialization")) {
                iVar = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser2, "SegmentBase"));
        return n(iVar, X, X2, j11, j10);
    }

    /* access modifiers changed from: protected */
    public k.b k(i iVar, long j10, long j11, long j12, long j13, List<k.d> list, long j14, List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, n0.C0(j15), n0.C0(j16));
    }

    /* access modifiers changed from: protected */
    public k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        k.b bVar2 = bVar;
        long j15 = 1;
        long X = X(xmlPullParser2, "timescale", bVar2 != null ? bVar2.f22650b : 1);
        long X2 = X(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.f22651c : 0);
        long X3 = X(xmlPullParser2, "duration", bVar2 != null ? bVar2.f22653e : -9223372036854775807L);
        if (bVar2 != null) {
            j15 = bVar2.f22652d;
        }
        long X4 = X(xmlPullParser2, "startNumber", j15);
        long t10 = t(j12, j13);
        List<k.d> list = null;
        List list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (o0.f(xmlPullParser2, "SegmentTimeline")) {
                list = m0(xmlPullParser, X, j11);
            } else if (o0.f(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (iVar == null) {
                iVar = bVar2.f22649a;
            }
            if (list == null) {
                list = bVar2.f22654f;
            }
            if (list2 == null) {
                list2 = bVar2.f22658j;
            }
        }
        return k(iVar, X, X2, X4, X3, list, t10, list2, j14, j10);
    }

    /* access modifiers changed from: protected */
    public k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, n0.C0(j16), n0.C0(j17));
    }

    /* access modifiers changed from: protected */
    public k.c l0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        k.c cVar2 = cVar;
        long j15 = 1;
        long X = X(xmlPullParser2, "timescale", cVar2 != null ? cVar2.f22650b : 1);
        long X2 = X(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.f22651c : 0);
        long X3 = X(xmlPullParser2, "duration", cVar2 != null ? cVar2.f22653e : -9223372036854775807L);
        if (cVar2 != null) {
            j15 = cVar2.f22652d;
        }
        long X4 = X(xmlPullParser2, "startNumber", j15);
        long W = W(list);
        long t10 = t(j12, j13);
        List<k.d> list2 = null;
        n v02 = v0(xmlPullParser2, "media", cVar2 != null ? cVar2.f22660k : null);
        n v03 = v0(xmlPullParser2, "initialization", cVar2 != null ? cVar2.f22659j : null);
        i iVar = null;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (o0.f(xmlPullParser2, "SegmentTimeline")) {
                list2 = m0(xmlPullParser, X, j11);
            } else {
                w(xmlPullParser);
            }
            if (o0.d(xmlPullParser2, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar2 != null) {
            if (iVar == null) {
                iVar = cVar2.f22649a;
            }
            if (list2 == null) {
                list2 = cVar2.f22654f;
            }
        }
        return l(iVar, X, X2, X4, W, X3, list2, t10, v03, v02, j14, j10);
    }

    /* access modifiers changed from: protected */
    public k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    /* access modifiers changed from: protected */
    public List<k.d> m0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "S")) {
                long X = X(xmlPullParser2, "t", -9223372036854775807L);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, X);
                }
                if (X == -9223372036854775807L) {
                    X = j12;
                }
                j13 = X(xmlPullParser2, "d", -9223372036854775807L);
                i10 = U(xmlPullParser2, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 0);
                j12 = X;
                z10 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser2, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, n0.O0(j11, j10, 1000));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    /* access modifiers changed from: protected */
    public i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    /* access modifiers changed from: protected */
    public o o(String str, String str2) {
        return new o(str, str2);
    }

    /* access modifiers changed from: protected */
    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* access modifiers changed from: protected */
    public int p0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (c.a("urn:mpeg:dash:role:2011", eVar.f22613a)) {
                i10 |= o0(eVar.f22614b);
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public l q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "Latency")) {
                j10 = X(xmlPullParser2, "target", -9223372036854775807L);
                j11 = X(xmlPullParser2, "min", -9223372036854775807L);
                j12 = X(xmlPullParser2, AppLovinMediationProvider.MAX, -9223372036854775807L);
            } else if (o0.f(xmlPullParser2, "PlaybackRate")) {
                f10 = R(xmlPullParser2, "min", -3.4028235E38f);
                f11 = R(xmlPullParser2, AppLovinMediationProvider.MAX, -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (o0.d(xmlPullParser2, "ServiceDescription")) {
                return new l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    /* access modifiers changed from: protected */
    public Pair<Integer, Integer> t0(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ((c.a("http://dashif.org/thumbnail_tile", eVar.f22613a) || c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f22613a)) && (str = eVar.f22614b) != null) {
                String[] R0 = n0.R0(str, "x");
                if (R0.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(R0[0])), Integer.valueOf(Integer.parseInt(R0[1])));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int u0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                    c10 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
                    c10 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public n v0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    /* access modifiers changed from: protected */
    public o w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* renamed from: x */
    public c a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f22603a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw y2.c("inputStream does not contain a valid media presentation description", (Throwable) null);
        } catch (XmlPullParserException e10) {
            throw y2.c((String) null, e10);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x030d A[LOOP:0: B:1:0x007c->B:69:0x030d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02ce A[EDGE_INSN: B:70:0x02ce->B:63:0x02ce ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t3.a y(org.xmlpull.v1.XmlPullParser r55, java.util.List<t3.b> r56, t3.k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r54 = this;
            r15 = r54
            r14 = r55
            java.lang.String r0 = "id"
            r1 = -1
            int r27 = U(r14, r0, r1)
            int r0 = r54.G(r55)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r28 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r29 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r30 = U(r14, r2, r1)
            java.lang.String r2 = "height"
            int r31 = U(r14, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r32 = S(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r33 = U(r14, r2, r1)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r3 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r34 = 0
            r35 = r57
            r36 = r0
            r38 = r2
            r39 = r3
            r41 = r13
            r37 = -1
            r40 = 0
            r2 = r60
            r0 = r62
        L_0x007c:
            r55.next()
            java.lang.String r13 = "BaseURL"
            boolean r13 = k4.o0.f(r14, r13)
            if (r13 == 0) goto L_0x00bb
            if (r40 != 0) goto L_0x008f
            long r2 = r15.B(r14, r2)
            r40 = 1
        L_0x008f:
            r13 = r56
            r60 = r0
            r17 = r10
            r10 = r68
            java.util.List r0 = r15.C(r14, r13, r10)
            r4.addAll(r0)
        L_0x009e:
            r0 = r60
            r42 = r2
            r15 = r5
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r3 = r17
            r51 = r36
            r53 = r38
            r52 = 0
            r36 = r4
            r38 = r6
            goto L_0x02c6
        L_0x00bb:
            r13 = r56
            r60 = r0
            r17 = r10
            r10 = r68
            java.lang.String r0 = "ContentProtection"
            boolean r0 = k4.o0.f(r14, r0)
            if (r0 == 0) goto L_0x00e1
            android.util.Pair r0 = r54.F(r55)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00d7
            r41 = r1
            java.lang.String r41 = (java.lang.String) r41
        L_0x00d7:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x009e
            r2.m$b r0 = (r2.m.b) r0
            r11.add(r0)
            goto L_0x009e
        L_0x00e1:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = k4.o0.f(r14, r0)
            if (r0 == 0) goto L_0x011b
            r1 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r12)
            r15 = r38
            java.lang.String r0 = q(r15, r0)
            int r15 = r54.G(r55)
            r13 = r36
            int r13 = p(r13, r15)
            r53 = r0
            r52 = r1
            r42 = r2
            r36 = r4
            r15 = r5
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r51 = r13
            r3 = r17
        L_0x0117:
            r0 = r60
            goto L_0x02c6
        L_0x011b:
            r13 = r36
            r15 = r38
            r1 = 0
            java.lang.String r0 = "Role"
            boolean r16 = k4.o0.f(r14, r0)
            if (r16 == 0) goto L_0x0130
            t3.e r0 = I(r14, r0)
            r8.add(r0)
            goto L_0x013e
        L_0x0130:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = k4.o0.f(r14, r0)
            if (r0 == 0) goto L_0x015b
            int r0 = r54.A(r55)
            r37 = r0
        L_0x013e:
            r52 = r1
            r42 = r2
            r36 = r4
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r51 = r13
            r53 = r15
            r3 = r17
            r0 = r60
            r15 = r5
            goto L_0x02c6
        L_0x015b:
            java.lang.String r0 = "Accessibility"
            boolean r16 = k4.o0.f(r14, r0)
            if (r16 == 0) goto L_0x016b
            t3.e r0 = I(r14, r0)
            r9.add(r0)
            goto L_0x013e
        L_0x016b:
            java.lang.String r0 = "EssentialProperty"
            boolean r16 = k4.o0.f(r14, r0)
            if (r16 == 0) goto L_0x017b
            t3.e r0 = I(r14, r0)
            r7.add(r0)
            goto L_0x013e
        L_0x017b:
            java.lang.String r0 = "SupplementalProperty"
            boolean r16 = k4.o0.f(r14, r0)
            if (r16 == 0) goto L_0x018b
            t3.e r0 = I(r14, r0)
            r6.add(r0)
            goto L_0x013e
        L_0x018b:
            java.lang.String r0 = "Representation"
            boolean r0 = k4.o0.f(r14, r0)
            if (r0 == 0) goto L_0x0204
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x019c
            r16 = r4
            goto L_0x019e
        L_0x019c:
            r16 = r56
        L_0x019e:
            r0 = r54
            r18 = r1
            r1 = r55
            r42 = r2
            r2 = r16
            r3 = r28
            r36 = r4
            r4 = r29
            r44 = r5
            r5 = r30
            r38 = r6
            r6 = r31
            r45 = r7
            r7 = r32
            r46 = r8
            r8 = r37
            r47 = r9
            r9 = r33
            r48 = r17
            r10 = r15
            r49 = r11
            r11 = r46
            r50 = r12
            r12 = r47
            r51 = r13
            r52 = r18
            r13 = r45
            r14 = r38
            r53 = r15
            r15 = r35
            r16 = r64
            r18 = r58
            r20 = r42
            r22 = r60
            r24 = r66
            r26 = r68
            t3.d$a r0 = r0.e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26)
            n2.r1 r1 = r0.f22604a
            java.lang.String r1 = r1.f20654m
            int r1 = k4.v.k(r1)
            r14 = r51
            int r1 = p(r14, r1)
            r15 = r44
            r15.add(r0)
            r14 = r55
            r51 = r1
            r3 = r48
            goto L_0x0117
        L_0x0204:
            r52 = r1
            r42 = r2
            r36 = r4
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r14 = r13
            r53 = r15
            r48 = r17
            r15 = r5
            java.lang.String r0 = "SegmentBase"
            r13 = r55
            boolean r0 = k4.o0.f(r13, r0)
            if (r0 == 0) goto L_0x023b
            r0 = r35
            t3.k$e r0 = (t3.k.e) r0
            r11 = r54
            t3.k$e r0 = r11.j0(r13, r0)
            r35 = r0
            r51 = r14
            r3 = r48
            r0 = r60
            r14 = r13
            goto L_0x02c6
        L_0x023b:
            r11 = r54
            java.lang.String r0 = "SegmentList"
            boolean r0 = k4.o0.f(r13, r0)
            if (r0 == 0) goto L_0x026c
            r0 = r60
            long r16 = r11.B(r13, r0)
            r2 = r35
            t3.k$b r2 = (t3.k.b) r2
            r0 = r54
            r1 = r55
            r3 = r64
            r5 = r58
            r7 = r42
            r9 = r16
            r51 = r14
            r14 = r11
            r11 = r66
            t3.k$b r0 = r0.k0(r1, r2, r3, r5, r7, r9, r11)
            r35 = r0
            r14 = r13
        L_0x0267:
            r0 = r16
            r3 = r48
            goto L_0x02c6
        L_0x026c:
            r0 = r60
            r51 = r14
            r14 = r11
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = k4.o0.f(r13, r2)
            if (r2 == 0) goto L_0x0299
            long r16 = r14.B(r13, r0)
            r2 = r35
            t3.k$c r2 = (t3.k.c) r2
            r0 = r54
            r1 = r55
            r3 = r38
            r4 = r64
            r6 = r58
            r8 = r42
            r10 = r16
            r14 = r13
            r12 = r66
            t3.k$c r0 = r0.l0(r1, r2, r3, r4, r6, r8, r10, r12)
            r35 = r0
            goto L_0x0267
        L_0x0299:
            r14 = r13
            java.lang.String r2 = "InbandEventStream"
            boolean r3 = k4.o0.f(r14, r2)
            if (r3 == 0) goto L_0x02ac
            t3.e r2 = I(r14, r2)
            r3 = r48
            r3.add(r2)
            goto L_0x02c6
        L_0x02ac:
            r3 = r48
            java.lang.String r2 = "Label"
            boolean r2 = k4.o0.f(r14, r2)
            if (r2 == 0) goto L_0x02bd
            java.lang.String r2 = r54.V(r55)
            r39 = r2
            goto L_0x02c6
        L_0x02bd:
            boolean r2 = k4.o0.e(r55)
            if (r2 == 0) goto L_0x02c6
            r54.z(r55)
        L_0x02c6:
            java.lang.String r2 = "AdaptationSet"
            boolean r2 = k4.o0.d(r14, r2)
            if (r2 == 0) goto L_0x030d
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            r1 = 0
        L_0x02d8:
            int r2 = r15.size()
            if (r1 >= r2) goto L_0x02fa
            java.lang.Object r2 = r15.get(r1)
            t3.d$a r2 = (t3.d.a) r2
            r55 = r54
            r56 = r2
            r57 = r39
            r58 = r41
            r59 = r49
            r60 = r3
            t3.j r2 = r55.j(r56, r57, r58, r59, r60)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x02d8
        L_0x02fa:
            r55 = r54
            r56 = r27
            r57 = r51
            r58 = r0
            r59 = r47
            r60 = r45
            r61 = r38
            t3.a r0 = r55.c(r56, r57, r58, r59, r60, r61)
            return r0
        L_0x030d:
            r10 = r3
            r5 = r15
            r4 = r36
            r6 = r38
            r2 = r42
            r7 = r45
            r8 = r46
            r9 = r47
            r11 = r49
            r12 = r50
            r36 = r51
            r13 = r52
            r38 = r53
            r15 = r54
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, t3.k, long, long, long, long, long, boolean):t3.a");
    }

    /* access modifiers changed from: protected */
    public void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }
}
