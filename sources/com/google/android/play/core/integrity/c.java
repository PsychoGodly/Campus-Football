package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class c extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f26039a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f26040b;

    /* synthetic */ c(String str, Long l10, b bVar) {
        this.f26039a = str;
        this.f26040b = l10;
    }

    public final Long cloudProjectNumber() {
        return this.f26040b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f26040b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.play.core.integrity.IntegrityTokenRequest r5 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r5
            java.lang.String r1 = r4.f26039a
            java.lang.String r3 = r5.nonce()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            java.lang.Long r1 = r4.f26040b
            if (r1 != 0) goto L_0x0022
            java.lang.Long r5 = r5.cloudProjectNumber()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            java.lang.Long r5 = r5.cloudProjectNumber()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f26039a.hashCode() ^ 1000003;
        Long l10 = this.f26040b;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        return (hashCode * 1000003) ^ i10;
    }

    public final String nonce() {
        return this.f26039a;
    }

    public final String toString() {
        String str = this.f26039a;
        Long l10 = this.f26040b;
        return "IntegrityTokenRequest{nonce=" + str + ", cloudProjectNumber=" + l10 + "}";
    }
}
