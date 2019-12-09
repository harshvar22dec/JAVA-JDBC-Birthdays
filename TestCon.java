import java.sql.*;
import java.util.Scanner;
class testCon{
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/test";
        String us="root";
        String pw="";
        String query="insert into Birthdays values(?,?,?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, us, pw);
        PreparedStatement st=con.prepareStatement(query);
        st.setString(1,sc.nextLine());//takes name of friend
        st.setInt(2,sc.nextInt());//takes birthdate of friend
        st.setInt(3,sc.nextInt());//takes birth month of friend
        st.setInt(4,sc.nextInt());//takes birth year of friend
        st.setString(5,sc.next());//takes phone of friend
        int rs=st.executeUpdate();
        if(rs>0)
            System.out.println("done");
        else
            System.out.println("not done");
    }
}