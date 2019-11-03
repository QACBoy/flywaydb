// package com.linkr.flywaydb.controller;
//
//
// import com.linkr.flywaydb.service.IFlywayDBService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
//
// /**
//  * 描述: <br>
//  * < TODO >
//  *
//  * @author linkr
//  * @create 2019-10-23
//  * @since TODO
//  */
// @RestController
// public class FlywayDBController {
//
//     @Autowired
//     private IFlywayDBService flyway;
//
//     @GetMapping(value = "/migrate")
//     public void dbMigrate() {
//         System.out.println("migrate");
//         flyway.dbMigrate();
//     }
//
//     @GetMapping(value = "/validate")
//     public void dbValidate() {
//         System.out.println("validate");
//         flyway.dbValidate();
//     }
//
//     @GetMapping(value = "/clean")
//     public void dbClean() {
//         System.out.println("clean");
//         flyway.dbClean();
//     }
//
//     @GetMapping(value = "/info")
//     public void dbInfo() {
//         System.out.println("info");
//         flyway.dbInfo();
//     }
//
//     @GetMapping(value = "/baseline")
//     public void dbBaseline() {
//         System.out.println("baseline");
//         flyway.dbBaseline();
//     }
//
//     @GetMapping(value = "/repair")
//     public void dbRepair() {
//         System.out.println("repair");
//         flyway.dbRepair();
//     }
//
// }
