package com.ghost.hcls.core.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseTimeEntity extends BaseEntity{

    @Basic
    @CreationTimestamp
    @Column(name = "create_time", updatable = false, columnDefinition = "datetime comment '创建时间'")
    public Date createTime;

    @Basic
    @UpdateTimestamp
    @Column(name = "update_time", columnDefinition = "datetime comment '更新时间'")
    public Date updateTime;


}