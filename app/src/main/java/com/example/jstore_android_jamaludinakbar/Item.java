package com.example.jstore_android_jamaludinakbar;

public class Item {
    private int id;
    private String name;
    private int price;
    private String category;
    private String status;
    private Supplier supplier;

    //Konstruktor dari kelas Item
    public Item(int id, String name, int price, String category, String status, Supplier supplier)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;
    }

    //Menampilkan nomor id
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return id;
    }

    //Menampilkan nama Item
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        return name;
    }

    //Menampilkan harga Item
    /**
     * Method getPrice()
     * @return price
     */
    public int getPrice()
    {
        return price;
    }

    //Menampilkan kategori Item
    /**
     * Method getCategory()
     * @return category
     */
    public String getCategory()
    {
        return category;
    }

    public String getStatus()
    {
        return status;
    }

    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }

    //Mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }

    //Mengganti nama Item
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name=name;
    }

    //Mengganti harga Item
    /**
     * Method setPrice()
     * @param price
     */
    public void setPrice(int price)
    {
        this.price=price;
    }

    //Mengganti kategori Item
    /**
     * Method setCategory()
     * @param category
     */
    public void setCategory(String category)
    {
        this.category=category;
    }

    public void setStatus(String status)
    {
        this.status=status;
    }

    //Mengganti supplier Item
    /**
     * Method setSupplier()
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }

}