package androidx.media2.common;

import androidx.versionedparcelable.a;

public final class SubtitleDataParcelizer {
    public static SubtitleData read(a aVar) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.f4167a = aVar.y(subtitleData.f4167a, 1);
        subtitleData.f4168b = aVar.y(subtitleData.f4168b, 2);
        subtitleData.f4169c = aVar.m(subtitleData.f4169c, 3);
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, a aVar) {
        aVar.K(false, false);
        aVar.b0(subtitleData.f4167a, 1);
        aVar.b0(subtitleData.f4168b, 2);
        aVar.Q(subtitleData.f4169c, 3);
    }
}
