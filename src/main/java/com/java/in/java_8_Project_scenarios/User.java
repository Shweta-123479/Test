package com.java.in.java_8_Project_scenarios;

public class User {

    private int id;
    private String names;
    private Boolean isActive;

    public User()
    {

    }

    public User(int id, String names, Boolean isActive)
    {
        this.id=id;
        this.names=names;
        this.isActive=isActive;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public String getNames()
    {
        return names;
    }
    public void setNames(String names)
    {
        this.names=names;
    }

    public Boolean getIsActive()
    {
        return isActive;
    }
    public void setIsActive(Boolean isActive)
    {
        this.isActive=isActive;
    }

    public String toString()
    {
        return "User ="+id+"  "+names+" "+isActive+" ";
    }

}
