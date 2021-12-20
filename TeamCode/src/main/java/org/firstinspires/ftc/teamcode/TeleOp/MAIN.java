package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.Hardware.HardwareUtils;
import org.firstinspires.ftc.teamcode.RoadRunner.drive.MyMecanumDrive;
import org.firstinspires.ftc.teamcode.TeleOp.Debug.PositionsDebug;
import org.firstinspires.ftc.teamcode.TeleOp.Utils.Initializations;


@TeleOp(name = "MainTeleOp")
public class MAIN extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        MyMecanumDrive drive = new MyMecanumDrive(hardwareMap);
        Initializations.TeleOpInitialization(drive, telemetry, hardwareMap);
        HardwareUtils.InitializePositions();

        waitForStart();

        while (!isStopRequested() && opModeIsActive()) {
            Carousel.run(gamepad2);
            Movement.driving(gamepad1);
            PositionsDebug.GetBoxPosition();
            PositionsDebug.GetArmPosition();
            PositionsDebug.GetSlidersPosition(true);
            Sliders.toPosition(gamepad1);
            Arm.toPosition(gamepad1);
            Box.toPosition(gamepad2);
            Box.intake(gamepad2);
        }
    }
}
