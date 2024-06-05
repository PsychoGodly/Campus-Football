package k4;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlPullParserUtil */
public final class o0 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (h(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean e(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return e(xmlPullParser) && h(xmlPullParser.getName()).equals(str);
    }

    private static String h(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
