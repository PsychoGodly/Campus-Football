package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: AudioManagerCompat */
public final class b {

    /* compiled from: AudioManagerCompat */
    private static class a {
        static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    public static int a(AudioManager audioManager, a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        } else if (Build.VERSION.SDK_INT >= 26) {
            return a.a(audioManager, aVar.c());
        } else {
            return audioManager.abandonAudioFocus(aVar.e());
        }
    }

    public static int b(AudioManager audioManager, a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        } else if (Build.VERSION.SDK_INT >= 26) {
            return a.b(audioManager, aVar.c());
        } else {
            return audioManager.requestAudioFocus(aVar.e(), aVar.b().a(), aVar.d());
        }
    }
}
