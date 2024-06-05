package androidx.media;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* compiled from: MediaBrowserCompatUtils */
public class c {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        if (bundle2 == null) {
            i10 = -1;
        } else {
            i10 = bundle2.getInt("android.media.browse.extra.PAGE", -1);
        }
        if (bundle == null) {
            i11 = -1;
        } else {
            i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        if (bundle2 == null) {
            i12 = -1;
        } else {
            i12 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        int i17 = a.e.API_PRIORITY_OTHER;
        if (i16 == -1 || i11 == -1) {
            i13 = a.e.API_PRIORITY_OTHER;
            i14 = 0;
        } else {
            i14 = i16 * i11;
            i13 = (i11 + i14) - 1;
        }
        if (i10 == -1 || i12 == -1) {
            i15 = 0;
        } else {
            i15 = i10 * i12;
            i17 = (i12 + i15) - 1;
        }
        return i13 >= i15 && i17 >= i14;
    }
}
