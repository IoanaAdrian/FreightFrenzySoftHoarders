package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class HardwareUtils {


    public static DcMotor getDc(String name) {
        return Hardware.hardwareMap.get(DcMotor.class, name);
    }

    public static DcMotorEx getDcEx(String name) {
        return Hardware.hardwareMap.get(DcMotorEx.class, name);
    }

    public static Servo getServo(String name) {
        return Hardware.hardwareMap.get(Servo.class, name);
    }

    public static CRServo getCRServo(String name) {
        return Hardware.hardwareMap.get(CRServo.class, name);
    }

    public static void changeDirection(DcMotor... dcMotors) {
        for (DcMotor dcMotor : dcMotors) {
            if (dcMotor.getDirection() == DcMotorSimple.Direction.FORWARD) {
                dcMotor.setDirection(DcMotorSimple.Direction.REVERSE);
            } else {
                dcMotor.setDirection(DcMotorSimple.Direction.FORWARD);
            }
        }
    }

    public static void changeDirection(CRServo... servos) {
        for (CRServo servo : servos) {
            if (servo.getDirection() == DcMotorSimple.Direction.FORWARD) {
                servo.setDirection(DcMotorSimple.Direction.REVERSE);
            } else {
                servo.setDirection(DcMotorSimple.Direction.FORWARD);
            }
        }
    }

    public static void RunningWithEncoders(DcMotor... dcMotors) {
        for (DcMotor dcMotor : dcMotors) {
            dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            dcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
    }

    public static void ResetEncoders(DcMotor... dcMotors) {
        for (DcMotor dcMotor : dcMotors) {
            dcMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            dcMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        }
    }

    public static void SetPIDCoefficients() {
        Hardware.slider_left.setVelocityPIDFCoefficients(1.2, 0.12, 0, 12);
        Hardware.slider_right.setVelocityPIDFCoefficients(1.2, 0.12, 0, 12);
        ///Hardware.slider_right.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER, HardwareDeclarations.sliderVelocityPID);

        //Hardware.slider_right.setPIDFCoefficients(DcMotor.RunMode.RUN_TO_POSITION, HardwareDeclarations.sliderPositionPID);
        //Hardware.slider_left.setPIDFCoefficients(DcMotor.RunMode.RUN_TO_POSITION, HardwareDeclarations.sliderPositionPID);
        Hardware.slider_left.setPositionPIDFCoefficients(7);
        Hardware.slider_right.setPositionPIDFCoefficients(7);

        //Hardware.arm.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER, HardwareDeclarations.armVelocityPID);
        //Hardware.arm.setPIDFCoefficients(DcMotor.RunMode.RUN_TO_POSITION, HardwareDeclarations.armPositionPID);

    }

    public static void initArmSliders() {
        changeDirection(Hardware.slider_right);//TODO
        Hardware.slider_right.setTargetPosition(0);
        Hardware.slider_left.setTargetPosition(0);

        Hardware.arm.setTargetPosition(0);
        Hardware.arm.setPower(1);

        Hardware.slider_left.setPower(1);
        Hardware.slider_right.setPower(1);
    }
}
