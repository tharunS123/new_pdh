package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class NEO extends SubsystemBase {
    public static CANSparkMax neo = new CANSparkMax(RobotMap.NEO, CANSparkMaxLowLevel.MotorType.kBrushless);
    public NEO() {
        neo.restoreFactoryDefaults();
        neo.setInverted(true);
        neo.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }
    public void setSpeed(double percent) {
        neo.set(percent);
    }

}
