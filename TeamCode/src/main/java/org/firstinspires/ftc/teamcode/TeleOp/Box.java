package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;

public class Box {
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.x) {
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("UP"));
        } else if (gamepad.a) {
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("MID"));
        } else if (gamepad.b) {
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("DOWN"));
        }
    }
    public static void intake(Gamepad gamepad){
        if (gamepad.y) {
            Hardware.intake.setPower(-1);
        }
        else{
            Hardware.intake.setPower(0);
        }
    }
}
