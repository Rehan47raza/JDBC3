
package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestProcedure {
	
	
	public static ArrayList<Author> getBookscountbyAuthor(DbTransaction db) 
	{
		ArrayList<Author> ar = new ArrayList<Author>();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try
		{
			cn=db.getConnection();
			st=cn.createStatement();
			String sql="SELECT "+db.getTableName1()+".AUTHOR_NAME, COUNT("+db.getTableName2()+".AUTHOR_ID) FROM "+db.getTableName1()+" , "+db.getTableName2()+" WHERE "+db.getTableName1()+".AUTHOR_ID="+db.getTableName2()+".AUTHOR_ID GROUP BY "+db.getTableName1()+".AUTHOR_NAME";
			//String sql1="select ";//
			
			rs = st.executeQuery(sql);
			//System.out.println(rs.getFetchSize());
			while(rs.next())
			{
				Author a = new Author();
				a.setAuthorName(rs.getString(1));
				//System.out.println(rs.getString(1));
				a.setCount(rs.getInt(2));
				//System.out.println(rs.getInt(2));
				
				
				ar.add(a);
				
			}
			
			
		}catch (Exception e) {
			return null;
		}
		
		return ar;
	}
	

}
