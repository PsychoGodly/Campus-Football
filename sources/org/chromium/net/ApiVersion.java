package org.chromium.net;

public class ApiVersion {
    private static final int API_LEVEL = 12;
    private static final String CRONET_VERSION = "72.0.3626.96";
    private static final String LAST_CHANGE = "84098ee7ef8622a9defc2ef043cd8930b617b10e-refs/branch-heads/3626@{#836}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "72.0.3626.96@" + "84098ee7";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 12;
    }
}
