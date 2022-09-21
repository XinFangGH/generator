package config;


import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.internal.util.StringUtility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 自定义配置
 *
 * @author tangwenbo
 * @date 2022/9/20 17:35
 */
public class GeneratorPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = properties.getProperty("author");
        String dateFormat = properties.getProperty("dateFormat");
        // 添加import
        topLevelClass.addImportedType("lombok.Data");
        // 获取表注释
        if (StringUtility.stringHasValue(introspectedTable.getRemarks())) {
            topLevelClass.addImportedType("lombok.Data");
            topLevelClass.addJavaDocLine("/**");
            topLevelClass.addJavaDocLine(" * " + introspectedTable.getRemarks());
            topLevelClass.addJavaDocLine(" *");
            topLevelClass.addJavaDocLine(" * @author: " + author);
            topLevelClass.addJavaDocLine(" * @date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
            topLevelClass.addJavaDocLine(" */");
            topLevelClass.addAnnotation("@Data");
        } else {
            topLevelClass.addImportedType("lombok.Data");
            topLevelClass.addJavaDocLine("/**");
            topLevelClass.addJavaDocLine(" * @author: " + author);
            topLevelClass.addJavaDocLine(" * @date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
            topLevelClass.addJavaDocLine(" */");
            topLevelClass.addAnnotation("@Data");
        }
        return true;

    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
            field.addJavaDocLine(" */");
        }
        return true;
    }

    /**
     * mapper.java配置
     *
     * @return boolean
     * @author tangwenbo
     * @date 2022/9/20 17:59
     */
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = properties.getProperty("author");
        String dateFormat = properties.getProperty("dateFormat");
        // 添加Mapper的import
        interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper"));
        interfaze.addJavaDocLine("/**");
        interfaze.addJavaDocLine(" * @author: " + author);
        interfaze.addJavaDocLine(" * @date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
        interfaze.addJavaDocLine(" */");
        // 添加Mapper的注解
        interfaze.addAnnotation("@Mapper");
        return true;
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // 不生成get方法
        return false;
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // 不生成set方法
        return false;
    }

}
