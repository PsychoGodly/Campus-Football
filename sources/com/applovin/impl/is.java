package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.hf;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

abstract class is {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f8597a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f8598b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f8599c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static hf a(String str) {
        try {
            return b(str);
        } catch (ah | NumberFormatException | XmlPullParserException unused) {
            kc.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static hf b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (hs.c(newPullParser, "x:xmpmeta")) {
            long j10 = -9223372036854775807L;
            ab h10 = ab.h();
            do {
                newPullParser.next();
                if (hs.c(newPullParser, "rdf:Description")) {
                    if (!b(newPullParser)) {
                        return null;
                    }
                    j10 = c(newPullParser);
                    h10 = a(newPullParser);
                } else if (hs.c(newPullParser, "Container:Directory")) {
                    h10 = a(newPullParser, "Container", "Item");
                } else if (hs.c(newPullParser, "GContainer:Directory")) {
                    h10 = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!hs.b(newPullParser, "x:xmpmeta"));
            if (h10.isEmpty()) {
                return null;
            }
            return new hf(j10, h10);
        }
        throw ah.a("Couldn't find xmp metadata", (Throwable) null);
    }

    private static long c(XmlPullParser xmlPullParser) {
        for (String a10 : f8598b) {
            String a11 = hs.a(xmlPullParser, a10);
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

    private static ab a(XmlPullParser xmlPullParser) {
        for (String a10 : f8599c) {
            String a11 = hs.a(xmlPullParser, a10);
            if (a11 != null) {
                return ab.a((Object) new hf.a("image/jpeg", "Primary", 0, 0), (Object) new hf.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0));
            }
        }
        return ab.h();
    }

    private static ab a(XmlPullParser xmlPullParser, String str, String str2) {
        ab.a f10 = ab.f();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, str3)) {
                String a10 = hs.a(xmlPullParser, str2 + ":Mime");
                String a11 = hs.a(xmlPullParser, str2 + ":Semantic");
                String a12 = hs.a(xmlPullParser, str2 + ":Length");
                String a13 = hs.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return ab.h();
                }
                f10.b(new hf.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0, a13 != null ? Long.parseLong(a13) : 0));
            }
        } while (!hs.b(xmlPullParser, str4));
        return f10.a();
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        String[] strArr = f8597a;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String a10 = hs.a(xmlPullParser, strArr[i10]);
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
}
