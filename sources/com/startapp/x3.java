package com.startapp;

import android.content.Context;

/* compiled from: Sta */
public class x3 extends w1<w3> {
    public x3(Context context) {
        super(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 11
            if (r0 >= r2) goto L_0x0009
            goto L_0x00a6
        L_0x0009:
            android.content.Context r0 = r9.f17478a
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.view.inputmethod.InputMethodManager
            if (r2 != 0) goto L_0x0017
            goto L_0x00a6
        L_0x0017:
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.view.inputmethod.InputMethodSubtype r2 = r0.getCurrentInputMethodSubtype()
            r3 = 10
            java.lang.String r4 = "keyboard"
            if (r2 == 0) goto L_0x0046
            java.lang.String r5 = r2.getMode()
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0046
            java.lang.String r2 = r2.getLocale()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x0046
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            int r6 = r5.size()
            if (r6 >= r3) goto L_0x0047
            r5.add(r2)
            goto L_0x0047
        L_0x0046:
            r5 = r1
        L_0x0047:
            java.util.List r2 = r0.getInputMethodList()
            if (r2 == 0) goto L_0x009f
            java.util.Iterator r2 = r2.iterator()
        L_0x0051:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x009f
            java.lang.Object r6 = r2.next()
            android.view.inputmethod.InputMethodInfo r6 = (android.view.inputmethod.InputMethodInfo) r6
            if (r6 != 0) goto L_0x0060
            goto L_0x0051
        L_0x0060:
            r7 = 1
            java.util.List r6 = r0.getEnabledInputMethodSubtypeList(r6, r7)
            if (r6 != 0) goto L_0x0068
            goto L_0x0051
        L_0x0068:
            java.util.Iterator r6 = r6.iterator()
        L_0x006c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0051
            java.lang.Object r7 = r6.next()
            android.view.inputmethod.InputMethodSubtype r7 = (android.view.inputmethod.InputMethodSubtype) r7
            if (r7 == 0) goto L_0x006c
            java.lang.String r8 = r7.getMode()
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x006c
            java.lang.String r7 = r7.getLocale()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x006c
            if (r5 != 0) goto L_0x0095
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
        L_0x0095:
            int r8 = r5.size()
            if (r8 >= r3) goto L_0x006c
            r5.add(r7)
            goto L_0x006c
        L_0x009f:
            if (r5 == 0) goto L_0x00a6
            com.startapp.w3 r1 = new com.startapp.w3
            r1.<init>(r5)
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.x3.a():java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object c() {
        return w3.f17483b;
    }
}
