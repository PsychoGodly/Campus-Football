package com.unity3d.services.ads.gmascar.managers;

public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");
    
    private final String name;

    private static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }

    private ScarBiddingManagerType(String str) {
        this.name = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType fromName(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 99470(0x1848e, float:1.39387E-40)
            if (r0 == r1) goto L_0x0019
            r1 = 100171(0x1874b, float:1.4037E-40)
            if (r0 == r1) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "eag"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0023
            r2 = 0
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "dis"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = -1
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType r2 = DISABLED
            return r2
        L_0x0029:
            com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType r2 = EAGER
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.fromName(java.lang.String):com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType");
    }

    public String getName() {
        return this.name;
    }
}
