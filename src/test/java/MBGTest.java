/**
  * Copyright (C), 2015-2018 
  * FileName: MBGTest 
  * Author:   r  
  * Date:     2018/10/29 11:01 AM 
  */

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 〈自动生成pojo,mapper与mapping类〉
 * 〈MybatisGenerator测试〉
 * @author  r
 * @date    2018/10/29
 * @version 1.0.0
 */
public class MBGTest {
    @Test
    public void mbgTest(){
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("/Users/r/Documents/MyIDEA/volunteerPlatform/mybatisGeneratorConfig.xml");
            System.out.println(configFile.getName());
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
