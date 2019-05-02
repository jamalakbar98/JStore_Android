package com.example.jstore_android_jamaludinakbar;

public class Supplier {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    //Konstruktor dari kelas Supplier
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {

        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
        this.id=id;
    }

    //Menampilkan nomor id supplier
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return id;
    }

    //Menampilkan nama supplier
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        return name;
    }

    //Menampilkan email supplier
    /**
     * Method getEmail()
     * @return email
     */
    public String getEmail()
    {
        return email;
    }

    //Menampilkan nomor telepon supplier
    /**
     * Method getPhoneNumber()
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    //Menampilkan lokasi supplier
    /**
     * Method getLccation()
     * @return location
     */
    public Location getLocation()
    {
        return location;
    }

    //Mengubah id supplier
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }

    //Mengubah nama supplier
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name=name;
    }

    //Mengubah email supplier
    /**
     * Method setEmail()
     * @param email
     */
    public void setEmail(String email)
    {
        this.email=email;
    }

    //Mengubah nomor telepon supplier
    /**
     * Method setPhoneNumber()
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    //Mengubah lokasi supplier
    /**
     * Method setLocation()
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
}