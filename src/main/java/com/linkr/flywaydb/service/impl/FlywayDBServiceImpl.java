// package com.linkr.flywaydb.service.impl;
//
// import com.linkr.flywaydb.service.IFlywayDBService;
// import org.flywaydb.core.Flyway;
// import org.flywaydb.core.api.MigrationInfoService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
//
// /**
//  * 描述: <br>
//  * < TODO >
//  *
//  * @author linkr
//  * @create 2019-10-23
//  * @since TODO
//  */
// @Service
// public class FlywayDBServiceImpl implements IFlywayDBService {
//
//     @Autowired
//     private Flyway flyway;
//
//
//     @Override
//     public int dbMigrate() {
//         System.out.println("dbMigrate");
//         return flyway.migrate();
//     }
//
//     @Override
//     public void dbValidate() {
//         System.out.println("dbValidate");
//         flyway.validate();
//     }
//
//     @Override
//     public void dbClean() {
//         System.out.println("dbClean");
//         flyway.clean();
//     }
//
//     @Override
//     public MigrationInfoService dbInfo() {
//         System.out.println("dbInfo");
//         return flyway.info();
//     }
//
//     @Override
//     public void dbBaseline() {
//         System.out.println("dbBaseline");
//         flyway.baseline();
//     }
//
//     @Override
//     public void dbRepair() {
//         System.out.println("dbRepair");
//         flyway.repair();
//     }
//
// }
