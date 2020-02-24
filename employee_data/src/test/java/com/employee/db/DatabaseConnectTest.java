/**
 * 
 */
package com.employee.db;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.eployee.config.DBConfig;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author OHIS
 *
 */
@ContextConfiguration(classes = DBConfig.class)
@RunWith(SpringRunner.class)
public class DatabaseConnectTest {
	
	@Autowired @Qualifier("testDataSource")
	private ComboPooledDataSource dataSource;

	
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void dbConnectionTest() throws SQLException {
		
	   String jdbcUrl = dataSource.getJdbcUrl();
	   String user = dataSource.getUser();
	   String password = dataSource.getPassword();
	   String driver = dataSource.getDriverClass();
	  
	  System.out.println(jdbcUrl +" "+user+" "+password);
	
	
	Connection dbCon = null;
	
	
	try {
		dbCon = DriverManager.getConnection(jdbcUrl, user, password);
		
		assertThat(dbCon).isNotNull();
	}
	catch(SQLException sqle) {
		sqle.printStackTrace();
	}
	finally {
		dbCon.close();
		
			}
		}
	}


