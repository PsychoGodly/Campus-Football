package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;
import kotlin.jvm.internal.m;

/* compiled from: NonBehavioralFlagReader.kt */
public class NonBehavioralFlagReader {
    private final IJsonStorageReader jsonStorageReader;

    public NonBehavioralFlagReader(IJsonStorageReader iJsonStorageReader) {
        m.e(iJsonStorageReader, "jsonStorageReader");
        this.jsonStorageReader = iJsonStorageReader;
    }

    public NonBehavioralFlag getUserNonBehavioralFlag() {
        Object obj = this.jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_KEY);
        if (obj == null) {
            obj = this.jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_ALT_KEY);
        }
        return NonBehavioralFlag.Companion.fromString(String.valueOf(obj));
    }
}
