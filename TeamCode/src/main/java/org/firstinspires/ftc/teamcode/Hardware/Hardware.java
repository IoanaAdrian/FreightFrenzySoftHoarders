package org.firstinspires.ftc.teamcode.Hardware;

import static org.firstinspires.ftc.teamcode.Hardware.HardwareUtils.*;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Hardware extends HardwareDeclarations {

    private static void hardwareMapping(HardwareMap hm) {
        front_left = getDc("front_left", hm);
        front_right = getDc("front_right", hm);
        back_right = getDc("back_right", hm);
        back_left = getDc("back_left", hm);
    }

    public static void init(HardwareMap hm, Telemetry telemetry) {
        telemetry.addLine("Initializing robot...");
        hardwareMapping(hm);
        telemetry.addLine("Hardware mapping done!");

        changeDirection(back_left, front_left);
        telemetry.addLine("Direction changing done!");

    }

}
