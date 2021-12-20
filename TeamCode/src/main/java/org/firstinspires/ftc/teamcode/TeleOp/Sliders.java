package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.POSITIONS;

public class Sliders {
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.a) {
            Hardware.slider_left.setTargetPosition(POSITIONS.slidersPositions.get("UP"));
            Hardware.slider_right.setTargetPosition(POSITIONS.slidersPositions.get("UP")-10);
            changePidf(Hardware.slider_left.getCurrentPosition(), Hardware.slider_left.getTargetPosition());
        } else if (gamepad.b) {
            Hardware.slider_left.setTargetPosition(POSITIONS.slidersPositions.get("MID"));
            Hardware.slider_right.setTargetPosition(POSITIONS.slidersPositions.get("MID")-5);
            changePidf(Hardware.slider_left.getCurrentPosition(), Hardware.slider_left.getTargetPosition());
        } else if (gamepad.x) {
            Hardware.slider_left.setTargetPosition(POSITIONS.slidersPositions.get("DOWN"));
            Hardware.slider_right.setTargetPosition(POSITIONS.slidersPositions.get("DOWN"));
            changePidf(Hardware.slider_left.getCurrentPosition(), Hardware.slider_left.getTargetPosition());
        }
    }
    private static void changePidf(int currentPos, int targetPos){
        if (currentPos>targetPos){
            Hardware.slider_left.setPositionPIDFCoefficients(6);
            Hardware.slider_right.setPositionPIDFCoefficients(6);
        }
        else {
            Hardware.slider_left.setPositionPIDFCoefficients(9);
            Hardware.slider_right.setPositionPIDFCoefficients(9);
        }
    }
}
