package com.zy._05_import;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 10:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DataSourceConfig.class, RedisConfig.class})
@ContextConfiguration(classes = AppConfig.class)
public class ImportTest {

    @Autowired
    private DataSource ds;

    @Autowired
    private RedisTemplate rt;

    @Test
    public void test() {
        System.out.println(ds);
        System.out.println(rt);
    }

}
