package com.linkr.flywaydb;

import com.alibaba.fastjson.JSONObject;
import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 描述: <br>
 * < TODO >
 *
 * @author qacboy
 * @create 2019-10-23
 * @since TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FlywayTest {
    @Autowired
    private Flyway flyway;

    @Test
    public void dbMigrate() {
        System.out.println(flyway.migrate());
    }

    @Test
    public void dbValidate() {
        flyway.validate();
    }

    @Test
    public void dbClean() {
        flyway.clean();
    }

    @Test
    public void dbInfo() {
        System.out.println(JSONObject.toJSONString(flyway.info()));
    }

    @Test
    public void dbBaseline() {
        flyway.baseline();
    }

    @Test
    public void dbRepair() {
        flyway.repair();
    }
}
