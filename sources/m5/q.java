package m5;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f20106a = Pattern.compile("\\$\\{(.*?)\\}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
