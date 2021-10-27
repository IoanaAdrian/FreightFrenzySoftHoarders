package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;

public class Sliders {
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.a) {
            Hardware.slider_left.setTargetPosition(POSITIONS.slidersPositions.get("UP"));
            Hardware.slider_right.setTargetPosition(POSITIONS.slidersPositions.get("UP"));
        } else if (gamepad.b) {
            Hardware.slider_left.setTargetPosition(POSITIONS.slidersPositions.get("MID"));
            Hardware.slider_right.setTargetPosition(POSITIONS.slidersPositions.get("MID"));
        } else if (gamepad.x) {
            Hardware.slider_left.setTargetPosition(POSITIONS.slidersPositions.get("DOWN"));
            Hardware.slider_right.setTargetPosition(POSITIONS.slidersPositions.get("DOWN"));
        }
    }
}
