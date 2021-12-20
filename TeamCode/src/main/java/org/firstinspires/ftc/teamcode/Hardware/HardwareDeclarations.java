package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.PIDCoefficients;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class HardwareDeclarations {

    public static Telemetry telemetry;
    public static HardwareMap hardwareMap;
    public static DcMotor front_left, front_right, back_left, back_right;
    public static DcMotorEx slider_left, slider_right;
    public static DcMotorEx arm;

    public static CRServo intake;
    public static Servo boxAngle;

    public static DcMotor carusel;

    public static PIDFCoefficients sliderVelocityPID = new PIDFCoefficients(20, 0, 4, 0);
    public static PIDFCoefficients sliderPositionPID = new PIDFCoefficients(20, 0, 4, 0);
    public static PIDFCoefficients armVelocityPID = new PIDFCoefficients(1, 2, 3, 4);
    public static PIDFCoefficients armPositionPID = new PIDFCoefficients(1, 2, 3, 4);
}
