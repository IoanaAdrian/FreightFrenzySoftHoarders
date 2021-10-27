package org.firstinspires.ftc.teamcode.Hardware;

import static org.firstinspires.ftc.teamcode.Hardware.HardwareUtils.*;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Hardware extends HardwareDeclarations {

    private static void hardwareMapping() {
        front_left = getDc("front_left");
        front_right = getDc("front_right");
        back_right = getDc("back_right");
        back_left = getDc("back_left");

        slider_left = getDcEx("slider_left");
        slider_right = getDcEx("slider_right");

        intake = getCRServo("intake");
        boxAngle = getServo("boxAngle");
    }

    public static void init(HardwareMap hm, Telemetry telemetry) {
        HardwareDeclarations.telemetry = telemetry;
        HardwareDeclarations.hardwareMap = hm;
        HardwareDeclarations.telemetry.addLine("Initializing robot...");
        hardwareMapping();
        HardwareDeclarations.telemetry.addLine("Hardware mapping done!");

        RunningWithEncoders(slider_left, slider_right);

        SetPIDCoefficients();
        intiArmSliders();

        changeDirection(back_left, front_left, slider_left);
        HardwareDeclarations.telemetry.addLine("Direction changing done!");

    }

}
