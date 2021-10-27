package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;

public class Box {
    public static void toPosition(Gamepad gamepad,String CALLWITHGAMEPAD2) {
        if (gamepad.a) {
            Hardware.boxAngle.setPosition(POSITIONS.armPositions.get("UP"));
        } else if (gamepad.b) {
            Hardware.boxAngle.setPosition(POSITIONS.armPositions.get("MID"));
        } else if (gamepad.x) {
            Hardware.boxAngle.setPosition(POSITIONS.armPositions.get("DOWN"));
        }
    }
}
