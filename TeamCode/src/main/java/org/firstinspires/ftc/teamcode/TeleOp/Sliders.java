package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.Positions;

public class Sliders {
    public static void toPosition(Gamepad gamepad) {
        if (gamepad.a) {
            Hardware.slider_left.setTargetPosition((int)Positions.Sliders.Up);
            Hardware.slider_right.setTargetPosition((int)Positions.Sliders.Up-10);
            changePidf(Hardware.slider_left.getCurrentPosition(), Hardware.slider_left.getTargetPosition());
        } else if (gamepad.b) {
            Hardware.slider_left.setTargetPosition((int)Positions.Sliders.Mid);
            Hardware.slider_right.setTargetPosition((int)Positions.Sliders.Mid-5);
            changePidf(Hardware.slider_left.getCurrentPosition(), Hardware.slider_left.getTargetPosition());
        } else if (gamepad.x) {
            Hardware.slider_left.setTargetPosition((int)Positions.Sliders.Down);
            Hardware.slider_right.setTargetPosition((int)Positions.Sliders.Down);
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
