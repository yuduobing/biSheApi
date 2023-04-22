package com.bishe.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Myuser)表实体类
 *
 * @author 😀
 */

public class Myuser extends Model<Myuser> {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String nickname;
    private String phone;

    private String name;
    //楼宇
    private String loufang;
    //房间号
    private String room;
    //单元
    private String danyuan;
    //备注信息
    private String remark;

    private Date createDate;

    private Date updateDate;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoufang() {
        return loufang;
    }

    public void setLoufang(String loufang) {
        this.loufang = loufang;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDanyuan() {
        return danyuan;
    }

    public void setDanyuan(String danyuan) {
        this.danyuan = danyuan;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}

