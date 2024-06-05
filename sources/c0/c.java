package c0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.h;
import androidx.core.view.a0;
import androidx.core.view.c;

/* compiled from: InputConnectionCompat */
public final class c {

    /* compiled from: InputConnectionCompat */
    class a extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0105c f5566a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, C0105c cVar) {
            super(inputConnection, z10);
            this.f5566a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f5566a.a(d.f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* compiled from: InputConnectionCompat */
    class b extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0105c f5567a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, C0105c cVar) {
            super(inputConnection, z10);
            this.f5567a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (c.e(str, bundle, this.f5567a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: c0.c$c  reason: collision with other inner class name */
    /* compiled from: InputConnectionCompat */
    public interface C0105c {
        boolean a(d dVar, int i10, Bundle bundle);
    }

    private static C0105c b(View view) {
        h.f(view);
        return new b(view);
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, C0105c cVar) {
        androidx.core.util.c.e(inputConnection, "inputConnection must be non-null");
        androidx.core.util.c.e(editorInfo, "editorInfo must be non-null");
        androidx.core.util.c.e(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, cVar);
        }
        if (a.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean e(java.lang.String r7, android.os.Bundle r8, c0.c.C0105c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = 0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            c0.d r8 = new c0.d     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.c.e(java.lang.String, android.os.Bundle, c0.c$c):boolean");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean f(View view, d dVar, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                dVar.d();
                InputContentInfo inputContentInfo = (InputContentInfo) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        if (a0.d0(view, new c.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null) {
            return true;
        }
        return false;
    }
}
