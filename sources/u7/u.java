package u7;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ResourcePath */
public final class u extends e<u> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f30652b = new u(Collections.emptyList());

    private u(List<String> list) {
        super(list);
    }

    public static u o(List<String> list) {
        return list.isEmpty() ? f30652b : new u(list);
    }

    public static u p(String str) {
        if (!str.contains("//")) {
            String[] split = str.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
            }
            return new u(arrayList);
        }
        throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
    }

    public String d() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f30614a.size(); i10++) {
            if (i10 > 0) {
                sb2.append(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
            }
            sb2.append(this.f30614a.get(i10));
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public u f(List<String> list) {
        return new u(list);
    }
}
