package commapsnq.assignment.test.utility;


public class EnvProperties {
	
	private static String env = System.getProperty("env");
	private static String application = System.getProperty("application");
	public static String openUrl = CustomProperties.getConfigProperty("testAssignmentMapSYNQURL");
	public static String node = CustomProperties.getConfigProperty("Node1");

	public static String driver = CustomProperties.getConfigProperty("driver");
	public static String dbHost = CustomProperties.getConfigProperty("dbHost");
	public static String dbUserName = CustomProperties.getConfigProperty("dbUserName");
	public static String dbPassword = CustomProperties.getConfigProperty("dbPassword");
	public static String dbPort = CustomProperties.getConfigProperty("dbPort");
	public static String dbServiceName = CustomProperties.getConfigProperty("dbServiceName");

}
