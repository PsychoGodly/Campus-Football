package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.os.Build;
import android.print.PrintAttributes;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import java.util.Map;

public class PrintAttributesExt {
    private int colorMode;
    private Integer duplex;
    private MarginsExt margins;
    private MediaSizeExt mediaSize;
    private Integer orientation;
    private ResolutionExt resolution;

    public static PrintAttributesExt fromPrintAttributes(PrintAttributes printAttributes) {
        if (printAttributes == null) {
            return null;
        }
        PrintAttributesExt printAttributesExt = new PrintAttributesExt();
        printAttributesExt.colorMode = printAttributes.getColorMode();
        if (Build.VERSION.SDK_INT >= 23) {
            printAttributesExt.duplex = Integer.valueOf(printAttributes.getDuplexMode());
        }
        PrintAttributes.MediaSize mediaSize2 = printAttributes.getMediaSize();
        if (mediaSize2 != null) {
            printAttributesExt.mediaSize = MediaSizeExt.fromMediaSize(mediaSize2);
            printAttributesExt.orientation = Integer.valueOf(mediaSize2.isPortrait() ^ true ? 1 : 0);
        }
        printAttributesExt.resolution = ResolutionExt.fromResolution(printAttributes.getResolution());
        printAttributesExt.margins = MarginsExt.fromMargins(printAttributes.getMinMargins());
        return printAttributesExt;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("colorMode", Integer.valueOf(this.colorMode));
        hashMap.put("duplex", this.duplex);
        hashMap.put(AdUnitActivity.EXTRA_ORIENTATION, this.orientation);
        MediaSizeExt mediaSizeExt = this.mediaSize;
        Map<String, Object> map = null;
        hashMap.put("mediaSize", mediaSizeExt != null ? mediaSizeExt.toMap() : null);
        ResolutionExt resolutionExt = this.resolution;
        hashMap.put("resolution", resolutionExt != null ? resolutionExt.toMap() : null);
        MarginsExt marginsExt = this.margins;
        if (marginsExt != null) {
            map = marginsExt.toMap();
        }
        hashMap.put("margins", map);
        return hashMap;
    }
}
