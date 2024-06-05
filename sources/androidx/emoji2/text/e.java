package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat */
public class e {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f3332n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Object f3333o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static volatile e f3334p;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f3335a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set<C0053e> f3336b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f3337c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f3338d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3339e;

    /* renamed from: f  reason: collision with root package name */
    final g f3340f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f3341g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f3342h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f3343i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3344j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3345k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3346l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final d f3347m;

    /* compiled from: EmojiCompat */
    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile h f3348b;

        /* renamed from: c  reason: collision with root package name */
        private volatile m f3349c;

        /* renamed from: androidx.emoji2.text.e$a$a  reason: collision with other inner class name */
        /* compiled from: EmojiCompat */
        class C0052a extends h {
            C0052a() {
            }

            public void a(Throwable th) {
                a.this.f3351a.m(th);
            }

            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.f3351a.f3340f.a(new C0052a());
            } catch (Throwable th) {
                this.f3351a.m(th);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f3348b.h(charSequence, i10, i11, i12, z10);
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3349c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3351a.f3341g);
        }

        /* access modifiers changed from: package-private */
        public void d(m mVar) {
            if (mVar == null) {
                this.f3351a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3349c = mVar;
            m mVar2 = this.f3349c;
            i iVar = new i();
            d a10 = this.f3351a.f3347m;
            e eVar = this.f3351a;
            this.f3348b = new h(mVar2, iVar, a10, eVar.f3342h, eVar.f3343i);
            this.f3351a.n();
        }
    }

    /* compiled from: EmojiCompat */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final e f3351a;

        b(e eVar) {
            this.f3351a = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3351a.n();
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return charSequence;
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final g f3352a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3353b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3354c;

        /* renamed from: d  reason: collision with root package name */
        int[] f3355d;

        /* renamed from: e  reason: collision with root package name */
        Set<C0053e> f3356e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3357f;

        /* renamed from: g  reason: collision with root package name */
        int f3358g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f3359h = 0;

        /* renamed from: i  reason: collision with root package name */
        d f3360i = new d();

        protected c(g gVar) {
            androidx.core.util.h.g(gVar, "metadataLoader cannot be null.");
            this.f3352a = gVar;
        }

        /* access modifiers changed from: protected */
        public final g a() {
            return this.f3352a;
        }

        public c b(int i10) {
            this.f3359h = i10;
            return this;
        }
    }

    /* compiled from: EmojiCompat */
    public interface d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.e$e  reason: collision with other inner class name */
    /* compiled from: EmojiCompat */
    public static abstract class C0053e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* compiled from: EmojiCompat */
    private static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0053e> f3361a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f3362b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3363c;

        f(C0053e eVar, int i10) {
            this(Arrays.asList(new C0053e[]{(C0053e) androidx.core.util.h.g(eVar, "initCallback cannot be null")}), i10, (Throwable) null);
        }

        public void run() {
            int size = this.f3361a.size();
            int i10 = 0;
            if (this.f3363c != 1) {
                while (i10 < size) {
                    this.f3361a.get(i10).a(this.f3362b);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f3361a.get(i10).b();
                i10++;
            }
        }

        f(Collection<C0053e> collection, int i10) {
            this(collection, i10, (Throwable) null);
        }

        f(Collection<C0053e> collection, int i10, Throwable th) {
            androidx.core.util.h.g(collection, "initCallbacks cannot be null");
            this.f3361a = new ArrayList(collection);
            this.f3363c = i10;
            this.f3362b = th;
        }
    }

    /* compiled from: EmojiCompat */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    /* compiled from: EmojiCompat */
    static class i {
        i() {
        }

        /* access modifiers changed from: package-private */
        public i a(g gVar) {
            return new o(gVar);
        }
    }

    private e(c cVar) {
        this.f3341g = cVar.f3353b;
        this.f3342h = cVar.f3354c;
        this.f3343i = cVar.f3355d;
        this.f3344j = cVar.f3357f;
        this.f3345k = cVar.f3358g;
        this.f3340f = cVar.f3352a;
        this.f3346l = cVar.f3359h;
        this.f3347m = cVar.f3360i;
        this.f3338d = new Handler(Looper.getMainLooper());
        androidx.collection.b bVar = new androidx.collection.b();
        this.f3336b = bVar;
        Set<C0053e> set = cVar.f3356e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3356e);
        }
        this.f3339e = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f3332n) {
            eVar = f3334p;
            androidx.core.util.h.h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return h.c(inputConnection, editable, i10, i11, z10);
        }
        return false;
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return h.d(editable, i10, keyEvent);
        }
        return false;
    }

    public static e g(c cVar) {
        e eVar = f3334p;
        if (eVar == null) {
            synchronized (f3332n) {
                eVar = f3334p;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f3334p = eVar;
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f3334p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    /* JADX INFO: finally extract failed */
    private void l() {
        this.f3335a.writeLock().lock();
        try {
            if (this.f3346l == 0) {
                this.f3337c = 0;
            }
            this.f3335a.writeLock().unlock();
            if (d() == 0) {
                this.f3339e.a();
            }
        } catch (Throwable th) {
            this.f3335a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f3345k;
    }

    public int d() {
        this.f3335a.readLock().lock();
        try {
            return this.f3337c;
        } finally {
            this.f3335a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f3344j;
    }

    public void k() {
        boolean z10 = true;
        if (this.f3346l != 1) {
            z10 = false;
        }
        androidx.core.util.h.h(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!j()) {
            this.f3335a.writeLock().lock();
            try {
                if (this.f3337c != 0) {
                    this.f3337c = 0;
                    this.f3335a.writeLock().unlock();
                    this.f3339e.a();
                }
            } finally {
                this.f3335a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3335a.writeLock().lock();
        try {
            this.f3337c = 2;
            arrayList.addAll(this.f3336b);
            this.f3336b.clear();
            this.f3335a.writeLock().unlock();
            this.f3338d.post(new f(arrayList, this.f3337c, th));
        } catch (Throwable th2) {
            this.f3335a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f3335a.writeLock().lock();
        try {
            this.f3337c = 1;
            arrayList.addAll(this.f3336b);
            this.f3336b.clear();
            this.f3335a.writeLock().unlock();
            this.f3338d.post(new f((Collection<C0053e>) arrayList, this.f3337c));
        } catch (Throwable th) {
            this.f3335a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, a.e.API_PRIORITY_OTHER);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        androidx.core.util.h.h(j(), "Not initialized yet");
        androidx.core.util.h.d(i10, "start cannot be negative");
        androidx.core.util.h.d(i11, "end cannot be negative");
        androidx.core.util.h.d(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.h.a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.a(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        return this.f3339e.b(charSequence, i10, i11, i12, i13 != 1 ? i13 != 2 ? this.f3341g : false : true);
    }

    public void s(C0053e eVar) {
        androidx.core.util.h.g(eVar, "initCallback cannot be null");
        this.f3335a.writeLock().lock();
        try {
            if (this.f3337c != 1) {
                if (this.f3337c != 2) {
                    this.f3336b.add(eVar);
                }
            }
            this.f3338d.post(new f(eVar, this.f3337c));
        } finally {
            this.f3335a.writeLock().unlock();
        }
    }

    public void t(C0053e eVar) {
        androidx.core.util.h.g(eVar, "initCallback cannot be null");
        this.f3335a.writeLock().lock();
        try {
            this.f3336b.remove(eVar);
        } finally {
            this.f3335a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f3339e.c(editorInfo);
        }
    }
}
