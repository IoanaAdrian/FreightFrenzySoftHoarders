package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;

public class Carousel {
    public static void run(Gamepad gamepad) {
        if (gamepad.right_bumper)
            Hardware.carusel.setPower(1);
        else
            Hardware.carusel.setPower(0);
    }
}
