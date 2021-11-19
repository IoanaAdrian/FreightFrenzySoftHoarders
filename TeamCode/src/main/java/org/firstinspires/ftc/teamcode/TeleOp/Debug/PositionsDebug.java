package org.firstinspires.ftc.teamcode.TeleOp.Debug;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;

public class PositionsDebug {

    public static void GetSlidersPosition(boolean update) {
        Hardware.telemetry.addData("Current left slider position is: ",Hardware.slider_left.getCurrentPosition());
        Hardware.telemetry.addData("Current right slider position is: ",Hardware.slider_right.getCurrentPosition());
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
