package com.ghost.hcls.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 实体模型基础类
 * Created by admin on 2019/1/11.
 */
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    /**
     * 唯一主键
     * 主键生成策略（uuid2）
     */
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", unique = true, length = 36, columnDefinition = "varchar(36) comment '唯一主键'")
    private String id;

    /**
     * 使能标志，用于标识是否已删除，为false时表示不可用或已删除
     */
    @JsonIgnore
    @Column(name = "able", columnDefinition = "bit(1) comment '使能标志'")
    private Boolean able = true;
}
