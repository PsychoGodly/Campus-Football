package com.onesignal;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import sd.w;

/* compiled from: CallbackThreadManager.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28088a = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static b f28089b = b.MainUI;

    /* compiled from: CallbackThreadManager.kt */
    public static final class a {

        /* renamed from: com.onesignal.q$a$a  reason: collision with other inner class name */
        /* compiled from: CallbackThreadManager.kt */
        public /* synthetic */ class C0293a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f28090a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.MainUI.ordinal()] = 1;
                iArr[b.Background.ordinal()] = 2;
                f28090a = iArr;
            }
        }

        /* compiled from: CallbackThreadManager.kt */
        static final class b extends n implements fe.a<w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f28091a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Runnable runnable) {
                super(0);
                this.f28091a = runnable;
            }

            public final void invoke() {
                this.f28091a.run();
            }
        }

        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a() {
            return q.f28089b;
        }

        public final void b(Runnable runnable) {
            m.e(runnable, "runnable");
            int i10 = C0293a.f28090a[a().ordinal()];
            if (i10 == 1) {
                OSUtils.T(runnable);
            } else if (i10 == 2) {
                wd.a.b(false, false, (ClassLoader) null, (String) null, 0, new b(runnable), 31, (Object) null);
            }
        }
    }

    /* compiled from: CallbackThreadManager.kt */
    public enum b {
        MainUI,
        Background
    }
}
