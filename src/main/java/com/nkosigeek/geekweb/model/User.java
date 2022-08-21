package com.nkosigeek.geekweb.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String userName;
    private String address;


    public User() 
    {
        // Default constructor
    }

    public int getId() 
    {
        return this.id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getUserName() 
    {
        return this.userName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getAddress() 
    {
        return this.address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public User id(int id) 
    {
        setId(id);
        return this;
    }

    public User name(String name) 
    {
        setName(name);
        return this;
    }

    public User userName(String userName) 
    {
        setUserName(userName);
        return this;
    }

    public User address(String address) 
    {
        setAddress(address);
        return this;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(userName, user.userName) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id, name, userName, address);
    }

    @Override
    public String toString()
    {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", userName='" + getUserName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

}
