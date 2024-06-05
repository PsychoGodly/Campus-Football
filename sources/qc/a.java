package qc;

/* compiled from: FlutterFirebaseFirestoreException */
public class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f37483a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37484b;

    /* renamed from: qc.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterFirebaseFirestoreException */
    static /* synthetic */ class C0426a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37485a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.z$a[] r0 = com.google.firebase.firestore.z.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37485a = r0
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.ABORTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.ALREADY_EXISTS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.DATA_LOSS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.DEADLINE_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.FAILED_PRECONDITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.OUT_OF_RANGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.RESOURCE_EXHAUSTED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNAUTHENTICATED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNIMPLEMENTED     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f37485a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.a.C0426a.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0153, code lost:
        r1 = "Operation is not implemented or not supported/enabled.";
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.google.firebase.firestore.z r28, java.lang.Throwable r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            if (r28 == 0) goto L_0x000b
            java.lang.String r2 = r28.getMessage()
            goto L_0x000d
        L_0x000b:
            java.lang.String r2 = ""
        L_0x000d:
            r0.<init>(r2, r1)
            java.lang.String r2 = "Operation was attempted past the valid range."
            java.lang.String r3 = "out-of-range"
            java.lang.String r4 = "Some requested document was not found."
            java.lang.String r5 = "not-found"
            java.lang.String r6 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name)."
            java.lang.String r7 = "invalid-argument"
            java.lang.String r8 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken."
            java.lang.String r9 = "internal"
            java.lang.String r10 = "failed-precondition"
            java.lang.String r11 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire."
            java.lang.String r12 = "deadline-exceeded"
            java.lang.String r13 = "Unrecoverable data loss or corruption."
            java.lang.String r14 = "data-loss"
            java.lang.String r15 = "The operation was cancelled (typically by the caller)."
            java.lang.String r16 = "cancelled"
            java.lang.String r17 = "Some document that we attempted to create already exists."
            java.lang.String r18 = "already-exists"
            java.lang.String r19 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc."
            java.lang.String r20 = "aborted"
            r21 = 0
            java.lang.String r22 = "unknown"
            java.lang.String r23 = "Operation is not implemented or not supported/enabled."
            if (r1 == 0) goto L_0x01a7
            java.lang.String r24 = r29.getMessage()
            if (r24 == 0) goto L_0x01a7
            java.lang.String r1 = r29.getMessage()
            r24 = r2
            java.lang.String r2 = ":"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x01a9
            java.lang.String r1 = r29.getMessage()
            java.lang.String r2 = "([A-Z_]{3,25}):\\s(.*)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x01a9
            r2 = 1
            java.lang.String r2 = r1.group(r2)
            java.lang.String r2 = r2.trim()
            r25 = r3
            r3 = 2
            java.lang.String r1 = r1.group(r3)
            java.lang.String r1 = r1.trim()
            r2.hashCode()
            int r26 = r2.hashCode()
            switch(r26) {
                case -1842427240: goto L_0x0141;
                case -1711692763: goto L_0x0135;
                case -1416305653: goto L_0x0129;
                case -1031784143: goto L_0x011d;
                case -1025686472: goto L_0x0111;
                case -849706474: goto L_0x0105;
                case -476794961: goto L_0x00fa;
                case -376214182: goto L_0x00ef;
                case 433141802: goto L_0x00e2;
                case 695165606: goto L_0x00d5;
                case 979228314: goto L_0x00c8;
                case 1023286998: goto L_0x00bb;
                case 1353037501: goto L_0x00ae;
                case 1487498288: goto L_0x00a1;
                case 1661336131: goto L_0x0094;
                case 1854913705: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r3 = -1
            goto L_0x014c
        L_0x0087:
            java.lang.String r3 = "UNIMPLEMENTED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0090
            goto L_0x0084
        L_0x0090:
            r3 = 15
            goto L_0x014c
        L_0x0094:
            java.lang.String r3 = "ALREADY_EXISTS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x009d
            goto L_0x0084
        L_0x009d:
            r3 = 14
            goto L_0x014c
        L_0x00a1:
            java.lang.String r3 = "UNAVAILABLE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00aa
            goto L_0x0084
        L_0x00aa:
            r3 = 13
            goto L_0x014c
        L_0x00ae:
            java.lang.String r3 = "INTERNAL"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00b7
            goto L_0x0084
        L_0x00b7:
            r3 = 12
            goto L_0x014c
        L_0x00bb:
            java.lang.String r3 = "NOT_FOUND"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c4
            goto L_0x0084
        L_0x00c4:
            r3 = 11
            goto L_0x014c
        L_0x00c8:
            java.lang.String r3 = "FAILED_PRECONDITION"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00d1
            goto L_0x0084
        L_0x00d1:
            r3 = 10
            goto L_0x014c
        L_0x00d5:
            java.lang.String r3 = "OUT_OF_RANGE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00de
            goto L_0x0084
        L_0x00de:
            r3 = 9
            goto L_0x014c
        L_0x00e2:
            java.lang.String r3 = "UNKNOWN"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00eb
            goto L_0x0084
        L_0x00eb:
            r3 = 8
            goto L_0x014c
        L_0x00ef:
            java.lang.String r3 = "DEADLINE_EXCEEDED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00f8
            goto L_0x0084
        L_0x00f8:
            r3 = 7
            goto L_0x014c
        L_0x00fa:
            java.lang.String r3 = "ABORTED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0103
            goto L_0x0084
        L_0x0103:
            r3 = 6
            goto L_0x014c
        L_0x0105:
            java.lang.String r3 = "UNAUTHENTICATED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x010f
            goto L_0x0084
        L_0x010f:
            r3 = 5
            goto L_0x014c
        L_0x0111:
            java.lang.String r3 = "RESOURCE_EXHAUSTED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x011b
            goto L_0x0084
        L_0x011b:
            r3 = 4
            goto L_0x014c
        L_0x011d:
            java.lang.String r3 = "CANCELLED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0127
            goto L_0x0084
        L_0x0127:
            r3 = 3
            goto L_0x014c
        L_0x0129:
            java.lang.String r3 = "PERMISSION_DENIED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0133
            goto L_0x0084
        L_0x0133:
            r3 = 2
            goto L_0x014c
        L_0x0135:
            java.lang.String r3 = "INVALID_ARGUMENT"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x013f
            goto L_0x0084
        L_0x013f:
            r3 = 1
            goto L_0x014c
        L_0x0141:
            java.lang.String r3 = "DATA_LOSS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x014b
            goto L_0x0084
        L_0x014b:
            r3 = 0
        L_0x014c:
            switch(r3) {
                case 0: goto L_0x01a3;
                case 1: goto L_0x019f;
                case 2: goto L_0x019a;
                case 3: goto L_0x0196;
                case 4: goto L_0x0191;
                case 5: goto L_0x018c;
                case 6: goto L_0x0187;
                case 7: goto L_0x0183;
                case 8: goto L_0x0180;
                case 9: goto L_0x017b;
                case 10: goto L_0x016b;
                case 11: goto L_0x0167;
                case 12: goto L_0x0163;
                case 13: goto L_0x015d;
                case 14: goto L_0x0157;
                case 15: goto L_0x0151;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x01ab
        L_0x0151:
            java.lang.String r21 = "unimplemented"
        L_0x0153:
            r1 = r23
            goto L_0x01ad
        L_0x0157:
            r1 = r17
            r21 = r18
            goto L_0x01ad
        L_0x015d:
            java.lang.String r21 = "unavailable"
            java.lang.String r1 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff."
            goto L_0x01ad
        L_0x0163:
            r1 = r8
            r21 = r9
            goto L_0x01ad
        L_0x0167:
            r1 = r4
            r21 = r5
            goto L_0x01ad
        L_0x016b:
            java.lang.String r2 = "index"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0174
            goto L_0x0178
        L_0x0174:
            java.lang.String r21 = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console."
            r1 = r21
        L_0x0178:
            r21 = r10
            goto L_0x01ad
        L_0x017b:
            r1 = r24
            r21 = r25
            goto L_0x01ad
        L_0x0180:
            r21 = r22
            goto L_0x0153
        L_0x0183:
            r1 = r11
            r21 = r12
            goto L_0x01ad
        L_0x0187:
            r1 = r19
            r21 = r20
            goto L_0x01ad
        L_0x018c:
            java.lang.String r21 = "unauthenticated"
            java.lang.String r1 = "The request does not have valid authentication credentials for the operation."
            goto L_0x01ad
        L_0x0191:
            java.lang.String r21 = "resource-exhausted"
            java.lang.String r1 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space."
            goto L_0x01ad
        L_0x0196:
            r1 = r15
            r21 = r16
            goto L_0x01ad
        L_0x019a:
            java.lang.String r21 = "permission-denied"
            java.lang.String r1 = "The caller does not have permission to execute the specified operation."
            goto L_0x01ad
        L_0x019f:
            r1 = r6
            r21 = r7
            goto L_0x01ad
        L_0x01a3:
            r1 = r13
            r21 = r14
            goto L_0x01ad
        L_0x01a7:
            r24 = r2
        L_0x01a9:
            r25 = r3
        L_0x01ab:
            r1 = r21
        L_0x01ad:
            if (r21 != 0) goto L_0x0231
            if (r28 == 0) goto L_0x0231
            int[] r1 = qc.a.C0426a.f37485a
            com.google.firebase.firestore.z$a r2 = r28.a()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L_0x022c;
                case 2: goto L_0x0227;
                case 3: goto L_0x0223;
                case 4: goto L_0x0220;
                case 5: goto L_0x021d;
                case 6: goto L_0x01f6;
                case 7: goto L_0x01f3;
                case 8: goto L_0x01f0;
                case 9: goto L_0x01ed;
                case 10: goto L_0x01e7;
                case 11: goto L_0x01e1;
                case 12: goto L_0x01db;
                case 13: goto L_0x01d5;
                case 14: goto L_0x01cf;
                case 15: goto L_0x01c9;
                case 16: goto L_0x01c3;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            java.lang.String r2 = "An unknown error occurred"
            goto L_0x01c5
        L_0x01c3:
            java.lang.String r2 = "Unknown error or an error from a different error domain."
        L_0x01c5:
            r3 = r22
            goto L_0x0234
        L_0x01c9:
            java.lang.String r3 = "unimplemented"
            r2 = r23
            goto L_0x0234
        L_0x01cf:
            java.lang.String r3 = "unavailable"
            java.lang.String r2 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff."
            goto L_0x0234
        L_0x01d5:
            java.lang.String r3 = "unauthenticated"
            java.lang.String r2 = "The request does not have valid authentication credentials for the operation."
            goto L_0x0234
        L_0x01db:
            java.lang.String r3 = "resource-exhausted"
            java.lang.String r2 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space."
            goto L_0x0234
        L_0x01e1:
            java.lang.String r3 = "permission-denied"
            java.lang.String r2 = "The caller does not have permission to execute the specified operation."
            goto L_0x0234
        L_0x01e7:
            r2 = r24
            r3 = r25
            goto L_0x0234
        L_0x01ed:
            r2 = r4
            r3 = r5
            goto L_0x0234
        L_0x01f0:
            r2 = r6
            r3 = r7
            goto L_0x0234
        L_0x01f3:
            r2 = r8
            r3 = r9
            goto L_0x0234
        L_0x01f6:
            java.lang.String r1 = r28.getMessage()
            if (r1 == 0) goto L_0x0208
            java.lang.String r1 = r28.getMessage()
            java.lang.String r2 = "query requires an index"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0214
        L_0x0208:
            java.lang.String r1 = r28.getMessage()
            java.lang.String r2 = "ensure it has been indexed"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x021a
        L_0x0214:
            java.lang.String r2 = r28.getMessage()
        L_0x0218:
            r3 = r10
            goto L_0x0234
        L_0x021a:
            java.lang.String r2 = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console."
            goto L_0x0218
        L_0x021d:
            r2 = r11
            r3 = r12
            goto L_0x0234
        L_0x0220:
            r2 = r13
            r3 = r14
            goto L_0x0234
        L_0x0223:
            r2 = r15
            r3 = r16
            goto L_0x0234
        L_0x0227:
            r2 = r17
            r3 = r18
            goto L_0x0234
        L_0x022c:
            r2 = r19
            r3 = r20
            goto L_0x0234
        L_0x0231:
            r2 = r1
            r3 = r21
        L_0x0234:
            r0.f37483a = r3
            r0.f37484b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.a.<init>(com.google.firebase.firestore.z, java.lang.Throwable):void");
    }

    public String a() {
        return this.f37483a;
    }

    public String getMessage() {
        return this.f37484b;
    }
}
