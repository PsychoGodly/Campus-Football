package v4;

import java.util.Date;
import java.util.Set;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface e {
    @Deprecated
    Date getBirthday();

    @Deprecated
    int getGender();

    Set<String> getKeywords();

    @Deprecated
    boolean isDesignedForFamilies();

    boolean isTesting();

    int taggedForChildDirectedTreatment();
}
