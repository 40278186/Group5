package com.napier.sem;

import java.sql.*;

/**
 * Represents an employee
 */
public class Employee
{

    private Connection con = null;

    /**
     * Employee number
     */
    public int emp_no;

    /**
     * Employee's first name
     */
    public String first_name;
    /**
     * Employee's last name
     */
    public String last_name;
    /**
     * Employee's job title
     */
    public String title;
    /**
     * Employee's salary
     */
    public int salary;
    /**
     * Employee's current department
     */
    public String dept_name;
    /**
     * Employee's manager
     */
    public String manager;

    public Employee getEmployee(int ID)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT emp_no, first_name, last_name "
                            + "FROM employees "
                            + "WHERE emp_no = " + ID;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Employee emp = new Employee();
                emp.emp_no = rset.getInt("emp_no");
                emp.first_name = rset.getString("first_name");
                emp.last_name = rset.getString("last_name");
                return emp;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

}

