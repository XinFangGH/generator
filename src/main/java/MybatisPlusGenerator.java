import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * mybatis plus逆向生成工具
 *
 * @author tangwenbo
 * @date 2022/11/24 16:31
 */
public class MybatisPlusGenerator {


    public static void main(String[] args) {
        String localPath = System.getProperty("user.dir") + "\\finance-app-base\\src\\main";
        List<String> tables = new ArrayList<>();
        //需要新增的表
        tables.add("f_third_citic_trans_batch_group");

        String prefix = "third";

        FastAutoGenerator.create("jdbc:mysql://8.142.117.63:3389/finance_app_dev", "finance_app_dev", "finance_app_dev@jdd123")
                .globalConfig(builder -> {
                    //作者
                    builder.author("tangwenbo")
                            //输出路径(写到java目录)
                            .outputDir(localPath + "\\java")
                            //开启swagger
//                            .enableSwagger()
                            .commentDate("yyyy-MM-dd HH:mm:ss")
                            //不打开生成后的文件夹
                            .disableOpenDir()
                            //开启覆盖之前生成的文件
                            .fileOverride();
                })
                .packageConfig(builder -> {
                    builder.parent("com.jdd.finance")
                            .moduleName("base")
                            .entity("pojo.entity." + prefix)
                            .mapper("mapper." + prefix)
                            .xml("mapper." + prefix)
                            //不生成controller
                            .controller("")
                            .service("service." + prefix)
                            .serviceImpl("service." + prefix + ".impl")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, localPath + "\\resources\\mapper\\" + prefix));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .addTablePrefix("f_")
                            //controller不生成
//                            .controllerBuilder()
//                            .formatFileName("%sController")
//                            .enableRestStyle()
                            .serviceBuilder()
                            .formatServiceFileName("%sBaseService")
                            .formatServiceImplFileName("%sBaseServiceImpl")
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .enableTableFieldAnnotation()
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .enableBaseResultMap()
                            .formatXmlFileName("%sMapper");
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new VelocityTemplateEngine()).templateConfig(a ->
                                //不生成controller
                                a.disable(TemplateType.CONTROLLER)
//                                .disable(TemplateType.SERVICE)
//                                .disable(TemplateType.SERVICEIMPL)
                ).execute();
    }
}
