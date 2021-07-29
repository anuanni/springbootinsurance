package com.insurance.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Insurance
{
//Defining policy id as primary key
@Id
@Column
private int policyid;
@Column
private String policyname;
@Column
private String tenure;
@Column
private int amount;
public int getpolicyid() 
{
return policyid;
}
public void setpolicyid(int policyid) 
{
this.policyid = policyid;
}
public String getpolicyname()
{
return policyname;
}
public void setpolicyname(String policyname) 
{
this.policyname = policyname;
}
public String gettenure() 
{
return tenure;
}
public void settenure(String tenure) 
{
this.tenure = tenure;
}
public int getamount() 
{
return amount;
}
public void setamount(int amount) 
{
this.amount = amount;
}
}