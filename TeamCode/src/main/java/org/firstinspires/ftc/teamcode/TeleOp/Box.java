package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.Positions;
import org.firstinspires.ftc.teamcode.Utilities.OneTap;

public class Box {
    public static OneTap intake = new OneTap();
    public static OneTap outtake = new OneTap();
    public static double power = 0;
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.x) {
            Hardware.boxAngle.setPosition(Positions.Box.Up);
            Hardware.intake.setPower(0);
        } else if (gamepad.a) {
            Hardware.boxAngle.setPosition(Positions.Box.Mid);
        } else if (gamepad.b) {
            Hardware.boxAngle.setPosition(Positions.Box.Down);
        }
    }
    public static void intake(Gamepad gamepad){
        if (intake.onPress(gamepad.y)) {
            power = 1 - power;
            Hardware.intake.setPower(-power);
        }
        if (outtake.onPress(gamepad.left_bumper)){
            power = 1;
            Hardware.intake.setPower(power);
        }
    }
}
