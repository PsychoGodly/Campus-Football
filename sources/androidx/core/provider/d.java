package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: FontProvider */
class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<byte[]> f2996a = c.f2995a;

    /* compiled from: FontProvider */
    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        if (eVar.b() != null) {
            return eVar.b();
        }
        return e.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
        if (f10 == null) {
            return g.a.a(1, (g.b[]) null);
        }
        return g.a.a(0, h(context, eVar, f10.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e10 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
        } else if (resolveContentProvider.packageName.equals(eVar.f())) {
            List<byte[]> b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b10, f2996a);
            List<List<byte[]>> d10 = d(eVar, resources);
            for (int i10 = 0; i10 < d10.size(); i10++) {
                ArrayList arrayList = new ArrayList(d10.get(i10));
                Collections.sort(arrayList, f2996a);
                if (c(b10, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ int g(byte[] r4, byte[] r5) {
        /*
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L_0x0008
            int r4 = r4.length
            int r5 = r5.length
        L_0x0006:
            int r4 = r4 - r5
            return r4
        L_0x0008:
            r0 = 0
            r1 = 0
        L_0x000a:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x001b
            byte r2 = r4[r1]
            byte r3 = r5[r1]
            if (r2 == r3) goto L_0x0018
            byte r4 = r4[r1]
            byte r5 = r5[r1]
            goto L_0x0006
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.d.g(byte[], byte[]):int");
    }

    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        int i10;
        Uri uri;
        boolean z10;
        int i11;
        Cursor query;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT > 16) {
                query = a.a(contentResolver, build, strArr, "query = ?", new String[]{eVar.g()}, (String) null, cancellationSignal);
            } else {
                query = contentResolver.query(build, strArr, "query = ?", new String[]{eVar.g()}, (String) null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i12 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i13 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i10 = i12;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i10 = i12;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i14 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : CommonGatewayClient.CODE_400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i11 = i10;
                        z10 = false;
                    } else {
                        i11 = i10;
                        z10 = true;
                    }
                    arrayList2.add(g.b.a(uri, i13, i14, z10, i11));
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
