package tw.com.luke.config;

public class DataSourceContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    private static final ThreadLocal<String> tableIndexHolder= new ThreadLocal<String>();
    public static  String getTableIndex(){
        return (String)tableIndexHolder.get();
    }
    public static void clearTableIndex(){
        tableIndexHolder.remove();
    }
    public static void setTableIndex(String tableIndex){
        tableIndexHolder.set(tableIndex);
    }
    public static void setDBType(String dbType) {
        contextHolder.set(dbType);
    }
    public static String getDBType() {
        return ((String) contextHolder.get());
    }
    public static void clearDBType() {
        contextHolder.remove();
    }
}
