package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.Hardware.HardwareDeclarations;
import org.firstinspires.ftc.teamcode.Hardware.HardwareUtils;

@TeleOp(name = "Test")
public class Test1 extends LinearOpMode {
    @Override
    public void runOpMode(){

        DcMotorEx motor1, motor2;
        motor1 = hardwareMap.get(DcMotorEx.class, "motor1");
        motor2 = hardwareMap.get(DcMotorEx.class, "motor2");

        motor1.setTargetPosition(0);
        motor2.setTargetPosition(0);

        HardwareUtils.ResetEncoders(motor1, motor2);
        HardwareUtils.RunningWithEncoders(motor1, motor2);

        motor1.setVelocityPIDFCoefficients(1.0, 0.1, 0, 10);
        motor2.setVelocityPIDFCoefficients(1.0, 0.1, 0, 10);

        motor2.setPositionPIDFCoefficients(5);
        motor2.setPositionPIDFCoefficients(5);



        motor1.setPower(1);
        motor2.setPower(1);

        waitForStart();
        while (!isStopRequested()&&opModeIsActive()){
            if(gamepad1.x){
                motor1.setTargetPosition(0);
            }
            if(gamepad1.a){
                motor1.setTargetPosition(100);
            }
            if(gamepad1.b){
                motor1.setTargetPosition(-100);
            }
            if(gamepad1.dpad_left){
                motor1.setTargetPosition(0);
            }
            if(gamepad1.dpad_down){
                motor1.setTargetPosition(100);
            }
            if(gamepad1.dpad_right){
                motor1.setTargetPosition(-100);
            }
            telemetry.addData("Motor1 position: ", motor1.getCurrentPosition());
            telemetry.addData("Motor2 position: ", motor2.getCurrentPosition());
            telemetry.update();
        }
    }
}
