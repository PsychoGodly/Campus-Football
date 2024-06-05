package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;

public class PiiTrackingStatusReader {
    private final IJsonStorageReader _jsonStorageReader;
    private final NonBehavioralFlagReader _nonBehavioralFlagReader;

    public PiiTrackingStatusReader(IJsonStorageReader iJsonStorageReader) {
        this._jsonStorageReader = iJsonStorageReader;
        this._nonBehavioralFlagReader = new NonBehavioralFlagReader(iJsonStorageReader);
    }

    private PiiPrivacyMode getSpmPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_SPM_KEY);
    }

    private PiiPrivacyMode getUserPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_MODE_KEY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r0 = getUserPrivacyMode();
        r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r0 = getUserPrivacyMode();
        r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.MIXED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getPrivacyMode() {
        /*
            r2 = this;
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getUserPrivacyMode()
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NULL
            if (r0 != r1) goto L_0x000f
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getSpmPrivacyMode()
            if (r0 != r1) goto L_0x000f
            return r1
        L_0x000f:
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getUserPrivacyMode()
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.APP
            if (r0 == r1) goto L_0x003f
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getSpmPrivacyMode()
            if (r0 != r1) goto L_0x001e
            goto L_0x003f
        L_0x001e:
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getUserPrivacyMode()
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.MIXED
            if (r0 == r1) goto L_0x003f
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getSpmPrivacyMode()
            if (r0 != r1) goto L_0x002d
            goto L_0x003f
        L_0x002d:
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getUserPrivacyMode()
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NONE
            if (r0 == r1) goto L_0x003f
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = r2.getSpmPrivacyMode()
            if (r0 != r1) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r0 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.UNDEFINED
            return r0
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader.getPrivacyMode():com.unity3d.services.core.device.reader.pii.PiiPrivacyMode");
    }

    public boolean getUserNonBehavioralFlag() {
        return this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == NonBehavioralFlag.TRUE;
    }

    private PiiPrivacyMode getPrivacyMode(String str) {
        String str2;
        IJsonStorageReader iJsonStorageReader = this._jsonStorageReader;
        if (iJsonStorageReader != null) {
            Object obj = iJsonStorageReader.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
                return PiiPrivacyMode.getPiiPrivacyMode(str2);
            }
        }
        str2 = null;
        return PiiPrivacyMode.getPiiPrivacyMode(str2);
    }
}
