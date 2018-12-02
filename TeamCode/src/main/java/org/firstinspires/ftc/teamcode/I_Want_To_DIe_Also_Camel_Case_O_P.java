package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcontroller.internal.FtcRobotControllerActivity;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.core.Mat;

@Autonomous(name="KillMeAlwaysDaddy", group="Linear Opmode")
@Disabled
public class I_Want_To_DIe_Also_Camel_Case_O_P extends LinearOpMode implements CameraBridgeViewBase.CvCameraViewListener2 {
    @Override
    public void runOpMode(){
        waitForStart();
        startOpenCV(this);
        while(opModeIsActive()){

        }
        stopOpenCV();
    }
    public void startOpenCV(CameraBridgeViewBase.CvCameraViewListener2 cameraViewListener) {
        FtcRobotControllerActivity.turnOnCameraView.obtainMessage(1, cameraViewListener).sendToTarget();
    }

    public void stopOpenCV() {
        FtcRobotControllerActivity.turnOffCameraView.obtainMessage().sendToTarget();
    }

    @Override
    public void onCameraViewStarted(int width, int height) {

    }

    @Override
    public void onCameraViewStopped() {

    }

    @Override
    public Mat onCameraFrame(CameraBridgeViewBase.CvCameraViewFrame inputFrame) {
        // This is where the magic will happen. inputFrame has all the data for each camera frame.
        return inputFrame.rgba();
    }
}
