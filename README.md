# 使用 mybatis-generator 自动生成mybatis文件
### 使用命令行生成的不带注释的mybatis文件
1. 修改 `generatorConfig.xml` 文件的 `<commentGenerator>` 标签如下：
    ```xml
    <!-- 在创建class时，对注释进行控制 -->
    <commentGenerator>
        <property name="suppressDate" value="true"/>
        <property name="suppressAllComments" value="true"/>
    </commentGenerator>
    ```
2. 新建 `Maven` 启动项，名称设为 `generator` ，命令行输入
    ```shell
    mybatis-generator:generate -e
    ```
3. 启动后自动生成不带注释的mybatis文件

### 使用自定义类 MyCommentGenerator 生成实体类注释
1.  修改 `generatorConfig.xml` 文件的 `<commentGenerator>` 标签如下：
    ```xml
    <!-- 在创建class时，对注释进行控制 -->
    <commentGenerator type="com.sinosoft.generator.MyCommentGenerator">
        <property name="suppressDate" value="true"/>
        <property name="suppressAllComments" value="false"/>
    </commentGenerator>
    ```
2. 运行 `StartUp.main()` 方法
3. 运行成功后生成带注释的实体类文件（位于 `model` 包下的`java`文件），可以覆盖命令行生成的不带注释的实体类文件
