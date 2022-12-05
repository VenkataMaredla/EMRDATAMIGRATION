package com.example.csvCompare.model;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HisPatient {	

	public int id;
    public int idMedAcount;
    public int id_his_occupation;
    public int id_his_marital_status;
    public int id_med_document_type;
    public int id_med_department;
    public int creation_user;
    public int delete_user;
    public int id_med_city;
    public Timestamp creation_date;
    public Timestamp delete_date;
    public String identification;
    public String first_name;
    public String middle_name;
    public String last_name;
    public String secound_last_name;
    public String email;
    public String phone_number;
    public String mobile_phone;
    public String gender;
    public Date birth_date;
    public String address;
    public int zone;
    public int type;
    public int active;
    public int level;
    public int id_med_community;
    public int id_med_academic;
    public String neighborhood;
    public int id_old;
    public String check_digit;
    public String patient_id_tissue;
    public int id_net_external_user;
    public String cep;
    public String mobile_phone_2;
    public String mobile_phone_3;
    public String refering_hospital;
    public String referring_doctor;
    public String zip_code;
    
    public HisPatient() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMedAcount() {
		return idMedAcount;
	}

	public void setIdMedAcount(int idMedAcount) {
		this.idMedAcount = idMedAcount;
	}

	public int getId_his_occupation() {
		return id_his_occupation;
	}

	public void setId_his_occupation(String id_his_occupation) {
		if (id_his_occupation.toLowerCase().equals("null")) {
			this.id_his_occupation = 0;
		} else
			this.id_his_occupation = Integer.parseInt(id_his_occupation);
	}

	public int getId_his_marital_status() {
		return id_his_marital_status;
	}

	public void setId_his_marital_status(String id_his_marital_status) {
		if (id_his_marital_status.toLowerCase().equals("null")) {
			this.id_his_marital_status = 0;
		} else
			this.id_his_marital_status = Integer.parseInt(id_his_marital_status);
	}

	public int getId_med_document_type() {
		return id_med_document_type;
	}

	public void setId_med_document_type(int id_med_document_type) {
		this.id_med_document_type = id_med_document_type;
	}

	public int getId_med_department() {
		return id_med_department;
	}

	public void setId_med_department(int id_med_department) {
		this.id_med_department = id_med_department;
	}

	public int getCreation_user() {
		return creation_user;
	}

	public void setCreation_user(int creation_user) {
		this.creation_user = creation_user;
	}

	
	public void setDelete_user(String delete_user) {
		if (delete_user.toLowerCase().equals("null")) {
			this.delete_user = 0;
		} else
			this.delete_user = Integer.parseInt(delete_user);	
	}
	
	public Integer getDelete_user() {
		System.out.println("delete_user: "+delete_user);
		return delete_user;
	}

	public void setId_med_city(String id_med_city) {
		if (id_med_city.toLowerCase().equals("null")) {
			this.id_med_city = 0;
		} else
			this.id_med_city = Integer.parseInt(id_med_city);
	}

	public int getId_med_city() {
		return id_med_city;
	}

	

	public Timestamp getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		if (creation_date.toLowerCase().equals("null")) {
			this.creation_date = null;
		} else {
		try {
		      DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		      Date date = formatter.parse(creation_date);
		      Timestamp timeStampDate = new Timestamp(date.getTime());
		      System.out.println("timeStampDate: "+timeStampDate);
		      this.creation_date = timeStampDate;
		    } catch (ParseException e) {
		      System.out.println("Exception :" + e);
		    }
		}
	}

	public Timestamp getDelete_date() {
		return delete_date;
	}

	public void setDelete_date(String delete_date) {
		if (delete_date.toLowerCase().equals("null")) {
			this.delete_date = null; 
		} else {
		try {
		      DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		      Date date = formatter.parse(delete_date);
		      Timestamp timeStampDate = new Timestamp(date.getTime());
		      System.out.println("timeStampDate: "+timeStampDate);
		      this.creation_date = timeStampDate;
		    } catch (ParseException e) {
		      System.out.println("Exception :" + e);
		    }
		}
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSecound_last_name() {
		return secound_last_name;
	}

	public void setSecound_last_name(String secound_last_name) {
		this.secound_last_name = secound_last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setId_med_community(String id_med_community) {
		
		if(id_med_community.toLowerCase().equals("null")) {
			this.id_med_community = 0;
		}else 
			this.id_med_community = Integer.parseInt(id_med_community);
		
	}

	public int getId_med_community() {
		return id_med_community;
	}	

	public void setId_med_academic(String id_med_academic) {
		if(id_med_academic.toLowerCase().equals("null")) {
			this.id_med_academic = 0;
		}else 
			this.id_med_academic = Integer.parseInt(id_med_academic);
	}


	public int getId_med_academic() {
		return id_med_academic;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public int getId_old() {
		return id_old;
	}

	public void setId_old(String id_old) {
		if(id_old.toLowerCase().equals("null")) {
			this.id_old = 0;
		}else 
			this.id_old = Integer.parseInt(id_old);
	}

	public String getCheck_digit() {
		return check_digit;
	}

	public void setCheck_digit(String check_digit) {
		this.check_digit = check_digit;
	}

	public String getPatient_id_tissue() {
		return patient_id_tissue;
	}

	public void setPatient_id_tissue(String patient_id_tissue) {
		this.patient_id_tissue = patient_id_tissue;
	}

	public int getId_net_external_user() {
		return id_net_external_user;
	}

	public void setId_net_external_user(String id_net_external_user) {
		if(id_net_external_user.toLowerCase().equals("null")) {
			this.id_net_external_user = 0;
		}else 
			this.id_net_external_user = Integer.parseInt(id_net_external_user);
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMobile_phone_2() {
		return mobile_phone_2;
	}

	public void setMobile_phone_2(String mobile_phone_2) {
		this.mobile_phone_2 = mobile_phone_2;
	}

	public String getMobile_phone_3() {
		return mobile_phone_3;
	}

	public void setMobile_phone_3(String mobile_phone_3) {
		this.mobile_phone_3 = mobile_phone_3;
	}

	public String getRefering_hospital() {
		return refering_hospital;
	}

	public void setRefering_hospital(String refering_hospital) {
		this.refering_hospital = refering_hospital;
	}

	public String getReferring_doctor() {
		return referring_doctor;
	}

	public void setReferring_doctor(String referring_doctor) {
		this.referring_doctor = referring_doctor;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	@Override
	public String toString() {
		return "HisPatient [id=" + id + ", idMedAcount=" + idMedAcount + ", id_his_occupation=" + id_his_occupation
				+ ", id_his_marital_status=" + id_his_marital_status + ", id_med_document_type=" + id_med_document_type
				+ ", id_med_department=" + id_med_department + ", creation_user=" + creation_user + ", delete_user="
				+ delete_user + ", id_med_city=" + id_med_city + ", creation_date=" + creation_date + ", delete_date="
				+ delete_date + ", identification=" + identification + ", first_name=" + first_name + ", middle_name="
				+ middle_name + ", last_name=" + last_name + ", secound_last_name=" + secound_last_name + ", email="
				+ email + ", phone_number=" + phone_number + ", mobile_phone=" + mobile_phone + ", gender=" + gender
				+ ", birth_date=" + birth_date + ", address=" + address + ", zone=" + zone + ", type=" + type
				+ ", active=" + active + ", level=" + level + ", id_med_community=" + id_med_community
				+ ", id_med_academic=" + id_med_academic + ", neighborhood=" + neighborhood + ", id_old=" + id_old
				+ ", check_digit=" + check_digit + ", patient_id_tissue=" + patient_id_tissue
				+ ", id_net_external_user=" + id_net_external_user + ", cep=" + cep + ", mobile_phone_2="
				+ mobile_phone_2 + ", mobile_phone_3=" + mobile_phone_3 + ", refering_hospital=" + refering_hospital
				+ ", referring_doctor=" + referring_doctor + ", zip_code=" + zip_code + "]";
	}
    
    

	}
