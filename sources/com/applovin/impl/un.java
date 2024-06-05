package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public abstract class un {
    public static Boolean a(int i10, String str) {
        if (!a(str)) {
            return null;
        }
        String[] split = str.split("~", -1);
        List asList = Arrays.asList(split[1].split("\\."));
        String valueOf = String.valueOf(i10);
        boolean contains = asList.contains(valueOf);
        if (split[0].equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
            return Boolean.valueOf(contains);
        }
        if (contains) {
            return Boolean.TRUE;
        }
        if (Arrays.asList(split[2].split("\\.")).contains(valueOf)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String c10 : str.split("\\.")) {
            if (!c(c10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[a-zA-Z\\d_-]*$");
    }

    public static boolean a(String str, int i10) {
        if (str == null || i10 < 0 || str.length() <= i10 || str.charAt(i10) != '1') {
            return false;
        }
        return true;
    }

    public static boolean a(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        String[] split = str.split("~", -1);
        if (split.length == 2 && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(split[0])) {
            return Pattern.matches("(\\d+(\\.\\d+)*)?", split[1]);
        }
        if (split.length != 3 || !CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(split[0]) || !Pattern.matches("(\\d+(\\.\\d+)*)?", split[1]) || split[2].length() < 3 || !split[2].startsWith("dv.") || !Pattern.matches("(\\d+(\\.\\d+)*)?", split[2].substring(3))) {
            return false;
        }
        return true;
    }
}
