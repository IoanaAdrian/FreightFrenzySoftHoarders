package org.firstinspires.ftc.teamcode.TeleOp.Utils;

import java.util.Hashtable;

public class POSITIONS {
    public static Hashtable<String, Integer> slidersPositions = new Hashtable<String, Integer>() {{
        put("UP", -590);
        put("MID", -280);
        put("DOWN", 0);
    }};
    public static Hashtable<String, Double> boxAnglePositions = new Hashtable<String, Double>() {{
        put("UP", 0.15);
        put("MID", 0.32);
        put("DOWN", 0.72);
    }};
    public static Hashtable<String, Integer> armPositions = new Hashtable<String, Integer>() {{
        put("UP", 0);
        put("MID", -590);
        put("DOWN", -1500);
    }};

}
