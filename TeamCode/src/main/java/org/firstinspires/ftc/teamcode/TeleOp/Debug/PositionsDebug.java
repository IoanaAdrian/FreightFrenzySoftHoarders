package org.firstinspires.ftc.teamcode.TeleOp.Debug;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.TeleOp.Arm;

public class PositionsDebug {

    public static void GetSlidersPosition(boolean update) {
        Hardware.telemetry.addData("Current left slider position is: ",Hardware.slider_left.getCurrentPosition());
        Hardware.telemetry.addData("Current right slider position is: ",Hardware.slider_right.getCurrentPosition());
        Hardware.telemetry.addData("Current PIDF for left slider is: ", Hardware.slider_left.getPIDFCoefficients(DcMotor.RunMode.RUN_TO_POSITION));
        Hardware.telemetry.addData("Current PIDF for right slider is: ", Hardware.slider_right.getPIDFCoefficients(DcMotor.RunMode.RUN_TO_POSITION));
        Hardware.telemetry.addData("Current TargetPostionTolerance for left slider is: ", Hardware.slider_left.getTargetPositionTolerance());
        Hardware.telemetry.addData("Current TargetPostionTolerance for right slider is: ", Hardware.slider_right.getTargetPositionTolerance());
        Hardware.telemetry.addData("delay", Arm.delayedAction.delay);

        if(update)
            Hardware.telemetry.update();
    }

    public static void GetSlidersPosition() {
        Hardware.telemetry.addData("Current left slider position is: ",Hardware.slider_left.getCurrentPosition());
        Hardware.telemetry.addData("Current right slider position is: ",Hardware.slider_right.getCurrentPosition());
    }

    public static void GetArmPosition(boolean update) {
        Hardware.telemetry.addData("Current arm position is: ", Hardware.arm.getCurrentPosition());
        if(update)
            Hardware.telemetry.update();
    }

    public static void GetArmPosition() {
        Hardware.telemetry.addData("Current arm position is: ", Hardware.arm.getCurrentPosition());
    }

    public static void GetBoxPosition(){
        Hardware.telemetry.addData("Current box position is: ", Hardware.boxAngle.getPosition());
    }


}
