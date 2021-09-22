package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class HardwareUtils {
    public static DcMotor getDc(String name, HardwareMap hm) {
        return hm.get(DcMotor.class, name);
    }

    public static Servo getServo(String name, HardwareMap hm) {
        return hm.get(Servo.class, name);
    }

    public static CRServo getCRServo(String name, HardwareMap hm) {
        return hm.get(CRServo.class, name);
    }

    public static void changeDirection(DcMotor... dcMotors){
        for(DcMotor dcMotor : dcMotors){
            if(dcMotor.getDirection()== DcMotorSimple.Direction.FORWARD){
                dcMotor.setDirection(DcMotorSimple.Direction.REVERSE);
            }else{
                dcMotor.setDirection(DcMotorSimple.Direction.FORWARD);
            }
        }
    }
    public static void changeDirection(CRServo... servos){
        for(CRServo servo : servos){
            if(servo.getDirection()== DcMotorSimple.Direction.FORWARD){
                servo.setDirection(DcMotorSimple.Direction.REVERSE);
            }else{
                servo.setDirection(DcMotorSimple.Direction.FORWARD);
            }
        }
    }

    public static void ResetEncoders(DcMotor... dcMotors){
        for(DcMotor dcMotor : dcMotors){
            dcMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            dcMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        }
    }
}
