package ze;

import android.hardware.Camera;
import java.util.List;

/* compiled from: CameraUtils */
public class d {
    public static Camera a(int i10) {
        if (i10 != -1) {
            return Camera.open(i10);
        }
        try {
            return Camera.open();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int b() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i10 = -1;
        for (int i11 = 0; i11 < numberOfCameras; i11++) {
            Camera.getCameraInfo(i11, cameraInfo);
            if (cameraInfo.facing == 0) {
                return i11;
            }
            i10 = i11;
        }
        return i10;
    }

    public static boolean c(Camera camera) {
        List<String> supportedFlashModes;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty() && (supportedFlashModes.size() != 1 || !supportedFlashModes.get(0).equals("off"))) {
                return true;
            }
        }
        return false;
    }
}
