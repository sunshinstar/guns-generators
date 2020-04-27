package cn.stylefeng.guns.generator.executor.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 默认的代码生成的配置
 *
 * @author fengshuonan
 * @date 2017-10-28-下午8:27
 */
public class GunsGeneratorConfig extends AbstractGeneratorConfig {

    protected void globalConfig() {
        //写自己项目的绝对路径,注意具体到java目录
        globalConfig.setOutputDir("G:\\learn\\Mybatis\\guns-generator\\src\\main\\java\\miaodi");
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("");
    }

    protected void dataSourceConfig() {
        /*dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("0XmsxYngfHlesYXM");
        dataSourceConfig.setUrl("jdbc:mysql://119.23.65.189:3307/boss?characterEncoding=utf8");*/
        dataSourceConfig.setDbType(DbType.ORACLE);
        dataSourceConfig.setDriverName("oracle.jdbc.driver.OracleDriver");
        dataSourceConfig.setUsername("mdtest_ora");
        dataSourceConfig.setPassword("qmy_ora_2018123456");
        dataSourceConfig.setUrl("jdbc:oracle:thin:@192.168.11.246:1521:mdora");
    }

    protected void strategyConfig() {
        // 此处可以修改为您的表前缀
//        strategyConfig.setTablePrefix(new String[]{""});
        strategyConfig.setInclude(new String[]{"REVERSE_GATEWAY"});
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    }

    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setEntity("miaodi.model");
        packageConfig.setMapper("miaodi.dao");
        packageConfig.setXml("miaodi.mapping");
    }

    protected void contextConfig() {
        contextConfig.setProPackage("");
        contextConfig.setCoreBasePackage("miaodi.core");
        contextConfig.setBizChName("套餐管理");
        contextConfig.setBizEnName("packageInfo");
        contextConfig.setModuleName("basicdata");
        //写自己项目的绝对路径
        contextConfig.setProjectPath("G:\\learn\\Mybatis\\guns-generator");
        contextConfig.setEntityName("ReverseGateway");
        //这里写已有菜单的名称,当做父节点
        sqlConfig.setParentMenuName("基础数据");

        /**
         * mybatis-plus 生成器开关
         */
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);

        /**
         * guns 生成器开关
         */
        contextConfig.setControllerSwitch(true);
        contextConfig.setIndexPageSwitch(true);
        contextConfig.setAddPageSwitch(true);
        contextConfig.setEditPageSwitch(true);
        contextConfig.setJsSwitch(true);
        contextConfig.setInfoJsSwitch(true);
        contextConfig.setSqlSwitch(true);
    }

    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        packageConfig();
        contextConfig();
    }
}
