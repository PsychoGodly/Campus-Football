package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.util.h;
import androidx.emoji2.text.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig */
public final class c {

    /* compiled from: DefaultEmojiCompatConfig */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f3329a;

        public a(b bVar) {
            this.f3329a = bVar == null ? e() : bVar;
        }

        private e.c a(Context context, androidx.core.provider.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new j(context, eVar);
        }

        private List<List<byte[]>> b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private androidx.core.provider.e d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.e(str, str2, "emojicompat-emoji-font", b(this.f3329a.b(packageManager, str2)));
        }

        private static b e() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                return new d();
            }
            if (i10 >= 19) {
                return new C0051c();
            }
            return new b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r2 = r2.applicationInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                r0 = 1
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.c.a.f(android.content.pm.ProviderInfo):boolean");
        }

        private ProviderInfo g(PackageManager packageManager) {
            for (ResolveInfo a10 : this.f3329a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a11 = this.f3329a.a(a10);
                if (f(a11)) {
                    return a11;
                }
            }
            return null;
        }

        public e.c c(Context context) {
            return a(context, h(context));
        }

        /* access modifiers changed from: package-private */
        public androidx.core.provider.e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            h.g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g10 = g(packageManager);
            if (g10 == null) {
                return null;
            }
            try {
                return d(g10, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    /* compiled from: DefaultEmojiCompatConfig */
    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return Collections.emptyList();
        }
    }

    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C0051c extends b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* compiled from: DefaultEmojiCompatConfig */
    public static class d extends C0051c {
        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static j a(Context context) {
        return (j) new a((b) null).c(context);
    }
}
