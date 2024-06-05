package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3991a = (AudioAttributes) aVar.A(audioAttributesImplApi26.f3991a, 1);
        audioAttributesImplApi26.f3992b = aVar.v(audioAttributesImplApi26.f3992b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.K(false, false);
        aVar.d0(audioAttributesImplApi26.f3991a, 1);
        aVar.Y(audioAttributesImplApi26.f3992b, 2);
    }
}
