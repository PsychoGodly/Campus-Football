package x2;

import java.io.IOException;
import java.io.StringReader;
import k4.o0;
import k4.r;
import n2.y2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s6.u;
import x2.b;

/* compiled from: XmpMotionPhotoDescriptionParser */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f23617a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f23618b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f23619c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (NumberFormatException | y2 | XmlPullParserException unused) {
            r.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (o0.f(newPullParser, "x:xmpmeta")) {
            long j10 = -9223372036854775807L;
            u<b.a> y10 = u.y();
            do {
                newPullParser.next();
                if (o0.f(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    y10 = c(newPullParser);
                } else if (o0.f(newPullParser, "Container:Directory")) {
                    y10 = f(newPullParser, "Container", "Item");
                } else if (o0.f(newPullParser, "GContainer:Directory")) {
                    y10 = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!o0.d(newPullParser, "x:xmpmeta"));
            if (y10.isEmpty()) {
                return null;
            }
            return new b(j10, y10);
        }
        throw y2.a("Couldn't find xmp metadata", (Throwable) null);
    }

    private static u<b.a> c(XmlPullParser xmlPullParser) {
        for (String a10 : f23619c) {
            String a11 = o0.a(xmlPullParser, a10);
            if (a11 != null) {
                return u.A(new b.a("image/jpeg", "Primary", 0, 0), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0));
            }
        }
        return u.y();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        String[] strArr = f23617a;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String a10 = o0.a(xmlPullParser, strArr[i10]);
            if (a10 == null) {
                i10++;
            } else if (Integer.parseInt(a10) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String a10 : f23618b) {
            String a11 = o0.a(xmlPullParser, a10);
            if (a11 != null) {
                long parseLong = Long.parseLong(a11);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static u<b.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        u.a p10 = u.p();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, str3)) {
                String a10 = o0.a(xmlPullParser, str2 + ":Mime");
                String a11 = o0.a(xmlPullParser, str2 + ":Semantic");
                String a12 = o0.a(xmlPullParser, str2 + ":Length");
                String a13 = o0.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return u.y();
                }
                p10.a(new b.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0, a13 != null ? Long.parseLong(a13) : 0));
            }
        } while (!o0.d(xmlPullParser, str4));
        return p10.k();
    }
}
