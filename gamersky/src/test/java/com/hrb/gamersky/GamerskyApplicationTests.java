package com.hrb.gamersky;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.hrb.gamersky.mapper")
class GamerskyApplicationTests {

    @Test
    void contextLoads() {
    }

}
