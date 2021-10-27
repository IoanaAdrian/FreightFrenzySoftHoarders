package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;

public class Arm {
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.y) {
            Hardware.arm.setTargetPosition(POSITIONS.armPositions.get("UP"));
        } else if (gamepad.left_bumper) {
            Hardware.arm.setTargetPosition(POSITIONS.armPositions.get("MID"));
        } else if (gamepad.right_bumper) {
            Hardware.arm.setTargetPosition(POSITIONS.armPositions.get("DOWN"));
        }
    }
}
