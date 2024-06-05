package x3;

import a3.l;
import a3.p;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import j4.j0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k4.n0;
import n2.r1;
import n2.y2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r2.m;
import x3.a;

/* compiled from: SsManifestParser */
public class b implements j0.a<a> {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f23647a;

    /* compiled from: SsManifestParser */
    private static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f23648a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23649b;

        /* renamed from: c  reason: collision with root package name */
        private final a f23650c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<String, Object>> f23651d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f23650c = aVar;
            this.f23648a = str;
            this.f23649b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void a(Object obj) {
        }

        /* access modifiers changed from: protected */
        public abstract Object b();

        /* access modifiers changed from: protected */
        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f23651d.size(); i10++) {
                Pair pair = this.f23651d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f23650c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        /* access modifiers changed from: protected */
        public boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f23649b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f23648a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* access modifiers changed from: protected */
        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        /* access modifiers changed from: protected */
        public void h(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public final int i(XmlPullParser xmlPullParser, String str, int i10) throws y2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw y2.c((String) null, e10);
            }
        }

        /* access modifiers changed from: protected */
        public final long j(XmlPullParser xmlPullParser, String str, long j10) throws y2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw y2.c((String) null, e10);
            }
        }

        /* access modifiers changed from: protected */
        public final int k(XmlPullParser xmlPullParser, String str) throws y2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw y2.c((String) null, e10);
                }
            } else {
                throw new C0247b(str);
            }
        }

        /* access modifiers changed from: protected */
        public final long l(XmlPullParser xmlPullParser, String str) throws y2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw y2.c((String) null, e10);
                }
            } else {
                throw new C0247b(str);
            }
        }

        /* access modifiers changed from: protected */
        public final String m(XmlPullParser xmlPullParser, String str) throws C0247b {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0247b(str);
        }

        /* access modifiers changed from: protected */
        public abstract void n(XmlPullParser xmlPullParser) throws y2;

        /* access modifiers changed from: protected */
        public void o(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public final void p(String str, Object obj) {
            this.f23651d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: x3.b$b  reason: collision with other inner class name */
    /* compiled from: SsManifestParser */
    public static class C0247b extends y2 {
        public C0247b(String str) {
            super("Missing required field: " + str, (Throwable) null, true, 4);
        }
    }

    /* compiled from: SsManifestParser */
    private static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f23652e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f23653f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f23654g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, (String) null, 8, r(bArr), 0, 0, (byte[]) null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        public Object b() {
            UUID uuid = this.f23653f;
            return new a.C0246a(uuid, l.a(uuid, this.f23654g), q(this.f23654g));
        }

        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f23652e = false;
            }
        }

        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f23652e = true;
                this.f23653f = UUID.fromString(s(xmlPullParser.getAttributeValue((String) null, "SystemID")));
            }
        }

        public void o(XmlPullParser xmlPullParser) {
            if (this.f23652e) {
                this.f23654g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* compiled from: SsManifestParser */
    private static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private r1 f23655e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = n0.J(str);
                byte[][] i10 = k4.e.i(J);
                if (i10 == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return MimeTypes.VIDEO_H264;
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        public Object b() {
            return this.f23655e;
        }

        public void n(XmlPullParser xmlPullParser) throws y2 {
            r1.b bVar = new r1.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.M("video/mp4").n0(k(xmlPullParser, "MaxWidth")).S(k(xmlPullParser, "MaxHeight")).V(q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q10 = q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(p2.a.a(k11, k10));
                }
                bVar.M("audio/mp4").J(k10).h0(k11).V(q10);
            } else if (intValue == 3) {
                int i10 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                }
                bVar.M("application/mp4").e0(i10);
            } else {
                bVar.M("application/mp4");
            }
            this.f23655e = bVar.U(xmlPullParser.getAttributeValue((String) null, "Index")).W((String) c("Name")).g0(r10).I(k(xmlPullParser, "Bitrate")).X((String) c("Language")).G();
        }
    }

    /* compiled from: SsManifestParser */
    private static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List<a.b> f23656e = new LinkedList();

        /* renamed from: f  reason: collision with root package name */
        private int f23657f;

        /* renamed from: g  reason: collision with root package name */
        private int f23658g;

        /* renamed from: h  reason: collision with root package name */
        private long f23659h;

        /* renamed from: i  reason: collision with root package name */
        private long f23660i;

        /* renamed from: j  reason: collision with root package name */
        private long f23661j;

        /* renamed from: k  reason: collision with root package name */
        private int f23662k = -1;

        /* renamed from: l  reason: collision with root package name */
        private boolean f23663l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0246a f23664m = null;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f23656e.add((a.b) obj);
            } else if (obj instanceof a.C0246a) {
                k4.a.f(this.f23664m == null);
                this.f23664m = (a.C0246a) obj;
            }
        }

        public Object b() {
            int size = this.f23656e.size();
            a.b[] bVarArr = new a.b[size];
            this.f23656e.toArray(bVarArr);
            if (this.f23664m != null) {
                a.C0246a aVar = this.f23664m;
                m mVar = new m(new m.b(aVar.f23628a, "video/mp4", aVar.f23629b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f23631a;
                    if (i11 == 2 || i11 == 1) {
                        r1[] r1VarArr = bVar.f23640j;
                        for (int i12 = 0; i12 < r1VarArr.length; i12++) {
                            r1VarArr[i12] = r1VarArr[i12].b().O(mVar).G();
                        }
                    }
                }
            }
            return new a(this.f23657f, this.f23658g, this.f23659h, this.f23660i, this.f23661j, this.f23662k, this.f23663l, this.f23664m, bVarArr);
        }

        public void n(XmlPullParser xmlPullParser) throws y2 {
            this.f23657f = k(xmlPullParser, "MajorVersion");
            this.f23658g = k(xmlPullParser, "MinorVersion");
            this.f23659h = j(xmlPullParser, "TimeScale", 10000000);
            this.f23660i = l(xmlPullParser, "Duration");
            this.f23661j = j(xmlPullParser, "DVRWindowLength", 0);
            this.f23662k = i(xmlPullParser, "LookaheadCount", -1);
            this.f23663l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f23659h));
        }
    }

    /* compiled from: SsManifestParser */
    private static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f23665e;

        /* renamed from: f  reason: collision with root package name */
        private final List<r1> f23666f = new LinkedList();

        /* renamed from: g  reason: collision with root package name */
        private int f23667g;

        /* renamed from: h  reason: collision with root package name */
        private String f23668h;

        /* renamed from: i  reason: collision with root package name */
        private long f23669i;

        /* renamed from: j  reason: collision with root package name */
        private String f23670j;

        /* renamed from: k  reason: collision with root package name */
        private String f23671k;

        /* renamed from: l  reason: collision with root package name */
        private int f23672l;

        /* renamed from: m  reason: collision with root package name */
        private int f23673m;

        /* renamed from: n  reason: collision with root package name */
        private int f23674n;

        /* renamed from: o  reason: collision with root package name */
        private int f23675o;

        /* renamed from: p  reason: collision with root package name */
        private String f23676p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList<Long> f23677q;

        /* renamed from: r  reason: collision with root package name */
        private long f23678r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f23665e = str;
        }

        private void q(XmlPullParser xmlPullParser) throws y2 {
            int s10 = s(xmlPullParser);
            this.f23667g = s10;
            p("Type", Integer.valueOf(s10));
            if (this.f23667g == 3) {
                this.f23668h = m(xmlPullParser, "Subtype");
            } else {
                this.f23668h = xmlPullParser.getAttributeValue((String) null, "Subtype");
            }
            p("Subtype", this.f23668h);
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Name");
            this.f23670j = attributeValue;
            p("Name", attributeValue);
            this.f23671k = m(xmlPullParser, "Url");
            this.f23672l = i(xmlPullParser, "MaxWidth", -1);
            this.f23673m = i(xmlPullParser, "MaxHeight", -1);
            this.f23674n = i(xmlPullParser, "DisplayWidth", -1);
            this.f23675o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "Language");
            this.f23676p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = (long) i(xmlPullParser, "TimeScale", -1);
            this.f23669i = i10;
            if (i10 == -1) {
                this.f23669i = ((Long) c("TimeScale")).longValue();
            }
            this.f23677q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) throws y2 {
            int size = this.f23677q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else if (this.f23678r != -1) {
                    j10 = this.f23677q.get(size - 1).longValue() + this.f23678r;
                } else {
                    throw y2.c("Unable to infer start time", (Throwable) null);
                }
            }
            this.f23677q.add(Long.valueOf(j10));
            this.f23678r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 1);
            if (j11 <= 1 || this.f23678r != -9223372036854775807L) {
                while (true) {
                    long j12 = (long) i10;
                    if (j12 < j11) {
                        this.f23677q.add(Long.valueOf((this.f23678r * j12) + j10));
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                throw y2.c("Repeated chunk with unspecified duration", (Throwable) null);
            }
        }

        private int s(XmlPullParser xmlPullParser) throws y2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
            if (attributeValue == null) {
                throw new C0247b("Type");
            } else if (MimeTypes.BASE_TYPE_AUDIO.equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if (MimeTypes.BASE_TYPE_VIDEO.equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw y2.c("Invalid key value[" + attributeValue + "]", (Throwable) null);
            }
        }

        public void a(Object obj) {
            if (obj instanceof r1) {
                this.f23666f.add((r1) obj);
            }
        }

        public Object b() {
            r1[] r1VarArr = new r1[this.f23666f.size()];
            this.f23666f.toArray(r1VarArr);
            a.b bVar = r2;
            a.b bVar2 = new a.b(this.f23665e, this.f23671k, this.f23667g, this.f23668h, this.f23669i, this.f23670j, this.f23672l, this.f23673m, this.f23674n, this.f23675o, this.f23676p, r1VarArr, this.f23677q, this.f23678r);
            return bVar;
        }

        public boolean d(String str) {
            return "c".equals(str);
        }

        public void n(XmlPullParser xmlPullParser) throws y2 {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f23647a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: b */
    public a a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f23647a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (a) new e((a) null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw y2.c((String) null, e10);
        }
    }
}
