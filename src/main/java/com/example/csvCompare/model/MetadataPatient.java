package com.example.csvCompare.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MetadataPatient{
	@JsonProperty("id") 
    public int getId() { 
		 return this.id; } 
    public void setId(int id) { 
		 this.id = id; } 
    int id;
    @JsonProperty("idMedAcount") 
    public int getIdMedAcount() { 
		 return this.idMedAcount; } 
    public void setIdMedAcount(int idMedAcount) { 
		 this.idMedAcount = idMedAcount; } 
    int idMedAcount;
    @JsonProperty("id_his_occupation") 
    public String getId_his_occupation() { 
		 return this.id_his_occupation; } 
    public void setId_his_occupation(String id_his_occupation) { 
		 this.id_his_occupation = id_his_occupation; } 
    String id_his_occupation;
    @JsonProperty("id_his_marital_status") 
    public String getId_his_marital_status() { 
		 return this.id_his_marital_status; } 
    public void setId_his_marital_status(String id_his_marital_status) { 
		 this.id_his_marital_status = id_his_marital_status; } 
    String id_his_marital_status;
    @JsonProperty("id_med_document_type") 
    public int getId_med_document_type() { 
		 return this.id_med_document_type; } 
    public void setId_med_document_type(int id_med_document_type) { 
		 this.id_med_document_type = id_med_document_type; } 
    int id_med_document_type;
    @JsonProperty("id_med_department") 
    public int getId_med_department() { 
		 return this.id_med_department; } 
    public void setId_med_department(int id_med_department) { 
		 this.id_med_department = id_med_department; } 
    int id_med_department;
    @JsonProperty("creation_user") 
    public int getCreation_user() { 
		 return this.creation_user; } 
    public void setCreation_user(int creation_user) { 
		 this.creation_user = creation_user; } 
    int creation_user;
    @JsonProperty("creation_date") 
    public String getCreation_date() { 
		 return this.creation_date; } 
    public void setCreation_date(String creation_date) { 
		 this.creation_date = creation_date; } 
    String creation_date;
    @JsonProperty("identification") 
    public int getIdentification() { 
		 return this.identification; } 
    public void setIdentification(int identification) { 
		 this.identification = identification; } 
    int identification;
    @JsonProperty("first_name") 
    public String getFirst_name() { 
		 return this.first_name; } 
    public void setFirst_name(String first_name) { 
		 this.first_name = first_name; } 
    String first_name;
    @JsonProperty("middle_name") 
    public String getMiddle_name() { 
		 return this.middle_name; } 
    public void setMiddle_name(String middle_name) { 
		 this.middle_name = middle_name; } 
    String middle_name;
    @JsonProperty("last_name") 
    public String getLast_name() { 
		 return this.last_name; } 
    public void setLast_name(String last_name) { 
		 this.last_name = last_name; } 
    String last_name;
    @JsonProperty("secound_last_name") 
    public String getSecound_last_name() { 
		 return this.secound_last_name; } 
    public void setSecound_last_name(String secound_last_name) { 
		 this.secound_last_name = secound_last_name; } 
    String secound_last_name;
    @JsonProperty("email") 
    public String getEmail() { 
		 return this.email; } 
    public void setEmail(String email) { 
		 this.email = email; } 
    String email;
    @JsonProperty("phone_number") 
    public int getPhone_number() { 
		 return this.phone_number; } 
    public void setPhone_number(int phone_number) { 
		 this.phone_number = phone_number; } 
    int phone_number;
    @JsonProperty("mobile_phone") 
    public int getMobile_phone() { 
		 return this.mobile_phone; } 
    public void setMobile_phone(int mobile_phone) { 
		 this.mobile_phone = mobile_phone; } 
    int mobile_phone;
    @JsonProperty("gender") 
    public String getGender() { 
		 return this.gender; } 
    public void setGender(String gender) { 
		 this.gender = gender; } 
    String gender;
    @JsonProperty("birth_date") 
    public String getBirth_date() { 
		 return this.birth_date; } 
    public void setBirth_date(String birth_date) { 
		 this.birth_date = birth_date; } 
    String birth_date;
    @JsonProperty("address") 
    public String getAddress() { 
		 return this.address; } 
    public void setAddress(String address) { 
		 this.address = address; } 
    String address;
    @JsonProperty("zone") 
    public int getZone() { 
		 return this.zone; } 
    public void setZone(int zone) { 
		 this.zone = zone; } 
    int zone;
    @JsonProperty("type") 
    public int getType() { 
		 return this.type; } 
    public void setType(int type) { 
		 this.type = type; } 
    int type;
    @JsonProperty("active") 
    public int getActive() { 
		 return this.active; } 
    public void setActive(int active) { 
		 this.active = active; } 
    int active;
    @JsonProperty("level") 
    public int getLevel() { 
		 return this.level; } 
    public void setLevel(int level) { 
		 this.level = level; } 
    int level;
    @JsonProperty("id_med_community") 
    public String getId_med_community() { 
		 return this.id_med_community; } 
    public void setId_med_community(String id_med_community) { 
		 this.id_med_community = id_med_community; } 
    String id_med_community;
    @JsonProperty("id_med_academic") 
    public String getId_med_academic() { 
		 return this.id_med_academic; } 
    public void setId_med_academic(String id_med_academic) { 
		 this.id_med_academic = id_med_academic; } 
    String id_med_academic;
    @JsonProperty("neighborhood") 
    public String getNeighborhood() { 
		 return this.neighborhood; } 
    public void setNeighborhood(String neighborhood) { 
		 this.neighborhood = neighborhood; } 
    String neighborhood;
}

