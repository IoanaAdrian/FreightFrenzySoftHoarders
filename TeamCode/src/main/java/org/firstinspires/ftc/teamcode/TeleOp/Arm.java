package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;
import org.firstinspires.ftc.teamcode.Utilities.DelayedAction;

public class Arm {
    public static DelayedAction delayedAction = new DelayedAction(300);
    public static void toPosition(Gamepad gamepad) {
        if (delayedAction.runAction()){
            Hardware.boxAngle.setPosition((POSITIONS.boxAnglePositions.get("DOWN")));
        }
        if (gamepad.y) { //coboara bratul
            Hardware.arm.setTargetPosition(POSITIONS.armPositions.get("UP"));
            Hardware.boxAngle.setPosition((POSITIONS.boxAnglePositions.get("UP")));
            delayedAction.modifyDelay(300);
        } else if (gamepad.left_bumper) { // mid bratul
            Hardware.arm.setTargetPosition(POSITIONS.armPositions.get("MID"));
            Hardware.boxAngle.setPosition(POSITIONS.boxAnglePositions.get("UP"));
            delayedAction.modifyDelay(0);
        } else if (gamepad.right_bumper) {//urca bratul
            Hardware.arm.setTargetPosition(POSITIONS.armPositions.get("DOWN"));
            delayedAction.callAction();
        }
    }
}
