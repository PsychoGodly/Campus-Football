package com.startapp;

/* compiled from: Sta */
public class bb {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r5 = (r5 = r4.getAttributes()).getNamedItem(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<org.w3c.dom.Node> a(org.w3c.dom.Node r6, java.lang.String r7, java.lang.String r8, java.util.List<java.lang.String> r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.w3c.dom.NodeList r6 = r6.getChildNodes()
            int r1 = r6.getLength()
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x004a
            org.w3c.dom.Node r4 = r6.item(r3)
            java.lang.String r5 = r4.getNodeName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0047
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x0041
            if (r9 != 0) goto L_0x0028
            goto L_0x0041
        L_0x0028:
            org.w3c.dom.NamedNodeMap r5 = r4.getAttributes()
            if (r5 == 0) goto L_0x003f
            org.w3c.dom.Node r5 = r5.getNamedItem(r8)
            if (r5 == 0) goto L_0x003f
            java.lang.String r5 = r5.getNodeValue()
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r5 = 0
            goto L_0x0042
        L_0x0041:
            r5 = 1
        L_0x0042:
            if (r5 == 0) goto L_0x0047
            r0.add(r4)
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.bb.a(org.w3c.dom.Node, java.lang.String, java.lang.String, java.util.List):java.util.List");
    }
}
