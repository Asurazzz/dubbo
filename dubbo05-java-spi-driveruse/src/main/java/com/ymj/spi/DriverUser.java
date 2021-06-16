package com.ymj.spi;

import java.sql.Driver;

/**
 * @author : yemingjie
 * @date : 2021/6/16 21:54
 */
public class DriverUser implements DatabaseDriver {
    @Override
    public String buildConnect(String txt) {
        return "DirverUser:" + txt;
    }
}
