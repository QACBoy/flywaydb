package com.example.flywaydb.service;

import org.flywaydb.core.api.MigrationInfoService;

/**
 * 描述: <br>
 * < TODO >
 *
 * @author qacboy
 * @create 2019-10-23
 * @since TODO
 */
public interface IFlywayDBService {

    /**
     * 数据迁移，新增数据脚本时，执行 migrate 进行更新
     */
    int dbMigrate();

    /**
     * 校验数据中是否有执行失败的脚本，当有执行失败的时候，执行 repair 进行修复
     */
    void dbValidate();

    /**
     * 警告： 删除 数据库 中所有的表
     * 谨慎操作!!!
     * 传说中的删库跑路
     */
    void dbClean();

    MigrationInfoService dbInfo();

    void dbBaseline();

    /**
     * 清除数据中执行失败的脚本记录
     */
    void dbRepair();

}
