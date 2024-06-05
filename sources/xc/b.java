package xc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Share */
class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f39335a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f39336b;

    b(Context context, Activity activity) {
        this.f39335a = context;
        this.f39336b = activity;
    }

    private void a() {
        File f10 = f();
        if (f10.exists()) {
            for (File delete : f10.listFiles()) {
                delete.delete();
            }
            f10.delete();
        }
    }

    private static void b(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    private File c(File file) throws IOException {
        File f10 = f();
        if (!f10.exists()) {
            f10.mkdirs();
        }
        File file2 = new File(f10, file.getName());
        b(file, file2);
        return file2;
    }

    private boolean d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            File externalFilesDir = this.f39335a.getExternalFilesDir((String) null);
            if (externalFilesDir == null || !canonicalPath.startsWith(externalFilesDir.getCanonicalPath())) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private Context e() {
        Activity activity = this.f39336b;
        if (activity != null) {
            return activity;
        }
        Context context = this.f39335a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Both context and activity are null");
    }

    private File f() {
        return new File(e().getExternalCacheDir(), AppLovinEventTypes.USER_SHARED_LINK);
    }

    private String g(String str) {
        return (str == null || !str.contains(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) ? "*" : str.substring(0, str.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH));
    }

    private ArrayList<Uri> h(List<String> list) throws IOException {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        for (String file : list) {
            File file2 = new File(file);
            if (!d(file2)) {
                file2 = c(file2);
            }
            Context e10 = e();
            arrayList.add(androidx.core.content.b.getUriForFile(e10, e().getPackageName() + ".flutter.share_provider", file2));
        }
        return arrayList;
    }

    private String i(List<String> list) {
        if (list.size() > 1) {
            String str = list.get(0);
            for (int i10 = 1; i10 < list.size(); i10++) {
                String str2 = list.get(i10);
                if (!str.equals(str2)) {
                    if (!g(str2).equals(g(str))) {
                        return "*/*";
                    }
                    str = g(str2) + "/*";
                }
            }
            return str;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return "*/*";
        }
    }

    private void m(Intent intent) {
        Activity activity = this.f39336b;
        if (activity != null) {
            activity.startActivity(intent);
        } else if (this.f39335a != null) {
            intent.addFlags(268435456);
            this.f39335a.startActivity(intent);
        } else {
            throw new IllegalStateException("Both context and activity are null");
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Activity activity) {
        this.f39336b = activity;
    }

    /* access modifiers changed from: package-private */
    public void k(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty text expected");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        intent.setType("text/plain");
        m(Intent.createChooser(intent, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void l(List<String> list, List<String> list2, String str, String str2) throws IOException {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Non-empty path expected");
        }
        a();
        ArrayList<Uri> h10 = h(list);
        Intent intent = new Intent();
        if (h10.isEmpty()) {
            k(str, str2);
            return;
        }
        if (h10.size() == 1) {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", h10.get(0));
            intent.setType((list2.isEmpty() || list2.get(0) == null) ? "*/*" : list2.get(0));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", h10);
            intent.setType(i(list2));
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        for (ResolveInfo resolveInfo : e().getPackageManager().queryIntentActivities(createChooser, 65536)) {
            String str3 = resolveInfo.activityInfo.packageName;
            Iterator<Uri> it = h10.iterator();
            while (it.hasNext()) {
                e().grantUriPermission(str3, it.next(), 3);
            }
        }
        m(createChooser);
    }
}
