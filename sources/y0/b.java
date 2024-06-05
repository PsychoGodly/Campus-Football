package y0;

/* compiled from: RoomMasterTable */
public class b {
    public static String a(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
