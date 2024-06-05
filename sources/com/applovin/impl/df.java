package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class df {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f7232a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f7233b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7234a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7235b;

        public a(int i10, int i11) {
            this.f7234a = i10;
            this.f7235b = i11;
        }

        public int a() {
            int i10 = this.f7235b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static String a(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i10 == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean a(String str, String str2) {
        a c10;
        int a10;
        if (str == null) {
            return false;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c11 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c11 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c11 = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c11 = 10;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (c10 = c(str2)) == null || (a10 = c10.a()) == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        a c10;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c11 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c11 = 8;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (c10 = c(str2)) == null) {
                    return 0;
                }
                return c10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    static a c(String str) {
        Matcher matcher = f7233b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) a1.a((Object) matcher.group(1));
        String group = matcher.group(2);
        int i10 = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            }
            return new a(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String d(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return f(str);
    }

    private static int f(String str) {
        ArrayList arrayList = f7232a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        b8.a(arrayList.get(0));
        throw null;
    }

    public static boolean g(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(d(str));
    }

    public static boolean h(String str) {
        return "text".equals(d(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean i(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(d(str));
    }

    public static String j(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }

    private static String a(String str) {
        ArrayList arrayList = f7232a;
        if (arrayList.size() <= 0) {
            return null;
        }
        b8.a(arrayList.get(0));
        throw null;
    }

    public static String b(String str) {
        a c10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (c10 = c(lowerCase)) != null) {
                str2 = a(c10.f7234a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (lowerCase.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (lowerCase.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (lowerCase.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (lowerCase.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (lowerCase.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (lowerCase.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (lowerCase.startsWith("opus")) {
                return "audio/opus";
            }
            if (lowerCase.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (lowerCase.startsWith("flac")) {
                return "audio/flac";
            }
            if (lowerCase.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (lowerCase.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (lowerCase.contains("cea708")) {
                return "application/cea-708";
            }
            return (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : a(lowerCase);
        }
    }
}
