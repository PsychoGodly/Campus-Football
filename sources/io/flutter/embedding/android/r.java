package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.n;
import io.flutter.embedding.android.s;
import io.flutter.embedding.android.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lc.c;

/* compiled from: KeyEmbedderResponder */
public class r implements s.d {

    /* renamed from: a  reason: collision with root package name */
    private final c f33496a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Long, Long> f33497b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Long, t.e> f33498c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final s.b f33499d = new s.b();

    /* compiled from: KeyEmbedderResponder */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33500a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.flutter.embedding.android.n$a[] r0 = io.flutter.embedding.android.n.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33500a = r0
                io.flutter.embedding.android.n$a r1 = io.flutter.embedding.android.n.a.kDown     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33500a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.n$a r1 = io.flutter.embedding.android.n.a.kUp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33500a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.android.n$a r1 = io.flutter.embedding.android.n.a.kRepeat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.r.a.<clinit>():void");
        }
    }

    public r(c cVar) {
        this.f33496a = cVar;
        for (t.e eVar : t.a()) {
            this.f33498c.put(Long.valueOf(eVar.f33520c), eVar);
        }
    }

    private static n.a e(KeyEvent keyEvent) {
        boolean z10 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z10 ? n.a.kRepeat : n.a.kDown;
        }
        if (action == 1) {
            return n.a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long f(KeyEvent keyEvent) {
        Long l10 = t.f33512b.get(Long.valueOf((long) keyEvent.getKeyCode()));
        if (l10 != null) {
            return l10;
        }
        return Long.valueOf(j((long) keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        long scanCode = (long) keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(j((long) keyEvent.getKeyCode(), 73014444032L));
        }
        Long l10 = t.f33511a.get(Long.valueOf(scanCode));
        if (l10 != null) {
            return l10;
        }
        return Long.valueOf(j((long) keyEvent.getScanCode(), 73014444032L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011a A[LOOP:2: B:53:0x0114->B:55:0x011a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i(android.view.KeyEvent r18, io.flutter.embedding.android.s.d.a r19) {
        /*
            r17 = this;
            r9 = r17
            int r0 = r18.getScanCode()
            r10 = 0
            if (r0 != 0) goto L_0x0010
            int r0 = r18.getKeyCode()
            if (r0 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.lang.Long r11 = r17.g(r18)
            java.lang.Long r12 = r17.f(r18)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            io.flutter.embedding.android.t$d[] r14 = io.flutter.embedding.android.t.f33513c
            int r15 = r14.length
            r8 = 0
        L_0x0021:
            r6 = 1
            if (r8 >= r15) goto L_0x0047
            r1 = r14[r8]
            int r0 = r18.getMetaState()
            int r2 = r1.f33516a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            long r3 = r12.longValue()
            long r5 = r11.longValue()
            r0 = r17
            r7 = r18
            r16 = r8
            r8 = r13
            r0.o(r1, r2, r3, r5, r7, r8)
            int r8 = r16 + 1
            goto L_0x0021
        L_0x0047:
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.t$e> r0 = r9.f33498c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0051:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r7.next()
            r1 = r0
            io.flutter.embedding.android.t$e r1 = (io.flutter.embedding.android.t.e) r1
            int r0 = r18.getMetaState()
            int r2 = r1.f33518a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            long r3 = r12.longValue()
            r0 = r17
            r5 = r18
            r0.p(r1, r2, r3, r5)
            goto L_0x0051
        L_0x0076:
            int r0 = r18.getAction()
            if (r0 == 0) goto L_0x0081
            if (r0 == r6) goto L_0x007f
            return r10
        L_0x007f:
            r7 = 0
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            java.util.HashMap<java.lang.Long, java.lang.Long> r0 = r9.f33497b
            java.lang.Object r0 = r0.get(r11)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r8 = 0
            if (r7 == 0) goto L_0x00cb
            if (r2 != 0) goto L_0x0093
            io.flutter.embedding.android.n$a r0 = io.flutter.embedding.android.n.a.kDown
            goto L_0x00a9
        L_0x0093:
            int r0 = r18.getRepeatCount()
            if (r0 <= 0) goto L_0x009c
            io.flutter.embedding.android.n$a r0 = io.flutter.embedding.android.n.a.kRepeat
            goto L_0x00a9
        L_0x009c:
            r1 = 0
            long r4 = r18.getEventTime()
            r0 = r17
            r3 = r11
            r0.q(r1, r2, r3, r4)
            io.flutter.embedding.android.n$a r0 = io.flutter.embedding.android.n.a.kDown
        L_0x00a9:
            io.flutter.embedding.android.s$b r1 = r9.f33499d
            int r2 = r18.getUnicodeChar()
            java.lang.Character r1 = r1.a(r2)
            char r1 = r1.charValue()
            if (r1 == 0) goto L_0x00d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x00d1
        L_0x00cb:
            if (r2 != 0) goto L_0x00ce
            return r10
        L_0x00ce:
            io.flutter.embedding.android.n$a r0 = io.flutter.embedding.android.n.a.kUp
        L_0x00d0:
            r1 = r8
        L_0x00d1:
            io.flutter.embedding.android.n$a r2 = io.flutter.embedding.android.n.a.kRepeat
            if (r0 == r2) goto L_0x00db
            if (r7 == 0) goto L_0x00d8
            r8 = r12
        L_0x00d8:
            r9.r(r11, r8)
        L_0x00db:
            io.flutter.embedding.android.n$a r2 = io.flutter.embedding.android.n.a.kDown
            if (r0 != r2) goto L_0x00ee
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.t$e> r2 = r9.f33498c
            java.lang.Object r2 = r2.get(r12)
            io.flutter.embedding.android.t$e r2 = (io.flutter.embedding.android.t.e) r2
            if (r2 == 0) goto L_0x00ee
            boolean r3 = r2.f33521d
            r3 = r3 ^ r6
            r2.f33521d = r3
        L_0x00ee:
            io.flutter.embedding.android.n r2 = new io.flutter.embedding.android.n
            r2.<init>()
            long r3 = r18.getEventTime()
            r2.f33477a = r3
            r2.f33478b = r0
            long r3 = r12.longValue()
            r2.f33480d = r3
            long r3 = r11.longValue()
            r2.f33479c = r3
            r2.f33482f = r1
            r2.f33481e = r10
            r0 = r19
            r9.n(r2, r0)
            java.util.Iterator r0 = r13.iterator()
        L_0x0114:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0124
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0114
        L_0x0124:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.r.i(android.view.KeyEvent, io.flutter.embedding.android.s$d$a):boolean");
    }

    private static long j(long j10, long j11) {
        return (j10 & 4294967295L) | j11;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k(s.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(t.c cVar, long j10, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f33515b), Long.valueOf(j10), keyEvent.getEventTime());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(t.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f33515b), Long.valueOf(cVar.f33514a), keyEvent.getEventTime());
    }

    private void n(n nVar, s.d.a aVar) {
        this.f33496a.d("flutter/keydata", nVar.a(), aVar == null ? null : new q(aVar));
    }

    private void q(boolean z10, Long l10, Long l11, long j10) {
        n nVar = new n();
        nVar.f33477a = j10;
        nVar.f33478b = z10 ? n.a.kDown : n.a.kUp;
        nVar.f33480d = l10.longValue();
        nVar.f33479c = l11.longValue();
        nVar.f33482f = null;
        nVar.f33481e = true;
        if (!(l11.longValue() == 0 || l10.longValue() == 0)) {
            if (!z10) {
                l10 = null;
            }
            r(l11, l10);
        }
        n(nVar, (s.d.a) null);
    }

    public void a(KeyEvent keyEvent, s.d.a aVar) {
        if (!i(keyEvent, aVar)) {
            q(true, (Long) null, 0L, 0);
            aVar.a(true);
        }
    }

    public Map<Long, Long> h() {
        return Collections.unmodifiableMap(this.f33497b);
    }

    /* access modifiers changed from: package-private */
    public void o(t.d dVar, boolean z10, long j10, long j11, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        t.d dVar2 = dVar;
        ArrayList<Runnable> arrayList2 = arrayList;
        t.c[] cVarArr = dVar2.f33517b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            t.c[] cVarArr2 = dVar2.f33517b;
            boolean z12 = true;
            if (i10 >= cVarArr2.length) {
                break;
            }
            t.c cVar = cVarArr2[i10];
            zArr[i10] = this.f33497b.containsKey(Long.valueOf(cVar.f33514a));
            if (cVar.f33515b == j10) {
                int i11 = a.f33500a[e(keyEvent).ordinal()];
                if (i11 == 1) {
                    KeyEvent keyEvent2 = keyEvent;
                    boolArr[i10] = Boolean.FALSE;
                    if (!z10) {
                        arrayList2.add(new o(this, cVar, j11, keyEvent));
                    }
                } else if (i11 == 2) {
                    KeyEvent keyEvent3 = keyEvent;
                    boolArr[i10] = Boolean.valueOf(zArr[i10]);
                } else if (i11 != 3) {
                    KeyEvent keyEvent4 = keyEvent;
                } else {
                    if (!z10) {
                        arrayList2.add(new p(this, cVar, keyEvent));
                    } else {
                        KeyEvent keyEvent5 = keyEvent;
                    }
                    boolArr[i10] = Boolean.valueOf(zArr[i10]);
                }
                z11 = true;
            } else {
                KeyEvent keyEvent6 = keyEvent;
                if (!z11 && !zArr[i10]) {
                    z12 = false;
                }
                z11 = z12;
            }
            i10++;
        }
        KeyEvent keyEvent7 = keyEvent;
        if (z10) {
            for (int i12 = 0; i12 < dVar2.f33517b.length; i12++) {
                if (boolArr[i12] == null) {
                    if (z11) {
                        boolArr[i12] = Boolean.valueOf(zArr[i12]);
                    } else {
                        boolArr[i12] = Boolean.TRUE;
                        z11 = true;
                    }
                }
            }
            if (!z11) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i13 = 0; i13 < dVar2.f33517b.length; i13++) {
                if (boolArr[i13] == null) {
                    boolArr[i13] = Boolean.FALSE;
                }
            }
        }
        for (int i14 = 0; i14 < dVar2.f33517b.length; i14++) {
            if (zArr[i14] != boolArr[i14].booleanValue()) {
                t.c cVar2 = dVar2.f33517b[i14];
                q(boolArr[i14].booleanValue(), Long.valueOf(cVar2.f33515b), Long.valueOf(cVar2.f33514a), keyEvent.getEventTime());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(t.e eVar, boolean z10, long j10, KeyEvent keyEvent) {
        if (eVar.f33520c != j10 && eVar.f33521d != z10) {
            boolean z11 = !this.f33497b.containsKey(Long.valueOf(eVar.f33519b));
            if (z11) {
                eVar.f33521d = !eVar.f33521d;
            }
            q(z11, Long.valueOf(eVar.f33520c), Long.valueOf(eVar.f33519b), keyEvent.getEventTime());
            if (!z11) {
                eVar.f33521d = !eVar.f33521d;
            }
            q(!z11, Long.valueOf(eVar.f33520c), Long.valueOf(eVar.f33519b), keyEvent.getEventTime());
        }
    }

    /* access modifiers changed from: package-private */
    public void r(Long l10, Long l11) {
        if (l11 != null) {
            if (this.f33497b.put(l10, l11) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f33497b.remove(l10) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
