// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5299.SixDollarMan.subsystems;

//import org.usfirst.frc5299.SixDollarMan.RobotMap;
import org.usfirst.frc5299.SixDollarMan.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
	

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    /*
    private final Talon leftMotor = RobotMap.driveTrainLeftMotor;
    private final Talon rightMotor = RobotMap.driveTrainRightMotor;
    private final Talon leftMotor2 = RobotMap.driveTrainLeftMotor;
    private final Talon rightMotor2 = RobotMap.driveTrainRightMotor;
    private final RobotDrive robotDrive21 = RobotMap.driveTrainRobotDrive21;
    */

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        //setDefaultCommand(new DriveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void takeJoystickInputs(Joystick leftJoystick) {
    	//robotDrive21.arcadeDrive(leftJoystick.getRawAxis(1), leftJoystick.getRawAxis(0));
    }
    public void stop() {
    	//robotDrive21.drive(0,0);
    }
}

