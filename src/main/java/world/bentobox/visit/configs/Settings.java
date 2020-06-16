package world.bentobox.visit.configs;


import java.util.HashSet;
import java.util.Set;

import world.bentobox.bentobox.api.configuration.ConfigComment;
import world.bentobox.bentobox.api.configuration.ConfigEntry;
import world.bentobox.bentobox.api.configuration.ConfigObject;
import world.bentobox.bentobox.api.configuration.StoreAt;


/**
 * Settings that implements ConfigObject is powerful and dynamic Config Objects that
 * does not need custom parsing. If it is correctly loaded, all its values will be available.
 *
 * Without Getter and Setter this class will not work.
 *
 * To specify location for config object to be stored, you should use @StoreAt(filename="{config file name}", path="{Path to your addon}")
 * To save comments in config file you should use @ConfigComment("{message}") that adds any message you want to be in file.
 */
@StoreAt(filename="config.yml", path="addons/Visit")
@ConfigComment("VisitAddon Configuration [version]")
@ConfigComment("This config file is dynamic and saved when the server is shutdown.")
@ConfigComment("")
public class Settings implements ConfigObject
{
	// ---------------------------------------------------------------------
	// Section: Variables
	// ---------------------------------------------------------------------

	/**
	 * You can define any variable you want, as long as it can be serialized.
	 * For each variable you need corresponding Getter and Setter method.
	 *
	 * To specify which config entry this variable refer you can just add @ConfigEntry(path = "{Path to your entry}")
	 *
	 * Good codding practise is to initialize variable with default value
	 */
	@ConfigComment("")
	@ConfigComment("This list stores GameModes in which Example addon should not work.")
	@ConfigComment("To disable addon it is necessary to write its name in new line that starts with -. Example:")
	@ConfigComment("disabled-gamemodes:")
	@ConfigComment(" - BSkyBlock")
	@ConfigEntry(path = "disabled-gamemodes")
	private Set<String> disabledGameModes = new HashSet<>();

	@ConfigComment("")
	@ConfigComment("Allows to define default payment for visiting the island.")
	@ConfigComment("Setting 0 or less will mean that default value is free.")
	@ConfigComment("Payment goes to island owner.")
	@ConfigEntry(path = "default-settings.payment")
	private double defaultVisitingPayment = 0.0;

	@ConfigComment("")
	@ConfigComment("Allows to set if players can visit other islands while")
	@ConfigComment("all members are offline.")
	@ConfigEntry(path = "default-settings.offline")
	private boolean defaultVisitingOffline = true;

	@ConfigComment("")
	@ConfigComment("Allows to set if default visit flag value is set as")
	@ConfigComment("enabled (true) or disabled (false).")
	@ConfigEntry(path = "default-settings.enabled")
	private boolean defaultVisitingEnabled = false;


	// ---------------------------------------------------------------------
	// Section: Getters and Setters
	// ---------------------------------------------------------------------


	/**
	 * This method returns the disabledGameModes value.
	 * @return the value of disabledGameModes.
	 */
	public Set<String> getDisabledGameModes()
	{
		return this.disabledGameModes;
	}


	/**
	 * This method sets the disabledGameModes value.
	 * @param disabledGameModes the disabledGameModes new value.
	 *
	 */
	public void setDisabledGameModes(Set<String> disabledGameModes)
	{
		this.disabledGameModes = disabledGameModes;
	}


	/**
	 * This method returns the defaultVisitingPayment value.
	 * @return the value of defaultVisitingPayment.
	 */
	public double getDefaultVisitingPayment()
	{
		return this.defaultVisitingPayment;
	}


	/**
	 * This method sets the defaultVisitingPayment value.
	 * @param defaultVisitingPayment the defaultVisitingPayment new value.
	 *
	 */
	public void setDefaultVisitingPayment(double defaultVisitingPayment)
	{
		this.defaultVisitingPayment = defaultVisitingPayment;
	}


	/**
	 * This method returns the defaultVisitingOffline value.
	 * @return the value of defaultVisitingOffline.
	 */
	public boolean isDefaultVisitingOffline()
	{
		return this.defaultVisitingOffline;
	}


	/**
	 * This method sets the defaultVisitingOffline value.
	 * @param defaultVisitingOffline the defaultVisitingOffline new value.
	 *
	 */
	public void setDefaultVisitingOffline(boolean defaultVisitingOffline)
	{
		this.defaultVisitingOffline = defaultVisitingOffline;
	}


	/**
	 * This method returns the defaultVisitingEnabled value.
	 * @return the value of defaultVisitingEnabled.
	 */
	public boolean isDefaultVisitingEnabled()
	{
		return this.defaultVisitingEnabled;
	}


	/**
	 * This method sets the defaultVisitingEnabled value.
	 * @param defaultVisitingEnabled the defaultVisitingEnabled new value.
	 *
	 */
	public void setDefaultVisitingEnabled(boolean defaultVisitingEnabled)
	{
		this.defaultVisitingEnabled = defaultVisitingEnabled;
	}
}