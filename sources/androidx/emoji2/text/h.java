package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;

/* compiled from: EmojiProcessor */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final e.i f3371a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3372b;

    /* renamed from: c  reason: collision with root package name */
    private e.d f3373c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3374d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f3375e;

    /* compiled from: EmojiProcessor */
    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z10) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i11--;
                            i10 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i11--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z10 = true;
                        }
                    } else if (z10) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* compiled from: EmojiProcessor */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f3376a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final m.a f3377b;

        /* renamed from: c  reason: collision with root package name */
        private m.a f3378c;

        /* renamed from: d  reason: collision with root package name */
        private m.a f3379d;

        /* renamed from: e  reason: collision with root package name */
        private int f3380e;

        /* renamed from: f  reason: collision with root package name */
        private int f3381f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f3382g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f3383h;

        b(m.a aVar, boolean z10, int[] iArr) {
            this.f3377b = aVar;
            this.f3378c = aVar;
            this.f3382g = z10;
            this.f3383h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f3376a = 1;
            this.f3378c = this.f3377b;
            this.f3381f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f3378c.b().j() || d(this.f3380e)) {
                return true;
            }
            if (this.f3382g) {
                if (this.f3383h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3383h, this.f3378c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int a(int i10) {
            m.a a10 = this.f3378c.a(i10);
            int i11 = 3;
            if (this.f3376a != 2) {
                if (a10 == null) {
                    i11 = g();
                    this.f3380e = i10;
                    return i11;
                }
                this.f3376a = 2;
                this.f3378c = a10;
                this.f3381f = 1;
            } else if (a10 != null) {
                this.f3378c = a10;
                this.f3381f++;
            } else {
                if (f(i10)) {
                    i11 = g();
                } else if (!d(i10)) {
                    if (this.f3378c.b() == null) {
                        i11 = g();
                    } else if (this.f3381f != 1) {
                        this.f3379d = this.f3378c;
                        g();
                    } else if (h()) {
                        this.f3379d = this.f3378c;
                        g();
                    } else {
                        i11 = g();
                    }
                }
                this.f3380e = i10;
                return i11;
            }
            i11 = 2;
            this.f3380e = i10;
            return i11;
        }

        /* access modifiers changed from: package-private */
        public g b() {
            return this.f3378c.b();
        }

        /* access modifiers changed from: package-private */
        public g c() {
            return this.f3379d.b();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            if (this.f3376a != 2 || this.f3378c.b() == null || (this.f3381f <= 1 && !h())) {
                return false;
            }
            return true;
        }
    }

    h(m mVar, e.i iVar, e.d dVar, boolean z10, int[] iArr) {
        this.f3371a = iVar;
        this.f3372b = mVar;
        this.f3373c = dVar;
        this.f3374d = z10;
        this.f3375e = iArr;
    }

    private void a(Spannable spannable, g gVar, int i10, int i11) {
        spannable.setSpan(this.f3371a.a(gVar), i10, i11, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            int length = iVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                i iVar = iVarArr[i10];
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((!z10 || spanStart != selectionStart) && ((z10 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                i13 = a.a(editable, selectionStart, Math.max(i10, 0));
                i12 = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (i13 == -1 || i12 == -1) {
                    return false;
                }
            } else {
                i13 = Math.max(selectionStart - i10, 0);
                i12 = Math.min(selectionEnd + i11, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(i13, i12, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    i13 = Math.min(spanStart, i13);
                    i12 = Math.max(spanEnd, i12);
                }
                int max = Math.max(i13, 0);
                int min = Math.min(i12, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 != 67) {
            z10 = i10 != 112 ? false : b(editable, keyEvent, true);
        } else {
            z10 = b(editable, keyEvent, false);
        }
        if (!z10) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i10, int i11, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f3373c.a(charSequence, i10, i11, gVar.h()));
        }
        return gVar.d() == 2;
    }

    private static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.n
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji2.text.n r1 = (androidx.emoji2.text.n) r1
            r1.a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0033
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x012c }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.i> r5 = androidx.emoji2.text.i.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x012c }
            if (r2 > r12) goto L_0x0033
            androidx.emoji2.text.p r1 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r1.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            goto L_0x0033
        L_0x002b:
            androidx.emoji2.text.p r1 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch:{ all -> 0x012c }
            r1.<init>((android.text.Spannable) r2)     // Catch:{ all -> 0x012c }
        L_0x0033:
            r2 = 0
            if (r1 == 0) goto L_0x0061
            java.lang.Class<androidx.emoji2.text.i> r3 = androidx.emoji2.text.i.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.i[] r3 = (androidx.emoji2.text.i[]) r3     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            if (r4 <= 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            r5 = 0
        L_0x0045:
            if (r5 >= r4) goto L_0x0061
            r6 = r3[r5]     // Catch:{ all -> 0x012c }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x012c }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x012c }
            if (r7 == r12) goto L_0x0056
            r1.removeSpan(r6)     // Catch:{ all -> 0x012c }
        L_0x0056:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x012c }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x012c }
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            if (r11 == r12) goto L_0x0123
            int r3 = r10.length()     // Catch:{ all -> 0x012c }
            if (r11 < r3) goto L_0x006b
            goto L_0x0123
        L_0x006b:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            int r3 = r1.length()     // Catch:{ all -> 0x012c }
            java.lang.Class<androidx.emoji2.text.i> r4 = androidx.emoji2.text.i.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.i[] r3 = (androidx.emoji2.text.i[]) r3     // Catch:{ all -> 0x012c }
            int r3 = r3.length     // Catch:{ all -> 0x012c }
            int r13 = r13 - r3
        L_0x0080:
            androidx.emoji2.text.h$b r3 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.m r4 = r9.f3372b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.m$a r4 = r4.f()     // Catch:{ all -> 0x012c }
            boolean r5 = r9.f3374d     // Catch:{ all -> 0x012c }
            int[] r6 = r9.f3375e     // Catch:{ all -> 0x012c }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x012c }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            r2 = r1
            r5 = r4
            r4 = 0
        L_0x0096:
            r1 = r11
        L_0x0097:
            if (r11 >= r12) goto L_0x00e9
            if (r4 >= r13) goto L_0x00e9
            int r6 = r3.a(r5)     // Catch:{ all -> 0x012c }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r14 != 0) goto L_0x00b5
            androidx.emoji2.text.g r6 = r3.c()     // Catch:{ all -> 0x012c }
            boolean r6 = r9.e(r10, r1, r11, r6)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r2 != 0) goto L_0x00c1
            androidx.emoji2.text.p r2 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x012c }
            r6.<init>(r10)     // Catch:{ all -> 0x012c }
            r2.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x012c }
        L_0x00c1:
            androidx.emoji2.text.g r6 = r3.c()     // Catch:{ all -> 0x012c }
            r9.a(r2, r6, r1, r11)     // Catch:{ all -> 0x012c }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x012c }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            goto L_0x0097
        L_0x00d7:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x012c }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00e7
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            r5 = r11
        L_0x00e7:
            r11 = r1
            goto L_0x0097
        L_0x00e9:
            boolean r12 = r3.e()     // Catch:{ all -> 0x012c }
            if (r12 == 0) goto L_0x010c
            if (r4 >= r13) goto L_0x010c
            if (r14 != 0) goto L_0x00fd
            androidx.emoji2.text.g r12 = r3.b()     // Catch:{ all -> 0x012c }
            boolean r12 = r9.e(r10, r1, r11, r12)     // Catch:{ all -> 0x012c }
            if (r12 != 0) goto L_0x010c
        L_0x00fd:
            if (r2 != 0) goto L_0x0105
            androidx.emoji2.text.p r12 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r12.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            r2 = r12
        L_0x0105:
            androidx.emoji2.text.g r12 = r3.b()     // Catch:{ all -> 0x012c }
            r9.a(r2, r12, r1, r11)     // Catch:{ all -> 0x012c }
        L_0x010c:
            if (r2 == 0) goto L_0x011a
            android.text.Spannable r11 = r2.b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0119
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.n) r10
            r10.d()
        L_0x0119:
            return r11
        L_0x011a:
            if (r0 == 0) goto L_0x0122
            r11 = r10
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
            r11.d()
        L_0x0122:
            return r10
        L_0x0123:
            if (r0 == 0) goto L_0x012b
            r11 = r10
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
            r11.d()
        L_0x012b:
            return r10
        L_0x012c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0134
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.n) r10
            r10.d()
        L_0x0134:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
