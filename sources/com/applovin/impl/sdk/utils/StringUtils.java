package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f12056a = "0123456789abcdef".toCharArray();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            instance.update(str.getBytes("UTF-8"));
            String hexString = toHexString(instance.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z10) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannable.setSpan(clickableSpan, start, end, 33);
            if (z10) {
                spannable.setSpan(new StyleSpan(1), start, end, 256);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z10) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z10) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        for (String contains : list) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11) {
        return createSpannedString(str, i10, i11, 0);
    }

    public static String emptyIfNull(String str) {
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public static String encodeUriString(String str) {
        return isValidString(str) ? Uri.encode(str) : MaxReward.DEFAULT_LABEL;
    }

    public static Boolean endsWith(String str, List<String> list) {
        for (String endsWith : list) {
            if (str.endsWith(endsWith)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        return Uri.parse(str).getHost();
    }

    public static String getHostAndPath(String str) {
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public static List<String> getRegexMatches(Matcher matcher, int i10) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(i10);
            if (isValidString(group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        int i10 = (charAt == '-' || charAt == '+') ? 1 : 0;
        int length = str.length();
        if (i10 == 1 && length == 1) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list == null || list.isEmpty()) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object append : list) {
            sb2.append(append);
            sb2.append(charSequence);
        }
        sb2.delete((sb2.length() - 1) - charSequence.length(), sb2.length());
        return sb2.toString();
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j10) {
        return isNumeric(str) ? Long.parseLong(str) : j10;
    }

    public static String prefixToIndex(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i10 > str.length()) {
            i10 = str.length();
        }
        return str.substring(0, i10);
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("No replacement target specified");
        } else if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            int indexOf = sb2.indexOf(str2);
            while (indexOf != -1) {
                sb2.replace(indexOf, str2.length() + indexOf, str3);
                indexOf = sb2.indexOf(str2, indexOf + str3.length());
            }
            return sb2.toString();
        }
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        for (String startsWith : list) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        String[] split = str.split("\\.");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (isValidString(str2)) {
                String[] split2 = str2.split("[^0-9]+");
                if (split2.length > 0) {
                    arrayList.add(split2[0]);
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr != null) {
            char[] cArr = new char[(bArr.length * 2)];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                int i11 = i10 * 2;
                char[] cArr2 = f12056a;
                byte b10 = bArr[i10];
                cArr[i11] = cArr2[(b10 & 240) >>> 4];
                cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
            }
            return new String(cArr);
        }
        throw new IllegalArgumentException("No data specified");
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb2.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String substring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb2.append(substring.toUpperCase(locale));
                    sb2.append(str2.substring(1).toLowerCase(locale));
                }
                sb2.append(" ");
            }
        }
        return sb2.deleteCharAt(sb2.length() - 1).toString();
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11, int i12) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i10), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i11, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i12), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static int parseInt(String str, int i10) {
        return isNumeric(str) ? Integer.parseInt(str) : i10;
    }

    public static String replace(String str, Map<String, String> map) {
        if (!(str == null || map == null)) {
            for (Map.Entry next : map.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }
}
