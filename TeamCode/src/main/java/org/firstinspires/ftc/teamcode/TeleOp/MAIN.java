package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.RoadRunner.drive.MyMecanumDrive;

@TeleOp(name = "MainTeleOp")
public class MAIN extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        MyMecanumDrive drive;
        drive = new MyMecanumDrive(hardwareMap);
        Movement.setDrive(drive);
        Movement.setTelemetry(telemetry);
        Hardware.init(hardwareMap, telemetry);

        waitForStart();

        while (!isStopRequested() && opModeIsActive()) {
            Movement.driving(gamepad1);
        }
    }
}
