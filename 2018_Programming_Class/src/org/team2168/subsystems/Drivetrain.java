package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
	
	
	private static Drivetrain instance = null;
	
	//private member variables for 6 drivetrain motor controllers
	private static VictorSP leftMotor1;
	private static VictorSP leftMotor2;
	private static VictorSP leftMotor3;
	
	private static VictorSP rightMotor1;
	private static VictorSP rightMotor2;
	private static VictorSP rightMotor3;
	
	/**
	 * Private constructor to init all member variables
	 * protects against multiple instances
	 */
	private Drivetrain(){
		//Initialize all member variables
		leftMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWM);
		leftMotor2 = new VictorSP(RobotMap.LEFT_MOTOR_2_PWM);
		leftMotor3 = new VictorSP(RobotMap.LEFT_MOTOR_3_PWM);
		
		rightMotor1 = new VictorSP(RobotMap.RIGHT_MOTOR_1_PWM);
		rightMotor2 = new VictorSP(RobotMap.RIGHT_MOTOR_2_PWM);
		rightMotor3 = new VictorSP(RobotMap.RIGHT_MOTOR_3_PWM);
		}
	
	
	public static Drivetrain getInstance(){
		if(instance == null)
				instance = new Drivetrain();
			return instance;
	}
	
	/**
	 * Drives Left Motor 1 
	 * positive is forward, negative is backward
	 * @param speed is a value between -1 and 1
	 */
	public void driveLeft1(double speed){
		if(RobotMap.REVERSE_LEFT_MOTOR_1)
			speed = -speed;
		leftMotor1.set(speed);
	}
	
	/**
	 * Drives Left Motor 2
	 * positive is forward, negative is backward
	 * @param speed is a value between -1 and 1
	 */
	public void driveLeft2(double speed){
		if(RobotMap.REVERSE_LEFT_MOTOR_2)
			speed = -speed;
		leftMotor2.set(speed);
	}
	
	/**
	 * Drives Left Motor 3 
	 * positive is forward, negative is backward
	 * @param speed is a value between -1 and 1
	 */
	public void driveLeft3(double speed){
		if(RobotMap.REVERSE_LEFT_MOTOR_3)
			speed = -speed;
		leftMotor3.set(speed);
	}
	
	/**
	 * Drives Right Motor 1 
	 * positive is forward, negative is backward
	 * @param speed is a value between -1 and 1
	 */
	public void driveRight1(double speed){
		if(RobotMap.REVERSE_RIGHT_MOTOR_1)
			speed = -speed;
		rightMotor1.set(speed);
	}
	
	/**
	 * Drives Right Motor 2 
	 * positive is forward, negative is backward
	 * @param speed is a value between -1 and 1
	 */
	public void driveRight2(double speed){
		if(RobotMap.REVERSE_RIGHT_MOTOR_2)
			speed = -speed;
		rightMotor2.set(speed);
	}
	
	/**
	 * Drives Right Motor 3
	 * positive is forward, negative is backward
	 * @param speed is a value between -1 and 1
	 */
	public void driveRight3(double speed){
		if(RobotMap.REVERSE_RIGHT_MOTOR_3)
			speed = -speed;
		rightMotor3.set(speed);
	}
	
	public void driveRight(double speed){
		driveRight3(speed);
		driveRight2(speed);
		driveRight1(speed);
	}
	
	public void driveLeft(double speed){
		driveLeft3(speed);
		driveLeft2(speed);
		driveLeft1(speed);
	}
	
	public void tankDrive(double speedLeft, double speedRight){
		driveLeft(speedLeft);
		driveRight(speedRight);
	}
	
	@Override
	protected void initDefaultCommand(){
		setDefaultCommand(new DriveWithJoysticks());
	}

}
