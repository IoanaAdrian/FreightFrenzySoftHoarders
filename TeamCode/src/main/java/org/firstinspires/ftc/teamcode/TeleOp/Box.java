package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;
import org.firstinspires.ftc.teamcode.Utilities.OneTap;

public class Box {
    public static OneTap intakeing= new OneTap();
    public static OneTap outtaking= new OneTap();
    public static double power = 0;
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.x) {
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("UP"));
            Hardware.intake.setPower(0);
        } else if (gamepad.a) {
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("MID"));
        } else if (gamepad.b) {
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("DOWN"));
        }
    }
    public static void intake(Gamepad gamepad){
        if (intakeing.onPress(gamepad.y)) {
            power = 1 - power;
            Hardware.intake.setPower(-power);
        }
        if (outtaking.onPress(gamepad.left_bumper)){
            double currentPower=Hardware.intake.getPower();
            Hardware.intake.setPower(-currentPower);
        }
    }
}
