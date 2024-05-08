package home;

enum SysList {
	
	// TODO add Faction Weapons and Upgrades
	
	// Base three in every ship
	ENGINES,
	FIRE_CONTROL,
	CONTROL_BRIDGE,
	
	// Base DF Weapons
	ARC_GUN,
	ARTILLERY,
	AUTOCANNON,
	ENERGY_LANCE,
	RAILGUN,
	
	// Base Missile Weapons
	BULLSEYE,
	HYDRA,
	MILLSTONE,
	SWARM,
	TORPEDO,
	
	// Base Upgrades
	ADAPTIVE_PLATING,
	ADVANCED_TARGET_TRACKING,
	CLOAKING_SYSTEM,
	DAZZLER,
	FRAGMENTING_AMMUNITION,
	FRONT_LOADED_VECTORING,
	PROPHET_PD,
	REINFOECED_ARMOR,
	REDIRECTED_EXHAUST,
	REPAIR_CREWS,
	SHIELDS,
	SPITFIRE_CIWS,
	TARGET_AQUISITION_GEAR,
	THRUSTER_OVERCHARGERS,
	TUNED_FIRE_CONTROL,
	TURRET_MOUNT

}

public class Sys {
	
	SysList sysID;
	
	Sys(SysList sysID) {
		
		this.sysID = sysID;
		
	}
	
}
