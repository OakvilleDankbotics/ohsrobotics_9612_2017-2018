package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by ryaniscool on 1/12/18.
 */
@Autonomous(name = "auto3rb", group = "Autonomous")

public class auto3rb extends LinearOpMode {

    owoWhatsThis hardware = new owoWhatsThis();

    int rev = 1440;

    @Override
    public void runOpMode() throws InterruptedException {
        hardware.init(hardwareMap);

        waitForStart();
        //arm down
        hardware.jewelStick.setPosition(0);
        sleep(500);
        //move forward
        hardware.rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        hardware.rightDrive.setTargetPosition(-rev / 12);
        hardware.leftDrive.setTargetPosition(-rev / 12);

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        hardware.rightDrive.setPower(.1);
        hardware.leftDrive.setPower(.1);


        while (hardware.leftDrive.isBusy() && hardware.rightDrive.isBusy()) {
                //empty on purpose
        }

        hardware.rightDrive.setPower(0);
        hardware.leftDrive.setPower(0);

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //arm up
        hardware.jewelStick.setPosition(180);

        //forward
        hardware.rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        hardware.rightDrive.setTargetPosition(rev);
        hardware.leftDrive.setTargetPosition(rev);

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        hardware.rightDrive.setPower(.1);
        hardware.leftDrive.setPower(.1);


        while (hardware.leftDrive.isBusy() && hardware.rightDrive.isBusy()) {
            //empty on purpose
        }

        hardware.rightDrive.setPower(0);
        hardware.leftDrive.setPower(0);

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //left rotate
        hardware.rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        hardware.rightDrive.setTargetPosition((int) (-rev * 2.125));
        hardware.leftDrive.setTargetPosition((int) (rev * 2.125));

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        hardware.rightDrive.setPower(.1);
        hardware.leftDrive.setPower(.1);


        while (hardware.leftDrive.isBusy() && hardware.rightDrive.isBusy()) {
            //empty on purpose
        }

        hardware.rightDrive.setPower(0);
        hardware.leftDrive.setPower(0);

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        hardware.rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        hardware.rightDrive.setTargetPosition((int) (rev * .25));
        hardware.leftDrive.setTargetPosition((int) (rev * .25));

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        hardware.rightDrive.setPower(.1);
        hardware.leftDrive.setPower(.1);


        while (hardware.leftDrive.isBusy() && hardware.rightDrive.isBusy()) {
            //empty on purpose
        }

        hardware.rightDrive.setPower(0);
        hardware.leftDrive.setPower(0);

        hardware.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        hardware.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
}

