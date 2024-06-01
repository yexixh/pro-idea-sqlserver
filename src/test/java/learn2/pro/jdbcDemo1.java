package learn2.pro;

import java.sql.*;

public class jdbcDemo1 {

        private static Connection dbConn = null;

        public static void main(String[] args) {
            String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Furnituresale;Encrypt=false";//这里输入自己的数据库名称（即将Stu改为你自己的数据库名称）其余都可以不做修改
            try {
                //1.加载驱动
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("加载驱动成功！");
                //2.连接
                dbConn = DriverManager.getConnection(dbURL, "adminSale", "123456");
                System.out.println("连接数据库成功！");
                String sql="select customID from Cus";//这个语句就是表的查询语句，按照你所建的表修改名称
                PreparedStatement statement=null;
                statement=dbConn.prepareStatement(sql);
                ResultSet res=null;
                res=statement.executeQuery();
                while(res.next()){
                    String title=res.getString("customID");
                    System.out.println(title);
                }
            }catch(Exception e) {
                e.printStackTrace();
                System.out.println("连接数据库失败！");
            }
    }
}