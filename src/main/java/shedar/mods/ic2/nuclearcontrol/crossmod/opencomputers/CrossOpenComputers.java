package shedar.mods.ic2.nuclearcontrol.crossmod.opencomputers;

import li.cil.oc.api.Driver;

public class CrossOpenComputers {
	private boolean _isApiAvailable = false;
	private Class _driverTile;
	
	public CrossOpenComputers(){
		try{
			_driverTile = Class.forName("li.cil.oc.api.Driver", false, this.getClass().getClassLoader());
			_isApiAvailable = true;
		}catch(ClassNotFoundException e){
			_isApiAvailable = false;
		}
		
		if(_isApiAvailable) addDrivers();
	}
	
	public static void addDrivers(){
		Driver.add(new DriverAdvancedInfoPanel());
	}
}
