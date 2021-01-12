package org.dell.kube.pages;

public class Page {
    public Long id;
    public String businessName;
    public Long categoryId;
    public String address;
    public String contactNumber;

    public Page() {

    }
    public Page(Long id, String business_name, String address, Long category_id, String contact_number) {
        this.id = id;
        this.businessName = business_name;

        this.address = address;
        this.categoryId = category_id;
        this.contactNumber = contact_number;
    }

    public Page(String businessName, String address, Long categoryId, String contactNumber) {
        this.businessName = businessName;
        this.address = address;
        this.categoryId = categoryId;
        this.contactNumber = contactNumber;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
