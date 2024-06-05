package gd;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Util */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f32937a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f32938b = Charset.forName("UTF-8");

    public static <T> List<T> a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    private static <T> List<T> b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            int length = tArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                T t11 = tArr2[i10];
                if (t10.equals(t11)) {
                    arrayList.add(t11);
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    public static <T> T[] c(Class<T> cls, T[] tArr, T[] tArr2) {
        List b10 = b(tArr, tArr2);
        return b10.toArray((Object[]) Array.newInstance(cls, b10.size()));
    }
}
