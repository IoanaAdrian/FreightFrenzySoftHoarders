package org.firstinspires.ftc.teamcode.TeleOp.Utils;

import java.util.Hashtable;

public class POSITIONS {
    public static Hashtable<String, Integer> slidersPositions = new Hashtable<String, Integer>() {{
        put("UP", 570);
        put("MID", 280);
        put("DOWN", 0);
    }};
    public static Hashtable<String, Double> boxAnglePositions = new Hashtable<String, Double>() {{
        put("UP", 0.08);
        put("MID", 0.26);
        put("DOWN", 0.68);
    }};
    public static Hashtable<String, Integer> armPositions = new Hashtable<String, Integer>() {{
        put("UP", 0);
        put("MID", -590);
        put("DOWN", -2000);
    }};

}
