package org.team2168;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

	
	////////////////////////////////////Robot Map Wiring/////////////////////////////////////////////////////
	
	
	
	//Joystics////////////////////////////////////////////////////////////
	
	//PWM 0-9////////////////////////////////////////////////////////////
	public static final int  LEFT_MOTOR_1 = 0;
	public static final int  LEFT_MOTOR_2 = 1;
	public static final int  LEFT_MOTOR_3 = 2;
	
	public static final int  RIGHT_MOTOR_1 = 3;
	public static final int  RIGHT_MOTOR_2 = 4;
	public static final int  RIGHT_MOTOR_3 = 5;
	//PWM 10-19/////////////////////////////////////////////////////////
	
	
	//drivetrain///////////////////////////////////////////////////////
	public static final boolean REVERSE_LEFT_1_MOTOR_DIRECTION = false;
}
