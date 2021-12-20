package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "recruti")
public class recruti extends LinearOpMode {
    DcMotor motor;
    CRServo servo1;
    @Override
    public void runOpMode(){
        motor = hardwareMap.get(DcMotor.class, "motor1");
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();
        while(opModeIsActive()&&!isStopRequested()){
            if (gamepad2.a){
                motor.setPower(1);
            }
            else{
                motor.setPower(0);
            }
            servo1.setPower(0);
        }
    }
}
