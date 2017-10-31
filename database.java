import java.util.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class MyDb {
	
	
	public static void main(String[] args)  throws Exception{

       Set<String> data =new LinkedHashSet<>();
       
       JFrame jf=new JFrame();
       
    
     	String url="jdbc:mysql://127.0.0.1:3306/studentdata";//database name,host,port,database name
		String user=JOptionPane.showInputDialog("Enter your User name ");
		String paswd=JOptionPane.showInputDialog(" Enter password ");
		//JOptionPane.showMessageDialog(jf, "USERNAME "+user+" PASSWORD "+paswd);
		String query="select * from student";
		
		
		 
		
		//FOR a single query 
		//select username from student where user id 101
		
		//load and register driver    
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//create connection
		
		Connection cn=DriverManager.getConnection(url,user,paswd);
		
		//create statement 
	   Statement st=cn.createStatement();
	   
		//create a query
	   ResultSet r= st.executeQuery(query);
	   
		//execute query
	  int count=1;   
	   while(r.next())  
	   {
	   //for the single query
	   
	   String name=r.getString(1)+" "+r.getInt(2)+" "+r.getString(3)+" "+r.getDouble(4);
	   //data.add(name);
	   
		//process results
	   // data.add(count +" "+name); cause duplication of data
	   data.add(name);
	   System.out.println(count +" "+ name);
	   count+=1;
	   }
	   
		//close statement and  connection
		st.close();
		cn.close();
		
		System.out.println("\n");
		
		//data.parallelStream().forEach( (l) -> System.out.println(l));//creates threads to deal with the task 
		
		
		
		//according to number of cores ie 2cores 2 threads
		
		/*
		 * Where stars are u can append different commands \
		 * eg -delete from table where id=value
		 * eg 1-
		To insert into database u can use 
		PreparedStatement ps=objtName.preparedStatement(?,?,?*****); number ? determined by numb. of columns
		ps.setString (String paraindex,value);
		ps.setInt(int paraindex,value)
		ps.setDouble(paramindex,value)
        
        int i=executeUpdate();//update to database
        
		
		
		
		*/
		
		

	}

}
