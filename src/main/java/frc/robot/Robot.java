// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.xrp.XRPGyro;

public class Robot extends TimedRobot {
  private final XRPGyro m_gyro = new XRPGyro();

  @Override
  public void robotInit() {
    /** Note: For some reason, in simulation, resetting the
     * gyroscope does absolutely nothing when running in init().
     * Gyro must be manually reset by binding to a button,
     * event, etc. afterwards.
     */
    m_gyro.reset();
  }

  @Override
  public void robotPeriodic() {
    SmartDashboard.putNumber("AngleX", m_gyro.getAngleX());
    SmartDashboard.putNumber("AngleY", m_gyro.getAngleY());
    SmartDashboard.putNumber("AngleZ", m_gyro.getAngleZ());
  }
}
