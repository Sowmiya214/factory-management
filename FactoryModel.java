package com.jsw.certificates.Factory;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Data
@Table(name = "factory_details")
@DynamicUpdate
public class FactoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,unique = true)
    private Long id;
    private String factory_name;
    private String factory_addr;
    private String machine_name;
    private String capacity;
    private String sl_no;
    private String make;
    private String lift_height;
    private String crane_no;
    private String id_no;
    private Integer lift_machine_date;
    private String lift_machine_loc;
    private String certificate_issue;
    private String certificate_carried;
    private String heat_lift_carried_certificate;
    private String defects_remedy;
    private String swl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFactory_name() {
        return factory_name;
    }

    public void setFactory_name(String factory_name) {
        this.factory_name = factory_name;
    }

    public String getFactory_addr() {
        return factory_addr;
    }

    public void setFactory_addr(String factory_addr) {
        this.factory_addr = factory_addr;
    }

    public String getMachine_name() {
        return machine_name;
    }

    public void setMachine_name(String machine_name) {
        this.machine_name = machine_name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSl_no() {
        return sl_no;
    }

    public void setSl_no(String sl_no) {
        this.sl_no = sl_no;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getLift_height() {
        return lift_height;
    }

    public void setLift_height(String lift_height) {
        this.lift_height = lift_height;
    }

    public String getCrane_no() {
        return crane_no;
    }

    public void setCrane_no(String crane_no) {
        this.crane_no = crane_no;
    }

    public String getId_no() {
        return id_no;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public Integer getLift_machine_date() {
        return lift_machine_date;
    }

    public void setLift_machine_date(Integer lift_machine_date) {
        this.lift_machine_date = lift_machine_date;
    }

    public String getLift_machine_loc() {
        return lift_machine_loc;
    }

    public void setLift_machine_loc(String lift_machine_loc) {
        this.lift_machine_loc = lift_machine_loc;
    }

    public String getCertificate_issue() {
        return certificate_issue;
    }

    public void setCertificate_issue(String certificate_issue) {
        this.certificate_issue = certificate_issue;
    }

    public String getCertificate_carried() {
        return certificate_carried;
    }

    public void setCertificate_carried(String certificate_carried) {
        this.certificate_carried = certificate_carried;
    }

    public String getHeat_lift_carried_certificate() {
        return heat_lift_carried_certificate;
    }

    public void setHeat_lift_carried_certificate(String heat_lift_carried_certificate) {
        this.heat_lift_carried_certificate = heat_lift_carried_certificate;
    }

    public String getDefects_remedy() {
        return defects_remedy;
    }

    public void setDefects_remedy(String defects_remedy) {
        this.defects_remedy = defects_remedy;
    }

    public String getSwl() {
        return swl;
    }

    public void setSwl(String swl) {
        this.swl = swl;
    }

    public String getDevice_condition() {
        return device_condition;
    }

    public void setDevice_condition(String device_condition) {
        this.device_condition = device_condition;
    }

    public String getVisual_inspection() {
        return visual_inspection;
    }

    public void setVisual_inspection(String visual_inspection) {
        this.visual_inspection = visual_inspection;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getTested_on() {
        return tested_on;
    }

    public void setTested_on(String tested_on) {
        this.tested_on = tested_on;
    }

    private String device_condition;
    private String visual_inspection;
    private String remarks;
    private String tested_on;
    private String certificate_no;

    public String getCertificate_no() {
        return certificate_no;
    }

    public void setCertificate_no(String certificate_no) {
        this.certificate_no = certificate_no;
    }
}
